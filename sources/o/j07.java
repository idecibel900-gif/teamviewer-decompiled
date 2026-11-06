package o;

/* JADX INFO: loaded from: classes2.dex */
public final class j07 extends ym1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final g48 f1118o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j07(g07 g07Var, g48 g48Var) {
        super(g07Var);
        g48Var.getClass();
        this.f1118o = g48Var;
    }

    @Override // o.xm1, o.oz3
    public final g48 n0() {
        return this.f1118o;
    }

    @Override // o.xm1
    public final xm1 z0(g07 g07Var) {
        return new j07(g07Var, this.f1118o);
    }
}
