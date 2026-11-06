package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class fw5 extends ky2 {
    public static final fw5 y;
    public static final ys3 z = new ys3((byte) 24);
    public final zh0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f835o;
    public int p;
    public int q;
    public boolean r;
    public ew5 s;
    public List t;
    public List u;
    public int v;
    public byte w;
    public int x;

    static {
        fw5 fw5Var = new fw5();
        y = fw5Var;
        fw5Var.p = 0;
        fw5Var.q = 0;
        fw5Var.r = false;
        fw5Var.s = ew5.INV;
        List list = Collections.EMPTY_LIST;
        fw5Var.t = list;
        fw5Var.u = list;
    }

    public fw5(vu0 vu0Var, dg2 dg2Var) {
        this.v = -1;
        this.w = (byte) -1;
        this.x = -1;
        this.p = 0;
        this.q = 0;
        this.r = false;
        ew5 ew5Var = ew5.INV;
        this.s = ew5Var;
        List list = Collections.EMPTY_LIST;
        this.t = list;
        this.u = list;
        xh0 xh0Var = new xh0();
        cv0 cv0VarR = cv0.r(xh0Var, 1);
        boolean z2 = false;
        int i = 0;
        while (!z2) {
            try {
                try {
                    int iM = vu0Var.m();
                    if (iM != 0) {
                        if (iM == 8) {
                            this.f835o |= 1;
                            this.p = vu0Var.j();
                        } else if (iM == 16) {
                            this.f835o |= 2;
                            this.q = vu0Var.j();
                        } else if (iM == 24) {
                            this.f835o |= 4;
                            this.r = vu0Var.k() != 0;
                        } else if (iM == 32) {
                            int iJ = vu0Var.j();
                            ew5 ew5Var2 = iJ != 0 ? iJ != 1 ? iJ != 2 ? null : ew5Var : ew5.OUT : ew5.IN;
                            if (ew5Var2 == null) {
                                cv0VarR.G(iM);
                                cv0VarR.G(iJ);
                            } else {
                                this.f835o |= 8;
                                this.s = ew5Var2;
                            }
                        } else if (iM == 42) {
                            if ((i & 16) != 16) {
                                this.t = new ArrayList();
                                i |= 16;
                            }
                            this.t.add(vu0Var.f(aw5.G, dg2Var));
                        } else if (iM == 48) {
                            if ((i & 32) != 32) {
                                this.u = new ArrayList();
                                i |= 32;
                            }
                            this.u.add(Integer.valueOf(vu0Var.j()));
                        } else if (iM == 50) {
                            int iD = vu0Var.d(vu0Var.j());
                            if ((i & 32) != 32 && vu0Var.b() > 0) {
                                this.u = new ArrayList();
                                i |= 32;
                            }
                            while (vu0Var.b() > 0) {
                                this.u.add(Integer.valueOf(vu0Var.j()));
                            }
                            vu0Var.c(iD);
                        } else if (!n(vu0Var, cv0VarR, dg2Var, iM)) {
                        }
                    }
                    z2 = true;
                } catch (Throwable th) {
                    if ((i & 16) == 16) {
                        this.t = Collections.unmodifiableList(this.t);
                    }
                    if ((i & 32) == 32) {
                        this.u = Collections.unmodifiableList(this.u);
                    }
                    try {
                        cv0VarR.u();
                    } catch (IOException unused) {
                    } finally {
                        this.n = xh0Var.q();
                    }
                    m();
                    throw th;
                }
            } catch (rm3 e) {
                e.m = this;
                throw e;
            } catch (IOException e2) {
                rm3 rm3Var = new rm3(e2.getMessage());
                rm3Var.m = this;
                throw rm3Var;
            }
        }
        if ((i & 16) == 16) {
            this.t = Collections.unmodifiableList(this.t);
        }
        if ((i & 32) == 32) {
            this.u = Collections.unmodifiableList(this.u);
        }
        try {
            cv0VarR.u();
        } catch (IOException unused2) {
        } finally {
            this.n = xh0Var.q();
        }
        m();
    }

    @Override // o.rq4
    public final boolean a() {
        byte b = this.w;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.f835o;
        if ((i & 1) != 1) {
            this.w = (byte) 0;
            return false;
        }
        if ((i & 2) != 2) {
            this.w = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.t.size(); i2++) {
            if (!((aw5) this.t.get(i2)).a()) {
                this.w = (byte) 0;
                return false;
            }
        }
        if (i()) {
            this.w = (byte) 1;
            return true;
        }
        this.w = (byte) 0;
        return false;
    }

    @Override // o.rq4
    public final t1 b() {
        return y;
    }

    @Override // o.t1
    public final int c() {
        List list;
        int i = this.x;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int iC = (this.f835o & 1) == 1 ? cv0.c(1, this.p) : 0;
        if ((this.f835o & 2) == 2) {
            iC += cv0.c(2, this.q);
        }
        if ((this.f835o & 4) == 4) {
            iC += cv0.i(3) + 1;
        }
        if ((this.f835o & 8) == 8) {
            iC += cv0.b(4, this.s.m);
        }
        for (int i3 = 0; i3 < this.t.size(); i3++) {
            iC += cv0.e(5, (t1) this.t.get(i3));
        }
        int iD = 0;
        while (true) {
            int size = this.u.size();
            list = this.u;
            if (i2 >= size) {
                break;
            }
            iD += cv0.d(((Integer) list.get(i2)).intValue());
            i2++;
        }
        int iD2 = iC + iD;
        if (!list.isEmpty()) {
            iD2 = iD2 + 1 + cv0.d(iD);
        }
        this.v = iD;
        int size2 = this.n.size() + j() + iD2;
        this.x = size2;
        return size2;
    }

    @Override // o.t1
    public final fy2 d() {
        dw5 dw5Var = new dw5();
        dw5Var.t = ew5.INV;
        List list = Collections.EMPTY_LIST;
        dw5Var.u = list;
        dw5Var.v = list;
        return dw5Var;
    }

    @Override // o.t1
    public final fy2 e() {
        dw5 dw5Var = new dw5();
        dw5Var.t = ew5.INV;
        List list = Collections.EMPTY_LIST;
        dw5Var.u = list;
        dw5Var.v = list;
        dw5Var.i(this);
        return dw5Var;
    }

    @Override // o.t1
    public final void f(cv0 cv0Var) throws IOException {
        c();
        yt2 yt2Var = new yt2(this);
        if ((this.f835o & 1) == 1) {
            cv0Var.x(1, this.p);
        }
        if ((this.f835o & 2) == 2) {
            cv0Var.x(2, this.q);
        }
        if ((this.f835o & 4) == 4) {
            boolean z2 = this.r;
            cv0Var.I(3, 0);
            cv0Var.B(z2 ? 1 : 0);
        }
        if ((this.f835o & 8) == 8) {
            cv0Var.w(4, this.s.m);
        }
        for (int i = 0; i < this.t.size(); i++) {
            cv0Var.z(5, (t1) this.t.get(i));
        }
        if (this.u.size() > 0) {
            cv0Var.G(50);
            cv0Var.G(this.v);
        }
        for (int i2 = 0; i2 < this.u.size(); i2++) {
            cv0Var.y(((Integer) this.u.get(i2)).intValue());
        }
        yt2Var.P(1000, cv0Var);
        cv0Var.C(this.n);
    }

    public fw5() {
        this.v = -1;
        this.w = (byte) -1;
        this.x = -1;
        this.n = zh0.m;
    }

    public fw5(dw5 dw5Var) {
        super(dw5Var);
        this.v = -1;
        this.w = (byte) -1;
        this.x = -1;
        this.n = dw5Var.m;
    }
}
