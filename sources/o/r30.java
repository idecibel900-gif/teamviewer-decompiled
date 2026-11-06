package o;

/* JADX INFO: loaded from: classes.dex */
public final class r30 implements gb6 {
    public final bp3 m;

    public /* synthetic */ r30(bp3 bp3Var) {
        this.m = bp3Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r30) {
            return this.m.equals(((r30) obj).m);
        }
        return false;
    }

    public final int hashCode() {
        return this.m.hashCode();
    }

    public final String toString() {
        return "BaseRequestDelegate(job=" + this.m + ")";
    }
}
