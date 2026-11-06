package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class bp8 {
    public final gr a;
    public final bi2 b;

    public /* synthetic */ bp8(gr grVar, bi2 bi2Var) {
        this.a = grVar;
        this.b = bi2Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bp8)) {
            return false;
        }
        bp8 bp8Var = (bp8) obj;
        return xs1.G(this.a, bp8Var.a) && xs1.G(this.b, bp8Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        a65 a65Var = new a65(this, (byte) 1);
        a65Var.P(this.a, "key");
        a65Var.P(this.b, "feature");
        return a65Var.toString();
    }
}
