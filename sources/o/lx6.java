package o;

/* JADX INFO: loaded from: classes.dex */
public final class lx6 implements nb1 {
    public final String a;
    public final int b;
    public final lm c;
    public final boolean d;

    public lx6(String str, int i, lm lmVar, boolean z) {
        this.a = str;
        this.b = i;
        this.c = lmVar;
        this.d = z;
    }

    @Override // o.nb1
    public final sa1 a(ei4 ei4Var, qh4 qh4Var, p30 p30Var) {
        return new sw6(ei4Var, p30Var, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapePath{name=");
        sb.append(this.a);
        sb.append(", index=");
        return e41.j(sb, this.b, '}');
    }
}
