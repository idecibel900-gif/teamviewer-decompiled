package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import io.sentry.android.core.v0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import o.a60;
import o.ap7;
import o.ar0;
import o.be8;
import o.bq7;
import o.cs;
import o.eu4;
import o.f4;
import o.hm3;
import o.hz5;
import o.oe6;
import o.qw6;
import o.rf2;
import o.sx6;
import o.uf0;
import o.wq0;
import o.x67;
import o.xk0;
import o.xo1;
import o.xq0;
import o.yo1;
import o.yq0;
import o.yq4;

/* JADX INFO: loaded from: classes.dex */
public class Chip extends cs implements sx6 {
    public static final Rect G = new Rect();
    public static final int[] H = {R.attr.state_selected};
    public static final int[] I = {R.attr.state_checkable};
    public int A;
    public int B;
    public final yq0 C;
    public final Rect D;
    public final RectF E;
    public final wq0 F;
    public ar0 q;
    public InsetDrawable r;
    public RippleDrawable s;
    public View.OnClickListener t;
    public CompoundButton.OnCheckedChangeListener u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(xk0.O(context, attributeSet, com.teamviewer.teamviewer.market.mobile.R.attr.chipStyle, com.teamviewer.teamviewer.market.mobile.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.teamviewer.teamviewer.market.mobile.R.attr.chipStyle);
        this.D = new Rect();
        this.E = new RectF();
        this.F = new wq0(this, (byte) 0);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                v0.j("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                yq4.r("Please set left drawable using R.attr#chipIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                yq4.r("Please set start drawable using R.attr#chipIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                yq4.r("Please set end drawable using R.attr#closeIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                yq4.r("Please set end drawable using R.attr#closeIcon.");
                throw null;
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                yq4.r("Chip does not support multi-line text");
                throw null;
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                v0.j("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        ar0 ar0Var = new ar0(context2, attributeSet);
        Context context3 = ar0Var.q0;
        int[] iArr = hz5.g;
        TypedArray typedArrayE = xk0.E(context3, attributeSet, iArr, com.teamviewer.teamviewer.market.mobile.R.attr.chipStyle, com.teamviewer.teamviewer.market.mobile.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        ar0Var.Q0 = typedArrayE.hasValue(37);
        Context context4 = ar0Var.q0;
        ColorStateList colorStateListO = xo1.O(context4, typedArrayE, 24);
        if (ar0Var.J != colorStateListO) {
            ar0Var.J = colorStateListO;
            ar0Var.onStateChange(ar0Var.getState());
        }
        ColorStateList colorStateListO2 = xo1.O(context4, typedArrayE, 11);
        if (ar0Var.K != colorStateListO2) {
            ar0Var.K = colorStateListO2;
            ar0Var.onStateChange(ar0Var.getState());
        }
        float dimension = typedArrayE.getDimension(19, 0.0f);
        if (ar0Var.L != dimension) {
            ar0Var.L = dimension;
            ar0Var.invalidateSelf();
            ar0Var.y();
        }
        if (typedArrayE.hasValue(12)) {
            ar0Var.E(typedArrayE.getDimension(12, 0.0f));
        }
        ar0Var.J(xo1.O(context4, typedArrayE, 22));
        ar0Var.K(typedArrayE.getDimension(23, 0.0f));
        ar0Var.T(xo1.O(context4, typedArrayE, 36));
        String text = typedArrayE.getText(5);
        text = text == null ? "" : text;
        boolean zEquals = TextUtils.equals(ar0Var.Q, text);
        bq7 bq7Var = ar0Var.w0;
        if (!zEquals) {
            ar0Var.Q = text;
            bq7Var.d = true;
            ar0Var.invalidateSelf();
            ar0Var.y();
        }
        ap7 ap7Var = (!typedArrayE.hasValue(0) || (resourceId = typedArrayE.getResourceId(0, 0)) == 0) ? null : new ap7(context4, resourceId);
        ap7Var.k = typedArrayE.getDimension(1, ap7Var.k);
        bq7Var.b(ap7Var, context4);
        int i = typedArrayE.getInt(3, 0);
        if (i == 1) {
            ar0Var.N0 = TextUtils.TruncateAt.START;
        } else if (i == 2) {
            ar0Var.N0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i == 3) {
            ar0Var.N0 = TextUtils.TruncateAt.END;
        }
        ar0Var.I(typedArrayE.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            ar0Var.I(typedArrayE.getBoolean(15, false));
        }
        ar0Var.F(xo1.Q(context4, typedArrayE, 14));
        if (typedArrayE.hasValue(17)) {
            ar0Var.H(xo1.O(context4, typedArrayE, 17));
        }
        ar0Var.G(typedArrayE.getDimension(16, -1.0f));
        ar0Var.Q(typedArrayE.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            ar0Var.Q(typedArrayE.getBoolean(26, false));
        }
        ar0Var.L(xo1.Q(context4, typedArrayE, 25));
        ar0Var.P(xo1.O(context4, typedArrayE, 30));
        ar0Var.N(typedArrayE.getDimension(28, 0.0f));
        ar0Var.A(typedArrayE.getBoolean(6, false));
        ar0Var.D(typedArrayE.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            ar0Var.D(typedArrayE.getBoolean(8, false));
        }
        ar0Var.B(xo1.Q(context4, typedArrayE, 7));
        if (typedArrayE.hasValue(9)) {
            ar0Var.C(xo1.O(context4, typedArrayE, 9));
        }
        ar0Var.g0 = eu4.a(context4, typedArrayE, 39);
        ar0Var.h0 = eu4.a(context4, typedArrayE, 33);
        float dimension2 = typedArrayE.getDimension(21, 0.0f);
        if (ar0Var.i0 != dimension2) {
            ar0Var.i0 = dimension2;
            ar0Var.invalidateSelf();
            ar0Var.y();
        }
        ar0Var.S(typedArrayE.getDimension(35, 0.0f));
        ar0Var.R(typedArrayE.getDimension(34, 0.0f));
        float dimension3 = typedArrayE.getDimension(41, 0.0f);
        if (ar0Var.l0 != dimension3) {
            ar0Var.l0 = dimension3;
            ar0Var.invalidateSelf();
            ar0Var.y();
        }
        float dimension4 = typedArrayE.getDimension(40, 0.0f);
        if (ar0Var.m0 != dimension4) {
            ar0Var.m0 = dimension4;
            ar0Var.invalidateSelf();
            ar0Var.y();
        }
        ar0Var.O(typedArrayE.getDimension(29, 0.0f));
        ar0Var.M(typedArrayE.getDimension(27, 0.0f));
        float dimension5 = typedArrayE.getDimension(13, 0.0f);
        if (ar0Var.p0 != dimension5) {
            ar0Var.p0 = dimension5;
            ar0Var.invalidateSelf();
            ar0Var.y();
        }
        ar0Var.P0 = typedArrayE.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayE.recycle();
        xk0.l(context2, attributeSet, com.teamviewer.teamviewer.market.mobile.R.attr.chipStyle, com.teamviewer.teamviewer.market.mobile.R.style.Widget_MaterialComponents_Chip_Action);
        xk0.n(context2, attributeSet, iArr, com.teamviewer.teamviewer.market.mobile.R.attr.chipStyle, com.teamviewer.teamviewer.market.mobile.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.teamviewer.teamviewer.market.mobile.R.attr.chipStyle, com.teamviewer.teamviewer.market.mobile.R.style.Widget_MaterialComponents_Chip_Action);
        this.z = typedArrayObtainStyledAttributes.getBoolean(32, false);
        this.B = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, (float) Math.ceil(x67.k(getContext(), 48))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(ar0Var);
        WeakHashMap weakHashMap = be8.a;
        ar0Var.k(getElevation());
        xk0.l(context2, attributeSet, com.teamviewer.teamviewer.market.mobile.R.attr.chipStyle, com.teamviewer.teamviewer.market.mobile.R.style.Widget_MaterialComponents_Chip_Action);
        xk0.n(context2, attributeSet, iArr, com.teamviewer.teamviewer.market.mobile.R.attr.chipStyle, com.teamviewer.teamviewer.market.mobile.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.teamviewer.teamviewer.market.mobile.R.attr.chipStyle, com.teamviewer.teamviewer.market.mobile.R.style.Widget_MaterialComponents_Chip_Action);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.C = new yq0(this, this);
        f();
        if (!zHasValue) {
            setOutlineProvider(new xq0(this));
        }
        setChecked(this.v);
        setText(ar0Var.Q);
        setEllipsize(ar0Var.N0);
        i();
        if (!this.q.O0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        h();
        if (this.z) {
            setMinHeight(this.B);
        }
        this.A = getLayoutDirection();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.E;
        rectF.setEmpty();
        if (d() && this.t != null) {
            ar0 ar0Var = this.q;
            Rect bounds = ar0Var.getBounds();
            rectF.setEmpty();
            if (ar0Var.W()) {
                float f = ar0Var.p0 + ar0Var.o0 + ar0Var.a0 + ar0Var.n0 + ar0Var.m0;
                if (ar0Var.getLayoutDirection() == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i = (int) closeIconTouchBounds.left;
        int i2 = (int) closeIconTouchBounds.top;
        int i3 = (int) closeIconTouchBounds.right;
        int i4 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.D;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    private ap7 getTextAppearance() {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            return ar0Var.w0.f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.x != z) {
            this.x = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.w != z) {
            this.w = z;
            refreshDrawableState();
        }
    }

    public final void c(int i) {
        this.B = i;
        if (!this.z) {
            InsetDrawable insetDrawable = this.r;
            if (insetDrawable == null) {
                int[] iArr = oe6.a;
                g();
                return;
            } else {
                if (insetDrawable != null) {
                    this.r = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr2 = oe6.a;
                    g();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i - ((int) this.q.L));
        int iMax2 = Math.max(0, i - this.q.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.r;
            if (insetDrawable2 == null) {
                int[] iArr3 = oe6.a;
                g();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.r = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr4 = oe6.a;
                    g();
                    return;
                }
                return;
            }
        }
        int i2 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i3 = iMax > 0 ? iMax / 2 : 0;
        if (this.r != null) {
            Rect rect = new Rect();
            this.r.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                int[] iArr5 = oe6.a;
                g();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.r = new InsetDrawable((Drawable) this.q, i2, i3, i2, i3);
        int[] iArr6 = oe6.a;
        g();
    }

    public final boolean d() {
        ar0 ar0Var = this.q;
        if (ar0Var == null) {
            return false;
        }
        Drawable drawable = ar0Var.X;
        if (drawable == null) {
            drawable = null;
        }
        return drawable != null;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        yq0 yq0Var = this.C;
        if (action == 10) {
            try {
                Field declaredField = rf2.class.getDeclaredField("y");
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(yq0Var)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = rf2.class.getDeclaredMethod("s", Integer.TYPE);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(yq0Var, Integer.MIN_VALUE);
                    return true;
                }
            } catch (IllegalAccessException e) {
                v0.d("Chip", "Unable to send Accessibility Exit event", e);
            } catch (NoSuchFieldException e2) {
                v0.d("Chip", "Unable to send Accessibility Exit event", e2);
            } catch (NoSuchMethodException e3) {
                v0.d("Chip", "Unable to send Accessibility Exit event", e3);
            } catch (InvocationTargetException e4) {
                v0.d("Chip", "Unable to send Accessibility Exit event", e4);
            }
        }
        return yq0Var.l(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:36:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i;
        Chip chip;
        View.OnClickListener onClickListener;
        yq0 yq0Var = this.C;
        yq0Var.getClass();
        boolean zN = false;
        int i2 = 0;
        zN = false;
        zN = false;
        zN = false;
        zN = false;
        zN = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i3 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i3 = 33;
                                } else if (keyCode == 21) {
                                    i3 = 17;
                                } else if (keyCode != 22) {
                                    i3 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z = false;
                                while (i2 < repeatCount && yq0Var.n(i3, null)) {
                                    i2++;
                                    z = true;
                                }
                                zN = z;
                            }
                            break;
                        case 23:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                i = yq0Var.x;
                                if (i != Integer.MIN_VALUE) {
                                    chip = yq0Var.C;
                                    if (i == 0) {
                                        chip.performClick();
                                    } else if (i == 1) {
                                        chip.playSoundEffect(0);
                                        onClickListener = chip.t;
                                        if (onClickListener != null) {
                                            onClickListener.onClick(chip);
                                        }
                                        chip.C.r(1, 1);
                                    }
                                }
                                zN = true;
                            }
                            break;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    i = yq0Var.x;
                    if (i != Integer.MIN_VALUE) {
                        chip = yq0Var.C;
                        if (i == 0) {
                            chip.performClick();
                        } else if (i == 1) {
                            chip.playSoundEffect(0);
                            onClickListener = chip.t;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            chip.C.r(1, 1);
                        }
                    }
                    zN = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                zN = yq0Var.n(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                zN = yq0Var.n(1, null);
            }
        }
        if (!zN || yq0Var.x == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // o.cs, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        int i2;
        super.drawableStateChanged();
        ar0 ar0Var = this.q;
        boolean z = false;
        if (ar0Var != null && ar0.x(ar0Var.X)) {
            ar0 ar0Var2 = this.q;
            ?? IsEnabled = isEnabled();
            if (this.y) {
                i = IsEnabled;
                i = IsEnabled + 1;
            }
            i = IsEnabled;
            int i3 = i;
            if (this.x) {
                i3 = i + 1;
            }
            int i4 = i3;
            if (this.w) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (this.y) {
                iArr[i2] = 16842908;
                i2++;
            }
            if (this.x) {
                iArr[i2] = 16843623;
                i2++;
            }
            if (this.w) {
                iArr[i2] = 16842919;
                i2++;
            }
            if (isChecked()) {
                iArr[i2] = 16842913;
            }
            if (!Arrays.equals(ar0Var2.K0, iArr)) {
                ar0Var2.K0 = iArr;
                if (ar0Var2.W()) {
                    z = ar0Var2.z(ar0Var2.getState(), iArr);
                }
            }
        }
        if (z) {
            invalidate();
        }
    }

    public final boolean e() {
        ar0 ar0Var = this.q;
        return ar0Var != null && ar0Var.c0;
    }

    public final void f() {
        ar0 ar0Var;
        if (!d() || (ar0Var = this.q) == null || !ar0Var.W || this.t == null) {
            be8.m(this, null);
        } else {
            be8.m(this, this.C);
        }
    }

    public final void g() {
        this.s = new RippleDrawable(oe6.b(this.q.P), getBackgroundDrawable(), null);
        this.q.getClass();
        RippleDrawable rippleDrawable = this.s;
        WeakHashMap weakHashMap = be8.a;
        setBackground(rippleDrawable);
        h();
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.r;
        return insetDrawable == null ? this.q : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            return ar0Var.e0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            return ar0Var.f0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            return ar0Var.K;
        }
        return null;
    }

    public float getChipCornerRadius() {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            return Math.max(0.0f, ar0Var.v());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.q;
    }

    public float getChipEndPadding() {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            return ar0Var.p0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        ar0 ar0Var = this.q;
        if (ar0Var == null || (drawable = ar0Var.S) == null) {
            return null;
        }
        return drawable;
    }

    public float getChipIconSize() {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            return ar0Var.U;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            return ar0Var.T;
        }
        return null;
    }

    public float getChipMinHeight() {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            return ar0Var.L;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            return ar0Var.i0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            return ar0Var.N;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            return ar0Var.O;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        ar0 ar0Var = this.q;
        if (ar0Var == null || (drawable = ar0Var.X) == null) {
            return null;
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            return ar0Var.b0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            return ar0Var.o0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            return ar0Var.a0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            return ar0Var.n0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            return ar0Var.Z;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            return ar0Var.N0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        yq0 yq0Var = this.C;
        if (yq0Var.x == 1 || yq0Var.w == 1) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public eu4 getHideMotionSpec() {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            return ar0Var.h0;
        }
        return null;
    }

    public float getIconEndPadding() {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            return ar0Var.k0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            return ar0Var.j0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            return ar0Var.P;
        }
        return null;
    }

    public qw6 getShapeAppearanceModel() {
        return this.q.m.a;
    }

    public eu4 getShowMotionSpec() {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            return ar0Var.g0;
        }
        return null;
    }

    public float getTextEndPadding() {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            return ar0Var.m0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            return ar0Var.l0;
        }
        return 0.0f;
    }

    public final void h() {
        ar0 ar0Var;
        if (TextUtils.isEmpty(getText()) || (ar0Var = this.q) == null) {
            return;
        }
        int iU = (int) (ar0Var.u() + ar0Var.p0 + ar0Var.m0);
        ar0 ar0Var2 = this.q;
        int iT = (int) (ar0Var2.t() + ar0Var2.i0 + ar0Var2.l0);
        if (this.r != null) {
            Rect rect = new Rect();
            this.r.getPadding(rect);
            iT += rect.left;
            iU += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = be8.a;
        setPaddingRelative(iT, paddingTop, iU, paddingBottom);
    }

    public final void i() {
        TextPaint paint = getPaint();
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            paint.drawableState = ar0Var.getState();
        }
        ap7 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.F);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        yo1.U(this, this.q);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, H);
        }
        if (e()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, I);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        yq0 yq0Var = this.C;
        int i2 = yq0Var.x;
        if (i2 != Integer.MIN_VALUE) {
            yq0Var.j(i2);
        }
        if (z) {
            yq0Var.n(i, rect);
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (e() || isClickable()) {
            accessibilityNodeInfo.setClassName(e() ? "android.widget.CompoundButton" : "android.widget.Button");
        } else {
            accessibilityNodeInfo.setClassName("android.view.View");
        }
        accessibilityNodeInfo.setCheckable(e());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            if (!chipGroup.f1289o) {
                i = -1;
                break;
            }
            int i2 = 0;
            i = 0;
            while (true) {
                if (i2 >= chipGroup.getChildCount()) {
                    i = -1;
                    break;
                }
                if (chipGroup.getChildAt(i2) instanceof Chip) {
                    if (((Chip) chipGroup.getChildAt(i2)) == this) {
                        break;
                    } else {
                        i++;
                    }
                }
                i2++;
            }
            Object tag = getTag(com.teamviewer.teamviewer.market.mobile.R.id.row_index_key);
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) f4.c(isChecked(), tag instanceof Integer ? ((Integer) tag).intValue() : -1, 1, i, 1).m);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.A != i) {
            this.A = i;
            h();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                    }
                } else if (this.w) {
                    if (!zContains) {
                        setCloseIconPressed(false);
                    }
                    z = true;
                }
                z = false;
            } else {
                if (this.w) {
                    playSoundEffect(0);
                    View.OnClickListener onClickListener = this.t;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    this.C.r(1, 1);
                    z = true;
                }
                setCloseIconPressed(false);
            }
            z = false;
            setCloseIconPressed(false);
        } else if (zContains) {
            setCloseIconPressed(true);
            z = true;
        } else {
            z = false;
        }
        return z || super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.s) {
            super.setBackground(drawable);
        } else {
            v0.j("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        v0.j("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // o.cs, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.s) {
            super.setBackgroundDrawable(drawable);
        } else {
            v0.j("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // o.cs, android.view.View
    public void setBackgroundResource(int i) {
        v0.j("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        v0.j("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        v0.j("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            ar0Var.A(z);
        }
    }

    public void setCheckableResource(int i) {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            ar0Var.A(ar0Var.q0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        ar0 ar0Var = this.q;
        if (ar0Var == null) {
            this.v = z;
            return;
        }
        if (ar0Var.c0) {
            boolean zIsChecked = isChecked();
            super.setChecked(z);
            if (zIsChecked == z || (onCheckedChangeListener = this.u) == null) {
                return;
            }
            onCheckedChangeListener.onCheckedChanged(this, z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            ar0Var.B(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            ar0Var.B(uf0.p(ar0Var.q0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            ar0Var.C(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            ar0Var.C(hm3.m(ar0Var.q0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            ar0Var.D(ar0Var.q0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        ar0 ar0Var = this.q;
        if (ar0Var == null || ar0Var.K == colorStateList) {
            return;
        }
        ar0Var.K = colorStateList;
        ar0Var.onStateChange(ar0Var.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList colorStateListM;
        ar0 ar0Var = this.q;
        if (ar0Var == null || ar0Var.K == (colorStateListM = hm3.m(ar0Var.q0, i))) {
            return;
        }
        ar0Var.K = colorStateListM;
        ar0Var.onStateChange(ar0Var.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            ar0Var.E(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            ar0Var.E(ar0Var.q0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(ar0 ar0Var) {
        ar0 ar0Var2 = this.q;
        if (ar0Var2 != ar0Var) {
            if (ar0Var2 != null) {
                ar0Var2.M0 = new WeakReference(null);
            }
            this.q = ar0Var;
            ar0Var.O0 = false;
            ar0Var.M0 = new WeakReference(this);
            c(this.B);
        }
    }

    public void setChipEndPadding(float f) {
        ar0 ar0Var = this.q;
        if (ar0Var == null || ar0Var.p0 == f) {
            return;
        }
        ar0Var.p0 = f;
        ar0Var.invalidateSelf();
        ar0Var.y();
    }

    public void setChipEndPaddingResource(int i) {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            float dimension = ar0Var.q0.getResources().getDimension(i);
            if (ar0Var.p0 != dimension) {
                ar0Var.p0 = dimension;
                ar0Var.invalidateSelf();
                ar0Var.y();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            ar0Var.F(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            ar0Var.F(uf0.p(ar0Var.q0, i));
        }
    }

    public void setChipIconSize(float f) {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            ar0Var.G(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            ar0Var.G(ar0Var.q0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            ar0Var.H(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            ar0Var.H(hm3.m(ar0Var.q0, i));
        }
    }

    public void setChipIconVisible(int i) {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            ar0Var.I(ar0Var.q0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        ar0 ar0Var = this.q;
        if (ar0Var == null || ar0Var.L == f) {
            return;
        }
        ar0Var.L = f;
        ar0Var.invalidateSelf();
        ar0Var.y();
    }

    public void setChipMinHeightResource(int i) {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            float dimension = ar0Var.q0.getResources().getDimension(i);
            if (ar0Var.L != dimension) {
                ar0Var.L = dimension;
                ar0Var.invalidateSelf();
                ar0Var.y();
            }
        }
    }

    public void setChipStartPadding(float f) {
        ar0 ar0Var = this.q;
        if (ar0Var == null || ar0Var.i0 == f) {
            return;
        }
        ar0Var.i0 = f;
        ar0Var.invalidateSelf();
        ar0Var.y();
    }

    public void setChipStartPaddingResource(int i) {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            float dimension = ar0Var.q0.getResources().getDimension(i);
            if (ar0Var.i0 != dimension) {
                ar0Var.i0 = dimension;
                ar0Var.invalidateSelf();
                ar0Var.y();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            ar0Var.J(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            ar0Var.J(hm3.m(ar0Var.q0, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            ar0Var.K(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            ar0Var.K(ar0Var.q0.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            ar0Var.L(drawable);
        }
        f();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        ar0 ar0Var = this.q;
        if (ar0Var == null || ar0Var.b0 == charSequence) {
            return;
        }
        String str = a60.d;
        a60 a60Var = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? a60.g : a60.f;
        ar0Var.b0 = a60Var.c(charSequence, a60Var.c);
        ar0Var.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            ar0Var.M(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            ar0Var.M(ar0Var.q0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            ar0Var.L(uf0.p(ar0Var.q0, i));
        }
        f();
    }

    public void setCloseIconSize(float f) {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            ar0Var.N(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            ar0Var.N(ar0Var.q0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            ar0Var.O(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            ar0Var.O(ar0Var.q0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            ar0Var.P(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            ar0Var.P(hm3.m(ar0Var.q0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // o.cs, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            yq4.r("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            yq4.r("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // o.cs, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            yq4.r("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            yq4.r("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            yq4.r("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            yq4.r("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            yq4.r("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            yq4.r("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            ar0Var.k(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.q == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            yq4.r("Text within a chip are not allowed to scroll.");
            return;
        }
        super.setEllipsize(truncateAt);
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            ar0Var.N0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.z = z;
        c(this.B);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            v0.j("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(eu4 eu4Var) {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            ar0Var.h0 = eu4Var;
        }
    }

    public void setHideMotionSpecResource(int i) {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            ar0Var.h0 = eu4.b(ar0Var.q0, i);
        }
    }

    public void setIconEndPadding(float f) {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            ar0Var.R(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            ar0Var.R(ar0Var.q0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            ar0Var.S(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            ar0Var.S(ar0Var.q0.getResources().getDimension(i));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.q == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
        } else {
            yq4.r("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
        } else {
            yq4.r("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            ar0Var.P0 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
        } else {
            yq4.r("Chip does not support multi-line text");
        }
    }

    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.u = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.t = onClickListener;
        f();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            ar0Var.T(colorStateList);
        }
        this.q.getClass();
        g();
    }

    public void setRippleColorResource(int i) {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            ar0Var.T(hm3.m(ar0Var.q0, i));
            this.q.getClass();
            g();
        }
    }

    @Override // o.sx6
    public void setShapeAppearanceModel(qw6 qw6Var) {
        this.q.setShapeAppearanceModel(qw6Var);
    }

    public void setShowMotionSpec(eu4 eu4Var) {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            ar0Var.g0 = eu4Var;
        }
    }

    public void setShowMotionSpecResource(int i) {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            ar0Var.g0 = eu4.b(ar0Var.q0, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
        } else {
            yq4.r("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        ar0 ar0Var = this.q;
        if (ar0Var == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(ar0Var.O0 ? null : charSequence, bufferType);
        ar0 ar0Var2 = this.q;
        if (ar0Var2 == null || TextUtils.equals(ar0Var2.Q, charSequence)) {
            return;
        }
        ar0Var2.Q = charSequence;
        ar0Var2.w0.d = true;
        ar0Var2.invalidateSelf();
        ar0Var2.y();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            Context context2 = ar0Var.q0;
            ar0Var.w0.b(new ap7(context2, i), context2);
        }
        i();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        ar0 ar0Var = this.q;
        if (ar0Var == null || ar0Var.m0 == f) {
            return;
        }
        ar0Var.m0 = f;
        ar0Var.invalidateSelf();
        ar0Var.y();
    }

    public void setTextEndPaddingResource(int i) {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            float dimension = ar0Var.q0.getResources().getDimension(i);
            if (ar0Var.m0 != dimension) {
                ar0Var.m0 = dimension;
                ar0Var.invalidateSelf();
                ar0Var.y();
            }
        }
    }

    public void setTextStartPadding(float f) {
        ar0 ar0Var = this.q;
        if (ar0Var == null || ar0Var.l0 == f) {
            return;
        }
        ar0Var.l0 = f;
        ar0Var.invalidateSelf();
        ar0Var.y();
    }

    public void setTextStartPaddingResource(int i) {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            float dimension = ar0Var.q0.getResources().getDimension(i);
            if (ar0Var.l0 != dimension) {
                ar0Var.l0 = dimension;
                ar0Var.invalidateSelf();
                ar0Var.y();
            }
        }
    }

    public void setCloseIconVisible(boolean z) {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            ar0Var.Q(z);
        }
        f();
    }

    public void setCheckedIconVisible(boolean z) {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            ar0Var.D(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            ar0Var.I(z);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            yq4.r("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            yq4.r("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            yq4.r("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            yq4.r("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(ap7 ap7Var) {
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            ar0Var.w0.b(ap7Var, ar0Var.q0);
        }
        i();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        ar0 ar0Var = this.q;
        if (ar0Var != null) {
            Context context = ar0Var.q0;
            ar0Var.w0.b(new ap7(context, i), context);
        }
        i();
    }

    public Chip(Context context) {
        this(context, null);
    }
}
