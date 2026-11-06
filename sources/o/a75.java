package o;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class a75 implements qi0 {
    public final kb6 m;
    public final Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object[] f306o;
    public final pi0 p;
    public final vc1 q;
    public volatile boolean r;
    public a46 s;
    public Throwable t;
    public boolean u;

    public a75(kb6 kb6Var, Object obj, Object[] objArr, pi0 pi0Var, vc1 vc1Var) {
        this.m = kb6Var;
        this.n = obj;
        this.f306o = objArr;
        this.p = pi0Var;
        this.q = vc1Var;
    }

    @Override // o.qi0
    public final boolean G() {
        boolean z = true;
        if (this.r) {
            return true;
        }
        synchronized (this) {
            try {
                a46 a46Var = this.s;
                if (a46Var == null || !a46Var.C) {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final a46 a() {
        g93 g93Var;
        h93 h93VarA;
        kb6 kb6Var = this.m;
        xo1[] xo1VarArr = kb6Var.k;
        Object[] objArr = this.f306o;
        int length = objArr.length;
        if (length != xo1VarArr.length) {
            hk0.g(to7.l(fx3.k(length, "Argument count (", ") doesn't match expected count ("), xo1VarArr.length, ")"));
            return null;
        }
        fb6 fb6Var = new fb6(kb6Var.d, kb6Var.c, kb6Var.e, kb6Var.f, kb6Var.g, kb6Var.h, kb6Var.i, kb6Var.j);
        if (kb6Var.l) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            xo1VarArr[i].E(fb6Var, objArr[i]);
        }
        g93 g93Var2 = fb6Var.d;
        if (g93Var2 != null) {
            h93VarA = g93Var2.a();
        } else {
            String str = fb6Var.c;
            h93 h93Var = fb6Var.b;
            h93Var.getClass();
            str.getClass();
            try {
                g93Var = new g93();
                g93Var.c(h93Var, str);
            } catch (IllegalArgumentException unused) {
                g93Var = null;
            }
            h93VarA = g93Var != null ? g93Var.a() : null;
            if (h93VarA == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(h93Var);
                an4.o(sb, ", Relative: ", fb6Var.c);
                return null;
            }
        }
        db6 eb6Var = fb6Var.k;
        if (eb6Var == null) {
            m72 m72Var = fb6Var.j;
            if (m72Var != null) {
                eb6Var = new xs2(m72Var.a, m72Var.b);
            } else {
                ep3 ep3Var = fb6Var.i;
                if (ep3Var != null) {
                    ArrayList arrayList2 = (ArrayList) ep3Var.p;
                    if (arrayList2.isEmpty()) {
                        hk0.l("Multipart body must have at least one part.");
                        return null;
                    }
                    eb6Var = new bw4((ai0) ep3Var.n, (jo4) ep3Var.f733o, ro8.j(arrayList2));
                } else if (fb6Var.h) {
                    int i2 = db6.a;
                    po8.a(0L, 0L, 0L);
                    eb6Var = new cb6(null, 0, new byte[0]);
                }
            }
        }
        jo4 jo4Var = fb6Var.g;
        nm nmVar = fb6Var.f;
        if (jo4Var != null) {
            if (eb6Var != null) {
                eb6Var = new eb6(eb6Var, jo4Var);
            } else {
                nmVar.h("Content-Type", jo4Var.a);
            }
        }
        yc4 yc4Var = fb6Var.e;
        yc4Var.m = h93VarA;
        nmVar.getClass();
        yc4Var.f2598o = i67.k(i67.i(nmVar));
        yc4Var.P(fb6Var.a, eb6Var);
        yc4Var.q = ((u47) yc4Var.q).t(w86.a.b(an3.class), new an3(kb6Var.a, this.n, kb6Var.b, arrayList));
        return new a46((c75) this.p, new ab6(yc4Var));
    }

    public final a46 b() throws IOException {
        a46 a46Var = this.s;
        if (a46Var != null) {
            return a46Var;
        }
        Throwable th = this.t;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            a46 a46VarA = a();
            this.s = a46VarA;
            return a46VarA;
        } catch (IOException | Error | RuntimeException e) {
            im3.c0(e);
            this.t = e;
            throw e;
        }
    }

    @Override // o.qi0
    public final void b0(cj0 cj0Var) {
        a46 a46Var;
        Throwable th;
        synchronized (this) {
            try {
                if (this.u) {
                    throw new IllegalStateException("Already executed.");
                }
                this.u = true;
                a46Var = this.s;
                th = this.t;
                if (a46Var == null && th == null) {
                    try {
                        a46 a46VarA = a();
                        this.s = a46VarA;
                        a46Var = a46VarA;
                    } catch (Throwable th2) {
                        th = th2;
                        im3.c0(th);
                        this.t = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            cj0Var.d(this, th);
            return;
        }
        if (this.r) {
            a46Var.cancel();
        }
        a46Var.c(new a65((Object) this, (Object) cj0Var, (byte) 2));
    }

    public final kc6 c(lc6 lc6Var) throws IOException {
        nc6 nc6Var = lc6Var.s;
        jc6 jc6VarE = lc6Var.e();
        jc6VarE.g = new z65(nc6Var.q(), nc6Var.j());
        lc6 lc6VarA = jc6VarE.a();
        boolean z = lc6VarA.B;
        int i = lc6VarA.p;
        if (i < 200 || i >= 300) {
            try {
                bf0 bf0Var = new bf0();
                nc6Var.E0().r0(bf0Var);
                mc6 mc6Var = new mc6(nc6Var.q(), nc6Var.j(), bf0Var);
                if (z) {
                    throw new IllegalArgumentException("rawResponse should not be successful response");
                }
                kc6 kc6Var = new kc6(lc6VarA, null, mc6Var);
                nc6Var.close();
                return kc6Var;
            } catch (Throwable th) {
                nc6Var.close();
                throw th;
            }
        }
        if (i == 204 || i == 205) {
            nc6Var.close();
            if (z) {
                return new kc6(lc6VarA, null, null);
            }
            hk0.g("rawResponse must be successful response");
            return null;
        }
        y65 y65Var = new y65(nc6Var);
        try {
            Object objW = this.q.w(y65Var);
            if (z) {
                return new kc6(lc6VarA, objW, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        } catch (RuntimeException e) {
            IOException iOException = y65Var.p;
            if (iOException == null) {
                throw e;
            }
            throw iOException;
        }
    }

    @Override // o.qi0
    public final void cancel() {
        a46 a46Var;
        this.r = true;
        synchronized (this) {
            a46Var = this.s;
        }
        if (a46Var != null) {
            a46Var.cancel();
        }
    }

    public final Object clone() {
        return new a75(this.m, this.n, this.f306o, this.p, this.q);
    }

    @Override // o.qi0
    public final kc6 f() {
        a46 a46VarB;
        synchronized (this) {
            if (this.u) {
                throw new IllegalStateException("Already executed.");
            }
            this.u = true;
            a46VarB = b();
        }
        if (this.r) {
            a46VarB.cancel();
        }
        if (!a46VarB.r.compareAndSet(false, true)) {
            hk0.l("Already Executed");
            return null;
        }
        a46VarB.q.h();
        ql5 ql5Var = ql5.a;
        a46VarB.s = ql5.a.h();
        a46VarB.p.e(a46VarB);
        try {
            j93 j93Var = a46VarB.m.a;
            synchronized (j93Var) {
                ((ArrayDeque) j93Var.q).add(a46VarB);
            }
            lc6 lc6VarE = a46VarB.e();
            j93 j93Var2 = a46VarB.m.a;
            j93Var2.getClass();
            j93.Z(j93Var2, null, a46VarB, null, 5);
            return c(lc6VarE);
        } catch (Throwable th) {
            j93 j93Var3 = a46VarB.m.a;
            j93Var3.getClass();
            j93.Z(j93Var3, null, a46VarB, null, 5);
            throw th;
        }
    }

    @Override // o.qi0
    public final synchronized ab6 l0() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return b().n;
    }

    @Override // o.qi0
    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final qi0 mo33clone() {
        return new a75(this.m, this.n, this.f306o, this.p, this.q);
    }
}
