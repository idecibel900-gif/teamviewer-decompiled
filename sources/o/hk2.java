package o;

import android.view.View;
import android.view.animation.Animation;

/* JADX INFO: loaded from: classes.dex */
public final class hk2 implements Animation.AnimationListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hk2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        byte b = this.a;
        Object obj = this.b;
        animation.getClass();
        switch (b) {
            case 0:
                View view = ((ik2) obj).x0;
                if (view != null) {
                    view.setVisibility(8);
                }
                break;
            default:
                View view2 = (View) obj;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        byte b = this.a;
        animation.getClass();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        byte b = this.a;
        animation.getClass();
    }
}
