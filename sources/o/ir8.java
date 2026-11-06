package o;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public abstract class ir8 {
    public static final b77 a;

    static {
        hr8 hr8Var;
        try {
            SystemClock.elapsedRealtimeNanos();
            hr8Var = new hr8((byte) 0);
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            hr8Var = new hr8((byte) 1);
        }
        a = hr8Var;
    }
}
