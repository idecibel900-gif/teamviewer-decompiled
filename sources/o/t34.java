package o;

/* JADX INFO: loaded from: classes.dex */
public final class t34 {
    public final Object a;
    public final u34 b;
    public int d;
    public t34 e;
    public boolean f;
    public int c = -1;
    public final bg5 g = h57.p(null);

    public t34(Object obj, u34 u34Var) {
        this.a = obj;
        this.b = u34Var;
    }

    public final t34 a() {
        if (this.f) {
            ni3.c("Pin should not be called on an already disposed item ");
        }
        if (this.d == 0) {
            this.b.m.add(this);
            t34 t34Var = (t34) this.g.getValue();
            if (t34Var != null) {
                t34Var.a();
            } else {
                t34Var = null;
            }
            this.e = t34Var;
        }
        this.d++;
        return this;
    }

    public final void b() {
        if (this.f) {
            return;
        }
        if (this.d <= 0) {
            ni3.c("Release should only be called once");
        }
        int i = this.d - 1;
        this.d = i;
        if (i == 0) {
            this.b.m.remove(this);
            t34 t34Var = this.e;
            if (t34Var != null) {
                t34Var.b();
            }
            this.e = null;
        }
    }
}
