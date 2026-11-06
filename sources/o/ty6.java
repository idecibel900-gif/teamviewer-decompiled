package o;

/* JADX INFO: loaded from: classes.dex */
public final class ty6 implements u15 {
    public final /* synthetic */ xy6 m;
    public final /* synthetic */ ym2 n;

    public ty6(xy6 xy6Var, ca0 ca0Var) {
        this.m = xy6Var;
        this.n = ca0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o.u15
    public final Object C(long j, hc1 hc1Var) {
        sy6 sy6Var;
        xy6 xy6Var = this.m;
        nf nfVar = xy6Var.g;
        if (hc1Var instanceof sy6) {
            sy6Var = (sy6) hc1Var;
            int i = sy6Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                sy6Var.p = i - Integer.MIN_VALUE;
            } else {
                sy6Var = new sy6(this, (jc1) hc1Var);
            }
        } else {
            sy6Var = new sy6(this, (jc1) hc1Var);
        }
        Object obj = sy6Var.n;
        int i2 = sy6Var.p;
        if (i2 == 0) {
            ct1.a0(obj);
            float fC = nc8.c(j);
            float fJ = nfVar.j();
            float fE = nfVar.e().e();
            if (fC >= 0.0f || fJ <= fE) {
                j = 0;
            } else {
                sy6Var.m = j;
                sy6Var.p = 1;
                Object objA = xy6Var.a(this.n, fC, sy6Var);
                ne1 ne1Var = ne1.m;
                if (objA == ne1Var) {
                    return ne1Var;
                }
            }
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = sy6Var.m;
            ct1.a0(obj);
        }
        return new nc8(j);
    }

    @Override // o.u15
    public final long J(int i, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f || i != 1) {
            return 0L;
        }
        nf nfVar = this.m.g;
        float fH = nfVar.h(fIntBitsToFloat);
        float fJ = fH - nfVar.j();
        ((mf) nfVar.k).a(fH, 0.0f);
        return a(fJ);
    }

    public final long a(float f) {
        return (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.u15
    public final Object e(long j, long j2, hc1 hc1Var) {
        ry6 ry6Var;
        if (hc1Var instanceof ry6) {
            ry6Var = (ry6) hc1Var;
            int i = ry6Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                ry6Var.p = i - Integer.MIN_VALUE;
            } else {
                ry6Var = new ry6(this, (jc1) hc1Var);
            }
        } else {
            ry6Var = new ry6(this, (jc1) hc1Var);
        }
        Object objA = ry6Var.n;
        int i2 = ry6Var.p;
        if (i2 == 0) {
            ct1.a0(objA);
            float fC = nc8.c(j2);
            ry6Var.m = j;
            ry6Var.p = 1;
            objA = this.m.a(this.n, fC, ry6Var);
            ne1 ne1Var = ne1.m;
            if (objA == ne1Var) {
                return ne1Var;
            }
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = ry6Var.m;
            ct1.a0(objA);
        }
        return new nc8(g77.c(nc8.b(j), ((Number) objA).floatValue()));
    }

    @Override // o.u15
    public final long p0(int i, long j, long j2) {
        if (i != 1) {
            return 0L;
        }
        nf nfVar = this.m.g;
        float fH = nfVar.h(Float.intBitsToFloat((int) (4294967295L & j2)));
        float fJ = fH - nfVar.j();
        ((mf) nfVar.k).a(fH, 0.0f);
        return a(fJ);
    }
}
