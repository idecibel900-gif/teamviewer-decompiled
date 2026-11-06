package o;

/* JADX INFO: loaded from: classes.dex */
public final class z23 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ f33 f2664o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z23(f33 f33Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f2664o = f33Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        f33 f33Var = this.f2664o;
        switch (b) {
            case 0:
                return new z23(f33Var, hc1Var, (byte) 0);
            case 1:
                return new z23(f33Var, hc1Var, (byte) 1);
            case 2:
                return new z23(f33Var, hc1Var, (byte) 2);
            case 3:
                return new z23(f33Var, hc1Var, (byte) 3);
            case 4:
                return new z23(f33Var, hc1Var, (byte) 4);
            case 5:
                return new z23(f33Var, hc1Var, (byte) 5);
            default:
                return new z23(f33Var, hc1Var, (byte) 6);
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
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
        return ((z23) create(me1Var, hc1Var)).invokeSuspend(f88Var);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        byte b2 = 0;
        byte b3 = 3;
        byte b4 = 2;
        f88 f88Var = f88.a;
        ne1 ne1Var = ne1.m;
        f33 f33Var = this.f2664o;
        hc1 hc1Var = null;
        byte b5 = 1;
        switch (b) {
            case 0:
                boolean z = this.n;
                if (!z) {
                    ct1.a0(obj);
                    d11 d11Var = f33Var.u;
                    this.n = true;
                    return d11Var.p(this) == ne1Var ? ne1Var : f88Var;
                }
                if (z) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                boolean z2 = this.n;
                if (!z2) {
                    ct1.a0(obj);
                    d11 d11Var2 = f33Var.u;
                    this.n = true;
                    return d11Var2.q(this) == ne1Var ? ne1Var : f88Var;
                }
                if (z2) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
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
                j23 j23Var = f33Var.G;
                t36 t36Var = j23Var.f;
                t36 t36Var2 = j23Var.h;
                t36 t36Var3 = j23Var.l;
                t36 t36Var4 = j23Var.n;
                a33 a33Var = new a33(5, null);
                go2[] go2VarArr = {t36Var, t36Var2, t36Var3, t36Var4};
                b33 b33Var = new b33(f33Var, b2);
                this.n = true;
                Object objI = hm3.i(x00.t, this, b33Var, new cp2((hc1) null, a33Var, (byte) 2), go2VarArr);
                if (objI != ne1Var) {
                    objI = f88Var;
                }
                return objI == ne1Var ? ne1Var : f88Var;
            case 3:
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
                fm fmVar = (fm) f33Var.p.n;
                b33 b33Var2 = new b33(f33Var, b5);
                this.n = true;
                return fmVar.b(b33Var2, this) == ne1Var ? ne1Var : f88Var;
            case 4:
                boolean z5 = this.n;
                if (z5) {
                    if (z5) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                fm fmVar2 = ((xl4) f33Var.f764o).a;
                b33 b33Var3 = new b33(f33Var, b4);
                this.n = true;
                return fmVar2.b(b33Var3, this) == ne1Var ? ne1Var : f88Var;
            case 5:
                boolean z6 = this.n;
                if (z6) {
                    if (z6) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                j23 j23Var2 = f33Var.G;
                t36 t36Var5 = j23Var2.j;
                t36 t36Var6 = j23Var2.p;
                m52 m52Var = new m52(3, null, (byte) 2);
                b33 b33Var4 = new b33(f33Var, b3);
                this.n = true;
                Object objI2 = hm3.i(x00.t, this, b33Var4, new cp2(m52Var, (hc1) null, (byte) 3), new go2[]{t36Var5, t36Var6});
                if (objI2 != ne1Var) {
                    objI2 = f88Var;
                }
                return objI2 == ne1Var ? ne1Var : f88Var;
            default:
                boolean z7 = this.n;
                if (z7) {
                    if (z7) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                go2 go2VarU = nv1.u(ga0.k(new fm(f33Var.C, (byte) 5)), im3.g0(f33.H));
                i9 i9Var = new i9(f33Var, hc1Var, (byte) 13);
                this.n = true;
                return zu1.p(go2VarU, i9Var, this) == ne1Var ? ne1Var : f88Var;
        }
    }
}
