package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.teamviewer.teamviewer.market.mobile.R;
import o.ae;
import o.r8;
import o.wt7;
import o.y41;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatImageButton extends ImageButton {
    public final r8 m;
    public final ae n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f4o;

    public AppCompatImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4o = false;
        wt7.a(this, getContext());
        r8 r8Var = new r8(this);
        this.m = r8Var;
        r8Var.x(attributeSet, i);
        ae aeVar = new ae(this);
        this.n = aeVar;
        aeVar.k(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        r8 r8Var = this.m;
        if (r8Var != null) {
            r8Var.b();
        }
        ae aeVar = this.n;
        if (aeVar != null) {
            aeVar.b();
        }
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

    public ColorStateList getSupportImageTintList() {
        y41 y41Var;
        ae aeVar = this.n;
        if (aeVar == null || (y41Var = (y41) aeVar.d) == null) {
            return null;
        }
        return (ColorStateList) y41Var.c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        y41 y41Var;
        ae aeVar = this.n;
        if (aeVar == null || (y41Var = (y41) aeVar.d) == null) {
            return null;
        }
        return (PorterDuff.Mode) y41Var.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.n.c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
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

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        ae aeVar = this.n;
        if (aeVar != null) {
            aeVar.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        ae aeVar = this.n;
        if (aeVar != null && drawable != null && !this.f4o) {
            aeVar.b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (aeVar != null) {
            aeVar.b();
            if (this.f4o) {
                return;
            }
            ImageView imageView = (ImageView) aeVar.c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(aeVar.b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f4o = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.n.n(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        ae aeVar = this.n;
        if (aeVar != null) {
            aeVar.b();
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

    public void setSupportImageTintList(ColorStateList colorStateList) {
        ae aeVar = this.n;
        if (aeVar != null) {
            y41 y41Var = (y41) aeVar.d;
            if (y41Var == null) {
                y41Var = new y41();
                aeVar.d = y41Var;
            }
            y41Var.c = colorStateList;
            y41Var.b = true;
            aeVar.b();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        ae aeVar = this.n;
        if (aeVar != null) {
            y41 y41Var = (y41) aeVar.d;
            if (y41Var == null) {
                y41Var = new y41();
                aeVar.d = y41Var;
            }
            y41Var.d = mode;
            y41Var.a = true;
            aeVar.b();
        }
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    public AppCompatImageButton(Context context) {
        this(context, null);
    }
}
