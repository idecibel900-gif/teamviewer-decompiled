package o;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c22 extends zn7 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f478o;

    public c22(int i) {
        super(0L, false);
        this.f478o = i;
    }

    public void b(CancellationException cancellationException) {
    }

    public abstract hc1 c();

    public Throwable d(Object obj) {
        xx0 xx0Var = obj instanceof xx0 ? (xx0) obj : null;
        if (xx0Var != null) {
            return xx0Var.a;
        }
        return null;
    }

    public Object e(Object obj) {
        return obj;
    }

    public final void h(Throwable th) {
        ck3.T(new se1("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), c().getContext());
    }

    public abstract Object i();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            hc1 hc1VarC = c();
            hc1VarC.getClass();
            a22 a22Var = (a22) hc1VarC;
            jc1 jc1Var = a22Var.q;
            Object obj = a22Var.s;
            de1 context = jc1Var.getContext();
            Object objY = j51.Y(context, obj);
            bp3 bp3Var = null;
            t78 t78VarZ = objY != j51.y ? j51.Z(jc1Var, context, objY) : null;
            try {
                de1 context2 = jc1Var.getContext();
                Object objI = i();
                Throwable thD = d(objI);
                if (thD == null) {
                    int i = this.f478o;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                    if (z) {
                        bp3Var = (bp3) context2.l0(z06.z);
                    }
                }
                if (bp3Var != null && !bp3Var.e()) {
                    CancellationException cancellationExceptionZ = bp3Var.z();
                    b(cancellationExceptionZ);
                    jc1Var.resumeWith(ct1.A(cancellationExceptionZ));
                } else if (thD != null) {
                    jc1Var.resumeWith(new sc6(thD));
                } else {
                    jc1Var.resumeWith(e(objI));
                }
            } finally {
                if (t78VarZ == null || t78VarZ.g0()) {
                    j51.Q(context, objY);
                }
            }
        } catch (z12 e) {
            ck3.T(e.m, c().getContext());
        } catch (Throwable th) {
            h(th);
        }
    }
}
