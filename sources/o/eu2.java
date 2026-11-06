package o;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class eu2 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ byte m = 2;
    public final Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f742o;

    public eu2(tz6 tz6Var, Activity activity) {
        tz6Var.getClass();
        this.n = tz6Var;
        this.f742o = new WeakReference(activity);
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Window window;
        WindowManager.LayoutParams attributes;
        byte b = this.m;
        Object obj = this.n;
        Object obj2 = this.f742o;
        switch (b) {
            case 0:
                av2 av2Var = (av2) obj;
                ut2 ut2Var = av2Var.c;
                av2Var.k();
                ll1.i((ViewGroup) ut2Var.U.getParent(), ((fu2) obj2).m).h();
                break;
            case 1:
                view.getClass();
                view.removeOnAttachStateChangeListener(this);
                Activity activity = (Activity) ((WeakReference) obj2).get();
                IBinder iBinder = (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                if (activity != null && iBinder != null) {
                    ((tz6) obj).c(iBinder, activity);
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.m) {
            case 0:
                break;
            case 1:
                view.getClass();
                break;
            default:
                ((View) this.n).removeOnAttachStateChangeListener(this);
                ((p56) this.f742o).x();
                break;
        }
    }

    public eu2(fu2 fu2Var, av2 av2Var) {
        this.f742o = fu2Var;
        this.n = av2Var;
    }

    public eu2(View view, p56 p56Var) {
        this.n = view;
        this.f742o = p56Var;
    }
}
