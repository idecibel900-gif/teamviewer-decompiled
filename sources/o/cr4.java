package o;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class cr4 {
    public final SparseArray a;
    public z58 b;

    public cr4(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(z58 z58Var, int i, int i2) {
        int iA = z58Var.a(i);
        SparseArray sparseArray = this.a;
        cr4 cr4Var = (cr4) sparseArray.get(iA);
        if (cr4Var == null) {
            cr4Var = new cr4(1);
            sparseArray.put(z58Var.a(i), cr4Var);
        }
        if (i2 > i) {
            cr4Var.a(z58Var, i + 1, i2);
        } else {
            cr4Var.b = z58Var;
        }
    }
}
