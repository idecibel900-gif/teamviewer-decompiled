package o;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public class yt extends TextView {
    public final r8 m;
    public final ut n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final cj3 f2639o;
    public xs p;
    public boolean q;
    public df6 r;
    public Future s;
    public tt t;

    public yt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.q = false;
        this.r = null;
        wt7.a(this, getContext());
        r8 r8Var = new r8(this);
        this.m = r8Var;
        r8Var.x(attributeSet, i);
        ut utVar = new ut(this);
        this.n = utVar;
        utVar.g(attributeSet, i);
        utVar.b();
        cj3 cj3Var = new cj3((byte) 20, false);
        cj3Var.n = this;
        this.f2639o = cj3Var;
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    private xs getEmojiTextViewHelper() {
        xs xsVar = this.p;
        if (xsVar != null) {
            return xsVar;
        }
        xs xsVar2 = new xs(this);
        this.p = xsVar2;
        return xsVar2;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        r8 r8Var = this.m;
        if (r8Var != null) {
            r8Var.b();
        }
        ut utVar = this.n;
        if (utVar != null) {
            utVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (pf8.c) {
            return super.getAutoSizeMaxTextSize();
        }
        ut utVar = this.n;
        if (utVar != null) {
            return Math.round(utVar.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (pf8.c) {
            return super.getAutoSizeMinTextSize();
        }
        ut utVar = this.n;
        if (utVar != null) {
            return Math.round(utVar.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (pf8.c) {
            return super.getAutoSizeStepGranularity();
        }
        ut utVar = this.n;
        if (utVar != null) {
            return Math.round(utVar.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (pf8.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        ut utVar = this.n;
        return utVar != null ? utVar.i.f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (pf8.c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        ut utVar = this.n;
        if (utVar != null) {
            return utVar.i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return i67.D(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public String getFontVariationSettings() {
        return getFontVariationSettingsManager().e;
    }

    public tt getFontVariationSettingsManager() {
        tt ttVar = this.t;
        if (ttVar != null) {
            return ttVar;
        }
        tt ttVar2 = new tt(this, new zr(this, (byte) 2));
        this.t = ttVar2;
        return ttVar2;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public vt getSuperCaller() {
        df6 df6Var = this.r;
        if (df6Var != null) {
            return df6Var;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            xt xtVar = new xt(this);
            this.r = xtVar;
            return xtVar;
        }
        if (i >= 28) {
            wt wtVar = new wt(this);
            this.r = wtVar;
            return wtVar;
        }
        df6 df6Var2 = new df6((Object) this, (byte) 17);
        this.r = df6Var2;
        return df6Var2;
    }

    public ColorStateList getSupportBackgroundTintList() {
        r8 r8Var = this.m;
        if (r8Var != null) {
            return r8Var.u();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r8 r8Var = this.m;
        if (r8Var != null) {
            return r8Var.v();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.n.e();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.n.f();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.s;
        if (future != null) {
            try {
                this.s = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                i67.r(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        cj3 cj3Var;
        if (Build.VERSION.SDK_INT >= 28 || (cj3Var = this.f2639o) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) cj3Var.f531o;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) ((TextView) cj3Var.n).getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }

    public sp5 getTextMetricsParamsCompat() {
        return i67.r(this);
    }

    @Override // android.widget.TextView
    public Typeface getTypeface() {
        return getFontVariationSettingsManager().c;
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.n.getClass();
        if (Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            vt1.L(editorInfo, getText());
        }
        qf0.P(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ut utVar = this.n;
        if (utVar == null || pf8.c) {
            return;
        }
        utVar.i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future future = this.s;
        if (future != null) {
            try {
                this.s = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                i67.r(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        ut utVar = this.n;
        if (utVar != null) {
            bu buVar = utVar.i;
            if (pf8.c || !buVar.f()) {
                return;
            }
            buVar.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (pf8.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        ut utVar = this.n;
        if (utVar != null) {
            utVar.i(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (pf8.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        ut utVar = this.n;
        if (utVar != null) {
            utVar.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (pf8.c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        ut utVar = this.n;
        if (utVar != null) {
            utVar.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r8 r8Var = this.m;
        if (r8Var != null) {
            r8Var.z();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        r8 r8Var = this.m;
        if (r8Var != null) {
            r8Var.A(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        ut utVar = this.n;
        if (utVar != null) {
            utVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        ut utVar = this.n;
        if (utVar != null) {
            utVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? uf0.p(context, i) : null, i2 != 0 ? uf0.p(context, i2) : null, i3 != 0 ? uf0.p(context, i3) : null, i4 != 0 ? uf0.p(context, i4) : null);
        ut utVar = this.n;
        if (utVar != null) {
            utVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? uf0.p(context, i) : null, i2 != 0 ? uf0.p(context, i2) : null, i3 != 0 ? uf0.p(context, i3) : null, i4 != 0 ? uf0.p(context, i4) : null);
        ut utVar = this.n;
        if (utVar != null) {
            utVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i67.G(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().e(i);
        } else {
            i67.y(this, i);
        }
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        return getFontVariationSettingsManager().a(str);
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().d(i);
        } else {
            i67.z(this, i);
        }
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().f(i, f);
        } else if (i2 >= 34) {
            q3.l(this, i, f);
        } else {
            i67.A(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    public void setPrecomputedText(tp5 tp5Var) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        i67.r(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        r8 r8Var = this.m;
        if (r8Var != null) {
            r8Var.K(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        r8 r8Var = this.m;
        if (r8Var != null) {
            r8Var.L(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        ut utVar = this.n;
        utVar.l(colorStateList);
        utVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        ut utVar = this.n;
        utVar.m(mode);
        utVar.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        ut utVar = this.n;
        if (utVar != null) {
            utVar.h(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        cj3 cj3Var;
        if (Build.VERSION.SDK_INT >= 28 || (cj3Var = this.f2639o) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            cj3Var.f531o = textClassifier;
        }
    }

    public void setTextFuture(Future<tp5> future) {
        this.s = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(sp5 sp5Var) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = sp5Var.b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(sp5Var.a);
        setBreakStrategy(sp5Var.c);
        setHyphenationFrequency(sp5Var.d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = pf8.c;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        ut utVar = this.n;
        if (utVar != null) {
            bu buVar = utVar.i;
            if (z || buVar.f()) {
                return;
            }
            buVar.g(i, f);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        if (this.q) {
            return;
        }
        if (typeface != null && i > 0) {
            Context context = getContext();
            r47 r47Var = t58.a;
            if (context == null) {
                hk0.g("Context cannot be null");
                return;
            }
            typeface = Typeface.create(typeface, i);
        }
        this.q = true;
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.q = false;
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        i67.A(this, i);
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface) {
        tt fontVariationSettingsManager = getFontVariationSettingsManager();
        fontVariationSettingsManager.c = typeface;
        fontVariationSettingsManager.d = typeface;
        fontVariationSettingsManager.b.accept(typeface);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        ut utVar = this.n;
        if (utVar != null) {
            utVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        ut utVar = this.n;
        if (utVar != null) {
            utVar.b();
        }
    }

    public yt(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }
}
