package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class bv5 extends oy2 {
    public static final bv5 u;
    public static final ys3 v = new ys3((byte) 11);
    public final zh0 m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public zu5 f459o;
    public List p;
    public gv5 q;
    public av5 r;
    public byte s;
    public int t;

    static {
        bv5 bv5Var = new bv5();
        u = bv5Var;
        bv5Var.f459o = zu5.RETURNS_CONSTANT;
        bv5Var.p = Collections.EMPTY_LIST;
        bv5Var.q = gv5.x;
        bv5Var.r = av5.AT_MOST_ONCE;
    }

    public bv5(vu0 vu0Var, dg2 dg2Var) {
        this.s = (byte) -1;
        this.t = -1;
        zu5 zu5Var = zu5.RETURNS_CONSTANT;
        this.f459o = zu5Var;
        this.p = Collections.EMPTY_LIST;
        this.q = gv5.x;
        av5 av5Var = av5.AT_MOST_ONCE;
        this.r = av5Var;
        xh0 xh0Var = new xh0();
        cv0 cv0VarR = cv0.r(xh0Var, 1);
        boolean z = false;
        char c = 0;
        while (!z) {
            try {
                try {
                    int iM = vu0Var.m();
                    if (iM != 0) {
                        av5 av5Var2 = null;
                        zu5 zu5Var2 = null;
                        ev5 ev5VarH = null;
                        if (iM == 8) {
                            int iJ = vu0Var.j();
                            if (iJ == 0) {
                                zu5Var2 = zu5Var;
                            } else if (iJ == 1) {
                                zu5Var2 = zu5.CALLS;
                            } else if (iJ == 2) {
                                zu5Var2 = zu5.RETURNS_NOT_NULL;
                            }
                            if (zu5Var2 == null) {
                                cv0VarR.G(iM);
                                cv0VarR.G(iJ);
                            } else {
                                this.n |= 1;
                                this.f459o = zu5Var2;
                            }
                        } else if (iM == 18) {
                            int i = (c == true ? 1 : 0) & 2;
                            c = c;
                            if (i != 2) {
                                this.p = new ArrayList();
                                c = 2;
                            }
                            this.p.add(vu0Var.f(gv5.y, dg2Var));
                        } else if (iM == 26) {
                            if ((this.n & 2) == 2) {
                                gv5 gv5Var = this.q;
                                gv5Var.getClass();
                                ev5VarH = ev5.h();
                                ev5VarH.i(gv5Var);
                            }
                            gv5 gv5Var2 = (gv5) vu0Var.f(gv5.y, dg2Var);
                            this.q = gv5Var2;
                            if (ev5VarH != null) {
                                ev5VarH.i(gv5Var2);
                                this.q = ev5VarH.g();
                            }
                            this.n |= 2;
                        } else if (iM == 32) {
                            int iJ2 = vu0Var.j();
                            if (iJ2 == 0) {
                                av5Var2 = av5Var;
                            } else if (iJ2 == 1) {
                                av5Var2 = av5.EXACTLY_ONCE;
                            } else if (iJ2 == 2) {
                                av5Var2 = av5.AT_LEAST_ONCE;
                            }
                            if (av5Var2 == null) {
                                cv0VarR.G(iM);
                                cv0VarR.G(iJ2);
                            } else {
                                this.n |= 4;
                                this.r = av5Var2;
                            }
                        } else if (!vu0Var.p(iM, cv0VarR)) {
                        }
                    }
                    z = true;
                } catch (rm3 e) {
                    e.m = this;
                    throw e;
                } catch (IOException e2) {
                    rm3 rm3Var = new rm3(e2.getMessage());
                    rm3Var.m = this;
                    throw rm3Var;
                }
            } catch (Throwable th) {
                if (((c == true ? 1 : 0) & 2) == 2) {
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
        if (((c == true ? 1 : 0) & 2) == 2) {
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
        byte b = this.s;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.p.size(); i++) {
            if (!((gv5) this.p.get(i)).a()) {
                this.s = (byte) 0;
                return false;
            }
        }
        if ((this.n & 2) != 2 || this.q.a()) {
            this.s = (byte) 1;
            return true;
        }
        this.s = (byte) 0;
        return false;
    }

    @Override // o.t1
    public final int c() {
        int i = this.t;
        if (i != -1) {
            return i;
        }
        int iB = (this.n & 1) == 1 ? cv0.b(1, this.f459o.m) : 0;
        for (int i2 = 0; i2 < this.p.size(); i2++) {
            iB += cv0.e(2, (t1) this.p.get(i2));
        }
        if ((this.n & 2) == 2) {
            iB += cv0.e(3, this.q);
        }
        if ((this.n & 4) == 4) {
            iB += cv0.b(4, this.r.m);
        }
        int size = this.m.size() + iB;
        this.t = size;
        return size;
    }

    @Override // o.t1
    public final fy2 d() {
        return yu5.h();
    }

    @Override // o.t1
    public final fy2 e() {
        yu5 yu5VarH = yu5.h();
        yu5VarH.i(this);
        return yu5VarH;
    }

    @Override // o.t1
    public final void f(cv0 cv0Var) throws IOException {
        c();
        if ((this.n & 1) == 1) {
            cv0Var.w(1, this.f459o.m);
        }
        for (int i = 0; i < this.p.size(); i++) {
            cv0Var.z(2, (t1) this.p.get(i));
        }
        if ((this.n & 2) == 2) {
            cv0Var.z(3, this.q);
        }
        if ((this.n & 4) == 4) {
            cv0Var.w(4, this.r.m);
        }
        cv0Var.C(this.m);
    }

    public bv5() {
        this.s = (byte) -1;
        this.t = -1;
        this.m = zh0.m;
    }

    public bv5(yu5 yu5Var) {
        this.s = (byte) -1;
        this.t = -1;
        this.m = yu5Var.m;
    }
}
