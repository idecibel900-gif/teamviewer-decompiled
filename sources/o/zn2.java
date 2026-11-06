package o;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class zn2 {
    public qw6 a;
    public ao2 b;
    public RippleDrawable c;
    public u80 d;
    public RippleDrawable e;
    public boolean f;
    public float h;
    public float i;
    public float j;
    public int k;
    public eu4 l;
    public eu4 m;
    public Animator n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public eu4 f2721o;
    public eu4 p;
    public int r;
    public final FloatingActionButton t;
    public final xk1 u;
    public static final rh2 z = lo.c;
    public static final int[] A = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] B = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};
    public static final int[] C = {R.attr.state_focused, R.attr.state_enabled};
    public static final int[] D = {R.attr.state_hovered, R.attr.state_enabled};
    public static final int[] E = {R.attr.state_enabled};
    public static final int[] F = new int[0];
    public boolean g = true;
    public float q = 1.0f;
    public byte s = 0;
    public final Rect v = new Rect();
    public final RectF w = new RectF();
    public final RectF x = new RectF();
    public final Matrix y = new Matrix();

    public zn2(FloatingActionButton floatingActionButton, xk1 xk1Var) {
        byte b = 0;
        this.t = floatingActionButton;
        this.u = xk1Var;
        a65 a65Var = new a65((byte) 28);
        bo2 bo2Var = (bo2) this;
        a65Var.Q(c(new xn2(bo2Var, (byte) 1)));
        a65Var.Q(c(new xn2(bo2Var, b)));
        a65Var.Q(c(new xn2(bo2Var, b)));
        a65Var.Q(c(new xn2(bo2Var, b)));
        a65Var.Q(c(new xn2(bo2Var, (byte) 2)));
        a65Var.Q(c(new wn2(bo2Var)));
        floatingActionButton.getRotation();
    }

    public static ValueAnimator c(yn2 yn2Var) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(z);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(yn2Var);
        valueAnimator.addUpdateListener(yn2Var);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public final void a(float f, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.t.getDrawable();
        if (drawable == null || this.r == 0) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        RectF rectF = this.w;
        rectF.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
        float f2 = this.r;
        RectF rectF2 = this.x;
        rectF2.set(0.0f, 0.0f, f2, f2);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f3 = this.r / 2.0f;
        matrix.postScale(f, f, f3, f3);
    }

    public final AnimatorSet b(eu4 eu4Var, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f};
        FloatingActionButton floatingActionButton = this.t;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) property, fArr);
        eu4Var.d("opacity").a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_X, f2);
        eu4Var.d("scale").a(objectAnimatorOfFloat2);
        int i = Build.VERSION.SDK_INT;
        if (i == 26) {
            vn2 vn2Var = new vn2();
            vn2Var.a = new FloatEvaluator();
            objectAnimatorOfFloat2.setEvaluator(vn2Var);
        }
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_Y, f2);
        eu4Var.d("scale").a(objectAnimatorOfFloat3);
        if (i == 26) {
            vn2 vn2Var2 = new vn2();
            vn2Var2.a = new FloatEvaluator();
            objectAnimatorOfFloat3.setEvaluator(vn2Var2);
        }
        arrayList.add(objectAnimatorOfFloat3);
        Matrix matrix = this.y;
        a(f3, matrix);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(floatingActionButton, new nm0(), new un2(this), new Matrix(matrix));
        eu4Var.d("iconScale").a(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        iq8.C(animatorSet, arrayList);
        return animatorSet;
    }

    public abstract void d(float f, float f2, float f3);

    public final void e() {
    }

    public final void f(qw6 qw6Var) {
        this.a = qw6Var;
        ao2 ao2Var = this.b;
        if (ao2Var != null) {
            ao2Var.setShapeAppearanceModel(qw6Var);
        }
        Drawable.Callback callback = this.c;
        if (callback instanceof sx6) {
            ((sx6) callback).setShapeAppearanceModel(qw6Var);
        }
        u80 u80Var = this.d;
        if (u80Var != null) {
            u80Var.f2181o = qw6Var;
            u80Var.invalidateSelf();
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005d  */
    public final void g() {
        bo2 bo2Var = (bo2) this;
        xk1 xk1Var = bo2Var.u;
        boolean z2 = ((FloatingActionButton) xk1Var.n).w;
        boolean z3 = bo2Var.f;
        Rect rect = this.v;
        FloatingActionButton floatingActionButton = bo2Var.t;
        if (z2) {
            int sizeDimension = z3 ? (bo2Var.k - floatingActionButton.getSizeDimension()) / 2 : 0;
            float elevation = bo2Var.g ? floatingActionButton.getElevation() + bo2Var.j : 0.0f;
            int iMax = Math.max(sizeDimension, (int) Math.ceil(elevation));
            int iMax2 = Math.max(sizeDimension, (int) Math.ceil(elevation * 1.5f));
            rect.set(iMax, iMax2, iMax, iMax2);
        } else if (z3) {
            int sizeDimension2 = floatingActionButton.getSizeDimension();
            int i = bo2Var.k;
            if (sizeDimension2 >= i) {
                rect.set(0, 0, 0, 0);
            } else {
                int sizeDimension3 = (i - floatingActionButton.getSizeDimension()) / 2;
                rect.set(sizeDimension3, sizeDimension3, sizeDimension3, sizeDimension3);
            }
        } else {
            rect.set(0, 0, 0, 0);
        }
        io1.A(this.e, "Didn't initialize content background");
        boolean z4 = ((FloatingActionButton) xk1Var.n).w;
        xk1 xk1Var2 = this.u;
        if (z4 || (bo2Var.f && floatingActionButton.getSizeDimension() < bo2Var.k)) {
            super/*android.view.View*/.setBackgroundDrawable(new InsetDrawable((Drawable) this.e, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            RippleDrawable rippleDrawable = this.e;
            if (rippleDrawable != null) {
                super/*android.view.View*/.setBackgroundDrawable(rippleDrawable);
            } else {
                xk1Var2.getClass();
            }
        }
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        FloatingActionButton floatingActionButton2 = (FloatingActionButton) xk1Var2.n;
        floatingActionButton2.x.set(i2, i3, i4, i5);
        int i6 = floatingActionButton2.u;
        floatingActionButton2.setPadding(i2 + i6, i3 + i6, i4 + i6, i5 + i6);
    }
}
