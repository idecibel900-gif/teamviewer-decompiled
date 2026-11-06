package o;

/* JADX INFO: loaded from: classes2.dex */
public final class zv3 extends jw3 implements wv3 {
    public final aw3 u;

    public zv3(aw3 aw3Var) {
        this.u = aw3Var;
    }

    @Override // o.hw3
    public final mw3 B() {
        return this.u;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return this.u.get(obj);
    }

    @Override // o.qv3
    public final fw3 r() {
        return this.u;
    }
}
