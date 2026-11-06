package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class qu5 extends oy2 {
    public static final qu5 s;
    public static final ys3 t = new ys3((byte) 5);
    public final zh0 m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1867o;
    public List p;
    public byte q;
    public int r;

    static {
        qu5 qu5Var = new qu5();
        s = qu5Var;
        qu5Var.f1867o = 0;
        qu5Var.p = Collections.EMPTY_LIST;
    }

    public qu5(vu0 vu0Var, dg2 dg2Var) {
        this.q = (byte) -1;
        this.r = -1;
        boolean z = false;
        this.f1867o = 0;
        this.p = Collections.EMPTY_LIST;
        xh0 xh0Var = new xh0();
        cv0 cv0VarR = cv0.r(xh0Var, 1);
        char c = 0;
        while (!z) {
            try {
                try {
                    try {
                        int iM = vu0Var.m();
                        if (iM != 0) {
                            if (iM == 8) {
                                this.n |= 1;
                                this.f1867o = vu0Var.j();
                            } else if (iM == 18) {
                                if ((c & 2) != 2) {
                                    this.p = new ArrayList();
                                    c = 2;
                                }
                                this.p.add(vu0Var.f(ou5.t, dg2Var));
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
                if ((c & 2) == 2) {
                    this.p = Collections.unmodifiableList(this.p);
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
        if ((c & 2) == 2) {
            this.p = Collections.unmodifiableList(this.p);
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
        byte b = this.q;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.n & 1) != 1) {
            this.q = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.p.size(); i++) {
            if (!((ou5) this.p.get(i)).a()) {
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
        int iC = (this.n & 1) == 1 ? cv0.c(1, this.f1867o) : 0;
        for (int i2 = 0; i2 < this.p.size(); i2++) {
            iC += cv0.e(2, (t1) this.p.get(i2));
        }
        int size = this.m.size() + iC;
        this.r = size;
        return size;
    }

    @Override // o.t1
    public final fy2 d() {
        pu5 pu5Var = new pu5((byte) 0);
        pu5Var.p = Collections.EMPTY_LIST;
        return pu5Var;
    }

    @Override // o.t1
    public final fy2 e() {
        pu5 pu5Var = new pu5((byte) 0);
        pu5Var.p = Collections.EMPTY_LIST;
        pu5Var.k(this);
        return pu5Var;
    }

    @Override // o.t1
    public final void f(cv0 cv0Var) throws IOException {
        c();
        if ((this.n & 1) == 1) {
            cv0Var.x(1, this.f1867o);
        }
        for (int i = 0; i < this.p.size(); i++) {
            cv0Var.z(2, (t1) this.p.get(i));
        }
        cv0Var.C(this.m);
    }

    public qu5() {
        this.q = (byte) -1;
        this.r = -1;
        this.m = zh0.m;
    }

    public qu5(pu5 pu5Var) {
        this.q = (byte) -1;
        this.r = -1;
        this.m = pu5Var.m;
    }
}
