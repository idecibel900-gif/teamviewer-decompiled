package o;

/* JADX INFO: loaded from: classes.dex */
public final class sh3 extends og7 implements hw2 {
    public /* synthetic */ float m;

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        sh3 sh3Var = new sh3(2, hc1Var);
        sh3Var.m = ((Number) obj).floatValue();
        return sh3Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        return ((sh3) create(Float.valueOf(((Number) obj).floatValue()), (hc1) obj2)).invokeSuspend(f88.a);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        ct1.a0(obj);
        return Boolean.valueOf(this.m > 0.0f);
    }
}
