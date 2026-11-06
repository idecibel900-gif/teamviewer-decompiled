package o;

/* JADX INFO: loaded from: classes.dex */
public final class sx8 {
    public Object a;
    public by8 b;
    public fy8 c;
    public boolean d;

    public final void a(Object obj) {
        this.d = true;
        by8 by8Var = this.b;
        if (by8Var != null) {
            zx8 zx8Var = by8Var.n;
            zx8Var.getClass();
            if (obj == null) {
                obj = rx8.s;
            }
            if (rx8.r.x(zx8Var, null, obj)) {
                rx8.c(zx8Var);
                this.a = null;
                this.b = null;
                this.c = null;
            }
        }
    }

    public final void finalize() {
        fy8 fy8Var;
        by8 by8Var = this.b;
        if (by8Var != null && !by8Var.n.isDone()) {
            by8Var.b(new vx8("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.a))));
        }
        if (this.d || (fy8Var = this.c) == null) {
            return;
        }
        fy8Var.h(null);
    }
}
