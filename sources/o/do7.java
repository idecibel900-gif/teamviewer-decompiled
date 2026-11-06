package o;

/* JADX INFO: loaded from: classes.dex */
public final class do7 {
    public final hy8 a = new hy8();

    public final void a(Object obj) {
        this.a.m(obj);
    }

    public final boolean b(Exception exc) {
        hy8 hy8Var = this.a;
        nv1.t(exc, "Exception must not be null");
        synchronized (hy8Var.a) {
            try {
                if (hy8Var.c) {
                    return false;
                }
                hy8Var.c = true;
                hy8Var.f = exc;
                hy8Var.b.r(hy8Var);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Object obj) {
        hy8 hy8Var = this.a;
        synchronized (hy8Var.a) {
            try {
                if (hy8Var.c) {
                    return;
                }
                hy8Var.c = true;
                hy8Var.e = obj;
                hy8Var.b.r(hy8Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
