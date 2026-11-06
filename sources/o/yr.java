package o;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
public class yr extends AutoCompleteTextView {
    public static final int[] p = {R.attr.popupBackground};
    public final r8 m;
    public final ut n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final cj3 f2632o;

    public yr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.teamviewer.teamviewer.market.mobile.R.attr.autoCompleteTextViewStyle);
        wt7.a(this, getContext());
        ep3 ep3VarX = ep3.x(getContext(), attributeSet, p, com.teamviewer.teamviewer.market.mobile.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) ep3VarX.f733o).hasValue(0)) {
            setDropDownBackgroundDrawable(ep3VarX.l(0));
        }
        ep3VarX.B();
        r8 r8Var = new r8(this);
        this.m = r8Var;
        r8Var.x(attributeSet, com.teamviewer.teamviewer.market.mobile.R.attr.autoCompleteTextViewStyle);
        ut utVar = new ut(this);
        this.n = utVar;
        utVar.g(attributeSet, com.teamviewer.teamviewer.market.mobile.R.attr.autoCompleteTextViewStyle);
        utVar.b();
        cj3 cj3Var = new cj3((EditText) this);
        this.f2632o = cj3Var;
        cj3Var.K(attributeSet, com.teamviewer.teamviewer.market.mobile.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerH = cj3Var.H(keyListener);
        if (keyListenerH == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerH);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
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
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return i67.D(super.getCustomSelectionActionModeCallback());
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

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        qf0.P(editorInfo, inputConnectionOnCreateInputConnection, this);
        return this.f2632o.L(inputConnectionOnCreateInputConnection, editorInfo);
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
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i67.G(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(uf0.p(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f2632o.W(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f2632o.H(keyListener));
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
}
