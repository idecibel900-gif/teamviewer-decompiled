package o;

import android.content.ClipDescription;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class pr7 {
    public final io.sentry.android.core.n1 A;
    public boolean B;
    public final u78 a;
    public j64 d;
    public Function0 g;
    public au0 h;
    public me1 i;
    public jm5 j;
    public v43 k;
    public sq2 l;
    public final bg5 m;
    public final bg5 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f1768o;
    public gt7 p;
    public long q;
    public final bg5 r;
    public final bg5 s;
    public int t;
    public zr7 u;
    public io.sentry.android.core.n1 v;
    public gt7 w;
    public final bg5 x;
    public final lh7 y;
    public final nr7 z;
    public v65 b = eb8.a;
    public Function1 c = new vs6((byte) 29);
    public final bg5 e = h57.p(new zr7(7, 0, (String) null));
    public tg8 f = xz2.Z;

    public pr7(u78 u78Var) {
        this.a = u78Var;
        Boolean bool = Boolean.TRUE;
        this.m = h57.p(bool);
        this.n = h57.p(bool);
        this.f1768o = 0L;
        this.q = 0L;
        this.r = h57.p(null);
        this.s = h57.p(null);
        this.t = -1;
        this.u = new zr7(7, 0L, (String) null);
        this.x = h57.p(Boolean.FALSE);
        lh7 lh7Var = new lh7((byte) 3, false);
        lh7Var.f1364o = mz7.m;
        this.y = lh7Var;
        this.z = new nr7(this);
        this.A = new io.sentry.android.core.n1(this);
    }

    public static zr7 b(xo xoVar, long j) {
        return new zr7(xoVar, j, (gt7) null);
    }

    public final n87 a(boolean z) {
        me1 me1Var = this.i;
        hc1 hc1Var = null;
        if (me1Var == null) {
            return null;
        }
        return im3.R(me1Var, null, pe1.p, new g6(this, z, hc1Var, (byte) 6), 1);
    }

    public final void c() {
        me1 me1Var = this.i;
        if (me1Var != null) {
            im3.R(me1Var, null, pe1.p, new y0(this, null, (byte) 29), 1);
        }
    }

    public final void d(t65 t65Var) {
        if (!gt7.c(l().b)) {
            j64 j64Var = this.d;
            ws7 ws7VarD = j64Var != null ? j64Var.d() : null;
            int iE = (t65Var == null || ws7VarD == null) ? gt7.e(l().b) : this.b.k(ws7VarD.b(t65Var.a, true));
            zr7 zr7VarA = zr7.a(l(), null, h57.a(iE, iE), 5);
            this.c.invoke(zr7VarA);
            this.w = new gt7(zr7VarA.b);
        }
        r((t65Var == null || l().a.n.length() <= 0) ? n43.m : n43.f1537o);
        u(false);
    }

    public final void e(boolean z) {
        sq2 sq2Var;
        j64 j64Var = this.d;
        if (j64Var != null && !j64Var.b() && (sq2Var = this.l) != null) {
            sq2.a(sq2Var);
        }
        this.u = l();
        u(z);
        r(n43.n);
    }

    public final vd5 f() {
        String str;
        gt7 gt7Var;
        xo xoVarK = k();
        if (xoVarK == null || (str = xoVarK.n) == null || (gt7Var = this.w) == null) {
            return null;
        }
        long j = gt7Var.a;
        return new vd5(str, new gt7(h57.a(this.b.q((int) (j >> 32)), this.b.q((int) (j & 4294967295L)))));
    }

    public final t65 g() {
        return (t65) this.s.getValue();
    }

    public final boolean h() {
        return ((Boolean) this.m.getValue()).booleanValue();
    }

    public final boolean i() {
        return ((Boolean) this.n.getValue()).booleanValue();
    }

    public final long j(boolean z) {
        ws7 ws7VarD;
        long j;
        j64 j64Var = this.d;
        if (j64Var == null || (ws7VarD = j64Var.d()) == null) {
            return 9205357640488583168L;
        }
        vs7 vs7Var = ws7VarD.a;
        xu4 xu4Var = vs7Var.b;
        xo xoVarK = k();
        if (xoVarK == null) {
            return 9205357640488583168L;
        }
        if (!im3.n(xoVarK.n, vs7Var.a.a.n)) {
            return 9205357640488583168L;
        }
        zr7 zr7VarL = l();
        if (z) {
            long j2 = zr7VarL.b;
            int i = gt7.c;
            j = j2 >> 32;
        } else {
            long j3 = zr7VarL.b;
            int i2 = gt7.c;
            j = j3 & 4294967295L;
        }
        int iQ = this.b.q((int) j);
        boolean zG = gt7.g(l().b);
        long j4 = vs7Var.c;
        int iD = xu4Var.d(iQ);
        if (iD >= xu4Var.f) {
            return 9205357640488583168L;
        }
        boolean z2 = vs7Var.a(((!z || zG) && (z || !zG)) ? Math.max(iQ + (-1), 0) : iQ) == vs7Var.h(iQ);
        xu4Var.l(iQ);
        int length = ((xo) xu4Var.a.m).n.length();
        ArrayList arrayList = xu4Var.h;
        cf5 cf5Var = (cf5) arrayList.get(iQ == length ? arrayList.size() - 1 : ct1.F(iQ, arrayList));
        mj mjVar = cf5Var.a;
        int iD2 = cf5Var.d(iQ);
        ts7 ts7Var = mjVar.d;
        return (((long) Float.floatToRawIntBits(ct1.u(xu4Var.b(iD), 0.0f, (int) (j4 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(ct1.u(z2 ? ts7Var.i(iD2, false) : ts7Var.j(iD2, false), 0.0f, (int) (j4 >> 32)))) << 32);
    }

    public final xo k() {
        j64 j64Var = this.d;
        if (j64Var != null) {
            return (xo) j64Var.a.b;
        }
        return null;
    }

    public final zr7 l() {
        return (zr7) this.e.getValue();
    }

    public final void m() {
        n87 n87Var;
        up7 up7Var = (up7) this.y.n;
        if (up7Var == null || (n87Var = up7Var.G) == null) {
            return;
        }
        n87Var.j(null);
        up7Var.G = null;
    }

    public final void n(gt7 gt7Var) {
        xo xoVarK;
        String str;
        me1 me1Var;
        if (gt7Var == null) {
            return;
        }
        long j = gt7Var.a;
        jm5 jm5Var = this.j;
        if (jm5Var == null || (xoVarK = k()) == null || (str = xoVarK.n) == null) {
            return;
        }
        v65 v65Var = this.b;
        long jA = h57.a(v65Var.q((int) (j >> 32)), v65Var.q((int) (j & 4294967295L)));
        if (str.length() <= 0 || gt7.c(jA) || (me1Var = this.i) == null) {
            return;
        }
        im3.R(me1Var, null, null, new ab1(jm5Var, str, jA, gt7Var, this, v65Var, null), 3);
    }

    public final void o() {
        me1 me1Var = this.i;
        if (me1Var != null) {
            im3.R(me1Var, null, pe1.p, new ir7(this, null, (byte) 1), 1);
        }
    }

    public final void p(t65 t65Var) {
        this.s.setValue(t65Var);
    }

    public final void q(l43 l43Var) {
        this.r.setValue(l43Var);
    }

    public final void r(n43 n43Var) {
        j64 j64Var = this.d;
        if (j64Var != null) {
            if (j64Var.a() == n43Var) {
                j64Var = null;
            }
            if (j64Var != null) {
                j64Var.k.setValue(n43Var);
            }
        }
    }

    public final void s() {
        j64 j64Var;
        op7 op7Var;
        n47 n47VarC = el5.c();
        hc1 hc1Var = null;
        Function1 function1E = n47VarC != null ? n47VarC.e() : null;
        n47 n47VarF = el5.f(n47VarC);
        try {
            if (!i() || ((j64Var = this.d) != null && !((Boolean) j64Var.q.getValue()).booleanValue())) {
                el5.h(n47VarC, n47VarF, function1E);
                return;
            }
            el5.h(n47VarC, n47VarF, function1E);
            lh7 lh7Var = this.y;
            if (((mz7) lh7Var.f1364o) == mz7.m) {
                ni3.c("ToolbarRequester is not initialized.");
            }
            up7 up7Var = (up7) lh7Var.n;
            if (up7Var == null || !up7Var.z) {
                return;
            }
            n87 n87Var = up7Var.G;
            if ((n87Var == null || !n87Var.e()) && (op7Var = (op7) xk0.q(up7Var, pp7.b)) != null) {
                up7Var.G = im3.R(up7Var.I0(), null, pe1.p, new tx(up7Var, op7Var, hc1Var, (byte) 11), 1);
            }
        } catch (Throwable th) {
            el5.h(n47VarC, n47VarF, function1E);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object t(jc1 jc1Var) {
        or7 or7Var;
        if (jc1Var instanceof or7) {
            or7Var = (or7) jc1Var;
            int i = or7Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                or7Var.p = i - Integer.MIN_VALUE;
            } else {
                or7Var = new or7(this, jc1Var);
            }
        } else {
            or7Var = new or7(this, jc1Var);
        }
        Object objValueOf = or7Var.n;
        int i2 = or7Var.p;
        if (i2 == 0) {
            ct1.a0(objValueOf);
            au0 au0Var = this.h;
            if (au0Var != null) {
                or7Var.m = this;
                or7Var.p = 1;
                ClipDescription primaryClipDescription = di1.s(au0Var).getPrimaryClipDescription();
                objValueOf = Boolean.valueOf(primaryClipDescription == null ? false : primaryClipDescription.hasMimeType("text/*"));
                Object obj = ne1.m;
                if (objValueOf == obj) {
                    return obj;
                }
            }
            return f88.a;
        }
        if (i2 != 1) {
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        this = or7Var.m;
        ct1.a0(objValueOf);
        Boolean bool = (Boolean) objValueOf;
        bool.getClass();
        this.x.setValue(bool);
        return f88.a;
    }

    public final void u(boolean z) {
        j64 j64Var = this.d;
        if (j64Var != null) {
            j64Var.l.setValue(Boolean.valueOf(z));
        }
        if (z) {
            s();
        } else {
            m();
        }
    }

    public final long v(zr7 zr7Var, long j, boolean z, boolean z2, jo6 jo6Var, boolean z3, w43 w43Var) {
        ws7 ws7VarD;
        long j2;
        int i;
        long j3;
        io6 io6Var;
        boolean z4;
        boolean z5;
        v43 v43Var;
        j64 j64Var = this.d;
        if (j64Var == null || (ws7VarD = j64Var.d()) == null) {
            return gt7.b;
        }
        v65 v65Var = this.b;
        long j4 = zr7Var.b;
        xo xoVar = zr7Var.a;
        int i2 = gt7.c;
        long jA = h57.a(v65Var.q((int) (j4 >> 32)), this.b.q((int) (j4 & 4294967295L)));
        int iB = ws7VarD.b(j, false);
        int i3 = (z2 || z) ? iB : (int) (jA >> 32);
        if (!z2 || z) {
            j2 = 4294967295L;
            i = iB;
        } else {
            j2 = 4294967295L;
            i = (int) (jA & 4294967295L);
        }
        io.sentry.android.core.n1 n1Var = this.v;
        int i4 = -1;
        if (z || n1Var == null) {
            j3 = j2;
        } else {
            j3 = j2;
            int i5 = this.t;
            if (i5 != -1) {
                i4 = i5;
            }
        }
        vs7 vs7Var = ws7VarD.a;
        if (z) {
            io6Var = null;
        } else {
            int i6 = (int) (jA >> 32);
            int i7 = (int) (jA & j3);
            io6Var = new io6(new ho6(yo1.D(vs7Var, i6), i6, 1L), new ho6(yo1.D(vs7Var, i7), i7, 1L), gt7.g(jA));
        }
        io.sentry.android.core.n1 n1Var2 = new io.sentry.android.core.n1((byte) 7, io6Var, new rr0(i3, i, i4, vs7Var), z2);
        if (io6Var != null && n1Var != null && z2 == n1Var.n) {
            rr0 rr0Var = (rr0) n1Var.p;
            if (i3 == rr0Var.b && i == rr0Var.c) {
                return j4;
            }
        }
        this.v = n1Var2;
        this.t = iB;
        io6 io6VarB = jo6Var.b(n1Var2);
        long jA2 = h57.a(this.b.k(io6VarB.a.b), this.b.k(io6VarB.b.b));
        if (gt7.b(jA2, j4)) {
            return j4;
        }
        boolean z6 = gt7.g(jA2) != gt7.g(j4) && gt7.b(h57.a((int) (jA2 & j3), (int) (jA2 >> 32)), j4);
        boolean z7 = gt7.c(jA2) && gt7.c(j4);
        if (z3 && xoVar.n.length() > 0 && !z6 && !z7 && w43Var != null && (v43Var = this.k) != null) {
            ((tl5) v43Var).a(w43Var.a);
        }
        this.c.invoke(b(xoVar, jA2));
        this.w = new gt7(jA2);
        if (!z3) {
            u(!gt7.c(jA2));
        }
        j64 j64Var2 = this.d;
        if (j64Var2 != null) {
            j64Var2.q.setValue(Boolean.valueOf(z3));
        }
        j64 j64Var3 = this.d;
        if (j64Var3 != null) {
            j64Var3.m.setValue(Boolean.valueOf(!gt7.c(jA2) && l47.p(this, true)));
        }
        j64 j64Var4 = this.d;
        if (j64Var4 != null) {
            if (gt7.c(jA2)) {
                z4 = false;
            } else {
                z4 = false;
                if (l47.p(this, false)) {
                    z5 = true;
                }
                j64Var4.n.setValue(Boolean.valueOf(z5));
            }
            z5 = z4;
            j64Var4.n.setValue(Boolean.valueOf(z5));
        } else {
            z4 = false;
        }
        j64 j64Var5 = this.d;
        if (j64Var5 != null) {
            j64Var5.f1135o.setValue(Boolean.valueOf((gt7.c(jA2) && l47.p(this, true)) ? true : z4));
        }
        return jA2;
    }
}
