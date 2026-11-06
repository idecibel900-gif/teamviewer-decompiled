package o;

import android.app.Application;
import android.app.PictureInPictureUiState;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.LifecycleOwner;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public abstract class my0 extends ly0 implements we8, a53, ai6, p75, n05, n8, u75 {
    public final CopyOnWriteArrayList A;
    public final CopyOnWriteArrayList B;
    public boolean C;
    public boolean D;
    public final kh7 E;
    public final kh7 F;
    public final kh7 G;
    public final io.sentry.android.core.util.a n = new io.sentry.android.core.util.a();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ep3 f1523o = new ep3(new by0(this, (byte) 1));
    public final a65 p;
    public ve8 q;
    public final iy0 r;
    public final kh7 s;
    public final AtomicInteger t;
    public final ky0 u;
    public final CopyOnWriteArrayList v;
    public final CopyOnWriteArrayList w;
    public final CopyOnWriteArrayList x;
    public final CopyOnWriteArrayList y;
    public final CopyOnWriteArrayList z;

    public my0() {
        final byte b = 1;
        a65 a65Var = new a65(new zh6(this, new y26(this, (byte) 7)));
        this.p = a65Var;
        this.r = new iy0(this);
        this.s = new kh7(new cy0(this, b));
        this.t = new AtomicInteger();
        this.u = new ky0(this);
        this.v = new CopyOnWriteArrayList();
        this.w = new CopyOnWriteArrayList();
        this.x = new CopyOnWriteArrayList();
        this.y = new CopyOnWriteArrayList();
        this.z = new CopyOnWriteArrayList();
        this.A = new CopyOnWriteArrayList();
        this.B = new CopyOnWriteArrayList();
        this.E = new kh7(new cy0(this, (byte) 2));
        x84 x84Var = this.m;
        if (x84Var == null) {
            hk0.l("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        final byte b2 = 0;
        x84Var.a(new s84(this) { // from class: o.ey0
            public final /* synthetic */ my0 n;

            {
                this.n = this;
            }

            @Override // o.s84
            public final void e(LifecycleOwner lifecycleOwner, l84 l84Var) {
                Window window;
                View viewPeekDecorView;
                byte b3 = b2;
                my0 my0Var = this.n;
                switch (b3) {
                    case 0:
                        if (l84Var == l84.ON_STOP && (window = my0Var.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        if (l84Var == l84.ON_DESTROY) {
                            my0Var.n.n = null;
                            if (!my0Var.isChangingConfigurations()) {
                                my0Var.o().a();
                            }
                            iy0 iy0Var = my0Var.r;
                            my0 my0Var2 = iy0Var.p;
                            my0Var2.getWindow().getDecorView().removeCallbacks(iy0Var);
                            my0Var2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(iy0Var);
                        }
                        break;
                }
            }
        });
        this.m.a(new s84(this) { // from class: o.ey0
            public final /* synthetic */ my0 n;

            {
                this.n = this;
            }

            @Override // o.s84
            public final void e(LifecycleOwner lifecycleOwner, l84 l84Var) {
                Window window;
                View viewPeekDecorView;
                byte b3 = b;
                my0 my0Var = this.n;
                switch (b3) {
                    case 0:
                        if (l84Var == l84.ON_STOP && (window = my0Var.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        if (l84Var == l84.ON_DESTROY) {
                            my0Var.n.n = null;
                            if (!my0Var.isChangingConfigurations()) {
                                my0Var.o().a();
                            }
                            iy0 iy0Var = my0Var.r;
                            my0 my0Var2 = iy0Var.p;
                            my0Var2.getWindow().getDecorView().removeCallbacks(iy0Var);
                            my0Var2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(iy0Var);
                        }
                        break;
                }
            }
        });
        this.m.a(new u56(this, b));
        a65Var.M0();
        j51.E(this);
        ((a65) a65Var.f302o).Q0("android:support:activity-result", new fy0(this, b2));
        x(new gy0(this, b2));
        this.F = new kh7(new cy0(this, (byte) 3));
        this.G = new kh7(new cy0(this, (byte) 4));
    }

    public static final void B(my0 my0Var) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!im3.n(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!im3.n(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    public final void A() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        decorView6.getClass();
        decorView6.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    public final f8 C(a8 a8Var, e8 e8Var) {
        ky0 ky0Var = this.u;
        ky0Var.getClass();
        return ky0Var.c("activity_rq#" + this.t.getAndIncrement(), this, e8Var, a8Var);
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.r.a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // o.p75
    public final o75 c() {
        return (o75) this.G.getValue();
    }

    @Override // o.n05
    public final j93 e() {
        return c().c().c;
    }

    @Override // o.n8
    public final ky0 g() {
        return this.u;
    }

    @Override // o.u75
    public final void j(c71 c71Var) {
        c71Var.getClass();
        this.v.add(c71Var);
    }

    @Override // o.a53
    public final se8 k() {
        return (se8) this.F.getValue();
    }

    @Override // o.a53
    public final hw4 l() {
        hw4 hw4Var = new hw4(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = hw4Var.a;
        if (application != null) {
            linkedHashMap.put(re8.d, getApplication());
        }
        linkedHashMap.put(j51.u, this);
        linkedHashMap.put(j51.v, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(j51.w, extras);
        }
        return hw4Var;
    }

    @Override // o.u75
    public final void m(c71 c71Var) {
        c71Var.getClass();
        this.v.remove(c71Var);
    }

    @Override // o.we8
    public final ve8 o() {
        if (getApplication() == null) {
            hk0.l("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        ve8 ve8Var = this.q;
        if (ve8Var == null) {
            hy0 hy0Var = (hy0) getLastNonConfigurationInstance();
            if (hy0Var != null) {
                this.q = hy0Var.a;
            }
            ve8Var = this.q;
            if (ve8Var == null) {
                ve8Var = new ve8();
                this.q = ve8Var;
            }
        }
        ve8Var.getClass();
        return ve8Var;
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.u.a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        ((o12) this.E.getValue()).a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator it = this.v.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((c71) it.next()).accept(configuration);
        }
    }

    @Override // o.ly0, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.p.N0(bundle);
        io.sentry.android.core.util.a aVar = this.n;
        aVar.n = this;
        Iterator it = ((CopyOnWriteArraySet) aVar.m).iterator();
        while (it.hasNext()) {
            ((w75) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = ya6.n;
        wa6.b(this);
        getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f1523o.f733o).iterator();
        while (it.hasNext()) {
            ((hq4) it.next()).u(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.f1523o.f733o).iterator();
            while (it.hasNext()) {
                if (((hq4) it.next()).j(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.C = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.C = false;
            Iterator it = this.y.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((c71) it.next()).accept(new sv4(z));
            }
        } catch (Throwable th) {
            this.C = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator it = this.x.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((c71) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.f1523o.f733o).iterator();
        while (it.hasNext()) {
            ((hq4) it.next()).s(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.D = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.D = false;
            Iterator it = this.z.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((c71) it.next()).accept(new pk5(z));
            }
        } catch (Throwable th) {
            this.D = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        rk5 rk5Var;
        pictureInPictureUiState.getClass();
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        int i = Build.VERSION.SDK_INT;
        byte b = 0;
        if (i >= 35) {
            pictureInPictureUiState.isStashed();
            pictureInPictureUiState.isTransitioningToPip();
            rk5Var = new rk5(b);
        } else if (i >= 31) {
            pictureInPictureUiState.isStashed();
            rk5Var = new rk5(b);
        } else {
            rk5Var = new rk5(b);
        }
        Iterator it = this.A.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((c71) it.next()).accept(rk5Var);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f1523o.f733o).iterator();
        while (it.hasNext()) {
            ((hq4) it.next()).x(menu);
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (this.u.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        hy0 hy0Var;
        ve8 ve8Var = this.q;
        if (ve8Var == null && (hy0Var = (hy0) getLastNonConfigurationInstance()) != null) {
            ve8Var = hy0Var.a;
        }
        if (ve8Var == null) {
            return null;
        }
        hy0 hy0Var2 = new hy0();
        hy0Var2.a = ve8Var;
        return hy0Var2;
    }

    @Override // o.ly0, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        x84 x84Var = this.m;
        if (x84Var != null) {
            x84Var.c("setCurrentState");
            x84Var.e(m84.f1446o);
        }
        super.onSaveInstanceState(bundle);
        this.p.O0(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.w.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((c71) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.B.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // o.ai6
    public final a65 r() {
        return (a65) this.p.f302o;
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (x37.n()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            tv2 tv2Var = (tv2) this.s.getValue();
            synchronized (tv2Var.b) {
                try {
                    tv2Var.c = true;
                    Iterator it = tv2Var.d.iterator();
                    while (it.hasNext()) {
                        ((Function0) it.next()).a();
                    }
                    tv2Var.d.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        A();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.r.a(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public final void v(hq4 hq4Var, LifecycleOwner lifecycleOwner) {
        hq4Var.getClass();
        lifecycleOwner.getClass();
        ep3 ep3Var = this.f1523o;
        ep3Var.getClass();
        x84 x84VarZ = ((gv2) lifecycleOwner).getR();
        HashMap map = (HashMap) ep3Var.p;
        mp4 mp4Var = (mp4) map.remove(hq4Var);
        if (mp4Var != null) {
            mp4Var.a.f(mp4Var.b);
            mp4Var.b = null;
        }
        map.put(hq4Var, new mp4(x84VarZ, new dy0(ep3Var, hq4Var)));
    }

    public final void x(w75 w75Var) {
        io.sentry.android.core.util.a aVar = this.n;
        aVar.getClass();
        Context context = (Context) aVar.n;
        if (context != null) {
            w75Var.a(context);
        }
        ((CopyOnWriteArraySet) aVar.m).add(w75Var);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    /* JADX INFO: renamed from: z */
    public final x84 getR() {
        return this.m;
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        A();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.r.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.r.a(decorView);
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.C) {
            return;
        }
        Iterator it = this.y.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((c71) it.next()).accept(new sv4(z));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.D) {
            return;
        }
        Iterator it = this.z.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((c71) it.next()).accept(new pk5(z));
        }
    }
}
