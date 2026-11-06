package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class ff0 implements ug8 {
    public Object m = mf0.p;
    public gl0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kf0 f790o;

    public ff0(kf0 kf0Var) {
        this.f790o = kf0Var;
    }

    @Override // o.ug8
    public final void a(tn6 tn6Var, int i) {
        gl0 gl0Var = this.n;
        if (gl0Var != null) {
            gl0Var.a(tn6Var, i);
        }
    }

    public final Object b(jc1 jc1Var) throws Throwable {
        kn0 kn0VarI;
        Object obj = this.m;
        boolean z = true;
        if (obj == mf0.p || obj == mf0.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = kf0.s;
            kf0 kf0Var = this.f790o;
            kn0 kn0Var = (kn0) atomicReferenceFieldUpdater.get(kf0Var);
            while (!kf0Var.y()) {
                long andIncrement = kf0.f1258o.getAndIncrement(kf0Var);
                long j = mf0.b;
                long j2 = andIncrement / j;
                int i = (int) (andIncrement % j);
                if (kn0Var.p != j2) {
                    kn0VarI = kf0Var.i(j2, kn0Var);
                    if (kn0VarI == null) {
                        continue;
                    }
                } else {
                    kn0VarI = kn0Var;
                }
                Object objK = kf0Var.K(kn0VarI, i, andIncrement, null);
                hr2 hr2Var = mf0.m;
                if (objK == hr2Var) {
                    hk0.l("unreachable");
                    return null;
                }
                hr2 hr2Var2 = mf0.f1464o;
                if (objK == hr2Var2) {
                    if (andIncrement < kf0Var.u()) {
                        kn0VarI.a();
                    }
                    kn0Var = kn0VarI;
                } else {
                    if (objK == mf0.n) {
                        kf0 kf0Var2 = this.f790o;
                        gl0 gl0VarG = im3.G(vt1.A(jc1Var));
                        try {
                            this.n = gl0VarG;
                            Object objK2 = kf0Var2.K(kn0VarI, i, andIncrement, this);
                            if (objK2 != hr2Var) {
                                if (objK2 == hr2Var2) {
                                    if (andIncrement < kf0Var2.u()) {
                                        kn0VarI.a();
                                    }
                                    kn0 kn0Var2 = (kn0) kf0.s.get(kf0Var2);
                                    while (true) {
                                        if (kf0Var2.y()) {
                                            gl0 gl0Var = this.n;
                                            gl0Var.getClass();
                                            this.n = null;
                                            this.m = mf0.l;
                                            Throwable thQ = kf0Var.q();
                                            if (thQ != null) {
                                                gl0Var.resumeWith(new sc6(thQ));
                                                break;
                                            }
                                            gl0Var.resumeWith(Boolean.FALSE);
                                            break;
                                        }
                                        long andIncrement2 = kf0.f1258o.getAndIncrement(kf0Var2);
                                        long j3 = mf0.b;
                                        long j4 = andIncrement2 / j3;
                                        int i2 = (int) (andIncrement2 % j3);
                                        if (kn0Var2.p != j4) {
                                            kn0 kn0VarI2 = kf0Var2.i(j4, kn0Var2);
                                            if (kn0VarI2 != null) {
                                                kn0Var2 = kn0VarI2;
                                            }
                                        }
                                        Object objK3 = kf0Var2.K(kn0Var2, i2, andIncrement2, this);
                                        if (objK3 == mf0.m) {
                                            a(kn0Var2, i2);
                                            break;
                                        }
                                        if (objK3 == mf0.f1464o) {
                                            if (andIncrement2 < kf0Var2.u()) {
                                                kn0Var2.a();
                                            }
                                        } else {
                                            if (objK3 == mf0.n) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            kn0Var2.a();
                                            this.m = objK3;
                                            this.n = null;
                                        }
                                    }
                                } else {
                                    kn0VarI.a();
                                    this.m = objK2;
                                    this.n = null;
                                }
                                gl0VarG.g(Boolean.TRUE, null);
                                break;
                            }
                            a(kn0VarI, i);
                            return gl0VarG.q();
                        } catch (Throwable th) {
                            gl0VarG.B();
                            throw th;
                        }
                    }
                    kn0VarI.a();
                    this.m = objK;
                }
            }
            this.m = mf0.l;
            Throwable thQ2 = kf0Var.q();
            if (thQ2 != null) {
                int i3 = g87.a;
                throw thQ2;
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final Object c() throws Throwable {
        Object obj = this.m;
        hr2 hr2Var = mf0.p;
        if (obj == hr2Var) {
            hk0.l("`hasNext()` has not been invoked");
            return null;
        }
        this.m = hr2Var;
        if (obj != mf0.l) {
            return obj;
        }
        Throwable thR = this.f790o.r();
        int i = g87.a;
        throw thR;
    }
}
