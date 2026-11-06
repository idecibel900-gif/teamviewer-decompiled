package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class mv5 extends ky2 {
    public static final mv5 w;
    public static final ys3 x = new ys3((byte) 15);
    public final zh0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1515o;
    public List p;
    public List q;
    public List r;
    public gw5 s;
    public nw5 t;
    public byte u;
    public int v;

    static {
        mv5 mv5Var = new mv5();
        w = mv5Var;
        List list = Collections.EMPTY_LIST;
        mv5Var.p = list;
        mv5Var.q = list;
        mv5Var.r = list;
        mv5Var.s = gw5.s;
        mv5Var.t = nw5.q;
    }

    public mv5(vu0 vu0Var, dg2 dg2Var) {
        this.u = (byte) -1;
        this.v = -1;
        List list = Collections.EMPTY_LIST;
        this.p = list;
        this.q = list;
        this.r = list;
        this.s = gw5.s;
        this.t = nw5.q;
        xh0 xh0Var = new xh0();
        cv0 cv0VarR = cv0.r(xh0Var, 1);
        boolean z = false;
        int i = 0;
        while (true) {
            byte b = 2;
            if (z) {
                break;
            }
            try {
                try {
                    try {
                        int iM = vu0Var.m();
                        if (iM != 0) {
                            if (iM == 26) {
                                int i2 = (i == true ? 1 : 0) & 1;
                                i = i;
                                if (i2 != 1) {
                                    this.p = new ArrayList();
                                    i = (i == true ? 1 : 0) | 1;
                                }
                                this.p.add(vu0Var.f(iv5.H, dg2Var));
                            } else if (iM == 34) {
                                int i3 = (i == true ? 1 : 0) & 2;
                                i = i;
                                if (i3 != 2) {
                                    this.q = new ArrayList();
                                    i = (i == true ? 1 : 0) | 2;
                                }
                                this.q.add(vu0Var.f(qv5.H, dg2Var));
                            } else if (iM != 42) {
                                wu5 wu5Var = null;
                                pu5 pu5VarI = null;
                                if (iM == 242) {
                                    if ((this.f1515o & 1) == 1) {
                                        gw5 gw5Var = this.s;
                                        gw5Var.getClass();
                                        pu5VarI = gw5.i(gw5Var);
                                    }
                                    gw5 gw5Var2 = (gw5) vu0Var.f(gw5.t, dg2Var);
                                    this.s = gw5Var2;
                                    if (pu5VarI != null) {
                                        pu5VarI.l(gw5Var2);
                                        this.s = pu5VarI.i();
                                    }
                                    this.f1515o |= 1;
                                } else if (iM == 258) {
                                    if ((this.f1515o & 2) == 2) {
                                        nw5 nw5Var = this.t;
                                        nw5Var.getClass();
                                        wu5Var = new wu5(b);
                                        wu5Var.p = Collections.EMPTY_LIST;
                                        wu5Var.n(nw5Var);
                                    }
                                    nw5 nw5Var2 = (nw5) vu0Var.f(nw5.r, dg2Var);
                                    this.t = nw5Var2;
                                    if (wu5Var != null) {
                                        wu5Var.n(nw5Var2);
                                        this.t = wu5Var.j();
                                    }
                                    this.f1515o |= 2;
                                } else if (!n(vu0Var, cv0VarR, dg2Var, iM)) {
                                }
                            } else {
                                int i4 = (i == true ? 1 : 0) & 4;
                                i = i;
                                if (i4 != 4) {
                                    this.r = new ArrayList();
                                    i = (i == true ? 1 : 0) | 4;
                                }
                                this.r.add(vu0Var.f(cw5.B, dg2Var));
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
                if (((i == true ? 1 : 0) & 1) == 1) {
                    this.p = Collections.unmodifiableList(this.p);
                }
                if (((i == true ? 1 : 0) & 2) == 2) {
                    this.q = Collections.unmodifiableList(this.q);
                }
                if (((i == true ? 1 : 0) & 4) == 4) {
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
        }
        if (((i == true ? 1 : 0) & 1) == 1) {
            this.p = Collections.unmodifiableList(this.p);
        }
        if (((i == true ? 1 : 0) & 2) == 2) {
            this.q = Collections.unmodifiableList(this.q);
        }
        if (((i == true ? 1 : 0) & 4) == 4) {
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
        byte b = this.u;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.p.size(); i++) {
            if (!((iv5) this.p.get(i)).a()) {
                this.u = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.q.size(); i2++) {
            if (!((qv5) this.q.get(i2)).a()) {
                this.u = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.r.size(); i3++) {
            if (!((cw5) this.r.get(i3)).a()) {
                this.u = (byte) 0;
                return false;
            }
        }
        if ((this.f1515o & 1) == 1 && !this.s.a()) {
            this.u = (byte) 0;
            return false;
        }
        if (i()) {
            this.u = (byte) 1;
            return true;
        }
        this.u = (byte) 0;
        return false;
    }

    @Override // o.rq4
    public final t1 b() {
        return w;
    }

    @Override // o.t1
    public final int c() {
        int i = this.v;
        if (i != -1) {
            return i;
        }
        int iE = 0;
        for (int i2 = 0; i2 < this.p.size(); i2++) {
            iE += cv0.e(3, (t1) this.p.get(i2));
        }
        for (int i3 = 0; i3 < this.q.size(); i3++) {
            iE += cv0.e(4, (t1) this.q.get(i3));
        }
        for (int i4 = 0; i4 < this.r.size(); i4++) {
            iE += cv0.e(5, (t1) this.r.get(i4));
        }
        if ((this.f1515o & 1) == 1) {
            iE += cv0.e(30, this.s);
        }
        if ((this.f1515o & 2) == 2) {
            iE += cv0.e(32, this.t);
        }
        int size = this.n.size() + j() + iE;
        this.v = size;
        return size;
    }

    @Override // o.t1
    public final fy2 d() {
        return lv5.i();
    }

    @Override // o.t1
    public final fy2 e() {
        lv5 lv5VarI = lv5.i();
        lv5VarI.j(this);
        return lv5VarI;
    }

    @Override // o.t1
    public final void f(cv0 cv0Var) throws IOException {
        c();
        yt2 yt2Var = new yt2(this);
        for (int i = 0; i < this.p.size(); i++) {
            cv0Var.z(3, (t1) this.p.get(i));
        }
        for (int i2 = 0; i2 < this.q.size(); i2++) {
            cv0Var.z(4, (t1) this.q.get(i2));
        }
        for (int i3 = 0; i3 < this.r.size(); i3++) {
            cv0Var.z(5, (t1) this.r.get(i3));
        }
        if ((this.f1515o & 1) == 1) {
            cv0Var.z(30, this.s);
        }
        if ((this.f1515o & 2) == 2) {
            cv0Var.z(32, this.t);
        }
        yt2Var.P(200, cv0Var);
        cv0Var.C(this.n);
    }

    public mv5() {
        this.u = (byte) -1;
        this.v = -1;
        this.n = zh0.m;
    }

    public mv5(lv5 lv5Var) {
        super(lv5Var);
        this.u = (byte) -1;
        this.v = -1;
        this.n = lv5Var.m;
    }
}
