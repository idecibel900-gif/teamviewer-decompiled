package o;

/* JADX INFO: loaded from: classes2.dex */
public final class nd2 extends td2 {
    public final String a;
    public final d96 b;

    public nd2(String str, d96 d96Var) {
        this.a = us1.I(str);
        this.b = d96Var;
    }

    @Override // o.td2
    public final int a() {
        return 8;
    }

    @Override // o.td2
    public final boolean b(o82 o82Var, o82 o82Var2) {
        String str = this.a;
        return o82Var2.r(str) && this.b.b(o82Var2.c(str)).mo34d();
    }

    public final String toString() {
        return fx3.h("[", this.a, "~=", this.b.toString(), "]");
    }
}
