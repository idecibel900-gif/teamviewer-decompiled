package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ov5 extends ky2 {
    public static final ov5 v;
    public static final ys3 w = new ys3((byte) 16);
    public final zh0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1682o;
    public vv5 p;
    public uv5 q;
    public mv5 r;
    public List s;
    public byte t;
    public int u;

    static {
        ov5 ov5Var = new ov5();
        v = ov5Var;
        ov5Var.p = vv5.q;
        ov5Var.q = uv5.q;
        ov5Var.r = mv5.w;
        ov5Var.s = Collections.EMPTY_LIST;
    }

    public ov5(vu0 vu0Var, dg2 dg2Var) {
        this.t = (byte) -1;
        this.u = -1;
        this.p = vv5.q;
        this.q = uv5.q;
        this.r = mv5.w;
        this.s = Collections.EMPTY_LIST;
        xh0 xh0Var = new xh0();
        cv0 cv0VarR = cv0.r(xh0Var, 1);
        boolean z = false;
        char c = 0;
        while (!z) {
            try {
                try {
                    int iM = vu0Var.m();
                    if (iM != 0) {
                        lv5 lv5VarI = null;
                        wu5 wu5Var = null;
                        wu5 wu5Var2 = null;
                        if (iM == 10) {
                            if ((this.f1682o & 1) == 1) {
                                vv5 vv5Var = this.p;
                                vv5Var.getClass();
                                wu5Var = new wu5((byte) 3);
                                wu5Var.p = f54.n;
                                wu5Var.m(vv5Var);
                            }
                            vv5 vv5Var2 = (vv5) vu0Var.f(vv5.r, dg2Var);
                            this.p = vv5Var2;
                            if (wu5Var != null) {
                                wu5Var.m(vv5Var2);
                                this.p = wu5Var.i();
                            }
                            this.f1682o |= 1;
                        } else if (iM == 18) {
                            if ((this.f1682o & 2) == 2) {
                                uv5 uv5Var = this.q;
                                uv5Var.getClass();
                                wu5Var2 = new wu5((byte) 1);
                                wu5Var2.p = Collections.EMPTY_LIST;
                                wu5Var2.l(uv5Var);
                            }
                            uv5 uv5Var2 = (uv5) vu0Var.f(uv5.r, dg2Var);
                            this.q = uv5Var2;
                            if (wu5Var2 != null) {
                                wu5Var2.l(uv5Var2);
                                this.q = wu5Var2.h();
                            }
                            this.f1682o |= 2;
                        } else if (iM == 26) {
                            if ((this.f1682o & 4) == 4) {
                                mv5 mv5Var = this.r;
                                mv5Var.getClass();
                                lv5VarI = lv5.i();
                                lv5VarI.j(mv5Var);
                            }
                            mv5 mv5Var2 = (mv5) vu0Var.f(mv5.x, dg2Var);
                            this.r = mv5Var2;
                            if (lv5VarI != null) {
                                lv5VarI.j(mv5Var2);
                                this.r = lv5VarI.h();
                            }
                            this.f1682o |= 4;
                        } else if (iM == 34) {
                            int i = (c == true ? 1 : 0) & '\b';
                            c = c;
                            if (i != 8) {
                                this.s = new ArrayList();
                                c = '\b';
                            }
                            this.s.add(vu0Var.f(tu5.W, dg2Var));
                        } else if (!n(vu0Var, cv0VarR, dg2Var, iM)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (((c == true ? 1 : 0) & '\b') == 8) {
                        this.s = Collections.unmodifiableList(this.s);
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
        if (((c == true ? 1 : 0) & '\b') == 8) {
            this.s = Collections.unmodifiableList(this.s);
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
        byte b = this.t;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.f1682o & 2) == 2 && !this.q.a()) {
            this.t = (byte) 0;
            return false;
        }
        if ((this.f1682o & 4) == 4 && !this.r.a()) {
            this.t = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.s.size(); i++) {
            if (!((tu5) this.s.get(i)).a()) {
                this.t = (byte) 0;
                return false;
            }
        }
        if (i()) {
            this.t = (byte) 1;
            return true;
        }
        this.t = (byte) 0;
        return false;
    }

    @Override // o.rq4
    public final t1 b() {
        return v;
    }

    @Override // o.t1
    public final int c() {
        int i = this.u;
        if (i != -1) {
            return i;
        }
        int iE = (this.f1682o & 1) == 1 ? cv0.e(1, this.p) : 0;
        if ((this.f1682o & 2) == 2) {
            iE += cv0.e(2, this.q);
        }
        if ((this.f1682o & 4) == 4) {
            iE += cv0.e(3, this.r);
        }
        for (int i2 = 0; i2 < this.s.size(); i2++) {
            iE += cv0.e(4, (t1) this.s.get(i2));
        }
        int size = this.n.size() + j() + iE;
        this.u = size;
        return size;
    }

    @Override // o.t1
    public final fy2 d() {
        return nv5.i();
    }

    @Override // o.t1
    public final fy2 e() {
        nv5 nv5VarI = nv5.i();
        nv5VarI.j(this);
        return nv5VarI;
    }

    @Override // o.t1
    public final void f(cv0 cv0Var) throws IOException {
        c();
        yt2 yt2Var = new yt2(this);
        if ((this.f1682o & 1) == 1) {
            cv0Var.z(1, this.p);
        }
        if ((this.f1682o & 2) == 2) {
            cv0Var.z(2, this.q);
        }
        if ((this.f1682o & 4) == 4) {
            cv0Var.z(3, this.r);
        }
        for (int i = 0; i < this.s.size(); i++) {
            cv0Var.z(4, (t1) this.s.get(i));
        }
        yt2Var.P(200, cv0Var);
        cv0Var.C(this.n);
    }

    public ov5() {
        this.t = (byte) -1;
        this.u = -1;
        this.n = zh0.m;
    }

    public ov5(nv5 nv5Var) {
        super(nv5Var);
        this.t = (byte) -1;
        this.u = -1;
        this.n = nv5Var.m;
    }
}
