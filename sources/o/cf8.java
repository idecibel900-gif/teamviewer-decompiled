package o;

/* JADX INFO: loaded from: classes.dex */
public final class cf8 extends y57 {
    public boolean c = false;
    public int d = 0;
    public final /* synthetic */ df8 e;

    public cf8(df8 df8Var) {
        this.e = df8Var;
    }

    @Override // o.y57, o.ef8
    public final void b() {
        if (this.c) {
            return;
        }
        this.c = true;
        ef8 ef8Var = this.e.d;
        if (ef8Var != null) {
            ef8Var.b();
        }
    }

    @Override // o.ef8
    public final void c() {
        int i = this.d + 1;
        this.d = i;
        df8 df8Var = this.e;
        if (i == df8Var.a.size()) {
            ef8 ef8Var = df8Var.d;
            if (ef8Var != null) {
                ef8Var.c();
            }
            this.d = 0;
            this.c = false;
            df8Var.e = false;
        }
    }
}
