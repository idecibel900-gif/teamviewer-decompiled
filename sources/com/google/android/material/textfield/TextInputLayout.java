package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import o.a60;
import o.be8;
import o.cg1;
import o.ch3;
import o.el0;
import o.ep3;
import o.et0;
import o.fo1;
import o.ft0;
import o.fv0;
import o.gs7;
import o.h62;
import o.hc0;
import o.hk0;
import o.hm3;
import o.hs7;
import o.hw0;
import o.hz5;
import o.io1;
import o.is7;
import o.it0;
import o.it8;
import o.lo;
import o.n;
import o.pn4;
import o.qn4;
import o.qw6;
import o.rr;
import o.to7;
import o.uf0;
import o.ug5;
import o.us;
import o.vd8;
import o.x67;
import o.xf1;
import o.xk0;
import o.xo1;
import o.y85;
import o.yt;
import o.z62;
import o.za2;

/* JADX INFO: loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {
    public int A;
    public int A0;
    public CharSequence B;
    public Drawable B0;
    public boolean C;
    public View.OnLongClickListener C0;
    public yt D;
    public View.OnLongClickListener D0;
    public ColorStateList E;
    public final CheckableImageButton E0;
    public int F;
    public ColorStateList F0;
    public ColorStateList G;
    public ColorStateList G0;
    public ColorStateList H;
    public ColorStateList H0;
    public CharSequence I;
    public int I0;
    public final yt J;
    public int J0;
    public CharSequence K;
    public int K0;
    public final yt L;
    public ColorStateList L0;
    public boolean M;
    public int M0;
    public CharSequence N;
    public int N0;
    public boolean O;
    public int O0;
    public qn4 P;
    public int P0;
    public qn4 Q;
    public int Q0;
    public final qw6 R;
    public boolean R0;
    public final int S;
    public final fv0 S0;
    public int T;
    public boolean T0;
    public int U;
    public boolean U0;
    public int V;
    public ValueAnimator V0;
    public int W;
    public boolean W0;
    public boolean X0;
    public int a0;
    public int b0;
    public int c0;
    public int d0;
    public final Rect e0;
    public final Rect f0;
    public final RectF g0;
    public Typeface h0;
    public final CheckableImageButton i0;
    public ColorStateList j0;
    public boolean k0;
    public PorterDuff.Mode l0;
    public final FrameLayout m;
    public boolean m0;
    public final LinearLayout n;
    public ColorDrawable n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final LinearLayout f45o;
    public int o0;
    public final FrameLayout p;
    public View.OnLongClickListener p0;
    public EditText q;
    public final LinkedHashSet q0;
    public CharSequence r;
    public int r0;
    public int s;
    public final SparseArray s0;
    public int t;
    public final CheckableImageButton t0;
    public final ch3 u;
    public final LinkedHashSet u0;
    public boolean v;
    public ColorStateList v0;
    public int w;
    public boolean w0;
    public boolean x;
    public PorterDuff.Mode x0;
    public yt y;
    public boolean y0;
    public int z;
    public ColorDrawable z0;

    /* JADX WARN: Code duplicated, block: B:96:0x0505  */
    public TextInputLayout(Context context, AttributeSet attributeSet) {
        int i;
        AttributeSet attributeSet2;
        super(xk0.O(context, attributeSet, R.attr.textInputStyle, R.style.Widget_Design_TextInputLayout), attributeSet, R.attr.textInputStyle);
        this.s = -1;
        this.t = -1;
        this.u = new ch3(this);
        this.e0 = new Rect();
        this.f0 = new Rect();
        this.g0 = new RectF();
        this.q0 = new LinkedHashSet();
        this.r0 = 0;
        SparseArray sparseArray = new SparseArray();
        this.s0 = sparseArray;
        this.u0 = new LinkedHashSet();
        fv0 fv0Var = new fv0(this);
        this.S0 = fv0Var;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.m = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        addView(frameLayout);
        LinearLayout linearLayout = new LinearLayout(context2);
        this.n = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        frameLayout.addView(linearLayout);
        LinearLayout linearLayout2 = new LinearLayout(context2);
        this.f45o = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        frameLayout.addView(linearLayout2);
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.p = frameLayout2;
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        LinearInterpolator linearInterpolator = lo.a;
        fv0Var.N = linearInterpolator;
        fv0Var.i(false);
        fv0Var.M = linearInterpolator;
        fv0Var.i(false);
        fv0Var.l(8388659);
        ep3 ep3VarF = xk0.F(context2, attributeSet, hz5.G, R.attr.textInputStyle, R.style.Widget_Design_TextInputLayout, 20, 18, 33, 38, 42);
        TypedArray typedArray = (TypedArray) ep3VarF.f733o;
        this.M = typedArray.getBoolean(41, true);
        setHint(typedArray.getText(4));
        this.U0 = typedArray.getBoolean(40, true);
        this.T0 = typedArray.getBoolean(35, true);
        if (typedArray.hasValue(3)) {
            setMinWidth(typedArray.getDimensionPixelSize(3, -1));
        }
        if (typedArray.hasValue(2)) {
            setMaxWidth(typedArray.getDimensionPixelSize(2, -1));
        }
        qw6 qw6VarA = qw6.b(context2, attributeSet, R.attr.textInputStyle, R.style.Widget_Design_TextInputLayout).a();
        this.R = qw6VarA;
        this.S = context2.getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.V = typedArray.getDimensionPixelOffset(7, 0);
        this.a0 = typedArray.getDimensionPixelSize(14, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_default));
        this.b0 = typedArray.getDimensionPixelSize(15, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.W = this.a0;
        float dimension = typedArray.getDimension(11, -1.0f);
        float dimension2 = typedArray.getDimension(10, -1.0f);
        float dimension3 = typedArray.getDimension(8, -1.0f);
        float dimension4 = typedArray.getDimension(9, -1.0f);
        y85 y85VarE = qw6VarA.e();
        if (dimension >= 0.0f) {
            y85VarE.e = new n(dimension);
        }
        if (dimension2 >= r14) {
            y85VarE.f = new n(dimension2);
        }
        if (dimension3 >= r14) {
            y85VarE.g = new n(dimension3);
        }
        if (dimension4 >= 0) {
            y85VarE.h = new n(dimension4);
        }
        this.R = y85VarE.a();
        ColorStateList colorStateListP = xo1.P(context2, ep3VarF, 5);
        if (colorStateListP != null) {
            int defaultColor = colorStateListP.getDefaultColor();
            this.M0 = defaultColor;
            this.d0 = defaultColor;
            if (colorStateListP.isStateful()) {
                this.N0 = colorStateListP.getColorForState(new int[]{-16842910}, -1);
                this.O0 = colorStateListP.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
                this.P0 = colorStateListP.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
            } else {
                this.O0 = this.M0;
                ColorStateList colorStateListM = hm3.m(context2, R.color.mtrl_filled_background_color);
                this.N0 = colorStateListM.getColorForState(new int[]{-16842910}, -1);
                this.P0 = colorStateListM.getColorForState(new int[]{android.R.attr.state_hovered}, -1);
            }
            i = 0;
        } else {
            i = 0;
            this.d0 = 0;
            this.M0 = 0;
            this.N0 = 0;
            this.O0 = 0;
            this.P0 = 0;
        }
        if (typedArray.hasValue(1)) {
            ColorStateList colorStateListI = ep3VarF.i(1);
            this.H0 = colorStateListI;
            this.G0 = colorStateListI;
        }
        ColorStateList colorStateListP2 = xo1.P(context2, ep3VarF, 12);
        this.K0 = typedArray.getColor(12, i);
        this.I0 = context2.getColor(R.color.mtrl_textinput_default_box_stroke_color);
        this.Q0 = context2.getColor(R.color.mtrl_textinput_disabled_color);
        this.J0 = context2.getColor(R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListP2 != null) {
            setBoxStrokeColorStateList(colorStateListP2);
        }
        if (typedArray.hasValue(13)) {
            setBoxStrokeErrorColor(xo1.P(context2, ep3VarF, 13));
        }
        if (typedArray.getResourceId(42, -1) != -1) {
            setHintTextAppearance(typedArray.getResourceId(42, 0));
        }
        int resourceId = typedArray.getResourceId(33, 0);
        CharSequence text = typedArray.getText(28);
        boolean z = typedArray.getBoolean(29, false);
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_end_icon, (ViewGroup) linearLayout2, false);
        this.E0 = checkableImageButton;
        checkableImageButton.setId(R.id.text_input_error_icon);
        checkableImageButton.setVisibility(8);
        if (xo1.R(context2)) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        if (typedArray.hasValue(30)) {
            setErrorIconDrawable(ep3VarF.l(30));
        }
        if (typedArray.hasValue(31)) {
            setErrorIconTintList(xo1.P(context2, ep3VarF, 31));
        }
        if (typedArray.hasValue(32)) {
            setErrorIconTintMode(x67.s(typedArray.getInt(32, -1), null));
        }
        checkableImageButton.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = be8.a;
        checkableImageButton.setImportantForAccessibility(2);
        checkableImageButton.setClickable(false);
        checkableImageButton.setPressable(false);
        checkableImageButton.setFocusable(false);
        int resourceId2 = typedArray.getResourceId(38, 0);
        boolean z2 = typedArray.getBoolean(37, false);
        CharSequence text2 = typedArray.getText(36);
        int resourceId3 = typedArray.getResourceId(50, 0);
        CharSequence text3 = typedArray.getText(49);
        int resourceId4 = typedArray.getResourceId(53, 0);
        CharSequence text4 = typedArray.getText(52);
        int resourceId5 = typedArray.getResourceId(63, 0);
        CharSequence text5 = typedArray.getText(62);
        boolean z3 = typedArray.getBoolean(16, false);
        setCounterMaxLength(typedArray.getInt(17, -1));
        this.A = typedArray.getResourceId(20, 0);
        this.z = typedArray.getResourceId(18, 0);
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) linearLayout, false);
        this.i0 = checkableImageButton2;
        checkableImageButton2.setVisibility(8);
        if (xo1.R(context2)) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton2.getLayoutParams()).setMarginEnd(0);
        }
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        if (typedArray.hasValue(59)) {
            setStartIconDrawable(ep3VarF.l(59));
            if (typedArray.hasValue(58)) {
                setStartIconContentDescription(typedArray.getText(58));
            }
            setStartIconCheckable(typedArray.getBoolean(57, true));
        }
        if (typedArray.hasValue(60)) {
            setStartIconTintList(xo1.P(context2, ep3VarF, 60));
        }
        if (typedArray.hasValue(61)) {
            setStartIconTintMode(x67.s(typedArray.getInt(61, -1), null));
        }
        byte b = 0;
        setBoxBackgroundMode(typedArray.getInt(6, 0));
        CheckableImageButton checkableImageButton3 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_end_icon, (ViewGroup) frameLayout2, false);
        this.t0 = checkableImageButton3;
        frameLayout2.addView(checkableImageButton3);
        checkableImageButton3.setVisibility(8);
        if (xo1.R(context2)) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton3.getLayoutParams()).setMarginStart(0);
        }
        sparseArray.append(-1, new xf1(this, b));
        sparseArray.append(0, new xf1(this, (byte) 1));
        sparseArray.append(1, new ug5(this));
        sparseArray.append(2, new it0(this));
        sparseArray.append(3, new z62(this));
        if (typedArray.hasValue(25)) {
            setEndIconMode(typedArray.getInt(25, 0));
            if (typedArray.hasValue(24)) {
                setEndIconDrawable(ep3VarF.l(24));
            }
            if (typedArray.hasValue(23)) {
                setEndIconContentDescription(typedArray.getText(23));
            }
            setEndIconCheckable(typedArray.getBoolean(22, true));
        } else if (typedArray.hasValue(46)) {
            setEndIconMode(typedArray.getBoolean(46, false) ? 1 : 0);
            setEndIconDrawable(ep3VarF.l(45));
            setEndIconContentDescription(typedArray.getText(44));
            if (typedArray.hasValue(47)) {
                setEndIconTintList(xo1.P(context2, ep3VarF, 47));
            }
            if (typedArray.hasValue(48)) {
                setEndIconTintMode(x67.s(typedArray.getInt(48, -1), null));
            }
        }
        if (typedArray.hasValue(46)) {
            attributeSet2 = null;
        } else {
            if (typedArray.hasValue(26)) {
                setEndIconTintList(xo1.P(context2, ep3VarF, 26));
            }
            if (typedArray.hasValue(27)) {
                attributeSet2 = null;
                setEndIconTintMode(x67.s(typedArray.getInt(27, -1), null));
            } else {
                attributeSet2 = null;
            }
        }
        yt ytVar = new yt(context2, attributeSet2);
        this.J = ytVar;
        ytVar.setId(R.id.textinput_prefix_text);
        ytVar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        ytVar.setAccessibilityLiveRegion(1);
        linearLayout.addView(checkableImageButton2);
        linearLayout.addView(ytVar);
        yt ytVar2 = new yt(context2, attributeSet2);
        this.L = ytVar2;
        ytVar2.setId(R.id.textinput_suffix_text);
        ytVar2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 80));
        ytVar2.setAccessibilityLiveRegion(1);
        linearLayout2.addView(ytVar2);
        linearLayout2.addView(checkableImageButton);
        linearLayout2.addView(frameLayout2);
        setHelperTextEnabled(z2);
        setHelperText(text2);
        setHelperTextTextAppearance(resourceId2);
        setErrorEnabled(z);
        setErrorTextAppearance(resourceId);
        setErrorContentDescription(text);
        setCounterTextAppearance(this.A);
        setCounterOverflowTextAppearance(this.z);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        setPrefixText(text4);
        setPrefixTextAppearance(resourceId4);
        setSuffixText(text5);
        setSuffixTextAppearance(resourceId5);
        if (typedArray.hasValue(34)) {
            setErrorTextColor(ep3VarF.i(34));
        }
        if (typedArray.hasValue(39)) {
            setHelperTextColor(ep3VarF.i(39));
        }
        if (typedArray.hasValue(43)) {
            setHintTextColor(ep3VarF.i(43));
        }
        if (typedArray.hasValue(21)) {
            setCounterTextColor(ep3VarF.i(21));
        }
        if (typedArray.hasValue(19)) {
            setCounterOverflowTextColor(ep3VarF.i(19));
        }
        if (typedArray.hasValue(51)) {
            setPlaceholderTextColor(ep3VarF.i(51));
        }
        if (typedArray.hasValue(54)) {
            setPrefixTextColor(ep3VarF.i(54));
        }
        if (typedArray.hasValue(64)) {
            setSuffixTextColor(ep3VarF.i(64));
        }
        setCounterEnabled(z3);
        setEnabled(typedArray.getBoolean(0, true));
        ep3VarF.B();
        setImportantForAccessibility(2);
        vd8.b(this, 1);
    }

    public static void d(CheckableImageButton checkableImageButton, boolean z, ColorStateList colorStateList, boolean z2, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = drawable.mutate();
            if (z) {
                drawable.setTintList(colorStateList);
            }
            if (z2) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    private za2 getEndIconDelegate() {
        int i = this.r0;
        SparseArray sparseArray = this.s0;
        za2 za2Var = (za2) sparseArray.get(i);
        return za2Var != null ? za2Var : (za2) sparseArray.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        CheckableImageButton checkableImageButton = this.E0;
        if (checkableImageButton.getVisibility() == 0) {
            return checkableImageButton;
        }
        if (this.r0 == 0 || !g()) {
            return null;
        }
        return this.t0;
    }

    public static void j(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                j((ViewGroup) childAt, z);
            }
        }
    }

    public static void l(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = be8.a;
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z = onLongClickListener != null;
        boolean z2 = zHasOnClickListeners || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        checkableImageButton.setLongClickable(z);
        checkableImageButton.setImportantForAccessibility(z2 ? 1 : 2);
    }

    private void setEditText(EditText editText) {
        boolean z;
        boolean z2;
        if (this.q != null) {
            hk0.g("We already have an EditText, can only have one");
            return;
        }
        if (this.r0 != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.q = editText;
        setMinWidth(this.s);
        setMaxWidth(this.t);
        h();
        setTextInputAccessibilityDelegate(new hs7(this));
        Typeface typeface = this.q.getTypeface();
        fv0 fv0Var = this.S0;
        el0 el0Var = fv0Var.A;
        if (el0Var != null) {
            el0Var.c = true;
        }
        if (fv0Var.w != typeface) {
            fv0Var.w = typeface;
            z = true;
        } else {
            z = false;
        }
        el0 el0Var2 = fv0Var.z;
        if (el0Var2 != null) {
            el0Var2.c = true;
        }
        if (fv0Var.x != typeface) {
            fv0Var.x = typeface;
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || z2) {
            fv0Var.i(false);
        }
        float textSize = this.q.getTextSize();
        if (fv0Var.m != textSize) {
            fv0Var.m = textSize;
            fv0Var.i(false);
        }
        int gravity = this.q.getGravity();
        fv0Var.l((gravity & (-113)) | 48);
        if (fv0Var.k != gravity) {
            fv0Var.k = gravity;
            fv0Var.i(false);
        }
        this.q.addTextChangedListener(new hc0(this, (byte) 9));
        if (this.G0 == null) {
            this.G0 = this.q.getHintTextColors();
        }
        if (this.M) {
            if (TextUtils.isEmpty(this.N)) {
                CharSequence hint = this.q.getHint();
                this.r = hint;
                setHint(hint);
                this.q.setHint((CharSequence) null);
            }
            this.O = true;
        }
        if (this.y != null) {
            n(this.q.getText().length());
        }
        q();
        this.u.b();
        this.n.bringToFront();
        this.f45o.bringToFront();
        this.p.bringToFront();
        this.E0.bringToFront();
        Iterator it = this.q0.iterator();
        while (it.hasNext()) {
            ((et0) it.next()).a(this);
        }
        u();
        x();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        s(false, true);
    }

    private void setErrorIconVisible(boolean z) {
        this.E0.setVisibility(z ? 0 : 8);
        this.p.setVisibility(z ? 8 : 0);
        x();
        if (this.r0 != 0) {
            return;
        }
        p();
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.N)) {
            return;
        }
        this.N = charSequence;
        fv0 fv0Var = this.S0;
        if (charSequence == null || !TextUtils.equals(fv0Var.B, charSequence)) {
            fv0Var.B = charSequence;
            fv0Var.C = null;
            Bitmap bitmap = fv0Var.F;
            if (bitmap != null) {
                bitmap.recycle();
                fv0Var.F = null;
            }
            fv0Var.i(false);
        }
        if (this.R0) {
            return;
        }
        i();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.C == z) {
            return;
        }
        if (z) {
            yt ytVar = new yt(getContext(), null);
            this.D = ytVar;
            ytVar.setId(R.id.textinput_placeholder);
            yt ytVar2 = this.D;
            WeakHashMap weakHashMap = be8.a;
            ytVar2.setAccessibilityLiveRegion(1);
            setPlaceholderTextAppearance(this.F);
            setPlaceholderTextColor(this.E);
            yt ytVar3 = this.D;
            if (ytVar3 != null) {
                this.m.addView(ytVar3);
                this.D.setVisibility(0);
            }
        } else {
            yt ytVar4 = this.D;
            if (ytVar4 != null) {
                ytVar4.setVisibility(8);
            }
            this.D = null;
        }
        this.C = z;
    }

    public final void a(float f) {
        fv0 fv0Var = this.S0;
        if (fv0Var.c == f) {
            return;
        }
        if (this.V0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.V0 = valueAnimator;
            valueAnimator.setInterpolator(lo.b);
            this.V0.setDuration(167L);
            this.V0.addUpdateListener(new rr(this, (byte) 8));
        }
        this.V0.setFloatValues(fv0Var.c, f);
        this.V0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.m;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        r();
        setEditText((EditText) view);
    }

    public final void b() {
        int i;
        int i2;
        int i3;
        qn4 qn4Var = this.P;
        if (qn4Var == null) {
            return;
        }
        qn4Var.setShapeAppearanceModel(this.R);
        if (this.U == 2 && (i2 = this.W) > -1 && (i3 = this.c0) != 0) {
            qn4 qn4Var2 = this.P;
            qn4Var2.m.j = i2;
            qn4Var2.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i3);
            pn4 pn4Var = qn4Var2.m;
            if (pn4Var.d != colorStateListValueOf) {
                pn4Var.d = colorStateListValueOf;
                qn4Var2.onStateChange(qn4Var2.getState());
            }
        }
        int iB = this.d0;
        if (this.U == 1) {
            TypedValue typedValueB0 = io1.b0(getContext(), R.attr.colorSurface);
            iB = hw0.b(this.d0, typedValueB0 != null ? typedValueB0.data : 0);
        }
        this.d0 = iB;
        this.P.l(ColorStateList.valueOf(iB));
        if (this.r0 == 3) {
            this.q.getBackground().invalidateSelf();
        }
        qn4 qn4Var3 = this.Q;
        if (qn4Var3 != null) {
            if (this.W > -1 && (i = this.c0) != 0) {
                qn4Var3.l(ColorStateList.valueOf(i));
            }
            invalidate();
        }
        invalidate();
    }

    public final void c() {
        d(this.t0, this.w0, this.v0, this.y0, this.x0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.q;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.r != null) {
            boolean z = this.O;
            this.O = false;
            CharSequence hint = editText.getHint();
            this.q.setHint(this.r);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.q.setHint(hint);
                this.O = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.m;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.q) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.X0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.X0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.M) {
            this.S0.e(canvas);
        }
        qn4 qn4Var = this.Q;
        if (qn4Var != null) {
            Rect bounds = qn4Var.getBounds();
            bounds.top = bounds.bottom - this.W;
            this.Q.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z;
        ColorStateList colorStateList;
        if (this.W0) {
            return;
        }
        this.W0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        fv0 fv0Var = this.S0;
        if (fv0Var != null) {
            fv0Var.I = drawableState;
            ColorStateList colorStateList2 = fv0Var.p;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = fv0Var.f831o) == null || !colorStateList.isStateful())) {
                z = false;
            } else {
                fv0Var.i(false);
                z = true;
            }
        } else {
            z = false;
        }
        if (this.q != null) {
            WeakHashMap weakHashMap = be8.a;
            s(isLaidOut() && isEnabled(), false);
        }
        q();
        z();
        if (z) {
            invalidate();
        }
        this.W0 = false;
    }

    public final int e() {
        float f;
        if (!this.M) {
            return 0;
        }
        int i = this.U;
        fv0 fv0Var = this.S0;
        if (i == 0 || i == 1) {
            TextPaint textPaint = fv0Var.L;
            textPaint.setTextSize(fv0Var.n);
            textPaint.setTypeface(fv0Var.w);
            textPaint.setLetterSpacing(fv0Var.W);
            f = -textPaint.ascent();
        } else {
            if (i != 2) {
                return 0;
            }
            TextPaint textPaint2 = fv0Var.L;
            textPaint2.setTextSize(fv0Var.n);
            textPaint2.setTypeface(fv0Var.w);
            textPaint2.setLetterSpacing(fv0Var.W);
            f = (-textPaint2.ascent()) / 2.0f;
        }
        return (int) f;
    }

    public final boolean f() {
        return this.M && !TextUtils.isEmpty(this.N) && (this.P instanceof cg1);
    }

    public final boolean g() {
        return this.p.getVisibility() == 0 && this.t0.getVisibility() == 0;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.q;
        if (editText == null) {
            return super.getBaseline();
        }
        return e() + getPaddingTop() + editText.getBaseline();
    }

    public qn4 getBoxBackground() {
        int i = this.U;
        if (i == 1 || i == 2) {
            return this.P;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.d0;
    }

    public int getBoxBackgroundMode() {
        return this.U;
    }

    public float getBoxCornerRadiusBottomEnd() {
        qn4 qn4Var = this.P;
        return qn4Var.m.a.h.a(qn4Var.f());
    }

    public float getBoxCornerRadiusBottomStart() {
        qn4 qn4Var = this.P;
        return qn4Var.m.a.g.a(qn4Var.f());
    }

    public float getBoxCornerRadiusTopEnd() {
        qn4 qn4Var = this.P;
        return qn4Var.m.a.f.a(qn4Var.f());
    }

    public float getBoxCornerRadiusTopStart() {
        return this.P.g();
    }

    public int getBoxStrokeColor() {
        return this.K0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.L0;
    }

    public int getBoxStrokeWidth() {
        return this.a0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.b0;
    }

    public int getCounterMaxLength() {
        return this.w;
    }

    public CharSequence getCounterOverflowDescription() {
        yt ytVar;
        if (this.v && this.x && (ytVar = this.y) != null) {
            return ytVar.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.G;
    }

    public ColorStateList getCounterTextColor() {
        return this.G;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.G0;
    }

    public EditText getEditText() {
        return this.q;
    }

    public CharSequence getEndIconContentDescription() {
        return this.t0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.t0.getDrawable();
    }

    public int getEndIconMode() {
        return this.r0;
    }

    public CheckableImageButton getEndIconView() {
        return this.t0;
    }

    public CharSequence getError() {
        ch3 ch3Var = this.u;
        if (ch3Var.k) {
            return ch3Var.j;
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.u.m;
    }

    public int getErrorCurrentTextColors() {
        yt ytVar = this.u.l;
        if (ytVar != null) {
            return ytVar.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.E0.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        yt ytVar = this.u.l;
        if (ytVar != null) {
            return ytVar.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHelperText() {
        ch3 ch3Var = this.u;
        if (ch3Var.q) {
            return ch3Var.p;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        yt ytVar = this.u.r;
        if (ytVar != null) {
            return ytVar.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.M) {
            return this.N;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        fv0 fv0Var = this.S0;
        TextPaint textPaint = fv0Var.L;
        textPaint.setTextSize(fv0Var.n);
        textPaint.setTypeface(fv0Var.w);
        textPaint.setLetterSpacing(fv0Var.W);
        return -textPaint.ascent();
    }

    public final int getHintCurrentCollapsedTextColor() {
        fv0 fv0Var = this.S0;
        return fv0Var.f(fv0Var.p);
    }

    public ColorStateList getHintTextColor() {
        return this.H0;
    }

    public int getMaxWidth() {
        return this.t;
    }

    public int getMinWidth() {
        return this.s;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.t0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.t0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.C) {
            return this.B;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.F;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.E;
    }

    public CharSequence getPrefixText() {
        return this.I;
    }

    public ColorStateList getPrefixTextColor() {
        return this.J.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.J;
    }

    public CharSequence getStartIconContentDescription() {
        return this.i0.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.i0.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.K;
    }

    public ColorStateList getSuffixTextColor() {
        return this.L.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.L;
    }

    public Typeface getTypeface() {
        return this.h0;
    }

    public final void h() {
        int i = this.U;
        if (i != 0) {
            qw6 qw6Var = this.R;
            if (i == 1) {
                this.P = new qn4(qw6Var);
                this.Q = new qn4();
            } else {
                if (i != 2) {
                    hk0.g(to7.l(new StringBuilder(), this.U, " is illegal; only @BoxBackgroundMode constants are supported."));
                    return;
                }
                if (!this.M || (this.P instanceof cg1)) {
                    this.P = new qn4(qw6Var);
                } else {
                    this.P = new cg1(qw6Var);
                }
                this.Q = null;
            }
        } else {
            this.P = null;
            this.Q = null;
        }
        EditText editText = this.q;
        if (editText != null && this.P != null && editText.getBackground() == null && this.U != 0) {
            EditText editText2 = this.q;
            qn4 qn4Var = this.P;
            WeakHashMap weakHashMap = be8.a;
            editText2.setBackground(qn4Var);
        }
        z();
        if (this.U == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.V = getResources().getDimensionPixelSize(R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (xo1.R(getContext())) {
                this.V = getResources().getDimensionPixelSize(R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.q != null && this.U == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText3 = this.q;
                WeakHashMap weakHashMap2 = be8.a;
                editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_top), this.q.getPaddingEnd(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (xo1.R(getContext())) {
                EditText editText4 = this.q;
                WeakHashMap weakHashMap3 = be8.a;
                editText4.setPaddingRelative(editText4.getPaddingStart(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_top), this.q.getPaddingEnd(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.U != 0) {
            r();
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x008f  */
    public final void i() {
        float f;
        float fB;
        float f2;
        float fB2;
        int i;
        float fB3;
        int i2;
        if (f()) {
            int width = this.q.getWidth();
            int gravity = this.q.getGravity();
            fv0 fv0Var = this.S0;
            boolean zC = fv0Var.c(fv0Var.B);
            fv0Var.D = zC;
            Rect rect = fv0Var.i;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (zC) {
                        i2 = rect.left;
                        f2 = i2;
                    } else {
                        f = rect.right;
                        fB = fv0Var.b();
                    }
                } else if (zC) {
                    f = rect.right;
                    fB = fv0Var.b();
                } else {
                    i2 = rect.left;
                    f2 = i2;
                }
                RectF rectF = this.g0;
                rectF.left = f2;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    fB2 = (width / 2.0f) + (fv0Var.b() / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (fv0Var.D) {
                        fB3 = fv0Var.b();
                        fB2 = fB3 + f2;
                    } else {
                        i = rect.right;
                        fB2 = i;
                    }
                } else if (fv0Var.D) {
                    i = rect.right;
                    fB2 = i;
                } else {
                    fB3 = fv0Var.b();
                    fB2 = fB3 + f2;
                }
                rectF.right = fB2;
                TextPaint textPaint = fv0Var.L;
                textPaint.setTextSize(fv0Var.n);
                textPaint.setTypeface(fv0Var.w);
                textPaint.setLetterSpacing(fv0Var.W);
                textPaint.ascent();
                float f3 = rectF.left;
                float f4 = this.S;
                rectF.left = f3 - f4;
                rectF.right += f4;
                int i3 = this.W;
                this.T = i3;
                rectF.top = 0.0f;
                rectF.bottom = i3;
                rectF.offset(-getPaddingLeft(), 0.0f);
                cg1 cg1Var = (cg1) this.P;
                cg1Var.getClass();
                cg1Var.r(rectF.left, rectF.top, rectF.right, rectF.bottom);
            }
            f = width / 2.0f;
            fB = fv0Var.b() / 2.0f;
            f2 = f - fB;
            RectF rectF2 = this.g0;
            rectF2.left = f2;
            rectF2.top = rect.top;
            if (gravity != 17) {
                fB2 = (width / 2.0f) + (fv0Var.b() / 2.0f);
            } else {
                fB2 = (width / 2.0f) + (fv0Var.b() / 2.0f);
            }
            rectF2.right = fB2;
            TextPaint textPaint2 = fv0Var.L;
            textPaint2.setTextSize(fv0Var.n);
            textPaint2.setTypeface(fv0Var.w);
            textPaint2.setLetterSpacing(fv0Var.W);
            textPaint2.ascent();
            float f5 = rectF2.left;
            float f6 = this.S;
            rectF2.left = f5 - f6;
            rectF2.right += f6;
            int i4 = this.W;
            this.T = i4;
            rectF2.top = 0.0f;
            rectF2.bottom = i4;
            rectF2.offset(-getPaddingLeft(), 0.0f);
            cg1 cg1Var2 = (cg1) this.P;
            cg1Var2.getClass();
            cg1Var2.r(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom);
        }
    }

    public final void k(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    public final void m(yt ytVar, int i) {
        try {
            ytVar.setTextAppearance(i);
            if (ytVar.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        ytVar.setTextAppearance(R.style.TextAppearance_AppCompat_Caption);
        ytVar.setTextColor(getContext().getColor(R.color.design_error));
    }

    public final void n(int i) {
        boolean z = this.x;
        int i2 = this.w;
        if (i2 == -1) {
            this.y.setText(String.valueOf(i));
            this.y.setContentDescription(null);
            this.x = false;
        } else {
            this.x = i > i2;
            Context context = getContext();
            this.y.setContentDescription(context.getString(this.x ? R.string.character_counter_overflowed_content_description : R.string.character_counter_content_description, Integer.valueOf(i), Integer.valueOf(this.w)));
            if (z != this.x) {
                o();
            }
            String str = a60.d;
            a60 a60Var = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? a60.g : a60.f;
            yt ytVar = this.y;
            String string = getContext().getString(R.string.character_counter_pattern, Integer.valueOf(i), Integer.valueOf(this.w));
            ytVar.setText(string != null ? a60Var.c(string, a60Var.c).toString() : null);
        }
        if (this.q == null || z == this.x) {
            return;
        }
        s(false, false);
        z();
        q();
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        yt ytVar = this.y;
        if (ytVar != null) {
            m(ytVar, this.x ? this.z : this.A);
            if (!this.x && (colorStateList2 = this.G) != null) {
                this.y.setTextColor(colorStateList2);
            }
            if (!this.x || (colorStateList = this.H) == null) {
                return;
            }
            this.y.setTextColor(colorStateList);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int compoundPaddingRight;
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.q;
        if (editText != null) {
            Rect rect = this.e0;
            fo1.a(this, editText, rect);
            qn4 qn4Var = this.Q;
            if (qn4Var != null) {
                int i5 = rect.bottom;
                qn4Var.setBounds(rect.left, i5 - this.b0, rect.right, i5);
            }
            if (this.M) {
                float textSize = this.q.getTextSize();
                fv0 fv0Var = this.S0;
                if (fv0Var.m != textSize) {
                    fv0Var.m = textSize;
                    fv0Var.i(false);
                }
                int gravity = this.q.getGravity();
                fv0Var.l((gravity & (-113)) | 48);
                if (fv0Var.k != gravity) {
                    fv0Var.k = gravity;
                    fv0Var.i(false);
                }
                if (this.q == null) {
                    throw new IllegalStateException();
                }
                WeakHashMap weakHashMap = be8.a;
                boolean z2 = getLayoutDirection() == 1;
                int i6 = rect.bottom;
                Rect rect2 = this.f0;
                rect2.bottom = i6;
                int i7 = this.U;
                int i8 = rect.left;
                yt ytVar = this.J;
                if (i7 == 1) {
                    int compoundPaddingLeft = this.q.getCompoundPaddingLeft() + i8;
                    if (this.I != null && !z2) {
                        compoundPaddingLeft = (compoundPaddingLeft - ytVar.getMeasuredWidth()) + ytVar.getPaddingLeft();
                    }
                    rect2.left = compoundPaddingLeft;
                    rect2.top = rect.top + this.V;
                    compoundPaddingRight = rect.right - this.q.getCompoundPaddingRight();
                    if (this.I != null && z2) {
                        compoundPaddingRight = (ytVar.getMeasuredWidth() - ytVar.getPaddingRight()) + compoundPaddingRight;
                    }
                    rect2.right = compoundPaddingRight;
                } else if (i7 != 2) {
                    int compoundPaddingLeft2 = this.q.getCompoundPaddingLeft() + i8;
                    if (this.I != null && !z2) {
                        compoundPaddingLeft2 = (compoundPaddingLeft2 - ytVar.getMeasuredWidth()) + ytVar.getPaddingLeft();
                    }
                    rect2.left = compoundPaddingLeft2;
                    rect2.top = getPaddingTop();
                    compoundPaddingRight = rect.right - this.q.getCompoundPaddingRight();
                    if (this.I != null && z2) {
                        compoundPaddingRight += ytVar.getMeasuredWidth() - ytVar.getPaddingRight();
                    }
                    rect2.right = compoundPaddingRight;
                } else {
                    rect2.left = this.q.getPaddingLeft() + i8;
                    rect2.top = rect.top - e();
                    compoundPaddingRight = rect.right - this.q.getPaddingRight();
                    rect2.right = compoundPaddingRight;
                }
                int i9 = rect2.left;
                int i10 = rect2.top;
                int i11 = rect2.bottom;
                Rect rect3 = fv0Var.i;
                if (rect3.left != i9 || rect3.top != i10 || rect3.right != compoundPaddingRight || rect3.bottom != i11) {
                    rect3.set(i9, i10, compoundPaddingRight, i11);
                    fv0Var.J = true;
                    fv0Var.h();
                }
                if (this.q == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = fv0Var.L;
                textPaint.setTextSize(fv0Var.m);
                textPaint.setTypeface(fv0Var.x);
                textPaint.setLetterSpacing(fv0Var.X);
                float f = -textPaint.ascent();
                rect2.left = this.q.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.U != 1 || this.q.getMinLines() > 1) ? rect.top + this.q.getCompoundPaddingTop() : (int) (rect.centerY() - (f / 2.0f));
                rect2.right = rect.right - this.q.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.U != 1 || this.q.getMinLines() > 1) ? rect.bottom - this.q.getCompoundPaddingBottom() : (int) (rect2.top + f);
                rect2.bottom = compoundPaddingBottom;
                int i12 = rect2.left;
                int i13 = rect2.top;
                int i14 = rect2.right;
                Rect rect4 = fv0Var.h;
                if (rect4.left != i12 || rect4.top != i13 || rect4.right != i14 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i12, i13, i14, compoundPaddingBottom);
                    fv0Var.J = true;
                    fv0Var.h();
                }
                fv0Var.i(false);
                if (!f() || this.R0) {
                    return;
                }
                i();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        EditText editText;
        int iMax;
        super.onMeasure(i, i2);
        byte b = 1;
        boolean z = false;
        if (this.q != null && this.q.getMeasuredHeight() < (iMax = Math.max(this.f45o.getMeasuredHeight(), this.n.getMeasuredHeight()))) {
            this.q.setMinimumHeight(iMax);
            z = true;
        }
        boolean zP = p();
        if (z || zP) {
            this.q.post(new gs7(this, b));
        }
        if (this.D != null && (editText = this.q) != null) {
            this.D.setGravity(editText.getGravity());
            this.D.setPadding(this.q.getCompoundPaddingLeft(), this.q.getCompoundPaddingTop(), this.q.getCompoundPaddingRight(), this.q.getCompoundPaddingBottom());
        }
        u();
        x();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof is7)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        is7 is7Var = (is7) parcelable;
        super.onRestoreInstanceState(is7Var.m);
        setError(is7Var.f1097o);
        if (is7Var.p) {
            this.t0.post(new gs7(this, (byte) 0));
        }
        setHint(is7Var.q);
        setHelperText(is7Var.r);
        setPlaceholderText(is7Var.s);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        is7 is7Var = new is7(super.onSaveInstanceState());
        if (this.u.e()) {
            is7Var.f1097o = getError();
        }
        is7Var.p = this.r0 != 0 && this.t0.p;
        is7Var.q = getHint();
        is7Var.r = getHelperText();
        is7Var.s = getPlaceholderText();
        return is7Var;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0053  */
    /* JADX WARN: Code duplicated, block: B:21:0x0057  */
    /* JADX WARN: Code duplicated, block: B:23:0x006c  */
    public final boolean p() {
        boolean z;
        if (this.q == null) {
            return false;
        }
        boolean z2 = true;
        if (getStartIconDrawable() != null || this.I != null) {
            LinearLayout linearLayout = this.n;
            if (linearLayout.getMeasuredWidth() > 0) {
                int measuredWidth = linearLayout.getMeasuredWidth() - this.q.getPaddingLeft();
                if (this.n0 == null || this.o0 != measuredWidth) {
                    ColorDrawable colorDrawable = new ColorDrawable();
                    this.n0 = colorDrawable;
                    this.o0 = measuredWidth;
                    colorDrawable.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative = this.q.getCompoundDrawablesRelative();
                Drawable drawable = compoundDrawablesRelative[0];
                ColorDrawable colorDrawable2 = this.n0;
                if (drawable != colorDrawable2) {
                    this.q.setCompoundDrawablesRelative(colorDrawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                    z = true;
                } else {
                    z = false;
                }
            } else if (this.n0 != null) {
                Drawable[] compoundDrawablesRelative2 = this.q.getCompoundDrawablesRelative();
                this.q.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.n0 = null;
                z = true;
            } else {
                z = false;
            }
        } else if (this.n0 != null) {
            Drawable[] compoundDrawablesRelative3 = this.q.getCompoundDrawablesRelative();
            this.q.setCompoundDrawablesRelative(null, compoundDrawablesRelative3[1], compoundDrawablesRelative3[2], compoundDrawablesRelative3[3]);
            this.n0 = null;
            z = true;
        } else {
            z = false;
        }
        if ((this.E0.getVisibility() == 0 || ((this.r0 != 0 && g()) || this.K != null)) && this.f45o.getMeasuredWidth() > 0) {
            int measuredWidth2 = this.L.getMeasuredWidth() - this.q.getPaddingRight();
            CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
            if (endIconToUpdateDummyDrawable != null) {
                measuredWidth2 = ((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams()).getMarginStart() + endIconToUpdateDummyDrawable.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] compoundDrawablesRelative4 = this.q.getCompoundDrawablesRelative();
            ColorDrawable colorDrawable3 = this.z0;
            if (colorDrawable3 != null && this.A0 != measuredWidth2) {
                this.A0 = measuredWidth2;
                colorDrawable3.setBounds(0, 0, measuredWidth2, 1);
                this.q.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.z0, compoundDrawablesRelative4[3]);
                return true;
            }
            if (colorDrawable3 == null) {
                ColorDrawable colorDrawable4 = new ColorDrawable();
                this.z0 = colorDrawable4;
                this.A0 = measuredWidth2;
                colorDrawable4.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable2 = compoundDrawablesRelative4[2];
            ColorDrawable colorDrawable5 = this.z0;
            if (drawable2 != colorDrawable5) {
                this.B0 = drawable2;
                this.q.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], colorDrawable5, compoundDrawablesRelative4[3]);
                return true;
            }
        } else if (this.z0 != null) {
            Drawable[] compoundDrawablesRelative5 = this.q.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative5[2] == this.z0) {
                this.q.setCompoundDrawablesRelative(compoundDrawablesRelative5[0], compoundDrawablesRelative5[1], this.B0, compoundDrawablesRelative5[3]);
            } else {
                z2 = z;
            }
            this.z0 = null;
            return z2;
        }
        return z;
    }

    public final void q() {
        Drawable background;
        yt ytVar;
        EditText editText = this.q;
        if (editText == null || this.U != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = h62.a;
        Drawable drawableMutate = background.mutate();
        ch3 ch3Var = this.u;
        if (ch3Var.e()) {
            yt ytVar2 = ch3Var.l;
            drawableMutate.setColorFilter(us.c(ytVar2 != null ? ytVar2.getCurrentTextColor() : -1, PorterDuff.Mode.SRC_IN));
        } else if (this.x && (ytVar = this.y) != null) {
            drawableMutate.setColorFilter(us.c(ytVar.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.q.refreshDrawableState();
        }
    }

    public final void r() {
        if (this.U != 1) {
            FrameLayout frameLayout = this.m;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iE = e();
            if (iE != layoutParams.topMargin) {
                layoutParams.topMargin = iE;
                frameLayout.requestLayout();
            }
        }
    }

    public final void s(boolean z, boolean z2) {
        ColorStateList colorStateList;
        yt ytVar;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.q;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.q;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ch3 ch3Var = this.u;
        boolean zE = ch3Var.e();
        ColorStateList colorStateList2 = this.G0;
        fv0 fv0Var = this.S0;
        if (colorStateList2 != null) {
            fv0Var.k(colorStateList2);
            ColorStateList colorStateList3 = this.G0;
            if (fv0Var.f831o != colorStateList3) {
                fv0Var.f831o = colorStateList3;
                fv0Var.i(false);
            }
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList4 = this.G0;
            int colorForState = this.Q0;
            if (colorStateList4 != null) {
                colorForState = colorStateList4.getColorForState(new int[]{-16842910}, colorForState);
            }
            fv0Var.k(ColorStateList.valueOf(colorForState));
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(colorForState);
            if (fv0Var.f831o != colorStateListValueOf) {
                fv0Var.f831o = colorStateListValueOf;
                fv0Var.i(false);
            }
        } else if (zE) {
            yt ytVar2 = ch3Var.l;
            fv0Var.k(ytVar2 != null ? ytVar2.getTextColors() : null);
        } else if (this.x && (ytVar = this.y) != null) {
            fv0Var.k(ytVar.getTextColors());
        } else if (z4 && (colorStateList = this.H0) != null) {
            fv0Var.k(colorStateList);
        }
        if (z3 || !this.T0 || (isEnabled() && z4)) {
            if (z2 || this.R0) {
                ValueAnimator valueAnimator = this.V0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.V0.cancel();
                }
                if (z && this.U0) {
                    a(1.0f);
                } else {
                    fv0Var.n(1.0f);
                }
                this.R0 = false;
                if (f()) {
                    i();
                }
                EditText editText3 = this.q;
                t(editText3 != null ? editText3.getText().length() : 0);
                v();
                y();
                return;
            }
            return;
        }
        if (z2 || !this.R0) {
            ValueAnimator valueAnimator2 = this.V0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.V0.cancel();
            }
            if (z && this.U0) {
                a(0.0f);
            } else {
                fv0Var.n(0.0f);
            }
            if (f() && !((cg1) this.P).K.isEmpty() && f()) {
                ((cg1) this.P).r(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.R0 = true;
            yt ytVar3 = this.D;
            if (ytVar3 != null && this.C) {
                ytVar3.setText((CharSequence) null);
                this.D.setVisibility(4);
            }
            v();
            y();
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.d0 != i) {
            this.d0 = i;
            this.M0 = i;
            this.O0 = i;
            this.P0 = i;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(getContext().getColor(i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.M0 = defaultColor;
        this.d0 = defaultColor;
        this.N0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.O0 = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
        this.P0 = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.U) {
            return;
        }
        this.U = i;
        if (this.q != null) {
            h();
        }
    }

    public void setBoxStrokeColor(int i) {
        if (this.K0 != i) {
            this.K0 = i;
            z();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.I0 = colorStateList.getDefaultColor();
            this.Q0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.J0 = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
            this.K0 = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
        } else if (this.K0 != colorStateList.getDefaultColor()) {
            this.K0 = colorStateList.getDefaultColor();
        }
        z();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.L0 != colorStateList) {
            this.L0 = colorStateList;
            z();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.a0 = i;
        z();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.b0 = i;
        z();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.v != z) {
            ch3 ch3Var = this.u;
            if (z) {
                yt ytVar = new yt(getContext(), null);
                this.y = ytVar;
                ytVar.setId(R.id.textinput_counter);
                Typeface typeface = this.h0;
                if (typeface != null) {
                    this.y.setTypeface(typeface);
                }
                this.y.setMaxLines(1);
                ch3Var.a(this.y, 2);
                ((ViewGroup.MarginLayoutParams) this.y.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.y != null) {
                    EditText editText = this.q;
                    n(editText == null ? 0 : editText.getText().length());
                }
            } else {
                ch3Var.h(this.y, 2);
                this.y = null;
            }
            this.v = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.w != i) {
            if (i > 0) {
                this.w = i;
            } else {
                this.w = -1;
            }
            if (!this.v || this.y == null) {
                return;
            }
            EditText editText = this.q;
            n(editText == null ? 0 : editText.getText().length());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.z != i) {
            this.z = i;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.H != colorStateList) {
            this.H = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.A != i) {
            this.A = i;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.G != colorStateList) {
            this.G = colorStateList;
            o();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.G0 = colorStateList;
        this.H0 = colorStateList;
        if (this.q != null) {
            s(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        j(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.t0.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.t0.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? uf0.p(getContext(), i) : null);
    }

    public void setEndIconMode(int i) {
        int i2 = this.r0;
        this.r0 = i;
        Iterator it = this.u0.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                setEndIconVisible(i != 0);
                if (getEndIconDelegate().b(this.U)) {
                    getEndIconDelegate().a();
                    c();
                    return;
                }
                throw new IllegalStateException("The current box background mode " + this.U + " is not supported by the end icon mode " + i);
            }
            ft0 ft0Var = (ft0) it.next();
            switch (ft0Var.a) {
                case 0:
                    EditText editText = getEditText();
                    if (editText != null && i2 == 2) {
                        editText.post(new it8((byte) 9, ft0Var, editText, z));
                        if (editText.getOnFocusChangeListener() == ((it0) ft0Var.b).e) {
                            editText.setOnFocusChangeListener(null);
                        }
                    }
                    break;
                case 1:
                    AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) getEditText();
                    if (autoCompleteTextView != null && i2 == 3) {
                        autoCompleteTextView.post(new it8((byte) 12, ft0Var, autoCompleteTextView, z));
                        if (autoCompleteTextView.getOnFocusChangeListener() == ((z62) ft0Var.b).e) {
                            autoCompleteTextView.setOnFocusChangeListener(null);
                        }
                        autoCompleteTextView.setOnTouchListener(null);
                        autoCompleteTextView.setOnDismissListener(null);
                    }
                    break;
                default:
                    EditText editText2 = getEditText();
                    if (editText2 != null && i2 == 1) {
                        editText2.setTransformationMethod(PasswordTransformationMethod.getInstance());
                        editText2.post(new it8((byte) 15, ft0Var, editText2, z));
                    }
                    break;
            }
        }
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        View.OnLongClickListener onLongClickListener = this.C0;
        CheckableImageButton checkableImageButton = this.t0;
        checkableImageButton.setOnClickListener(onClickListener);
        l(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.C0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.t0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        l(checkableImageButton, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.v0 != colorStateList) {
            this.v0 = colorStateList;
            this.w0 = true;
            c();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.x0 != mode) {
            this.x0 = mode;
            this.y0 = true;
            c();
        }
    }

    public void setEndIconVisible(boolean z) {
        if (g() != z) {
            this.t0.setVisibility(z ? 0 : 8);
            x();
            p();
        }
    }

    public void setError(CharSequence charSequence) {
        ch3 ch3Var = this.u;
        if (!ch3Var.k) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            ch3Var.g();
            return;
        }
        ch3Var.c();
        ch3Var.j = charSequence;
        ch3Var.l.setText(charSequence);
        byte b = ch3Var.h;
        if (b != 1) {
            ch3Var.i = (byte) 1;
        }
        ch3Var.j(b, ch3Var.i, ch3Var.i(ch3Var.l, charSequence));
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        ch3 ch3Var = this.u;
        ch3Var.m = charSequence;
        yt ytVar = ch3Var.l;
        if (ytVar != null) {
            ytVar.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        ch3 ch3Var = this.u;
        TextInputLayout textInputLayout = ch3Var.b;
        if (ch3Var.k == z) {
            return;
        }
        ch3Var.c();
        if (z) {
            yt ytVar = new yt(ch3Var.a, null);
            ch3Var.l = ytVar;
            ytVar.setId(R.id.textinput_error);
            ch3Var.l.setTextAlignment(5);
            Typeface typeface = ch3Var.u;
            if (typeface != null) {
                ch3Var.l.setTypeface(typeface);
            }
            int i = ch3Var.n;
            ch3Var.n = i;
            yt ytVar2 = ch3Var.l;
            if (ytVar2 != null) {
                ch3Var.b.m(ytVar2, i);
            }
            ColorStateList colorStateList = ch3Var.f526o;
            ch3Var.f526o = colorStateList;
            yt ytVar3 = ch3Var.l;
            if (ytVar3 != null && colorStateList != null) {
                ytVar3.setTextColor(colorStateList);
            }
            CharSequence charSequence = ch3Var.m;
            ch3Var.m = charSequence;
            yt ytVar4 = ch3Var.l;
            if (ytVar4 != null) {
                ytVar4.setContentDescription(charSequence);
            }
            ch3Var.l.setVisibility(4);
            yt ytVar5 = ch3Var.l;
            WeakHashMap weakHashMap = be8.a;
            ytVar5.setAccessibilityLiveRegion(1);
            ch3Var.a(ch3Var.l, 0);
        } else {
            ch3Var.g();
            ch3Var.h(ch3Var.l, 0);
            ch3Var.l = null;
            textInputLayout.q();
            textInputLayout.z();
        }
        ch3Var.k = z;
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? uf0.p(getContext(), i) : null);
        k(this.E0, this.F0);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        View.OnLongClickListener onLongClickListener = this.D0;
        CheckableImageButton checkableImageButton = this.E0;
        checkableImageButton.setOnClickListener(onClickListener);
        l(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.D0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.E0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        l(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.F0 = colorStateList;
        CheckableImageButton checkableImageButton = this.E0;
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            drawable.setTintList(colorStateList);
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        CheckableImageButton checkableImageButton = this.E0;
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            drawable.setTintMode(mode);
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i) {
        ch3 ch3Var = this.u;
        ch3Var.n = i;
        yt ytVar = ch3Var.l;
        if (ytVar != null) {
            ch3Var.b.m(ytVar, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        ch3 ch3Var = this.u;
        ch3Var.f526o = colorStateList;
        yt ytVar = ch3Var.l;
        if (ytVar == null || colorStateList == null) {
            return;
        }
        ytVar.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.T0 != z) {
            this.T0 = z;
            s(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        ch3 ch3Var = this.u;
        if (zIsEmpty) {
            if (ch3Var.q) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!ch3Var.q) {
            setHelperTextEnabled(true);
        }
        ch3Var.c();
        ch3Var.p = charSequence;
        ch3Var.r.setText(charSequence);
        byte b = ch3Var.h;
        if (b != 2) {
            ch3Var.i = (byte) 2;
        }
        ch3Var.j(b, ch3Var.i, ch3Var.i(ch3Var.r, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        ch3 ch3Var = this.u;
        ch3Var.t = colorStateList;
        yt ytVar = ch3Var.r;
        if (ytVar == null || colorStateList == null) {
            return;
        }
        ytVar.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        ch3 ch3Var = this.u;
        TextInputLayout textInputLayout = ch3Var.b;
        if (ch3Var.q == z) {
            return;
        }
        ch3Var.c();
        if (z) {
            yt ytVar = new yt(ch3Var.a, null);
            ch3Var.r = ytVar;
            ytVar.setId(R.id.textinput_helper_text);
            ch3Var.r.setTextAlignment(5);
            Typeface typeface = ch3Var.u;
            if (typeface != null) {
                ch3Var.r.setTypeface(typeface);
            }
            ch3Var.r.setVisibility(4);
            yt ytVar2 = ch3Var.r;
            WeakHashMap weakHashMap = be8.a;
            ytVar2.setAccessibilityLiveRegion(1);
            int i = ch3Var.s;
            ch3Var.s = i;
            yt ytVar3 = ch3Var.r;
            if (ytVar3 != null) {
                ytVar3.setTextAppearance(i);
            }
            ColorStateList colorStateList = ch3Var.t;
            ch3Var.t = colorStateList;
            yt ytVar4 = ch3Var.r;
            if (ytVar4 != null && colorStateList != null) {
                ytVar4.setTextColor(colorStateList);
            }
            ch3Var.a(ch3Var.r, 1);
        } else {
            ch3Var.c();
            byte b = ch3Var.h;
            if (b == 2) {
                ch3Var.i = (byte) 0;
            }
            ch3Var.j(b, ch3Var.i, ch3Var.i(ch3Var.r, null));
            ch3Var.h(ch3Var.r, 1);
            ch3Var.r = null;
            textInputLayout.q();
            textInputLayout.z();
        }
        ch3Var.q = z;
    }

    public void setHelperTextTextAppearance(int i) {
        ch3 ch3Var = this.u;
        ch3Var.s = i;
        yt ytVar = ch3Var.r;
        if (ytVar != null) {
            ytVar.setTextAppearance(i);
        }
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setHintAnimationEnabled(boolean z) {
        this.U0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.M) {
            this.M = z;
            if (z) {
                CharSequence hint = this.q.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.N)) {
                        setHint(hint);
                    }
                    this.q.setHint((CharSequence) null);
                }
                this.O = true;
            } else {
                this.O = false;
                if (!TextUtils.isEmpty(this.N) && TextUtils.isEmpty(this.q.getHint())) {
                    this.q.setHint(this.N);
                }
                setHintInternal(null);
            }
            if (this.q != null) {
                r();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        fv0 fv0Var = this.S0;
        fv0Var.j(i);
        this.H0 = fv0Var.p;
        if (this.q != null) {
            s(false, false);
            r();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.H0 != colorStateList) {
            if (this.G0 == null) {
                this.S0.k(colorStateList);
            }
            this.H0 = colorStateList;
            if (this.q != null) {
                s(false, false);
            }
        }
    }

    public void setMaxWidth(int i) {
        this.t = i;
        EditText editText = this.q;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinWidth(int i) {
        this.s = i;
        EditText editText = this.q;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? uf0.p(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.r0 != 1) {
            setEndIconMode(1);
        } else {
            if (z) {
                return;
            }
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.v0 = colorStateList;
        this.w0 = true;
        c();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.x0 = mode;
        this.y0 = true;
        c();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.C && TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.C) {
                setPlaceholderTextEnabled(true);
            }
            this.B = charSequence;
        }
        EditText editText = this.q;
        t(editText != null ? editText.getText().length() : 0);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.F = i;
        yt ytVar = this.D;
        if (ytVar != null) {
            ytVar.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.E != colorStateList) {
            this.E = colorStateList;
            yt ytVar = this.D;
            if (ytVar == null || colorStateList == null) {
                return;
            }
            ytVar.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.I = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.J.setText(charSequence);
        v();
    }

    public void setPrefixTextAppearance(int i) {
        this.J.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.J.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.i0.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.i0;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            k(checkableImageButton, this.j0);
        } else {
            setStartIconVisible(false);
            setStartIconOnClickListener(null);
            setStartIconOnLongClickListener(null);
            setStartIconContentDescription((CharSequence) null);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        View.OnLongClickListener onLongClickListener = this.p0;
        CheckableImageButton checkableImageButton = this.i0;
        checkableImageButton.setOnClickListener(onClickListener);
        l(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.p0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.i0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        l(checkableImageButton, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.j0 != colorStateList) {
            this.j0 = colorStateList;
            this.k0 = true;
            d(this.i0, true, colorStateList, this.m0, this.l0);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.l0 != mode) {
            this.l0 = mode;
            this.m0 = true;
            d(this.i0, this.k0, this.j0, true, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        CheckableImageButton checkableImageButton = this.i0;
        if ((checkableImageButton.getVisibility() == 0) != z) {
            checkableImageButton.setVisibility(z ? 0 : 8);
            u();
            p();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        this.K = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.L.setText(charSequence);
        y();
    }

    public void setSuffixTextAppearance(int i) {
        this.L.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.L.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(hs7 hs7Var) {
        EditText editText = this.q;
        if (editText != null) {
            be8.m(editText, hs7Var);
        }
    }

    public void setTypeface(Typeface typeface) {
        boolean z;
        if (typeface != this.h0) {
            this.h0 = typeface;
            fv0 fv0Var = this.S0;
            el0 el0Var = fv0Var.A;
            boolean z2 = true;
            if (el0Var != null) {
                el0Var.c = true;
            }
            if (fv0Var.w != typeface) {
                fv0Var.w = typeface;
                z = true;
            } else {
                z = false;
            }
            el0 el0Var2 = fv0Var.z;
            if (el0Var2 != null) {
                el0Var2.c = true;
            }
            if (fv0Var.x != typeface) {
                fv0Var.x = typeface;
            } else {
                z2 = false;
            }
            if (z || z2) {
                fv0Var.i(false);
            }
            ch3 ch3Var = this.u;
            if (typeface != ch3Var.u) {
                ch3Var.u = typeface;
                yt ytVar = ch3Var.l;
                if (ytVar != null) {
                    ytVar.setTypeface(typeface);
                }
                yt ytVar2 = ch3Var.r;
                if (ytVar2 != null) {
                    ytVar2.setTypeface(typeface);
                }
            }
            yt ytVar3 = this.y;
            if (ytVar3 != null) {
                ytVar3.setTypeface(typeface);
            }
        }
    }

    public final void t(int i) {
        if (i != 0 || this.R0) {
            yt ytVar = this.D;
            if (ytVar == null || !this.C) {
                return;
            }
            ytVar.setText((CharSequence) null);
            this.D.setVisibility(4);
            return;
        }
        yt ytVar2 = this.D;
        if (ytVar2 == null || !this.C) {
            return;
        }
        ytVar2.setText(this.B);
        this.D.setVisibility(0);
        this.D.bringToFront();
    }

    public final void u() {
        int paddingStart;
        if (this.q == null) {
            return;
        }
        if (this.i0.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            EditText editText = this.q;
            WeakHashMap weakHashMap = be8.a;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = this.q.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = this.q.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = be8.a;
        this.J.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void v() {
        this.J.setVisibility((this.I == null || this.R0) ? 8 : 0);
        p();
    }

    public final void w(boolean z, boolean z2) {
        int defaultColor = this.L0.getDefaultColor();
        int colorForState = this.L0.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.L0.getColorForState(new int[]{android.R.attr.state_activated, android.R.attr.state_enabled}, defaultColor);
        if (z) {
            this.c0 = colorForState2;
        } else if (z2) {
            this.c0 = colorForState;
        } else {
            this.c0 = defaultColor;
        }
    }

    public final void x() {
        int paddingEnd;
        if (this.q == null) {
            return;
        }
        if (g() || this.E0.getVisibility() == 0) {
            paddingEnd = 0;
        } else {
            EditText editText = this.q;
            WeakHashMap weakHashMap = be8.a;
            paddingEnd = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = this.q.getPaddingTop();
        int paddingBottom = this.q.getPaddingBottom();
        WeakHashMap weakHashMap2 = be8.a;
        this.L.setPaddingRelative(dimensionPixelSize, paddingTop, paddingEnd, paddingBottom);
    }

    public final void y() {
        yt ytVar = this.L;
        int visibility = ytVar.getVisibility();
        boolean z = (this.K == null || this.R0) ? false : true;
        ytVar.setVisibility(z ? 0 : 8);
        if (visibility != ytVar.getVisibility()) {
            getEndIconDelegate().c(z);
        }
        p();
    }

    public final void z() {
        yt ytVar;
        EditText editText;
        EditText editText2;
        if (this.P == null || this.U == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.q) != null && editText2.hasFocus());
        boolean z3 = isHovered() || ((editText = this.q) != null && editText.isHovered());
        boolean zIsEnabled = isEnabled();
        ch3 ch3Var = this.u;
        if (!zIsEnabled) {
            this.c0 = this.Q0;
        } else if (ch3Var.e()) {
            if (this.L0 != null) {
                w(z2, z3);
            } else {
                yt ytVar2 = ch3Var.l;
                this.c0 = ytVar2 != null ? ytVar2.getCurrentTextColor() : -1;
            }
        } else if (!this.x || (ytVar = this.y) == null) {
            if (z2) {
                this.c0 = this.K0;
            } else if (z3) {
                this.c0 = this.J0;
            } else {
                this.c0 = this.I0;
            }
        } else if (this.L0 != null) {
            w(z2, z3);
        } else {
            this.c0 = ytVar.getCurrentTextColor();
        }
        if (getErrorIconDrawable() != null && ch3Var.k && ch3Var.e()) {
            z = true;
        }
        setErrorIconVisible(z);
        k(this.E0, this.F0);
        k(this.i0, this.j0);
        ColorStateList colorStateList = this.v0;
        CheckableImageButton checkableImageButton = this.t0;
        k(checkableImageButton, colorStateList);
        za2 endIconDelegate = getEndIconDelegate();
        endIconDelegate.getClass();
        if (endIconDelegate instanceof z62) {
            if (!ch3Var.e() || getEndIconDrawable() == null) {
                c();
            } else {
                Drawable drawableMutate = getEndIconDrawable().mutate();
                yt ytVar3 = ch3Var.l;
                drawableMutate.setTint(ytVar3 != null ? ytVar3.getCurrentTextColor() : -1);
                checkableImageButton.setImageDrawable(drawableMutate);
            }
        }
        if (z2 && isEnabled()) {
            this.W = this.b0;
        } else {
            this.W = this.a0;
        }
        if (this.U == 2 && f() && !this.R0 && this.T != this.W) {
            if (f()) {
                ((cg1) this.P).r(0.0f, 0.0f, 0.0f, 0.0f);
            }
            i();
        }
        if (this.U == 1) {
            if (!isEnabled()) {
                this.d0 = this.N0;
            } else if (z3 && !z2) {
                this.d0 = this.P0;
            } else if (z2) {
                this.d0 = this.O0;
            } else {
                this.d0 = this.M0;
            }
        }
        b();
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.t0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.t0;
        checkableImageButton.setImageDrawable(drawable);
        k(checkableImageButton, this.v0);
    }

    public void setHint(CharSequence charSequence) {
        if (this.M) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.t0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.t0.setImageDrawable(drawable);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.i0.setContentDescription(charSequence);
        }
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.E0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.u.k);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? uf0.p(getContext(), i) : null);
    }

    public TextInputLayout(Context context) {
        this(context, null);
    }
}
