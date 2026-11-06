package o;

/* JADX INFO: loaded from: classes.dex */
public final class la0 {
    public final k70 a;
    public final wc6 b;
    public final wc6 c;
    public final wc6 d;
    public final wc6 e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;

    public la0(k70 k70Var, wc6 wc6Var, wc6 wc6Var2, wc6 wc6Var3, wc6 wc6Var4) throws d55 {
        boolean z = wc6Var == null || wc6Var2 == null;
        boolean z2 = wc6Var3 == null || wc6Var4 == null;
        if (z && z2) {
            throw d55.a();
        }
        if (z) {
            wc6Var = new wc6(0.0f, wc6Var3.b);
            wc6Var2 = new wc6(0.0f, wc6Var4.b);
        } else if (z2) {
            int i = k70Var.m;
            wc6Var3 = new wc6(i - 1, wc6Var.b);
            wc6Var4 = new wc6(i - 1, wc6Var2.b);
        }
        this.a = k70Var;
        this.b = wc6Var;
        this.c = wc6Var2;
        this.d = wc6Var3;
        this.e = wc6Var4;
        this.f = (int) Math.min(wc6Var.a, wc6Var2.a);
        this.g = (int) Math.max(wc6Var3.a, wc6Var4.a);
        this.h = (int) Math.min(wc6Var.b, wc6Var3.b);
        this.i = (int) Math.max(wc6Var2.b, wc6Var4.b);
    }

    public la0(la0 la0Var) {
        this.a = la0Var.a;
        this.b = la0Var.b;
        this.c = la0Var.c;
        this.d = la0Var.d;
        this.e = la0Var.e;
        this.f = la0Var.f;
        this.g = la0Var.g;
        this.h = la0Var.h;
        this.i = la0Var.i;
    }
}
