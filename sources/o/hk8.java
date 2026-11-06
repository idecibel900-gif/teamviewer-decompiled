package o;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class hk8 extends pk8 {
    public static boolean n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static Method f983o;
    public static Class p;
    public static Field q;
    public static Field r;
    public final WindowInsets c;
    public nj3[] d;
    public nj3 e;
    public sk8 f;
    public nj3 g;
    public int h;
    public l22 i;
    public int j;
    public int k;
    public Rect[][] l;
    public Rect[][] m;

    public hk8(sk8 sk8Var, WindowInsets windowInsets) {
        super(sk8Var);
        this.e = null;
        this.l = new Rect[10][];
        this.m = new Rect[10][];
        this.c = windowInsets;
    }

    private l22 D(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.a.a.t()) {
            return l22.a(point.x, point.y, true, 0, 0, 0, 0);
        }
        pf6 pf6VarZ = vt1.z(display, 0);
        pf6 pf6VarZ2 = vt1.z(display, 1);
        pf6 pf6VarZ3 = vt1.z(display, 2);
        pf6 pf6VarZ4 = vt1.z(display, 3);
        return l22.a(point.x, point.y, false, pf6VarZ != null ? pf6VarZ.b : 0, pf6VarZ2 != null ? pf6VarZ2.b : 0, pf6VarZ3 != null ? pf6VarZ3.b : 0, pf6VarZ4 != null ? pf6VarZ4.b : 0);
    }

    private static List<Rect> E(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[v67.l(i2)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                    System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                    rectArr3 = rectArr4;
                }
            }
        }
        return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
    }

    private Rect[] F(nj3 nj3Var) {
        ArrayList arrayList = new ArrayList();
        int i = nj3Var.a;
        int i2 = nj3Var.d;
        int i3 = nj3Var.c;
        int i4 = nj3Var.b;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, nj3Var.a, this.j));
        }
        if (i4 != 0) {
            arrayList.add(new Rect(0, 0, this.k, i4));
        }
        if (i3 != 0) {
            int i5 = this.k;
            arrayList.add(new Rect(i5 - i3, 0, i5, this.j));
        }
        if (i2 != 0) {
            int i6 = this.j;
            arrayList.add(new Rect(0, i6 - i2, this.k, i6));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    private nj3 G(int i, boolean z) {
        nj3 nj3VarA = nj3.e;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                nj3VarA = nj3.a(nj3VarA, H(i2, z));
            }
        }
        return nj3VarA;
    }

    private nj3 I() {
        sk8 sk8Var = this.f;
        return sk8Var != null ? sk8Var.a.l() : nj3.e;
    }

    private nj3 J(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            yq4.r("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            return null;
        }
        if (!n) {
            L();
        }
        Method method = f983o;
        if (method != null && p != null && q != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    io.sentry.android.core.v0.l("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) q.get(r.get(objInvoke));
                if (rect != null) {
                    return nj3.b(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e) {
                io.sentry.android.core.v0.d("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    private static void L() {
        try {
            f983o = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            p = cls;
            q = cls.getDeclaredField("mVisibleInsets");
            r = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            q.setAccessible(true);
            r.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            io.sentry.android.core.v0.d("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        n = true;
    }

    public static boolean M(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    @Override // o.pk8
    public void A(int i) {
        this.h = i;
    }

    @Override // o.pk8
    public void B(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.l = (Rect[][]) rectArr.clone();
    }

    @Override // o.pk8
    public void C(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.m = (Rect[][]) rectArr.clone();
    }

    public nj3 H(int i, boolean z) {
        nj3 nj3VarL;
        int i2;
        nj3 nj3Var = nj3.e;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    nj3[] nj3VarArr = this.d;
                    nj3VarL = nj3VarArr != null ? nj3VarArr[v67.l(8)] : null;
                    if (nj3VarL != null) {
                        return nj3VarL;
                    }
                    nj3 nj3VarN = n();
                    nj3 nj3VarI = I();
                    int i3 = nj3VarN.d;
                    if (i3 > nj3VarI.d) {
                        return nj3.b(0, 0, 0, i3);
                    }
                    nj3 nj3Var2 = this.g;
                    if (nj3Var2 != null && !nj3Var2.equals(nj3Var) && (i2 = this.g.d) > nj3VarI.d) {
                        return nj3.b(0, 0, 0, i2);
                    }
                } else {
                    if (i == 16) {
                        return m();
                    }
                    if (i == 32) {
                        return k();
                    }
                    if (i == 64) {
                        return o();
                    }
                    if (i == 128) {
                        sk8 sk8Var = this.f;
                        h22 h22VarH = sk8Var != null ? sk8Var.a.h() : h();
                        if (h22VarH != null) {
                            int iA = h22VarH.a();
                            int i4 = Build.VERSION.SDK_INT;
                            return nj3.b(iA, i4 >= 28 ? dq.p(h22VarH.a) : 0, h22VarH.b(), i4 >= 28 ? dq.m(h22VarH.a) : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    nj3 nj3VarI2 = I();
                    nj3 nj3VarL2 = l();
                    return nj3.b(Math.max(nj3VarI2.a, nj3VarL2.a), 0, Math.max(nj3VarI2.c, nj3VarL2.c), Math.max(nj3VarI2.d, nj3VarL2.d));
                }
                if ((this.h & 2) == 0) {
                    nj3 nj3VarN2 = n();
                    sk8 sk8Var2 = this.f;
                    nj3VarL = sk8Var2 != null ? sk8Var2.a.l() : null;
                    int iMin = nj3VarN2.d;
                    if (nj3VarL != null) {
                        iMin = Math.min(iMin, nj3VarL.d);
                    }
                    return nj3.b(nj3VarN2.a, 0, nj3VarN2.c, iMin);
                }
            }
        } else {
            if (z) {
                return nj3.b(0, Math.max(I().b, n().b), 0, 0);
            }
            if ((this.h & 4) == 0) {
                return nj3.b(0, n().b, 0, 0);
            }
        }
        return nj3Var;
    }

    public boolean K(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !H(i, false).equals(nj3.e);
    }

    @Override // o.pk8
    public void d(View view) {
        this.k = view.getWidth();
        this.j = view.getHeight();
        nj3 nj3VarJ = J(view);
        if (nj3VarJ == null) {
            nj3VarJ = nj3.e;
        }
        x(nj3VarJ);
    }

    @Override // o.pk8
    public void e(sk8 sk8Var) {
        sk8Var.a.y(this.f);
        nj3 nj3Var = this.g;
        pk8 pk8Var = sk8Var.a;
        pk8Var.x(nj3Var);
        pk8Var.A(this.h);
        pk8Var.v(this.i);
        pk8Var.B(this.l);
        pk8Var.C(this.m);
    }

    @Override // o.pk8
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        hk8 hk8Var = (hk8) obj;
        return Objects.equals(this.g, hk8Var.g) && M(this.h, hk8Var.h);
    }

    @Override // o.pk8
    public List<Rect> f(int i) {
        return E(this.l, i);
    }

    @Override // o.pk8
    public List<Rect> g(int i) {
        return E(this.m, i);
    }

    @Override // o.pk8
    public nj3 i(int i) {
        return G(i, false);
    }

    @Override // o.pk8
    public nj3 j(int i) {
        return G(i, true);
    }

    @Override // o.pk8
    public final nj3 n() {
        nj3 nj3Var = this.e;
        if (nj3Var != null) {
            return nj3Var;
        }
        WindowInsets windowInsets = this.c;
        nj3 nj3VarB = nj3.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        this.e = nj3VarB;
        return nj3VarB;
    }

    @Override // o.pk8
    public void p(View view) {
        this.i = D(view);
    }

    @Override // o.pk8
    public void q() {
        for (int i = 1; i <= 512; i <<= 1) {
            int iL = v67.l(i);
            this.l[iL] = F(i(i));
            if (i != 8) {
                this.m[iL] = F(j(i));
            }
        }
    }

    @Override // o.pk8
    public sk8 r(int i, int i2, int i3, int i4) {
        gk8 ak8Var;
        sk8 sk8VarG = sk8.g(this.c, null);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 36) {
            ak8Var = new fk8(sk8VarG);
        } else if (i5 >= 35) {
            ak8Var = new ek8(sk8VarG);
        } else if (i5 >= 34) {
            ak8Var = new dk8(sk8VarG);
        } else if (i5 >= 31) {
            ak8Var = new ck8(sk8VarG);
        } else if (i5 >= 30) {
            ak8Var = new bk8(sk8VarG);
        } else {
            ak8Var = i5 >= 29 ? new ak8(sk8VarG) : new yj8(sk8VarG);
        }
        ak8Var.h(sk8.e(n(), i, i2, i3, i4));
        ak8Var.f(sk8.e(l(), i, i2, i3, i4));
        return ak8Var.b();
    }

    @Override // o.pk8
    public boolean t() {
        return this.c.isRound();
    }

    @Override // o.pk8
    public boolean u(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && !K(i2)) {
                return false;
            }
        }
        return true;
    }

    @Override // o.pk8
    public void v(l22 l22Var) {
        this.i = l22Var;
    }

    @Override // o.pk8
    public void w(nj3[] nj3VarArr) {
        this.d = nj3VarArr;
    }

    @Override // o.pk8
    public void x(nj3 nj3Var) {
        this.g = nj3Var;
    }

    @Override // o.pk8
    public void y(sk8 sk8Var) {
        this.f = sk8Var;
    }

    public hk8(sk8 sk8Var, hk8 hk8Var) {
        this(sk8Var, new WindowInsets(hk8Var.c));
    }
}
