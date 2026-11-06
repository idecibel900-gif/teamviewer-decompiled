package o;

/* JADX INFO: loaded from: classes.dex */
public final class i34 {
    public final me1 a;
    public final k03 b;
    public final vm3 c;
    public rl2 d;
    public rl2 e;
    public rl2 f;
    public boolean g;
    public final bg5 h;
    public final bg5 i;
    public final bg5 j;
    public final bg5 k;
    public long l;
    public long m;
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public l03 f1031o;
    public final km p;
    public final km q;
    public final bg5 r;

    public i34(me1 me1Var, k03 k03Var, vm3 vm3Var) {
        this.a = me1Var;
        this.b = k03Var;
        this.c = vm3Var;
        Boolean bool = Boolean.FALSE;
        this.h = h57.p(bool);
        this.i = h57.p(bool);
        this.j = h57.p(bool);
        this.k = h57.p(bool);
        this.l = 9223372034707292159L;
        this.m = 0L;
        this.n = 9223372034707292159L;
        Object obj = null;
        this.f1031o = k03Var != null ? k03Var.c() : null;
        int i = 12;
        this.p = new km(new vk3(0L), vn4.p0, obj, i);
        this.q = new km(Float.valueOf(1.0f), vn4.j0, obj, i);
        this.r = h57.p(new vk3(0L));
    }

    public final void a() {
        l03 l03Var = this.f1031o;
        rl2 rl2Var = this.d;
        bg5 bg5Var = this.i;
        boolean zBooleanValue = ((Boolean) bg5Var.getValue()).booleanValue();
        me1 me1Var = this.a;
        hc1 hc1Var = null;
        if (zBooleanValue || rl2Var == null || l03Var == null) {
            if (b()) {
                if (l03Var != null) {
                    l03Var.f(1.0f);
                }
                im3.R(me1Var, null, null, new f34(this, hc1Var, (byte) 0), 3);
                return;
            }
            return;
        }
        bg5Var.setValue(Boolean.TRUE);
        boolean zB = b();
        boolean z = !zB;
        if (!zB) {
            l03Var.f(0.0f);
        }
        im3.R(me1Var, null, null, new h34(z, this, rl2Var, l03Var, null), 3);
    }

    public final boolean b() {
        return ((Boolean) this.j.getValue()).booleanValue();
    }

    public final void c() {
        k03 k03Var;
        bg5 bg5Var = this.h;
        boolean zBooleanValue = ((Boolean) bg5Var.getValue()).booleanValue();
        byte b = 3;
        me1 me1Var = this.a;
        hc1 hc1Var = null;
        if (zBooleanValue) {
            bg5Var.setValue(Boolean.FALSE);
            im3.R(me1Var, null, null, new f34(this, hc1Var, (byte) 2), 3);
        }
        bg5 bg5Var2 = this.i;
        if (((Boolean) bg5Var2.getValue()).booleanValue()) {
            bg5Var2.setValue(Boolean.FALSE);
            im3.R(me1Var, null, null, new f34(this, hc1Var, b), 3);
        }
        if (b()) {
            this.j.setValue(Boolean.FALSE);
            im3.R(me1Var, null, null, new f34(this, hc1Var, (byte) 4), 3);
        }
        this.g = false;
        d(0L);
        this.l = 9223372034707292159L;
        l03 l03Var = this.f1031o;
        if (l03Var != null && (k03Var = this.b) != null) {
            k03Var.a(l03Var);
        }
        this.f1031o = null;
        this.d = null;
        this.f = null;
        this.e = null;
    }

    public final void d(long j) {
        this.r.setValue(new vk3(j));
    }
}
