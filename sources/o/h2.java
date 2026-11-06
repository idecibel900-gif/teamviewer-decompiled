package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class h2 {
    public boolean a(p2 p2Var, l2 l2Var, l2 l2Var2) {
        synchronized (p2Var) {
            try {
                if (p2Var.listeners != l2Var) {
                    return false;
                }
                p2Var.listeners = l2Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean b(p2 p2Var, Object obj, Object obj2) {
        synchronized (p2Var) {
            try {
                if (p2Var.value != obj) {
                    return false;
                }
                p2Var.value = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean c(p2 p2Var, o2 o2Var, o2 o2Var2) {
        synchronized (p2Var) {
            try {
                if (p2Var.waiters != o2Var) {
                    return false;
                }
                p2Var.waiters = o2Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(o2 o2Var, o2 o2Var2) {
        o2Var.b = o2Var2;
    }

    public void e(o2 o2Var, Thread thread) {
        o2Var.a = thread;
    }
}
