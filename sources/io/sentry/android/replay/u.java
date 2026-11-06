package io.sentry.android.replay;

import android.graphics.Bitmap;
import io.sentry.android.core.SentryAndroidOptions;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import o.f88;
import o.hw2;
import o.im3;
import o.k76;
import o.kh;
import o.yz3;

/* JADX INFO: loaded from: classes.dex */
public final class u extends yz3 implements hw2 {
    public final /* synthetic */ ReplayIntegration n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Bitmap f169o;
    public final /* synthetic */ k76 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ReplayIntegration replayIntegration, Bitmap bitmap, k76 k76Var) {
        super(2);
        this.n = replayIntegration;
        this.f169o = bitmap;
        this.p = k76Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) throws IOException {
        k kVar = (k) obj;
        long jLongValue = ((Number) obj2).longValue();
        kVar.getClass();
        SentryAndroidOptions sentryAndroidOptions = this.n.p;
        if (sentryAndroidOptions == null) {
            im3.e0("options");
            throw null;
        }
        sentryAndroidOptions.getSessionReplay().getClass();
        Bitmap bitmap = this.f169o;
        String str = (String) this.p.m;
        bitmap.getClass();
        if (kVar.q() != null && !bitmap.isRecycled()) {
            File fileQ = kVar.q();
            if (fileQ != null) {
                fileQ.mkdirs();
            }
            File file = new File(kVar.q(), jLongValue + ".jpg");
            file.createNewFile();
            synchronized (bitmap) {
                if (!bitmap.isRecycled()) {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        bitmap.compress(Bitmap.CompressFormat.JPEG, kVar.m.getSessionReplay().f.screenshotQuality, fileOutputStream);
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        kVar.e(file, jLongValue, str);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            kh.n(fileOutputStream, th);
                            throw th2;
                        }
                    }
                }
            }
        }
        return f88.a;
    }
}
