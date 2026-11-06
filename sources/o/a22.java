package o;

/* JADX INFO: loaded from: classes2.dex */
public final class a22 extends c22 implements oe1, hc1 {
    public static final /* synthetic */ long t = defpackage.a.a.objectFieldOffset(a22.class.getDeclaredField("_reusableCancellableContinuation$volatile"));
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final fe1 p;
    public final jc1 q;
    public Object r;
    public final Object s;

    public a22(fe1 fe1Var, jc1 jc1Var) {
        super(-1);
        this.p = fe1Var;
        this.q = jc1Var;
        this.r = ga0.s;
        this.s = j51.S(jc1Var.getContext());
    }

    @Override // o.c22
    public final hc1 c() {
        return this;
    }

    @Override // o.oe1
    public final oe1 getCallerFrame() {
        return this.q;
    }

    @Override // o.hc1
    public final de1 getContext() {
        return this.q.getContext();
    }

    @Override // o.c22
    public final Object i() {
        Object obj = this.r;
        this.r = ga0.s;
        return obj;
    }

    @Override // o.hc1
    public final void resumeWith(Object obj) {
        Throwable thA = tc6.a(obj);
        Object xx0Var = thA == null ? obj : new xx0(thA, false);
        jc1 jc1Var = this.q;
        de1 context = jc1Var.getContext();
        fe1 fe1Var = this.p;
        if (ga0.v(fe1Var, context)) {
            this.r = xx0Var;
            this.f478o = 0;
            ga0.u(fe1Var, jc1Var.getContext(), this);
            return;
        }
        be2 be2VarA = du7.a();
        if (be2VarA.f416o >= 4294967296L) {
            this.r = xx0Var;
            this.f478o = 0;
            be2VarA.P0(this);
            return;
        }
        be2VarA.Q0(true);
        try {
            de1 context2 = jc1Var.getContext();
            Object objY = j51.Y(context2, this.s);
            try {
                jc1Var.resumeWith(obj);
                j51.Q(context2, objY);
                while (be2VarA.S0()) {
                }
            } catch (Throwable th) {
                j51.Q(context2, objY);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                h(th2);
            } finally {
                be2VarA.O0(true);
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.p + ", " + di1.G(this.q) + ']';
    }
}
