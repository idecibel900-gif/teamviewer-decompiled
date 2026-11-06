package o;

/* JADX INFO: loaded from: classes.dex */
public final class co7 {
    public bi2[] a;
    public boolean b;
    public char c;
    public Object d;

    public co7 a() {
        nv1.o(((y96) this.d) != null, "execute parameter required");
        bi2[] bi2VarArr = this.a;
        boolean z = this.b;
        char c = this.c;
        co7 co7Var = new co7();
        co7Var.d = this;
        co7Var.a = bi2VarArr;
        boolean z2 = false;
        if (bi2VarArr != null && z) {
            z2 = true;
        }
        co7Var.b = z2;
        co7Var.c = c;
        return co7Var;
    }
}
