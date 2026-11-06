package com.teamviewer.chatviewlib.helper;

import android.content.Intent;
import android.util.Pair;
import io.sentry.config.a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import o.ip3;
import o.kh;
import o.yc4;
import o.ye4;

/* JADX INFO: loaded from: classes.dex */
public final class DownloadFileService extends ip3 {
    public static final HashMap q = new HashMap();

    public static int c(File file, String str) {
        try {
            InputStream inputStreamOpenStream = new URL(str).openStream();
            try {
                FileOutputStream fileOutputStreamG = a.g(new FileOutputStream(file), file);
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i = inputStreamOpenStream.read(bArr);
                        if (i == -1) {
                            fileOutputStreamG.flush();
                            fileOutputStreamG.close();
                            inputStreamOpenStream.close();
                            return 200;
                        }
                        fileOutputStreamG.write(bArr, 0, i);
                        try {
                            throw th;
                        } catch (Throwable th) {
                            kh.n(inputStreamOpenStream, th);
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        kh.n(fileOutputStreamG, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        } catch (IOException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            ye4.a("DownloadFileService", message);
            return 0;
        }
    }

    @Override // o.ip3
    public final void b(Intent intent) throws Throwable {
        intent.getClass();
        String stringExtra = intent.getStringExtra("TRANSFER_ID");
        ye4 ye4Var = ye4.a;
        if (stringExtra == null) {
            ye4Var.g("DownloadFileService", "No id");
            return;
        }
        String stringExtra2 = intent.getStringExtra("URL");
        int i = 0;
        z = false;
        boolean z = false;
        int i2 = 0;
        if (stringExtra2 == null) {
            ye4Var.g("DownloadFileService", "No url");
            d(0, stringExtra);
            return;
        }
        Pair pairCreate = Pair.create(this, Thread.currentThread());
        HashMap map = q;
        map.put(stringExtra, pairCreate);
        try {
            int iC = c(new File(getCacheDir(), stringExtra), stringExtra2);
            if (200 <= iC && iC < 300) {
                z = true;
            }
            try {
                ye4Var.b("DownloadFileService", stringExtra + " finished with success: " + z);
                map.remove(stringExtra);
                d(iC, stringExtra);
            } catch (Exception unused) {
                i2 = iC;
                map.remove(stringExtra);
                d(i2, stringExtra);
            } catch (Throwable th) {
                th = th;
                i = iC;
                map.remove(stringExtra);
                d(i, stringExtra);
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void d(int i, String str) {
        Intent intent = new Intent("com.teamviewer.teamviewer.market.application.DownloadFileService.DOWNLOAD_FINISHED");
        intent.putExtra("TRANSFER_ID", str);
        intent.putExtra("DOWNLOAD_RESULT", i);
        yc4.I(this).T(intent);
    }
}
