package o;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.transformation.ExpandableBehavior;

/* JADX INFO: loaded from: classes.dex */
public final class jf2 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View m;
    public final /* synthetic */ int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ mf2 f1159o;
    public final /* synthetic */ ExpandableBehavior p;

    public jf2(ExpandableBehavior expandableBehavior, View view, int i, mf2 mf2Var) {
        this.p = expandableBehavior;
        this.m = view;
        this.n = i;
        this.f1159o = mf2Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = this.m;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        ExpandableBehavior expandableBehavior = this.p;
        if (expandableBehavior.a == this.n) {
            Object obj = this.f1159o;
            expandableBehavior.s((View) obj, view, ((FloatingActionButton) obj).A.b, false);
        }
        return false;
    }
}
