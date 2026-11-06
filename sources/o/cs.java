package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* JADX INFO: loaded from: classes.dex */
public class cs extends CheckBox {
    public final es m;
    public final r8 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ut f553o;
    public xs p;

    public cs(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        wt7.a(this, getContext());
        es esVar = new es(this);
        this.m = esVar;
        esVar.c(attributeSet, i);
        r8 r8Var = new r8(this);
        this.n = r8Var;
        r8Var.x(attributeSet, i);
        ut utVar = new ut(this);
        this.f553o = utVar;
        utVar.g(attributeSet, i);
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

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        r8 r8Var = this.n;
        if (r8Var != null) {
            r8Var.b();
        }
        ut utVar = this.f553o;
        if (utVar != null) {
            utVar.b();
        }
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

    public ColorStateList getSupportButtonTintList() {
        es esVar = this.m;
        if (esVar != null) {
            return esVar.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        es esVar = this.m;
        if (esVar != null) {
            return esVar.b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f553o.e();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f553o.f();
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

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        es esVar = this.m;
        if (esVar != null) {
            if (esVar.e) {
                esVar.e = false;
            } else {
                esVar.e = true;
                esVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        ut utVar = this.f553o;
        if (utVar != null) {
            utVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        ut utVar = this.f553o;
        if (utVar != null) {
            utVar.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
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

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        es esVar = this.m;
        if (esVar != null) {
            esVar.a = colorStateList;
            esVar.c = true;
            esVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        es esVar = this.m;
        if (esVar != null) {
            esVar.b = mode;
            esVar.d = true;
            esVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        ut utVar = this.f553o;
        utVar.l(colorStateList);
        utVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        ut utVar = this.f553o;
        utVar.m(mode);
        utVar.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(uf0.p(getContext(), i));
    }
}
