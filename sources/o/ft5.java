package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ft5 implements px4, me1 {
    public final /* synthetic */ px4 m;
    public final de1 n;

    public ft5(px4 px4Var, de1 de1Var) {
        this.m = px4Var;
        this.n = de1Var;
    }

    @Override // o.px4
    public final Function1 c() {
        return this.m.c();
    }

    @Override // o.me1
    public final de1 getCoroutineContext() {
        return this.n;
    }

    @Override // o.i97
    public final Object getValue() {
        return this.m.getValue();
    }

    @Override // o.px4
    public final Object j() {
        return this.m.j();
    }

    @Override // o.px4
    public final void setValue(Object obj) {
        this.m.setValue(obj);
    }
}
