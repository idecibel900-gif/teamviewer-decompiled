package o;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class qj3 extends uu0 implements Runnable, f75, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1837o;
    public int p;
    public sk8 q;
    public final jx4 r;
    public final yf5 s;
    public final zw4 t;
    public final j57 u;

    public qj3() {
        super(1);
        jx4 jx4Var = new jx4(9);
        yk8.a.getClass();
        jx4Var.m(xk8.b, new pl8("caption bar"));
        jx4Var.m(xk8.c, new pl8("display cutout"));
        jx4Var.m(xk8.d, new pl8("ime"));
        jx4Var.m(xk8.e, new pl8("mandatory system gestures"));
        jx4Var.m(xk8.f, new pl8("navigation bars"));
        jx4Var.m(xk8.g, new pl8("status bars"));
        jx4Var.m(xk8.h, new pl8("system gestures"));
        jx4Var.m(xk8.i, new pl8("tappable element"));
        jx4Var.m(xk8.j, new pl8("waterfall"));
        this.r = jx4Var;
        this.s = new yf5(0);
        this.t = new zw4(4);
        this.u = new j57();
    }

    public final void G(sk8 sk8Var) {
        char c;
        char c2;
        boolean z;
        char c3;
        boolean z2;
        boolean z3;
        long j;
        boolean z4;
        boolean z5;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        Object[] objArr2;
        int i;
        kw4 kw4Var = al8.a;
        int[] iArr2 = kw4Var.b;
        Object[] objArr3 = kw4Var.c;
        long[] jArr2 = kw4Var.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            z2 = false;
            z3 = false;
            c = 16;
            c2 = ' ';
            while (true) {
                long j2 = jArr2[i2];
                z = true;
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    c3 = '0';
                    while (i5 < i4) {
                        if ((j2 & 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr2[i6];
                            yk8 yk8Var = (yk8) objArr3[i6];
                            nj3 nj3VarI = sk8Var.a.i(i7);
                            long j3 = (((long) nj3VarI.a) << 48) | (((long) nj3VarI.b) << 32) | (((long) nj3VarI.c) << 16) | ((long) nj3VarI.d);
                            Object objG = this.r.g(yk8Var);
                            objG.getClass();
                            pl8 pl8Var = (pl8) objG;
                            if (!o67.g(j3, pl8Var.h)) {
                                pl8Var.h = j3;
                                z2 = true;
                                if (!o67.g(j3, 0L)) {
                                    z3 = true;
                                }
                            }
                            if (i7 != 8) {
                                nj3 nj3VarJ = sk8Var.a.j(i7);
                                objArr2 = objArr3;
                                long j4 = (((long) nj3VarJ.b) << 32) | (((long) nj3VarJ.a) << 48) | (((long) nj3VarJ.c) << 16) | ((long) nj3VarJ.d);
                                if (!o67.g(pl8Var.i, j4)) {
                                    pl8Var.i = j4;
                                    z2 = true;
                                    if (!o67.g(j4, 0L)) {
                                        z3 = true;
                                    }
                                }
                            } else {
                                objArr2 = objArr3;
                            }
                            pl8Var.a.setValue(Boolean.valueOf(sk8Var.a.u(i7)));
                            i = 8;
                        } else {
                            objArr2 = objArr3;
                            i = i3;
                        }
                        j2 >>= i;
                        i5++;
                        i3 = i;
                        objArr3 = objArr2;
                        jArr2 = jArr2;
                        iArr2 = iArr2;
                    }
                    jArr = jArr2;
                    iArr = iArr2;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    jArr = jArr2;
                    iArr = iArr2;
                    objArr = objArr3;
                    c3 = '0';
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                objArr3 = objArr;
                jArr2 = jArr;
                iArr2 = iArr;
            }
        } else {
            c = 16;
            c2 = ' ';
            z = true;
            c3 = '0';
            z2 = false;
            z3 = false;
        }
        h22 h22VarH = sk8Var.a.h();
        if (h22VarH == null) {
            j = 0;
        } else {
            nj3 nj3VarC = h22VarH.c();
            j = (((long) nj3VarC.a) << c3) | (((long) nj3VarC.b) << c2) | (((long) nj3VarC.c) << c) | ((long) nj3VarC.d);
        }
        jx4 jx4Var = this.r;
        yk8.a.getClass();
        Object objG2 = jx4Var.g(xk8.j);
        objG2.getClass();
        pl8 pl8Var2 = (pl8) objG2;
        pl8Var2.a.setValue(Boolean.valueOf(!o67.g(j, 0L)));
        if (!o67.g(pl8Var2.h, j)) {
            pl8Var2.h = j;
            pl8Var2.i = j;
            z2 = z;
            if (!o67.g(j, 0L)) {
                z3 = z2;
            }
        }
        if (h22VarH == null) {
            zw4 zw4Var = this.t;
            if (zw4Var.b > 0) {
                zw4Var.d();
                this.u.clear();
                z2 = z;
            }
        } else {
            List listE = Build.VERSION.SDK_INT >= 28 ? dq.e(h22VarH.a) : Collections.EMPTY_LIST;
            int size = listE.size();
            zw4 zw4Var2 = this.t;
            if (size < zw4Var2.b) {
                zw4Var2.l(listE.size(), this.t.b);
                this.u.c(listE.size(), this.u.size());
                z2 = z;
            } else {
                int size2 = listE.size() - this.t.b;
                int i8 = 0;
                while (i8 < size2) {
                    zw4 zw4Var3 = this.t;
                    zw4Var3.a(h57.p(listE.get(zw4Var3.b)));
                    this.u.add(new ui3(fx3.e(this.t.b, "display cutout rect ")));
                    i8++;
                    z2 = z;
                }
            }
            int size3 = listE.size();
            for (int i9 = 0; i9 < size3; i9++) {
                Rect rect = (Rect) listE.get(i9);
                px4 px4Var = (px4) this.t.f(i9);
                if (!im3.n(px4Var.getValue(), rect)) {
                    px4Var.setValue(rect);
                    z2 = z;
                }
            }
            if (!listE.isEmpty()) {
                z3 = z;
            }
        }
        if ((z3 || this.s.z() != 0) && z2) {
            yf5 yf5Var = this.s;
            yf5Var.A(yf5Var.z() + 1);
            synchronized (v47.c) {
                kx4 kx4Var = v47.j.h;
                z4 = (kx4Var == null || kx4Var.h() != (z5 = z)) ? false : z5;
            }
            if (z4) {
                v47.c();
            }
        }
    }

    @Override // o.uu0
    public final void f(xj8 xj8Var) {
        boolean z = false;
        this.f1837o = false;
        int iD = xj8Var.a.d();
        this.p &= ~iD;
        this.q = null;
        yk8 yk8Var = (yk8) al8.a.b(iD);
        if (yk8Var != null) {
            Object objG = this.r.g(yk8Var);
            objG.getClass();
            pl8 pl8Var = (pl8) objG;
            pl8Var.c.A(0.0f);
            pl8Var.e.A(1.0f);
            pl8Var.d.A(0L);
            pl8Var.c.A(0.0f);
            pl8Var.b.setValue(Boolean.FALSE);
            pl8Var.j = -1L;
            pl8Var.k = -1L;
            yf5 yf5Var = this.s;
            yf5Var.A(yf5Var.z() + 1);
            synchronized (v47.c) {
                kx4 kx4Var = v47.j.h;
                if (kx4Var != null && kx4Var.h()) {
                    z = true;
                }
            }
            if (z) {
                v47.c();
            }
        }
    }

    @Override // o.uu0
    public final void g(xj8 xj8Var) {
        this.f1837o = true;
    }

    @Override // o.uu0
    public final sk8 h(sk8 sk8Var, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            xj8 xj8Var = (xj8) list.get(i);
            yk8 yk8Var = (yk8) al8.a.b(xj8Var.a.d());
            if (yk8Var != null) {
                Object objG = this.r.g(yk8Var);
                objG.getClass();
                pl8 pl8Var = (pl8) objG;
                if (((Boolean) pl8Var.b.getValue()).booleanValue()) {
                    wj8 wj8Var = xj8Var.a;
                    pl8Var.c.A(wj8Var.c());
                    pl8Var.e.A(wj8Var.a());
                    pl8Var.d.A(wj8Var.b());
                }
            }
        }
        G(sk8Var);
        return sk8Var;
    }

    @Override // o.uu0
    public final lh7 i(xj8 xj8Var, lh7 lh7Var) {
        sk8 sk8Var = this.q;
        boolean z = false;
        this.f1837o = false;
        this.q = null;
        if (xj8Var.a.b() > 0 && sk8Var != null) {
            int iD = xj8Var.a.d();
            this.p |= iD;
            yk8 yk8Var = (yk8) al8.a.b(iD);
            if (yk8Var != null) {
                Object objG = this.r.g(yk8Var);
                objG.getClass();
                pl8 pl8Var = (pl8) objG;
                nj3 nj3VarI = sk8Var.a.i(iD);
                long j = (((long) nj3VarI.a) << 48) | (((long) nj3VarI.b) << 32) | (((long) nj3VarI.c) << 16) | ((long) nj3VarI.d);
                long j2 = pl8Var.h;
                if (!o67.g(j, j2)) {
                    pl8Var.j = j2;
                    pl8Var.k = j;
                    pl8Var.b.setValue(Boolean.TRUE);
                    wj8 wj8Var = xj8Var.a;
                    pl8Var.c.A(wj8Var.c());
                    pl8Var.e.A(wj8Var.a());
                    pl8Var.d.A(wj8Var.b());
                    yf5 yf5Var = this.s;
                    yf5Var.A(yf5Var.z() + 1);
                    synchronized (v47.c) {
                        kx4 kx4Var = v47.j.h;
                        if (kx4Var != null && kx4Var.h()) {
                            z = true;
                        }
                    }
                    if (z) {
                        v47.c();
                        return lh7Var;
                    }
                }
            }
        }
        return lh7Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = be8.a;
        sd8.c(view, this);
        xj8.a(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = be8.a;
        sd8.c(view, null);
        xj8.a(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f1837o) {
            this.p = 0;
            this.f1837o = false;
            sk8 sk8Var = this.q;
            if (sk8Var != null) {
                G(sk8Var);
                this.q = null;
            }
        }
    }

    @Override // o.f75
    public final sk8 t(View view, sk8 sk8Var) {
        if (this.f1837o) {
            this.q = sk8Var;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return sk8Var;
            }
        } else if (this.p == 0) {
            G(sk8Var);
        }
        return sk8Var;
    }
}
