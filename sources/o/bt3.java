package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class bt3 extends oy2 {
    public static final bt3 s;
    public static final ys3 t = new ys3((byte) 1);
    public final zh0 m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f453o;
    public int p;
    public byte q;
    public int r;

    static {
        bt3 bt3Var = new bt3();
        s = bt3Var;
        bt3Var.f453o = 0;
        bt3Var.p = 0;
    }

    public bt3(vu0 vu0Var) {
        this.q = (byte) -1;
        this.r = -1;
        boolean z = false;
        this.f453o = 0;
        this.p = 0;
        xh0 xh0Var = new xh0();
        cv0 cv0VarR = cv0.r(xh0Var, 1);
        while (!z) {
            try {
                try {
                    int iM = vu0Var.m();
                    if (iM != 0) {
                        if (iM == 8) {
                            this.n |= 1;
                            this.f453o = vu0Var.j();
                        } else if (iM == 16) {
                            this.n |= 2;
                            this.p = vu0Var.j();
                        } else if (!vu0Var.p(iM, cv0VarR)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    try {
                        cv0VarR.u();
                    } catch (IOException unused) {
                    } finally {
                        this.m = xh0Var.q();
                    }
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
        try {
            cv0VarR.u();
        } catch (IOException unused2) {
        } finally {
            this.m = xh0Var.q();
        }
    }

    public static zs3 i(bt3 bt3Var) {
        zs3 zs3Var = new zs3((byte) 1);
        zs3Var.j(bt3Var);
        return zs3Var;
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
        int i = this.r;
        if (i != -1) {
            return i;
        }
        int iC = (this.n & 1) == 1 ? cv0.c(1, this.f453o) : 0;
        if ((this.n & 2) == 2) {
            iC += cv0.c(2, this.p);
        }
        int size = this.m.size() + iC;
        this.r = size;
        return size;
    }

    @Override // o.t1
    public final fy2 d() {
        return new zs3((byte) 1);
    }

    @Override // o.t1
    public final fy2 e() {
        return i(this);
    }

    @Override // o.t1
    public final void f(cv0 cv0Var) throws IOException {
        c();
        if ((this.n & 1) == 1) {
            cv0Var.x(1, this.f453o);
        }
        if ((this.n & 2) == 2) {
            cv0Var.x(2, this.p);
        }
        cv0Var.C(this.m);
    }

    public bt3() {
        this.q = (byte) -1;
        this.r = -1;
        this.m = zh0.m;
    }

    public bt3(zs3 zs3Var) {
        this.q = (byte) -1;
        this.r = -1;
        this.m = zs3Var.m;
    }
}
