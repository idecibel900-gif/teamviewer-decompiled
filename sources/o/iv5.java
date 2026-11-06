package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class iv5 extends ky2 {
    public static final iv5 G;
    public static final ys3 H = new ys3((byte) 14);
    public List A;
    public gw5 B;
    public List C;
    public xu5 D;
    public byte E;
    public int F;
    public final zh0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1108o;
    public int p;
    public int q;
    public int r;
    public aw5 s;
    public int t;
    public List u;
    public aw5 v;
    public int w;
    public List x;
    public List y;
    public int z;

    static {
        iv5 iv5Var = new iv5();
        G = iv5Var;
        iv5Var.p();
    }

    public iv5(vu0 vu0Var, dg2 dg2Var) {
        this.z = -1;
        this.E = (byte) -1;
        this.F = -1;
        p();
        xh0 xh0Var = new xh0();
        boolean z = true;
        cv0 cv0VarR = cv0.r(xh0Var, 1);
        byte b = 0;
        boolean z2 = false;
        int i = 0;
        while (!z2) {
            try {
                try {
                    try {
                        int iM = vu0Var.m();
                        zv5 zv5VarQ = null;
                        wu5 wu5Var = null;
                        pu5 pu5VarI = null;
                        zv5 zv5VarQ2 = null;
                        switch (iM) {
                            case 0:
                                z = z;
                                z2 = z;
                                break;
                            case 8:
                                z = z;
                                this.f1108o |= 2;
                                this.q = vu0Var.j();
                                break;
                            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                                z = z;
                                this.f1108o |= 4;
                                this.r = vu0Var.j();
                                break;
                            case 26:
                                z = z;
                                if ((this.f1108o & 8) == 8) {
                                    aw5 aw5Var = this.s;
                                    aw5Var.getClass();
                                    zv5VarQ = aw5.q(aw5Var);
                                }
                                aw5 aw5Var2 = (aw5) vu0Var.f(aw5.G, dg2Var);
                                this.s = aw5Var2;
                                if (zv5VarQ != null) {
                                    zv5VarQ.j(aw5Var2);
                                    this.s = zv5VarQ.h();
                                }
                                this.f1108o |= 8;
                                break;
                            case 34:
                                z = z;
                                int i2 = (i == true ? 1 : 0) & 32;
                                i = i;
                                if (i2 != 32) {
                                    this.u = new ArrayList();
                                    i = (i == true ? 1 : 0) | 32;
                                }
                                this.u.add(vu0Var.f(fw5.z, dg2Var));
                                break;
                            case 42:
                                z = z;
                                if ((this.f1108o & 32) == 32) {
                                    aw5 aw5Var3 = this.v;
                                    aw5Var3.getClass();
                                    zv5VarQ2 = aw5.q(aw5Var3);
                                }
                                aw5 aw5Var4 = (aw5) vu0Var.f(aw5.G, dg2Var);
                                this.v = aw5Var4;
                                if (zv5VarQ2 != null) {
                                    zv5VarQ2.j(aw5Var4);
                                    this.v = zv5VarQ2.h();
                                }
                                this.f1108o |= 32;
                                break;
                            case 50:
                                z = z;
                                int i3 = (i == true ? 1 : 0) & 1024;
                                i = i;
                                if (i3 != 1024) {
                                    this.A = new ArrayList();
                                    i = (i == true ? 1 : 0) | 1024;
                                }
                                this.A.add(vu0Var.f(iw5.y, dg2Var));
                                break;
                            case 56:
                                z = z;
                                this.f1108o |= 16;
                                this.t = vu0Var.j();
                                break;
                            case 64:
                                z = z;
                                this.f1108o |= 64;
                                this.w = vu0Var.j();
                                break;
                            case 72:
                                z = z;
                                this.f1108o |= 1;
                                this.p = vu0Var.j();
                                break;
                            case 82:
                                z = z;
                                int i4 = (i == true ? 1 : 0) & 256;
                                i = i;
                                if (i4 != 256) {
                                    this.x = new ArrayList();
                                    i = (i == true ? 1 : 0) | 256;
                                }
                                this.x.add(vu0Var.f(aw5.G, dg2Var));
                                break;
                            case 88:
                                z = z;
                                int i5 = (i == true ? 1 : 0) & 512;
                                i = i;
                                if (i5 != 512) {
                                    this.y = new ArrayList();
                                    i = (i == true ? 1 : 0) | 512;
                                }
                                this.y.add(Integer.valueOf(vu0Var.j()));
                                break;
                            case 90:
                                z = z;
                                int iD = vu0Var.d(vu0Var.j());
                                int i6 = (i == true ? 1 : 0) & 512;
                                i = i;
                                if (i6 != 512 && vu0Var.b() > 0) {
                                    i = i;
                                    this.y = new ArrayList();
                                    i = (i == true ? 1 : 0) | 512;
                                }
                                i = i;
                                while (vu0Var.b() > 0) {
                                    this.y.add(Integer.valueOf(vu0Var.j()));
                                }
                                vu0Var.c(iD);
                                break;
                            case 242:
                                z = z;
                                if ((this.f1108o & 128) == 128) {
                                    gw5 gw5Var = this.B;
                                    gw5Var.getClass();
                                    pu5VarI = gw5.i(gw5Var);
                                }
                                gw5 gw5Var2 = (gw5) vu0Var.f(gw5.t, dg2Var);
                                this.B = gw5Var2;
                                if (pu5VarI != null) {
                                    pu5VarI.l(gw5Var2);
                                    this.B = pu5VarI.i();
                                }
                                this.f1108o |= 128;
                                break;
                            case 248:
                                z = z;
                                int i7 = (i == true ? 1 : 0) & 4096;
                                i = i;
                                if (i7 != 4096) {
                                    this.C = new ArrayList();
                                    i = (i == true ? 1 : 0) | 4096;
                                }
                                this.C.add(Integer.valueOf(vu0Var.j()));
                                break;
                            case 250:
                                z = z;
                                int iD2 = vu0Var.d(vu0Var.j());
                                int i8 = (i == true ? 1 : 0) & 4096;
                                i = i;
                                if (i8 != 4096 && vu0Var.b() > 0) {
                                    i = i;
                                    this.C = new ArrayList();
                                    i = (i == true ? 1 : 0) | 4096;
                                }
                                i = i;
                                while (vu0Var.b() > 0) {
                                    this.C.add(Integer.valueOf(vu0Var.j()));
                                }
                                vu0Var.c(iD2);
                                break;
                            case 258:
                                if ((this.f1108o & 256) == 256) {
                                    xu5 xu5Var = this.D;
                                    xu5Var.getClass();
                                    wu5Var = new wu5(b);
                                    wu5Var.p = Collections.EMPTY_LIST;
                                    wu5Var.k(xu5Var);
                                }
                                xu5 xu5Var2 = (xu5) vu0Var.f(xu5.r, dg2Var);
                                this.D = xu5Var2;
                                if (wu5Var != null) {
                                    wu5Var.k(xu5Var2);
                                    this.D = wu5Var.g();
                                }
                                this.f1108o |= 256;
                                break;
                            default:
                                if (!n(vu0Var, cv0VarR, dg2Var, iM)) {
                                    z2 = z;
                                    z = z2;
                                } else {
                                    z = z;
                                }
                                break;
                        }
                        z = z;
                        i = i;
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
                if (((i == true ? 1 : 0) & 32) == 32) {
                    this.u = Collections.unmodifiableList(this.u);
                }
                if (((i == true ? 1 : 0) & 1024) == 1024) {
                    this.A = Collections.unmodifiableList(this.A);
                }
                if (((i == true ? 1 : 0) & 256) == 256) {
                    this.x = Collections.unmodifiableList(this.x);
                }
                if (((i == true ? 1 : 0) & 512) == 512) {
                    this.y = Collections.unmodifiableList(this.y);
                }
                if (((i == true ? 1 : 0) & 4096) == 4096) {
                    this.C = Collections.unmodifiableList(this.C);
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
        }
        if (((i == true ? 1 : 0) & 32) == 32) {
            this.u = Collections.unmodifiableList(this.u);
        }
        if (((i == true ? 1 : 0) & 1024) == 1024) {
            this.A = Collections.unmodifiableList(this.A);
        }
        if (((i == true ? 1 : 0) & 256) == 256) {
            this.x = Collections.unmodifiableList(this.x);
        }
        if (((i == true ? 1 : 0) & 512) == 512) {
            this.y = Collections.unmodifiableList(this.y);
        }
        if (((i == true ? 1 : 0) & 4096) == 4096) {
            this.C = Collections.unmodifiableList(this.C);
        }
        try {
            cv0VarR.u();
        } catch (IOException unused2) {
        } finally {
            this.n = xh0Var.q();
        }
        m();
    }

    @Override // o.rq4
    public final boolean a() {
        byte b = this.E;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.f1108o;
        if ((i & 4) != 4) {
            this.E = (byte) 0;
            return false;
        }
        if ((i & 8) == 8 && !this.s.a()) {
            this.E = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.u.size(); i2++) {
            if (!((fw5) this.u.get(i2)).a()) {
                this.E = (byte) 0;
                return false;
            }
        }
        if ((this.f1108o & 32) == 32 && !this.v.a()) {
            this.E = (byte) 0;
            return false;
        }
        for (int i3 = 0; i3 < this.x.size(); i3++) {
            if (!((aw5) this.x.get(i3)).a()) {
                this.E = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < this.A.size(); i4++) {
            if (!((iw5) this.A.get(i4)).a()) {
                this.E = (byte) 0;
                return false;
            }
        }
        if ((this.f1108o & 128) == 128 && !this.B.a()) {
            this.E = (byte) 0;
            return false;
        }
        if ((this.f1108o & 256) == 256 && !this.D.a()) {
            this.E = (byte) 0;
            return false;
        }
        if (i()) {
            this.E = (byte) 1;
            return true;
        }
        this.E = (byte) 0;
        return false;
    }

    @Override // o.rq4
    public final t1 b() {
        return G;
    }

    @Override // o.t1
    public final int c() {
        List list;
        List list2;
        int i = this.F;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int iC = (this.f1108o & 2) == 2 ? cv0.c(1, this.q) : 0;
        if ((this.f1108o & 4) == 4) {
            iC += cv0.c(2, this.r);
        }
        if ((this.f1108o & 8) == 8) {
            iC += cv0.e(3, this.s);
        }
        for (int i3 = 0; i3 < this.u.size(); i3++) {
            iC += cv0.e(4, (t1) this.u.get(i3));
        }
        if ((this.f1108o & 32) == 32) {
            iC += cv0.e(5, this.v);
        }
        for (int i4 = 0; i4 < this.A.size(); i4++) {
            iC += cv0.e(6, (t1) this.A.get(i4));
        }
        if ((this.f1108o & 16) == 16) {
            iC += cv0.c(7, this.t);
        }
        if ((this.f1108o & 64) == 64) {
            iC += cv0.c(8, this.w);
        }
        if ((this.f1108o & 1) == 1) {
            iC += cv0.c(9, this.p);
        }
        for (int i5 = 0; i5 < this.x.size(); i5++) {
            iC += cv0.e(10, (t1) this.x.get(i5));
        }
        int i6 = 0;
        int iD = 0;
        while (true) {
            int size = this.y.size();
            list = this.y;
            if (i6 >= size) {
                break;
            }
            iD += cv0.d(((Integer) list.get(i6)).intValue());
            i6++;
        }
        int iE = iC + iD;
        if (!list.isEmpty()) {
            iE = iE + 1 + cv0.d(iD);
        }
        this.z = iD;
        if ((this.f1108o & 128) == 128) {
            iE += cv0.e(30, this.B);
        }
        int iD2 = 0;
        while (true) {
            int size2 = this.C.size();
            list2 = this.C;
            if (i2 >= size2) {
                break;
            }
            iD2 += cv0.d(((Integer) list2.get(i2)).intValue());
            i2++;
        }
        int size3 = (list2.size() * 2) + iE + iD2;
        if ((this.f1108o & 256) == 256) {
            size3 += cv0.e(32, this.D);
        }
        int size4 = this.n.size() + j() + size3;
        this.F = size4;
        return size4;
    }

    @Override // o.t1
    public final fy2 d() {
        return hv5.i();
    }

    @Override // o.t1
    public final fy2 e() {
        hv5 hv5VarI = hv5.i();
        hv5VarI.j(this);
        return hv5VarI;
    }

    @Override // o.t1
    public final void f(cv0 cv0Var) throws IOException {
        c();
        yt2 yt2Var = new yt2(this);
        if ((this.f1108o & 2) == 2) {
            cv0Var.x(1, this.q);
        }
        if ((this.f1108o & 4) == 4) {
            cv0Var.x(2, this.r);
        }
        if ((this.f1108o & 8) == 8) {
            cv0Var.z(3, this.s);
        }
        for (int i = 0; i < this.u.size(); i++) {
            cv0Var.z(4, (t1) this.u.get(i));
        }
        if ((this.f1108o & 32) == 32) {
            cv0Var.z(5, this.v);
        }
        for (int i2 = 0; i2 < this.A.size(); i2++) {
            cv0Var.z(6, (t1) this.A.get(i2));
        }
        if ((this.f1108o & 16) == 16) {
            cv0Var.x(7, this.t);
        }
        if ((this.f1108o & 64) == 64) {
            cv0Var.x(8, this.w);
        }
        if ((this.f1108o & 1) == 1) {
            cv0Var.x(9, this.p);
        }
        for (int i3 = 0; i3 < this.x.size(); i3++) {
            cv0Var.z(10, (t1) this.x.get(i3));
        }
        if (this.y.size() > 0) {
            cv0Var.G(90);
            cv0Var.G(this.z);
        }
        for (int i4 = 0; i4 < this.y.size(); i4++) {
            cv0Var.y(((Integer) this.y.get(i4)).intValue());
        }
        if ((this.f1108o & 128) == 128) {
            cv0Var.z(30, this.B);
        }
        for (int i5 = 0; i5 < this.C.size(); i5++) {
            cv0Var.x(31, ((Integer) this.C.get(i5)).intValue());
        }
        if ((this.f1108o & 256) == 256) {
            cv0Var.z(32, this.D);
        }
        yt2Var.P(19000, cv0Var);
        cv0Var.C(this.n);
    }

    public final void p() {
        this.p = 6;
        this.q = 6;
        this.r = 0;
        aw5 aw5Var = aw5.F;
        this.s = aw5Var;
        this.t = 0;
        List list = Collections.EMPTY_LIST;
        this.u = list;
        this.v = aw5Var;
        this.w = 0;
        this.x = list;
        this.y = list;
        this.A = list;
        this.B = gw5.s;
        this.C = list;
        this.D = xu5.q;
    }

    public iv5() {
        this.z = -1;
        this.E = (byte) -1;
        this.F = -1;
        this.n = zh0.m;
    }

    public iv5(hv5 hv5Var) {
        super(hv5Var);
        this.z = -1;
        this.E = (byte) -1;
        this.F = -1;
        this.n = hv5Var.m;
    }
}
