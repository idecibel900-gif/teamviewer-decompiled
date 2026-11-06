package o;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class cj implements vm5 {
    public t54 a;
    public n87 b;
    public k64 c;
    public yx6 d;

    @Override // o.vm5
    public final void a(zr7 zr7Var, v65 v65Var, vs7 vs7Var, h16 h16Var, v56 v56Var, v56 v56Var2) {
        k64 k64Var = this.c;
        if (k64Var != null) {
            u54 u54Var = k64Var.m;
            synchronized (u54Var.c) {
                try {
                    u54Var.j = zr7Var;
                    u54Var.l = v65Var;
                    u54Var.k = vs7Var;
                    u54Var.m = v56Var;
                    u54Var.n = v56Var2;
                    if (u54Var.e || u54Var.d) {
                        u54Var.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // o.vm5
    public final void b(zr7 zr7Var, bf3 bf3Var, xn5 xn5Var, od1 od1Var) {
        j(new l8(zr7Var, this, bf3Var, xn5Var, od1Var, (byte) 1));
    }

    @Override // o.vm5
    public final void c() {
        j(null);
    }

    @Override // o.vm5
    public final void d(v56 v56Var) {
        Rect rect;
        k64 k64Var = this.c;
        if (k64Var != null) {
            k64Var.l = new Rect(vn4.s0(v56Var.a), vn4.s0(v56Var.b), vn4.s0(v56Var.c), vn4.s0(v56Var.d));
            if (!k64Var.j.isEmpty() || (rect = k64Var.l) == null) {
                return;
            }
            k64Var.a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // o.vm5
    public final void e(zr7 zr7Var, zr7 zr7Var2) {
        k64 k64Var = this.c;
        if (k64Var != null) {
            boolean z = (gt7.b(k64Var.h.b, zr7Var2.b) && im3.n(k64Var.h.c, zr7Var2.c)) ? false : true;
            k64Var.h = zr7Var2;
            int size = k64Var.j.size();
            for (int i = 0; i < size; i++) {
                t56 t56Var = (t56) ((WeakReference) k64Var.j.get(i)).get();
                if (t56Var != null) {
                    t56Var.g = zr7Var2;
                }
            }
            u54 u54Var = k64Var.m;
            synchronized (u54Var.c) {
                u54Var.j = null;
                u54Var.l = null;
                u54Var.k = null;
                u54Var.m = null;
                u54Var.n = null;
            }
            if (im3.n(zr7Var, zr7Var2)) {
                if (z) {
                    cj3 cj3Var = k64Var.b;
                    int iF = gt7.f(zr7Var2.b);
                    int iE = gt7.e(zr7Var2.b);
                    gt7 gt7Var = k64Var.h.c;
                    int iF2 = gt7Var != null ? gt7.f(gt7Var.a) : -1;
                    gt7 gt7Var2 = k64Var.h.c;
                    cj3Var.G().updateSelection((View) cj3Var.n, iF, iE, iF2, gt7Var2 != null ? gt7.e(gt7Var2.a) : -1);
                    return;
                }
                return;
            }
            if (zr7Var != null && (!im3.n(zr7Var.a.n, zr7Var2.a.n) || (gt7.b(zr7Var.b, zr7Var2.b) && !im3.n(zr7Var.c, zr7Var2.c)))) {
                cj3 cj3Var2 = k64Var.b;
                cj3Var2.G().restartInput((View) cj3Var2.n);
                return;
            }
            int size2 = k64Var.j.size();
            for (int i2 = 0; i2 < size2; i2++) {
                t56 t56Var2 = (t56) ((WeakReference) k64Var.j.get(i2)).get();
                if (t56Var2 != null) {
                    zr7 zr7Var3 = k64Var.h;
                    cj3 cj3Var3 = k64Var.b;
                    if (t56Var2.k) {
                        t56Var2.g = zr7Var3;
                        if (t56Var2.i) {
                            cj3Var3.G().updateExtractedText((View) cj3Var3.n, t56Var2.h, lq1.M(zr7Var3));
                        }
                        gt7 gt7Var3 = zr7Var3.c;
                        long j = zr7Var3.b;
                        int iF3 = gt7Var3 != null ? gt7.f(gt7Var3.a) : -1;
                        gt7 gt7Var4 = zr7Var3.c;
                        cj3Var3.G().updateSelection((View) cj3Var3.n, gt7.f(j), gt7.e(j), iF3, gt7Var4 != null ? gt7.e(gt7Var4.a) : -1);
                    }
                }
            }
        }
    }

    @Override // o.vm5
    public final void f() {
        q57 q57Var;
        t54 t54Var = this.a;
        if (t54Var == null || (q57Var = (q57) xk0.q(t54Var, b11.q)) == null) {
            return;
        }
        ((zm1) q57Var).b();
    }

    @Override // o.vm5
    public final void g() {
        n87 n87Var = this.b;
        if (n87Var != null) {
            n87Var.j(null);
        }
        this.b = null;
        nx4 nx4VarI = i();
        if (nx4VarI != null) {
            yx6 yx6Var = (yx6) nx4VarI;
            synchronized (yx6Var) {
                yx6Var.v(yx6Var.p() + ((long) yx6Var.w), yx6Var.v, yx6Var.p() + ((long) yx6Var.w), yx6Var.p() + ((long) yx6Var.w) + ((long) yx6Var.x));
            }
        }
    }

    @Override // o.vm5
    public final void h() {
        q57 q57Var;
        t54 t54Var = this.a;
        if (t54Var == null || (q57Var = (q57) xk0.q(t54Var, b11.q)) == null) {
            return;
        }
        ((zm1) q57Var).a();
    }

    public final nx4 i() {
        yx6 yx6Var = this.d;
        if (yx6Var != null) {
            return yx6Var;
        }
        if (!cd7.a) {
            return null;
        }
        yx6 yx6VarL = au8.l(0, 2, df0.f616o);
        this.d = yx6VarL;
        return yx6VarL;
    }

    public final void j(l8 l8Var) {
        t54 t54Var = this.a;
        if (t54Var == null) {
            return;
        }
        n87 n87VarR = null;
        bj bjVar = new bj((Object) l8Var, (Object) this, (Object) t54Var, (hc1) n87VarR, (byte) 0);
        if (t54Var.z) {
            n87VarR = im3.R(t54Var.I0(), null, pe1.p, new oa1((Object) t54Var, (Object) bjVar, (hc1) n87VarR, (byte) 29), 1);
        }
        this.b = n87VarR;
    }

    public final void k(t54 t54Var) {
        t54 t54Var2 = this.a;
        if (t54Var2 != t54Var) {
            ni3.c("Expected textInputModifierNode to be " + t54Var + " but was " + t54Var2);
        }
        this.a = null;
    }
}
