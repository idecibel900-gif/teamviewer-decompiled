package o;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class ut2 implements ComponentCallbacks, View.OnCreateContextMenuListener, LifecycleOwner, we8, a53, ai6 {
    public static final Object o0 = new Object();
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public int E;
    public su2 F;
    public wt2 G;
    public ut2 I;
    public int J;
    public int K;
    public String L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean S;
    public ViewGroup T;
    public View U;
    public boolean V;
    public rt2 X;
    public boolean Y;
    public LayoutInflater Z;
    public boolean a0;
    public String b0;
    public m84 c0;
    public x84 d0;
    public final io.sentry.android.core.util.a e0;
    public gv2 f0;
    public final nw4 g0;
    public bi6 h0;
    public a65 i0;
    public final qt2 j0;
    public final AtomicInteger k0;
    public final ArrayList l0;
    public final ot2 m0;
    public Bundle n;
    public final ot2 n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SparseArray f2247o;
    public Bundle p;
    public Bundle r;
    public ut2 s;
    public int u;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public int m = -1;
    public String q = UUID.randomUUID().toString();
    public String t = null;
    public Boolean v = null;
    public su2 H = new su2();
    public final boolean R = true;
    public boolean W = true;

    public ut2() {
        new mt8((Object) this, (byte) 11);
        this.c0 = m84.q;
        this.e0 = new io.sentry.android.core.util.a();
        this.g0 = new nw4();
        this.j0 = new qt2(this);
        this.k0 = new AtomicInteger();
        this.l0 = new ArrayList();
        this.m0 = new ot2(this, (byte) 0);
        this.n0 = new ot2(this, (byte) 1);
        M();
    }

    public lv1 A() {
        return new pt2(this);
    }

    public final rt2 B() {
        rt2 rt2Var = this.X;
        if (rt2Var != null) {
            return rt2Var;
        }
        rt2 rt2Var2 = new rt2();
        Object obj = o0;
        rt2Var2.g = obj;
        rt2Var2.h = obj;
        rt2Var2.i = obj;
        rt2Var2.j = 1.0f;
        rt2Var2.k = null;
        this.X = rt2Var2;
        return rt2Var2;
    }

    public final xt2 C() {
        wt2 wt2Var = this.G;
        if (wt2Var == null) {
            return null;
        }
        return (xt2) wt2Var.s;
    }

    public final su2 D() {
        if (this.G != null) {
            return this.H;
        }
        hk0.l(e41.i("Fragment ", this, " has not been attached yet."));
        return null;
    }

    public final Context E() {
        wt2 wt2Var = this.G;
        if (wt2Var == null) {
            return null;
        }
        return wt2Var.t;
    }

    public final int F() {
        m84 m84Var = this.c0;
        return (m84Var == m84.n || this.I == null) ? m84Var.ordinal() : Math.min(m84Var.ordinal(), this.I.F());
    }

    public final su2 G() {
        su2 su2Var = this.F;
        if (su2Var != null) {
            return su2Var;
        }
        hk0.l(e41.i("Fragment ", this, " not associated with a fragment manager."));
        return null;
    }

    public final Resources H() {
        return r0().getResources();
    }

    public final String I(int i) {
        return H().getString(i);
    }

    public final String J(int i, Object... objArr) {
        return H().getString(i, objArr);
    }

    public final ut2 K(boolean z) {
        String str;
        if (z) {
            bv2 bv2Var = cv2.a;
            cv2.b(new cz2(this, "Attempting to get target fragment from fragment " + this));
            cv2.a(this).getClass();
        }
        ut2 ut2Var = this.s;
        if (ut2Var != null) {
            return ut2Var;
        }
        su2 su2Var = this.F;
        if (su2Var == null || (str = this.t) == null) {
            return null;
        }
        return su2Var.c.K(str);
    }

    public final gv2 L() {
        gv2 gv2Var = this.f0;
        if (gv2Var != null) {
            return gv2Var;
        }
        hk0.l(e41.i("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
        return null;
    }

    public final void M() {
        this.d0 = new x84(this, true);
        this.i0 = new a65(new zh6(this, new y26(this, (byte) 7)));
        this.h0 = null;
        ArrayList arrayList = this.l0;
        ot2 ot2Var = this.m0;
        if (!arrayList.contains(ot2Var)) {
            if (this.m >= 0) {
                ot2Var.a();
            } else {
                arrayList.add(ot2Var);
            }
        }
        ot2 ot2Var2 = this.n0;
        if (arrayList.contains(ot2Var2)) {
            return;
        }
        if (this.m >= 0) {
            ot2Var2.a();
        } else {
            arrayList.add(ot2Var2);
        }
    }

    public final void N() {
        M();
        this.b0 = this.q;
        this.q = UUID.randomUUID().toString();
        this.w = false;
        this.x = false;
        this.z = false;
        this.A = false;
        this.C = false;
        this.E = 0;
        this.F = null;
        this.H = new su2();
        this.G = null;
        this.J = 0;
        this.K = 0;
        this.L = null;
        this.M = false;
        this.N = false;
    }

    public final boolean O() {
        return this.G != null && this.w;
    }

    public final boolean P() {
        if (this.M) {
            return true;
        }
        su2 su2Var = this.F;
        if (su2Var != null) {
            ut2 ut2Var = this.I;
            su2Var.getClass();
            if (ut2Var == null ? false : ut2Var.P()) {
                return true;
            }
        }
        return false;
    }

    public final boolean Q() {
        return this.E > 0;
    }

    public final boolean R() {
        View view;
        return (!O() || P() || (view = this.U) == null || view.getWindowToken() == null || this.U.getVisibility() != 0) ? false : true;
    }

    public void S() {
        this.S = true;
    }

    public void T(int i, int i2, Intent intent) {
        if (su2.M(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public void U(Context context) {
        this.S = true;
        wt2 wt2Var = this.G;
        if ((wt2Var == null ? null : wt2Var.s) != null) {
            this.S = true;
        }
    }

    public void V(ut2 ut2Var) {
    }

    public boolean W(MenuItem menuItem) {
        return false;
    }

    public void X(Bundle bundle) {
        Bundle bundle2;
        this.S = true;
        Bundle bundle3 = this.n;
        if (bundle3 != null && (bundle2 = bundle3.getBundle("childFragmentManager")) != null) {
            this.H.a0(bundle2);
            su2 su2Var = this.H;
            su2Var.I = false;
            su2Var.J = false;
            su2Var.P.s = false;
            su2Var.v(1);
        }
        su2 su2Var2 = this.H;
        if (su2Var2.w >= 1) {
            return;
        }
        su2Var2.I = false;
        su2Var2.J = false;
        su2Var2.P.s = false;
        su2Var2.v(1);
    }

    public void Y(Menu menu, MenuInflater menuInflater) {
    }

    public View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public void a0() {
        this.S = true;
    }

    public void b0() {
        this.S = true;
    }

    public void c0() {
        this.S = true;
    }

    public LayoutInflater d0(Bundle bundle) {
        wt2 wt2Var = this.G;
        if (wt2Var == null) {
            hk0.l("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
            return null;
        }
        xt2 xt2Var = wt2Var.w;
        LayoutInflater layoutInflaterCloneInContext = xt2Var.getLayoutInflater().cloneInContext(xt2Var);
        layoutInflaterCloneInContext.setFactory2(this.H.f);
        return layoutInflaterCloneInContext;
    }

    public boolean e0(MenuItem menuItem) {
        return false;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public void f0() {
        this.S = true;
    }

    public void g0() {
        this.S = true;
    }

    public void h0(Bundle bundle) {
    }

    public void i0() {
        this.S = true;
    }

    public void j0() {
        this.S = true;
    }

    @Override // o.a53
    public final se8 k() {
        Application application = null;
        if (this.F == null) {
            hk0.l("Can't access ViewModels from detached fragment");
            return null;
        }
        bi6 bi6Var = this.h0;
        if (bi6Var != null) {
            return bi6Var;
        }
        for (Context applicationContext = r0().getApplicationContext(); applicationContext instanceof ContextWrapper; applicationContext = ((ContextWrapper) applicationContext).getBaseContext()) {
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
        }
        if (application == null && su2.M(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + r0().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        bi6 bi6Var2 = new bi6(application, this, this.r);
        this.h0 = bi6Var2;
        return bi6Var2;
    }

    public void k0(View view, Bundle bundle) {
    }

    @Override // o.a53
    public final hw4 l() {
        Application application;
        Context applicationContext = r0().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && su2.M(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + r0().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        hw4 hw4Var = new hw4(0);
        LinkedHashMap linkedHashMap = hw4Var.a;
        if (application != null) {
            linkedHashMap.put(re8.d, application);
        }
        linkedHashMap.put(j51.u, this);
        linkedHashMap.put(j51.v, this);
        Bundle bundle = this.r;
        if (bundle != null) {
            linkedHashMap.put(j51.w, bundle);
        }
        return hw4Var;
    }

    public void l0(Bundle bundle) {
        this.S = true;
    }

    public void m0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.H.T();
        this.D = true;
        this.f0 = new gv2(this, o(), new jt2(this, (byte) 13));
        this.j0.a(new lt2((Object) this, (Object) layoutInflater, (Object) viewGroup, (Object) bundle, (byte) 0), "Fragment#onCreateView");
        View view = this.U;
        gv2 gv2Var = this.f0;
        if (view == null) {
            if (gv2Var.q == null) {
                this.f0 = null;
                return;
            } else {
                hk0.l("Called getViewLifecycleOwner() but onCreateView() returned null");
                return;
            }
        }
        gv2Var.e();
        if (su2.M(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.U + " for Fragment " + this);
        }
        View view2 = this.U;
        gv2 gv2Var2 = this.f0;
        view2.getClass();
        view2.setTag(R.id.view_tree_lifecycle_owner, gv2Var2);
        View view3 = this.U;
        gv2 gv2Var3 = this.f0;
        view3.getClass();
        view3.setTag(R.id.view_tree_view_model_store_owner, gv2Var3);
        View view4 = this.U;
        gv2 gv2Var4 = this.f0;
        view4.getClass();
        view4.setTag(R.id.view_tree_saved_state_registry_owner, gv2Var4);
        this.g0.setValue(this.f0);
    }

    public final void n0() {
        Bundle bundle = this.n;
        this.j0.a(new kt2(this, bundle != null ? bundle.getBundle("savedInstanceState") : null, (byte) 3), "Fragment#onViewCreated");
        this.H.v(2);
    }

    @Override // o.we8
    public final ve8 o() {
        if (this.F == null) {
            hk0.l("Can't access ViewModels from detached fragment");
            return null;
        }
        if (F() == 1) {
            hk0.l("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
            return null;
        }
        HashMap map = this.F.P.p;
        ve8 ve8Var = (ve8) map.get(this.q);
        if (ve8Var != null) {
            return ve8Var;
        }
        ve8 ve8Var2 = new ve8();
        map.put(this.q, ve8Var2);
        return ve8Var2;
    }

    public final f8 o0(a8 a8Var, e8 e8Var) {
        qt2 qt2Var = new qt2(this);
        if (this.m > 1) {
            hk0.l(e41.i("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
            return null;
        }
        AtomicReference atomicReference = new AtomicReference();
        mt2 mt2Var = new mt2(this, qt2Var, atomicReference, e8Var, a8Var);
        if (this.m >= 0) {
            mt2Var.a();
        } else {
            this.l0.add(mt2Var);
        }
        return new nt2(atomicReference);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.S = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        p0().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.S = true;
    }

    public final xt2 p0() {
        xt2 xt2VarC = C();
        if (xt2VarC != null) {
            return xt2VarC;
        }
        hk0.l(e41.i("Fragment ", this, " not attached to an activity."));
        return null;
    }

    public final Bundle q0() {
        Bundle bundle = this.r;
        if (bundle != null) {
            return bundle;
        }
        hk0.l(e41.i("Fragment ", this, " does not have any arguments."));
        return null;
    }

    @Override // o.ai6
    public final a65 r() {
        return (a65) this.i0.f302o;
    }

    public final Context r0() {
        Context contextE = E();
        if (contextE != null) {
            return contextE;
        }
        hk0.l(e41.i("Fragment ", this, " not attached to a context."));
        return null;
    }

    public final View s0() {
        View view = this.U;
        if (view != null) {
            return view;
        }
        hk0.l(e41.i("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
        return null;
    }

    public final void t0(int i, int i2, int i3, int i4) {
        if (this.X == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        B().b = i;
        B().c = i2;
        B().d = i3;
        B().e = i4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.q);
        if (this.J != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.J));
        }
        if (this.L != null) {
            sb.append(" tag=");
            sb.append(this.L);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u0(Bundle bundle) {
        su2 su2Var = this.F;
        if (su2Var != null) {
            if (su2Var == null ? false : su2Var.R()) {
                hk0.l("Fragment already added and state has been saved");
                return;
            }
        }
        this.r = bundle;
    }

    public final void v0(boolean z) {
        if (this.Q != z) {
            this.Q = z;
            if (!O() || P()) {
                return;
            }
            this.G.w.invalidateOptionsMenu();
        }
    }

    public final void w0() {
        bv2 bv2Var = cv2.a;
        cv2.b(new cv6(this, "Attempting to set retain instance for fragment " + this));
        cv2.a(this).getClass();
        this.O = true;
        su2 su2Var = this.F;
        if (su2Var != null) {
            su2Var.P.V0(this);
        } else {
            this.P = true;
        }
    }

    public final void x0(ut2 ut2Var) {
        if (ut2Var != null) {
            bv2 bv2Var = cv2.a;
            cv2.b(new ev6(this, "Attempting to set target fragment " + ut2Var + " with request code 0 for fragment " + this));
            cv2.a(this).getClass();
        }
        su2 su2Var = this.F;
        su2 su2Var2 = ut2Var != null ? ut2Var.F : null;
        if (su2Var != null && su2Var2 != null && su2Var != su2Var2) {
            hk0.g(e41.i("Fragment ", ut2Var, " must share the same FragmentManager to be set as a target fragment"));
            return;
        }
        for (ut2 ut2VarK = ut2Var; ut2VarK != null; ut2VarK = ut2VarK.K(false)) {
            if (ut2VarK == this) {
                throw new IllegalArgumentException("Setting " + ut2Var + " as the target of " + this + " would create a target cycle");
            }
        }
        if (ut2Var == null) {
            this.t = null;
            this.s = null;
        } else if (this.F == null || ut2Var.F == null) {
            this.t = null;
            this.s = ut2Var;
        } else {
            this.t = ut2Var.q;
            this.s = null;
        }
        this.u = 0;
    }

    public final void y0(Intent intent) {
        wt2 wt2Var = this.G;
        if (wt2Var == null) {
            hk0.l(e41.i("Fragment ", this, " not attached to Activity"));
        } else {
            intent.getClass();
            wt2Var.t.startActivity(intent, null);
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    /* JADX INFO: renamed from: z */
    public final x84 getR() {
        return this.d0;
    }

    public final void z0(Intent intent, int i) {
        if (this.G == null) {
            hk0.l(e41.i("Fragment ", this, " not attached to Activity"));
            return;
        }
        su2 su2VarG = G();
        if (su2VarG.D != null) {
            String str = this.q;
            nu2 nu2Var = new nu2();
            nu2Var.m = str;
            nu2Var.n = i;
            su2VarG.G.addLast(nu2Var);
            su2VarG.D.a(intent, null);
            return;
        }
        wt2 wt2Var = su2VarG.x;
        wt2Var.getClass();
        intent.getClass();
        if (i == -1) {
            wt2Var.t.startActivity(intent, null);
        } else {
            hk0.l("Starting activity with a requestCode requires a FragmentActivity host");
        }
    }
}
