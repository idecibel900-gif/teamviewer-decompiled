package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class pv5 extends jy2 {
    public iw5 A;
    public int B;
    public int C;
    public List D;
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

    public static pv5 i() {
        pv5 pv5Var = new pv5();
        pv5Var.q = 518;
        pv5Var.r = 2054;
        aw5 aw5Var = aw5.F;
        pv5Var.t = aw5Var;
        List list = Collections.EMPTY_LIST;
        pv5Var.v = list;
        pv5Var.w = aw5Var;
        pv5Var.y = list;
        pv5Var.z = list;
        pv5Var.A = iw5.x;
        pv5Var.D = list;
        return pv5Var;
    }

    @Override // o.fy2
    public final t1 c() {
        qv5 qv5VarH = h();
        if (qv5VarH.a()) {
            return qv5VarH;
        }
        throw new z78();
    }

    public final Object clone() {
        pv5 pv5VarI = i();
        pv5VarI.j(h());
        return pv5VarI;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // o.fy2
    public final fy2 d(vu0 vu0Var, dg2 dg2Var) throws Throwable {
        qv5 qv5Var = null;
        try {
            try {
                qv5.H.getClass();
                j(new qv5(vu0Var, dg2Var));
                return this;
            } catch (rm3 e) {
                qv5 qv5Var2 = (qv5) e.m;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    qv5Var = qv5Var2;
                    if (qv5Var != null) {
                        j(qv5Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (qv5Var != null) {
                j(qv5Var);
            }
            throw th;
        }
    }

    @Override // o.fy2
    public final /* bridge */ /* synthetic */ fy2 e(oy2 oy2Var) {
        j((qv5) oy2Var);
        return this;
    }

    public final qv5 h() {
        int i;
        qv5 qv5Var = new qv5(this);
        int i2 = this.p;
        int i3 = (i2 & 1) != 1 ? 0 : 1;
        qv5Var.p = this.q;
        if ((i2 & 2) == 2) {
            i3 |= 2;
        }
        qv5Var.q = this.r;
        if ((i2 & 4) == 4) {
            i3 |= 4;
        }
        qv5Var.r = this.s;
        if ((i2 & 8) == 8) {
            i3 |= 8;
        }
        qv5Var.s = this.t;
        if ((i2 & 16) == 16) {
            i3 |= 16;
        }
        qv5Var.t = this.u;
        if ((i2 & 32) == 32) {
            this.v = Collections.unmodifiableList(this.v);
            i = this.p & (-33);
            this.p = i;
        } else {
            i = i2;
        }
        qv5Var.u = this.v;
        if ((i2 & 64) == 64) {
            i3 |= 32;
        }
        qv5Var.v = this.w;
        if ((i2 & 128) == 128) {
            i3 |= 64;
        }
        qv5Var.w = this.x;
        if ((i & 256) == 256) {
            this.y = Collections.unmodifiableList(this.y);
            i = this.p & (-257);
            this.p = i;
        }
        qv5Var.x = this.y;
        if ((i & 512) == 512) {
            this.z = Collections.unmodifiableList(this.z);
            i = this.p & (-513);
            this.p = i;
        }
        qv5Var.y = this.z;
        if ((i2 & 1024) == 1024) {
            i3 |= 128;
        }
        qv5Var.A = this.A;
        if ((i2 & 2048) == 2048) {
            i3 |= 256;
        }
        qv5Var.B = this.B;
        if ((i2 & 4096) == 4096) {
            i3 |= 512;
        }
        qv5Var.C = this.C;
        if ((i & 8192) == 8192) {
            this.D = Collections.unmodifiableList(this.D);
            this.p &= -8193;
        }
        qv5Var.D = this.D;
        qv5Var.f1871o = i3;
        return qv5Var;
    }

    public final void j(qv5 qv5Var) {
        iw5 iw5Var;
        aw5 aw5Var;
        aw5 aw5Var2;
        if (qv5Var == qv5.G) {
            return;
        }
        int i = qv5Var.f1871o;
        if ((i & 1) == 1) {
            int i2 = qv5Var.p;
            this.p = 1 | this.p;
            this.q = i2;
        }
        if ((i & 2) == 2) {
            int i3 = qv5Var.q;
            this.p = 2 | this.p;
            this.r = i3;
        }
        if ((i & 4) == 4) {
            int i4 = qv5Var.r;
            this.p = 4 | this.p;
            this.s = i4;
        }
        if ((i & 8) == 8) {
            aw5 aw5Var3 = qv5Var.s;
            if ((this.p & 8) != 8 || (aw5Var2 = this.t) == aw5.F) {
                this.t = aw5Var3;
            } else {
                zv5 zv5VarQ = aw5.q(aw5Var2);
                zv5VarQ.j(aw5Var3);
                this.t = zv5VarQ.h();
            }
            this.p |= 8;
        }
        if ((qv5Var.f1871o & 16) == 16) {
            int i5 = qv5Var.t;
            this.p = 16 | this.p;
            this.u = i5;
        }
        if (!qv5Var.u.isEmpty()) {
            if (this.v.isEmpty()) {
                this.v = qv5Var.u;
                this.p &= -33;
            } else {
                if ((this.p & 32) != 32) {
                    this.v = new ArrayList(this.v);
                    this.p |= 32;
                }
                this.v.addAll(qv5Var.u);
            }
        }
        if ((qv5Var.f1871o & 32) == 32) {
            aw5 aw5Var4 = qv5Var.v;
            if ((this.p & 64) != 64 || (aw5Var = this.w) == aw5.F) {
                this.w = aw5Var4;
            } else {
                zv5 zv5VarQ2 = aw5.q(aw5Var);
                zv5VarQ2.j(aw5Var4);
                this.w = zv5VarQ2.h();
            }
            this.p |= 64;
        }
        if ((qv5Var.f1871o & 64) == 64) {
            int i6 = qv5Var.w;
            this.p |= 128;
            this.x = i6;
        }
        if (!qv5Var.x.isEmpty()) {
            if (this.y.isEmpty()) {
                this.y = qv5Var.x;
                this.p &= -257;
            } else {
                if ((this.p & 256) != 256) {
                    this.y = new ArrayList(this.y);
                    this.p |= 256;
                }
                this.y.addAll(qv5Var.x);
            }
        }
        if (!qv5Var.y.isEmpty()) {
            if (this.z.isEmpty()) {
                this.z = qv5Var.y;
                this.p &= -513;
            } else {
                if ((this.p & 512) != 512) {
                    this.z = new ArrayList(this.z);
                    this.p |= 512;
                }
                this.z.addAll(qv5Var.y);
            }
        }
        if ((qv5Var.f1871o & 128) == 128) {
            iw5 iw5Var2 = qv5Var.A;
            if ((this.p & 1024) != 1024 || (iw5Var = this.A) == iw5.x) {
                this.A = iw5Var2;
            } else {
                hw5 hw5Var = new hw5();
                aw5 aw5Var5 = aw5.F;
                hw5Var.s = aw5Var5;
                hw5Var.u = aw5Var5;
                hw5Var.i(iw5Var);
                hw5Var.i(iw5Var2);
                this.A = hw5Var.h();
            }
            this.p |= 1024;
        }
        int i7 = qv5Var.f1871o;
        if ((i7 & 256) == 256) {
            int i8 = qv5Var.B;
            this.p |= 2048;
            this.B = i8;
        }
        if ((i7 & 512) == 512) {
            int i9 = qv5Var.C;
            this.p |= 4096;
            this.C = i9;
        }
        if (!qv5Var.D.isEmpty()) {
            if (this.D.isEmpty()) {
                this.D = qv5Var.D;
                this.p &= -8193;
            } else {
                if ((this.p & 8192) != 8192) {
                    this.D = new ArrayList(this.D);
                    this.p |= 8192;
                }
                this.D.addAll(qv5Var.D);
            }
        }
        g(qv5Var);
        this.m = this.m.b(qv5Var.n);
    }
}
