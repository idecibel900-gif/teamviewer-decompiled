package o;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jc1 extends i30 {
    private final de1 _context;
    private transient hc1<Object> intercepted;

    public jc1(hc1 hc1Var) {
        this(hc1Var, hc1Var != null ? hc1Var.getContext() : null);
    }

    @Override // o.hc1
    public de1 getContext() {
        de1 de1Var = this._context;
        de1Var.getClass();
        return de1Var;
    }

    public final hc1<Object> intercepted() {
        hc1<Object> hc1Var = this.intercepted;
        if (hc1Var != null) {
            return hc1Var;
        }
        fe1 fe1Var = (fe1) getContext().l0(d82.y);
        hc1<Object> a22Var = fe1Var != null ? new a22(fe1Var, this) : this;
        this.intercepted = a22Var;
        return a22Var;
    }

    @Override // o.i30
    public void releaseIntercepted() {
        Unsafe unsafe;
        long j;
        hc1<Object> hc1Var = this.intercepted;
        if (hc1Var != null && hc1Var != this) {
            be1 be1VarL0 = getContext().l0(d82.y);
            be1VarL0.getClass();
            a22 a22Var = (a22) hc1Var;
            do {
                unsafe = defpackage.a.a;
                j = a22.t;
            } while (unsafe.getObjectVolatile(a22Var, j) == ga0.t);
            Object objectVolatile = unsafe.getObjectVolatile(a22Var, j);
            gl0 gl0Var = objectVolatile instanceof gl0 ? (gl0) objectVolatile : null;
            if (gl0Var != null) {
                gl0Var.m();
            }
        }
        this.intercepted = wx0.n;
    }

    public jc1(hc1 hc1Var, de1 de1Var) {
        super(hc1Var);
        this._context = de1Var;
    }
}
