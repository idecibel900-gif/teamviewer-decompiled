package o;

/* JADX INFO: loaded from: classes.dex */
public final class xq4 implements cj6 {
    public final u1 a;
    public final j88 b;
    public final gg2 c;

    public xq4(j88 j88Var, gg2 gg2Var, u1 u1Var) {
        this.b = j88Var;
        gg2Var.getClass();
        this.c = gg2Var;
        this.a = u1Var;
    }

    @Override // o.cj6
    public final void a(Object obj) {
        ((n88) this.b).getClass();
        l88 l88Var = ((py2) obj).unknownFields;
        if (l88Var.e) {
            l88Var.e = false;
        }
        this.c.getClass();
        ua5.u(obj);
        throw null;
    }

    @Override // o.cj6
    public final boolean b(Object obj) {
        this.c.getClass();
        ua5.u(obj);
        throw null;
    }

    @Override // o.cj6
    public final py2 c() {
        u1 u1Var = this.a;
        return u1Var instanceof py2 ? ((py2) u1Var).i() : ((gy2) ((py2) u1Var).c(5)).b();
    }

    @Override // o.cj6
    public final void d(Object obj, Object obj2) {
        hj6.k(this.b, obj, obj2);
    }

    @Override // o.cj6
    public final boolean e(py2 py2Var, py2 py2Var2) {
        n88 n88Var = (n88) this.b;
        n88Var.getClass();
        l88 l88Var = py2Var.unknownFields;
        n88Var.getClass();
        return l88Var.equals(py2Var2.unknownFields);
    }

    @Override // o.cj6
    public final void f(Object obj, xc0 xc0Var) {
        this.c.getClass();
        ua5.u(obj);
        throw null;
    }

    @Override // o.cj6
    public final void g(Object obj, xu0 xu0Var, eg2 eg2Var) {
        this.b.a(obj);
        this.c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // o.cj6
    public final int h(py2 py2Var) {
        ((n88) this.b).getClass();
        l88 l88Var = py2Var.unknownFields;
        int i = l88Var.d;
        if (i != -1) {
            return i;
        }
        int iF = 0;
        for (int i2 = 0; i2 < l88Var.a; i2++) {
            int i3 = l88Var.b[i2] >>> 3;
            iF += bv0.f(3, (wh0) l88Var.c[i2]) + bv0.i(i3) + bv0.h(2) + (bv0.h(1) * 2);
        }
        l88Var.d = iF;
        return iF;
    }

    @Override // o.cj6
    public final int i(py2 py2Var) {
        ((n88) this.b).getClass();
        return py2Var.unknownFields.hashCode();
    }
}
