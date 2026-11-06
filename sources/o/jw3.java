package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jw3 extends hw3 implements rv3 {
    public static final /* synthetic */ fw3[] t;
    public final u86 r = et1.F(null, new iw3(this, 0));
    public final u14 s = ds1.X(l54.m, new iw3(this, 1));

    static {
        x86 x86Var = w86.a;
        t = new fw3[]{x86Var.g(new gu5(x86Var.b(jw3.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;"))};
    }

    @Override // o.hw3
    public final zt5 A() {
        fw3 fw3Var = t[0];
        Object objA = this.r.a();
        objA.getClass();
        return (eu5) objA;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof jw3) && im3.n(B(), ((jw3) obj).B());
    }

    @Override // o.rt3
    public final String getName() {
        return "<get-" + B().s + '>';
    }

    public final int hashCode() {
        return B().hashCode();
    }

    @Override // o.vt3
    public final mj0 t() {
        return (mj0) this.s.getValue();
    }

    public final String toString() {
        return "getter of " + B();
    }

    @Override // o.vt3
    public final zi0 w() {
        fw3 fw3Var = t[0];
        Object objA = this.r.a();
        objA.getClass();
        return (eu5) objA;
    }
}
