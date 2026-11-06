package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class uv5 extends oy2 {
    public static final uv5 q;
    public static final ys3 r = new ys3((byte) 18);
    public final zh0 m;
    public List n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte f2254o;
    public int p;

    static {
        uv5 uv5Var = new uv5();
        q = uv5Var;
        uv5Var.n = Collections.EMPTY_LIST;
    }

    public uv5(vu0 vu0Var, dg2 dg2Var) {
        this.f2254o = (byte) -1;
        this.p = -1;
        this.n = Collections.EMPTY_LIST;
        xh0 xh0Var = new xh0();
        cv0 cv0VarR = cv0.r(xh0Var, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    try {
                        int iM = vu0Var.m();
                        if (iM != 0) {
                            if (iM == 10) {
                                if (!z2) {
                                    this.n = new ArrayList();
                                    z2 = true;
                                }
                                this.n.add(vu0Var.f(tv5.u, dg2Var));
                            } else if (!vu0Var.p(iM, cv0VarR)) {
                            }
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
                if (z2) {
                    this.n = Collections.unmodifiableList(this.n);
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
        if (z2) {
            this.n = Collections.unmodifiableList(this.n);
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
        byte b = this.f2254o;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.n.size(); i++) {
            if (!((tv5) this.n.get(i)).a()) {
                this.f2254o = (byte) 0;
                return false;
            }
        }
        this.f2254o = (byte) 1;
        return true;
    }

    @Override // o.t1
    public final int c() {
        int i = this.p;
        if (i != -1) {
            return i;
        }
        int iE = 0;
        for (int i2 = 0; i2 < this.n.size(); i2++) {
            iE += cv0.e(1, (t1) this.n.get(i2));
        }
        int size = this.m.size() + iE;
        this.p = size;
        return size;
    }

    @Override // o.t1
    public final fy2 d() {
        wu5 wu5Var = new wu5((byte) 1);
        wu5Var.p = Collections.EMPTY_LIST;
        return wu5Var;
    }

    @Override // o.t1
    public final fy2 e() {
        wu5 wu5Var = new wu5((byte) 1);
        wu5Var.p = Collections.EMPTY_LIST;
        wu5Var.l(this);
        return wu5Var;
    }

    @Override // o.t1
    public final void f(cv0 cv0Var) throws IOException {
        c();
        for (int i = 0; i < this.n.size(); i++) {
            cv0Var.z(1, (t1) this.n.get(i));
        }
        cv0Var.C(this.m);
    }

    public uv5() {
        this.f2254o = (byte) -1;
        this.p = -1;
        this.m = zh0.m;
    }

    public uv5(wu5 wu5Var) {
        this.f2254o = (byte) -1;
        this.p = -1;
        this.m = wu5Var.m;
    }
}
