package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class gv5 extends oy2 {
    public static final gv5 x;
    public static final ys3 y = new ys3((byte) 13);
    public final zh0 m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f927o;
    public int p;
    public fv5 q;
    public aw5 r;
    public int s;
    public List t;
    public List u;
    public byte v;
    public int w;

    static {
        gv5 gv5Var = new gv5();
        x = gv5Var;
        gv5Var.f927o = 0;
        gv5Var.p = 0;
        gv5Var.q = fv5.TRUE;
        gv5Var.r = aw5.F;
        gv5Var.s = 0;
        List list = Collections.EMPTY_LIST;
        gv5Var.t = list;
        gv5Var.u = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public gv5(vu0 vu0Var, dg2 dg2Var) {
        fv5 fv5Var;
        this.v = (byte) -1;
        this.w = -1;
        boolean z = false;
        this.f927o = 0;
        this.p = 0;
        fv5 fv5Var2 = fv5.TRUE;
        this.q = fv5Var2;
        this.r = aw5.F;
        this.s = 0;
        List list = Collections.EMPTY_LIST;
        this.t = list;
        this.u = list;
        xh0 xh0Var = new xh0();
        cv0 cv0VarR = cv0.r(xh0Var, 1);
        int i = 0;
        while (!z) {
            try {
                try {
                    try {
                        int iM = vu0Var.m();
                        if (iM != 0) {
                            if (iM == 8) {
                                this.n |= 1;
                                this.f927o = vu0Var.j();
                            } else if (iM != 16) {
                                Object objQ = null;
                                if (iM == 24) {
                                    int iJ = vu0Var.j();
                                    if (iJ != 0) {
                                        if (iJ == 1) {
                                            objQ = fv5.FALSE;
                                        } else if (iJ == 2) {
                                            objQ = fv5.NULL;
                                        }
                                        fv5Var = objQ;
                                    } else {
                                        fv5Var = fv5Var2;
                                    }
                                    if (fv5Var == 0) {
                                        cv0VarR.G(iM);
                                        cv0VarR.G(iJ);
                                    } else {
                                        this.n |= 4;
                                        this.q = fv5Var;
                                    }
                                } else if (iM == 34) {
                                    if ((this.n & 8) == 8) {
                                        aw5 aw5Var = this.r;
                                        aw5Var.getClass();
                                        objQ = aw5.q(aw5Var);
                                    }
                                    zv5 zv5Var = objQ;
                                    aw5 aw5Var2 = (aw5) vu0Var.f(aw5.G, dg2Var);
                                    this.r = aw5Var2;
                                    if (zv5Var != 0) {
                                        zv5Var.j(aw5Var2);
                                        this.r = zv5Var.h();
                                    }
                                    this.n |= 8;
                                } else if (iM != 40) {
                                    ys3 ys3Var = y;
                                    if (iM == 50) {
                                        if ((i & 32) != 32) {
                                            this.t = new ArrayList();
                                            i |= 32;
                                        }
                                        this.t.add(vu0Var.f(ys3Var, dg2Var));
                                    } else if (iM == 58) {
                                        if ((i & 64) != 64) {
                                            this.u = new ArrayList();
                                            i |= 64;
                                        }
                                        this.u.add(vu0Var.f(ys3Var, dg2Var));
                                    } else if (!vu0Var.p(iM, cv0VarR)) {
                                    }
                                } else {
                                    this.n |= 16;
                                    this.s = vu0Var.j();
                                }
                            } else {
                                this.n |= 2;
                                this.p = vu0Var.j();
                            }
                        }
                        z = true;
                    } catch (rm3 e) {
                        e.m = this;
                        throw e;
                    }
                } catch (IOException e2) {
                    rm3 rm3Var = new rm3(e2.getMessage());
                    rm3Var.m = this;
                    throw rm3Var;
                }
            } catch (Throwable th) {
                if ((i & 32) == 32) {
                    this.t = Collections.unmodifiableList(this.t);
                }
                if ((i & 64) == 64) {
                    this.u = Collections.unmodifiableList(this.u);
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
        if ((i & 32) == 32) {
            this.t = Collections.unmodifiableList(this.t);
        }
        if ((i & 64) == 64) {
            this.u = Collections.unmodifiableList(this.u);
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
        byte b = this.v;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.n & 8) == 8 && !this.r.a()) {
            this.v = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.t.size(); i++) {
            if (!((gv5) this.t.get(i)).a()) {
                this.v = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.u.size(); i2++) {
            if (!((gv5) this.u.get(i2)).a()) {
                this.v = (byte) 0;
                return false;
            }
        }
        this.v = (byte) 1;
        return true;
    }

    @Override // o.t1
    public final int c() {
        int i = this.w;
        if (i != -1) {
            return i;
        }
        int iC = (this.n & 1) == 1 ? cv0.c(1, this.f927o) : 0;
        if ((this.n & 2) == 2) {
            iC += cv0.c(2, this.p);
        }
        if ((this.n & 4) == 4) {
            iC += cv0.b(3, this.q.m);
        }
        if ((this.n & 8) == 8) {
            iC += cv0.e(4, this.r);
        }
        if ((this.n & 16) == 16) {
            iC += cv0.c(5, this.s);
        }
        for (int i2 = 0; i2 < this.t.size(); i2++) {
            iC += cv0.e(6, (t1) this.t.get(i2));
        }
        for (int i3 = 0; i3 < this.u.size(); i3++) {
            iC += cv0.e(7, (t1) this.u.get(i3));
        }
        int size = this.m.size() + iC;
        this.w = size;
        return size;
    }

    @Override // o.t1
    public final fy2 d() {
        return ev5.h();
    }

    @Override // o.t1
    public final fy2 e() {
        ev5 ev5VarH = ev5.h();
        ev5VarH.i(this);
        return ev5VarH;
    }

    @Override // o.t1
    public final void f(cv0 cv0Var) throws IOException {
        c();
        if ((this.n & 1) == 1) {
            cv0Var.x(1, this.f927o);
        }
        if ((this.n & 2) == 2) {
            cv0Var.x(2, this.p);
        }
        if ((this.n & 4) == 4) {
            cv0Var.w(3, this.q.m);
        }
        if ((this.n & 8) == 8) {
            cv0Var.z(4, this.r);
        }
        if ((this.n & 16) == 16) {
            cv0Var.x(5, this.s);
        }
        for (int i = 0; i < this.t.size(); i++) {
            cv0Var.z(6, (t1) this.t.get(i));
        }
        for (int i2 = 0; i2 < this.u.size(); i2++) {
            cv0Var.z(7, (t1) this.u.get(i2));
        }
        cv0Var.C(this.m);
    }

    public gv5() {
        this.v = (byte) -1;
        this.w = -1;
        this.m = zh0.m;
    }

    public gv5(ev5 ev5Var) {
        this.v = (byte) -1;
        this.w = -1;
        this.m = ev5Var.m;
    }
}
