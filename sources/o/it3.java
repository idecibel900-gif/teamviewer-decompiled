package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class it3 extends oy2 {
    public static final it3 s;
    public static final ys3 t = new ys3((byte) 3);
    public final zh0 m;
    public List n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f1099o;
    public int p;
    public byte q;
    public int r;

    static {
        it3 it3Var = new it3();
        s = it3Var;
        List list = Collections.EMPTY_LIST;
        it3Var.n = list;
        it3Var.f1099o = list;
    }

    public it3(vu0 vu0Var, dg2 dg2Var) {
        this.p = -1;
        this.q = (byte) -1;
        this.r = -1;
        List list = Collections.EMPTY_LIST;
        this.n = list;
        this.f1099o = list;
        xh0 xh0Var = new xh0();
        cv0 cv0VarR = cv0.r(xh0Var, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    int iM = vu0Var.m();
                    if (iM != 0) {
                        if (iM == 10) {
                            if ((i & 1) != 1) {
                                this.n = new ArrayList();
                                i |= 1;
                            }
                            this.n.add(vu0Var.f(ht3.z, dg2Var));
                        } else if (iM == 40) {
                            if ((i & 2) != 2) {
                                this.f1099o = new ArrayList();
                                i |= 2;
                            }
                            this.f1099o.add(Integer.valueOf(vu0Var.j()));
                        } else if (iM == 42) {
                            int iD = vu0Var.d(vu0Var.j());
                            if ((i & 2) != 2 && vu0Var.b() > 0) {
                                this.f1099o = new ArrayList();
                                i |= 2;
                            }
                            while (vu0Var.b() > 0) {
                                this.f1099o.add(Integer.valueOf(vu0Var.j()));
                            }
                            vu0Var.c(iD);
                        } else if (!vu0Var.p(iM, cv0VarR)) {
                        }
                    }
                    z = true;
                } catch (rm3 e) {
                    e.m = this;
                    throw e;
                } catch (IOException e2) {
                    rm3 rm3Var = new rm3(e2.getMessage());
                    rm3Var.m = this;
                    throw rm3Var;
                }
            } catch (Throwable th) {
                if ((i & 1) == 1) {
                    this.n = Collections.unmodifiableList(this.n);
                }
                if ((i & 2) == 2) {
                    this.f1099o = Collections.unmodifiableList(this.f1099o);
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
        if ((i & 1) == 1) {
            this.n = Collections.unmodifiableList(this.n);
        }
        if ((i & 2) == 2) {
            this.f1099o = Collections.unmodifiableList(this.f1099o);
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
        byte b = this.q;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.q = (byte) 1;
        return true;
    }

    @Override // o.t1
    public final int c() {
        List list;
        int i = this.r;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int iE = 0;
        for (int i3 = 0; i3 < this.n.size(); i3++) {
            iE += cv0.e(1, (t1) this.n.get(i3));
        }
        int iD = 0;
        while (true) {
            int size = this.f1099o.size();
            list = this.f1099o;
            if (i2 >= size) {
                break;
            }
            iD += cv0.d(((Integer) list.get(i2)).intValue());
            i2++;
        }
        int iD2 = iE + iD;
        if (!list.isEmpty()) {
            iD2 = iD2 + 1 + cv0.d(iD);
        }
        this.p = iD;
        int size2 = this.m.size() + iD2;
        this.r = size2;
        return size2;
    }

    @Override // o.t1
    public final fy2 d() {
        et3 et3Var = new et3();
        List list = Collections.EMPTY_LIST;
        et3Var.f740o = list;
        et3Var.p = list;
        return et3Var;
    }

    @Override // o.t1
    public final fy2 e() {
        et3 et3Var = new et3();
        List list = Collections.EMPTY_LIST;
        et3Var.f740o = list;
        et3Var.p = list;
        et3Var.h(this);
        return et3Var;
    }

    @Override // o.t1
    public final void f(cv0 cv0Var) throws IOException {
        c();
        for (int i = 0; i < this.n.size(); i++) {
            cv0Var.z(1, (t1) this.n.get(i));
        }
        if (this.f1099o.size() > 0) {
            cv0Var.G(42);
            cv0Var.G(this.p);
        }
        for (int i2 = 0; i2 < this.f1099o.size(); i2++) {
            cv0Var.y(((Integer) this.f1099o.get(i2)).intValue());
        }
        cv0Var.C(this.m);
    }

    public it3() {
        this.p = -1;
        this.q = (byte) -1;
        this.r = -1;
        this.m = zh0.m;
    }

    public it3(et3 et3Var) {
        this.p = -1;
        this.q = (byte) -1;
        this.r = -1;
        this.m = et3Var.m;
    }
}
