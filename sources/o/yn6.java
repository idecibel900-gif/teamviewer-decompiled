package o;

/* JADX INFO: loaded from: classes2.dex */
public final class yn6 {
    public final Object a;
    public final iw2 b;
    public final iw2 c;
    public final Object d;
    public final og7 e;
    public final iw2 f;
    public Object g;
    public int h = -1;
    public final /* synthetic */ ao6 i;

    public yn6(ao6 ao6Var, Object obj, iw2 iw2Var, iw2 iw2Var2, Object obj2, og7 og7Var, iw2 iw2Var3) {
        this.i = ao6Var;
        this.a = obj;
        this.b = iw2Var;
        this.c = iw2Var2;
        this.d = obj2;
        this.e = og7Var;
        this.f = iw2Var3;
    }

    public final void a() {
        Object obj = this.g;
        if (obj instanceof tn6) {
            ((tn6) obj).h(this.h, this.i.m);
            return;
        }
        t22 t22Var = obj instanceof t22 ? (t22) obj : null;
        if (t22Var != null) {
            t22Var.a();
        }
    }
}
