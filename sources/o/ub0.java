package o;

/* JADX INFO: loaded from: classes.dex */
public final class ub0 implements bs7 {
    public final iw6 a;
    public final float b;

    public ub0(iw6 iw6Var, float f) {
        this.a = iw6Var;
        this.b = f;
    }

    @Override // o.bs7
    public final float a() {
        return this.b;
    }

    @Override // o.bs7
    public final long b() {
        int i = rv0.i;
        return rv0.h;
    }

    @Override // o.bs7
    public final sb0 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ub0)) {
            return false;
        }
        ub0 ub0Var = (ub0) obj;
        return this.a.equals(ub0Var.a) && Float.compare(this.b, ub0Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BrushStyle(value=" + this.a + ", alpha=" + this.b + ")";
    }
}
