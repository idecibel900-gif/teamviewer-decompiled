package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import java.util.WeakHashMap;
import o.a92;
import o.be8;
import o.ep3;
import o.gh7;
import o.h62;
import o.hm3;
import o.i67;
import o.nv1;
import o.od8;
import o.om0;
import o.pe;
import o.pf8;
import o.uf0;
import o.ut;
import o.wt7;
import o.xs;
import o.zz5;

/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {
    public static final om0 g0 = new om0(Float.class, "thumbPos", (byte) 5);
    public static final int[] h0 = {R.attr.state_checked};
    public CharSequence A;
    public CharSequence B;
    public CharSequence C;
    public CharSequence D;
    public boolean E;
    public byte F;
    public final int G;
    public float H;
    public float I;
    public final VelocityTracker J;
    public final int K;
    public float L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public boolean T;
    public final TextPaint U;
    public final ColorStateList V;
    public StaticLayout W;
    public StaticLayout a0;
    public final pe b0;
    public ObjectAnimator c0;
    public xs d0;
    public gh7 e0;
    public final Rect f0;
    public Drawable m;
    public ColorStateList n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public PorterDuff.Mode f8o;
    public boolean p;
    public boolean q;
    public Drawable r;
    public ColorStateList s;
    public PorterDuff.Mode t;
    public boolean u;
    public boolean v;
    public int w;
    public int x;
    public int y;
    public boolean z;

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        Typeface typeface;
        int resourceId;
        super(context, attributeSet, com.teamviewer.teamviewer.market.mobile.R.attr.switchStyle);
        this.n = null;
        this.f8o = null;
        this.p = false;
        this.q = false;
        this.s = null;
        this.t = null;
        this.u = false;
        this.v = false;
        this.J = VelocityTracker.obtain();
        this.T = true;
        this.f0 = new Rect();
        wt7.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.U = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = zz5.w;
        ep3 ep3VarX = ep3.x(context, attributeSet, iArr, com.teamviewer.teamviewer.market.mobile.R.attr.switchStyle);
        TypedArray typedArray = (TypedArray) ep3VarX.f733o;
        be8.l(this, context, iArr, attributeSet, typedArray, com.teamviewer.teamviewer.market.mobile.R.attr.switchStyle);
        Drawable drawableL = ep3VarX.l(2);
        this.m = drawableL;
        if (drawableL != null) {
            drawableL.setCallback(this);
        }
        Drawable drawableL2 = ep3VarX.l(11);
        this.r = drawableL2;
        if (drawableL2 != null) {
            drawableL2.setCallback(this);
        }
        setTextOnInternal(typedArray.getText(0));
        setTextOffInternal(typedArray.getText(1));
        this.E = typedArray.getBoolean(3, true);
        this.w = typedArray.getDimensionPixelSize(8, 0);
        this.x = typedArray.getDimensionPixelSize(5, 0);
        this.y = typedArray.getDimensionPixelSize(6, 0);
        this.z = typedArray.getBoolean(4, false);
        ColorStateList colorStateListI = ep3VarX.i(9);
        if (colorStateListI != null) {
            this.n = colorStateListI;
            this.p = true;
        }
        PorterDuff.Mode modeC = h62.c(typedArray.getInt(10, -1), null);
        if (this.f8o != modeC) {
            this.f8o = modeC;
            this.q = true;
        }
        if (this.p || this.q) {
            a();
        }
        ColorStateList colorStateListI2 = ep3VarX.i(12);
        if (colorStateListI2 != null) {
            this.s = colorStateListI2;
            this.u = true;
        }
        PorterDuff.Mode modeC2 = h62.c(typedArray.getInt(13, -1), null);
        if (this.t != modeC2) {
            this.t = modeC2;
            this.v = true;
        }
        if (this.u || this.v) {
            b();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId2, zz5.x);
            ColorStateList colorStateList = (!typedArrayObtainStyledAttributes.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = hm3.m(context, resourceId)) == null) ? typedArrayObtainStyledAttributes.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.V = colorStateList;
            } else {
                this.V = getTextColors();
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f = dimensionPixelSize;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int i = typedArrayObtainStyledAttributes.getInt(1, -1);
            int i2 = typedArrayObtainStyledAttributes.getInt(2, -1);
            if (i == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (i != 2) {
                typeface = i != 3 ? null : Typeface.MONOSPACE;
            } else {
                typeface = Typeface.SERIF;
            }
            if (i2 > 0) {
                Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i2) : Typeface.create(typeface, i2);
                setSwitchTypeface(typefaceDefaultFromStyle);
                int i3 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i2;
                textPaint.setFakeBoldText((i3 & 1) != 0);
                textPaint.setTextSkewX((2 & i3) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
                Context context2 = getContext();
                pe peVar = new pe();
                peVar.m = context2.getResources().getConfiguration().locale;
                this.b0 = peVar;
            } else {
                this.b0 = null;
            }
            setTextOnInternal(this.A);
            setTextOffInternal(this.C);
            typedArrayObtainStyledAttributes.recycle();
        }
        new ut(this).g(attributeSet, com.teamviewer.teamviewer.market.mobile.R.attr.switchStyle);
        ep3VarX.B();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.G = viewConfiguration.getScaledTouchSlop();
        this.K = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().b(attributeSet, com.teamviewer.teamviewer.market.mobile.R.attr.switchStyle);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private xs getEmojiTextViewHelper() {
        xs xsVar = this.d0;
        if (xsVar != null) {
            return xsVar;
        }
        xs xsVar2 = new xs(this);
        this.d0 = xsVar2;
        return xsVar2;
    }

    private boolean getTargetCheckedState() {
        return this.L > 0.5f;
    }

    private int getThumbOffset() {
        boolean z = pf8.a;
        int layoutDirection = getLayoutDirection();
        float f = this.L;
        if (layoutDirection == 1) {
            f = 1.0f - f;
        }
        return (int) ((f * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.r;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f0;
        drawable.getPadding(rect);
        Drawable drawable2 = this.m;
        Rect rectB = drawable2 != null ? h62.b(drawable2) : h62.c;
        return ((((this.M - this.O) - rect.left) - rect.right) - rectB.left) - rectB.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.C = charSequence;
        TransformationMethod transformationMethodO = ((nv1) getEmojiTextViewHelper().b.n).O(this.b0);
        if (transformationMethodO != null) {
            charSequence = transformationMethodO.getTransformation(charSequence, this);
        }
        this.D = charSequence;
        this.a0 = null;
        if (this.E) {
            d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.A = charSequence;
        TransformationMethod transformationMethodO = ((nv1) getEmojiTextViewHelper().b.n).O(this.b0);
        if (transformationMethodO != null) {
            charSequence = transformationMethodO.getTransformation(charSequence, this);
        }
        this.B = charSequence;
        this.W = null;
        if (this.E) {
            d();
        }
    }

    public final void a() {
        Drawable drawable = this.m;
        if (drawable != null) {
            if (this.p || this.q) {
                Drawable drawableMutate = drawable.mutate();
                this.m = drawableMutate;
                if (this.p) {
                    drawableMutate.setTintList(this.n);
                }
                if (this.q) {
                    this.m.setTintMode(this.f8o);
                }
                if (this.m.isStateful()) {
                    this.m.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.r;
        if (drawable != null) {
            if (this.u || this.v) {
                Drawable drawableMutate = drawable.mutate();
                this.r = drawableMutate;
                if (this.u) {
                    drawableMutate.setTintList(this.s);
                }
                if (this.v) {
                    this.r.setTintMode(this.t);
                }
                if (this.r.isStateful()) {
                    this.r.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        setTextOnInternal(this.A);
        setTextOffInternal(this.C);
        requestLayout();
    }

    public final void d() {
        if (this.e0 == null && ((nv1) this.d0.b.n).D() && a92.d()) {
            a92 a92VarA = a92.a();
            int iC = a92VarA.c();
            if (iC == 3 || iC == 0) {
                gh7 gh7Var = new gh7(this);
                this.e0 = gh7Var;
                a92VarA.h(gh7Var);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        int i3 = this.P;
        int i4 = this.Q;
        int i5 = this.R;
        int i6 = this.S;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.m;
        Rect rectB = drawable != null ? h62.b(drawable) : h62.c;
        Drawable drawable2 = this.r;
        Rect rect = this.f0;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (rectB != null) {
                int i8 = rectB.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rectB.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = rectB.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rectB.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                }
                this.r.setBounds(i3, i, i5, i2);
            } else {
                i = i4;
            }
            i2 = i6;
            this.r.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.m;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.O + rect.right;
            this.m.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.m;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
        Drawable drawable2 = this.r;
        if (drawable2 != null) {
            drawable2.setHotspot(f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.m;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.r;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        boolean z = pf8.a;
        if (getLayoutDirection() != 1) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.M;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.y : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        boolean z = pf8.a;
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.M;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.y : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return i67.D(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.E;
    }

    public boolean getSplitTrack() {
        return this.z;
    }

    public int getSwitchMinWidth() {
        return this.x;
    }

    public int getSwitchPadding() {
        return this.y;
    }

    public CharSequence getTextOff() {
        return this.C;
    }

    public CharSequence getTextOn() {
        return this.A;
    }

    public Drawable getThumbDrawable() {
        return this.m;
    }

    public final float getThumbPosition() {
        return this.L;
    }

    public int getThumbTextPadding() {
        return this.w;
    }

    public ColorStateList getThumbTintList() {
        return this.n;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f8o;
    }

    public Drawable getTrackDrawable() {
        return this.r;
    }

    public ColorStateList getTrackTintList() {
        return this.s;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.t;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.m;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.r;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.c0;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.c0.end();
        this.c0 = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, h0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.r;
        Rect rect = this.f0;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.Q;
        int i2 = this.S;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.m;
        if (drawable != null) {
            if (!this.z || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectB = h62.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectB.left;
                rect.right -= rectB.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.W : this.a0;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            TextPaint textPaint = this.U;
            ColorStateList colorStateList = this.V;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i3 + i4) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.A : this.C;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z, i, i2, i3, i4);
        int iMax2 = 0;
        if (this.m != null) {
            Drawable drawable = this.r;
            Rect rect = this.f0;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectB = h62.b(this.m);
            iMax = Math.max(0, rectB.left - rect.left);
            iMax2 = Math.max(0, rectB.right - rect.right);
        } else {
            iMax = 0;
        }
        boolean z2 = pf8.a;
        if (getLayoutDirection() == 1) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.M + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.M) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i5 = this.N;
            int i6 = height2 - (i5 / 2);
            height = i5 + i6;
            paddingTop = i6;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.N + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.N;
        }
        this.P = paddingLeft;
        this.Q = paddingTop;
        this.S = height;
        this.R = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int intrinsicWidth;
        int intrinsicHeight;
        int iMax;
        int intrinsicHeight2 = 0;
        if (this.E) {
            StaticLayout staticLayout = this.W;
            TextPaint textPaint = this.U;
            if (staticLayout == null) {
                CharSequence charSequence = this.B;
                this.W = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.a0 == null) {
                CharSequence charSequence2 = this.D;
                this.a0 = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.m;
        Rect rect = this.f0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.m.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.m.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        if (this.E) {
            iMax = (this.w * 2) + Math.max(this.W.getWidth(), this.a0.getWidth());
        } else {
            iMax = 0;
        }
        this.O = Math.max(iMax, intrinsicWidth);
        Drawable drawable2 = this.r;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.r.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax2 = rect.left;
        int iMax3 = rect.right;
        Drawable drawable3 = this.m;
        if (drawable3 != null) {
            Rect rectB = h62.b(drawable3);
            iMax2 = Math.max(iMax2, rectB.left);
            iMax3 = Math.max(iMax3, rectB.right);
        }
        boolean z = this.T;
        int iMax4 = this.x;
        if (z) {
            iMax4 = Math.max(iMax4, (this.O * 2) + iMax2 + iMax3);
        }
        int iMax5 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.M = iMax4;
        this.N = iMax5;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < iMax5) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax5);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.A : this.C;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:52:0x00be  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00db  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f2  */
    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean zIsChecked;
        boolean targetCheckedState;
        float xVelocity;
        float f;
        VelocityTracker velocityTracker = this.J;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i = this.G;
        if (actionMasked != 0) {
            float f2 = 0.0f;
            if (actionMasked == 1) {
                if (this.F == 2) {
                    this.F = (byte) 0;
                    if (motionEvent.getAction() == 1 || !isEnabled()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    zIsChecked = isChecked();
                    if (z) {
                        velocityTracker.computeCurrentVelocity(1000);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) > this.K) {
                            boolean z2 = pf8.a;
                            targetCheckedState = getLayoutDirection() == 1 ? xVelocity > 0.0f : xVelocity < 0.0f;
                        } else {
                            targetCheckedState = getTargetCheckedState();
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.setAction(3);
                    super.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.F = (byte) 0;
                velocityTracker.clear();
            } else if (actionMasked == 2) {
                byte b = this.F;
                if (b == 1) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    float f3 = i;
                    if (Math.abs(x - this.H) > f3 || Math.abs(y - this.I) > f3) {
                        this.F = (byte) 2;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        this.H = x;
                        this.I = y;
                        return true;
                    }
                } else if (b == 2) {
                    float x2 = motionEvent.getX();
                    int thumbScrollRange = getThumbScrollRange();
                    float f4 = x2 - this.H;
                    if (thumbScrollRange != 0) {
                        f = f4 / thumbScrollRange;
                    } else {
                        f = f4 > 0.0f ? 1.0f : -1.0f;
                    }
                    boolean z3 = pf8.a;
                    if (getLayoutDirection() == 1) {
                        f = -f;
                    }
                    float f5 = this.L;
                    float f6 = f + f5;
                    if (f6 >= 0.0f) {
                        f2 = f6 > 1.0f ? 1.0f : f6;
                    }
                    if (f2 != f5) {
                        this.H = x2;
                        setThumbPosition(f2);
                    }
                    return true;
                }
            } else if (actionMasked == 3) {
                if (this.F == 2) {
                    this.F = (byte) 0;
                    if (motionEvent.getAction() == 1) {
                        z = false;
                    } else {
                        z = false;
                    }
                    zIsChecked = isChecked();
                    if (z) {
                        velocityTracker.computeCurrentVelocity(1000);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) > this.K) {
                            boolean z4 = pf8.a;
                            if (getLayoutDirection() == 1) {
                            }
                        } else {
                            targetCheckedState = getTargetCheckedState();
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                    motionEventObtain2.setAction(3);
                    super.onTouchEvent(motionEventObtain2);
                    motionEventObtain2.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.F = (byte) 0;
                velocityTracker.clear();
            }
        } else {
            float x3 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (isEnabled() && this.m != null) {
                int thumbOffset = getThumbOffset();
                Drawable drawable = this.m;
                Rect rect = this.f0;
                drawable.getPadding(rect);
                int i2 = this.Q - i;
                int i3 = (this.P + thumbOffset) - i;
                int i4 = this.O + i3 + rect.left + rect.right + i;
                int i5 = this.S + i;
                if (x3 > i3 && x3 < i4 && y2 > i2 && y2 < i5) {
                    this.F = (byte) 1;
                    this.H = x3;
                    this.I = y2;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object string = this.A;
                if (string == null) {
                    string = getResources().getString(com.teamviewer.teamviewer.market.mobile.R.string.abc_capital_on);
                }
                Object obj = string;
                WeakHashMap weakHashMap = be8.a;
                new od8(com.teamviewer.teamviewer.market.mobile.R.id.tag_state_description, CharSequence.class, 64, 30, (byte) 2).a(this, obj);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object string2 = this.C;
            if (string2 == null) {
                string2 = getResources().getString(com.teamviewer.teamviewer.market.mobile.R.string.abc_capital_off);
            }
            Object obj2 = string2;
            WeakHashMap weakHashMap2 = be8.a;
            new od8(com.teamviewer.teamviewer.market.mobile.R.id.tag_state_description, CharSequence.class, 64, 30, (byte) 2).a(this, obj2);
        }
        if (getWindowToken() == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.c0;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, g0, zIsChecked ? 1.0f : 0.0f);
        this.c0 = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.c0.setAutoCancel(true);
        this.c0.start();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i67.G(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
        setTextOnInternal(this.A);
        setTextOffInternal(this.C);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.T = z;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.E != z) {
            this.E = z;
            requestLayout();
            if (z) {
                d();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.z = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.x = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.y = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.U;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.C;
        if (string == null) {
            string = getResources().getString(com.teamviewer.teamviewer.market.mobile.R.string.abc_capital_off);
        }
        WeakHashMap weakHashMap = be8.a;
        new od8(com.teamviewer.teamviewer.market.mobile.R.id.tag_state_description, CharSequence.class, 64, 30, (byte) 2).a(this, string);
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.A;
        if (string == null) {
            string = getResources().getString(com.teamviewer.teamviewer.market.mobile.R.string.abc_capital_on);
        }
        WeakHashMap weakHashMap = be8.a;
        new od8(com.teamviewer.teamviewer.market.mobile.R.id.tag_state_description, CharSequence.class, 64, 30, (byte) 2).a(this, string);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.m;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.m = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.L = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(uf0.p(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.w = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.n = colorStateList;
        this.p = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f8o = mode;
        this.q = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.r;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.r = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(uf0.p(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.s = colorStateList;
        this.u = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.t = mode;
        this.v = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.m || drawable == this.r;
    }

    public SwitchCompat(Context context) {
        this(context, null);
    }
}
