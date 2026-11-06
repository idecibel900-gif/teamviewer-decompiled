package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ru5 extends jy2 {
    public List A;
    public List B;
    public List C;
    public List D;
    public List E;
    public int F;
    public aw5 G;
    public int H;
    public List I;
    public List J;
    public List K;
    public gw5 L;
    public List M;
    public nw5 N;
    public int p;
    public int q;
    public int r;
    public int s;
    public List t;
    public List u;
    public List v;
    public List w;
    public List x;
    public List y;
    public List z;

    public static ru5 i() {
        ru5 ru5Var = new ru5();
        ru5Var.q = 6;
        List list = Collections.EMPTY_LIST;
        ru5Var.t = list;
        ru5Var.u = list;
        ru5Var.v = list;
        ru5Var.w = list;
        ru5Var.x = list;
        ru5Var.y = list;
        ru5Var.z = list;
        ru5Var.A = list;
        ru5Var.B = list;
        ru5Var.C = list;
        ru5Var.D = list;
        ru5Var.E = list;
        ru5Var.G = aw5.F;
        ru5Var.I = list;
        ru5Var.J = list;
        ru5Var.K = list;
        ru5Var.L = gw5.s;
        ru5Var.M = list;
        ru5Var.N = nw5.q;
        return ru5Var;
    }

    @Override // o.fy2
    public final t1 c() {
        tu5 tu5VarH = h();
        if (tu5VarH.a()) {
            return tu5VarH;
        }
        throw new z78();
    }

    public final Object clone() {
        ru5 ru5VarI = i();
        ru5VarI.j(h());
        return ru5VarI;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // o.fy2
    public final fy2 d(vu0 vu0Var, dg2 dg2Var) throws Throwable {
        tu5 tu5Var = null;
        try {
            try {
                tu5.W.getClass();
                j(new tu5(vu0Var, dg2Var));
                return this;
            } catch (rm3 e) {
                tu5 tu5Var2 = (tu5) e.m;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    tu5Var = tu5Var2;
                    if (tu5Var != null) {
                        j(tu5Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (tu5Var != null) {
                j(tu5Var);
            }
            throw th;
        }
    }

    @Override // o.fy2
    public final /* bridge */ /* synthetic */ fy2 e(oy2 oy2Var) {
        j((tu5) oy2Var);
        return this;
    }

    public final tu5 h() {
        int i;
        tu5 tu5Var = new tu5(this);
        int i2 = this.p;
        int i3 = (i2 & 1) != 1 ? 0 : 1;
        tu5Var.p = this.q;
        if ((i2 & 2) == 2) {
            i3 |= 2;
        }
        tu5Var.q = this.r;
        if ((i2 & 4) == 4) {
            i3 |= 4;
        }
        tu5Var.r = this.s;
        if ((i2 & 8) == 8) {
            this.t = Collections.unmodifiableList(this.t);
            i = this.p & (-9);
            this.p = i;
        } else {
            i = i2;
        }
        tu5Var.s = this.t;
        if ((i & 16) == 16) {
            this.u = Collections.unmodifiableList(this.u);
            i = this.p & (-17);
            this.p = i;
        }
        tu5Var.t = this.u;
        if ((i & 32) == 32) {
            this.v = Collections.unmodifiableList(this.v);
            i = this.p & (-33);
            this.p = i;
        }
        tu5Var.u = this.v;
        if ((i & 64) == 64) {
            this.w = Collections.unmodifiableList(this.w);
            i = this.p & (-65);
            this.p = i;
        }
        tu5Var.w = this.w;
        if ((i & 128) == 128) {
            this.x = Collections.unmodifiableList(this.x);
            i = this.p & (-129);
            this.p = i;
        }
        tu5Var.y = this.x;
        if ((i & 256) == 256) {
            this.y = Collections.unmodifiableList(this.y);
            i = this.p & (-257);
            this.p = i;
        }
        tu5Var.z = this.y;
        if ((i & 512) == 512) {
            this.z = Collections.unmodifiableList(this.z);
            i = this.p & (-513);
            this.p = i;
        }
        tu5Var.B = this.z;
        if ((i & 1024) == 1024) {
            this.A = Collections.unmodifiableList(this.A);
            i = this.p & (-1025);
            this.p = i;
        }
        tu5Var.C = this.A;
        if ((i & 2048) == 2048) {
            this.B = Collections.unmodifiableList(this.B);
            i = this.p & (-2049);
            this.p = i;
        }
        tu5Var.D = this.B;
        if ((i & 4096) == 4096) {
            this.C = Collections.unmodifiableList(this.C);
            i = this.p & (-4097);
            this.p = i;
        }
        tu5Var.E = this.C;
        if ((i & 8192) == 8192) {
            this.D = Collections.unmodifiableList(this.D);
            i = this.p & (-8193);
            this.p = i;
        }
        tu5Var.F = this.D;
        if ((i & 16384) == 16384) {
            this.E = Collections.unmodifiableList(this.E);
            i = this.p & (-16385);
            this.p = i;
        }
        tu5Var.G = this.E;
        if ((i2 & 32768) == 32768) {
            i3 |= 8;
        }
        tu5Var.I = this.F;
        if ((i2 & 65536) == 65536) {
            i3 |= 16;
        }
        tu5Var.J = this.G;
        if ((i2 & 131072) == 131072) {
            i3 |= 32;
        }
        tu5Var.K = this.H;
        if ((i & 262144) == 262144) {
            this.I = Collections.unmodifiableList(this.I);
            i = this.p & (-262145);
            this.p = i;
        }
        tu5Var.L = this.I;
        if ((i & 524288) == 524288) {
            this.J = Collections.unmodifiableList(this.J);
            i = this.p & (-524289);
            this.p = i;
        }
        tu5Var.N = this.J;
        if ((i & 1048576) == 1048576) {
            this.K = Collections.unmodifiableList(this.K);
            i = this.p & (-1048577);
            this.p = i;
        }
        tu5Var.O = this.K;
        if ((i2 & 2097152) == 2097152) {
            i3 |= 64;
        }
        tu5Var.Q = this.L;
        if ((i & 4194304) == 4194304) {
            this.M = Collections.unmodifiableList(this.M);
            this.p &= -4194305;
        }
        tu5Var.R = this.M;
        if ((i2 & 8388608) == 8388608) {
            i3 |= 128;
        }
        tu5Var.S = this.N;
        tu5Var.f2145o = i3;
        return tu5Var;
    }

    public final void j(tu5 tu5Var) {
        nw5 nw5Var;
        gw5 gw5Var;
        aw5 aw5Var;
        if (tu5Var == tu5.V) {
            return;
        }
        int i = tu5Var.f2145o;
        if ((i & 1) == 1) {
            int i2 = tu5Var.p;
            this.p = 1 | this.p;
            this.q = i2;
        }
        byte b = 2;
        if ((i & 2) == 2) {
            int i3 = tu5Var.q;
            this.p |= 2;
            this.r = i3;
        }
        if ((i & 4) == 4) {
            int i4 = tu5Var.r;
            this.p = 4 | this.p;
            this.s = i4;
        }
        if (!tu5Var.s.isEmpty()) {
            if (this.t.isEmpty()) {
                this.t = tu5Var.s;
                this.p &= -9;
            } else {
                if ((this.p & 8) != 8) {
                    this.t = new ArrayList(this.t);
                    this.p |= 8;
                }
                this.t.addAll(tu5Var.s);
            }
        }
        if (!tu5Var.t.isEmpty()) {
            if (this.u.isEmpty()) {
                this.u = tu5Var.t;
                this.p &= -17;
            } else {
                if ((this.p & 16) != 16) {
                    this.u = new ArrayList(this.u);
                    this.p |= 16;
                }
                this.u.addAll(tu5Var.t);
            }
        }
        if (!tu5Var.u.isEmpty()) {
            if (this.v.isEmpty()) {
                this.v = tu5Var.u;
                this.p &= -33;
            } else {
                if ((this.p & 32) != 32) {
                    this.v = new ArrayList(this.v);
                    this.p |= 32;
                }
                this.v.addAll(tu5Var.u);
            }
        }
        if (!tu5Var.w.isEmpty()) {
            if (this.w.isEmpty()) {
                this.w = tu5Var.w;
                this.p &= -65;
            } else {
                if ((this.p & 64) != 64) {
                    this.w = new ArrayList(this.w);
                    this.p |= 64;
                }
                this.w.addAll(tu5Var.w);
            }
        }
        if (!tu5Var.y.isEmpty()) {
            if (this.x.isEmpty()) {
                this.x = tu5Var.y;
                this.p &= -129;
            } else {
                if ((this.p & 128) != 128) {
                    this.x = new ArrayList(this.x);
                    this.p |= 128;
                }
                this.x.addAll(tu5Var.y);
            }
        }
        if (!tu5Var.z.isEmpty()) {
            if (this.y.isEmpty()) {
                this.y = tu5Var.z;
                this.p &= -257;
            } else {
                if ((this.p & 256) != 256) {
                    this.y = new ArrayList(this.y);
                    this.p |= 256;
                }
                this.y.addAll(tu5Var.z);
            }
        }
        if (!tu5Var.B.isEmpty()) {
            if (this.z.isEmpty()) {
                this.z = tu5Var.B;
                this.p &= -513;
            } else {
                if ((this.p & 512) != 512) {
                    this.z = new ArrayList(this.z);
                    this.p |= 512;
                }
                this.z.addAll(tu5Var.B);
            }
        }
        if (!tu5Var.C.isEmpty()) {
            if (this.A.isEmpty()) {
                this.A = tu5Var.C;
                this.p &= -1025;
            } else {
                if ((this.p & 1024) != 1024) {
                    this.A = new ArrayList(this.A);
                    this.p |= 1024;
                }
                this.A.addAll(tu5Var.C);
            }
        }
        if (!tu5Var.D.isEmpty()) {
            if (this.B.isEmpty()) {
                this.B = tu5Var.D;
                this.p &= -2049;
            } else {
                if ((this.p & 2048) != 2048) {
                    this.B = new ArrayList(this.B);
                    this.p |= 2048;
                }
                this.B.addAll(tu5Var.D);
            }
        }
        if (!tu5Var.E.isEmpty()) {
            if (this.C.isEmpty()) {
                this.C = tu5Var.E;
                this.p &= -4097;
            } else {
                if ((this.p & 4096) != 4096) {
                    this.C = new ArrayList(this.C);
                    this.p |= 4096;
                }
                this.C.addAll(tu5Var.E);
            }
        }
        if (!tu5Var.F.isEmpty()) {
            if (this.D.isEmpty()) {
                this.D = tu5Var.F;
                this.p &= -8193;
            } else {
                if ((this.p & 8192) != 8192) {
                    this.D = new ArrayList(this.D);
                    this.p |= 8192;
                }
                this.D.addAll(tu5Var.F);
            }
        }
        if (!tu5Var.G.isEmpty()) {
            if (this.E.isEmpty()) {
                this.E = tu5Var.G;
                this.p &= -16385;
            } else {
                if ((this.p & 16384) != 16384) {
                    this.E = new ArrayList(this.E);
                    this.p |= 16384;
                }
                this.E.addAll(tu5Var.G);
            }
        }
        int i5 = tu5Var.f2145o;
        if ((i5 & 8) == 8) {
            int i6 = tu5Var.I;
            this.p |= 32768;
            this.F = i6;
        }
        if ((i5 & 16) == 16) {
            aw5 aw5Var2 = tu5Var.J;
            if ((this.p & 65536) != 65536 || (aw5Var = this.G) == aw5.F) {
                this.G = aw5Var2;
            } else {
                zv5 zv5VarQ = aw5.q(aw5Var);
                zv5VarQ.j(aw5Var2);
                this.G = zv5VarQ.h();
            }
            this.p |= 65536;
        }
        if ((tu5Var.f2145o & 32) == 32) {
            int i7 = tu5Var.K;
            this.p |= 131072;
            this.H = i7;
        }
        if (!tu5Var.L.isEmpty()) {
            if (this.I.isEmpty()) {
                this.I = tu5Var.L;
                this.p &= -262145;
            } else {
                if ((this.p & 262144) != 262144) {
                    this.I = new ArrayList(this.I);
                    this.p |= 262144;
                }
                this.I.addAll(tu5Var.L);
            }
        }
        if (!tu5Var.N.isEmpty()) {
            if (this.J.isEmpty()) {
                this.J = tu5Var.N;
                this.p &= -524289;
            } else {
                if ((this.p & 524288) != 524288) {
                    this.J = new ArrayList(this.J);
                    this.p |= 524288;
                }
                this.J.addAll(tu5Var.N);
            }
        }
        if (!tu5Var.O.isEmpty()) {
            if (this.K.isEmpty()) {
                this.K = tu5Var.O;
                this.p &= -1048577;
            } else {
                if ((this.p & 1048576) != 1048576) {
                    this.K = new ArrayList(this.K);
                    this.p |= 1048576;
                }
                this.K.addAll(tu5Var.O);
            }
        }
        if ((tu5Var.f2145o & 64) == 64) {
            gw5 gw5Var2 = tu5Var.Q;
            if ((this.p & 2097152) != 2097152 || (gw5Var = this.L) == gw5.s) {
                this.L = gw5Var2;
            } else {
                pu5 pu5VarI = gw5.i(gw5Var);
                pu5VarI.l(gw5Var2);
                this.L = pu5VarI.i();
            }
            this.p |= 2097152;
        }
        if (!tu5Var.R.isEmpty()) {
            if (this.M.isEmpty()) {
                this.M = tu5Var.R;
                this.p &= -4194305;
            } else {
                if ((this.p & 4194304) != 4194304) {
                    this.M = new ArrayList(this.M);
                    this.p |= 4194304;
                }
                this.M.addAll(tu5Var.R);
            }
        }
        if ((tu5Var.f2145o & 128) == 128) {
            nw5 nw5Var2 = tu5Var.S;
            if ((this.p & 8388608) != 8388608 || (nw5Var = this.N) == nw5.q) {
                this.N = nw5Var2;
            } else {
                wu5 wu5Var = new wu5(b);
                wu5Var.p = Collections.EMPTY_LIST;
                wu5Var.n(nw5Var);
                wu5Var.n(nw5Var2);
                this.N = wu5Var.j();
            }
            this.p |= 8388608;
        }
        g(tu5Var);
        this.m = this.m.b(tu5Var.n);
    }
}
