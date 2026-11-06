package o;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import com.teamviewer.libs.materialtoolbar.ToolbarViewMovable;
import com.teamviewer.remotecontrollib.gui.view.M2MControlView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ai4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Drawable.Callback b;

    public /* synthetic */ ai4(Drawable.Callback callback, byte b) {
        this.a = b;
        this.b = callback;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0021 A[PHI: r0
      0x0021: PHI (r0v9 float) = (r0v6 float), (r0v7 float) binds: [B:5:0x001f, B:8:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        Drawable.Callback callback = this.b;
        switch (b) {
            case 0:
                ei4 ei4Var = (ei4) callback;
                int i = ei4Var.R;
                if (i == 0) {
                    i = 1;
                }
                if (i != 2) {
                    t01 t01Var = ei4Var.u;
                    if (t01Var != null) {
                        t01Var.m(ei4Var.n.a());
                    }
                } else {
                    ei4Var.invalidateSelf();
                }
                break;
            case 1:
                M2MControlView m2MControlView = (M2MControlView) callback;
                int i2 = M2MControlView.L;
                valueAnimator.getClass();
                Object animatedValue = valueAnimator.getAnimatedValue();
                animatedValue.getClass();
                int iFloatValue = (int) ((Float) animatedValue).floatValue();
                m2MControlView.q = iFloatValue;
                int i3 = m2MControlView.s;
                int i4 = m2MControlView.f65o - iFloatValue;
                m2MControlView.u = i3 + i4;
                m2MControlView.v = i4 + m2MControlView.t;
                m2MControlView.invalidate();
                break;
            default:
                ToolbarViewMovable toolbarViewMovable = (ToolbarViewMovable) callback;
                int i5 = ToolbarViewMovable.r;
                valueAnimator.getClass();
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                animatedValue2.getClass();
                float fFloatValue = ((Float) animatedValue2).floatValue();
                float f = toolbarViewMovable.f62o;
                if (fFloatValue < f) {
                    fFloatValue = f;
                } else {
                    f = 0.0f;
                    if (fFloatValue > 0.0f) {
                        fFloatValue = f;
                    }
                }
                toolbarViewMovable.n.setTranslationX(fFloatValue);
                toolbarViewMovable.q = (int) fFloatValue;
                break;
        }
    }
}
