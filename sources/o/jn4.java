package o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class jn4 {
    public final MaterialButton a;
    public qw6 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public PorterDuff.Mode i;
    public ColorStateList j;
    public ColorStateList k;
    public ColorStateList l;
    public qn4 m;
    public boolean n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1185o = false;
    public boolean p = false;
    public boolean q;
    public RippleDrawable r;
    public int s;

    public jn4(MaterialButton materialButton, qw6 qw6Var) {
        this.a = materialButton;
        this.b = qw6Var;
    }

    public final sx6 a() {
        RippleDrawable rippleDrawable = this.r;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        int numberOfLayers = this.r.getNumberOfLayers();
        RippleDrawable rippleDrawable2 = this.r;
        return numberOfLayers > 2 ? (sx6) rippleDrawable2.getDrawable(2) : (sx6) rippleDrawable2.getDrawable(1);
    }

    public final qn4 b(boolean z) {
        RippleDrawable rippleDrawable = this.r;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (qn4) ((LayerDrawable) ((InsetDrawable) this.r.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final void c(qw6 qw6Var) {
        this.b = qw6Var;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(qw6Var);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(qw6Var);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(qw6Var);
        }
    }

    public final void d(int i, int i2) {
        WeakHashMap weakHashMap = be8.a;
        MaterialButton materialButton = this.a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.e;
        int i4 = this.f;
        this.f = i2;
        this.e = i;
        if (!this.f1185o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    public final void e() {
        qn4 qn4Var = new qn4(this.b);
        MaterialButton materialButton = this.a;
        qn4Var.i(materialButton.getContext());
        qn4Var.setTintList(this.j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            qn4Var.setTintMode(mode);
        }
        float f = this.h;
        ColorStateList colorStateList = this.k;
        qn4Var.m.j = f;
        qn4Var.invalidateSelf();
        pn4 pn4Var = qn4Var.m;
        if (pn4Var.d != colorStateList) {
            pn4Var.d = colorStateList;
            qn4Var.onStateChange(qn4Var.getState());
        }
        qn4 qn4Var2 = new qn4(this.b);
        qn4Var2.setTint(0);
        float f2 = this.h;
        int iD0 = this.n ? io1.d0(materialButton, R.attr.colorSurface) : 0;
        qn4Var2.m.j = f2;
        qn4Var2.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iD0);
        pn4 pn4Var2 = qn4Var2.m;
        if (pn4Var2.d != colorStateListValueOf) {
            pn4Var2.d = colorStateListValueOf;
            qn4Var2.onStateChange(qn4Var2.getState());
        }
        qn4 qn4Var3 = new qn4(this.b);
        this.m = qn4Var3;
        qn4Var3.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(oe6.b(this.l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{qn4Var2, qn4Var}), this.c, this.e, this.d, this.f), this.m);
        this.r = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        qn4 qn4VarB = b(false);
        if (qn4VarB != null) {
            qn4VarB.k(this.s);
        }
    }

    public final void f() {
        qn4 qn4VarB = b(false);
        qn4 qn4VarB2 = b(true);
        if (qn4VarB != null) {
            float f = this.h;
            ColorStateList colorStateList = this.k;
            qn4VarB.m.j = f;
            qn4VarB.invalidateSelf();
            pn4 pn4Var = qn4VarB.m;
            if (pn4Var.d != colorStateList) {
                pn4Var.d = colorStateList;
                qn4VarB.onStateChange(qn4VarB.getState());
            }
            if (qn4VarB2 != null) {
                float f2 = this.h;
                int iD0 = this.n ? io1.d0(this.a, R.attr.colorSurface) : 0;
                qn4VarB2.m.j = f2;
                qn4VarB2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iD0);
                pn4 pn4Var2 = qn4VarB2.m;
                if (pn4Var2.d != colorStateListValueOf) {
                    pn4Var2.d = colorStateListValueOf;
                    qn4VarB2.onStateChange(qn4VarB2.getState());
                }
            }
        }
    }
}
