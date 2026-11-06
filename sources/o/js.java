package o;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class js implements f75, xa1, fq4 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ qs n;

    public /* synthetic */ js(qs qsVar, byte b) {
        this.m = b;
        this.n = qsVar;
    }

    @Override // o.fq4
    public void b(jp4 jp4Var, boolean z) {
        ps psVar;
        byte b = this.m;
        qs qsVar = this.n;
        switch (b) {
            case 2:
                qsVar.r(jp4Var);
                break;
            default:
                jp4 jp4VarM = jp4Var.m();
                int i = 0;
                boolean z2 = jp4VarM != jp4Var;
                if (z2) {
                    jp4Var = jp4VarM;
                }
                ps[] psVarArr = qsVar.V;
                int length = psVarArr != null ? psVarArr.length : 0;
                while (true) {
                    if (i >= length) {
                        psVar = null;
                    } else {
                        psVar = psVarArr[i];
                        if (psVar == null || psVar.h != jp4Var) {
                            i++;
                        }
                    }
                }
                if (psVar != null) {
                    if (!z2) {
                        qsVar.s(psVar, z);
                    } else {
                        qsVar.q(psVar.a, psVar, jp4VarM);
                        qsVar.s(psVar, true);
                    }
                }
                break;
        }
    }

    @Override // o.fq4
    public boolean m0(jp4 jp4Var) {
        Window.Callback callback;
        byte b = this.m;
        qs qsVar = this.n;
        switch (b) {
            case 2:
                Window.Callback callback2 = qsVar.x.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, jp4Var);
                }
                break;
            default:
                if (jp4Var == jp4Var.m() && qsVar.P && (callback = qsVar.x.getCallback()) != null && !qsVar.a0) {
                    callback.onMenuOpened(108, jp4Var);
                }
                break;
        }
        return true;
    }

    @Override // o.f75
    public sk8 t(View view, sk8 sk8Var) {
        sk8 sk8VarB;
        gk8 ak8Var;
        int iD = sk8Var.d();
        int iD2 = sk8Var.d();
        qs qsVar = this.n;
        ActionBarContextView actionBarContextView = qsVar.G;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qsVar.G.getLayoutParams();
            boolean z = false;
            if (qsVar.G.isShown()) {
                if (qsVar.m0 == null) {
                    qsVar.m0 = new Rect();
                    qsVar.n0 = new Rect();
                }
                Rect rect = qsVar.m0;
                Rect rect2 = qsVar.n0;
                rect.set(sk8Var.b(), sk8Var.d(), sk8Var.c(), sk8Var.a());
                nj3 nj3VarI = sk8Var.a.i(2);
                ViewGroup viewGroup = qsVar.L;
                boolean z2 = true;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z3 = pf8.a;
                    eq.c(rect, rect2, viewGroup);
                } else {
                    if (!pf8.a) {
                        pf8.a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            pf8.b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                pf8.b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = pf8.b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                        }
                    }
                }
                nj3 nj3VarB = nj3.b(Math.max(0, nj3VarI.a - rect2.left), Math.max(0, nj3VarI.b - rect2.top), Math.max(0, nj3VarI.c - rect2.right), Math.max(0, nj3VarI.d - rect2.bottom));
                int i = nj3VarB.c;
                int i2 = marginLayoutParams.leftMargin;
                int i3 = nj3VarB.a;
                if (i2 == i3 && marginLayoutParams.rightMargin == i) {
                    z2 = false;
                } else {
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = i;
                }
                ActionBarContextView actionBarContextView2 = qsVar.G;
                int i4 = rect.left - i3;
                int i5 = rect.top;
                int i6 = rect.right - i;
                actionBarContextView2.G = i4;
                actionBarContextView2.H = i5;
                actionBarContextView2.I = i6;
                actionBarContextView2.k();
                if (!qsVar.R && rect.top > 0) {
                    iD2 = 0;
                }
                z = z2;
            }
            if (z) {
                qsVar.G.setLayoutParams(marginLayoutParams);
            }
        }
        if (iD != iD2) {
            int iB = sk8Var.b();
            int iC = sk8Var.c();
            int iA = sk8Var.a();
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 36) {
                ak8Var = new fk8(sk8Var);
            } else if (i7 >= 35) {
                ak8Var = new ek8(sk8Var);
            } else if (i7 >= 34) {
                ak8Var = new dk8(sk8Var);
            } else if (i7 >= 31) {
                ak8Var = new ck8(sk8Var);
            } else if (i7 >= 30) {
                ak8Var = new bk8(sk8Var);
            } else {
                ak8Var = i7 >= 29 ? new ak8(sk8Var) : new yj8(sk8Var);
            }
            ak8Var.h(nj3.b(iB, iD2, iC, iA));
            sk8VarB = ak8Var.b();
        } else {
            sk8VarB = sk8Var;
        }
        WeakHashMap weakHashMap = be8.a;
        WindowInsets windowInsetsF = sk8VarB.f();
        if (windowInsetsF == null) {
            return sk8VarB;
        }
        WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsetsF);
        return !windowInsetsOnApplyWindowInsets.equals(windowInsetsF) ? sk8.g(windowInsetsOnApplyWindowInsets, view) : sk8VarB;
    }
}
