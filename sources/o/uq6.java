package o;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class uq6 implements Runnable {
    public final /* synthetic */ byte m = 1;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f2237o;
    public final Object p;

    public uq6(x84 x84Var, l84 l84Var) {
        l84Var.getClass();
        this.f2237o = x84Var;
        this.p = l84Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y30 y30Var;
        byte b = this.m;
        Object obj = this.p;
        Object obj2 = this.f2237o;
        switch (b) {
            case 0:
                if (!this.n) {
                    ((x84) obj2).d((l84) obj);
                    this.n = true;
                }
                break;
            default:
                View view = (View) obj2;
                SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) obj;
                fe8 fe8Var = swipeDismissBehavior.a;
                if (fe8Var != null && fe8Var.f()) {
                    WeakHashMap weakHashMap = be8.a;
                    view.postOnAnimation(this);
                    break;
                } else if (this.n && (y30Var = swipeDismissBehavior.b) != null) {
                    y30Var.a(view);
                    break;
                }
                break;
        }
    }

    public uq6(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.p = swipeDismissBehavior;
        this.f2237o = view;
        this.n = z;
    }
}
