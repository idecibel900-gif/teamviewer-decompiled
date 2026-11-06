package o;

/* JADX INFO: loaded from: classes.dex */
public final class dy6 {
    public final bg5 a;
    public final bg5 b;
    public final cg3 c;
    public final long d;
    public long e;
    public float f;
    public float g;
    public long h;
    public long i;
    public pc8 j;

    public dy6() {
        Boolean bool = Boolean.FALSE;
        this.a = h57.p(bool);
        this.b = h57.p(bool);
        this.c = new cg3();
        this.d = jt4.a();
        this.e = rv0.g;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = d18.b;
        this.i = 0L;
    }

    public final boolean a() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) this.a.getValue()).booleanValue();
    }

    public final void c(boolean z) {
        bg5 bg5Var = this.a;
        boolean zBooleanValue = ((Boolean) bg5Var.getValue()).booleanValue();
        bg5 bg5Var2 = this.b;
        if (zBooleanValue && !z) {
            bg5Var2.setValue(Boolean.TRUE);
        } else if (z) {
            bg5Var2.setValue(Boolean.FALSE);
        }
        bg5Var.setValue(Boolean.valueOf(z));
    }
}
