package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class hv5 extends jy2 {
    public List A;
    public gw5 B;
    public List C;
    public xu5 D;
    public int p;
    public int q;
    public int r;
    public int s;
    public aw5 t;
    public int u;
    public List v;
    public aw5 w;
    public int x;
    public List y;
    public List z;

    public static hv5 i() {
        hv5 hv5Var = new hv5();
        hv5Var.q = 6;
        hv5Var.r = 6;
        aw5 aw5Var = aw5.F;
        hv5Var.t = aw5Var;
        List list = Collections.EMPTY_LIST;
        hv5Var.v = list;
        hv5Var.w = aw5Var;
        hv5Var.y = list;
        hv5Var.z = list;
        hv5Var.A = list;
        hv5Var.B = gw5.s;
        hv5Var.C = list;
        hv5Var.D = xu5.q;
        return hv5Var;
    }

    @Override // o.fy2
    public final t1 c() {
        iv5 iv5VarH = h();
        if (iv5VarH.a()) {
            return iv5VarH;
        }
        throw new z78();
    }

    public final Object clone() {
        hv5 hv5VarI = i();
        hv5VarI.j(h());
        return hv5VarI;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // o.fy2
    public final fy2 d(vu0 vu0Var, dg2 dg2Var) throws Throwable {
        iv5 iv5Var = null;
        try {
            try {
                iv5.H.getClass();
                j(new iv5(vu0Var, dg2Var));
                return this;
            } catch (rm3 e) {
                iv5 iv5Var2 = (iv5) e.m;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    iv5Var = iv5Var2;
                    if (iv5Var != null) {
                        j(iv5Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (iv5Var != null) {
                j(iv5Var);
            }
            throw th;
        }
    }

    @Override // o.fy2
    public final /* bridge */ /* synthetic */ fy2 e(oy2 oy2Var) {
        j((iv5) oy2Var);
        return this;
    }

    public final iv5 h() {
        int i;
        iv5 iv5Var = new iv5(this);
        int i2 = this.p;
        int i3 = (i2 & 1) != 1 ? 0 : 1;
        iv5Var.p = this.q;
        if ((i2 & 2) == 2) {
            i3 |= 2;
        }
        iv5Var.q = this.r;
        if ((i2 & 4) == 4) {
            i3 |= 4;
        }
        iv5Var.r = this.s;
        if ((i2 & 8) == 8) {
            i3 |= 8;
        }
        iv5Var.s = this.t;
        if ((i2 & 16) == 16) {
            i3 |= 16;
        }
        iv5Var.t = this.u;
        if ((i2 & 32) == 32) {
            this.v = Collections.unmodifiableList(this.v);
            i = this.p & (-33);
            this.p = i;
        } else {
            i = i2;
        }
        iv5Var.u = this.v;
        if ((i2 & 64) == 64) {
            i3 |= 32;
        }
        iv5Var.v = this.w;
        if ((i2 & 128) == 128) {
            i3 |= 64;
        }
        iv5Var.w = this.x;
        if ((i & 256) == 256) {
            this.y = Collections.unmodifiableList(this.y);
            i = this.p & (-257);
            this.p = i;
        }
        iv5Var.x = this.y;
        if ((i & 512) == 512) {
            this.z = Collections.unmodifiableList(this.z);
            i = this.p & (-513);
            this.p = i;
        }
        iv5Var.y = this.z;
        if ((i & 1024) == 1024) {
            this.A = Collections.unmodifiableList(this.A);
            i = this.p & (-1025);
            this.p = i;
        }
        iv5Var.A = this.A;
        if ((i2 & 2048) == 2048) {
            i3 |= 128;
        }
        iv5Var.B = this.B;
        if ((i & 4096) == 4096) {
            this.C = Collections.unmodifiableList(this.C);
            this.p &= -4097;
        }
        iv5Var.C = this.C;
        if ((i2 & 8192) == 8192) {
            i3 |= 256;
        }
        iv5Var.D = this.D;
        iv5Var.f1108o = i3;
        return iv5Var;
    }

    public final void j(iv5 iv5Var) {
        xu5 xu5Var;
        gw5 gw5Var;
        aw5 aw5Var;
        aw5 aw5Var2;
        if (iv5Var == iv5.G) {
            return;
        }
        int i = iv5Var.f1108o;
        if ((i & 1) == 1) {
            int i2 = iv5Var.p;
            this.p = 1 | this.p;
            this.q = i2;
        }
        if ((i & 2) == 2) {
            int i3 = iv5Var.q;
            this.p = 2 | this.p;
            this.r = i3;
        }
        if ((i & 4) == 4) {
            int i4 = iv5Var.r;
            this.p = 4 | this.p;
            this.s = i4;
        }
        if ((i & 8) == 8) {
            aw5 aw5Var3 = iv5Var.s;
            if ((this.p & 8) != 8 || (aw5Var2 = this.t) == aw5.F) {
                this.t = aw5Var3;
            } else {
                zv5 zv5VarQ = aw5.q(aw5Var2);
                zv5VarQ.j(aw5Var3);
                this.t = zv5VarQ.h();
            }
            this.p |= 8;
        }
        if ((iv5Var.f1108o & 16) == 16) {
            int i5 = iv5Var.t;
            this.p = 16 | this.p;
            this.u = i5;
        }
        if (!iv5Var.u.isEmpty()) {
            if (this.v.isEmpty()) {
                this.v = iv5Var.u;
                this.p &= -33;
            } else {
                if ((this.p & 32) != 32) {
                    this.v = new ArrayList(this.v);
                    this.p |= 32;
                }
                this.v.addAll(iv5Var.u);
            }
        }
        if ((iv5Var.f1108o & 32) == 32) {
            aw5 aw5Var4 = iv5Var.v;
            if ((this.p & 64) != 64 || (aw5Var = this.w) == aw5.F) {
                this.w = aw5Var4;
            } else {
                zv5 zv5VarQ2 = aw5.q(aw5Var);
                zv5VarQ2.j(aw5Var4);
                this.w = zv5VarQ2.h();
            }
            this.p |= 64;
        }
        if ((iv5Var.f1108o & 64) == 64) {
            int i6 = iv5Var.w;
            this.p |= 128;
            this.x = i6;
        }
        if (!iv5Var.x.isEmpty()) {
            if (this.y.isEmpty()) {
                this.y = iv5Var.x;
                this.p &= -257;
            } else {
                if ((this.p & 256) != 256) {
                    this.y = new ArrayList(this.y);
                    this.p |= 256;
                }
                this.y.addAll(iv5Var.x);
            }
        }
        if (!iv5Var.y.isEmpty()) {
            if (this.z.isEmpty()) {
                this.z = iv5Var.y;
                this.p &= -513;
            } else {
                if ((this.p & 512) != 512) {
                    this.z = new ArrayList(this.z);
                    this.p |= 512;
                }
                this.z.addAll(iv5Var.y);
            }
        }
        if (!iv5Var.A.isEmpty()) {
            if (this.A.isEmpty()) {
                this.A = iv5Var.A;
                this.p &= -1025;
            } else {
                if ((this.p & 1024) != 1024) {
                    this.A = new ArrayList(this.A);
                    this.p |= 1024;
                }
                this.A.addAll(iv5Var.A);
            }
        }
        if ((iv5Var.f1108o & 128) == 128) {
            gw5 gw5Var2 = iv5Var.B;
            if ((this.p & 2048) != 2048 || (gw5Var = this.B) == gw5.s) {
                this.B = gw5Var2;
            } else {
                pu5 pu5VarI = gw5.i(gw5Var);
                pu5VarI.l(gw5Var2);
                this.B = pu5VarI.i();
            }
            this.p |= 2048;
        }
        if (!iv5Var.C.isEmpty()) {
            if (this.C.isEmpty()) {
                this.C = iv5Var.C;
                this.p &= -4097;
            } else {
                if ((this.p & 4096) != 4096) {
                    this.C = new ArrayList(this.C);
                    this.p |= 4096;
                }
                this.C.addAll(iv5Var.C);
            }
        }
        if ((iv5Var.f1108o & 256) == 256) {
            xu5 xu5Var2 = iv5Var.D;
            if ((this.p & 8192) != 8192 || (xu5Var = this.D) == xu5.q) {
                this.D = xu5Var2;
            } else {
                wu5 wu5Var = new wu5((byte) 0);
                wu5Var.p = Collections.EMPTY_LIST;
                wu5Var.k(xu5Var);
                wu5Var.k(xu5Var2);
                this.D = wu5Var.g();
            }
            this.p |= 8192;
        }
        g(iv5Var);
        this.m = this.m.b(iv5Var.n);
    }
}
