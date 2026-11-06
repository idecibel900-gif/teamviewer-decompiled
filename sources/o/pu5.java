package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class pu5 extends fy2 implements rq4 {
    public final /* synthetic */ byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1777o;
    public Object p;
    public int q;

    public /* synthetic */ pu5(byte b) {
        this.n = b;
    }

    @Override // o.fy2
    public final t1 c() {
        switch (this.n) {
            case 0:
                qu5 qu5VarH = h();
                if (qu5VarH.a()) {
                    return qu5VarH;
                }
                throw new z78();
            case 1:
                gw5 gw5VarI = i();
                if (gw5VarI.a()) {
                    return gw5VarI;
                }
                throw new z78();
            default:
                ou5 ou5VarG = g();
                if (ou5VarG.a()) {
                    return ou5VarG;
                }
                throw new z78();
        }
    }

    public final Object clone() {
        switch (this.n) {
            case 0:
                pu5 pu5Var = new pu5((byte) 0);
                pu5Var.p = Collections.EMPTY_LIST;
                pu5Var.k(h());
                return pu5Var;
            case 1:
                pu5 pu5Var2 = new pu5((byte) 1);
                pu5Var2.p = Collections.EMPTY_LIST;
                pu5Var2.q = -1;
                pu5Var2.l(i());
                return pu5Var2;
            default:
                pu5 pu5Var3 = new pu5((byte) 2);
                pu5Var3.p = nu5.B;
                pu5Var3.j(g());
                return pu5Var3;
        }
    }

    @Override // o.fy2
    public final fy2 d(vu0 vu0Var, dg2 dg2Var) throws Throwable {
        ou5 ou5Var = null;
        qu5 qu5Var = null;
        gw5 gw5Var = null;
        try {
            try {
                try {
                    switch (this.n) {
                        case 0:
                            try {
                                qu5.t.getClass();
                                k(new qu5(vu0Var, dg2Var));
                                return this;
                            } catch (rm3 e) {
                                qu5 qu5Var2 = (qu5) e.m;
                                try {
                                    throw e;
                                } catch (Throwable th) {
                                    th = th;
                                    qu5Var = qu5Var2;
                                    if (qu5Var != null) {
                                        k(qu5Var);
                                    }
                                    throw th;
                                }
                            }
                        case 1:
                            try {
                                gw5.t.getClass();
                                l(new gw5(vu0Var, dg2Var));
                                return this;
                            } catch (rm3 e2) {
                                gw5 gw5Var2 = (gw5) e2.m;
                                try {
                                    throw e2;
                                } catch (Throwable th2) {
                                    th = th2;
                                    gw5Var = gw5Var2;
                                    if (gw5Var != null) {
                                        l(gw5Var);
                                    }
                                    throw th;
                                }
                            }
                        default:
                            try {
                                ou5.t.getClass();
                                j(new ou5(vu0Var, dg2Var));
                                return this;
                            } catch (rm3 e3) {
                                ou5 ou5Var2 = (ou5) e3.m;
                                try {
                                    throw e3;
                                } catch (Throwable th3) {
                                    th = th3;
                                    ou5Var = ou5Var2;
                                    if (ou5Var != null) {
                                        j(ou5Var);
                                    }
                                    throw th;
                                }
                            }
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    @Override // o.fy2
    public final /* bridge */ /* synthetic */ fy2 e(oy2 oy2Var) {
        switch (this.n) {
            case 0:
                k((qu5) oy2Var);
                break;
            case 1:
                l((gw5) oy2Var);
                break;
            default:
                j((ou5) oy2Var);
                break;
        }
        return this;
    }

    public ou5 g() {
        ou5 ou5Var = new ou5(this);
        int i = this.f1777o;
        int i2 = (i & 1) != 1 ? 0 : 1;
        ou5Var.f1678o = this.q;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        ou5Var.p = (nu5) this.p;
        ou5Var.n = i2;
        return ou5Var;
    }

    public qu5 h() {
        qu5 qu5Var = new qu5(this);
        int i = this.f1777o;
        int i2 = (i & 1) != 1 ? 0 : 1;
        qu5Var.f1867o = this.q;
        if ((i & 2) == 2) {
            this.p = Collections.unmodifiableList((List) this.p);
            this.f1777o &= -3;
        }
        qu5Var.p = (List) this.p;
        qu5Var.n = i2;
        return qu5Var;
    }

    public gw5 i() {
        gw5 gw5Var = new gw5(this);
        int i = this.f1777o;
        if ((i & 1) == 1) {
            this.p = Collections.unmodifiableList((List) this.p);
            this.f1777o &= -2;
        }
        gw5Var.f929o = (List) this.p;
        int i2 = (i & 2) != 2 ? 0 : 1;
        gw5Var.p = this.q;
        gw5Var.n = i2;
        return gw5Var;
    }

    public void j(ou5 ou5Var) {
        nu5 nu5Var;
        if (ou5Var == ou5.s) {
            return;
        }
        int i = ou5Var.n;
        if ((i & 1) == 1) {
            int i2 = ou5Var.f1678o;
            this.f1777o = 1 | this.f1777o;
            this.q = i2;
        }
        if ((i & 2) == 2) {
            nu5 nu5Var2 = ou5Var.p;
            if ((this.f1777o & 2) != 2 || (nu5Var = (nu5) this.p) == nu5.B) {
                this.p = nu5Var2;
            } else {
                lu5 lu5VarH = lu5.h();
                lu5VarH.i(nu5Var);
                lu5VarH.i(nu5Var2);
                this.p = lu5VarH.g();
            }
            this.f1777o |= 2;
        }
        this.m = this.m.b(ou5Var.m);
    }

    public void k(qu5 qu5Var) {
        if (qu5Var == qu5.s) {
            return;
        }
        if ((qu5Var.n & 1) == 1) {
            int i = qu5Var.f1867o;
            this.f1777o = 1 | this.f1777o;
            this.q = i;
        }
        if (!qu5Var.p.isEmpty()) {
            if (((List) this.p).isEmpty()) {
                this.p = qu5Var.p;
                this.f1777o &= -3;
            } else {
                if ((this.f1777o & 2) != 2) {
                    this.p = new ArrayList((List) this.p);
                    this.f1777o |= 2;
                }
                ((List) this.p).addAll(qu5Var.p);
            }
        }
        this.m = this.m.b(qu5Var.m);
    }

    public void l(gw5 gw5Var) {
        if (gw5Var == gw5.s) {
            return;
        }
        if (!gw5Var.f929o.isEmpty()) {
            if (((List) this.p).isEmpty()) {
                this.p = gw5Var.f929o;
                this.f1777o &= -2;
            } else {
                if ((this.f1777o & 1) != 1) {
                    this.p = new ArrayList((List) this.p);
                    this.f1777o |= 1;
                }
                ((List) this.p).addAll(gw5Var.f929o);
            }
        }
        if ((gw5Var.n & 1) == 1) {
            int i = gw5Var.p;
            this.f1777o |= 2;
            this.q = i;
        }
        this.m = this.m.b(gw5Var.m);
    }
}
