package o;

/* JADX INFO: loaded from: classes.dex */
public final class gm1 extends fe1 {
    public static final /* synthetic */ long q = defpackage.a.a.objectFieldOffset(gm1.class.getDeclaredField("p"));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final fe1 f905o;
    public volatile /* synthetic */ int p = 1;

    public gm1(fe1 fe1Var) {
        this.f905o = fe1Var;
    }

    @Override // o.fe1
    public final void K0(de1 de1Var, Runnable runnable) {
        O0().K0(de1Var, runnable);
    }

    @Override // o.fe1
    public final void L0(de1 de1Var, Runnable runnable) {
        O0().L0(de1Var, runnable);
    }

    @Override // o.fe1
    public final boolean M0(de1 de1Var) {
        return O0().M0(de1Var);
    }

    @Override // o.fe1
    public final fe1 N0(int i) {
        return O0().N0(i);
    }

    public final fe1 O0() {
        return defpackage.a.a.getIntVolatile(this, q) == 1 ? g22.b : this.f905o;
    }

    @Override // o.fe1
    public final String toString() {
        return "DeferredDispatchCoroutineDispatcher(delegate=" + this.f905o + ")";
    }
}
