package o;

/* JADX INFO: loaded from: classes.dex */
public final class cv7 {
    public final ce5 a;
    public final ce5 b;
    public final ce5 c;
    public final yu7 d;
    public final kh7 e = new kh7(new ya4(this, 1));
    public final kh7 f = new kh7(new ya4(this, 2));

    public cv7(ce5 ce5Var, ce5 ce5Var2, ce5 ce5Var3, yu7 yu7Var) {
        this.a = ce5Var;
        this.b = ce5Var2;
        this.c = ce5Var3;
        this.d = yu7Var;
    }

    public final ce5 a(yu7 yu7Var) {
        int iOrdinal = yu7Var.ordinal();
        if (iOrdinal == 0) {
            return this.a;
        }
        if (iOrdinal == 1) {
            return this.b;
        }
        if (iOrdinal == 2) {
            return this.c;
        }
        gk0.s();
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cv7)) {
            return false;
        }
        cv7 cv7Var = (cv7) obj;
        return this.a.equals(cv7Var.a) && this.b.equals(cv7Var.b) && this.c.equals(cv7Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ThreePaneScaffoldValue(primary=" + this.a + ", secondary=" + this.b + ", tertiary=" + this.c + ")";
    }
}
