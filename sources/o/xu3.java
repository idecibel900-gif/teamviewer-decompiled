package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class xu3 extends lw3 implements Function1 {
    public final yu3 u;

    public xu3(yu3 yu3Var) {
        this.u = yu3Var;
    }

    @Override // o.hw3
    public final mw3 B() {
        return this.u;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws vd3 {
        ((xu3) this.u.z.getValue()).call(obj);
        return f88.a;
    }

    @Override // o.qv3
    public final fw3 r() {
        return this.u;
    }
}
