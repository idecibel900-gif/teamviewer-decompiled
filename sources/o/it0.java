package o;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import com.google.android.material.textfield.TextInputLayout;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class it0 extends za2 {
    public final hc0 d;
    public final dt0 e;
    public final et0 f;
    public final ft0 g;
    public AnimatorSet h;
    public ValueAnimator i;

    public it0(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.d = new hc0(this, (byte) 2);
        byte b = 0;
        this.e = new dt0(this, b);
        this.f = new et0(this, b);
        this.g = new ft0(this, (byte) 0);
    }

    @Override // o.za2
    public final void a() {
        Drawable drawableP = uf0.p(this.b, R.drawable.mtrl_ic_cancel);
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setEndIconDrawable(drawableP);
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.clear_text_end_icon_content_description));
        textInputLayout.setEndIconOnClickListener(new o6(this, (byte) 4));
        LinkedHashSet linkedHashSet = textInputLayout.q0;
        et0 et0Var = this.f;
        linkedHashSet.add(et0Var);
        if (textInputLayout.q != null) {
            et0Var.a(textInputLayout);
        }
        textInputLayout.u0.add(this.g);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(lo.d);
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.addUpdateListener(new ht0(this, (byte) 1));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        LinearInterpolator linearInterpolator = lo.a;
        valueAnimatorOfFloat2.setInterpolator(linearInterpolator);
        valueAnimatorOfFloat2.setDuration(100L);
        valueAnimatorOfFloat2.addUpdateListener(new ht0(this, (byte) 0));
        AnimatorSet animatorSet = new AnimatorSet();
        this.h = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.h.addListener(new gt0(this, (byte) 0));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(linearInterpolator);
        valueAnimatorOfFloat3.setDuration(100L);
        valueAnimatorOfFloat3.addUpdateListener(new ht0(this, (byte) 0));
        this.i = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new gt0(this, (byte) 1));
    }

    @Override // o.za2
    public final void c(boolean z) {
        if (this.a.getSuffixText() == null) {
            return;
        }
        d(z);
    }

    public final void d(boolean z) {
        boolean z2 = this.a.g() == z;
        if (z && !this.h.isRunning()) {
            this.i.cancel();
            this.h.start();
            if (z2) {
                this.h.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.h.cancel();
        this.i.start();
        if (z2) {
            this.i.end();
        }
    }
}
