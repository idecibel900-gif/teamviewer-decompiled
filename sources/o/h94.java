package o;

/* JADX INFO: loaded from: classes.dex */
public final class h94 implements qj8 {
    public final qj8 a;
    public final int b;

    public h94(qj8 qj8Var, int i) {
        this.a = qj8Var;
        this.b = i;
    }

    @Override // o.qj8
    public final int a(in1 in1Var, j04 j04Var) {
        if (((j04Var == j04.m ? 4 : 1) & this.b) != 0) {
            return this.a.a(in1Var, j04Var);
        }
        return 0;
    }

    @Override // o.qj8
    public final int b(in1 in1Var) {
        if ((this.b & 32) != 0) {
            return this.a.b(in1Var);
        }
        return 0;
    }

    @Override // o.qj8
    public final int c(in1 in1Var, j04 j04Var) {
        if (((j04Var == j04.m ? 8 : 2) & this.b) != 0) {
            return this.a.c(in1Var, j04Var);
        }
        return 0;
    }

    @Override // o.qj8
    public final int d(in1 in1Var) {
        if ((this.b & 16) != 0) {
            return this.a.d(in1Var);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h94)) {
            return false;
        }
        h94 h94Var = (h94) obj;
        return im3.n(this.a, h94Var.a) && this.b == h94Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.b;
        int i2 = g77.a;
        if ((i & i2) == i2) {
            g77.t(sb, "Start");
        }
        int i3 = g77.c;
        if ((i & i3) == i3) {
            g77.t(sb, "Left");
        }
        if ((i & 16) == 16) {
            g77.t(sb, "Top");
        }
        int i4 = g77.b;
        if ((i & i4) == i4) {
            g77.t(sb, "End");
        }
        int i5 = g77.d;
        if ((i & i5) == i5) {
            g77.t(sb, "Right");
        }
        if ((i & 32) == 32) {
            g77.t(sb, "Bottom");
        }
        return "(" + this.a + " only " + fx3.g("WindowInsetsSides(", sb.toString(), ")") + ")";
    }
}
