package o;

/* JADX INFO: loaded from: classes.dex */
public final class r56 implements jv {
    public final jw4 m = new jw4();
    public final zw4 n = new zw4();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f1894o;

    public r56(Object obj) {
        this.f1894o = obj;
    }

    public final void a(l78 l78Var, au2 au2Var) {
        Exception exc;
        jw4 jw4Var = this.m;
        int i = jw4Var.b;
        zw4 zw4Var = new zw4();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            zw4 zw4Var2 = this.n;
            if (i2 >= i) {
                if (i3 != zw4Var2.b) {
                    i01.a("Applier operation size mismatch");
                }
                zw4Var2.d();
                jw4Var.b = 0;
                l78Var.l();
                return;
            }
            int i4 = i2 + 1;
            try {
                try {
                    switch (jw4Var.c(i2)) {
                        case 0:
                            l78Var.i();
                            i2 = i4;
                            break;
                        case 1:
                            int i5 = i3 + 1;
                            l78Var.d(zw4Var2.f(i3));
                            i3 = i5;
                            i2 = i4;
                            break;
                        case 2:
                            int i6 = i2 + 2;
                            i2 += 3;
                            l78Var.g(jw4Var.c(i4), jw4Var.c(i6));
                            break;
                        case 3:
                            int i7 = i2 + 2;
                            try {
                                int i8 = i2 + 3;
                                try {
                                    i2 += 4;
                                    l78Var.f(jw4Var.c(i4), jw4Var.c(i7), jw4Var.c(i8));
                                } catch (Exception e) {
                                    exc = e;
                                    i2 = i8;
                                }
                            } catch (Exception e2) {
                                exc = e2;
                                i2 = i7;
                            }
                            break;
                        case 4:
                            l78Var.a();
                            i2 = i4;
                            break;
                        case 5:
                            i2 += 2;
                            int i9 = i3 + 1;
                            l78Var.c(jw4Var.c(i4), zw4Var2.f(i3));
                            i3 = i9;
                            break;
                        case 6:
                            i2 += 2;
                            try {
                                jw4Var.c(i4);
                                int i10 = i3 + 1;
                                i3 = i10;
                            } catch (Exception e3) {
                                exc = e3;
                            }
                            break;
                        case 7:
                            int i11 = i3 + 1;
                            Object objF = zw4Var2.f(i3);
                            objF.getClass();
                            e8.i(2, objF);
                            i3 += 2;
                            l78Var.o(zw4Var2.f(i11), (hw2) objF);
                            i2 = i4;
                            break;
                        case 8:
                            Object obj = l78Var.f1337o;
                            if (obj instanceof mz0) {
                                mz0 mz0Var = (mz0) obj;
                                if (((xx4) au2Var.g).j(mz0Var)) {
                                    mz0Var.b();
                                }
                            }
                            zw4Var.a(obj);
                            l78Var.e();
                            i2 = i4;
                            break;
                        default:
                            i2 = i4;
                            break;
                    }
                } catch (Exception e4) {
                    exc = e4;
                    i2 = i4;
                }
            } catch (Throwable th) {
                l78Var.l();
                throw th;
            }
            exc = e3;
            throw new oz0(zw4Var2, zw4Var, jw4Var, i2 - 1, exc);
        }
    }

    @Override // o.jv
    public final void c(int i, Object obj) {
        jw4 jw4Var = this.m;
        jw4Var.a(5);
        jw4Var.a(i);
        this.n.a(obj);
    }

    @Override // o.jv
    public final void d(Object obj) {
        this.m.a(1);
        this.n.a(obj);
    }

    @Override // o.jv
    public final void e() {
        this.m.a(8);
    }

    @Override // o.jv
    public final void f(int i, int i2, int i3) {
        jw4 jw4Var = this.m;
        jw4Var.a(3);
        jw4Var.a(i);
        jw4Var.a(i2);
        jw4Var.a(i3);
    }

    @Override // o.jv
    public final void g(int i, int i2) {
        jw4 jw4Var = this.m;
        jw4Var.a(2);
        jw4Var.a(i);
        jw4Var.a(i2);
    }

    @Override // o.jv
    public final void i() {
        this.m.a(0);
    }

    @Override // o.jv
    public final void j(int i, Object obj) {
        jw4 jw4Var = this.m;
        jw4Var.a(6);
        jw4Var.a(i);
        this.n.a(obj);
    }

    @Override // o.jv
    public final Object m() {
        return this.f1894o;
    }

    @Override // o.jv
    public final void o(Object obj, hw2 hw2Var) {
        this.m.a(7);
        zw4 zw4Var = this.n;
        zw4Var.a(hw2Var);
        zw4Var.a(obj);
    }
}
