package o;

/* JADX INFO: loaded from: classes2.dex */
public final class cv3 extends lw3 implements iw2 {
    public final dv3 u;

    public cv3(dv3 dv3Var) {
        this.u = dv3Var;
    }

    @Override // o.hw3
    public final mw3 B() {
        return this.u;
    }

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) throws vd3 {
        ((cv3) this.u.z.getValue()).call(obj, obj2, obj3);
        return f88.a;
    }

    @Override // o.qv3
    public final fw3 r() {
        return this.u;
    }
}
