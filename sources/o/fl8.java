package o;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class fl8 implements el8 {
    public final jn1 b;

    public fl8() {
        this.b = Build.VERSION.SDK_INT >= 34 ? kn1.m : xz2.I;
        qf0.p(1, 2, 4, 8, 16, 32, 64, 128);
    }
}
