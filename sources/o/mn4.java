package o;

import android.R;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes.dex */
public final class mn4 {
    public static final int[] s = {R.attr.state_checked};
    public static final double t = Math.cos(Math.toRadians(45.0d));
    public final MaterialCardView a;
    public final qn4 c;
    public final qn4 d;
    public int e;
    public int f;
    public int g;
    public Drawable h;
    public Drawable i;
    public ColorStateList j;
    public ColorStateList k;
    public qw6 l;
    public ColorStateList m;
    public RippleDrawable n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LayerDrawable f1488o;
    public qn4 p;
    public boolean r;
    public final Rect b = new Rect();
    public boolean q = false;

    public mn4(MaterialCardView materialCardView, AttributeSet attributeSet) {
        this.a = materialCardView;
        qn4 qn4Var = new qn4(materialCardView.getContext(), attributeSet, com.teamviewer.teamviewer.market.mobile.R.attr.materialCardViewStyle, com.teamviewer.teamviewer.market.mobile.R.style.Widget_MaterialComponents_CardView);
        this.c = qn4Var;
        qn4Var.i(materialCardView.getContext());
        qn4Var.n();
        y85 y85VarE = qn4Var.m.a.e();
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, hz5.f, com.teamviewer.teamviewer.market.mobile.R.attr.materialCardViewStyle, com.teamviewer.teamviewer.market.mobile.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
            y85VarE.e = new n(dimension);
            y85VarE.f = new n(dimension);
            y85VarE.g = new n(dimension);
            y85VarE.h = new n(dimension);
        }
        this.d = new qn4();
        f(y85VarE.a());
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float b(uf0 uf0Var, float f) {
        if (uf0Var instanceof tf6) {
            return (float) ((1.0d - t) * ((double) f));
        }
        if (uf0Var instanceof bg1) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    public final float a() {
        uf0 uf0Var = this.l.a;
        qn4 qn4Var = this.c;
        return Math.max(Math.max(b(uf0Var, qn4Var.g()), b(this.l.b, qn4Var.m.a.f.a(qn4Var.f()))), Math.max(b(this.l.c, qn4Var.m.a.g.a(qn4Var.f())), b(this.l.d, qn4Var.m.a.h.a(qn4Var.f()))));
    }

    public final LayerDrawable c() {
        if (this.n == null) {
            int[] iArr = oe6.a;
            this.p = new qn4(this.l);
            this.n = new RippleDrawable(this.j, null, this.p);
        }
        if (this.f1488o == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            Drawable drawable = this.i;
            if (drawable != null) {
                stateListDrawable.addState(s, drawable);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.n, this.d, stateListDrawable});
            this.f1488o = layerDrawable;
            layerDrawable.setId(2, com.teamviewer.teamviewer.market.mobile.R.id.mtrl_card_checked_layer_id);
        }
        return this.f1488o;
    }

    public final ln4 d(Drawable drawable) {
        int iCeil;
        int i;
        MaterialCardView materialCardView = this.a;
        if (materialCardView.getUseCompatPadding()) {
            int iCeil2 = (int) Math.ceil((materialCardView.getMaxCardElevation() * 1.5f) + (g() ? a() : 0.0f));
            iCeil = (int) Math.ceil(materialCardView.getMaxCardElevation() + (g() ? a() : 0.0f));
            i = iCeil2;
        } else {
            iCeil = 0;
            i = 0;
        }
        return new ln4(drawable, iCeil, i, iCeil, i);
    }

    public final void e(Drawable drawable) {
        this.i = drawable;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.i = drawableMutate;
            drawableMutate.setTintList(this.k);
        }
        if (this.f1488o != null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            Drawable drawable2 = this.i;
            if (drawable2 != null) {
                stateListDrawable.addState(s, drawable2);
            }
            this.f1488o.setDrawableByLayerId(com.teamviewer.teamviewer.market.mobile.R.id.mtrl_card_checked_layer_id, stateListDrawable);
        }
    }

    public final void f(qw6 qw6Var) {
        this.l = qw6Var;
        qn4 qn4Var = this.c;
        qn4Var.setShapeAppearanceModel(qw6Var);
        qn4Var.H = !qn4Var.j();
        qn4 qn4Var2 = this.d;
        if (qn4Var2 != null) {
            qn4Var2.setShapeAppearanceModel(qw6Var);
        }
        qn4 qn4Var3 = this.p;
        if (qn4Var3 != null) {
            qn4Var3.setShapeAppearanceModel(qw6Var);
        }
    }

    public final boolean g() {
        MaterialCardView materialCardView = this.a;
        return materialCardView.getPreventCornerOverlap() && this.c.j() && materialCardView.getUseCompatPadding();
    }

    public final void h() {
        MaterialCardView materialCardView = this.a;
        float cardViewRadius = 0.0f;
        float fA = ((!materialCardView.getPreventCornerOverlap() || this.c.j()) && !g()) ? 0.0f : a();
        if (materialCardView.getPreventCornerOverlap() && materialCardView.getUseCompatPadding()) {
            cardViewRadius = (float) ((1.0d - t) * ((double) materialCardView.getCardViewRadius()));
        }
        int i = (int) (fA - cardViewRadius);
        Rect rect = this.b;
        materialCardView.f538o.set(rect.left + i, rect.top + i, rect.right + i, rect.bottom + i);
        wk0 wk0Var = materialCardView.q;
        cm0 cm0Var = (cm0) wk0Var.f2420o;
        if (!cm0Var.getUseCompatPadding()) {
            wk0Var.E(0, 0, 0, 0);
            return;
        }
        mf6 mf6Var = (mf6) wk0Var.n;
        float f = mf6Var.e;
        float f2 = mf6Var.a;
        int iCeil = (int) Math.ceil(nf6.a(f, f2, cm0Var.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(nf6.b(f, f2, cm0Var.getPreventCornerOverlap()));
        wk0Var.E(iCeil, iCeil2, iCeil, iCeil2);
    }

    public final void i() {
        boolean z = this.q;
        MaterialCardView materialCardView = this.a;
        if (!z) {
            materialCardView.setBackgroundInternal(d(this.c));
        }
        materialCardView.setForeground(d(this.h));
    }
}
