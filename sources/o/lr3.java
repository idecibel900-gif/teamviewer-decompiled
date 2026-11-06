package o;

/* JADX INFO: loaded from: classes2.dex */
public final class lr3 extends rc6 implements iw2 {
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ ij1 f1397o;
    public final /* synthetic */ nd p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lr3(nd ndVar, hc1 hc1Var) {
        super(3, hc1Var);
        this.p = ndVar;
    }

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        lr3 lr3Var = new lr3(this.p, (hc1) obj3);
        lr3Var.f1397o = (ij1) obj;
        return lr3Var.invokeSuspend(f88.a);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        nd ndVar = this.p;
        r8 r8Var = (r8) ndVar.f1562o;
        ij1 ij1Var = this.f1397o;
        boolean z = this.n;
        if (!z) {
            ct1.a0(obj);
            byte bC = r8Var.C();
            if (bC == 1) {
                return ndVar.o(true);
            }
            if (bC == 0) {
                return ndVar.o(false);
            }
            if (bC != 6) {
                if (bC == 8) {
                    return ndVar.m();
                }
                r8.r(r8Var, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.f1397o = null;
            this.n = true;
            obj = ndVar.n(ij1Var, this);
            ne1 ne1Var = ne1.m;
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
        return (lq3) obj;
    }
}
