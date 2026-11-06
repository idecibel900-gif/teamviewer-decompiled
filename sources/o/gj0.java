package o;

/* JADX INFO: loaded from: classes.dex */
public final class gj0 {
    public Object a;
    public kj0 b;
    public ob6 c;
    public boolean d;

    public final void a(Object obj) {
        this.d = true;
        kj0 kj0Var = this.b;
        if (kj0Var == null || !kj0Var.n.set(obj)) {
            return;
        }
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final void b(Throwable th) {
        this.d = true;
        kj0 kj0Var = this.b;
        if (kj0Var == null || !kj0Var.n.setException(th)) {
            return;
        }
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final void finalize() {
        ob6 ob6Var;
        kj0 kj0Var = this.b;
        if (kj0Var != null) {
            jj0 jj0Var = kj0Var.n;
            if (!jj0Var.isDone()) {
                jj0Var.setException(new hj0("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a));
            }
        }
        if (this.d || (ob6Var = this.c) == null) {
            return;
        }
        ob6Var.set(null);
    }
}
