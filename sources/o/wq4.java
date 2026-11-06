package o;

/* JADX INFO: loaded from: classes.dex */
public final class wq4 implements bj6 {
    public final s1 a;
    public final i88 b;
    public final fg2 c;

    public wq4(i88 i88Var, fg2 fg2Var, s1 s1Var) {
        this.b = i88Var;
        fg2Var.getClass();
        this.c = fg2Var;
        this.a = s1Var;
    }

    @Override // o.bj6
    public final void a(Object obj) {
        ((m88) this.b).getClass();
        ((ny2) obj).unknownFields.e = false;
        this.c.getClass();
        ua5.u(obj);
        throw null;
    }

    @Override // o.bj6
    public final boolean b(Object obj) {
        this.c.getClass();
        ua5.u(obj);
        throw null;
    }

    @Override // o.bj6
    public final Object c() {
        return ((ey2) ((ny2) this.a).f(5)).b();
    }

    @Override // o.bj6
    public final void d(Object obj, byte[] bArr, int i, int i2, jw jwVar) {
        ny2 ny2Var = (ny2) obj;
        if (ny2Var.unknownFields == k88.f) {
            ny2Var.unknownFields = k88.b();
        }
        throw ua5.i(obj);
    }

    @Override // o.bj6
    public final void e(Object obj, df6 df6Var) {
        this.c.getClass();
        ua5.u(obj);
        throw null;
    }

    @Override // o.bj6
    public final boolean f(ny2 ny2Var, ny2 ny2Var2) {
        m88 m88Var = (m88) this.b;
        m88Var.getClass();
        k88 k88Var = ny2Var.unknownFields;
        m88Var.getClass();
        return k88Var.equals(ny2Var2.unknownFields);
    }

    @Override // o.bj6
    public final void g(Object obj, o36 o36Var, cg2 cg2Var) {
        ((m88) this.b).getClass();
        ny2 ny2Var = (ny2) obj;
        if (ny2Var.unknownFields == k88.f) {
            ny2Var.unknownFields = k88.b();
        }
        this.c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // o.bj6
    public final int h(s1 s1Var) {
        ((m88) this.b).getClass();
        k88 k88Var = ((ny2) s1Var).unknownFields;
        int i = k88Var.d;
        if (i != -1) {
            return i;
        }
        int iA = 0;
        for (int i2 = 0; i2 < k88Var.a; i2++) {
            int i3 = k88Var.b[i2] >>> 3;
            iA += yu0.a(3, (yh0) k88Var.c[i2]) + yu0.i(i3) + yu0.h(2) + (yu0.h(1) * 2);
        }
        k88Var.d = iA;
        return iA;
    }

    @Override // o.bj6
    public final int i(ny2 ny2Var) {
        ((m88) this.b).getClass();
        return ny2Var.unknownFields.hashCode();
    }

    @Override // o.bj6
    public final void j(ny2 ny2Var, ny2 ny2Var2) {
        gj6.w(this.b, ny2Var, ny2Var2);
    }
}
