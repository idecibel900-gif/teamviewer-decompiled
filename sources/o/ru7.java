package o;

/* JADX INFO: loaded from: classes.dex */
public final class ru7 {
    public final yu7 a;
    public final yu7 b;

    public ru7(yu7 yu7Var, yu7 yu7Var2) {
        this.a = yu7Var;
        this.b = yu7Var2;
        yu7 yu7Var3 = yu7.m;
        if (yu7Var == yu7Var3 || yu7Var3 == yu7Var2 || yu7Var == yu7Var2) {
            throw new IllegalArgumentException(("invalid ThreePaneScaffoldHorizontalOrder(" + yu7Var + ", " + yu7Var3 + ", " + yu7Var2 + ") - panes must be unique").toString());
        }
    }

    public final void a(hw2 hw2Var) {
        hw2Var.invoke(0, this.a);
        hw2Var.invoke(1, yu7.m);
        hw2Var.invoke(2, this.b);
    }

    public final int b(yu7 yu7Var) {
        if (yu7Var == this.a) {
            return 0;
        }
        if (yu7Var == yu7.m) {
            return 1;
        }
        return yu7Var == this.b ? 2 : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru7)) {
            return false;
        }
        ru7 ru7Var = (ru7) obj;
        return this.a == ru7Var.a && this.b == ru7Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((yu7.m.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
