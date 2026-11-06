package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* JADX INFO: loaded from: classes.dex */
public class as extends Button {
    public final r8 m;
    public final ut n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public xs f352o;
    public tt p;

    public as(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        wt7.a(this, getContext());
        r8 r8Var = new r8(this);
        this.m = r8Var;
        r8Var.x(attributeSet, i);
        ut utVar = new ut(this);
        this.n = utVar;
        utVar.g(attributeSet, i);
        utVar.b();
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    private xs getEmojiTextViewHelper() {
        xs xsVar = this.f352o;
        if (xsVar != null) {
            return xsVar;
        }
        xs xsVar2 = new xs(this);
        this.f352o = xsVar2;
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
    public String getFontVariationSettings() {
        return getFontVariationSettingsManager().e;
    }

    public tt getFontVariationSettingsManager() {
        tt ttVar = this.p;
        if (ttVar != null) {
            return ttVar;
        }
        tt ttVar2 = new tt(this, new zr(this, (byte) 0));
        this.p = ttVar2;
        return ttVar2;
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
    public Typeface getTypeface() {
        return getFontVariationSettingsManager().c;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ut utVar = this.n;
        if (utVar == null || pf8.c) {
            return;
        }
        utVar.i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
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
    public final boolean setFontVariationSettings(String str) {
        return getFontVariationSettingsManager().a(str);
    }

    public void setSupportAllCaps(boolean z) {
        ut utVar = this.n;
        if (utVar != null) {
            utVar.a.setAllCaps(z);
        }
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
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        ut utVar = this.n;
        if (utVar != null) {
            utVar.h(context, i);
        }
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
    public void setTypeface(Typeface typeface) {
        tt fontVariationSettingsManager = getFontVariationSettingsManager();
        fontVariationSettingsManager.c = typeface;
        fontVariationSettingsManager.d = typeface;
        fontVariationSettingsManager.b.accept(typeface);
    }
}
