package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class o05 {
    public zu1 a;
    public boolean b;
    public j93 c;

    public abstract void a();

    public abstract void b();

    public abstract void c(m05 m05Var);

    public abstract void d(m05 m05Var);

    public final void e() {
        j93 j93Var = this.c;
        if (j93Var == null || !((bx4) j93Var.p).h(this)) {
            return;
        }
        r05 r05Var = (r05) j93Var.f1141o;
        if (equals(r05Var.f)) {
            if (r05Var.g == -1) {
                a();
            }
            r05Var.f = null;
            r05Var.g = 0;
            r05Var.h = null;
        }
        r05Var.d.remove(this);
        r05Var.e.remove(this);
        this.c = null;
        r05Var.b();
    }

    public final void f(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
        j93 j93Var = this.c;
        if (j93Var != null) {
            ((r05) j93Var.f1141o).b();
        }
    }
}
