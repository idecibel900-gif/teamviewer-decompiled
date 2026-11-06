package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class gi6 implements di6 {
    public final /* synthetic */ hw2 m;
    public final /* synthetic */ Function1 n;

    public gi6(hw2 hw2Var, Function1 function1) {
        this.m = hw2Var;
        this.n = function1;
    }

    @Override // o.di6
    public final Object G(jh6 jh6Var, Object obj) {
        return this.m.invoke(jh6Var, obj);
    }

    @Override // o.di6
    public final Object b(Object obj) {
        return this.n.invoke(obj);
    }
}
