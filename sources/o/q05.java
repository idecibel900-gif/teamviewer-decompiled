package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class q05 {
    public j93 a;
    public boolean b;

    public final void a() {
        j93 j93Var = this.a;
        if (j93Var == null) {
            hk0.l("This input is not added to any dispatcher.");
            return;
        }
        if (!this.b) {
            j93Var.G(this, null);
        }
        r05 r05Var = (r05) j93Var.f1141o;
        ar arVar = (ar) j93Var.n;
        if (equals(r05Var.h) && -1 == r05Var.g) {
            o05 o05VarC = r05Var.f;
            if (o05VarC == null) {
                o05VarC = r05Var.c(-1);
            }
            r05Var.f = null;
            r05Var.g = 0;
            r05Var.h = null;
            if (o05VarC == null) {
                ((o75) arVar.n).a.run();
            } else {
                o05VarC.b();
            }
            r05Var.a.l(null, s05.e);
        }
        this.b = false;
    }

    public void b(boolean z) {
    }
}
