package o;

/* JADX INFO: loaded from: classes2.dex */
public final class tb6 {
    public final zz3 a;
    public final qj6 b;
    public final f96 c;
    public final vt7 d;
    public final mn1 e;

    public tb6(zz3 zz3Var, qj6 qj6Var, f96 f96Var, vt7 vt7Var, mn1 mn1Var) {
        this.a = zz3Var;
        this.b = qj6Var;
        this.c = f96Var;
        this.d = vt7Var;
        this.e = mn1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tb6.class != obj.getClass()) {
            return false;
        }
        tb6 tb6Var = (tb6) obj;
        return this.a.equals(tb6Var.a) && this.b.equals(tb6Var.b) && this.c.equals(tb6Var.c) && this.d == tb6Var.d && this.e == tb6Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + to7.e(to7.e(this.a.m.hashCode() * 31, 31, this.b.m), 31, this.c.m)) * 31);
    }
}
