package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class qv5 extends ky2 {
    public static final qv5 G;
    public static final ys3 H = new ys3((byte) 17);
    public iw5 A;
    public int B;
    public int C;
    public List D;
    public byte E;
    public int F;
    public final zh0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1871o;
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
        qv5 qv5Var = new qv5();
        G = qv5Var;
        qv5Var.p();
    }

    public qv5(vu0 vu0Var, dg2 dg2Var) {
        this.z = -1;
        this.E = (byte) -1;
        this.F = -1;
        p();
        xh0 xh0Var = new xh0();
        cv0 cv0VarR = cv0.r(xh0Var, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    try {
                        int iM = vu0Var.m();
                        zv5 zv5VarQ = null;
                        hw5 hw5Var = null;
                        zv5 zv5VarQ2 = null;
                        switch (iM) {
                            case 0:
                                break;
                            case 8:
                                this.f1871o |= 2;
                                this.q = vu0Var.j();
                                continue;
                            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                                this.f1871o |= 4;
                                this.r = vu0Var.j();
                                continue;
                            case 26:
                                if ((this.f1871o & 8) == 8) {
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
                                this.f1871o |= 8;
                                continue;
                            case 34:
                                int i2 = (i == true ? 1 : 0) & 32;
                                i = i;
                                if (i2 != 32) {
                                    this.u = new ArrayList();
                                    i = (i == true ? 1 : 0) | 32;
                                }
                                this.u.add(vu0Var.f(fw5.z, dg2Var));
                                continue;
                            case 42:
                                if ((this.f1871o & 32) == 32) {
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
                                this.f1871o |= 32;
                                continue;
                            case 50:
                                if ((this.f1871o & 128) == 128) {
                                    iw5 iw5Var = this.A;
                                    iw5Var.getClass();
                                    hw5Var = new hw5();
                                    aw5 aw5Var5 = aw5.F;
                                    hw5Var.s = aw5Var5;
                                    hw5Var.u = aw5Var5;
                                    hw5Var.i(iw5Var);
                                }
                                iw5 iw5Var2 = (iw5) vu0Var.f(iw5.y, dg2Var);
                                this.A = iw5Var2;
                                if (hw5Var != null) {
                                    hw5Var.i(iw5Var2);
                                    this.A = hw5Var.h();
                                }
                                this.f1871o |= 128;
                                continue;
                            case 56:
                                this.f1871o |= 256;
                                this.B = vu0Var.j();
                                continue;
                            case 64:
                                this.f1871o |= 512;
                                this.C = vu0Var.j();
                                continue;
                            case 72:
                                this.f1871o |= 16;
                                this.t = vu0Var.j();
                                continue;
                            case 80:
                                this.f1871o |= 64;
                                this.w = vu0Var.j();
                                continue;
                            case 88:
                                this.f1871o |= 1;
                                this.p = vu0Var.j();
                                continue;
                            case 98:
                                int i3 = (i == true ? 1 : 0) & 256;
                                i = i;
                                if (i3 != 256) {
                                    this.x = new ArrayList();
                                    i = (i == true ? 1 : 0) | 256;
                                }
                                this.x.add(vu0Var.f(aw5.G, dg2Var));
                                continue;
                            case 104:
                                int i4 = (i == true ? 1 : 0) & 512;
                                i = i;
                                if (i4 != 512) {
                                    this.y = new ArrayList();
                                    i = (i == true ? 1 : 0) | 512;
                                }
                                this.y.add(Integer.valueOf(vu0Var.j()));
                                continue;
                            case 106:
                                int iD = vu0Var.d(vu0Var.j());
                                int i5 = (i == true ? 1 : 0) & 512;
                                i = i;
                                if (i5 != 512 && vu0Var.b() > 0) {
                                    i = i;
                                    this.y = new ArrayList();
                                    i = (i == true ? 1 : 0) | 512;
                                }
                                i = i;
                                while (vu0Var.b() > 0) {
                                    this.y.add(Integer.valueOf(vu0Var.j()));
                                }
                                vu0Var.c(iD);
                                continue;
                            case 248:
                                int i6 = (i == true ? 1 : 0) & 8192;
                                i = i;
                                if (i6 != 8192) {
                                    this.D = new ArrayList();
                                    i = (i == true ? 1 : 0) | 8192;
                                }
                                this.D.add(Integer.valueOf(vu0Var.j()));
                                continue;
                            case 250:
                                int iD2 = vu0Var.d(vu0Var.j());
                                int i7 = (i == true ? 1 : 0) & 8192;
                                i = i;
                                if (i7 != 8192 && vu0Var.b() > 0) {
                                    i = i;
                                    this.D = new ArrayList();
                                    i = (i == true ? 1 : 0) | 8192;
                                }
                                i = i;
                                while (vu0Var.b() > 0) {
                                    this.D.add(Integer.valueOf(vu0Var.j()));
                                }
                                vu0Var.c(iD2);
                                continue;
                            default:
                                if (!n(vu0Var, cv0VarR, dg2Var, iM)) {
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
                if (((i == true ? 1 : 0) & 32) == 32) {
                    this.u = Collections.unmodifiableList(this.u);
                }
                if (((i == true ? 1 : 0) & 256) == 256) {
                    this.x = Collections.unmodifiableList(this.x);
                }
                if (((i == true ? 1 : 0) & 512) == 512) {
                    this.y = Collections.unmodifiableList(this.y);
                }
                if (((i == true ? 1 : 0) & 8192) == 8192) {
                    this.D = Collections.unmodifiableList(this.D);
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
        if (((i == true ? 1 : 0) & 256) == 256) {
            this.x = Collections.unmodifiableList(this.x);
        }
        if (((i == true ? 1 : 0) & 512) == 512) {
            this.y = Collections.unmodifiableList(this.y);
        }
        if (((i == true ? 1 : 0) & 8192) == 8192) {
            this.D = Collections.unmodifiableList(this.D);
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
        int i = this.f1871o;
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
        if ((this.f1871o & 32) == 32 && !this.v.a()) {
            this.E = (byte) 0;
            return false;
        }
        for (int i3 = 0; i3 < this.x.size(); i3++) {
            if (!((aw5) this.x.get(i3)).a()) {
                this.E = (byte) 0;
                return false;
            }
        }
        if ((this.f1871o & 128) == 128 && !this.A.a()) {
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
        int i = this.F;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int iC = (this.f1871o & 2) == 2 ? cv0.c(1, this.q) : 0;
        if ((this.f1871o & 4) == 4) {
            iC += cv0.c(2, this.r);
        }
        if ((this.f1871o & 8) == 8) {
            iC += cv0.e(3, this.s);
        }
        for (int i3 = 0; i3 < this.u.size(); i3++) {
            iC += cv0.e(4, (t1) this.u.get(i3));
        }
        if ((this.f1871o & 32) == 32) {
            iC += cv0.e(5, this.v);
        }
        if ((this.f1871o & 128) == 128) {
            iC += cv0.e(6, this.A);
        }
        if ((this.f1871o & 256) == 256) {
            iC += cv0.c(7, this.B);
        }
        if ((this.f1871o & 512) == 512) {
            iC += cv0.c(8, this.C);
        }
        if ((this.f1871o & 16) == 16) {
            iC += cv0.c(9, this.t);
        }
        if ((this.f1871o & 64) == 64) {
            iC += cv0.c(10, this.w);
        }
        if ((this.f1871o & 1) == 1) {
            iC += cv0.c(11, this.p);
        }
        for (int i4 = 0; i4 < this.x.size(); i4++) {
            iC += cv0.e(12, (t1) this.x.get(i4));
        }
        int i5 = 0;
        int iD = 0;
        while (true) {
            int size = this.y.size();
            list = this.y;
            if (i5 >= size) {
                break;
            }
            iD += cv0.d(((Integer) list.get(i5)).intValue());
            i5++;
        }
        int iD2 = iC + iD;
        if (!list.isEmpty()) {
            iD2 = iD2 + 1 + cv0.d(iD);
        }
        this.z = iD;
        int iD3 = 0;
        while (true) {
            int size2 = this.D.size();
            List list2 = this.D;
            if (i2 >= size2) {
                int size3 = this.n.size() + j() + (list2.size() * 2) + iD2 + iD3;
                this.F = size3;
                return size3;
            }
            iD3 += cv0.d(((Integer) list2.get(i2)).intValue());
            i2++;
        }
    }

    @Override // o.t1
    public final fy2 d() {
        return pv5.i();
    }

    @Override // o.t1
    public final fy2 e() {
        pv5 pv5VarI = pv5.i();
        pv5VarI.j(this);
        return pv5VarI;
    }

    @Override // o.t1
    public final void f(cv0 cv0Var) throws IOException {
        c();
        yt2 yt2Var = new yt2(this);
        if ((this.f1871o & 2) == 2) {
            cv0Var.x(1, this.q);
        }
        if ((this.f1871o & 4) == 4) {
            cv0Var.x(2, this.r);
        }
        if ((this.f1871o & 8) == 8) {
            cv0Var.z(3, this.s);
        }
        for (int i = 0; i < this.u.size(); i++) {
            cv0Var.z(4, (t1) this.u.get(i));
        }
        if ((this.f1871o & 32) == 32) {
            cv0Var.z(5, this.v);
        }
        if ((this.f1871o & 128) == 128) {
            cv0Var.z(6, this.A);
        }
        if ((this.f1871o & 256) == 256) {
            cv0Var.x(7, this.B);
        }
        if ((this.f1871o & 512) == 512) {
            cv0Var.x(8, this.C);
        }
        if ((this.f1871o & 16) == 16) {
            cv0Var.x(9, this.t);
        }
        if ((this.f1871o & 64) == 64) {
            cv0Var.x(10, this.w);
        }
        if ((this.f1871o & 1) == 1) {
            cv0Var.x(11, this.p);
        }
        for (int i2 = 0; i2 < this.x.size(); i2++) {
            cv0Var.z(12, (t1) this.x.get(i2));
        }
        if (this.y.size() > 0) {
            cv0Var.G(106);
            cv0Var.G(this.z);
        }
        for (int i3 = 0; i3 < this.y.size(); i3++) {
            cv0Var.y(((Integer) this.y.get(i3)).intValue());
        }
        for (int i4 = 0; i4 < this.D.size(); i4++) {
            cv0Var.x(31, ((Integer) this.D.get(i4)).intValue());
        }
        yt2Var.P(19000, cv0Var);
        cv0Var.C(this.n);
    }

    public final void p() {
        this.p = 518;
        this.q = 2054;
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
        this.A = iw5.x;
        this.B = 0;
        this.C = 0;
        this.D = list;
    }

    public qv5() {
        this.z = -1;
        this.E = (byte) -1;
        this.F = -1;
        this.n = zh0.m;
    }

    public qv5(pv5 pv5Var) {
        super(pv5Var);
        this.z = -1;
        this.E = (byte) -1;
        this.F = -1;
        this.n = pv5Var.m;
    }
}
