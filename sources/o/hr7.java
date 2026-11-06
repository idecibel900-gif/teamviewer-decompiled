package o;

/* JADX INFO: loaded from: classes.dex */
public final class hr7 {
    public static final a65 g = vt1.B(new jp6(26), new vs6((byte) 28));
    public final wf5 a;
    public final wf5 b = new wf5(0.0f);
    public final yf5 c = new yf5(0);
    public v56 d = v56.e;
    public long e = gt7.b;
    public final bg5 f;

    public hr7(gb5 gb5Var, float f) {
        this.a = new wf5(f);
        this.f = new bg5(gb5Var, yl7.X);
    }

    public final void a(gb5 gb5Var, v56 v56Var, int i, int i2) {
        float f;
        float f2 = i2 - i;
        this.b.A(f2);
        float f3 = v56Var.a;
        float f4 = v56Var.b;
        v56 v56Var2 = this.d;
        float f5 = v56Var2.a;
        wf5 wf5Var = this.a;
        if (f3 != f5 || f4 != v56Var2.b) {
            boolean z = gb5Var == gb5.m;
            if (z) {
                f3 = f4;
            }
            float f6 = z ? v56Var.d : v56Var.c;
            float fZ = wf5Var.z();
            float f7 = i;
            float f8 = fZ + f7;
            if (f6 <= f8 && (f3 >= fZ || f6 - f3 <= f7)) {
                f = (f3 >= fZ || f6 - f3 > f7) ? 0.0f : f3 - fZ;
            } else {
                f = f6 - f8;
            }
            wf5Var.A(wf5Var.z() + f);
            this.d = v56Var;
        }
        wf5Var.A(ct1.u(wf5Var.z(), 0.0f, f2));
        this.c.A(i);
    }
}
