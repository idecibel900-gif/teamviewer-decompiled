package o;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class ci7 {
    public static final SparseArray c = new SparseArray(32);
    public static final ci7 d = new ci7(0, 0);
    public final byte a;
    public final int b;

    /* JADX WARN: Multi-variable type inference failed */
    public ci7(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean a() {
        return this.a == 4;
    }
}
