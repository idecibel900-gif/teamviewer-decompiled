package o;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.LifecycleOwner;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public class py0 extends Dialog implements LifecycleOwner, p75, n05, ai6 {
    public x84 m;
    public final a65 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final kh7 f1787o;
    public final kh7 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public py0(Context context, int i) {
        super(context, i);
        context.getClass();
        this.n = new a65(new zh6(this, new y26(this, (byte) 7)));
        final byte b = 0;
        this.f1787o = new kh7(new Function0(this) { // from class: o.oy0
            public final /* synthetic */ py0 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b2 = b;
                py0 py0Var = this.n;
                switch (b2) {
                    case 0:
                        o12 o12Var = new o12();
                        py0Var.e().A(o12Var);
                        return o12Var;
                    default:
                        return new o75(new pc0(py0Var, (byte) 7));
                }
            }
        });
        final byte b2 = 1;
        this.p = new kh7(new Function0(this) { // from class: o.oy0
            public final /* synthetic */ py0 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b3 = b2;
                py0 py0Var = this.n;
                switch (b3) {
                    case 0:
                        o12 o12Var = new o12();
                        py0Var.e().A(o12Var);
                        return o12Var;
                    default:
                        return new o75(new pc0(py0Var, (byte) 7));
                }
            }
        });
    }

    public static final void g(py0 py0Var) {
        super.onBackPressed();
    }

    public final x84 a() {
        x84 x84Var = this.m;
        if (x84Var != null) {
            return x84Var;
        }
        x84 x84Var2 = new x84(this, true);
        this.m = x84Var2;
        return x84Var2;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        f();
        super.addContentView(view, layoutParams);
    }

    @Override // o.p75
    public final o75 c() {
        return (o75) this.p.getValue();
    }

    @Override // o.n05
    public final j93 e() {
        return c().c().c;
    }

    public final void f() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        Window window4 = getWindow();
        window4.getClass();
        View decorView4 = window4.getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((o12) this.f1787o.getValue()).a();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            o75 o75VarC = c();
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            o75VarC.e(onBackInvokedDispatcher);
        }
        this.n.N0(bundle);
        a().d(l84.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        bundleOnSaveInstanceState.getClass();
        this.n.O0(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        a().d(l84.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        a().d(l84.ON_DESTROY);
        this.m = null;
        super.onStop();
    }

    @Override // o.ai6
    public final a65 r() {
        return (a65) this.n.f302o;
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        view.getClass();
        f();
        super.setContentView(view);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    /* JADX INFO: renamed from: z */
    public final x84 getR() {
        return a();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        f();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        f();
        super.setContentView(view, layoutParams);
    }
}
