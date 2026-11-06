package o;

/* JADX INFO: loaded from: classes.dex */
public final class w78 extends og7 implements jw2 {
    public boolean m;
    public /* synthetic */ Throwable n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ long f2385o;

    @Override // o.jw2
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj3).longValue();
        w78 w78Var = new w78(4, (hc1) obj4);
        w78Var.n = (Throwable) obj2;
        w78Var.f2385o = jLongValue;
        return w78Var.invokeSuspend(f88.a);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        boolean z = this.m;
        if (!z) {
            ct1.a0(obj);
            Throwable th = this.n;
            long j = this.f2385o;
            we4.f().e(x78.a, "Cannot check for unfinished work", th);
            long jMin = Math.min(j * 30000, x78.b);
            this.m = true;
            Object objA = im3.A(jMin, this);
            ne1 ne1Var = ne1.m;
            if (objA == ne1Var) {
                return ne1Var;
            }
        } else {
            if (!z) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ct1.a0(obj);
        }
        return Boolean.TRUE;
    }
}
