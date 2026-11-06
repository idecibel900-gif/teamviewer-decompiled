package o;

/* JADX INFO: loaded from: classes.dex */
public final class hp2 extends og7 implements hw2 {
    public /* synthetic */ int m;

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        hp2 hp2Var = new hp2(2, hc1Var);
        hp2Var.m = ((Number) obj).intValue();
        return hp2Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        return ((hp2) create(Integer.valueOf(((Number) obj).intValue()), (hc1) obj2)).invokeSuspend(f88.a);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        int i = this.m;
        ct1.a0(obj);
        return Boolean.valueOf(i > 0);
    }
}
