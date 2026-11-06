package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class gw5 extends oy2 {
    public static final gw5 s;
    public static final ys3 t = new ys3((byte) 25);
    public final zh0 m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f929o;
    public int p;
    public byte q;
    public int r;

    static {
        gw5 gw5Var = new gw5();
        s = gw5Var;
        gw5Var.f929o = Collections.EMPTY_LIST;
        gw5Var.p = -1;
    }

    public gw5(vu0 vu0Var, dg2 dg2Var) {
        this.q = (byte) -1;
        this.r = -1;
        this.f929o = Collections.EMPTY_LIST;
        this.p = -1;
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
                                if (!z2) {
                                    this.f929o = new ArrayList();
                                    z2 = true;
                                }
                                this.f929o.add(vu0Var.f(aw5.G, dg2Var));
                            } else if (iM == 16) {
                                this.n |= 1;
                                this.p = vu0Var.j();
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
                    this.f929o = Collections.unmodifiableList(this.f929o);
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
            this.f929o = Collections.unmodifiableList(this.f929o);
        }
        try {
            cv0VarR.u();
        } catch (IOException unused2) {
        } finally {
            this.m = xh0Var.q();
        }
    }

    public static pu5 i(gw5 gw5Var) {
        pu5 pu5Var = new pu5((byte) 1);
        pu5Var.p = Collections.EMPTY_LIST;
        pu5Var.q = -1;
        pu5Var.l(gw5Var);
        return pu5Var;
    }

    @Override // o.rq4
    public final boolean a() {
        byte b = this.q;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f929o.size(); i++) {
            if (!((aw5) this.f929o.get(i)).a()) {
                this.q = (byte) 0;
                return false;
            }
        }
        this.q = (byte) 1;
        return true;
    }

    @Override // o.t1
    public final int c() {
        int i = this.r;
        if (i != -1) {
            return i;
        }
        int iC = 0;
        for (int i2 = 0; i2 < this.f929o.size(); i2++) {
            iC += cv0.e(1, (t1) this.f929o.get(i2));
        }
        if ((this.n & 1) == 1) {
            iC += cv0.c(2, this.p);
        }
        int size = this.m.size() + iC;
        this.r = size;
        return size;
    }

    @Override // o.t1
    public final fy2 d() {
        pu5 pu5Var = new pu5((byte) 1);
        pu5Var.p = Collections.EMPTY_LIST;
        pu5Var.q = -1;
        return pu5Var;
    }

    @Override // o.t1
    public final fy2 e() {
        return i(this);
    }

    @Override // o.t1
    public final void f(cv0 cv0Var) throws IOException {
        c();
        for (int i = 0; i < this.f929o.size(); i++) {
            cv0Var.z(1, (t1) this.f929o.get(i));
        }
        if ((this.n & 1) == 1) {
            cv0Var.x(2, this.p);
        }
        cv0Var.C(this.m);
    }

    public gw5() {
        this.q = (byte) -1;
        this.r = -1;
        this.m = zh0.m;
    }

    public gw5(pu5 pu5Var) {
        this.q = (byte) -1;
        this.r = -1;
        this.m = pu5Var.m;
    }
}
