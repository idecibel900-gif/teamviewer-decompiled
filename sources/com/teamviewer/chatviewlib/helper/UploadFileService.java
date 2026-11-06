package com.teamviewer.chatviewlib.helper;

import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import io.sentry.config.a;
import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import o.ip3;
import o.kh;
import o.yc4;
import o.ye4;

/* JADX INFO: loaded from: classes.dex */
public final class UploadFileService extends ip3 {
    public static final HashMap r = new HashMap();
    public volatile boolean q;

    @Override // o.ip3
    public final void b(Intent intent) throws Throwable {
        intent.getClass();
        String stringExtra = intent.getStringExtra("TRANSFER_ID");
        ye4 ye4Var = ye4.a;
        if (stringExtra == null) {
            ye4Var.g("UploadFileService", "No id");
            return;
        }
        String stringExtra2 = intent.getStringExtra("URL");
        int i = 0;
        z = false;
        boolean z = false;
        int i2 = 0;
        if (stringExtra2 == null) {
            ye4Var.g("UploadFileService", "No url");
            d(0, stringExtra);
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("METADATA");
        if (bundleExtra == null) {
            ye4Var.g("UploadFileService", "No metadata");
            d(0, stringExtra);
            return;
        }
        Pair pairCreate = Pair.create(this, Thread.currentThread());
        HashMap map = r;
        map.put(stringExtra, pairCreate);
        try {
            int iC = c(stringExtra, new File(getCacheDir(), stringExtra), stringExtra2, bundleExtra);
            if (200 <= iC && iC < 300) {
                z = true;
            }
            try {
                ye4Var.b("UploadFileService", stringExtra + " finished with success: " + z);
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

    public final int c(String str, File file, String str2, Bundle bundle) {
        HttpURLConnection httpURLConnection;
        try {
            URLConnection uRLConnectionOpenConnection = new URL(str2).openConnection();
            uRLConnectionOpenConnection.getClass();
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        } catch (IOException e) {
            ye4.d("UploadFileService", e);
            httpURLConnection = null;
        }
        if (httpURLConnection != null) {
            long length = file.length();
            int iMin = (int) Math.min(length, 8192.0d);
            byte[] bArr = new byte[iMin];
            ye4.a.b("UploadFileService", "Uploading " + length + " bytes in " + iMin + " steps");
            try {
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(a.c(file, new FileInputStream(file)), iMin);
                    try {
                        try {
                            httpURLConnection.setRequestMethod("PUT");
                            httpURLConnection.setRequestProperty("x-ms-blob-type", "BlockBlob");
                            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                            httpURLConnection.setRequestProperty("Content-Length", String.valueOf(length));
                            httpURLConnection.setFixedLengthStreamingMode(length);
                            httpURLConnection.setUseCaches(false);
                            for (String str3 : bundle.keySet()) {
                                String string = bundle.getString(str3);
                                if (string != null) {
                                    httpURLConnection.setRequestProperty("x-ms-meta-" + str3, string);
                                }
                            }
                            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                            long j = 0;
                            int i = 0;
                            while (true) {
                                try {
                                    int i2 = bufferedInputStream.read(bArr);
                                    if (i2 == -1) {
                                        dataOutputStream.close();
                                        int responseCode = httpURLConnection.getResponseCode();
                                        ye4.a("UploadFileService", "HTTP Status " + responseCode + ": '" + httpURLConnection.getResponseMessage() + "'");
                                        bufferedInputStream.close();
                                        httpURLConnection.disconnect();
                                        return responseCode;
                                    }
                                    if (this.q) {
                                        dataOutputStream.close();
                                        bufferedInputStream.close();
                                        httpURLConnection.disconnect();
                                        return 0;
                                    }
                                    j += (long) i2;
                                    int i3 = (int) ((100 * j) / length);
                                    dataOutputStream.write(bArr, 0, i2);
                                    if (i != i3) {
                                        Intent intent = new Intent("com.teamviewer.teamviewer.market.application.UploadFileService.UPLOAD_PROGRESS");
                                        intent.putExtra("TRANSFER_ID", str);
                                        intent.putExtra("UPLOAD_PROGRESS", i3);
                                        yc4.I(this).T(intent);
                                        i = i3;
                                    }
                                } catch (Throwable th) {
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        kh.n(dataOutputStream, th);
                                        throw th2;
                                    }
                                }
                            }
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                kh.n(bufferedInputStream, th3);
                                throw th4;
                            }
                        }
                    } catch (IOException e2) {
                        if (!this.q) {
                            ye4.d("UploadFileService", e2);
                        }
                        bufferedInputStream.close();
                        httpURLConnection.disconnect();
                        return 0;
                    }
                } catch (IOException e3) {
                    if (!this.q) {
                        ye4.d("UploadFileService", e3);
                    }
                }
            } catch (Throwable th5) {
                httpURLConnection.disconnect();
                throw th5;
            }
        }
        return 0;
    }

    public final void d(int i, String str) {
        Intent intent = new Intent("com.teamviewer.teamviewer.market.application.UploadFileService.UPLOAD_FINISHED");
        intent.putExtra("TRANSFER_ID", str);
        intent.putExtra("UPLOAD_RESULT", i);
        yc4.I(this).T(intent);
    }
}
