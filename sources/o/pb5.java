package o;

/* JADX INFO: loaded from: classes.dex */
public final class pb5 extends vs1 {
    public final lf6 e;
    public final rj f;

    public pb5(lf6 lf6Var) {
        rj rjVarA;
        this.e = lf6Var;
        if (xo1.T(lf6Var)) {
            rjVarA = null;
        } else {
            rjVarA = tj.a();
            rj.c(rjVarA, lf6Var);
        }
        this.f = rjVarA;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pb5) {
            return this.e.equals(((pb5) obj).e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    @Override // o.vs1
    public final v56 v() {
        lf6 lf6Var = this.e;
        return new v56(lf6Var.a, lf6Var.b, lf6Var.c, lf6Var.d);
    }
}
