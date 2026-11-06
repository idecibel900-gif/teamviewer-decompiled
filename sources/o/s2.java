package o;

/* JADX INFO: loaded from: classes.dex */
public final class s2 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ sk6 f1973o;
    public /* synthetic */ long p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s2(sk6 sk6Var, long j, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f1973o = sk6Var;
        this.p = j;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        switch (this.m) {
            case 0:
                s2 s2Var = new s2(this.f1973o, hc1Var);
                s2Var.p = ((t65) obj).a;
                return s2Var;
            case 1:
                return new s2(this.f1973o, this.p, hc1Var, (byte) 1);
            case 2:
                return new s2(this.f1973o, this.p, hc1Var, (byte) 2);
            default:
                return new s2(this.f1973o, this.p, hc1Var, (byte) 3);
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                long j = ((t65) obj).a;
                s2 s2Var = new s2(this.f1973o, (hc1) obj2);
                s2Var.p = j;
                return s2Var.invokeSuspend(f88Var);
            case 1:
                return ((s2) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 2:
                return ((s2) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            default:
                return ((s2) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
        }
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        sk6 sk6Var = this.f1973o;
        ne1 ne1Var = ne1.m;
        switch (b) {
            case 0:
                boolean z = this.n;
                if (z) {
                    if (z) {
                        ct1.a0(obj);
                        return obj;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                long j = this.p;
                this.n = true;
                Object objB = ok6.b(sk6Var.d0, j, this);
                return objB == ne1Var ? ne1Var : objB;
            case 1:
                boolean z2 = this.n;
                if (z2) {
                    if (z2) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                yk6 yk6Var = sk6Var.d0;
                mk4 mk4Var = new mk4(this.p, null);
                this.n = true;
                return yk6Var.g(ay4.n, mk4Var, this) == ne1Var ? ne1Var : f88Var;
            case 2:
                boolean z3 = this.n;
                if (z3) {
                    if (z3) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                yk6 yk6Var2 = sk6Var.d0;
                long j2 = this.p;
                this.n = true;
                return yk6Var2.c(j2, true, this) == ne1Var ? ne1Var : f88Var;
            default:
                boolean z4 = this.n;
                if (z4) {
                    if (z4) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                yk6 yk6Var3 = sk6Var.d0;
                long j3 = this.p;
                this.n = true;
                return yk6Var3.c(j3, false, this) == ne1Var ? ne1Var : f88Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(sk6 sk6Var, hc1 hc1Var) {
        super(2, hc1Var);
        this.m = (byte) 0;
        this.f1973o = sk6Var;
    }
}
