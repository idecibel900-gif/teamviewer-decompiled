package o;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.TypedValue;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class z62 extends za2 {
    public final v62 d;
    public final dt0 e;
    public final w62 f;
    public final et0 g;
    public final ft0 h;
    public boolean i;
    public boolean j;
    public long k;
    public StateListDrawable l;
    public qn4 m;
    public AccessibilityManager n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ValueAnimator f2674o;
    public ValueAnimator p;

    public z62(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.d = new v62(this, (byte) 0);
        byte b = 1;
        this.e = new dt0(this, b);
        this.f = new w62(this, textInputLayout);
        this.g = new et0(this, b);
        this.h = new ft0(this, (byte) 1);
        this.i = false;
        this.j = false;
        this.k = Long.MAX_VALUE;
    }

    @Override // o.za2
    public final void a() {
        Context context = this.b;
        float dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        qn4 qn4VarD = d(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        qn4 qn4VarD2 = d(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.m = qn4VarD;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.l = stateListDrawable;
        stateListDrawable.addState(new int[]{android.R.attr.state_above_anchor}, qn4VarD);
        this.l.addState(new int[0], qn4VarD2);
        Drawable drawableP = uf0.p(context, R.drawable.mtrl_dropdown_arrow);
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setEndIconDrawable(drawableP);
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.exposed_dropdown_menu_content_description));
        textInputLayout.setEndIconOnClickListener(new o6(this, (byte) 5));
        LinkedHashSet linkedHashSet = textInputLayout.q0;
        et0 et0Var = this.g;
        linkedHashSet.add(et0Var);
        if (textInputLayout.q != null) {
            et0Var.a(textInputLayout);
        }
        textInputLayout.u0.add(this.h);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        LinearInterpolator linearInterpolator = lo.a;
        valueAnimatorOfFloat.setInterpolator(linearInterpolator);
        valueAnimatorOfFloat.setDuration(67L);
        valueAnimatorOfFloat.addUpdateListener(new rr(this, (byte) 3));
        this.p = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(linearInterpolator);
        valueAnimatorOfFloat2.setDuration(50L);
        valueAnimatorOfFloat2.addUpdateListener(new rr(this, (byte) 3));
        this.f2674o = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new p6(this, (byte) 1));
        this.n = (AccessibilityManager) context.getSystemService("accessibility");
    }

    @Override // o.za2
    public final boolean b(int i) {
        return i != 0;
    }

    public final qn4 d(float f, float f2, float f3, int i) {
        tf6 tf6Var = new tf6();
        tf6 tf6Var2 = new tf6();
        tf6 tf6Var3 = new tf6();
        tf6 tf6Var4 = new tf6();
        byte b = 0;
        d82 d82Var = new d82(b);
        d82 d82Var2 = new d82(b);
        d82 d82Var3 = new d82(b);
        d82 d82Var4 = new d82(b);
        n nVar = new n(f);
        n nVar2 = new n(f);
        n nVar3 = new n(f2);
        n nVar4 = new n(f2);
        qw6 qw6Var = new qw6();
        qw6Var.a = tf6Var;
        qw6Var.b = tf6Var2;
        qw6Var.c = tf6Var3;
        qw6Var.d = tf6Var4;
        qw6Var.e = nVar;
        qw6Var.f = nVar2;
        qw6Var.g = nVar4;
        qw6Var.h = nVar3;
        qw6Var.i = d82Var;
        qw6Var.j = d82Var2;
        qw6Var.k = d82Var3;
        qw6Var.l = d82Var4;
        Paint paint = qn4.I;
        String simpleName = qn4.class.getSimpleName();
        Context context = this.b;
        TypedValue typedValueB0 = io1.b0(context, R.attr.colorSurface);
        if (typedValueB0 == null) {
            throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", simpleName, context.getResources().getResourceName(R.attr.colorSurface)));
        }
        int i2 = typedValueB0.data;
        qn4 qn4Var = new qn4();
        qn4Var.i(context);
        qn4Var.l(ColorStateList.valueOf(i2));
        qn4Var.k(f3);
        qn4Var.setShapeAppearanceModel(qw6Var);
        pn4 pn4Var = qn4Var.m;
        if (pn4Var.g == null) {
            pn4Var.g = new Rect();
        }
        qn4Var.m.g.set(0, i, 0, i);
        qn4Var.invalidateSelf();
        return qn4Var;
    }

    public final void e(boolean z) {
        if (this.j != z) {
            this.j = z;
            this.p.cancel();
            this.f2674o.start();
        }
    }

    public final void f(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.k;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
            this.i = false;
        }
        if (this.i) {
            this.i = false;
            return;
        }
        e(!this.j);
        if (!this.j) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            autoCompleteTextView.showDropDown();
        }
    }
}
