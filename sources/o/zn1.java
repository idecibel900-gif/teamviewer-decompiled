package o;

/* JADX INFO: loaded from: classes.dex */
public final class zn1 implements rl2 {
    public final rl2 a;

    public zn1(rl2 rl2Var) {
        this.a = rl2Var;
    }

    @Override // o.jo
    public final hc8 a(yn1 yn1Var) {
        return this.a.a(new yn1(yn1Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zn1)) {
            return false;
        }
        return this.a.equals(((zn1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
