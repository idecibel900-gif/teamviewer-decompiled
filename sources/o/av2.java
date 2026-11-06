package o;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.FragmentContainerView;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.chromium.support_lib_boundary.ProcessGlobalConfigConstants;

/* JADX INFO: loaded from: classes.dex */
public final class av2 {
    public final yt2 a;
    public final j93 b;
    public final ut2 c;
    public boolean d = false;
    public int e = -1;

    public av2(yt2 yt2Var, j93 j93Var, ClassLoader classLoader, ku2 ku2Var, Bundle bundle) {
        this.a = yt2Var;
        this.b = j93Var;
        zu2 zu2Var = (zu2) bundle.getParcelable("state");
        ut2 ut2VarA = ku2Var.a(zu2Var.m);
        ut2VarA.q = zu2Var.n;
        ut2VarA.z = zu2Var.f2735o;
        ut2VarA.B = zu2Var.p;
        ut2VarA.C = true;
        ut2VarA.J = zu2Var.q;
        ut2VarA.K = zu2Var.r;
        ut2VarA.L = zu2Var.s;
        ut2VarA.O = zu2Var.t;
        ut2VarA.x = zu2Var.u;
        ut2VarA.N = zu2Var.v;
        ut2VarA.M = zu2Var.w;
        ut2VarA.c0 = m84.values()[zu2Var.x];
        ut2VarA.t = zu2Var.y;
        ut2VarA.u = zu2Var.z;
        ut2VarA.W = zu2Var.A;
        this.c = ut2VarA;
        ut2VarA.n = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        ut2VarA.u0(bundle2);
        if (su2.M(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + ut2VarA);
        }
    }

