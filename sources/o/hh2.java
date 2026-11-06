package o;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class hh2 extends s18 {
    public static final String[] J = {"android:visibility:visibility", "android:visibility:parent"};
    public final byte I;

    /* JADX WARN: Multi-variable type inference failed */
    public hh2(int i) {
        this.I = i;
    }

    public static void H(d28 d28Var) {
        View view = d28Var.b;
        int visibility = view.getVisibility();
        HashMap map = d28Var.a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    public static qg8 J(d28 d28Var, d28 d28Var2) {
        qg8 qg8Var = new qg8();
        qg8Var.a = false;
        qg8Var.b = false;
        if (d28Var != null) {
            HashMap map = d28Var.a;
            if (map.containsKey("android:visibility:visibility")) {
                qg8Var.c = ((Integer) map.get("android:visibility:visibility")).intValue();
                qg8Var.e = (ViewGroup) map.get("android:visibility:parent");
            } else {
                qg8Var.c = -1;
                qg8Var.e = null;
            }
        } else {
            qg8Var.c = -1;
            qg8Var.e = null;
        }
        if (d28Var2 != null) {
            HashMap map2 = d28Var2.a;
            if (map2.containsKey("android:visibility:visibility")) {
                qg8Var.d = ((Integer) map2.get("android:visibility:visibility")).intValue();
                qg8Var.f = (ViewGroup) map2.get("android:visibility:parent");
            } else {
                qg8Var.d = -1;
                qg8Var.f = null;
            }
        } else {
            qg8Var.d = -1;
            qg8Var.f = null;
        }
        if (d28Var != null && d28Var2 != null) {
            int i = qg8Var.c;
            int i2 = qg8Var.d;
            if (i != i2 || qg8Var.e != qg8Var.f) {
                if (i != i2) {
                    if (i == 0) {
                        qg8Var.b = false;
                        qg8Var.a = true;
                        return qg8Var;
                    }
                    if (i2 == 0) {
                        qg8Var.b = true;
                        qg8Var.a = true;
                        return qg8Var;
                    }
                } else {
                    if (qg8Var.f == null) {
                        qg8Var.b = false;
                        qg8Var.a = true;
                        return qg8Var;
                    }
                    if (qg8Var.e == null) {
                        qg8Var.b = true;
                        qg8Var.a = true;
                        return qg8Var;
                    }
                }
            }
        } else {
            if (d28Var == null && qg8Var.d == 0) {
                qg8Var.b = true;
                qg8Var.a = true;
                return qg8Var;
            }
            if (d28Var2 == null && qg8Var.c == 0) {
                qg8Var.b = false;
                qg8Var.a = true;
            }
        }
        return qg8Var;
    }

    public final ObjectAnimator I(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        of8.a.n(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, of8.b, f2);
        objectAnimatorOfFloat.addListener(new eh2(view));
        a(new gh2(view, (byte) 0));
        return objectAnimatorOfFloat;
    }

    @Override // o.s18
    public final void c(d28 d28Var) {
        H(d28Var);
    }

    @Override // o.s18
    public final void g(d28 d28Var) {
        H(d28Var);
        d28Var.a.put("android:fade:transitionAlpha", Float.valueOf(of8.a.i(d28Var.b)));
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:67:0x0148  */
    /* JADX WARN: Code duplicated, block: B:68:0x014b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0151 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x0153  */
    /* JADX WARN: Code duplicated, block: B:72:0x015d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0175  */
    /* JADX WARN: Code duplicated, block: B:76:0x0191 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:81:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:88:0x0216  */
    /* JADX WARN: Code duplicated, block: B:90:0x0228  */
    /* JADX WARN: Code duplicated, block: B:93:0x022f  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if (J(n(r3, false), q(r3, false)).a != false) goto L9;
     */
    @Override // o.s18
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator k(android.view.ViewGroup r23, o.d28 r24, o.d28 r25) {
        /*
            Method dump skipped, instruction units count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.hh2.k(android.view.ViewGroup, o.d28, o.d28):android.animation.Animator");
    }

    @Override // o.s18
    public final String[] p() {
        return J;
    }

    @Override // o.s18
    public final boolean r(d28 d28Var, d28 d28Var2) {
        if (d28Var == null && d28Var2 == null) {
            return false;
        }
        if (d28Var != null && d28Var2 != null && d28Var2.a.containsKey("android:visibility:visibility") != d28Var.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        qg8 qg8VarJ = J(d28Var, d28Var2);
        if (qg8VarJ.a) {
            return qg8VarJ.c == 0 || qg8VarJ.d == 0;
        }
        return false;
    }
}
