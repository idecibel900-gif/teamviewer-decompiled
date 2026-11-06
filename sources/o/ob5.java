package o;

/* JADX INFO: loaded from: classes.dex */
public final class ob5 extends vs1 {
    public final v56 e;

    public ob5(v56 v56Var) {
        this.e = v56Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ob5) {
            return this.e.equals(((ob5) obj).e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    @Override // o.vs1
    public final v56 v() {
        return this.e;
    }
}
