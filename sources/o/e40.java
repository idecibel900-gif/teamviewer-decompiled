package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class e40 extends FrameLayout {
    public static final d40 t = new d40((byte) 0);
    public c40 m;
    public b40 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f677o;
    public final float p;
    public final float q;
    public ColorStateList r;
    public PorterDuff.Mode s;

    public e40(Context context, AttributeSet attributeSet) {
        super(xk0.O(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, hz5.C);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap weakHashMap = be8.a;
            setElevation(dimensionPixelSize);
        }
        this.f677o = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.p = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(xo1.O(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(x67.s(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.q = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(t);
        setFocusable(true);
        if (getBackground() == null) {
            float dimension = getResources().getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(wo1.R(getBackgroundOverlayColorAlpha(), io1.d0(this, R.attr.colorSurface), io1.d0(this, R.attr.colorOnSurface)));
            ColorStateList colorStateList = this.r;
            if (colorStateList != null) {
                gradientDrawable.setTintList(colorStateList);
            }
            WeakHashMap weakHashMap2 = be8.a;
            setBackground(gradientDrawable);
        }
    }

    public float getActionTextColorAlpha() {
        return this.q;
    }

    public int getAnimationMode() {
        return this.f677o;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.p;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        WindowInsets rootWindowInsets;
        super.onAttachedToWindow();
        b40 b40Var = this.n;
        if (b40Var != null) {
            f40 f40Var = ((y30) b40Var).m;
            if (Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = f40Var.c.getRootWindowInsets()) != null) {
                f40Var.k = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
                f40Var.e();
            }
        }
        WeakHashMap weakHashMap = be8.a;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        boolean z;
        super.onDetachedFromWindow();
        b40 b40Var = this.n;
        if (b40Var != null) {
            y30 y30Var = (y30) b40Var;
            f40 f40Var = y30Var.m;
            pn5 pn5VarI = pn5.i();
            a40 a40Var = f40Var.m;
            synchronized (pn5VarI.m) {
                z = true;
                if (!pn5VarI.k(a40Var)) {
                    y37 y37Var = (y37) pn5VarI.p;
                    if (!(y37Var != null && y37Var.a.get() == a40Var)) {
                        z = false;
                    }
                }
            }
            if (z) {
                f40.n.post(new mt8((Object) y30Var, (byte) 4));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        c40 c40Var = this.m;
        if (c40Var != null) {
            f40 f40Var = ((y30) c40Var).m;
            f40Var.c.setOnLayoutChangeListener(null);
            f40Var.d();
        }
    }

    public void setAnimationMode(int i) {
        this.f677o = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.r != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.r);
            drawable.setTintMode(this.s);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.r = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintList(colorStateList);
            drawableMutate.setTintMode(this.s);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.s = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintMode(mode);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    public void setOnAttachStateChangeListener(b40 b40Var) {
        this.n = b40Var;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : t);
        super.setOnClickListener(onClickListener);
    }

    public void setOnLayoutChangeListener(c40 c40Var) {
        this.m = c40Var;
    }
}
