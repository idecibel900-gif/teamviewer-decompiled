package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class wu5 extends fy2 implements rq4 {
    public final /* synthetic */ byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2445o;
    public List p;

    public /* synthetic */ wu5(byte b) {
        this.n = b;
    }

    @Override // o.fy2
    public final t1 c() {
        switch (this.n) {
            case 0:
                xu5 xu5VarG = g();
                if (xu5VarG.a()) {
                    return xu5VarG;
                }
                throw new z78();
            case 1:
                uv5 uv5VarH = h();
                if (uv5VarH.a()) {
                    return uv5VarH;
                }
                throw new z78();
            case 2:
                nw5 nw5VarJ = j();
                if (nw5VarJ.a()) {
                    return nw5VarJ;
                }
                throw new z78();
            default:
                vv5 vv5VarI = i();
                if (vv5VarI.a()) {
                    return vv5VarI;
                }
                throw new z78();
        }
    }

    public final Object clone() {
        switch (this.n) {
            case 0:
                wu5 wu5Var = new wu5((byte) 0);
                wu5Var.p = Collections.EMPTY_LIST;
                wu5Var.k(g());
                return wu5Var;
            case 1:
                wu5 wu5Var2 = new wu5((byte) 1);
                wu5Var2.p = Collections.EMPTY_LIST;
                wu5Var2.l(h());
                return wu5Var2;
            case 2:
                wu5 wu5Var3 = new wu5((byte) 2);
                wu5Var3.p = Collections.EMPTY_LIST;
                wu5Var3.n(j());
                return wu5Var3;
            default:
                wu5 wu5Var4 = new wu5((byte) 3);
                wu5Var4.p = f54.n;
                wu5Var4.m(i());
                return wu5Var4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x007a  */
    @Override // o.fy2
    public final fy2 d(vu0 vu0Var, dg2 dg2Var) throws Throwable {
        vv5 vv5Var = null;
        xu5 xu5Var = null;
        uv5 uv5Var = null;
        nw5 nw5Var = null;
        try {
            try {
                try {
                    switch (this.n) {
                        case 0:
                            try {
                                try {
                                    xu5.r.getClass();
                                    k(new xu5(vu0Var, dg2Var));
                                    return this;
                                } catch (rm3 e) {
                                    xu5 xu5Var2 = (xu5) e.m;
                                    try {
                                        throw e;
                                    } catch (Throwable th) {
                                        th = th;
                                        xu5Var = xu5Var2;
                                        if (xu5Var != null) {
                                            k(xu5Var);
                                        }
                                        throw th;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (xu5Var != null) {
                                    k(xu5Var);
                                }
                                throw th;
                            }
                        case 1:
                            try {
                                uv5.r.getClass();
                                l(new uv5(vu0Var, dg2Var));
                                return this;
                            } catch (rm3 e2) {
                                uv5 uv5Var2 = (uv5) e2.m;
                                try {
                                    throw e2;
                                } catch (Throwable th3) {
                                    th = th3;
                                    uv5Var = uv5Var2;
                                    if (uv5Var != null) {
                                        l(uv5Var);
                                    }
                                    throw th;
                                }
                            }
                        case 2:
                            try {
                                nw5.r.getClass();
                                n(new nw5(vu0Var, dg2Var));
                                return this;
                            } catch (rm3 e3) {
                                nw5 nw5Var2 = (nw5) e3.m;
                                try {
                                    throw e3;
                                } catch (Throwable th4) {
                                    th = th4;
                                    nw5Var = nw5Var2;
                                    if (nw5Var != null) {
                                        n(nw5Var);
                                    }
                                    throw th;
                                }
                            }
                        default:
                            try {
                                vv5.r.getClass();
                                m(new vv5(vu0Var));
                                return this;
                            } catch (rm3 e4) {
                                vv5 vv5Var2 = (vv5) e4.m;
                                try {
                                    throw e4;
                                } catch (Throwable th5) {
                                    th = th5;
                                    vv5Var = vv5Var2;
                                    if (vv5Var != null) {
                                        m(vv5Var);
                                    }
                                    throw th;
                                }
                            }
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Throwable th8) {
            th = th8;
        }
    }

    @Override // o.fy2
    public final /* bridge */ /* synthetic */ fy2 e(oy2 oy2Var) {
        switch (this.n) {
            case 0:
                k((xu5) oy2Var);
                break;
            case 1:
                l((uv5) oy2Var);
                break;
            case 2:
                n((nw5) oy2Var);
                break;
            default:
                m((vv5) oy2Var);
                break;
        }
        return this;
    }

    public xu5 g() {
        xu5 xu5Var = new xu5(this);
        if ((this.f2445o & 1) == 1) {
            this.p = Collections.unmodifiableList(this.p);
            this.f2445o &= -2;
        }
        xu5Var.n = this.p;
        return xu5Var;
    }

    public uv5 h() {
        uv5 uv5Var = new uv5(this);
        if ((this.f2445o & 1) == 1) {
            this.p = Collections.unmodifiableList(this.p);
            this.f2445o &= -2;
        }
        uv5Var.n = this.p;
        return uv5Var;
    }

    public vv5 i() {
        vv5 vv5Var = new vv5(this);
        if ((this.f2445o & 1) == 1) {
            this.p = ((i54) this.p).j();
            this.f2445o &= -2;
        }
        vv5Var.n = (i54) this.p;
        return vv5Var;
    }

    public nw5 j() {
        nw5 nw5Var = new nw5(this);
        if ((this.f2445o & 1) == 1) {
            this.p = Collections.unmodifiableList(this.p);
            this.f2445o &= -2;
        }
        nw5Var.n = this.p;
        return nw5Var;
    }

    public void k(xu5 xu5Var) {
        if (xu5Var == xu5.q) {
            return;
        }
        if (!xu5Var.n.isEmpty()) {
            if (this.p.isEmpty()) {
                this.p = xu5Var.n;
                this.f2445o &= -2;
            } else {
                if ((this.f2445o & 1) != 1) {
                    this.p = new ArrayList(this.p);
                    this.f2445o |= 1;
                }
                this.p.addAll(xu5Var.n);
            }
        }
        this.m = this.m.b(xu5Var.m);
    }

    public void l(uv5 uv5Var) {
        if (uv5Var == uv5.q) {
            return;
        }
        if (!uv5Var.n.isEmpty()) {
            if (this.p.isEmpty()) {
                this.p = uv5Var.n;
                this.f2445o &= -2;
            } else {
                if ((this.f2445o & 1) != 1) {
                    this.p = new ArrayList(this.p);
                    this.f2445o |= 1;
                }
                this.p.addAll(uv5Var.n);
            }
        }
        this.m = this.m.b(uv5Var.m);
    }

    public void m(vv5 vv5Var) {
        if (vv5Var == vv5.q) {
            return;
        }
        if (!vv5Var.n.isEmpty()) {
            if (((i54) this.p).isEmpty()) {
                this.p = vv5Var.n;
                this.f2445o &= -2;
            } else {
                if ((this.f2445o & 1) != 1) {
                    this.p = new f54((i54) this.p);
                    this.f2445o |= 1;
                }
                ((i54) this.p).addAll(vv5Var.n);
            }
        }
        this.m = this.m.b(vv5Var.m);
    }

    public void n(nw5 nw5Var) {
        if (nw5Var == nw5.q) {
            return;
        }
        if (!nw5Var.n.isEmpty()) {
            if (this.p.isEmpty()) {
                this.p = nw5Var.n;
                this.f2445o &= -2;
            } else {
                if ((this.f2445o & 1) != 1) {
                    this.p = new ArrayList(this.p);
                    this.f2445o |= 1;
                }
                this.p.addAll(nw5Var.n);
            }
        }
        this.m = this.m.b(nw5Var.m);
    }
}
