package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class nu5 extends oy2 {
    public static final nu5 B;
    public static final ys3 C = new ys3((byte) 7);
    public int A;
    public final zh0 m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public mu5 f1602o;
    public long p;
    public float q;
    public double r;
    public int s;
    public int t;
    public int u;
    public qu5 v;
    public List w;
    public int x;
    public int y;
    public byte z;

    static {
        nu5 nu5Var = new nu5();
        B = nu5Var;
        nu5Var.i();
    }

    public nu5(vu0 vu0Var, dg2 dg2Var) {
        pu5 pu5Var;
        this.z = (byte) -1;
        this.A = -1;
        i();
        xh0 xh0Var = new xh0();
        cv0 cv0VarR = cv0.r(xh0Var, 1);
        byte b = 0;
        boolean z = false;
        char c = 0;
        while (!z) {
            try {
                try {
                    try {
                        int iM = vu0Var.m();
                        switch (iM) {
                            case 0:
                                break;
                            case 8:
                                int iJ = vu0Var.j();
                                mu5 mu5VarA = mu5.a(iJ);
                                if (mu5VarA == null) {
                                    cv0VarR.G(iM);
                                    cv0VarR.G(iJ);
                                } else {
                                    this.n |= 1;
                                    this.f1602o = mu5VarA;
                                    continue;
                                }
                                break;
                            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                                this.n |= 2;
                                long jK = vu0Var.k();
                                this.p = (-(jK & 1)) ^ (jK >>> 1);
                                continue;
                            case 29:
                                this.n |= 4;
                                this.q = Float.intBitsToFloat(vu0Var.h());
                                continue;
                            case 33:
                                this.n |= 8;
                                this.r = Double.longBitsToDouble(vu0Var.i());
                                continue;
                            case 40:
                                this.n |= 16;
                                this.s = vu0Var.j();
                                continue;
                            case 48:
                                this.n |= 32;
                                this.t = vu0Var.j();
                                continue;
                            case 56:
                                this.n |= 64;
                                this.u = vu0Var.j();
                                continue;
                            case 66:
                                if ((this.n & 128) == 128) {
                                    qu5 qu5Var = this.v;
                                    qu5Var.getClass();
                                    pu5Var = new pu5(b);
                                    pu5Var.p = Collections.EMPTY_LIST;
                                    pu5Var.k(qu5Var);
                                } else {
                                    pu5Var = null;
                                }
                                qu5 qu5Var2 = (qu5) vu0Var.f(qu5.t, dg2Var);
                                this.v = qu5Var2;
                                if (pu5Var != null) {
                                    pu5Var.k(qu5Var2);
                                    this.v = pu5Var.h();
                                }
                                this.n |= 128;
                                continue;
                            case 74:
                                if ((c & 256) != 256) {
                                    this.w = new ArrayList();
                                    c = 256;
                                }
                                this.w.add(vu0Var.f(C, dg2Var));
                                continue;
                            case 80:
                                this.n |= 512;
                                this.y = vu0Var.j();
                                continue;
                            case 88:
                                this.n |= 256;
                                this.x = vu0Var.j();
                                continue;
                            default:
                                if (!vu0Var.p(iM, cv0VarR)) {
                                    break;
                                }
                                break;
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
                if ((c & 256) == 256) {
                    this.w = Collections.unmodifiableList(this.w);
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
        if ((c & 256) == 256) {
            this.w = Collections.unmodifiableList(this.w);
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
        byte b = this.z;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.n & 128) == 128 && !this.v.a()) {
            this.z = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.w.size(); i++) {
            if (!((nu5) this.w.get(i)).a()) {
                this.z = (byte) 0;
                return false;
            }
        }
        this.z = (byte) 1;
        return true;
    }

    @Override // o.t1
    public final int c() {
        int i = this.A;
        if (i != -1) {
            return i;
        }
        int iB = (this.n & 1) == 1 ? cv0.b(1, this.f1602o.m) : 0;
        if ((this.n & 2) == 2) {
            long j = this.p;
            iB += cv0.h((j >> 63) ^ (j << 1)) + cv0.i(2);
        }
        if ((this.n & 4) == 4) {
            iB += cv0.i(3) + 4;
        }
        if ((this.n & 8) == 8) {
            iB += cv0.i(4) + 8;
        }
        if ((this.n & 16) == 16) {
            iB += cv0.c(5, this.s);
        }
        if ((this.n & 32) == 32) {
            iB += cv0.c(6, this.t);
        }
        if ((this.n & 64) == 64) {
            iB += cv0.c(7, this.u);
        }
        if ((this.n & 128) == 128) {
            iB += cv0.e(8, this.v);
        }
        for (int i2 = 0; i2 < this.w.size(); i2++) {
            iB += cv0.e(9, (t1) this.w.get(i2));
        }
        if ((this.n & 512) == 512) {
            iB += cv0.c(10, this.y);
        }
        if ((this.n & 256) == 256) {
            iB += cv0.c(11, this.x);
        }
        int size = this.m.size() + iB;
        this.A = size;
        return size;
    }

    @Override // o.t1
    public final fy2 d() {
        return lu5.h();
    }

    @Override // o.t1
    public final fy2 e() {
        lu5 lu5VarH = lu5.h();
        lu5VarH.i(this);
        return lu5VarH;
    }

    @Override // o.t1
    public final void f(cv0 cv0Var) throws IOException {
        c();
        if ((this.n & 1) == 1) {
            cv0Var.w(1, this.f1602o.m);
        }
        if ((this.n & 2) == 2) {
            long j = this.p;
            cv0Var.I(2, 0);
            cv0Var.H((j >> 63) ^ (j << 1));
        }
        if ((this.n & 4) == 4) {
            float f = this.q;
            cv0Var.I(3, 5);
            cv0Var.E(Float.floatToRawIntBits(f));
        }
        if ((this.n & 8) == 8) {
            double d = this.r;
            cv0Var.I(4, 1);
            cv0Var.F(Double.doubleToRawLongBits(d));
        }
        if ((this.n & 16) == 16) {
            cv0Var.x(5, this.s);
        }
        if ((this.n & 32) == 32) {
            cv0Var.x(6, this.t);
        }
        if ((this.n & 64) == 64) {
            cv0Var.x(7, this.u);
        }
        if ((this.n & 128) == 128) {
            cv0Var.z(8, this.v);
        }
        for (int i = 0; i < this.w.size(); i++) {
            cv0Var.z(9, (t1) this.w.get(i));
        }
        if ((this.n & 512) == 512) {
            cv0Var.x(10, this.y);
        }
        if ((this.n & 256) == 256) {
            cv0Var.x(11, this.x);
        }
        cv0Var.C(this.m);
    }

    public final void i() {
        this.f1602o = mu5.BYTE;
        this.p = 0L;
        this.q = 0.0f;
        this.r = 0.0d;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = qu5.s;
        this.w = Collections.EMPTY_LIST;
        this.x = 0;
        this.y = 0;
    }

    public nu5() {
        this.z = (byte) -1;
        this.A = -1;
        this.m = zh0.m;
    }

    public nu5(lu5 lu5Var) {
        this.z = (byte) -1;
        this.A = -1;
        this.m = lu5Var.m;
    }
}
