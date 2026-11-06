package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lw3 extends hw3 implements qv3, pu3 {
    public static final /* synthetic */ fw3[] t;
    public final u86 r = et1.F(null, new kw3(this, 0));
    public final u14 s = ds1.X(l54.m, new kw3(this, 1));

    static {
        x86 x86Var = w86.a;
        t = new fw3[]{x86Var.g(new gu5(x86Var.b(lw3.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;"))};
    }

    @Override // o.hw3
    public final zt5 A() {
        fw3 fw3Var = t[0];
        Object objA = this.r.a();
        objA.getClass();
        return (ju5) objA;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof lw3) && im3.n(B(), ((lw3) obj).B());
    }

    @Override // o.rt3
    public final String getName() {
        return "<set-" + B().s + '>';
    }

    public final int hashCode() {
        return B().hashCode();
    }

    @Override // o.vt3
    public final mj0 t() {
        return (mj0) this.s.getValue();
    }

    public final String toString() {
        return "setter of " + B();
    }

    @Override // o.vt3
    public final zi0 w() {
        fw3 fw3Var = t[0];
        Object objA = this.r.a();
        objA.getClass();
        return (ju5) objA;
    }
}
