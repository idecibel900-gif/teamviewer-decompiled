package o;

/* JADX INFO: loaded from: classes.dex */
public final class jv8 implements qv8 {
    public final iu8 a;

    public jv8(rk5 rk5Var, iu8 iu8Var) {
        this.a = iu8Var;
    }

    @Override // o.qv8
    public final void a(Object obj) {
        tv8 tv8Var = ((vu8) obj).zzc;
        if (tv8Var.e) {
            tv8Var.e = false;
        }
        throw ua5.i(obj);
    }

    @Override // o.qv8
    public final boolean b(vu8 vu8Var, vu8 vu8Var2) {
        return vu8Var.zzc.equals(vu8Var2.zzc);
    }

    @Override // o.qv8
    public final int c(vu8 vu8Var) {
        return vu8Var.zzc.hashCode();
    }

    @Override // o.qv8
    public final boolean d(Object obj) {
        throw ua5.i(obj);
    }

    @Override // o.qv8
    public final int e(iu8 iu8Var) {
        tv8 tv8Var = ((vu8) iu8Var).zzc;
        int i = tv8Var.d;
        if (i != -1) {
            return i;
        }
        int iC = 0;
        for (int i2 = 0; i2 < tv8Var.a; i2++) {
            int i3 = tv8Var.b[i2] >>> 3;
            mu8 mu8Var = (mu8) tv8Var.c[i2];
            int iW = cv0.W(8);
            int iW2 = cv0.W(i3) + cv0.W(16);
            int iW3 = cv0.W(24);
            int iC2 = mu8Var.c();
            iC += iW + iW + iW2 + to7.c(iC2, iC2, iW3);
        }
        tv8Var.d = iC;
        return iC;
    }

    @Override // o.qv8
    public final void f(Object obj, Object obj2) {
        rv8.o(obj, obj2);
    }

    @Override // o.qv8
    public final vu8 g() {
        iu8 iu8Var = this.a;
        if (iu8Var instanceof vu8) {
            return (vu8) ((vu8) iu8Var).j(4);
        }
        uu8 uu8Var = (uu8) ((vu8) iu8Var).j(5);
        boolean zH = uu8Var.n.h();
        vu8 vu8Var = uu8Var.n;
        if (!zH) {
            return vu8Var;
        }
        vu8Var.getClass();
        kv8.b.a(vu8Var.getClass()).a(vu8Var);
        vu8Var.e();
        return uu8Var.n;
    }

    @Override // o.qv8
    public final void h(Object obj, byte[] bArr, int i, int i2, lp2 lp2Var) {
        vu8 vu8Var = (vu8) obj;
        if (vu8Var.zzc == tv8.f) {
            vu8Var.zzc = tv8.b();
        }
        throw ua5.i(obj);
    }

    @Override // o.qv8
    public final void i(Object obj, hj8 hj8Var) {
        throw ua5.i(obj);
    }
}
