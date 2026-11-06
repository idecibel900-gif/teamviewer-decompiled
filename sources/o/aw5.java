package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class aw5 extends ky2 {
    public static final aw5 F;
    public static final ys3 G = new ys3((byte) 21);
    public aw5 A;
    public int B;
    public int C;
    public byte D;
    public int E;
    public final zh0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f368o;
    public List p;
    public boolean q;
    public int r;
    public aw5 s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public aw5 y;
    public int z;

    static {
        aw5 aw5Var = new aw5();
        F = aw5Var;
        aw5Var.p();
    }

    public aw5(vu0 vu0Var, dg2 dg2Var) {
        this.D = (byte) -1;
        this.E = -1;
        p();
        xh0 xh0Var = new xh0();
        cv0 cv0VarR = cv0.r(xh0Var, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int iM = vu0Var.m();
                    ys3 ys3Var = G;
                    zv5 zv5VarQ = null;
                    switch (iM) {
                        case 0:
                            break;
                        case 8:
                            this.f368o |= 4096;
                            this.C = vu0Var.j();
                            continue;
                        case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                            if (!z2) {
                                this.p = new ArrayList();
                                z2 = true;
                            }
                            this.p.add(vu0Var.f(yv5.u, dg2Var));
                            continue;
                        case 24:
                            this.f368o |= 1;
                            this.q = vu0Var.k() != 0;
                            continue;
                        case 32:
                            this.f368o |= 2;
                            this.r = vu0Var.j();
                            continue;
                        case 42:
                            if ((this.f368o & 4) == 4) {
                                aw5 aw5Var = this.s;
                                aw5Var.getClass();
                                zv5VarQ = q(aw5Var);
                            }
                            aw5 aw5Var2 = (aw5) vu0Var.f(ys3Var, dg2Var);
                            this.s = aw5Var2;
                            if (zv5VarQ != null) {
                                zv5VarQ.j(aw5Var2);
                                this.s = zv5VarQ.h();
                            }
                            this.f368o |= 4;
                            continue;
                        case 48:
                            this.f368o |= 16;
                            this.u = vu0Var.j();
                            continue;
                        case 56:
                            this.f368o |= 32;
                            this.v = vu0Var.j();
                            continue;
                        case 64:
                            this.f368o |= 8;
                            this.t = vu0Var.j();
                            continue;
                        case 72:
                            this.f368o |= 64;
                            this.w = vu0Var.j();
                            continue;
                        case 82:
                            if ((this.f368o & 256) == 256) {
                                aw5 aw5Var3 = this.y;
                                aw5Var3.getClass();
                                zv5VarQ = q(aw5Var3);
                            }
                            aw5 aw5Var4 = (aw5) vu0Var.f(ys3Var, dg2Var);
                            this.y = aw5Var4;
                            if (zv5VarQ != null) {
                                zv5VarQ.j(aw5Var4);
                                this.y = zv5VarQ.h();
                            }
                            this.f368o |= 256;
                            continue;
                        case 88:
                            this.f368o |= 512;
                            this.z = vu0Var.j();
                            continue;
                        case 96:
                            this.f368o |= 128;
                            this.x = vu0Var.j();
                            continue;
                        case 106:
                            if ((this.f368o & 1024) == 1024) {
                                aw5 aw5Var5 = this.A;
                                aw5Var5.getClass();
                                zv5VarQ = q(aw5Var5);
                            }
                            aw5 aw5Var6 = (aw5) vu0Var.f(ys3Var, dg2Var);
                            this.A = aw5Var6;
                            if (zv5VarQ != null) {
                                zv5VarQ.j(aw5Var6);
                                this.A = zv5VarQ.h();
                            }
                            this.f368o |= 1024;
                            continue;
                        case 112:
                            this.f368o |= 2048;
                            this.B = vu0Var.j();
                            continue;
                        default:
                            if (!n(vu0Var, cv0VarR, dg2Var, iM)) {
                                break;
                            }
                            break;
                    }
                    z = true;
                } catch (Throwable th) {
                    if (z2) {
                        this.p = Collections.unmodifiableList(this.p);
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
        if (z2) {
            this.p = Collections.unmodifiableList(this.p);
        }
        try {
            cv0VarR.u();
        } catch (IOException unused2) {
        } finally {
            this.n = xh0Var.q();
        }
        m();
    }

    public static zv5 q(aw5 aw5Var) {
        zv5 zv5VarI = zv5.i();
        zv5VarI.j(aw5Var);
        return zv5VarI;
    }

    @Override // o.rq4
    public final boolean a() {
        byte b = this.D;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.p.size(); i++) {
            if (!((yv5) this.p.get(i)).a()) {
                this.D = (byte) 0;
                return false;
            }
        }
        if ((this.f368o & 4) == 4 && !this.s.a()) {
            this.D = (byte) 0;
            return false;
        }
        if ((this.f368o & 256) == 256 && !this.y.a()) {
            this.D = (byte) 0;
            return false;
        }
        if ((this.f368o & 1024) == 1024 && !this.A.a()) {
            this.D = (byte) 0;
            return false;
        }
        if (i()) {
            this.D = (byte) 1;
            return true;
        }
        this.D = (byte) 0;
        return false;
    }

    @Override // o.rq4
    public final t1 b() {
        return F;
    }

    @Override // o.t1
    public final int c() {
        int i = this.E;
        if (i != -1) {
            return i;
        }
        int iC = (this.f368o & 4096) == 4096 ? cv0.c(1, this.C) : 0;
        for (int i2 = 0; i2 < this.p.size(); i2++) {
            iC += cv0.e(2, (t1) this.p.get(i2));
        }
        if ((this.f368o & 1) == 1) {
            iC += cv0.i(3) + 1;
        }
        if ((this.f368o & 2) == 2) {
            iC += cv0.c(4, this.r);
        }
        if ((this.f368o & 4) == 4) {
            iC += cv0.e(5, this.s);
        }
        if ((this.f368o & 16) == 16) {
            iC += cv0.c(6, this.u);
        }
        if ((this.f368o & 32) == 32) {
            iC += cv0.c(7, this.v);
        }
        if ((this.f368o & 8) == 8) {
            iC += cv0.c(8, this.t);
        }
        if ((this.f368o & 64) == 64) {
            iC += cv0.c(9, this.w);
        }
        if ((this.f368o & 256) == 256) {
            iC += cv0.e(10, this.y);
        }
        if ((this.f368o & 512) == 512) {
            iC += cv0.c(11, this.z);
        }
        if ((this.f368o & 128) == 128) {
            iC += cv0.c(12, this.x);
        }
        if ((this.f368o & 1024) == 1024) {
            iC += cv0.e(13, this.A);
        }
        if ((this.f368o & 2048) == 2048) {
            iC += cv0.c(14, this.B);
        }
        int size = this.n.size() + j() + iC;
        this.E = size;
        return size;
    }

    @Override // o.t1
    public final fy2 d() {
        return zv5.i();
    }

    @Override // o.t1
    public final fy2 e() {
        return q(this);
    }

    @Override // o.t1
    public final void f(cv0 cv0Var) throws IOException {
        c();
        yt2 yt2Var = new yt2(this);
        if ((this.f368o & 4096) == 4096) {
            cv0Var.x(1, this.C);
        }
        for (int i = 0; i < this.p.size(); i++) {
            cv0Var.z(2, (t1) this.p.get(i));
        }
        if ((this.f368o & 1) == 1) {
            boolean z = this.q;
            cv0Var.I(3, 0);
            cv0Var.B(z ? 1 : 0);
        }
        if ((this.f368o & 2) == 2) {
            cv0Var.x(4, this.r);
        }
        if ((this.f368o & 4) == 4) {
            cv0Var.z(5, this.s);
        }
        if ((this.f368o & 16) == 16) {
            cv0Var.x(6, this.u);
        }
        if ((this.f368o & 32) == 32) {
            cv0Var.x(7, this.v);
        }
        if ((this.f368o & 8) == 8) {
            cv0Var.x(8, this.t);
        }
        if ((this.f368o & 64) == 64) {
            cv0Var.x(9, this.w);
        }
        if ((this.f368o & 256) == 256) {
            cv0Var.z(10, this.y);
        }
        if ((this.f368o & 512) == 512) {
            cv0Var.x(11, this.z);
        }
        if ((this.f368o & 128) == 128) {
            cv0Var.x(12, this.x);
        }
        if ((this.f368o & 1024) == 1024) {
            cv0Var.z(13, this.A);
        }
        if ((this.f368o & 2048) == 2048) {
            cv0Var.x(14, this.B);
        }
        yt2Var.P(200, cv0Var);
        cv0Var.C(this.n);
    }

    public final void p() {
        this.p = Collections.EMPTY_LIST;
        this.q = false;
        this.r = 0;
        aw5 aw5Var = F;
        this.s = aw5Var;
        this.t = 0;
        this.u = 0;
        this.v = 0;
        this.w = 0;
        this.x = 0;
        this.y = aw5Var;
        this.z = 0;
        this.A = aw5Var;
        this.B = 0;
        this.C = 0;
    }

    public aw5() {
        this.D = (byte) -1;
        this.E = -1;
        this.n = zh0.m;
    }

    public aw5(zv5 zv5Var) {
        super(zv5Var);
        this.D = (byte) -1;
        this.E = -1;
        this.n = zv5Var.m;
    }
}
