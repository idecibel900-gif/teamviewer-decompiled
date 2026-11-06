package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d1 extends op3 implements hc1, me1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final de1 f577o;

    public d1(de1 de1Var, boolean z) {
        super(z);
        J((bp3) de1Var.l0(z06.z));
        this.f577o = de1Var.H0(this);
    }

    @Override // o.op3
    public final void I(yx0 yx0Var) {
        ck3.T(yx0Var, this.f577o);
    }

    @Override // o.op3
    public String P() {
        return super.P();
    }

    @Override // o.op3
    public final void S(Object obj) {
        if (!(obj instanceof xx0)) {
            d0(obj);
        } else {
            xx0 xx0Var = (xx0) obj;
            a0(xx0Var.a, defpackage.a.a.getIntVolatile(xx0Var, xx0.b) == 1);
        }
    }

    public void a0(Throwable th, boolean z) {
    }

    public void d0(Object obj) {
    }

    public final void e0(pe1 pe1Var, d1 d1Var, hw2 hw2Var) {
        Object objInvoke;
        int iOrdinal = pe1Var.ordinal();
        f88 f88Var = f88.a;
        if (iOrdinal == 0) {
            try {
                ga0.t(f88Var, vt1.A(vt1.p(d1Var, this, hw2Var)));
                return;
            } catch (Throwable th) {
                th = th;
                if (th instanceof z12) {
                    th = ((z12) th).m;
                }
                resumeWith(new sc6(th));
                throw th;
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                hw2Var.getClass();
                vt1.A(vt1.p(d1Var, this, hw2Var)).resumeWith(f88Var);
                return;
            }
            if (iOrdinal != 3) {
                gk0.s();
                return;
            }
            try {
                de1 de1Var = this.f577o;
                Object objY = j51.Y(de1Var, null);
                try {
                    if (hw2Var instanceof i30) {
                        e8.i(2, hw2Var);
                        objInvoke = hw2Var.invoke(d1Var, this);
                    } else {
                        objInvoke = vt1.O(hw2Var, d1Var, this);
                    }
                    j51.Q(de1Var, objY);
                    if (objInvoke != ne1.m) {
                        resumeWith(objInvoke);
                    }
                } catch (Throwable th2) {
                    j51.Q(de1Var, objY);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                if (th instanceof z12) {
                    th = ((z12) th).m;
                }
                resumeWith(new sc6(th));
            }
        }
    }

    @Override // o.hc1
    public final de1 getContext() {
        return this.f577o;
    }

    @Override // o.me1
    public final de1 getCoroutineContext() {
        return this.f577o;
    }

    @Override // o.hc1
    public final void resumeWith(Object obj) {
        Throwable thA = tc6.a(obj);
        if (thA != null) {
            obj = new xx0(thA, false);
        }
        Object objO = O(obj);
        if (objO == ka0.n) {
            return;
        }
        d(objO);
    }

    @Override // o.op3
    public final String t() {
        return getClass().getSimpleName().concat(" was cancelled");
    }
}
