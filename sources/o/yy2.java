package o;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes.dex */
public abstract class yy2 implements DefaultLifecycleObserver, vn7 {
    private boolean isStarted;

    public abstract Drawable getDrawable();

    public abstract View getView();

    @Override // o.vn7
    public void onError(xd3 xd3Var) {
        updateImage(xd3Var);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(LifecycleOwner lifecycleOwner) {
        this.isStarted = true;
        updateAnimation();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner lifecycleOwner) {
        this.isStarted = false;
        updateAnimation();
    }

    @Override // o.vn7
    public void onSuccess(xd3 xd3Var) {
        updateImage(xd3Var);
    }

    public abstract void setDrawable(Drawable drawable);

    public final void updateAnimation() {
        Object drawable = getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable == null) {
            return;
        }
        if (this.isStarted) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    public final void updateImage(xd3 xd3Var) {
        Drawable drawableO = xd3Var != null ? bt1.o(xd3Var, getView().getResources()) : null;
        Object drawable = getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable != null) {
            animatable.stop();
        }
        setDrawable(drawableO);
        updateAnimation();
    }

    @Override // o.vn7
    public void onStart(xd3 xd3Var) {
        updateImage(xd3Var);
    }
}
