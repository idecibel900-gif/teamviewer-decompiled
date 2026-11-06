package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zv5 extends jy2 {
    public int A;
    public aw5 B;
    public int C;
    public int D;
    public int p;
    public List q;
    public boolean r;
    public int s;
    public aw5 t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public aw5 z;

    public static zv5 i() {
        zv5 zv5Var = new zv5();
        zv5Var.q = Collections.EMPTY_LIST;
        aw5 aw5Var = aw5.F;
        zv5Var.t = aw5Var;
        zv5Var.z = aw5Var;
        zv5Var.B = aw5Var;
        return zv5Var;
    }

    @Override // o.fy2
    public final t1 c() {
        aw5 aw5VarH = h();
        if (aw5VarH.a()) {
            return aw5VarH;
        }
        throw new z78();
    }

    public final Object clone() {
        zv5 zv5VarI = i();
        zv5VarI.j(h());
        return zv5VarI;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // o.fy2
    public final fy2 d(vu0 vu0Var, dg2 dg2Var) throws Throwable {
        aw5 aw5Var = null;
        try {
            try {
                aw5.G.getClass();
                j(new aw5(vu0Var, dg2Var));
                return this;
            } catch (rm3 e) {
                aw5 aw5Var2 = (aw5) e.m;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    aw5Var = aw5Var2;
                    if (aw5Var != null) {
                        j(aw5Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (aw5Var != null) {
                j(aw5Var);
            }
            throw th;
        }
    }

    @Override // o.fy2
    public final /* bridge */ /* synthetic */ fy2 e(oy2 oy2Var) {
        j((aw5) oy2Var);
        return this;
    }

    public final aw5 h() {
        aw5 aw5Var = new aw5(this);
        int i = this.p;
        if ((i & 1) == 1) {
            this.q = Collections.unmodifiableList(this.q);
            this.p &= -2;
        }
        aw5Var.p = this.q;
        int i2 = (i & 2) != 2 ? 0 : 1;
        aw5Var.q = this.r;
        if ((i & 4) == 4) {
            i2 |= 2;
        }
        aw5Var.r = this.s;
        if ((i & 8) == 8) {
            i2 |= 4;
        }
        aw5Var.s = this.t;
        if ((i & 16) == 16) {
            i2 |= 8;
        }
        aw5Var.t = this.u;
        if ((i & 32) == 32) {
            i2 |= 16;
        }
        aw5Var.u = this.v;
        if ((i & 64) == 64) {
            i2 |= 32;
        }
        aw5Var.v = this.w;
        if ((i & 128) == 128) {
            i2 |= 64;
        }
        aw5Var.w = this.x;
        if ((i & 256) == 256) {
            i2 |= 128;
        }
        aw5Var.x = this.y;
        if ((i & 512) == 512) {
            i2 |= 256;
        }
        aw5Var.y = this.z;
        if ((i & 1024) == 1024) {
            i2 |= 512;
        }
        aw5Var.z = this.A;
        if ((i & 2048) == 2048) {
            i2 |= 1024;
        }
        aw5Var.A = this.B;
        if ((i & 4096) == 4096) {
            i2 |= 2048;
        }
        aw5Var.B = this.C;
        if ((i & 8192) == 8192) {
            i2 |= 4096;
        }
        aw5Var.C = this.D;
        aw5Var.f368o = i2;
        return aw5Var;
    }

    public final zv5 j(aw5 aw5Var) {
        aw5 aw5Var2;
        aw5 aw5Var3;
        aw5 aw5Var4;
        aw5 aw5Var5 = aw5.F;
        if (aw5Var == aw5Var5) {
            return this;
        }
        if (!aw5Var.p.isEmpty()) {
            if (this.q.isEmpty()) {
                this.q = aw5Var.p;
                this.p &= -2;
            } else {
                if ((this.p & 1) != 1) {
                    this.q = new ArrayList(this.q);
                    this.p |= 1;
                }
                this.q.addAll(aw5Var.p);
            }
        }
        int i = aw5Var.f368o;
        if ((i & 1) == 1) {
            boolean z = aw5Var.q;
            this.p |= 2;
            this.r = z;
        }
        if ((i & 2) == 2) {
            int i2 = aw5Var.r;
            this.p |= 4;
            this.s = i2;
        }
        if ((i & 4) == 4) {
            aw5 aw5Var6 = aw5Var.s;
            if ((this.p & 8) != 8 || (aw5Var4 = this.t) == aw5Var5) {
                this.t = aw5Var6;
            } else {
                zv5 zv5VarQ = aw5.q(aw5Var4);
                zv5VarQ.j(aw5Var6);
                this.t = zv5VarQ.h();
            }
            this.p |= 8;
        }
        int i3 = aw5Var.f368o;
        if ((i3 & 8) == 8) {
            int i4 = aw5Var.t;
            this.p |= 16;
            this.u = i4;
        }
        if ((i3 & 16) == 16) {
            int i5 = aw5Var.u;
            this.p |= 32;
            this.v = i5;
        }
        if ((i3 & 32) == 32) {
            int i6 = aw5Var.v;
            this.p |= 64;
            this.w = i6;
        }
        if ((i3 & 64) == 64) {
            int i7 = aw5Var.w;
            this.p |= 128;
            this.x = i7;
        }
        if ((i3 & 128) == 128) {
            int i8 = aw5Var.x;
            this.p |= 256;
            this.y = i8;
        }
        if ((i3 & 256) == 256) {
            aw5 aw5Var7 = aw5Var.y;
            if ((this.p & 512) != 512 || (aw5Var3 = this.z) == aw5Var5) {
                this.z = aw5Var7;
            } else {
                zv5 zv5VarQ2 = aw5.q(aw5Var3);
                zv5VarQ2.j(aw5Var7);
                this.z = zv5VarQ2.h();
            }
            this.p |= 512;
        }
        int i9 = aw5Var.f368o;
        if ((i9 & 512) == 512) {
            int i10 = aw5Var.z;
            this.p |= 1024;
            this.A = i10;
        }
        if ((i9 & 1024) == 1024) {
            aw5 aw5Var8 = aw5Var.A;
            if ((this.p & 2048) != 2048 || (aw5Var2 = this.B) == aw5Var5) {
                this.B = aw5Var8;
            } else {
                zv5 zv5VarQ3 = aw5.q(aw5Var2);
                zv5VarQ3.j(aw5Var8);
                this.B = zv5VarQ3.h();
            }
            this.p |= 2048;
        }
        int i11 = aw5Var.f368o;
        if ((i11 & 2048) == 2048) {
            int i12 = aw5Var.B;
            this.p |= 4096;
            this.C = i12;
        }
        if ((i11 & 4096) == 4096) {
            int i13 = aw5Var.C;
            this.p |= 8192;
            this.D = i13;
        }
        g(aw5Var);
        this.m = this.m.b(aw5Var.n);
        return this;
    }
}
