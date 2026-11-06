package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class eh2 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final View b;
    public boolean c;

    public eh2(View view) {
        this.a = (byte) 1;
        this.c = false;
        this.b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        View view = this.b;
        switch (b) {
            case 0:
                if (!this.c) {
                    view.setVisibility(4);
                }
                break;
            default:
                of8.a.n(view, 1.0f);
                if (this.c) {
                    view.setLayerType(0, null);
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        byte b = this.a;
        View view = this.b;
        switch (b) {
            case 0:
                if (this.c) {
                    view.setVisibility(0);
                }
                break;
            default:
                WeakHashMap weakHashMap = be8.a;
                if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
                    this.c = true;
                    view.setLayerType(2, null);
                    break;
                }
                break;
        }
    }

    public eh2(View view, boolean z) {
        this.a = (byte) 0;
        this.c = z;
        this.b = view;
    }
}
