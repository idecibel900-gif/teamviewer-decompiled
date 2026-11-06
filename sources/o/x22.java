package o;

/* JADX INFO: loaded from: classes2.dex */
public final class x22 implements ho2 {
    public final /* synthetic */ byte m = 1;
    public final /* synthetic */ ho2 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k76 f2471o;

    public x22(y22 y22Var, k76 k76Var, ho2 ho2Var) {
        this.f2471o = k76Var;
        this.n = ho2Var;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    @Override // o.ho2
    public final Object c(Object obj, hc1 hc1Var) {
        w22 w22Var;
        wo2 wo2Var;
        byte b = this.m;
        k76 k76Var = this.f2471o;
        Object obj2 = f88.a;
        ho2 ho2Var = this.n;
        ne1 ne1Var = ne1.m;
        switch (b) {
            case 0:
                if (hc1Var instanceof w22) {
                    w22Var = (w22) hc1Var;
                    int i = w22Var.f2368o;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        w22Var.f2368o = i - Integer.MIN_VALUE;
                    } else {
                        w22Var = new w22(this, hc1Var);
                    }
                } else {
                    w22Var = new w22(this, hc1Var);
                }
                Object obj3 = w22Var.m;
                int i2 = w22Var.f2368o;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ct1.a0(obj3);
                        return obj2;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj3);
                Object obj4 = k76Var.m;
                if (obj4 != g68.s && im3.n(obj4, obj)) {
                    return obj2;
                }
                k76Var.m = obj;
                w22Var.f2368o = 1;
                return ho2Var.c(obj, w22Var) == ne1Var ? ne1Var : obj2;
            default:
                if (hc1Var instanceof wo2) {
                    wo2Var = (wo2) hc1Var;
                    int i3 = wo2Var.f2433o;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        wo2Var.f2433o = i3 - Integer.MIN_VALUE;
                    } else {
                        wo2Var = new wo2(this, hc1Var);
                    }
                } else {
                    wo2Var = new wo2(this, hc1Var);
                }
                Object obj5 = wo2Var.m;
                int i4 = wo2Var.f2433o;
                try {
                    if (i4 == 0) {
                        ct1.a0(obj5);
                        wo2Var.f2433o = 1;
                        if (ho2Var.c(obj, wo2Var) == ne1Var) {
                            obj2 = ne1Var;
                        }
                    } else {
                        if (i4 != 1) {
                            hk0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ct1.a0(obj5);
                    }
                    return obj2;
                } catch (Throwable th) {
                    k76Var.m = th;
                    throw th;
                }
        }
    }

    public x22(ho2 ho2Var, k76 k76Var) {
        this.n = ho2Var;
        this.f2471o = k76Var;
    }
}
