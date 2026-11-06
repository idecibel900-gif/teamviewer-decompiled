package o;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class x03 implements xi6, v75, se2 {
    public static final String A = we4.i("GreedyScheduler");
    public final Context m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final qm1 f2465o;
    public boolean p;
    public final dt5 s;
    public final lh7 t;
    public final d11 u;
    public Boolean w;
    public final nm x;
    public final yc4 y;
    public final pn5 z;
    public final HashMap n = new HashMap();
    public final Object q = new Object();
    public final lh7 r = new lh7(new og1((byte) 6));
    public final HashMap v = new HashMap();

    public x03(Context context, d11 d11Var, yc4 yc4Var, dt5 dt5Var, lh7 lh7Var, yc4 yc4Var2) {
        this.m = context;
        xc0 xc0Var = (xc0) d11Var.q;
        this.f2465o = new qm1(this, xc0Var, (yi5) d11Var.p);
        pn5 pn5Var = new pn5();
        pn5Var.m = xc0Var;
        pn5Var.n = lh7Var;
        pn5Var.f1752o = new Object();
        pn5Var.p = new LinkedHashMap();
        this.z = pn5Var;
        this.y = yc4Var2;
        this.x = new nm(yc4Var);
        this.u = d11Var;
        this.s = dt5Var;
        this.t = lh7Var;
    }

    @Override // o.v75
    public final void a(xm8 xm8Var, y61 y61Var) {
        km8 km8VarJ = u47.j(xm8Var);
        boolean z = y61Var instanceof w61;
        lh7 lh7Var = this.t;
        pn5 pn5Var = this.z;
        String str = A;
        lh7 lh7Var2 = this.r;
        if (z) {
            if (lh7Var2.k(km8VarJ)) {
                return;
            }
            we4.f().c(str, "Constraints met: Scheduling work ID " + km8VarJ);
            b97 b97VarE = lh7Var2.E(km8VarJ);
            pn5Var.E(b97VarE);
            lh7Var.getClass();
            lh7Var.B(b97VarE, null);
            return;
        }
        we4.f().c(str, "Constraints not met: Cancelling work ID " + km8VarJ);
        b97 b97VarX = lh7Var2.x(km8VarJ);
        if (b97VarX != null) {
            pn5Var.d(b97VarX);
            int i = ((x61) y61Var).a;
            lh7Var.getClass();
            lh7Var.C(b97VarX, i);
        }
    }

    @Override // o.xi6
    public final void b(xm8... xm8VarArr) {
        long jMax;
        Boolean boolValueOf = this.w;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(bt5.a(this.m, this.u));
            this.w = boolValueOf;
        }
        if (!boolValueOf.booleanValue()) {
            we4.f().g(A, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.p) {
            this.s.a(this);
            this.p = true;
        }
        HashSet<xm8> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (xm8 xm8Var : xm8VarArr) {
            if (!this.r.k(u47.j(xm8Var))) {
                synchronized (this.q) {
                    try {
                        km8 km8VarJ = u47.j(xm8Var);
                        w03 w03Var = (w03) this.v.get(km8VarJ);
                        if (w03Var == null) {
                            int i = xm8Var.k;
                            Object obj = this.u.p;
                            w03Var = new w03(i, System.currentTimeMillis());
                            this.v.put(km8VarJ, w03Var);
                        }
                        jMax = (((long) Math.max((xm8Var.k - w03Var.a) - 5, 0)) * 30000) + w03Var.b;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                long jMax2 = Math.max(xm8Var.a(), jMax);
                Object obj2 = this.u.p;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (xm8Var.b == lm8.m) {
                    if (jCurrentTimeMillis < jMax2) {
                        qm1 qm1Var = this.f2465o;
                        if (qm1Var != null) {
                            xc0 xc0Var = qm1Var.b;
                            HashMap map = qm1Var.c;
                            Runnable runnable = (Runnable) map.remove(xm8Var.a);
                            if (runnable != null) {
                                ((Handler) xc0Var.n).removeCallbacks(runnable);
                            }
                            it8 it8Var = new it8((byte) 10, qm1Var, xm8Var, false);
                            map.put(xm8Var.a, it8Var);
                            ((Handler) xc0Var.n).postDelayed(it8Var, jMax2 - System.currentTimeMillis());
                        }
                    } else if (!im3.n(q61.j, xm8Var.j)) {
                        q61 q61Var = xm8Var.j;
                        if (q61Var.d) {
                            we4.f().c(A, "Ignoring " + xm8Var + ". Requires device idle.");
                        } else if (q61Var.i.isEmpty()) {
                            hashSet.add(xm8Var);
                            hashSet2.add(xm8Var.a);
                        } else {
                            we4.f().c(A, "Ignoring " + xm8Var + ". Requires ContentUri triggers.");
                        }
                    } else if (!this.r.k(u47.j(xm8Var))) {
                        we4.f().c(A, "Starting work for " + xm8Var.a);
                        lh7 lh7Var = this.r;
                        lh7Var.getClass();
                        b97 b97VarE = lh7Var.E(u47.j(xm8Var));
                        this.z.E(b97VarE);
                        lh7 lh7Var2 = this.t;
                        lh7Var2.getClass();
                        lh7Var2.B(b97VarE, null);
                    }
                }
            }
        }
        synchronized (this.q) {
            try {
                if (!hashSet.isEmpty()) {
                    we4.f().c(A, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    for (xm8 xm8Var2 : hashSet) {
                        km8 km8VarJ2 = u47.j(xm8Var2);
                        if (!this.n.containsKey(km8VarJ2)) {
                            this.n.put(km8VarJ2, cm8.a(this.x, xm8Var2, (fe1) this.y.n, this));
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // o.xi6
    public final boolean c() {
        return false;
    }

    @Override // o.xi6
    public final void d(String str) {
        List<b97> listE;
        Runnable runnable;
        String str2 = A;
        Boolean boolValueOf = this.w;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(bt5.a(this.m, this.u));
            this.w = boolValueOf;
        }
        if (!boolValueOf.booleanValue()) {
            we4.f().g(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.p) {
            this.s.a(this);
            this.p = true;
        }
        we4.f().c(str2, "Cancelling work ID " + str);
        qm1 qm1Var = this.f2465o;
        if (qm1Var != null && (runnable = (Runnable) qm1Var.c.remove(str)) != null) {
            ((Handler) qm1Var.b.n).removeCallbacks(runnable);
        }
        lh7 lh7Var = this.r;
        lh7Var.getClass();
        str.getClass();
        synchronized (lh7Var.f1364o) {
            listE = ((og1) lh7Var.n).e(str);
        }
        for (b97 b97Var : listE) {
            this.z.d(b97Var);
            lh7 lh7Var2 = this.t;
            lh7Var2.getClass();
            lh7Var2.C(b97Var, -512);
        }
    }

    @Override // o.se2
    public final void e(km8 km8Var, boolean z) {
        bp3 bp3Var;
        b97 b97VarX = this.r.x(km8Var);
        if (b97VarX != null) {
            this.z.d(b97VarX);
        }
        synchronized (this.q) {
            bp3Var = (bp3) this.n.remove(km8Var);
        }
        if (bp3Var != null) {
            we4.f().c(A, "Stopping tracking for " + km8Var);
            bp3Var.j(null);
        }
        if (z) {
            return;
        }
        synchronized (this.q) {
            this.v.remove(km8Var);
        }
    }
}