    public final void a() {
        boolean zM = su2.M(3);
        ut2 ut2Var = this.c;
        if (zM) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + ut2Var);
        }
        Bundle bundle = ut2Var.n;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        ut2Var.H.T();
        ut2Var.m = 3;
        ut2Var.S = false;
        qt2 qt2Var = ut2Var.j0;
        qt2Var.a(new jt2(ut2Var, bundle2), "Fragment#onActivityCreated");
        if (!ut2Var.S) {
            throw new qe7(e41.i("Fragment ", ut2Var, " did not call through to super.onActivityCreated()"));
        }
        if (su2.M(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + ut2Var);
        }
        if (ut2Var.U != null) {
            Bundle bundle3 = ut2Var.n;
            Bundle bundle4 = bundle3 != null ? bundle3.getBundle("savedInstanceState") : null;
            SparseArray<Parcelable> sparseArray = ut2Var.f2247o;
            if (sparseArray != null) {
                ut2Var.U.restoreHierarchyState(sparseArray);
                ut2Var.f2247o = null;
            }
            ut2Var.S = false;
            qt2Var.a(new kt2(ut2Var, bundle4, (byte) 2), "Fragment#onViewStateRestored");
            if (!ut2Var.S) {
                throw new qe7(e41.i("Fragment ", ut2Var, " did not call through to super.onViewStateRestored()"));
            }
            if (ut2Var.U != null) {
                qt2Var.a(new jt2(ut2Var, (byte) 14), "FragmentViewLifecycle#handleLifecycleEvent(ON_CREATE)");
            }
        }
        ut2Var.n = null;
        su2 su2Var = ut2Var.H;
        su2Var.I = false;
        su2Var.J = false;
        su2Var.P.s = false;
        su2Var.v(4);
        this.a.h(ut2Var, false);
    }

    public final void b() {
        ut2 ut2Var;
        View view;
        View view2;
        ut2 ut2Var2 = this.c;
        View view3 = ut2Var2.T;
        while (true) {
            ut2Var = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(R.id.fragment_container_view_tag);
            ut2 ut2Var3 = tag instanceof ut2 ? (ut2) tag : null;
            if (ut2Var3 != null) {
                ut2Var = ut2Var3;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        ut2 ut2Var4 = ut2Var2.I;
        if (ut2Var != null && ut2Var != ut2Var4) {
            int i = ut2Var2.K;
            bv2 bv2Var = cv2.a;
            StringBuilder sb = new StringBuilder("Attempting to nest fragment ");
            sb.append(ut2Var2);
            sb.append(" within the view of parent fragment ");
            sb.append(ut2Var);
            sb.append(" via container with ID ");
            cv2.b(new bo8(ut2Var2, to7.l(sb, i, " without using parent's childFragmentManager")));
            cv2.a(ut2Var2).getClass();
        }
        ArrayList arrayList = (ArrayList) this.b.n;
        ViewGroup viewGroup = ut2Var2.T;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            int iIndexOf = arrayList.indexOf(ut2Var2);
            for (int i2 = iIndexOf - 1; i2 >= 0; i2--) {
                ut2 ut2Var5 = (ut2) arrayList.get(i2);
                if (ut2Var5.T == viewGroup && (view2 = ut2Var5.U) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                }
            }
            while (true) {
                iIndexOf++;
                if (iIndexOf >= arrayList.size()) {
                    break;
                }
                ut2 ut2Var6 = (ut2) arrayList.get(iIndexOf);
                if (ut2Var6.T == viewGroup && (view = ut2Var6.U) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view);
                    break;
                }
            }
        }
        ut2Var2.T.addView(ut2Var2.U, iIndexOfChild);
    }

    public final void c() {
        boolean zM = su2.M(3);
        ut2 ut2Var = this.c;
        if (zM) {
            Log.d("FragmentManager", "moveto ATTACHED: " + ut2Var);
        }
        ut2 ut2Var2 = ut2Var.s;
        av2 av2Var = null;
        j93 j93Var = this.b;
        if (ut2Var2 != null) {
            av2 av2Var2 = (av2) ((HashMap) j93Var.f1141o).get(ut2Var2.q);
            if (av2Var2 == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(ut2Var);
                ut2 ut2Var3 = ut2Var.s;
                sb.append(" declared target fragment ");
                sb.append(ut2Var3);
                sb.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb.toString());
            }
            ut2Var.t = ut2Var.s.q;
            ut2Var.s = null;
            av2Var = av2Var2;
        } else {
            String str = ut2Var.t;
            if (str != null && (av2Var = (av2) ((HashMap) j93Var.f1141o).get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(ut2Var);
                sb2.append(" declared target fragment ");
                hk0.l(e41.l(sb2, ut2Var.t, " that does not belong to this FragmentManager!"));
                return;
            }
        }
        if (av2Var != null) {
            av2Var.k();
        }
        su2 su2Var = ut2Var.F;
        ut2Var.G = su2Var.x;
        ut2Var.I = su2Var.z;
        yt2 yt2Var = this.a;
        yt2Var.p(ut2Var, false);
        ArrayList arrayList = ut2Var.l0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((tt2) it.next()).a();
        }
        arrayList.clear();
        ut2Var.H.b(ut2Var.G, ut2Var.A(), ut2Var);
        ut2Var.m = 0;
        ut2Var.S = false;
        ut2Var.j0.a(new jt2(ut2Var, (byte) 20), "Fragment#onAttach");
        if (!ut2Var.S) {
            throw new qe7(e41.i("Fragment ", ut2Var, " did not call through to super.onAttach()"));
        }
        Iterator it2 = ut2Var.F.q.iterator();
        while (it2.hasNext()) {
            ((wu2) it2.next()).a(ut2Var);
        }
        su2 su2Var2 = ut2Var.H;
        su2Var2.I = false;
        su2Var2.J = false;
        su2Var2.P.s = false;
        su2Var2.v(0);
        yt2Var.i(ut2Var, false);
    }

    public final int d() {
        ut2 ut2Var = this.c;
        if (ut2Var.F == null) {
            return ut2Var.m;
        }
        int iMin = this.e;
        int iOrdinal = ut2Var.c0.ordinal();
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (ut2Var.z) {
            boolean z = ut2Var.A;
            int i = this.e;
            if (z) {
                iMin = Math.max(i, 2);
                View view = ut2Var.U;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = i < 4 ? Math.min(iMin, ut2Var.m) : Math.min(iMin, 1);
            }
        }
        if (ut2Var.B && ut2Var.T == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!ut2Var.w) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = ut2Var.T;
        r77 r77Var = null;
        if (viewGroup != null) {
            ll1 ll1VarI = ll1.i(viewGroup, ut2Var.G());
            q77 q77VarF = ll1VarI.f(ut2Var);
            r77 r77Var2 = q77VarF != null ? q77VarF.b : null;
            q77 q77VarG = ll1VarI.g(ut2Var);
            r77Var = q77VarG != null ? q77VarG.b : null;
            int i2 = r77Var2 == null ? -1 : t77.a[r77Var2.ordinal()];
            if (i2 != -1 && i2 != 1) {
                r77Var = r77Var2;
            }
        }
        if (r77Var == r77.n) {
            iMin = Math.min(iMin, 6);
        } else if (r77Var == r77.f1900o) {
            iMin = Math.max(iMin, 3);
        } else if (ut2Var.x) {
            iMin = ut2Var.Q() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (ut2Var.V && ut2Var.m < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (ut2Var.y) {
            iMin = Math.max(iMin, 3);
        }
        if (su2.M(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + ut2Var);
        }
        return iMin;
    }

    public final void e() {
        Bundle bundle;
        byte b = 3;
        boolean zM = su2.M(3);
        ut2 ut2Var = this.c;
        if (zM) {
            Log.d("FragmentManager", "moveto CREATED: " + ut2Var);
        }
        Bundle bundle2 = ut2Var.n;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
        if (ut2Var.a0) {
            ut2Var.m = 1;
            Bundle bundle4 = ut2Var.n;
            if (bundle4 == null || (bundle = bundle4.getBundle("childFragmentManager")) == null) {
                return;
            }
            ut2Var.H.a0(bundle);
            su2 su2Var = ut2Var.H;
            su2Var.I = false;
            su2Var.J = false;
            su2Var.P.s = false;
            su2Var.v(1);
            return;
        }
        yt2 yt2Var = this.a;
        yt2Var.q(ut2Var, false);
        ut2Var.H.T();
        ut2Var.m = 1;
        ut2Var.S = false;
        ut2Var.d0.a(new u56(ut2Var, b));
        qt2 qt2Var = ut2Var.j0;
        qt2Var.a(new kt2(ut2Var, bundle3, (byte) 1), "Fragment#onCreate");
        ut2Var.a0 = true;
        if (!ut2Var.S) {
            throw new qe7(e41.i("Fragment ", ut2Var, " did not call through to super.onCreate()"));
        }
        qt2Var.a(new jt2(ut2Var, (byte) 12), "FragmentLifecycle#handleLifecycleEvent(ON_CREATE)");
        yt2Var.l(ut2Var, bundle3, false);
    }

    public final void f() {
        String resourceName;
        ut2 ut2Var = this.c;
        if (ut2Var.z) {
            return;
        }
        if (su2.M(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + ut2Var);
        }
        Bundle bundle = ut2Var.n;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterD0 = ut2Var.d0(bundle2);
        ut2Var.Z = layoutInflaterD0;
        ViewGroup viewGroup2 = ut2Var.T;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = ut2Var.K;
            if (i != 0) {
                if (i == -1) {
                    hk0.g(e41.i("Cannot create fragment ", ut2Var, " for a container view with no id"));
                    return;
                }
                viewGroup = (ViewGroup) ut2Var.F.y.R(i);
                if (viewGroup == null) {
                    if (!ut2Var.C && !ut2Var.B) {
                        try {
                            resourceName = ut2Var.H().getResourceName(ut2Var.K);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(ut2Var.K) + " (" + resourceName + ") for fragment " + ut2Var);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    bv2 bv2Var = cv2.a;
                    cv2.b(new ao8(ut2Var, "Attempting to add fragment " + ut2Var + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    cv2.a(ut2Var).getClass();
                }
            }
        }
        ut2Var.T = viewGroup;
        ut2Var.m0(layoutInflaterD0, viewGroup, bundle2);
        if (ut2Var.U != null) {
            if (su2.M(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + ut2Var);
            }
            ut2Var.U.setSaveFromParentEnabled(false);
            ut2Var.U.setTag(R.id.fragment_container_view_tag, ut2Var);
            if (viewGroup != null) {
                b();
            }
            if (ut2Var.M) {
                ut2Var.U.setVisibility(8);
            }
            boolean zIsAttachedToWindow = ut2Var.U.isAttachedToWindow();
            View view = ut2Var.U;
            if (zIsAttachedToWindow) {
                WeakHashMap weakHashMap = be8.a;
                view.requestApplyInsets();
            } else {
                view.addOnAttachStateChangeListener(new a0(view, (byte) 4));
            }
            ut2Var.n0();
            this.a.v(ut2Var, ut2Var.U, bundle2, false);
            int visibility = ut2Var.U.getVisibility();
            ut2Var.B().j = ut2Var.U.getAlpha();
            if (ut2Var.T != null && visibility == 0) {
                View viewFindFocus = ut2Var.U.findFocus();
                if (viewFindFocus != null) {
                    ut2Var.B().k = viewFindFocus;
                    if (su2.M(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + ut2Var);
                    }
                }
                ut2Var.U.setAlpha(0.0f);
            }
        }
        ut2Var.m = 2;
    }

    public final void g() {
        ut2 ut2VarK;
        byte b = 3;
        boolean zM = su2.M(3);
        ut2 ut2Var = this.c;
        if (zM) {
            Log.d("FragmentManager", "movefrom CREATED: " + ut2Var);
        }
        boolean zIsChangingConfigurations = true;
        boolean z = ut2Var.x && !ut2Var.Q();
        j93 j93Var = this.b;
        if (z) {
            j93Var.d0(ut2Var.q, null);
        }
        if (!z) {
            uu2 uu2Var = (uu2) j93Var.q;
            if (!((uu2Var.n.containsKey(ut2Var.q) && uu2Var.q) ? uu2Var.r : true)) {
                String str = ut2Var.t;
                if (str != null && (ut2VarK = j93Var.K(str)) != null && ut2VarK.O) {
                    ut2Var.s = ut2VarK;
                }
                ut2Var.m = 0;
                return;
            }
        }
        wt2 wt2Var = ut2Var.G;
        if (wt2Var != null) {
            zIsChangingConfigurations = ((uu2) j93Var.q).r;
        } else {
            Context context = wt2Var.t;
            if (context instanceof Activity) {
                zIsChangingConfigurations = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (z || zIsChangingConfigurations) {
            ((uu2) j93Var.q).X0(ut2Var, false);
        }
        ut2Var.H.m();
        qt2 qt2Var = ut2Var.j0;
        qt2Var.a(new jt2(ut2Var, b), "FragmentLifecycle#handleLifecycleEvent(ON_DESTROY)");
        ut2Var.m = 0;
        ut2Var.S = false;
        ut2Var.a0 = false;
        qt2Var.a(new jt2(ut2Var, (byte) 4), "Fragment#onDestroy");
        if (!ut2Var.S) {
            throw new qe7(e41.i("Fragment ", ut2Var, " did not call through to super.onDestroy()"));
        }
        this.a.m(ut2Var, false);
        for (av2 av2Var : j93Var.N()) {
            if (av2Var != null) {
                ut2 ut2Var2 = av2Var.c;
                if (ut2Var.q.equals(ut2Var2.t)) {
                    ut2Var2.s = ut2Var;
                    ut2Var2.t = null;
                }
            }
        }
        String str2 = ut2Var.t;
        if (str2 != null) {
            ut2Var.s = j93Var.K(str2);
        }
        j93Var.Y(this);
    }

    public final void h() {
        View view;
        boolean zM = su2.M(3);
        ut2 ut2Var = this.c;
        if (zM) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + ut2Var);
        }
        ViewGroup viewGroup = ut2Var.T;
        if (viewGroup != null && (view = ut2Var.U) != null) {
            viewGroup.removeView(view);
        }
        qt2 qt2Var = ut2Var.j0;
        ut2Var.H.v(1);
        if (ut2Var.U != null) {
            gv2 gv2Var = ut2Var.f0;
            gv2Var.e();
            if (gv2Var.q.i.compareTo(m84.f1446o) >= 0) {
                qt2Var.a(new jt2(ut2Var, (byte) 9), "FragmentViewLifecycle#handleLifecycleEvent(ON_DESTROY)");
            }
        }
        ut2Var.m = 1;
        ut2Var.S = false;
        qt2Var.a(new jt2(ut2Var, (byte) 11), "Fragment#onDestroyView");
        if (!ut2Var.S) {
            throw new qe7(e41.i("Fragment ", ut2Var, " did not call through to super.onDestroyView()"));
        }
        n77 n77Var = ((sc4) yt2.C(ut2Var).f2642o).n;
        if (n77Var.f1550o > 0) {
            n77Var.d(0).getClass();
            io.sentry.h2.f();
            return;
        }
        ut2Var.D = false;
        this.a.w(ut2Var, false);
        ut2Var.T = null;
        ut2Var.U = null;
        ut2Var.f0 = null;
        ut2Var.g0.setValue(null);
        ut2Var.A = false;
    }

    public final void i() {
        if (su2.M(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.c);
        }
        ut2 ut2Var = this.c;
        ut2Var.m = -1;
        ut2Var.S = false;
        ut2Var.j0.a(new jt2(ut2Var, (byte) 5), "Fragment#onDetach");
        ut2Var.Z = null;
        if (!ut2Var.S) {
            throw new qe7(e41.i("Fragment ", ut2Var, " did not call through to super.onDetach()"));
        }
        su2 su2Var = ut2Var.H;
        if (!su2Var.K) {
            su2Var.m();
            ut2Var.H = new su2();
        }
        this.a.n(this.c, false);
        ut2 ut2Var2 = this.c;
        ut2Var2.m = -1;
        ut2Var2.G = null;
        ut2Var2.e0.n = null;
        ut2 ut2Var3 = this.c;
        ut2Var3.I = null;
        ut2Var3.F = null;
        if (!ut2Var3.x || ut2Var3.Q()) {
            uu2 uu2Var = (uu2) this.b.q;
            if (!((uu2Var.n.containsKey(this.c.q) && uu2Var.q) ? uu2Var.r : true)) {
                return;
            }
        }
        if (su2.M(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + this.c);
        }
        this.c.N();
    }

    public final void j() {
        ut2 ut2Var = this.c;
        if (ut2Var.z && ut2Var.A && !ut2Var.D) {
            if (su2.M(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + ut2Var);
            }
            Bundle bundle = ut2Var.n;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            LayoutInflater layoutInflaterD0 = ut2Var.d0(bundle2);
            ut2Var.Z = layoutInflaterD0;
            ut2Var.m0(layoutInflaterD0, null, bundle2);
            View view = ut2Var.U;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                ut2Var.U.setTag(R.id.fragment_container_view_tag, ut2Var);
                if (ut2Var.M) {
                    ut2Var.U.setVisibility(8);
                }
                ut2Var.n0();
                this.a.v(ut2Var, ut2Var.U, bundle2, false);
                ut2Var.m = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        j93 j93Var = this.b;
        boolean z = this.d;
        ut2 ut2Var = this.c;
        if (z) {
            if (su2.M(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + ut2Var);
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z2 = false;
            while (true) {
                int iD = d();
                int i = ut2Var.m;
                if (iD == i) {
                    if (!z2 && i == -1 && ut2Var.x && !ut2Var.Q()) {
                        if (su2.M(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + ut2Var);
                        }
                        ((uu2) j93Var.q).X0(ut2Var, true);
                        j93Var.Y(this);
                        if (su2.M(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + ut2Var);
                        }
                        ut2Var.N();
                    }
                    if (ut2Var.Y) {
                        if (ut2Var.U != null && (viewGroup = ut2Var.T) != null) {
                            ll1 ll1VarI = ll1.i(viewGroup, ut2Var.G());
                            boolean z3 = ut2Var.M;
                            r77 r77Var = r77.m;
                            if (z3) {
                                if (su2.M(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + ut2Var);
                                }
                                ll1VarI.d(s77.p, r77Var, this);
                            } else {
                                if (su2.M(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + ut2Var);
                                }
                                ll1VarI.d(s77.f1990o, r77Var, this);
                            }
                        }
                        su2 su2Var = ut2Var.F;
                        if (su2Var != null && ut2Var.w && su2.N(ut2Var)) {
                            su2Var.H = true;
                        }
                        ut2Var.Y = false;
                        ut2Var.H.p();
                    }
                    return;
                }
                if (iD <= i) {
                    switch (i - 1) {
                        case ProcessGlobalConfigConstants.UI_THREAD_STARTUP_MODE_DEFAULT /* -1 */:
                            i();
                            break;
                        case 0:
                            g();
                            break;
                        case 1:
                            h();
                            ut2Var.m = 1;
                            break;
                        case 2:
                            ut2Var.A = false;
                            ut2Var.m = 2;
                            break;
                        case 3:
                            if (su2.M(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + ut2Var);
                            }
                            if (ut2Var.U != null && ut2Var.f2247o == null) {
                                o();
                            }
                            if (ut2Var.U != null && (viewGroup2 = ut2Var.T) != null) {
                                ll1 ll1VarI2 = ll1.i(viewGroup2, ut2Var.G());
                                if (su2.M(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + ut2Var);
                                }
                                ll1VarI2.d(s77.n, r77.f1900o, this);
                            }
                            ut2Var.m = 3;
                            break;
                        case 4:
                            q();
                            break;
                        case 5:
                            ut2Var.m = 5;
                            break;
                        case 6:
                            l();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (ut2Var.U != null && (viewGroup3 = ut2Var.T) != null) {
                                ll1 ll1VarI3 = ll1.i(viewGroup3, ut2Var.G());
                                int visibility = ut2Var.U.getVisibility();
                                s77.m.getClass();
                                s77 s77VarG = yi5.g(visibility);
                                if (su2.M(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + ut2Var);
                                }
                                ll1VarI3.d(s77VarG, r77.n, this);
                            }
                            ut2Var.m = 4;
                            break;
                        case 5:
                            p();
                            break;
                        case 6:
                            ut2Var.m = 6;
                            break;
                        case 7:
                            n();
                            break;
                    }
                }
                z2 = true;
            }
        } finally {
            this.d = false;
        }
    }

    public final void l() {
        boolean zM = su2.M(3);
        ut2 ut2Var = this.c;
        if (zM) {
            Log.d("FragmentManager", "movefrom RESUMED: " + ut2Var);
        }
        qt2 qt2Var = ut2Var.j0;
        su2 su2Var = ut2Var.H;
        if (su2Var.h != null) {
            su2Var.d();
        }
        su2Var.v(5);
        if (ut2Var.U != null) {
            qt2Var.a(new jt2(ut2Var, (byte) 21), "FragmentViewLifecycle#handleLifecycleEvent(ON_PAUSE)");
        }
        qt2Var.a(new jt2(ut2Var, (byte) 1), "FragmentLifecycle#handleLifecycleEvent(ON_PAUSE)");
        ut2Var.m = 6;
        ut2Var.S = false;
        qt2Var.a(new jt2(ut2Var, (byte) 2), "Fragment#onPause");
        if (!ut2Var.S) {
            throw new qe7(e41.i("Fragment ", ut2Var, " did not call through to super.onPause()"));
        }
        this.a.o(ut2Var, false);
    }

    public final void m(ClassLoader classLoader) {
        ut2 ut2Var = this.c;
        Bundle bundle = ut2Var.n;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (ut2Var.n.getBundle("savedInstanceState") == null) {
            ut2Var.n.putBundle("savedInstanceState", new Bundle());
        }
        try {
            ut2Var.f2247o = ut2Var.n.getSparseParcelableArray("viewState");
            ut2Var.p = ut2Var.n.getBundle("viewRegistryState");
            zu2 zu2Var = (zu2) ut2Var.n.getParcelable("state");
            if (zu2Var != null) {
                ut2Var.t = zu2Var.y;
                ut2Var.u = zu2Var.z;
                ut2Var.W = zu2Var.A;
            }
            if (ut2Var.W) {
                return;
            }
            ut2Var.V = true;
        } catch (BadParcelableException e) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + ut2Var, e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    public final void n() {
        boolean zRequestFocus;
        String str;
        boolean zM = su2.M(3);
        ut2 ut2Var = this.c;
        if (zM) {
            Log.d("FragmentManager", "moveto RESUMED: " + ut2Var);
        }
        rt2 rt2Var = ut2Var.X;
        View view = rt2Var == null ? null : rt2Var.k;
        if (view != null) {
            if (view == ut2Var.U) {
                zRequestFocus = view.requestFocus();
                if (su2.M(2)) {
                    StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                    sb.append(view);
                    sb.append(" ");
                    if (zRequestFocus) {
                        str = "succeeded";
                    } else {
                        str = "failed";
                    }
                    sb.append(str);
                    sb.append(" on Fragment ");
                    sb.append(ut2Var);
                    sb.append(" resulting in focused view ");
                    sb.append(ut2Var.U.findFocus());
                    Log.v("FragmentManager", sb.toString());
                }
            } else {
                ViewParent parent = view.getParent();
                while (true) {
                    if (parent != null) {
                        if (parent == ut2Var.U) {
                            zRequestFocus = view.requestFocus();
                            if (su2.M(2)) {
                                StringBuilder sb2 = new StringBuilder("requestFocus: Restoring focused view ");
                                sb2.append(view);
                                sb2.append(" ");
                                if (zRequestFocus) {
                                    str = "succeeded";
                                } else {
                                    str = "failed";
                                }
                                sb2.append(str);
                                sb2.append(" on Fragment ");
                                sb2.append(ut2Var);
                                sb2.append(" resulting in focused view ");
                                sb2.append(ut2Var.U.findFocus());
                                Log.v("FragmentManager", sb2.toString());
                            }
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
            }
        }
        ut2Var.B().k = null;
        ut2Var.H.T();
        ut2Var.H.B(true);
        byte b = 7;
        ut2Var.m = 7;
        ut2Var.S = false;
        qt2 qt2Var = ut2Var.j0;
        qt2Var.a(new jt2(ut2Var, (byte) 6), "Fragment#onResume");
        if (!ut2Var.S) {
            throw new qe7(e41.i("Fragment ", ut2Var, " did not call through to super.onResume()"));
        }
        qt2Var.a(new jt2(ut2Var, b), "FragmentLifecycle#handleLifecycleEvent(ON_RESUME)");
        if (ut2Var.U != null) {
            qt2Var.a(new jt2(ut2Var, (byte) 8), "FragmentViewLifecycle#handleLifecycleEvent(ON_RESUME)");
        }
        su2 su2Var = ut2Var.H;
        su2Var.I = false;
        su2Var.J = false;
        su2Var.P.s = false;
        su2Var.v(7);
        this.a.r(ut2Var, false);
        this.b.d0(ut2Var.q, null);
        ut2Var.n = null;
        ut2Var.f2247o = null;
        ut2Var.p = null;
    }

    public final void o() {
        ut2 ut2Var = this.c;
        if (ut2Var.U == null) {
            return;
        }
        if (su2.M(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + ut2Var + " with view " + ut2Var.U);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ut2Var.U.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            ut2Var.f2247o = sparseArray;
        }
        Bundle bundle = new Bundle();
        ut2Var.f0.r.O0(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        ut2Var.p = bundle;
    }

    public final void p() {
        boolean zM = su2.M(3);
        ut2 ut2Var = this.c;
        if (zM) {
            Log.d("FragmentManager", "moveto STARTED: " + ut2Var);
        }
        ut2Var.H.T();
        ut2Var.H.B(true);
        ut2Var.m = 5;
        ut2Var.S = false;
        qt2 qt2Var = ut2Var.j0;
        qt2Var.a(new jt2(ut2Var, (byte) 17), "Fragment#onStart");
        if (!ut2Var.S) {
            throw new qe7(e41.i("Fragment ", ut2Var, " did not call through to super.onStart()"));
        }
        qt2Var.a(new jt2(ut2Var, (byte) 18), "FragmentLifecycle#handleLifecycleEvent(ON_START)");
        if (ut2Var.U != null) {
            qt2Var.a(new jt2(ut2Var, (byte) 19), "FragmentViewLifecycle#handleLifecycleEvent(ON_START)");
        }
        su2 su2Var = ut2Var.H;
        su2Var.I = false;
        su2Var.J = false;
        su2Var.P.s = false;
        su2Var.v(5);
        this.a.t(ut2Var, false);
    }

    public final void q() {
        boolean zM = su2.M(3);
        ut2 ut2Var = this.c;
        if (zM) {
            Log.d("FragmentManager", "movefrom STARTED: " + ut2Var);
        }
        qt2 qt2Var = ut2Var.j0;
        su2 su2Var = ut2Var.H;
        su2Var.J = true;
        su2Var.P.s = true;
        su2Var.v(4);
        byte b = 0;
        if (ut2Var.U != null) {
            qt2Var.a(new jt2(ut2Var, b), "FragmentViewLifecycle#handleLifecycleEvent(ON_STOP)");
        }
        qt2Var.a(new jt2(ut2Var, (byte) 10), "FragmentLifecycle#handleLifecycleEvent(ON_STOP)");
        ut2Var.m = 4;
        ut2Var.S = false;
        qt2Var.a(new jt2(ut2Var, (byte) 15), "Fragment#onStop");
        if (!ut2Var.S) {
            throw new qe7(e41.i("Fragment ", ut2Var, " did not call through to super.onStop()"));
        }
        this.a.u(ut2Var, false);
    }

    public av2(yt2 yt2Var, j93 j93Var, ut2 ut2Var) {
        this.a = yt2Var;
        this.b = j93Var;
        this.c = ut2Var;
    }

    public av2(yt2 yt2Var, j93 j93Var, ut2 ut2Var, Bundle bundle) {
        this.a = yt2Var;
        this.b = j93Var;
        this.c = ut2Var;
        ut2Var.f2247o = null;
        ut2Var.p = null;
        ut2Var.E = 0;
        ut2Var.A = false;
        ut2Var.w = false;
        ut2 ut2Var2 = ut2Var.s;
        ut2Var.t = ut2Var2 != null ? ut2Var2.q : null;
        ut2Var.s = null;
        ut2Var.n = bundle;
        ut2Var.r = bundle.getBundle("arguments");
    }
}
