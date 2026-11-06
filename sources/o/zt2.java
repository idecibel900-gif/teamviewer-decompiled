package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* JADX INFO: loaded from: classes.dex */
public final class zt2 extends AnimationSet implements Runnable {
    public final ViewGroup m;
    public final View n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f2732o;
    public boolean p;
    public boolean q;

    public zt2(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.q = true;
        this.m = viewGroup;
        this.n = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.q = true;
        if (this.f2732o) {
            return !this.p;
        }
        if (!super.getTransformation(j, transformation)) {
            this.f2732o = true;
            d95.a(this.m, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.f2732o;
        ViewGroup viewGroup = this.m;
        if (z || !this.q) {
            viewGroup.endViewTransition(this.n);
            this.p = true;
        } else {
            this.q = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.q = true;
        if (this.f2732o) {
            return !this.p;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.f2732o = true;
            d95.a(this.m, this);
        }
        return true;
    }
}
