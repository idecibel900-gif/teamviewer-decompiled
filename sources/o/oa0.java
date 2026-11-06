package o;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class oa0 {
    public static final /* synthetic */ oa0 a = new oa0();
    public static final String b = pa0.class.getSimpleName();

    public static pa0 a() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            return qa0.m;
        }
        if (i >= 29) {
            return z06.p;
        }
        return i >= 28 ? xz2.E : d82.p;
    }
}
