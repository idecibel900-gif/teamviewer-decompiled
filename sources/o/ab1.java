package o;

/* JADX INFO: loaded from: classes.dex */
public final class ab1 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f312o;
    public /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab1(jm5 jm5Var, String str, long j, gt7 gt7Var, pr7 pr7Var, v65 v65Var, hc1 hc1Var) {
        super(2, hc1Var);
        this.m = (byte) 3;
        this.p = jm5Var;
        this.q = str;
        this.f312o = j;
        this.r = gt7Var;
        this.s = pr7Var;
        this.t = v65Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        Object obj2 = this.t;
        Object obj3 = this.s;
        Object obj4 = this.r;
        Object obj5 = this.q;
        switch (b) {
            case 0:
                ab1 ab1Var = new ab1((o98) obj5, (cb1) obj4, (nb0) obj3, this.f312o, (bp3) obj2, hc1Var);
                ab1Var.p = obj;
                return ab1Var;
            case 1:
                return new ab1((j23) this.p, (iw7) obj5, (g76) obj4, this.f312o, (r13) obj3, (iw7) obj2, hc1Var, (byte) 1);
            case 2:
                return new ab1((j23) this.p, (iw7) obj5, (g76) obj4, this.f312o, (y13) obj3, (iw7) obj2, hc1Var, (byte) 2);
            default:
                return new ab1((jm5) this.p, (String) obj5, this.f312o, (gt7) obj4, (pr7) obj3, (v65) obj2, hc1Var);
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                return ((ab1) create((wk6) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 1:
                return ((ab1) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 2:
                return ((ab1) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            default:
                return ((ab1) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0055  */
    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        Object objJ0;
        byte b = this.m;
        int i = 2;
        long j = this.f312o;
        Object obj2 = this.r;
        ne1 ne1Var = ne1.m;
        Object obj3 = this.s;
        Object obj4 = this.q;
        Object obj5 = this.t;
        f88 f88Var = f88.a;
        byte b2 = 1;
        hc1 hc1Var = null;
        switch (b) {
            case 0:
                nb0 nb0Var = (nb0) obj3;
                cb1 cb1Var = (cb1) obj2;
                o98 o98Var = (o98) obj4;
                boolean z = this.n;
                if (!z) {
                    ct1.a0(obj);
                    wk6 wk6Var = (wk6) this.p;
                    o98Var.e = cb1Var.U0(nb0Var, j);
                    m5 m5Var = new m5(cb1Var, o98Var, (bp3) obj5, wk6Var);
                    n5 n5Var = new n5((Object) cb1Var, (Object) o98Var, (Object) nb0Var, (byte) 11);
                    this.n = true;
                    if (o98Var.a(m5Var, n5Var, this) == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                return f88Var;
            case 1:
                iw7 iw7Var = (iw7) obj4;
                j23 j23Var = (j23) this.p;
                boolean z2 = this.n;
                if (!z2) {
                    ct1.a0(obj);
                    j23Var.getClass();
                    j23.j(iw7Var);
                    t36 t36Var = iw7Var.i;
                    h23 h23Var = new h23(i, hc1Var, (byte) 0);
                    this.n = true;
                    if (xo1.L(t36Var, h23Var, this) == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z2) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                if (!((g76) obj2).m && j == j23Var.B && im3.n(j23Var.t, (r13) obj3) && j23Var.v == ((iw7) obj5)) {
                    n87 n87Var = j23Var.y;
                    if (n87Var != null) {
                        n87Var.j(null);
                    }
                    j23Var.v = iw7Var;
                    j23Var.a(iw7Var);
                }
                return f88Var;
            case 2:
                y13 y13Var = (y13) obj3;
                iw7 iw7Var2 = (iw7) obj4;
                j23 j23Var2 = (j23) this.p;
                boolean z3 = this.n;
                if (!z3) {
                    ct1.a0(obj);
                    j23Var2.getClass();
                    j23.j(iw7Var2);
                    t36 t36Var2 = iw7Var2.i;
                    h23 h23Var2 = new h23(i, hc1Var, b2);
                    this.n = true;
                    if (xo1.L(t36Var2, h23Var2, this) == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z3) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                if (!((g76) obj2).m && j == j23Var2.C && im3.n(j23Var2.t, y13Var.a) && j23Var2.x == ((iw7) obj5)) {
                    n87 n87Var2 = j23Var2.A;
                    if (n87Var2 != null) {
                        n87Var2.j(null);
                    }
                    j23Var2.u = y13Var;
                    j23Var2.x = iw7Var2;
                    j23Var2.c(iw7Var2);
                }
                return f88Var;
            default:
                v65 v65Var = (v65) obj5;
                String str = (String) obj4;
                pr7 pr7Var = (pr7) obj3;
                boolean z4 = this.n;
                if (!z4) {
                    ct1.a0(obj);
                    jm5 jm5Var = (jm5) this.p;
                    this.n = true;
                    om5 om5Var = (om5) jm5Var;
                    om5Var.getClass();
                    if (str.length() == 0) {
                        objJ0 = null;
                    } else {
                        long j2 = this.f312o;
                        if (gt7.c(j2)) {
                            objJ0 = null;
                        } else {
                            objJ0 = im3.j0(om5Var.a, new tb(om5Var, new nm5(j2, str, null, om5Var), hc1Var, (byte) 5), this);
                        }
                    }
                    if (objJ0 == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z4) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                    objJ0 = obj;
                    str = str;
                }
                gt7 gt7Var = (gt7) objJ0;
                if (gt7Var != null) {
                    long j3 = gt7Var.a;
                    long jA = h57.a(v65Var.k((int) (j3 >> 32)), v65Var.k((int) (j3 & 4294967295L)));
                    if (!gt7.a(jA, (gt7) obj2) && im3.n(pr7Var.l().a.n, str) && v65Var == pr7Var.b) {
                        pr7Var.c.invoke(pr7.b(pr7Var.l().a, jA));
                        pr7Var.w = new gt7(jA);
                    }
                }
                return f88Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ab1(j23 j23Var, iw7 iw7Var, g76 g76Var, long j, Object obj, iw7 iw7Var2, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.p = j23Var;
        this.q = iw7Var;
        this.r = g76Var;
        this.f312o = j;
        this.s = obj;
        this.t = iw7Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab1(o98 o98Var, cb1 cb1Var, nb0 nb0Var, long j, bp3 bp3Var, hc1 hc1Var) {
        super(2, hc1Var);
        this.m = (byte) 0;
        this.q = o98Var;
        this.r = cb1Var;
        this.s = nb0Var;
        this.f312o = j;
        this.t = bp3Var;
    }
}
