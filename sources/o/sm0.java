package o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class sm0 extends s18 {
    public static final String[] I = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final om0 J;
    public static final om0 K;
    public static final om0 L;
    public static final om0 M;
    public static final om0 N;

    static {
        new nm0(PointF.class, "boundsOrigin").b = new Rect();
        J = new om0(PointF.class, "topLeft", (byte) 0);
        K = new om0(PointF.class, "bottomRight", (byte) 1);
        L = new om0(PointF.class, "bottomRight", (byte) 2);
        M = new om0(PointF.class, "topLeft", (byte) 3);
        N = new om0(PointF.class, "position", (byte) 4);
    }

    public static void H(d28 d28Var) {
        View view = d28Var.b;
        HashMap map = d28Var.a;
        WeakHashMap weakHashMap = be8.a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", view.getParent());
    }

    @Override // o.s18
    public final Animator k(ViewGroup viewGroup, d28 d28Var, d28 d28Var2) {
        int i;
        sm0 sm0Var;
        Animator animatorOfObject;
        if (d28Var == null) {
            return null;
        }
        HashMap map = d28Var.a;
        if (d28Var2 == null) {
            return null;
        }
        HashMap map2 = d28Var2.a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = d28Var2.b;
        Rect rect = (Rect) map.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
        int i2 = rect.left;
        int i3 = rect2.left;
        int i4 = rect.top;
        int i5 = rect2.top;
        int i6 = rect.right;
        int i7 = rect2.right;
        int i8 = rect.bottom;
        int i9 = rect2.bottom;
        int i10 = i6 - i2;
        int i11 = i8 - i4;
        int i12 = i7 - i3;
        int i13 = i9 - i5;
        Rect rect3 = (Rect) map.get("android:changeBounds:clip");
        Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
        if ((i10 == 0 || i11 == 0) && (i12 == 0 || i13 == 0)) {
            i = 0;
        } else {
            i = (i2 == i3 && i4 == i5) ? 0 : 1;
            if (i6 != i7 || i8 != i9) {
                i++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i++;
        }
        int i14 = i;
        if (i14 <= 0) {
            return null;
        }
        of8.a(view, i2, i4, i6, i8);
        if (i14 != 2) {
            sm0Var = this;
            if (i2 == i3 && i4 == i5) {
                sm0Var.E.getClass();
                animatorOfObject = ObjectAnimator.ofObject(view, L, (TypeConverter) null, el5.d(i6, i8, i7, i9));
            } else {
                sm0Var.E.getClass();
                animatorOfObject = ObjectAnimator.ofObject(view, M, (TypeConverter) null, el5.d(i2, i4, i3, i5));
            }
        } else if (i10 == i12 && i11 == i13) {
            sm0Var = this;
            sm0Var.E.getClass();
            animatorOfObject = ObjectAnimator.ofObject(view, N, (TypeConverter) null, el5.d(i2, i4, i3, i5));
        } else {
            sm0Var = this;
            rm0 rm0Var = new rm0();
            rm0Var.e = view;
            sm0Var.E.getClass();
            ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(rm0Var, J, (TypeConverter) null, el5.d(i2, i4, i3, i5));
            sm0Var.E.getClass();
            ObjectAnimator objectAnimatorOfObject2 = ObjectAnimator.ofObject(rm0Var, K, (TypeConverter) null, el5.d(i6, i8, i7, i9));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfObject, objectAnimatorOfObject2);
            animatorSet.addListener(new pm0(rm0Var));
            animatorOfObject = animatorSet;
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            f57.r(viewGroup4, true);
            sm0Var.a(new qm0(viewGroup4));
        }
        return animatorOfObject;
    }

    @Override // o.s18
    public final String[] p() {
        return I;
    }
}
