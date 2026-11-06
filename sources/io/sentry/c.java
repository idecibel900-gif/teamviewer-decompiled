package io.sentry;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Looper;
import android.view.Choreographer;
import java.security.SecureRandom;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;
import o.hk0;
import o.kl;
import o.ro8;
import o.xk0;
import o.yo1;

/* JADX INFO: loaded from: classes.dex */
public final class c extends ThreadLocal {
    public final /* synthetic */ byte a;

    public /* synthetic */ c(byte b) {
        this.a = b;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.a) {
            case 0:
                return new DecimalFormat("#.################", DecimalFormatSymbols.getInstance(Locale.ROOT));
            case 1:
                return new io.sentry.util.m();
            case 2:
                Choreographer choreographer = Choreographer.getInstance();
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper != null) {
                    kl klVar = new kl(choreographer, yo1.x(looperMyLooper));
                    return xk0.G(klVar, klVar.x);
                }
                hk0.l("no Looper on this thread");
                return null;
            case 3:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(ro8.a);
                return simpleDateFormat;
            case 4:
                return new Random();
            case 5:
                SecureRandom secureRandom = new SecureRandom();
                secureRandom.nextLong();
                return secureRandom;
            case 6:
                return new PathMeasure();
            case 7:
                return new Path();
            case 8:
                return new Path();
            default:
                return new float[4];
        }
    }
}
