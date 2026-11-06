package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class nf1 {
    public final int a;
    public final int b;
    public final int[] c;

    public nf1(int i, int i2, int[] iArr) {
        this.a = i;
        this.b = i2;
        this.c = iArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!nf1.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        nf1 nf1Var = (nf1) obj;
        return this.a == nf1Var.a && this.b == nf1Var.b && Arrays.equals(this.c, nf1Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        return e41.l(fx3.j(this.a, this.b, "BitmapData(width=", ", height=", ", bmpData="), Arrays.toString(this.c), ")");
    }
}
