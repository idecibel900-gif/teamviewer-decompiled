package o;

/* JADX INFO: loaded from: classes.dex */
public final class zy6 implements qj8 {
    public final xy6 a;

    public zy6(xy6 xy6Var) {
        this.a = xy6Var;
    }

    @Override // o.qj8
    public final int a(in1 in1Var, j04 j04Var) {
        return 0;
    }

    @Override // o.qj8
    public final int b(in1 in1Var) {
        return 0;
    }

    @Override // o.qj8
    public final int c(in1 in1Var, j04 j04Var) {
        return 0;
    }

    @Override // o.qj8
    public final int d(in1 in1Var) {
        int i;
        float fZ = ((wf5) this.a.g.i).z();
        if (!Float.isNaN(fZ) && (i = (int) fZ) >= 0) {
            return i;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy6)) {
            return false;
        }
        return im3.n(this.a, ((zy6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
