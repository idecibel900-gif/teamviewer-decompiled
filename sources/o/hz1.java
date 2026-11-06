package o;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hz1 extends oe8 {
    public final t36 A;
    public final yx6 B;
    public final r36 C;
    public final ll2 D;
    public final l97 E;
    public final t36 F;
    public final l97 G;
    public final t36 H;
    public final LinkedHashSet I;
    public n87 J;
    public final l97 K;
    public final t36 L;
    public final t36 M;
    public final t36 N;
    public final t36 O;
    public final hl4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final nx3 f1018o;
    public final SharedPreferences p;
    public final int q;
    public final l97 r;
    public final t36 s;
    public final l97 t;
    public final t36 u;
    public final l97 v;
    public final t36 w;
    public final l97 x;
    public final t36 y;
    public final l97 z;

    public hz1(SharedPreferences sharedPreferences, int i) {
        xl4 xl4Var = new xl4();
        nx3 nx3Var = new nx3((byte) 9);
        tk1 tk1Var = g22.a;
        gk1 gk1Var = gk1.f901o;
        sharedPreferences.getClass();
        gk1Var.getClass();
        this.n = xl4Var;
        this.f1018o = nx3Var;
        this.p = sharedPreferences;
        this.q = i;
        l97 l97VarK = im3.k(new j35("", false, true, false, false));
        this.r = l97VarK;
        this.s = yo1.u(l97VarK);
        ov1 ov1Var = ov1.n;
        ov1 ov1Var2 = ov1.p;
        ov1 ov1Var3 = ov1.m;
        l97 l97VarK2 = im3.k(new lr0(qf0.L(ov1Var3, ov1Var, ov1Var2), ov1Var3));
        this.t = l97VarK2;
        this.u = yo1.u(l97VarK2);
        byte b = 1;
        ea2 ea2Var = ea2.m;
        l97 l97VarK3 = im3.k(new ch2(true, ea2Var));
        this.v = l97VarK3;
        this.w = yo1.u(l97VarK3);
        hc1 hc1Var = null;
        l97 l97VarK4 = im3.k(null);
        this.x = l97VarK4;
        this.y = yo1.u(l97VarK4);
        Boolean bool = Boolean.FALSE;
        l97 l97VarK5 = im3.k(bool);
        this.z = l97VarK5;
        this.A = yo1.u(l97VarK5);
        yx6 yx6VarL = au8.l(0, 7, null);
        this.B = yx6VarL;
        this.C = new r36(yx6VarL);
        ll2 ll2Var = new ll2(xl4Var, nx3Var, e8.n(this), gk1Var);
        this.D = ll2Var;
        l97 l97VarK6 = im3.k(new gl4(false, false, false, false));
        this.E = l97VarK6;
        this.F = yo1.u(l97VarK6);
        l97 l97VarK7 = im3.k(bool);
        this.G = l97VarK7;
        this.H = yo1.u(l97VarK7);
        this.I = new LinkedHashSet();
        l97VarK2.l(null, lr0.a((lr0) l97VarK2.getValue(), nv1.A(sharedPreferences)));
        byte b2 = 3;
        im3.R(e8.n(this), null, null, new yy1(this, hc1Var, (byte) 2), 3);
        im3.R(e8.n(this), null, pe1.p, new yy1(this, hc1Var, b2), 1);
        im3.R(e8.n(this), null, null, new cz1(this, gk1Var, null), 3);
        im3.R(e8.n(this), gk1Var, null, new yy1(this, hc1Var, b), 2);
        ll2Var.q();
        this.K = im3.k(null);
        iw7 iw7Var = (iw7) ll2Var.p;
        t36 t36Var = iw7Var.g;
        iw7 iw7Var2 = (iw7) ll2Var.q;
        this.L = yo1.W(new jp2(t36Var, iw7Var2.g, new r31(b2, hc1Var, b), (byte) 0), e8.n(this), oy6.a(), ea2Var);
        this.M = yo1.W(new to2(new go2[]{iw7Var.i, iw7Var.k, iw7Var2.i, iw7Var2.k}, new s31(5, hc1Var, b), (byte) 4), e8.n(this), oy6.a(), Boolean.TRUE);
        this.N = yo1.W(new fm(iw7Var2.g, (byte) 3), e8.n(this), oy6.a(), ea2Var);
        this.O = yo1.W(new fm(iw7Var.g, (byte) 4), e8.n(this), oy6.a(), ea2Var);
    }

    public static ArrayList V0(List list, k33 k33Var) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!im3.n(((l33) obj).a, k33Var)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static ArrayList Y0(List list, k33 k33Var, String str) {
        ArrayList arrayList = new ArrayList(mv0.Z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l33 l33VarA = (l33) it.next();
            if (im3.n(l33VarA.a, k33Var)) {
                l33VarA = l33.a(l33VarA, str);
            }
            arrayList.add(l33VarA);
        }
        return arrayList;
    }

    public static ArrayList a1(List list, l33 l33Var) {
        k33 k33Var = l33Var.a;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (im3.n(((l33) it.next()).a, k33Var)) {
                    ArrayList arrayList = new ArrayList(mv0.Z(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        l33 l33Var2 = (l33) it2.next();
                        if (im3.n(l33Var2.a, k33Var)) {
                            l33Var2 = l33Var;
                        }
                        arrayList.add(l33Var2);
                    }
                    return arrayList;
                }
            }
        }
        return lv0.B0(list, l33Var);
    }

    public final void W0(d37 d37Var) {
        im3.R(e8.n(this), null, null, new oa1((Object) this, (Object) d37Var, (hc1) null, (byte) 15), 3);
    }

    public final void X0(boolean z) {
        l97 l97Var = this.E;
        gl4 gl4Var = (gl4) l97Var.getValue();
        if (gl4Var.c == z) {
            if (!z || gl4Var.d) {
                return;
            }
            n87 n87Var = this.J;
            if (n87Var != null && n87Var.e()) {
                return;
            }
        }
        n87 n87Var2 = this.J;
        hc1 hc1Var = null;
        if (n87Var2 != null) {
            n87Var2.j(null);
        }
        gl4 gl4VarB = gl4.b(gl4Var, false, false, z, false, 3);
        l97Var.getClass();
        l97Var.l(null, gl4VarB);
        if (z) {
            this.D.n();
            this.J = im3.R(e8.n(this), null, null, new yy1(this, hc1Var, (byte) 5), 3);
        }
    }

    public final void Z0(k33 k33Var, String str) {
        l97 l97Var = this.K;
        l33 l33VarA = (l33) l97Var.getValue();
        if (l33VarA == null) {
            l33VarA = null;
        } else if (im3.n(l33VarA.a, k33Var)) {
            l33VarA = l33.a(l33VarA, str);
        }
        l97Var.k(l33VarA);
    }
}
