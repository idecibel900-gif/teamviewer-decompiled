package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class ek0 implements dj0, cj0, t75 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ gl0 n;

    public /* synthetic */ ek0(gl0 gl0Var, byte b) {
        this.m = b;
        this.n = gl0Var;
    }

    @Override // o.dj0
    public void a(lc6 lc6Var) {
        this.n.g(lc6Var, dk0.n);
    }

    @Override // o.cj0
    public void d(qi0 qi0Var, Throwable th) {
        byte b = this.m;
        gl0 gl0Var = this.n;
        switch (b) {
            case 1:
                gl0Var.resumeWith(new sc6(th));
                break;
            case 2:
                gl0Var.resumeWith(new sc6(th));
                break;
            default:
                gl0Var.resumeWith(new sc6(th));
                break;
        }
    }

    @Override // o.cj0
    public void e(qi0 qi0Var, kc6 kc6Var) {
        byte b = this.m;
        gl0 gl0Var = this.n;
        switch (b) {
            case 1:
                if (!kc6Var.a.B) {
                    gl0Var.resumeWith(new sc6(new w83(kc6Var)));
                } else {
                    Object obj = kc6Var.b;
                    if (obj != null) {
                        gl0Var.resumeWith(obj);
                    } else {
                        ab6 ab6VarL0 = qi0Var.l0();
                        ab6VarL0.getClass();
                        wt3 wt3VarB = w86.a.b(an3.class);
                        Object objCast = et1.z(wt3VarB).cast(ab6VarL0.e.k(wt3VarB));
                        objCast.getClass();
                        an3 an3Var = (an3) objCast;
                        gl0Var.resumeWith(new sc6(new jz3("Response from " + an3Var.a.getName() + '.' + an3Var.c.getName() + " was null but response body type was declared as non-null")));
                    }
                }
                break;
            case 2:
                if (!kc6Var.a.B) {
                    gl0Var.resumeWith(new sc6(new w83(kc6Var)));
                } else {
                    gl0Var.resumeWith(kc6Var.b);
                }
                break;
            default:
                gl0Var.resumeWith(kc6Var);
                break;
        }
    }

    @Override // o.t75
    public void m(bo7 bo7Var) {
        Exception excH = bo7Var.h();
        if (excH != null) {
            this.n.resumeWith(new sc6(excH));
            return;
        }
        boolean z = ((hy8) bo7Var).d;
        gl0 gl0Var = this.n;
        if (z) {
            gl0Var.f(null);
        } else {
            gl0Var.resumeWith(bo7Var.i());
        }
    }

    @Override // o.dj0
    public void q(IOException iOException) {
        this.n.resumeWith(new sc6(iOException));
    }
}
