package o;

/* JADX INFO: loaded from: classes.dex */
public final class d81 extends og7 implements hw2 {
    public final /* synthetic */ byte m = 1;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ n81 f594o;
    public final /* synthetic */ h71 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d81(boolean z, n81 n81Var, h71 h71Var, hc1 hc1Var) {
        super(2, hc1Var);
        this.n = z;
        this.f594o = n81Var;
        this.p = h71Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        h71 h71Var = this.p;
        n81 n81Var = this.f594o;
        switch (b) {
            case 0:
                return new d81(this.n, n81Var, h71Var, hc1Var);
            default:
                return new d81(n81Var, h71Var, hc1Var);
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        me1 me1Var = (me1) obj;
        hc1 hc1Var = (hc1) obj2;
        switch (b) {
            case 0:
                ((d81) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                return f88Var;
            default:
                return ((d81) create(me1Var, hc1Var)).invokeSuspend(f88Var);
        }
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        Object value;
        i81 i81Var;
        String str;
        String str2;
        byte b = this.m;
        h71 h71Var = this.p;
        n81 n81Var = this.f594o;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                ct1.a0(obj);
                if (this.n) {
                    h71Var.getClass();
                    h71 h71Var2 = ((i81) n81Var.s.m.getValue()).a;
                    h71 h71Var3 = (h71Var2 == null || h71Var2.m != h71Var.m) ? h71Var : h71Var2;
                    int i = h71Var3.m;
                    Integer num = n81Var.C;
                    if (num == null || num.intValue() != i) {
                        n81Var.C = Integer.valueOf(i);
                        l97 l97Var = n81Var.r;
                        do {
                            value = l97Var.getValue();
                            i81Var = (i81) value;
                            str = h71Var3.f954o;
                            str2 = h71Var3.q;
                            if (str2 == null) {
                                str2 = "";
                            }
                        } while (!l97Var.j(value, i81.a(i81Var, h71Var3, false, str, str2, true, true, null, false, false, false, false, 1986)));
                    }
                } else {
                    n81Var.c1();
                }
                return f88Var;
            default:
                boolean z = this.n;
                if (z) {
                    if (z) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                int i2 = h71Var.m;
                this.n = true;
                Object objB = ((fm) n81Var.p.n).b(new nw0(i2, n81Var, (byte) 1), this);
                ne1 ne1Var = ne1.m;
                if (objB != ne1Var) {
                    objB = f88Var;
                }
                return objB == ne1Var ? ne1Var : f88Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d81(n81 n81Var, h71 h71Var, hc1 hc1Var) {
        super(2, hc1Var);
        this.f594o = n81Var;
        this.p = h71Var;
    }
}
