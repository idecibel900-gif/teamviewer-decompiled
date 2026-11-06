package o;

/* JADX INFO: loaded from: classes.dex */
public final class vx2 implements p01 {
    public final m01 m;

    public vx2(m01 m01Var) {
        this.m = m01Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vx2) {
            return this.m.equals(((vx2) obj).m);
        }
        return false;
    }

    public final int hashCode() {
        return this.m.hashCode() * 31;
    }
}
