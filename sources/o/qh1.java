package o;

/* JADX INFO: loaded from: classes.dex */
public final class qh1 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ boolean f1830o;
    public final /* synthetic */ vh1 p;
    public final /* synthetic */ int q;
    public Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qh1(vh1 vh1Var, int i, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.p = vh1Var;
        this.q = i;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        int i = this.q;
        vh1 vh1Var = this.p;
        switch (b) {
            case 0:
                qh1 qh1Var = new qh1(vh1Var, i, hc1Var, (byte) 0);
                qh1Var.f1830o = ((Boolean) obj).booleanValue();
                return qh1Var;
            default:
                qh1 qh1Var2 = new qh1(vh1Var, i, hc1Var, (byte) 1);
                qh1Var2.f1830o = ((Boolean) obj).booleanValue();
                return qh1Var2;
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        hc1 hc1Var = (hc1) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((qh1) create(bool, hc1Var)).invokeSuspend(f88Var);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0066  */
    /* JADX WARN: Code duplicated, block: B:23:0x006b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [byte] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v7 */
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
        Throwable th;
        g97 h36Var;
        boolean z;
        boolean z2;
        Object obj2;
        int iHashCode;
        byte b = this.m;
        int iIntValue = this.q;
        ne1 ne1Var = ne1.m;
        vh1 vh1Var = this.p;
        switch (b) {
            case 0:
                boolean z3 = this.n;
                try {
                    if (z3 == 0) {
                        ct1.a0(obj);
                        boolean z4 = this.f1830o;
                        this.f1830o = z4;
                        this.n = (byte) 1;
                        obj = vh1Var.h(z4, this);
                        z3 = z4;
                        if (obj == ne1Var) {
                            return ne1Var;
                        }
                    } else {
                        if (z3 != 1) {
                            if (z3 != 2) {
                                hk0.l("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            boolean z5 = this.f1830o;
                            th = (Throwable) this.r;
                            ct1.a0(obj);
                            z3 = z5;
                            iIntValue = ((Number) obj).intValue();
                            th = th;
                            h36Var = new h36(th, iIntValue);
                            z = z3;
                            return new vd5(h36Var, Boolean.valueOf(z));
                        }
                        boolean z6 = this.f1830o;
                        ct1.a0(obj);
                        z3 = z6;
                    }
                    h36Var = (g97) obj;
                    z = z3;
                    break;
                } catch (Throwable th2) {
                    th = th2;
                    if (z3 != 0) {
                        o07 o07VarC = vh1Var.c();
                        this.r = th;
                        this.f1830o = z3;
                        this.n = (byte) 2;
                        Integer numA = o07VarC.a();
                        if (numA == ne1Var) {
                            return ne1Var;
                        }
                        obj = numA;
                        th = th;
                        z3 = z3;
                    }
                    h36Var = new h36(th, iIntValue);
                    z = z3;
                    return new vd5(h36Var, Boolean.valueOf(z));
                }
                return new vd5(h36Var, Boolean.valueOf(z));
            default:
                byte b2 = this.n;
                if (b2 != 0) {
                    if (b2 == 1) {
                        z2 = this.f1830o;
                        ct1.a0(obj);
                    } else {
                        if (b2 != 2) {
                            hk0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj2 = this.r;
                        ct1.a0(obj);
                    }
                    iIntValue = ((Number) obj).intValue();
                    obj = obj2;
                    if (obj != null) {
                        iHashCode = obj.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    return new qg1(iHashCode, iIntValue, obj);
                }
                ct1.a0(obj);
                z2 = this.f1830o;
                this.f1830o = z2;
                this.n = (byte) 1;
                obj = ((rj2) vh1Var.j.getValue()).a(new gh1(3, (hc1) null), this);
                if (obj == ne1Var) {
                    return ne1Var;
                }
                if (z2) {
                    o07 o07VarC2 = vh1Var.c();
                    this.r = obj;
                    this.n = (byte) 2;
                    Integer numA2 = o07VarC2.a();
                    if (numA2 == ne1Var) {
                        return ne1Var;
                    }
                    Object obj3 = obj;
                    obj = numA2;
                    obj2 = obj3;
                    iIntValue = ((Number) obj).intValue();
                    obj = obj2;
                }
                if (obj != null) {
                    iHashCode = obj.hashCode();
                } else {
                    iHashCode = 0;
                }
                return new qg1(iHashCode, iIntValue, obj);
        }
    }
}
