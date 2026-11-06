package o;

/* JADX INFO: loaded from: classes2.dex */
public final class o88 extends fe1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final o88 f1641o = new o88();

    @Override // o.fe1
    public final void K0(de1 de1Var, Runnable runnable) {
        tk1.p.f2118o.j(runnable, true, false);
    }

    @Override // o.fe1
    public final void L0(de1 de1Var, Runnable runnable) {
        tk1.p.f2118o.j(runnable, true, true);
    }

    @Override // o.fe1
    public final fe1 N0(int i) {
        xs1.x(i);
        return i >= ko7.d ? this : super.N0(i);
    }

    @Override // o.fe1
    public final String toString() {
        return "Dispatchers.IO";
    }
}
