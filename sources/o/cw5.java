package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class cw5 extends ky2 {
    public static final cw5 A;
    public static final ys3 B = new ys3((byte) 23);
    public final zh0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f561o;
    public int p;
    public int q;
    public List r;
    public aw5 s;
    public int t;
    public aw5 u;
    public int v;
    public List w;
    public List x;
    public byte y;
    public int z;

    static {
        cw5 cw5Var = new cw5();
        A = cw5Var;
        cw5Var.p = 6;
        cw5Var.q = 0;
        List list = Collections.EMPTY_LIST;
        cw5Var.r = list;
        aw5 aw5Var = aw5.F;
        cw5Var.s = aw5Var;
        cw5Var.t = 0;
        cw5Var.u = aw5Var;
        cw5Var.v = 0;
        cw5Var.w = list;
        cw5Var.x = list;
    }

    public cw5(vu0 vu0Var, dg2 dg2Var) {
        this.y = (byte) -1;
        this.z = -1;
        this.p = 6;
        boolean z = false;
        this.q = 0;
        List list = Collections.EMPTY_LIST;
        this.r = list;
        aw5 aw5Var = aw5.F;
        this.s = aw5Var;
        this.t = 0;
        this.u = aw5Var;
        this.v = 0;
        this.w = list;
        this.x = list;
        xh0 xh0Var = new xh0();
        cv0 cv0VarR = cv0.r(xh0Var, 1);
        int i = 0;
        while (!z) {
            try {
                try {
                    try {
                        int iM = vu0Var.m();
                        zv5 zv5VarQ = null;
                        switch (iM) {
                            case 0:
                                break;
                            case 8:
                                this.f561o |= 1;
                                this.p = vu0Var.j();
                                continue;
                            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                                this.f561o |= 2;
                                this.q = vu0Var.j();
                                continue;
                            case 26:
                                if ((i & 4) != 4) {
                                    this.r = new ArrayList();
                                    i |= 4;
                                }
                                this.r.add(vu0Var.f(fw5.z, dg2Var));
                                continue;
                            case 34:
                                if ((this.f561o & 4) == 4) {
                                    aw5 aw5Var2 = this.s;
                                    aw5Var2.getClass();
                                    zv5VarQ = aw5.q(aw5Var2);
                                }
                                aw5 aw5Var3 = (aw5) vu0Var.f(aw5.G, dg2Var);
                                this.s = aw5Var3;
                                if (zv5VarQ != null) {
                                    zv5VarQ.j(aw5Var3);
                                    this.s = zv5VarQ.h();
                                }
                                this.f561o |= 4;
                                continue;
                            case 40:
                                this.f561o |= 8;
                                this.t = vu0Var.j();
                                continue;
                            case 50:
                                if ((this.f561o & 16) == 16) {
                                    aw5 aw5Var4 = this.u;
                                    aw5Var4.getClass();
                                    zv5VarQ = aw5.q(aw5Var4);
                                }
                                aw5 aw5Var5 = (aw5) vu0Var.f(aw5.G, dg2Var);
                                this.u = aw5Var5;
                                if (zv5VarQ != null) {
                                    zv5VarQ.j(aw5Var5);
                                    this.u = zv5VarQ.h();
                                }
                                this.f561o |= 16;
                                continue;
                            case 56:
                                this.f561o |= 32;
                                this.v = vu0Var.j();
                                continue;
                            case 66:
                                if ((i & 128) != 128) {
                                    this.w = new ArrayList();
                                    i |= 128;
                                }
                                this.w.add(vu0Var.f(qu5.t, dg2Var));
                                continue;
                            case 248:
                                if ((i & 256) != 256) {
                                    this.x = new ArrayList();
                                    i |= 256;
                                }
                                this.x.add(Integer.valueOf(vu0Var.j()));
                                continue;
                            case 250:
                                int iD = vu0Var.d(vu0Var.j());
                                if ((i & 256) != 256 && vu0Var.b() > 0) {
                                    this.x = new ArrayList();
                                    i |= 256;
                                }
                                while (vu0Var.b() > 0) {
                                    this.x.add(Integer.valueOf(vu0Var.j()));
                                }
                                vu0Var.c(iD);
                                continue;
                            default:
                                if (!n(vu0Var, cv0VarR, dg2Var, iM)) {
                                    break;
                                }
                                break;
                        }
                        z = true;
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
                if ((i & 4) == 4) {
                    this.r = Collections.unmodifiableList(this.r);
                }
                if ((i & 128) == 128) {
                    this.w = Collections.unmodifiableList(this.w);
                }
                if ((i & 256) == 256) {
                    this.x = Collections.unmodifiableList(this.x);
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
        if ((i & 4) == 4) {
            this.r = Collections.unmodifiableList(this.r);
        }
        if ((i & 128) == 128) {
            this.w = Collections.unmodifiableList(this.w);
        }
        if ((i & 256) == 256) {
            this.x = Collections.unmodifiableList(this.x);
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
        byte b = this.y;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.f561o & 2) != 2) {
            this.y = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.r.size(); i++) {
            if (!((fw5) this.r.get(i)).a()) {
                this.y = (byte) 0;
                return false;
            }
        }
        if ((this.f561o & 4) == 4 && !this.s.a()) {
            this.y = (byte) 0;
            return false;
        }
        if ((this.f561o & 16) == 16 && !this.u.a()) {
            this.y = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.w.size(); i2++) {
            if (!((qu5) this.w.get(i2)).a()) {
                this.y = (byte) 0;
                return false;
            }
        }
        if (i()) {
            this.y = (byte) 1;
            return true;
        }
        this.y = (byte) 0;
        return false;
    }

    @Override // o.rq4
    public final t1 b() {
        return A;
    }

    @Override // o.t1
    public final int c() {
        int i = this.z;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int iC = (this.f561o & 1) == 1 ? cv0.c(1, this.p) : 0;
        if ((this.f561o & 2) == 2) {
            iC += cv0.c(2, this.q);
        }
        for (int i3 = 0; i3 < this.r.size(); i3++) {
            iC += cv0.e(3, (t1) this.r.get(i3));
        }
        if ((this.f561o & 4) == 4) {
            iC += cv0.e(4, this.s);
        }
        if ((this.f561o & 8) == 8) {
            iC += cv0.c(5, this.t);
        }
        if ((this.f561o & 16) == 16) {
            iC += cv0.e(6, this.u);
        }
        if ((this.f561o & 32) == 32) {
            iC += cv0.c(7, this.v);
        }
        for (int i4 = 0; i4 < this.w.size(); i4++) {
            iC += cv0.e(8, (t1) this.w.get(i4));
        }
        int iD = 0;
        while (true) {
            int size = this.x.size();
            List list = this.x;
            if (i2 >= size) {
                int size2 = this.n.size() + j() + (list.size() * 2) + iC + iD;
                this.z = size2;
                return size2;
            }
            iD += cv0.d(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // o.t1
    public final fy2 d() {
        return bw5.i();
    }

    @Override // o.t1
    public final fy2 e() {
        bw5 bw5VarI = bw5.i();
        bw5VarI.j(this);
        return bw5VarI;
    }

    @Override // o.t1
    public final void f(cv0 cv0Var) throws IOException {
        c();
        yt2 yt2Var = new yt2(this);
        if ((this.f561o & 1) == 1) {
            cv0Var.x(1, this.p);
        }
        if ((this.f561o & 2) == 2) {
            cv0Var.x(2, this.q);
        }
        for (int i = 0; i < this.r.size(); i++) {
            cv0Var.z(3, (t1) this.r.get(i));
        }
        if ((this.f561o & 4) == 4) {
            cv0Var.z(4, this.s);
        }
        if ((this.f561o & 8) == 8) {
            cv0Var.x(5, this.t);
        }
        if ((this.f561o & 16) == 16) {
            cv0Var.z(6, this.u);
        }
        if ((this.f561o & 32) == 32) {
            cv0Var.x(7, this.v);
        }
        for (int i2 = 0; i2 < this.w.size(); i2++) {
            cv0Var.z(8, (t1) this.w.get(i2));
        }
        for (int i3 = 0; i3 < this.x.size(); i3++) {
            cv0Var.x(31, ((Integer) this.x.get(i3)).intValue());
        }
        yt2Var.P(200, cv0Var);
        cv0Var.C(this.n);
    }

    public cw5() {
        this.y = (byte) -1;
        this.z = -1;
        this.n = zh0.m;
    }

    public cw5(bw5 bw5Var) {
        super(bw5Var);
        this.y = (byte) -1;
        this.z = -1;
        this.n = bw5Var.m;
    }
}
