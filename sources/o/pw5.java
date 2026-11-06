package o;

/* JADX INFO: loaded from: classes2.dex */
public final class pw5 extends sx3 {
    public final tu5 e;
    public final pw5 f;
    public final js0 g;
    public final su5 h;
    public final boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw5(tu5 tu5Var, ty4 ty4Var, d22 d22Var, s67 s67Var, pw5 pw5Var) {
        super(ty4Var, d22Var, s67Var);
        tu5Var.getClass();
        ty4Var.getClass();
        this.e = tu5Var;
        this.f = pw5Var;
        this.g = et1.y(ty4Var, tu5Var.q);
        su5 su5Var = (su5) im2.f.i(tu5Var.p);
        this.h = su5Var == null ? su5.CLASS : su5Var;
        this.i = im2.g.i(tu5Var.p).booleanValue();
        im2.h.getClass();
    }

    @Override // o.sx3
    public final ht2 a() {
        return this.g.a();
    }
}
