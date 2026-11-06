package o;

import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ms7 implements vm5 {
    public final View a;
    public final iu b;
    public final kg c;
    public boolean d;
    public Function1 e;
    public Function1 f;
    public zr7 g;
    public bf3 h;
    public final ArrayList i;
    public final u14 j;
    public Rect k;
    public final rf1 l;
    public final xx4 m;
    public wu6 n;

    public ms7(View view, AndroidComposeView androidComposeView, kg kgVar) {
        iu iuVar = new iu(view);
        this.a = view;
        this.b = iuVar;
        this.c = kgVar;
        this.e = new yr7((byte) 3);
        this.f = new yr7((byte) 4);
        this.g = new zr7(4, gt7.b, "");
        this.h = bf3.g;
        this.i = new ArrayList();
        this.j = ds1.X(l54.n, new ks7(this, (byte) 0));
        this.l = new rf1(androidComposeView, iuVar);
        this.m = new xx4(new ls7[16]);
    }

    @Override // o.vm5
    public final void a(zr7 zr7Var, v65 v65Var, vs7 vs7Var, h16 h16Var, v56 v56Var, v56 v56Var2) {
        rf1 rf1Var = this.l;
        synchronized (rf1Var.c) {
            try {
                rf1Var.j = zr7Var;
                rf1Var.l = v65Var;
                rf1Var.k = vs7Var;
                rf1Var.m = h16Var;
                rf1Var.n = v56Var;
                rf1Var.f1919o = v56Var2;
                if (rf1Var.e || rf1Var.d) {
                    rf1Var.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.vm5
    public final void b(zr7 zr7Var, bf3 bf3Var, xn5 xn5Var, od1 od1Var) {
        this.d = true;
        this.g = zr7Var;
        this.h = bf3Var;
        this.e = xn5Var;
        this.f = od1Var;
        i(ls7.m);
    }

    @Override // o.vm5
    public final void c() {
        i(ls7.m);
    }

    @Override // o.vm5
    public final void d(v56 v56Var) {
        Rect rect;
        this.k = new Rect(vn4.s0(v56Var.a), vn4.s0(v56Var.b), vn4.s0(v56Var.c), vn4.s0(v56Var.d));
        if (!this.i.isEmpty() || (rect = this.k) == null) {
            return;
        }
        this.a.requestRectangleOnScreen(new Rect(rect));
    }

    @Override // o.vm5
    public final void e(zr7 zr7Var, zr7 zr7Var2) {
        boolean z = (gt7.b(this.g.b, zr7Var2.b) && im3.n(this.g.c, zr7Var2.c)) ? false : true;
        this.g = zr7Var2;
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            s56 s56Var = (s56) ((WeakReference) this.i.get(i)).get();
            if (s56Var != null) {
                s56Var.d = zr7Var2;
            }
        }
        rf1 rf1Var = this.l;
        synchronized (rf1Var.c) {
            rf1Var.j = null;
            rf1Var.l = null;
            rf1Var.k = null;
            rf1Var.m = ek.z;
            rf1Var.n = null;
            rf1Var.f1919o = null;
        }
        if (im3.n(zr7Var, zr7Var2)) {
            if (z) {
                iu iuVar = this.b;
                int iF = gt7.f(zr7Var2.b);
                int iE = gt7.e(zr7Var2.b);
                gt7 gt7Var = this.g.c;
                int iF2 = gt7Var != null ? gt7.f(gt7Var.a) : -1;
                gt7 gt7Var2 = this.g.c;
                ((InputMethodManager) ((u14) iuVar.p).getValue()).updateSelection((View) iuVar.f1103o, iF, iE, iF2, gt7Var2 != null ? gt7.e(gt7Var2.a) : -1);
                return;
            }
            return;
        }
        if (zr7Var != null && (!im3.n(zr7Var.a.n, zr7Var2.a.n) || (gt7.b(zr7Var.b, zr7Var2.b) && !im3.n(zr7Var.c, zr7Var2.c)))) {
            iu iuVar2 = this.b;
            ((InputMethodManager) ((u14) iuVar2.p).getValue()).restartInput((View) iuVar2.f1103o);
            return;
        }
        int size2 = this.i.size();
        for (int i2 = 0; i2 < size2; i2++) {
            s56 s56Var2 = (s56) ((WeakReference) this.i.get(i2)).get();
            if (s56Var2 != null) {
                zr7 zr7Var3 = this.g;
                iu iuVar3 = this.b;
                if (s56Var2.h) {
                    s56Var2.d = zr7Var3;
                    if (s56Var2.f) {
                        ((InputMethodManager) ((u14) iuVar3.p).getValue()).updateExtractedText((View) iuVar3.f1103o, s56Var2.e, ds1.o0(zr7Var3));
                    }
                    gt7 gt7Var3 = zr7Var3.c;
                    long j = zr7Var3.b;
                    int iF3 = gt7Var3 != null ? gt7.f(gt7Var3.a) : -1;
                    gt7 gt7Var4 = zr7Var3.c;
                    ((InputMethodManager) ((u14) iuVar3.p).getValue()).updateSelection((View) iuVar3.f1103o, gt7.f(j), gt7.e(j), iF3, gt7Var4 != null ? gt7.e(gt7Var4.a) : -1);
                }
            }
        }
    }

    @Override // o.vm5
    public final void f() {
        i(ls7.f1401o);
    }

    @Override // o.vm5
    public final void g() {
        this.d = false;
        this.e = new yr7((byte) 1);
        this.f = new yr7((byte) 2);
        this.k = null;
        i(ls7.n);
    }

    @Override // o.vm5
    public final void h() {
        i(ls7.p);
    }

    public final void i(ls7 ls7Var) {
        this.m.b(ls7Var);
        if (this.n == null) {
            wu6 wu6Var = new wu6(this, (byte) 5);
            this.c.execute(wu6Var);
            this.n = wu6Var;
        }
    }
}
