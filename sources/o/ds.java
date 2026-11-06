package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class ds extends CheckedTextView {
    public final es m;
    public final r8 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ut f649o;
    public xs p;

    public ds(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        wt7.a(this, getContext());
        ut utVar = new ut(this);
        this.f649o = utVar;
        utVar.g(attributeSet, R.attr.checkedTextViewStyle);
        utVar.b();
        r8 r8Var = new r8(this);
        this.n = r8Var;
        r8Var.x(attributeSet, R.attr.checkedTextViewStyle);
        this.m = new es(this);
        Context context2 = getContext();
        int[] iArr = zz5.l;
        ep3 ep3VarX = ep3.x(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) ep3VarX.f733o;
        be8.l(this, getContext(), iArr, attributeSet, (TypedArray) ep3VarX.f733o, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(uf0.p(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setCheckMarkDrawable(uf0.p(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(uf0.p(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(ep3VarX.i(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(h62.c(typedArray.getInt(3, -1), null));
            }
            ep3VarX.B();
            getEmojiTextViewHelper().b(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            ep3VarX.B();
            throw th;
        }
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

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ut utVar = this.f649o;
        if (utVar != null) {
            utVar.b();
        }
        r8 r8Var = this.n;
        if (r8Var != null) {
            r8Var.b();
        }
        es esVar = this.m;
        if (esVar != null) {
            esVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return i67.D(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        r8 r8Var = this.n;
        if (r8Var != null) {
            return r8Var.u();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r8 r8Var = this.n;
        if (r8Var != null) {
            return r8Var.v();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        es esVar = this.m;
        if (esVar != null) {
            return esVar.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        es esVar = this.m;
        if (esVar != null) {
            return esVar.b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f649o.e();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f649o.f();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        qf0.P(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r8 r8Var = this.n;
        if (r8Var != null) {
            r8Var.z();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        r8 r8Var = this.n;
        if (r8Var != null) {
            r8Var.A(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        es esVar = this.m;
        if (esVar != null) {
            if (esVar.e) {
                esVar.e = false;
            } else {
                esVar.e = true;
                esVar.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        ut utVar = this.f649o;
        if (utVar != null) {
            utVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        ut utVar = this.f649o;
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

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        r8 r8Var = this.n;
        if (r8Var != null) {
            r8Var.K(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        r8 r8Var = this.n;
        if (r8Var != null) {
            r8Var.L(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        es esVar = this.m;
        if (esVar != null) {
            esVar.a = colorStateList;
            esVar.c = true;
            esVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        es esVar = this.m;
        if (esVar != null) {
            esVar.b = mode;
            esVar.d = true;
            esVar.b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        ut utVar = this.f649o;
        utVar.l(colorStateList);
        utVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        ut utVar = this.f649o;
        utVar.m(mode);
        utVar.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        ut utVar = this.f649o;
        if (utVar != null) {
            utVar.h(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(uf0.p(getContext(), i));
    }
}
