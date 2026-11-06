package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o.be8;
import o.cd1;
import o.dh2;
import o.eu4;
import o.fu4;
import o.hk0;
import o.iq8;
import o.lo;
import o.ol5;
import o.vq0;
import o.wk0;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public final Rect c;
    public final RectF d;
    public final RectF e;
    public final int[] f;
    public float g;
    public float h;

    public FabTransformationBehavior() {
        this.c = new Rect();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new int[2];
    }

    public static Pair u(float f, float f2, boolean z, wk0 wk0Var) {
        fu4 fu4VarD;
        fu4 fu4VarD2;
        if (f == 0.0f || f2 == 0.0f) {
            fu4VarD = ((eu4) wk0Var.n).d("translationXLinear");
            fu4VarD2 = ((eu4) wk0Var.n).d("translationYLinear");
        } else if ((!z || f2 >= 0.0f) && (z || f2 <= 0.0f)) {
            fu4VarD = ((eu4) wk0Var.n).d("translationXCurveDownwards");
            fu4VarD2 = ((eu4) wk0Var.n).d("translationYCurveDownwards");
        } else {
            fu4VarD = ((eu4) wk0Var.n).d("translationXCurveUpwards");
            fu4VarD2 = ((eu4) wk0Var.n).d("translationYCurveUpwards");
        }
        return new Pair(fu4VarD, fu4VarD2);
    }

    public static float x(wk0 wk0Var, fu4 fu4Var, float f) {
        long j = fu4Var.a;
        long j2 = fu4Var.b;
        fu4 fu4VarD = ((eu4) wk0Var.n).d("expansion");
        return lo.a(f, 0.0f, fu4Var.b().getInterpolation((((fu4VarD.a + fu4VarD.b) + 17) - j) / j2));
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, o.zc1
    public final boolean b(View view, View view2) {
        int expandedComponentIdHint;
        if (view.getVisibility() != 8) {
            return (view2 instanceof FloatingActionButton) && ((expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint()) == 0 || expandedComponentIdHint == view.getId());
        }
        hk0.l("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        return false;
    }

    @Override // o.zc1
    public final void c(cd1 cd1Var) {
        if (cd1Var.h == 0) {
            cd1Var.h = 80;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public final AnimatorSet t(View view, View view2, boolean z, boolean z2) {
        ObjectAnimator objectAnimatorOfFloat;
        float f;
        ObjectAnimator objectAnimatorOfFloat2;
        ObjectAnimator objectAnimatorOfFloat3;
        ObjectAnimator objectAnimatorOfFloat4;
        Property property = View.TRANSLATION_Y;
        Property property2 = View.TRANSLATION_X;
        wk0 wk0VarZ = z(view2.getContext(), z);
        if (z) {
            this.g = view.getTranslationX();
            this.h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        WeakHashMap weakHashMap = be8.a;
        float elevation = view2.getElevation() - view.getElevation();
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-elevation);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -elevation);
        }
        ((eu4) wk0VarZ.n).d("elevation").a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        float fV = v(view, view2, (ol5) wk0VarZ.f2420o);
        float fW = w(view, view2, (ol5) wk0VarZ.f2420o);
        Pair pairU = u(fV, fW, z, wk0VarZ);
        fu4 fu4Var = (fu4) pairU.first;
        fu4 fu4Var2 = (fu4) pairU.second;
        RectF rectF = this.d;
        if (z) {
            f = 0.0f;
            if (!z2) {
                view2.setTranslationX(-fV);
                view2.setTranslationY(-fW);
            }
            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property2, 0.0f);
            ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, 0.0f);
            float fX = x(wk0VarZ, fu4Var, -fV);
            float fX2 = x(wk0VarZ, fu4Var2, -fW);
            Rect rect = this.c;
            view2.getWindowVisibleDisplayFrame(rect);
            rectF.set(rect);
            RectF rectF2 = this.e;
            y(view2, rectF2);
            rectF2.offset(fX, fX2);
            rectF2.intersect(rectF);
            rectF.set(rectF2);
            objectAnimatorOfFloat3 = objectAnimatorOfFloat6;
            objectAnimatorOfFloat2 = objectAnimatorOfFloat5;
        } else {
            f = 0.0f;
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property2, -fV);
            objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, -fW);
        }
        fu4Var.a(objectAnimatorOfFloat2);
        fu4Var2.a(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat3);
        rectF.width();
        rectF.height();
        float fV2 = v(view, view2, (ol5) wk0VarZ.f2420o);
        float fW2 = w(view, view2, (ol5) wk0VarZ.f2420o);
        Pair pairU2 = u(fV2, fW2, z, wk0VarZ);
        fu4 fu4Var3 = (fu4) pairU2.first;
        fu4 fu4Var4 = (fu4) pairU2.second;
        if (!z) {
            fV2 = this.g;
        }
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fV2);
        if (!z) {
            fW2 = this.h;
        }
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fW2);
        fu4Var3.a(objectAnimatorOfFloat7);
        fu4Var4.a(objectAnimatorOfFloat8);
        arrayList.add(objectAnimatorOfFloat7);
        arrayList.add(objectAnimatorOfFloat8);
        if (view2 instanceof ViewGroup) {
            View viewFindViewById = view2.findViewById(R.id.mtrl_child_content_container);
            ViewGroup viewGroup = viewFindViewById != null ? viewFindViewById instanceof ViewGroup ? (ViewGroup) viewFindViewById : null : (ViewGroup) view2;
            if (viewGroup != null) {
                if (z) {
                    if (!z2) {
                        vq0.a.set(viewGroup, Float.valueOf(f));
                    }
                    objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(viewGroup, vq0.a, 1.0f);
                } else {
                    objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(viewGroup, vq0.a, f);
                }
                ((eu4) wk0VarZ.n).d("contentFade").a(objectAnimatorOfFloat4);
                arrayList.add(objectAnimatorOfFloat4);
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        iq8.C(animatorSet, arrayList);
        animatorSet.addListener(new dh2(z, view2, view));
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i));
        }
        return animatorSet;
    }

    public final float v(View view, View view2, ol5 ol5Var) {
        RectF rectF = this.d;
        y(view, rectF);
        rectF.offset(this.g, this.h);
        RectF rectF2 = this.e;
        y(view2, rectF2);
        ol5Var.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public final float w(View view, View view2, ol5 ol5Var) {
        RectF rectF = this.d;
        y(view, rectF);
        rectF.offset(this.g, this.h);
        RectF rectF2 = this.e;
        y(view2, rectF2);
        ol5Var.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final void y(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public abstract wk0 z(Context context, boolean z);

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new Rect();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new int[2];
    }
}
