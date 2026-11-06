package o;

/* JADX INFO: loaded from: classes.dex */
public final class r44 extends og7 implements hw2 {
    public boolean m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ w44 f1892o;
    public final /* synthetic */ int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r44(w44 w44Var, int i, hc1 hc1Var) {
        super(2, hc1Var);
        this.f1892o = w44Var;
        this.p = i;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        r44 r44Var = new r44(this.f1892o, this.p, hc1Var);
        r44Var.n = obj;
        return r44Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        return ((r44) create((dk6) obj, (hc1) obj2)).invokeSuspend(f88.a);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        boolean z = this.m;
        byte b = 1;
        if (!z) {
            ct1.a0(obj);
            dk6 dk6Var = (dk6) this.n;
            w44 w44Var = this.f1892o;
            df dfVar = new df(dk6Var, w44Var, b);
            in1 in1Var = ((o44) w44Var.f.getValue()).i;
            this.m = true;
            Object objD = mo8.d(dfVar, this.p, 100, in1Var, this);
            ne1 ne1Var = ne1.m;
            if (objD == ne1Var) {
                return ne1Var;
            }
        } else {
            if (!z) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ct1.a0(obj);
        }
        return f88.a;
    }
}
