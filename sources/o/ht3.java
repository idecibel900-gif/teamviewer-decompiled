package o;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ht3 extends oy2 {
    public static final ht3 y;
    public static final ys3 z = new ys3((byte) 4);
    public final zh0 m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1007o;
    public int p;
    public Object q;
    public gt3 r;
    public List s;
    public int t;
    public List u;
    public int v;
    public byte w;
    public int x;

    static {
        ht3 ht3Var = new ht3();
        y = ht3Var;
        ht3Var.f1007o = 1;
        ht3Var.p = 0;
        ht3Var.q = "";
        ht3Var.r = gt3.NONE;
        List list = Collections.EMPTY_LIST;
        ht3Var.s = list;
        ht3Var.u = list;
    }

    public ht3(vu0 vu0Var) {
        this.t = -1;
        this.v = -1;
        this.w = (byte) -1;
        this.x = -1;
        this.f1007o = 1;
        boolean z2 = false;
        this.p = 0;
        this.q = "";
        gt3 gt3Var = gt3.NONE;
        this.r = gt3Var;
        List list = Collections.EMPTY_LIST;
        this.s = list;
        this.u = list;
        xh0 xh0Var = new xh0();
        cv0 cv0VarR = cv0.r(xh0Var, 1);
        int i = 0;
        while (!z2) {
            try {
                try {
                    try {
                        int iM = vu0Var.m();
                        if (iM != 0) {
                            if (iM == 8) {
                                this.n |= 1;
                                this.f1007o = vu0Var.j();
                            } else if (iM == 16) {
                                this.n |= 2;
                                this.p = vu0Var.j();
                            } else if (iM == 24) {
                                int iJ = vu0Var.j();
                                gt3 gt3Var2 = iJ != 0 ? iJ != 1 ? iJ != 2 ? null : gt3.DESC_TO_CLASS_ID : gt3.INTERNAL_TO_CLASS_ID : gt3Var;
                                if (gt3Var2 == null) {
                                    cv0VarR.G(iM);
                                    cv0VarR.G(iJ);
                                } else {
                                    this.n |= 8;
                                    this.r = gt3Var2;
                                }
                            } else if (iM == 32) {
                                if ((i & 16) != 16) {
                                    this.s = new ArrayList();
                                    i |= 16;
                                }
                                this.s.add(Integer.valueOf(vu0Var.j()));
                            } else if (iM == 34) {
                                int iD = vu0Var.d(vu0Var.j());
                                if ((i & 16) != 16 && vu0Var.b() > 0) {
                                    this.s = new ArrayList();
                                    i |= 16;
                                }
                                while (vu0Var.b() > 0) {
                                    this.s.add(Integer.valueOf(vu0Var.j()));
                                }
                                vu0Var.c(iD);
                            } else if (iM == 40) {
                                if ((i & 32) != 32) {
                                    this.u = new ArrayList();
                                    i |= 32;
                                }
                                this.u.add(Integer.valueOf(vu0Var.j()));
                            } else if (iM == 42) {
                                int iD2 = vu0Var.d(vu0Var.j());
                                if ((i & 32) != 32 && vu0Var.b() > 0) {
                                    this.u = new ArrayList();
                                    i |= 32;
                                }
                                while (vu0Var.b() > 0) {
                                    this.u.add(Integer.valueOf(vu0Var.j()));
                                }
                                vu0Var.c(iD2);
                            } else if (iM == 50) {
                                pc4 pc4VarE = vu0Var.e();
                                this.n |= 4;
                                this.q = pc4VarE;
                            } else if (!vu0Var.p(iM, cv0VarR)) {
                            }
                        }
                        z2 = true;
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
                if ((i & 16) == 16) {
                    this.s = Collections.unmodifiableList(this.s);
                }
                if ((i & 32) == 32) {
                    this.u = Collections.unmodifiableList(this.u);
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
        if ((i & 16) == 16) {
            this.s = Collections.unmodifiableList(this.s);
        }
        if ((i & 32) == 32) {
            this.u = Collections.unmodifiableList(this.u);
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
        byte b = this.w;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.w = (byte) 1;
        return true;
    }

    @Override // o.t1
    public final int c() {
        List list;
        List list2;
        zh0 pc4Var;
        int i = this.x;
        if (i != -1) {
            return i;
        }
        int iC = (this.n & 1) == 1 ? cv0.c(1, this.f1007o) : 0;
        if ((this.n & 2) == 2) {
            iC += cv0.c(2, this.p);
        }
        if ((this.n & 8) == 8) {
            iC += cv0.b(3, this.r.m);
        }
        int i2 = 0;
        int iD = 0;
        while (true) {
            int size = this.s.size();
            list = this.s;
            if (i2 >= size) {
                break;
            }
            iD += cv0.d(((Integer) list.get(i2)).intValue());
            i2++;
        }
        int iD2 = iC + iD;
        if (!list.isEmpty()) {
            iD2 = iD2 + 1 + cv0.d(iD);
        }
        this.t = iD;
        int i3 = 0;
        int iD3 = 0;
        while (true) {
            int size2 = this.u.size();
            list2 = this.u;
            if (i3 >= size2) {
                break;
            }
            iD3 += cv0.d(((Integer) list2.get(i3)).intValue());
            i3++;
        }
        int size3 = iD2 + iD3;
        if (!list2.isEmpty()) {
            size3 = size3 + 1 + cv0.d(iD3);
        }
        this.v = iD3;
        if ((this.n & 4) == 4) {
            Object obj = this.q;
            if (obj instanceof String) {
                try {
                    pc4Var = new pc4(((String) obj).getBytes("UTF-8"));
                    this.q = pc4Var;
                } catch (UnsupportedEncodingException e) {
                    an4.n("UTF-8 not supported?", e);
                    return 0;
                }
            } else {
                pc4Var = (zh0) obj;
            }
            size3 += pc4Var.size() + cv0.g(pc4Var.size()) + cv0.i(6);
        }
        int size4 = this.m.size() + size3;
        this.x = size4;
        return size4;
    }

    @Override // o.t1
    public final fy2 d() {
        return ft3.h();
    }

    @Override // o.t1
    public final fy2 e() {
        ft3 ft3VarH = ft3.h();
        ft3VarH.i(this);
        return ft3VarH;
    }

    @Override // o.t1
    public final void f(cv0 cv0Var) throws IOException {
        zh0 pc4Var;
        c();
        if ((this.n & 1) == 1) {
            cv0Var.x(1, this.f1007o);
        }
        if ((this.n & 2) == 2) {
            cv0Var.x(2, this.p);
        }
        if ((this.n & 8) == 8) {
            cv0Var.w(3, this.r.m);
        }
        if (this.s.size() > 0) {
            cv0Var.G(34);
            cv0Var.G(this.t);
        }
        for (int i = 0; i < this.s.size(); i++) {
            cv0Var.y(((Integer) this.s.get(i)).intValue());
        }
        if (this.u.size() > 0) {
            cv0Var.G(42);
            cv0Var.G(this.v);
        }
        for (int i2 = 0; i2 < this.u.size(); i2++) {
            cv0Var.y(((Integer) this.u.get(i2)).intValue());
        }
        if ((this.n & 4) == 4) {
            Object obj = this.q;
            if (obj instanceof String) {
                try {
                    pc4Var = new pc4(((String) obj).getBytes("UTF-8"));
                    this.q = pc4Var;
                } catch (UnsupportedEncodingException e) {
                    an4.n("UTF-8 not supported?", e);
                    return;
                }
            } else {
                pc4Var = (zh0) obj;
            }
            cv0Var.I(6, 2);
            cv0Var.G(pc4Var.size());
            cv0Var.C(pc4Var);
        }
        cv0Var.C(this.m);
    }

    public ht3() {
        this.t = -1;
        this.v = -1;
        this.w = (byte) -1;
        this.x = -1;
        this.m = zh0.m;
    }

    public ht3(ft3 ft3Var) {
        this.t = -1;
        this.v = -1;
        this.w = (byte) -1;
        this.x = -1;
        this.m = ft3Var.m;
    }
}
