package o;

import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class rm6 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ bn6 f1931o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rm6(bn6 bn6Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f1931o = bn6Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        bn6 bn6Var = this.f1931o;
        switch (b) {
            case 0:
                return new rm6(bn6Var, hc1Var, (byte) 0);
            case 1:
                return new rm6(bn6Var, hc1Var, (byte) 1);
            case 2:
                return new rm6(bn6Var, hc1Var, (byte) 2);
            case 3:
                return new rm6(bn6Var, hc1Var, (byte) 3);
            case 4:
                return new rm6(bn6Var, hc1Var, (byte) 4);
            case 5:
                return new rm6(bn6Var, hc1Var, (byte) 5);
            default:
                return new rm6(bn6Var, hc1Var, (byte) 6);
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
        return ((rm6) create(me1Var, hc1Var)).invokeSuspend(f88Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o.i30
    public final Object invokeSuspend(Object obj) throws Throwable {
        byte b = this.m;
        byte b2 = 2;
        bn6 bn6Var = this.f1931o;
        ne1 ne1Var = ne1.m;
        f88 f88Var = f88.a;
        byte b3 = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (b) {
            case 0:
                boolean z = this.n;
                if (!z) {
                    ct1.a0(obj);
                    z31 z31Var = ((yl6) bn6Var.u.getValue()).c;
                    String str = z31Var != null ? z31Var.a : null;
                    if (str == null) {
                        str = "";
                    }
                    this.n = true;
                    Object objC = bn6Var.w.c(str, this);
                    if (objC != ne1Var) {
                        objC = f88Var;
                    }
                    if (objC == ne1Var) {
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
                boolean z2 = this.n;
                if (!z2) {
                    ct1.a0(obj);
                    byte b4 = 0;
                    go2[] go2VarArr = {bn6Var.t, new to2(bn6Var.A, bn6Var, (byte) 5)};
                    int i = dp2.a;
                    ex exVar = new ex(go2VarArr, b4);
                    ba2 ba2Var = ba2.m;
                    df0 df0Var = df0.m;
                    fn0 fn0Var = new fn0(new cp2((pw2) new vt4(bn6Var, objArr2 == true ? 1 : 0, (byte) 17), (hc1) (objArr == true ? 1 : 0), b4), nv1.u(new gn0(exVar, ba2Var, -2, df0Var), 250L), ba2Var, -2, df0Var);
                    ym6 ym6Var = new ym6(bn6Var, b4);
                    this.n = true;
                    if (fn0Var.b(ym6Var, this) == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z2) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                return f88Var;
            case 2:
                boolean z3 = this.n;
                if (!z3) {
                    ct1.a0(obj);
                    fm fmVar = (fm) bn6Var.p.n;
                    ym6 ym6Var2 = new ym6(bn6Var, b3);
                    this.n = true;
                    if (fmVar.b(ym6Var2, this) == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z3) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                return f88Var;
            case 3:
                boolean z4 = this.n;
                if (!z4) {
                    ct1.a0(obj);
                    fm fmVar2 = ((xl4) bn6Var.f443o).a;
                    ym6 ym6Var3 = new ym6(bn6Var, b2);
                    this.n = true;
                    if (fmVar2.b(ym6Var3, this) == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z4) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                return f88Var;
            case 4:
                boolean z5 = this.n;
                if (!z5) {
                    ct1.a0(obj);
                    bn6Var.F.clear();
                    bn6Var.G.clear();
                    yx6 yx6Var = bn6Var.A;
                    this.n = true;
                    if (yx6Var.c(f88Var, this) == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z5) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                return f88Var;
            case 5:
                boolean z6 = this.n;
                if (!z6) {
                    ct1.a0(obj);
                    h37 h37Var = new h37(new j37(R.string.tv_connectNoConnection, null), k37.m, null, 12);
                    this.n = true;
                    Object objC2 = bn6Var.y.c(h37Var, this);
                    if (objC2 != ne1Var) {
                        objC2 = f88Var;
                    }
                    if (objC2 == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z6) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                return f88Var;
            default:
                boolean z7 = this.n;
                if (!z7) {
                    ct1.a0(obj);
                    yx6 yx6Var2 = bn6Var.A;
                    this.n = true;
                    if (yx6Var2.c(f88Var, this) == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z7) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                return f88Var;
        }
    }
}
