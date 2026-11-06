package o;

/* JADX INFO: loaded from: classes.dex */
public final class i75 extends o05 {
    public final j75 d;
    public boolean e;

    public i75(j75 j75Var, k75 k75Var) {
        boolean z = j75Var.b;
        this.a = k75Var;
        this.b = z;
        this.d = j75Var;
        this.e = true;
    }

    @Override // o.o05
    public final void a() {
        this.d.a();
    }

    @Override // o.o05
    public final void b() {
        this.d.b();
    }

    @Override // o.o05
    public final void c(m05 m05Var) {
        this.d.c(new p10(m05Var));
    }

    @Override // o.o05
    public final void d(m05 m05Var) {
        m05Var.getClass();
        this.d.d(new p10(m05Var));
    }

    public final void g(boolean z) {
        this.e = z;
        f(z && this.d.b);
    }
}
