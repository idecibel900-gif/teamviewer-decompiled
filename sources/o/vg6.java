package o;

/* JADX INFO: loaded from: classes2.dex */
public final class vg6 extends jc1 implements ho2 {
    public final ho2 m;
    public final de1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f2311o;
    public de1 p;
    public hc1 q;

    public vg6(ho2 ho2Var, de1 de1Var) {
        super(wx0.f2456o, ba2.m);
        this.m = ho2Var;
        this.n = de1Var;
        this.f2311o = ((Number) de1Var.b0(0, new qo2((byte) 17))).intValue();
    }

    @Override // o.ho2
    public final Object c(Object obj, hc1 hc1Var) {
        try {
            Object objE = e(hc1Var, obj);
            return objE == ne1.m ? objE : f88.a;
        } catch (Throwable th) {
            this.p = new v32(th, hc1Var.getContext());
            throw th;
        }
    }

    public final Object e(hc1 hc1Var, Object obj) {
        de1 context = hc1Var.getContext();
        ds1.H(context);
        de1 de1Var = this.p;
        if (de1Var != context) {
            if (de1Var instanceof v32) {
                throw new IllegalStateException(vb7.C("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((v32) de1Var).n + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.b0(0, new gg4(this, (byte) 11))).intValue() != this.f2311o) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.n + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.p = context;
        }
        this.q = hc1Var;
        iw2 iw2Var = xg6.a;
        ho2 ho2Var = this.m;
        ho2Var.getClass();
        Object objD = iw2Var.d(ho2Var, obj, this);
        if (!im3.n(objD, ne1.m)) {
            this.q = null;
        }
        return objD;
    }

    @Override // o.i30, o.oe1
    public final oe1 getCallerFrame() {
        hc1 hc1Var = this.q;
        if (hc1Var instanceof oe1) {
            return (oe1) hc1Var;
        }
        return null;
    }

    @Override // o.jc1, o.hc1
    public final de1 getContext() {
        de1 de1Var = this.p;
        return de1Var == null ? ba2.m : de1Var;
    }

    @Override // o.i30
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        Throwable thA = tc6.a(obj);
        if (thA != null) {
            this.p = new v32(thA, getContext());
        }
        hc1 hc1Var = this.q;
        if (hc1Var != null) {
            hc1Var.resumeWith(obj);
        }
        return ne1.m;
    }
}
