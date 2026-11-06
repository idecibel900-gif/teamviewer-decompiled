package o;

/* JADX INFO: loaded from: classes.dex */
public final class z35 {
    public es4 a;
    public int b;
    public zw4 c;
    public zw4 d;
    public boolean e;
    public final /* synthetic */ nf f;

    public z35(nf nfVar, es4 es4Var, int i, zw4 zw4Var, zw4 zw4Var2, boolean z) {
        this.f = nfVar;
        this.a = es4Var;
        this.b = i;
        this.c = zw4Var;
        this.d = zw4Var2;
        this.e = z;
    }

    public final boolean a(int i, int i2) {
        ds4 ds4Var = (ds4) this.c.f(this.b + i);
        ds4 ds4Var2 = (ds4) this.d.f(this.b + i2);
        return im3.n(ds4Var, ds4Var2) || ds4Var.getClass() == ds4Var2.getClass();
    }
}
