package o;

/* JADX INFO: loaded from: classes.dex */
public final class kh4 implements i97 {
    public final bg5 m;
    public final bg5 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final bg5 f1266o;
    public final bg5 p;
    public final bg5 q;
    public final bg5 r;
    public final bg5 s;
    public final eo1 t;
    public final bg5 u;
    public final bg5 v;
    public final bg5 w;
    public final bg5 x;
    public final eo1 y;
    public final iy4 z;

    public kh4() {
        Boolean bool = Boolean.FALSE;
        this.m = h57.p(bool);
        this.n = h57.p(1);
        this.f1266o = h57.p(1);
        this.p = h57.p(bool);
        this.q = h57.p(null);
        this.r = h57.p(Float.valueOf(1.0f));
        this.s = h57.p(bool);
        this.t = d57.b(new ih4(this, (byte) 1));
        this.u = h57.p(null);
        Float fValueOf = Float.valueOf(0.0f);
        this.v = h57.p(fValueOf);
        this.w = h57.p(fValueOf);
        this.x = h57.p(Long.MIN_VALUE);
        this.y = d57.b(new ih4(this, (byte) 0));
        d57.b(new ih4(this, (byte) 2));
        this.z = new iy4();
    }

    public final int a() {
        return ((Number) this.n.getValue()).intValue();
    }

    public final boolean b(int i, long j) {
        qh4 qh4Var = (qh4) this.u.getValue();
        if (qh4Var == null) {
            return true;
        }
        bg5 bg5Var = this.x;
        long jLongValue = ((Number) bg5Var.getValue()).longValue() == Long.MIN_VALUE ? 0L : j - ((Number) bg5Var.getValue()).longValue();
        bg5Var.setValue(Long.valueOf(j));
        bg5 bg5Var2 = this.q;
        if (bg5Var2.getValue() != null) {
            io.sentry.h2.f();
            return false;
        }
        if (bg5Var2.getValue() != null) {
            io.sentry.h2.f();
            return false;
        }
        float fB = (jLongValue / 1000000) / qh4Var.b();
        eo1 eo1Var = this.t;
        float fFloatValue = ((Number) eo1Var.getValue()).floatValue() * fB;
        float fFloatValue2 = ((Number) eo1Var.getValue()).floatValue();
        bg5 bg5Var3 = this.v;
        float fFloatValue3 = fFloatValue2 < 0.0f ? 0.0f - (((Number) bg5Var3.getValue()).floatValue() + fFloatValue) : (((Number) bg5Var3.getValue()).floatValue() + fFloatValue) - 1.0f;
        if (fFloatValue3 < 0.0f) {
            g(ct1.u(((Number) bg5Var3.getValue()).floatValue(), 0.0f, 1.0f) + fFloatValue);
            return true;
        }
        int i2 = (int) (fFloatValue3 / 1.0f);
        int i3 = i2 + 1;
        if (a() + i3 > i) {
            g(((Number) this.y.getValue()).floatValue());
            d(i);
            return false;
        }
        d(a() + i3);
        float f = fFloatValue3 - (i2 * 1.0f);
        g(((Number) eo1Var.getValue()).floatValue() < 0.0f ? 1.0f - f : 0.0f + f);
        return true;
    }

    public final void d(int i) {
        this.n.setValue(Integer.valueOf(i));
    }

    public final void f(boolean z) {
        this.m.setValue(Boolean.valueOf(z));
    }

    public final void g(float f) {
        qh4 qh4Var;
        this.v.setValue(Float.valueOf(f));
        if (((Boolean) this.s.getValue()).booleanValue() && (qh4Var = (qh4) this.u.getValue()) != null) {
            f -= f % (1.0f / qh4Var.n);
        }
        this.w.setValue(Float.valueOf(f));
    }

    @Override // o.i97
    public final Object getValue() {
        return Float.valueOf(((Number) this.w.getValue()).floatValue());
    }
}
