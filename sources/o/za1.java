package o;

/* JADX INFO: loaded from: classes.dex */
public final class za1 {
    public final jb0 a;
    public final gl0 b;

    public za1(jb0 jb0Var, gl0 gl0Var) {
        this.a = jb0Var;
        this.b = gl0Var;
    }

    public final String toString() {
        gl0 gl0Var = this.b;
        String str = ((ie1) gl0Var.q.l0(ie1.n)) != null ? "Room Invalidation Tracker Refresh" : null;
        int iHashCode = hashCode();
        qf0.s(16);
        String string = Integer.toString(iHashCode, 16);
        string.getClass();
        return "Request@" + string + (str != null ? fx3.g("[", str, "](") : "(") + "currentBounds()=" + this.a.a() + ", continuation=" + gl0Var + ")";
    }
}
