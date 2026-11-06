package o;

/* JADX INFO: loaded from: classes2.dex */
public final class dw3 extends jw3 implements hw2 {
    public final ew3 u;

    public dw3(ew3 ew3Var) {
        this.u = ew3Var;
    }

    @Override // o.hw3
    public final mw3 B() {
        return this.u;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        return ((dw3) this.u.y.getValue()).call(obj, obj2);
    }

    @Override // o.qv3
    public final fw3 r() {
        return this.u;
    }
}
