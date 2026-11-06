package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class vu5 extends ky2 {
    public static final vu5 u;
    public static final ys3 v = new ys3((byte) 9);
    public final zh0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2348o;
    public int p;
    public List q;
    public List r;
    public byte s;
    public int t;

    static {
        vu5 vu5Var = new vu5();
        u = vu5Var;
        vu5Var.p = 6;
        List list = Collections.EMPTY_LIST;
        vu5Var.q = list;
        vu5Var.r = list;
    }

    public vu5(vu0 vu0Var, dg2 dg2Var) {
        this.s = (byte) -1;
        this.t = -1;
        this.p = 6;
        List list = Collections.EMPTY_LIST;
        this.q = list;
        this.r = list;
        xh0 xh0Var = new xh0();
        cv0 cv0VarR = cv0.r(xh0Var, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    int iM = vu0Var.m();
                    if (iM != 0) {
                        if (iM == 8) {
                            this.f2348o |= 1;
                            this.p = vu0Var.j();
                        } else if (iM == 18) {
                            if ((i & 2) != 2) {
                                this.q = new ArrayList();
                                i |= 2;
                            }
                            this.q.add(vu0Var.f(iw5.y, dg2Var));
                        } else if (iM == 248) {
                            if ((i & 4) != 4) {
                                this.r = new ArrayList();
                                i |= 4;
                            }
                            this.r.add(Integer.valueOf(vu0Var.j()));
                        } else if (iM == 250) {
                            int iD = vu0Var.d(vu0Var.j());
                            if ((i & 4) != 4 && vu0Var.b() > 0) {
                                this.r = new ArrayList();
                                i |= 4;
                            }
                            while (vu0Var.b() > 0) {
                                this.r.add(Integer.valueOf(vu0Var.j()));
                            }
                            vu0Var.c(iD);
                        } else if (!n(vu0Var, cv0VarR, dg2Var, iM)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if ((i & 2) == 2) {
                        this.q = Collections.unmodifiableList(this.q);
                    }
                    if ((i & 4) == 4) {
                        this.r = Collections.unmodifiableList(this.r);
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
        if ((i & 2) == 2) {
            this.q = Collections.unmodifiableList(this.q);
        }
        if ((i & 4) == 4) {
            this.r = Collections.unmodifiableList(this.r);
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
        byte b = this.s;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.q.size(); i++) {
            if (!((iw5) this.q.get(i)).a()) {
                this.s = (byte) 0;
                return false;
            }
        }
        if (i()) {
            this.s = (byte) 1;
            return true;
        }
        this.s = (byte) 0;
        return false;
    }

    @Override // o.rq4
    public final t1 b() {
        return u;
    }

    @Override // o.t1
    public final int c() {
        int i = this.t;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int iC = (this.f2348o & 1) == 1 ? cv0.c(1, this.p) : 0;
        for (int i3 = 0; i3 < this.q.size(); i3++) {
            iC += cv0.e(2, (t1) this.q.get(i3));
        }
        int iD = 0;
        while (true) {
            int size = this.r.size();
            List list = this.r;
            if (i2 >= size) {
                int size2 = this.n.size() + j() + (list.size() * 2) + iC + iD;
                this.t = size2;
                return size2;
            }
            iD += cv0.d(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // o.t1
    public final fy2 d() {
        uu5 uu5Var = new uu5();
        uu5Var.q = 6;
        List list = Collections.EMPTY_LIST;
        uu5Var.r = list;
        uu5Var.s = list;
        return uu5Var;
    }

    @Override // o.t1
    public final fy2 e() {
        uu5 uu5Var = new uu5();
        uu5Var.q = 6;
        List list = Collections.EMPTY_LIST;
        uu5Var.r = list;
        uu5Var.s = list;
        uu5Var.i(this);
        return uu5Var;
    }

    @Override // o.t1
    public final void f(cv0 cv0Var) throws IOException {
        c();
        yt2 yt2Var = new yt2(this);
        if ((this.f2348o & 1) == 1) {
            cv0Var.x(1, this.p);
        }
        for (int i = 0; i < this.q.size(); i++) {
            cv0Var.z(2, (t1) this.q.get(i));
        }
        for (int i2 = 0; i2 < this.r.size(); i2++) {
            cv0Var.x(31, ((Integer) this.r.get(i2)).intValue());
        }
        yt2Var.P(19000, cv0Var);
        cv0Var.C(this.n);
    }

    public vu5() {
        this.s = (byte) -1;
        this.t = -1;
        this.n = zh0.m;
    }

    public vu5(uu5 uu5Var) {
        super(uu5Var);
        this.s = (byte) -1;
        this.t = -1;
        this.n = uu5Var.m;
    }
}
