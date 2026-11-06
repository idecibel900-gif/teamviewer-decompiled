package o;

/* JADX INFO: loaded from: classes2.dex */
public final class qe3 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f1824o;
    public final /* synthetic */ f62 p;
    public final /* synthetic */ jj1 q;
    public final /* synthetic */ in1 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qe3(f62 f62Var, jj1 jj1Var, in1 in1Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.p = f62Var;
        this.q = jj1Var;
        this.r = in1Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        switch (this.m) {
            case 0:
                qe3 qe3Var = new qe3(this.p, this.q, this.r, hc1Var, (byte) 0);
                qe3Var.f1824o = obj;
                return qe3Var;
            default:
                qe3 qe3Var2 = new qe3(this.p, this.q, this.r, hc1Var, (byte) 1);
                qe3Var2.f1824o = obj;
                return qe3Var2;
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        byte b = this.m;
        f88 f88Var = f88.a;
        tb6 tb6Var = (tb6) obj;
        hc1 hc1Var = (hc1) obj2;
        switch (b) {
            case 0:
                ((qe3) create(tb6Var, hc1Var)).invokeSuspend(f88Var);
                return ne1.m;
            default:
                return ((qe3) create(tb6Var, hc1Var)).invokeSuspend(f88Var);
        }
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) throws Throwable {
        byte b = this.m;
        jj1 jj1Var = this.q;
        f62 f62Var = this.p;
        ne1 ne1Var = ne1.m;
        switch (b) {
            case 0:
                tb6 tb6Var = (tb6) this.f1824o;
                boolean z = this.n;
                if (!z) {
                    ct1.a0(obj);
                    String str = wb6.b(f62Var, tb6Var).b;
                    ji2 ji2Var = new ji2((byte) 23);
                    this.f1824o = null;
                    this.n = true;
                    obj = re3.d.C(str, new pe3(ji2Var, jj1Var, str, null), this);
                    if (obj == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                throw ua5.i(obj);
            default:
                tb6 tb6Var2 = (tb6) this.f1824o;
                boolean z2 = this.n;
                if (!z2) {
                    ct1.a0(obj);
                    String str2 = wb6.b(f62Var, tb6Var2).b;
                    a81 a81Var = new a81(this.r, (byte) 26);
                    this.f1824o = null;
                    this.n = true;
                    obj = re3.d.C(str2, new pe3(a81Var, jj1Var, str2, null), this);
                    if (obj == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z2) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                obj.getClass();
                return ((ae3) obj).a;
        }
    }
}
