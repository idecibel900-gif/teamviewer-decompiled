package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class tu5 extends ky2 {
    public static final tu5 V;
    public static final ys3 W = new ys3(8);
    public int A;
    public List B;
    public List C;
    public List D;
    public List E;
    public List F;
    public List G;
    public int H;
    public int I;
    public aw5 J;
    public int K;
    public List L;
    public int M;
    public List N;
    public List O;
    public int P;
    public gw5 Q;
    public List R;
    public nw5 S;
    public byte T;
    public int U;
    public final zh0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2145o;
    public int p;
    public int q;
    public int r;
    public List s;
    public List t;
    public List u;
    public int v;
    public List w;
    public int x;
    public List y;
    public List z;

    static {
        tu5 tu5Var = new tu5();
        V = tu5Var;
        tu5Var.p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public tu5(vu0 vu0Var, dg2 dg2Var) {
        wu5 wu5Var;
        this.v = -1;
        this.x = -1;
        this.A = -1;
        this.H = -1;
        this.M = -1;
        this.P = -1;
        this.T = (byte) -1;
        this.U = -1;
        p();
        xh0 xh0VarI = zh0.i();
        boolean z = true;
        cv0 cv0VarR = cv0.r(xh0VarI, 1);
        boolean z2 = false;
        int i = 0;
        while (true) {
            boolean z3 = z;
            if (z2) {
                if ((i & 32) == 32) {
                    this.u = Collections.unmodifiableList(this.u);
                }
                if ((i & 8) == 8) {
                    this.s = Collections.unmodifiableList(this.s);
                }
                if ((i & 16) == 16) {
                    this.t = Collections.unmodifiableList(this.t);
                }
                if ((i & 64) == 64) {
                    this.w = Collections.unmodifiableList(this.w);
                }
                if ((i & 512) == 512) {
                    this.B = Collections.unmodifiableList(this.B);
                }
                if ((i & 1024) == 1024) {
                    this.C = Collections.unmodifiableList(this.C);
                }
                if ((i & 2048) == 2048) {
                    this.D = Collections.unmodifiableList(this.D);
                }
                if ((i & 4096) == 4096) {
                    this.E = Collections.unmodifiableList(this.E);
                }
                if ((i & 8192) == 8192) {
                    this.F = Collections.unmodifiableList(this.F);
                }
                if ((i & 16384) == 16384) {
                    this.G = Collections.unmodifiableList(this.G);
                }
                if ((i & 128) == 128) {
                    this.y = Collections.unmodifiableList(this.y);
                }
                if ((i & 256) == 256) {
                    this.z = Collections.unmodifiableList(this.z);
                }
                if ((i & 262144) == 262144) {
                    this.L = Collections.unmodifiableList(this.L);
                }
                if ((i & 524288) == 524288) {
                    this.N = Collections.unmodifiableList(this.N);
                }
                if ((i & 1048576) == 1048576) {
                    this.O = Collections.unmodifiableList(this.O);
                }
                if ((i & 4194304) == 4194304) {
                    this.R = Collections.unmodifiableList(this.R);
                }
                try {
                    cv0VarR.j();
                } catch (IOException unused) {
                } finally {
                    this.n = xh0VarI.q();
                }
                m();
                return;
            }
            try {
                try {
                    try {
                        int iM = vu0Var.m();
                        byte b = 2;
                        Cloneable cloneableQ = null;
                        switch (iM) {
                            case 0:
                                break;
                            case 8:
                                this.f2145o |= 1;
                                this.p = vu0Var.j();
                                continue;
                                z = z3;
                                break;
                            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                                if ((i & 32) != 32) {
                                    this.u = new ArrayList();
                                    i |= 32;
                                }
                                this.u.add(Integer.valueOf(vu0Var.j()));
                                continue;
                                z = z3;
                                break;
                            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                                int iD = vu0Var.d(vu0Var.j());
                                if ((i & 32) != 32 && vu0Var.b() > 0) {
                                    this.u = new ArrayList();
                                    i |= 32;
                                }
                                while (vu0Var.b() > 0) {
                                    this.u.add(Integer.valueOf(vu0Var.j()));
                                }
                                vu0Var.c(iD);
                                continue;
                                z = z3;
                                break;
                            case 24:
                                this.f2145o = 2 | this.f2145o;
                                this.q = vu0Var.j();
                                continue;
                                z = z3;
                                break;
                            case 32:
                                this.f2145o |= 4;
                                this.r = vu0Var.j();
                                continue;
                                z = z3;
                                break;
                            case 42:
                                if ((i & 8) != 8) {
                                    this.s = new ArrayList();
                                    i |= 8;
                                }
                                this.s.add(vu0Var.f(fw5.z, dg2Var));
                                continue;
                                z = z3;
                                break;
                            case 50:
                                if ((i & 16) != 16) {
                                    this.t = new ArrayList();
                                    i |= 16;
                                }
                                this.t.add(vu0Var.f(aw5.G, dg2Var));
                                continue;
                                z = z3;
                                break;
                            case 56:
                                if ((i & 64) != 64) {
                                    this.w = new ArrayList();
                                    i |= 64;
                                }
                                this.w.add(Integer.valueOf(vu0Var.j()));
                                continue;
                                z = z3;
                                break;
                            case 58:
                                int iD2 = vu0Var.d(vu0Var.j());
                                if ((i & 64) != 64 && vu0Var.b() > 0) {
                                    this.w = new ArrayList();
                                    i |= 64;
                                }
                                while (vu0Var.b() > 0) {
                                    this.w.add(Integer.valueOf(vu0Var.j()));
                                }
                                vu0Var.c(iD2);
                                continue;
                                z = z3;
                                break;
                            case 66:
                                if ((i & 512) != 512) {
                                    this.B = new ArrayList();
                                    i |= 512;
                                }
                                this.B.add(vu0Var.f(vu5.v, dg2Var));
                                continue;
                                z = z3;
                                break;
                            case 74:
                                if ((i & 1024) != 1024) {
                                    this.C = new ArrayList();
                                    i |= 1024;
                                }
                                this.C.add(vu0Var.f(iv5.H, dg2Var));
                                continue;
                                z = z3;
                                break;
                            case 82:
                                if ((i & 2048) != 2048) {
                                    this.D = new ArrayList();
                                    i |= 2048;
                                }
                                this.D.add(vu0Var.f(qv5.H, dg2Var));
                                continue;
                                z = z3;
                                break;
                            case 90:
                                if ((i & 4096) != 4096) {
                                    this.E = new ArrayList();
                                    i |= 4096;
                                }
                                this.E.add(vu0Var.f(cw5.B, dg2Var));
                                continue;
                                z = z3;
                                break;
                            case 106:
                                if ((i & 8192) != 8192) {
                                    this.F = new ArrayList();
                                    i |= 8192;
                                }
                                this.F.add(vu0Var.f(dv5.t, dg2Var));
                                continue;
                                z = z3;
                                break;
                            case 128:
                                if ((i & 16384) != 16384) {
                                    this.G = new ArrayList();
                                    i |= 16384;
                                }
                                this.G.add(Integer.valueOf(vu0Var.j()));
                                continue;
                                z = z3;
                                break;
                            case 130:
                                int iD3 = vu0Var.d(vu0Var.j());
                                if ((i & 16384) != 16384 && vu0Var.b() > 0) {
                                    this.G = new ArrayList();
                                    i |= 16384;
                                }
                                while (vu0Var.b() > 0) {
                                    this.G.add(Integer.valueOf(vu0Var.j()));
                                }
                                vu0Var.c(iD3);
                                continue;
                                z = z3;
                                break;
                            case 136:
                                this.f2145o |= 8;
                                this.I = vu0Var.j();
                                continue;
                                z = z3;
                                break;
                            case 146:
                                if ((this.f2145o & 16) == 16) {
                                    aw5 aw5Var = this.J;
                                    aw5Var.getClass();
                                    cloneableQ = aw5.q(aw5Var);
                                }
                                zv5 zv5Var = cloneableQ;
                                aw5 aw5Var2 = (aw5) vu0Var.f(aw5.G, dg2Var);
                                this.J = aw5Var2;
                                if (zv5Var != 0) {
                                    zv5Var.j(aw5Var2);
                                    this.J = zv5Var.h();
                                }
                                this.f2145o |= 16;
                                continue;
                                z = z3;
                                break;
                            case 152:
                                this.f2145o |= 32;
                                this.K = vu0Var.j();
                                continue;
                                z = z3;
                                break;
                            case 162:
                                if ((i & 128) != 128) {
                                    this.y = new ArrayList();
                                    i |= 128;
                                }
                                this.y.add(vu0Var.f(aw5.G, dg2Var));
                                continue;
                                z = z3;
                                break;
                            case 168:
                                if ((i & 256) != 256) {
                                    this.z = new ArrayList();
                                    i |= 256;
                                }
                                this.z.add(Integer.valueOf(vu0Var.j()));
                                continue;
                                z = z3;
                                break;
                            case 170:
                                int iD4 = vu0Var.d(vu0Var.j());
                                if ((i & 256) != 256 && vu0Var.b() > 0) {
                                    this.z = new ArrayList();
                                    i |= 256;
                                }
                                while (vu0Var.b() > 0) {
                                    this.z.add(Integer.valueOf(vu0Var.j()));
                                }
                                vu0Var.c(iD4);
                                continue;
                                z = z3;
                                break;
                            case 176:
                                if ((i & 262144) != 262144) {
                                    this.L = new ArrayList();
                                    i |= 262144;
                                }
                                this.L.add(Integer.valueOf(vu0Var.j()));
                                continue;
                                z = z3;
                                break;
                            case 178:
                                int iD5 = vu0Var.d(vu0Var.j());
                                if ((i & 262144) != 262144 && vu0Var.b() > 0) {
                                    this.L = new ArrayList();
                                    i |= 262144;
                                }
                                while (vu0Var.b() > 0) {
                                    this.L.add(Integer.valueOf(vu0Var.j()));
                                }
                                vu0Var.c(iD5);
                                continue;
                                z = z3;
                                break;
                            case 186:
                                if ((i & 524288) != 524288) {
                                    this.N = new ArrayList();
                                    i |= 524288;
                                }
                                this.N.add(vu0Var.f(aw5.G, dg2Var));
                                continue;
                                z = z3;
                                break;
                            case 192:
                                if ((i & 1048576) != 1048576) {
                                    this.O = new ArrayList();
                                    i |= 1048576;
                                }
                                this.O.add(Integer.valueOf(vu0Var.j()));
                                continue;
                                z = z3;
                                break;
                            case 194:
                                int iD6 = vu0Var.d(vu0Var.j());
                                if ((i & 1048576) != 1048576 && vu0Var.b() > 0) {
                                    this.O = new ArrayList();
                                    i |= 1048576;
                                }
                                while (vu0Var.b() > 0) {
                                    this.O.add(Integer.valueOf(vu0Var.j()));
                                }
                                vu0Var.c(iD6);
                                continue;
                                z = z3;
                                break;
                            case 242:
                                if ((this.f2145o & 64) == 64) {
                                    gw5 gw5Var = this.Q;
                                    gw5Var.getClass();
                                    cloneableQ = gw5.i(gw5Var);
                                }
                                pu5 pu5Var = cloneableQ;
                                gw5 gw5Var2 = (gw5) vu0Var.f(gw5.t, dg2Var);
                                this.Q = gw5Var2;
                                if (pu5Var != 0) {
                                    pu5Var.l(gw5Var2);
                                    this.Q = pu5Var.i();
                                }
                                this.f2145o |= 64;
                                continue;
                                z = z3;
                                break;
                            case 248:
                                if ((i & 4194304) != 4194304) {
                                    this.R = new ArrayList();
                                    i |= 4194304;
                                }
                                this.R.add(Integer.valueOf(vu0Var.j()));
                                continue;
                                z = z3;
                                break;
                            case 250:
                                int iD7 = vu0Var.d(vu0Var.j());
                                if ((i & 4194304) != 4194304 && vu0Var.b() > 0) {
                                    this.R = new ArrayList();
                                    i |= 4194304;
                                }
                                while (vu0Var.b() > 0) {
                                    this.R.add(Integer.valueOf(vu0Var.j()));
                                }
                                vu0Var.c(iD7);
                                continue;
                                z = z3;
                                break;
                            case 258:
                                if ((this.f2145o & 128) == 128) {
                                    nw5 nw5Var = this.S;
                                    nw5Var.getClass();
                                    wu5Var = new wu5(b);
                                    wu5Var.p = Collections.EMPTY_LIST;
                                    wu5Var.n(nw5Var);
                                } else {
                                    wu5Var = null;
                                }
                                nw5 nw5Var2 = (nw5) vu0Var.f(nw5.r, dg2Var);
                                this.S = nw5Var2;
                                if (wu5Var != null) {
                                    wu5Var.n(nw5Var2);
                                    this.S = wu5Var.j();
                                }
                                this.f2145o |= 128;
                                continue;
                                z = z3;
                                break;
                            default:
                                if (!n(vu0Var, cv0VarR, dg2Var, iM)) {
                                }
                                z = z3;
                                break;
                        }
                        z2 = z3;
                        z = z3;
                    } catch (IOException e) {
                        rm3 rm3Var = new rm3(e.getMessage());
                        rm3Var.m = this;
                        throw rm3Var;
                    }
                } catch (rm3 e2) {
                    e2.m = this;
                    throw e2;
                }
            } catch (Throwable th) {
                if ((i & 32) == 32) {
                    this.u = Collections.unmodifiableList(this.u);
                }
                if ((i & 8) == 8) {
                    this.s = Collections.unmodifiableList(this.s);
                }
                if ((i & 16) == 16) {
                    this.t = Collections.unmodifiableList(this.t);
                }
                if ((i & 64) == 64) {
                    this.w = Collections.unmodifiableList(this.w);
                }
                if ((i & 512) == 512) {
                    this.B = Collections.unmodifiableList(this.B);
                }
                if ((i & 1024) == 1024) {
                    this.C = Collections.unmodifiableList(this.C);
                }
                if ((i & 2048) == 2048) {
                    this.D = Collections.unmodifiableList(this.D);
                }
                if ((i & 4096) == 4096) {
                    this.E = Collections.unmodifiableList(this.E);
                }
                if ((i & 8192) == 8192) {
                    this.F = Collections.unmodifiableList(this.F);
                }
                if ((i & 16384) == 16384) {
                    this.G = Collections.unmodifiableList(this.G);
                }
                if ((i & 128) == 128) {
                    this.y = Collections.unmodifiableList(this.y);
                }
                if ((i & 256) == 256) {
                    this.z = Collections.unmodifiableList(this.z);
                }
                if ((i & 262144) == 262144) {
                    this.L = Collections.unmodifiableList(this.L);
                }
                if ((i & 524288) == 524288) {
                    this.N = Collections.unmodifiableList(this.N);
                }
                if ((i & 1048576) == 1048576) {
                    this.O = Collections.unmodifiableList(this.O);
                }
                if ((i & 4194304) == 4194304) {
                    this.R = Collections.unmodifiableList(this.R);
                }
                try {
                    cv0VarR.j();
                } catch (IOException unused2) {
                } finally {
                    this.n = xh0VarI.q();
                }
                m();
                throw th;
            }
        }
    }

    @Override // o.rq4
    public final boolean a() {
        byte b = this.T;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.f2145o & 2) != 2) {
            this.T = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.s.size(); i++) {
            if (!((fw5) this.s.get(i)).a()) {
                this.T = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.t.size(); i2++) {
            if (!((aw5) this.t.get(i2)).a()) {
                this.T = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.y.size(); i3++) {
            if (!((aw5) this.y.get(i3)).a()) {
                this.T = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < this.B.size(); i4++) {
            if (!((vu5) this.B.get(i4)).a()) {
                this.T = (byte) 0;
                return false;
            }
        }
        for (int i5 = 0; i5 < this.C.size(); i5++) {
            if (!((iv5) this.C.get(i5)).a()) {
                this.T = (byte) 0;
                return false;
            }
        }
        for (int i6 = 0; i6 < this.D.size(); i6++) {
            if (!((qv5) this.D.get(i6)).a()) {
                this.T = (byte) 0;
                return false;
            }
        }
        for (int i7 = 0; i7 < this.E.size(); i7++) {
            if (!((cw5) this.E.get(i7)).a()) {
                this.T = (byte) 0;
                return false;
            }
        }
        for (int i8 = 0; i8 < this.F.size(); i8++) {
            if (!((dv5) this.F.get(i8)).a()) {
                this.T = (byte) 0;
                return false;
            }
        }
        if ((this.f2145o & 16) == 16 && !this.J.a()) {
            this.T = (byte) 0;
            return false;
        }
        for (int i9 = 0; i9 < this.N.size(); i9++) {
            if (!((aw5) this.N.get(i9)).a()) {
                this.T = (byte) 0;
                return false;
            }
        }
        if ((this.f2145o & 64) == 64 && !this.Q.a()) {
            this.T = (byte) 0;
            return false;
        }
        if (i()) {
            this.T = (byte) 1;
            return true;
        }
        this.T = (byte) 0;
        return false;
    }

    @Override // o.rq4
    public final t1 b() {
        return V;
    }

    @Override // o.t1
    public final int c() {
        List list;
        List list2;
        List list3;
        List list4;
        List list5;
        List list6;
        List list7;
        int i = this.U;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int iC = (this.f2145o & 1) == 1 ? cv0.c(1, this.p) : 0;
        int i3 = 0;
        int iD = 0;
        while (true) {
            int size = this.u.size();
            list = this.u;
            if (i3 >= size) {
                break;
            }
            iD += cv0.d(((Integer) list.get(i3)).intValue());
            i3++;
        }
        int iE = iC + iD;
        if (!list.isEmpty()) {
            iE = iE + 1 + cv0.d(iD);
        }
        this.v = iD;
        if ((this.f2145o & 2) == 2) {
            iE += cv0.c(3, this.q);
        }
        if ((this.f2145o & 4) == 4) {
            iE += cv0.c(4, this.r);
        }
        for (int i4 = 0; i4 < this.s.size(); i4++) {
            iE += cv0.e(5, (t1) this.s.get(i4));
        }
        for (int i5 = 0; i5 < this.t.size(); i5++) {
            iE += cv0.e(6, (t1) this.t.get(i5));
        }
        int i6 = 0;
        int iD2 = 0;
        while (true) {
            int size2 = this.w.size();
            list2 = this.w;
            if (i6 >= size2) {
                break;
            }
            iD2 += cv0.d(((Integer) list2.get(i6)).intValue());
            i6++;
        }
        int iE2 = iE + iD2;
        if (!list2.isEmpty()) {
            iE2 = iE2 + 1 + cv0.d(iD2);
        }
        this.x = iD2;
        for (int i7 = 0; i7 < this.B.size(); i7++) {
            iE2 += cv0.e(8, (t1) this.B.get(i7));
        }
        for (int i8 = 0; i8 < this.C.size(); i8++) {
            iE2 += cv0.e(9, (t1) this.C.get(i8));
        }
        for (int i9 = 0; i9 < this.D.size(); i9++) {
            iE2 += cv0.e(10, (t1) this.D.get(i9));
        }
        for (int i10 = 0; i10 < this.E.size(); i10++) {
            iE2 += cv0.e(11, (t1) this.E.get(i10));
        }
        for (int i11 = 0; i11 < this.F.size(); i11++) {
            iE2 += cv0.e(13, (t1) this.F.get(i11));
        }
        int i12 = 0;
        int iD3 = 0;
        while (true) {
            int size3 = this.G.size();
            list3 = this.G;
            if (i12 >= size3) {
                break;
            }
            iD3 += cv0.d(((Integer) list3.get(i12)).intValue());
            i12++;
        }
        int iE3 = iE2 + iD3;
        if (!list3.isEmpty()) {
            iE3 = iE3 + 2 + cv0.d(iD3);
        }
        this.H = iD3;
        if ((this.f2145o & 8) == 8) {
            iE3 += cv0.c(17, this.I);
        }
        if ((this.f2145o & 16) == 16) {
            iE3 += cv0.e(18, this.J);
        }
        if ((this.f2145o & 32) == 32) {
            iE3 += cv0.c(19, this.K);
        }
        for (int i13 = 0; i13 < this.y.size(); i13++) {
            iE3 += cv0.e(20, (t1) this.y.get(i13));
        }
        int i14 = 0;
        int iD4 = 0;
        while (true) {
            int size4 = this.z.size();
            list4 = this.z;
            if (i14 >= size4) {
                break;
            }
            iD4 += cv0.d(((Integer) list4.get(i14)).intValue());
            i14++;
        }
        int iD5 = iE3 + iD4;
        if (!list4.isEmpty()) {
            iD5 = iD5 + 2 + cv0.d(iD4);
        }
        this.A = iD4;
        int i15 = 0;
        int iD6 = 0;
        while (true) {
            int size5 = this.L.size();
            list5 = this.L;
            if (i15 >= size5) {
                break;
            }
            iD6 += cv0.d(((Integer) list5.get(i15)).intValue());
            i15++;
        }
        int iE4 = iD5 + iD6;
        if (!list5.isEmpty()) {
            iE4 = iE4 + 2 + cv0.d(iD6);
        }
        this.M = iD6;
        for (int i16 = 0; i16 < this.N.size(); i16++) {
            iE4 += cv0.e(23, (t1) this.N.get(i16));
        }
        int i17 = 0;
        int iD7 = 0;
        while (true) {
            int size6 = this.O.size();
            list6 = this.O;
            if (i17 >= size6) {
                break;
            }
            iD7 += cv0.d(((Integer) list6.get(i17)).intValue());
            i17++;
        }
        int iE5 = iE4 + iD7;
        if (!list6.isEmpty()) {
            iE5 = iE5 + 2 + cv0.d(iD7);
        }
        this.P = iD7;
        if ((this.f2145o & 64) == 64) {
            iE5 += cv0.e(30, this.Q);
        }
        int iD8 = 0;
        while (true) {
            int size7 = this.R.size();
            list7 = this.R;
            if (i2 >= size7) {
                break;
            }
            iD8 += cv0.d(((Integer) list7.get(i2)).intValue());
            i2++;
        }
        int size8 = (list7.size() * 2) + iE5 + iD8;
        if ((this.f2145o & 128) == 128) {
            size8 += cv0.e(32, this.S);
        }
        int size9 = this.n.size() + j() + size8;
        this.U = size9;
        return size9;
    }

    @Override // o.t1
    public final fy2 e() {
        ru5 ru5VarI = ru5.i();
        ru5VarI.j(this);
        return ru5VarI;
    }

    @Override // o.t1
    public final void f(cv0 cv0Var) throws IOException {
        c();
        yt2 yt2Var = new yt2(this);
        if ((this.f2145o & 1) == 1) {
            cv0Var.x(1, this.p);
        }
        if (this.u.size() > 0) {
            cv0Var.G(18);
            cv0Var.G(this.v);
        }
        for (int i = 0; i < this.u.size(); i++) {
            cv0Var.y(((Integer) this.u.get(i)).intValue());
        }
        if ((this.f2145o & 2) == 2) {
            cv0Var.x(3, this.q);
        }
        if ((this.f2145o & 4) == 4) {
            cv0Var.x(4, this.r);
        }
        for (int i2 = 0; i2 < this.s.size(); i2++) {
            cv0Var.z(5, (t1) this.s.get(i2));
        }
        for (int i3 = 0; i3 < this.t.size(); i3++) {
            cv0Var.z(6, (t1) this.t.get(i3));
        }
        if (this.w.size() > 0) {
            cv0Var.G(58);
            cv0Var.G(this.x);
        }
        for (int i4 = 0; i4 < this.w.size(); i4++) {
            cv0Var.y(((Integer) this.w.get(i4)).intValue());
        }
        for (int i5 = 0; i5 < this.B.size(); i5++) {
            cv0Var.z(8, (t1) this.B.get(i5));
        }
        for (int i6 = 0; i6 < this.C.size(); i6++) {
            cv0Var.z(9, (t1) this.C.get(i6));
        }
        for (int i7 = 0; i7 < this.D.size(); i7++) {
            cv0Var.z(10, (t1) this.D.get(i7));
        }
        for (int i8 = 0; i8 < this.E.size(); i8++) {
            cv0Var.z(11, (t1) this.E.get(i8));
        }
        for (int i9 = 0; i9 < this.F.size(); i9++) {
            cv0Var.z(13, (t1) this.F.get(i9));
        }
        if (this.G.size() > 0) {
            cv0Var.G(130);
            cv0Var.G(this.H);
        }
        for (int i10 = 0; i10 < this.G.size(); i10++) {
            cv0Var.y(((Integer) this.G.get(i10)).intValue());
        }
        if ((this.f2145o & 8) == 8) {
            cv0Var.x(17, this.I);
        }
        if ((this.f2145o & 16) == 16) {
            cv0Var.z(18, this.J);
        }
        if ((this.f2145o & 32) == 32) {
            cv0Var.x(19, this.K);
        }
        for (int i11 = 0; i11 < this.y.size(); i11++) {
            cv0Var.z(20, (t1) this.y.get(i11));
        }
        if (this.z.size() > 0) {
            cv0Var.G(170);
            cv0Var.G(this.A);
        }
        for (int i12 = 0; i12 < this.z.size(); i12++) {
            cv0Var.y(((Integer) this.z.get(i12)).intValue());
        }
        if (this.L.size() > 0) {
            cv0Var.G(178);
            cv0Var.G(this.M);
        }
        for (int i13 = 0; i13 < this.L.size(); i13++) {
            cv0Var.y(((Integer) this.L.get(i13)).intValue());
        }
        for (int i14 = 0; i14 < this.N.size(); i14++) {
            cv0Var.z(23, (t1) this.N.get(i14));
        }
        if (this.O.size() > 0) {
            cv0Var.G(194);
            cv0Var.G(this.P);
        }
        for (int i15 = 0; i15 < this.O.size(); i15++) {
            cv0Var.y(((Integer) this.O.get(i15)).intValue());
        }
        if ((this.f2145o & 64) == 64) {
            cv0Var.z(30, this.Q);
        }
        for (int i16 = 0; i16 < this.R.size(); i16++) {
            cv0Var.x(31, ((Integer) this.R.get(i16)).intValue());
        }
        if ((this.f2145o & 128) == 128) {
            cv0Var.z(32, this.S);
        }
        yt2Var.P(19000, cv0Var);
        cv0Var.C(this.n);
    }

    public final void p() {
        this.p = 6;
        this.q = 0;
        this.r = 0;
        List list = Collections.EMPTY_LIST;
        this.s = list;
        this.t = list;
        this.u = list;
        this.w = list;
        this.y = list;
        this.z = list;
        this.B = list;
        this.C = list;
        this.D = list;
        this.E = list;
        this.F = list;
        this.G = list;
        this.I = 0;
        this.J = aw5.F;
        this.K = 0;
        this.L = list;
        this.N = list;
        this.O = list;
        this.Q = gw5.s;
        this.R = list;
        this.S = nw5.q;
    }

    public tu5() {
        this.v = -1;
        this.x = -1;
        this.A = -1;
        this.H = -1;
        this.M = -1;
        this.P = -1;
        this.T = (byte) -1;
        this.U = -1;
        this.n = zh0.m;
    }

    public tu5(ru5 ru5Var) {
        super(ru5Var);
        this.v = -1;
        this.x = -1;
        this.A = -1;
        this.H = -1;
        this.M = -1;
        this.P = -1;
        this.T = (byte) -1;
        this.U = -1;
        this.n = ru5Var.m;
    }
}
