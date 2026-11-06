package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class vv5 extends oy2 {
    public static final vv5 q;
    public static final ys3 r = new ys3((byte) 20);
    public final zh0 m;
    public i54 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte f2352o;
    public int p;

    static {
        vv5 vv5Var = new vv5();
        q = vv5Var;
        vv5Var.n = f54.n;
    }

    public vv5(vu0 vu0Var) {
        this.f2352o = (byte) -1;
        this.p = -1;
        this.n = f54.n;
        xh0 xh0Var = new xh0();
        cv0 cv0VarR = cv0.r(xh0Var, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    try {
                        int iM = vu0Var.m();
                        if (iM != 0) {
                            if (iM == 10) {
                                pc4 pc4VarE = vu0Var.e();
                                if (!z2) {
                                    this.n = new f54();
                                    z2 = true;
                                }
                                this.n.c0(pc4VarE);
                            } else if (!vu0Var.p(iM, cv0VarR)) {
                            }
                        }
                        z = true;
                    } catch (IOException e) {
                        rm3 rm3Var = new rm3(e.getMessage());
                        rm3Var.m = this;
                        throw rm3Var;
                    }
                } catch (rm3 e2) {
                    e2.m = this;
                    throw e2;
                }
            } catch (Throwable th) {
                if (z2) {
                    this.n = this.n.j();
                }
                try {
                    cv0VarR.u();
                } catch (IOException unused) {
                } finally {
                    this.m = xh0Var.q();
                }
                throw th;
            }
        }
        if (z2) {
            this.n = this.n.j();
        }
        try {
            cv0VarR.u();
        } catch (IOException unused2) {
        } finally {
            this.m = xh0Var.q();
        }
    }

    @Override // o.rq4
    public final boolean a() {
        byte b = this.f2352o;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f2352o = (byte) 1;
        return true;
    }

    @Override // o.t1
    public final int c() {
        int i = this.p;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int size = 0;
        while (true) {
            int size2 = this.n.size();
            i54 i54Var = this.n;
            if (i2 >= size2) {
                int size3 = this.m.size() + i54Var.size() + size;
                this.p = size3;
                return size3;
            }
            zh0 zh0VarJ = i54Var.J(i2);
            size += zh0VarJ.size() + cv0.g(zh0VarJ.size());
            i2++;
        }
    }

    @Override // o.t1
    public final fy2 d() {
        wu5 wu5Var = new wu5((byte) 3);
        wu5Var.p = f54.n;
        return wu5Var;
    }

    @Override // o.t1
    public final fy2 e() {
        wu5 wu5Var = new wu5((byte) 3);
        wu5Var.p = f54.n;
        wu5Var.m(this);
        return wu5Var;
    }

    @Override // o.t1
    public final void f(cv0 cv0Var) throws IOException {
        c();
        for (int i = 0; i < this.n.size(); i++) {
            zh0 zh0VarJ = this.n.J(i);
            cv0Var.I(1, 2);
            cv0Var.G(zh0VarJ.size());
            cv0Var.C(zh0VarJ);
        }
        cv0Var.C(this.m);
    }

    public vv5() {
        this.f2352o = (byte) -1;
        this.p = -1;
        this.m = zh0.m;
    }

    public vv5(wu5 wu5Var) {
        this.f2352o = (byte) -1;
        this.p = -1;
        this.m = wu5Var.m;
    }
}
