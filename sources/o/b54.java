package o;

/* JADX INFO: loaded from: classes2.dex */
public final class b54 extends gi1 {
    public static final /* synthetic */ fw3[] t;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final qs4 f397o;
    public final ht2 p;
    public final vd4 q;
    public final vd4 r;
    public final d54 s;

    static {
        x86 x86Var = w86.a;
        t = new fw3[]{x86Var.g(new gu5(x86Var.b(b54.class), "fragments", "getFragments()Ljava/util/List;")), x86Var.g(new gu5(x86Var.b(b54.class), "empty", "getEmpty()Z"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b54(qs4 qs4Var, ht2 ht2Var, xd4 xd4Var) {
        super(yl7.p, ht2Var.g());
        xd4Var.getClass();
        this.f397o = qs4Var;
        this.p = ht2Var;
        this.q = new vd4(xd4Var, new a54(this, (byte) 0));
        this.r = new vd4(xd4Var, new a54(this, (byte) 1));
        this.s = new d54(xd4Var, new a54(this, (byte) 2));
    }

    public final boolean equals(Object obj) {
        b54 b54Var = obj instanceof b54 ? (b54) obj : null;
        return b54Var != null && im3.n(this.p, b54Var.p) && im3.n(this.f397o, b54Var.f397o);
    }

    public final int hashCode() {
        return this.p.hashCode() + (this.f397o.hashCode() * 31);
    }

    @Override // o.fi1
    public final fi1 i() {
        ht2 ht2Var = this.p;
        if (ht2Var.d()) {
            return null;
        }
        return this.f397o.y(ht2Var.e());
    }

    @Override // o.fi1
    public final Object o(ji1 ji1Var, Object obj) {
        return ji1Var.m(this, obj);
    }
}
