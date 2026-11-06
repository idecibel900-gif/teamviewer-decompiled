package o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class bo2 extends zn2 {
    @Override // o.zn2
    public final void d(float f, float f2, float f3) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(zn2.A, h(f, f3));
        stateListAnimator.addState(zn2.B, h(f, f2));
        stateListAnimator.addState(zn2.C, h(f, f2));
        stateListAnimator.addState(zn2.D, h(f, f2));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        float[] fArr = {f};
        FloatingActionButton floatingActionButton = this.t;
        arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", fArr).setDuration(0L));
        arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(zn2.z);
        stateListAnimator.addState(zn2.E, animatorSet);
        stateListAnimator.addState(zn2.F, h(0.0f, 0.0f));
        floatingActionButton.setStateListAnimator(stateListAnimator);
        if (((FloatingActionButton) this.u.n).w || (this.f && floatingActionButton.getSizeDimension() < this.k)) {
            g();
        }
    }

    public final AnimatorSet h(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        FloatingActionButton floatingActionButton = this.t;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(zn2.z);
        return animatorSet;
    }
}
