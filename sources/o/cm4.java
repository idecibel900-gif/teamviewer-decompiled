package o;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PLManagerDevicesV2ViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PLManagerDevicesV2ViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PListNavigationStatisticsViewModel;
import com.teamviewer.remotecontrolviewlib.guielement.TVLinearLayoutManager;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo/cm4;", "Lo/ye0;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class cm4 extends ye0 {
    public static final /* synthetic */ int D0 = 0;
    public TextView A0;
    public final boolean B0 = true;
    public final nx3 C0 = new nx3((Object) this, (byte) 17);
    public tc0 t0;
    public x93 u0;
    public TVLinearLayoutManager v0;
    public RecyclerView w0;
    public FloatingActionButton x0;
    public nt2 y0;
    public ShimmerFrameLayout z0;

    @Override // o.zb0
    public final boolean G0() {
        return true;
    }

    @Override // o.ye0
    /* JADX INFO: renamed from: I0 */
    public final boolean getC0() {
        return false;
    }

    @Override // o.ye0
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final boolean getD0() {
        return this.B0;
    }

    @Override // o.ut2
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        x93 x93Var;
        nw4 nw4Var;
        nw4 nw4Var2;
        nw4 nw4Var3;
        layoutInflater.getClass();
        this.y0 = (nt2) o0(new io.sentry.android.core.h2(this, (byte) 5), new e8((byte) 3));
        au2 au2Var = vt1.c;
        final byte b = 1;
        hc1 hc1Var = null;
        if (au2Var != null) {
            xt2 xt2VarP0 = p0();
            m26 m26Var = new m26(au2Var, b);
            ve8 g0 = xt2VarP0.getG0();
            bf1 bf1VarK = h57.k(xt2VarP0);
            bf1VarK.getClass();
            pn5 pn5Var = new pn5(g0, m26Var, bf1VarK);
            wt3 wt3VarB = w86.a.b(zd0.class);
            String strC = wt3VarB.c();
            if (strC == null) {
                hk0.g("Local and anonymous classes can not be ViewModels");
                return null;
            }
            x93Var = (x93) pn5Var.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
        } else {
            x93Var = null;
        }
        this.u0 = x93Var;
        if (x93Var == null) {
            return null;
        }
        xt2 xt2VarC = C();
        if (xt2VarC != null) {
            xt2VarC.setTitle(H().getString(R.string.tv_managed_device_title));
        }
        this.t0 = new tc0(this.u0, new ir((byte) 26), this.C0, bundle, new PListNavigationStatisticsViewModel(), p0());
        this.v0 = new TVLinearLayoutManager(r0(), F0());
        final byte b2 = 0;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_manager_devices, viewGroup, false);
        viewInflate.getClass();
        View viewFindViewById = viewInflate.findViewById(R.id.plMyManagedDevicesRecyclerView);
        RecyclerView recyclerView = viewFindViewById instanceof RecyclerView ? (RecyclerView) viewFindViewById : null;
        this.w0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setAdapter(this.t0);
        }
        RecyclerView recyclerView2 = this.w0;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(this.v0);
        }
        View viewFindViewById2 = viewInflate.findViewById(R.id.plGroupDetailsListNoItems);
        viewFindViewById2.getClass();
        this.A0 = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.shimmerFrameLayout);
        viewFindViewById3.getClass();
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) viewFindViewById3;
        this.z0 = shimmerFrameLayout;
        cz6 cz6Var = shimmerFrameLayout.n;
        ValueAnimator valueAnimator = cz6Var.e;
        if (valueAnimator != null && ((valueAnimator == null || !valueAnimator.isStarted()) && cz6Var.getCallback() != null)) {
            cz6Var.e.start();
        }
        p0().v(this, L());
        x93 x93Var2 = this.u0;
        byte b3 = 19;
        if (x93Var2 != null && (nw4Var3 = ((zd0) x93Var2).p) != null) {
            nw4Var3.observe(L(), new b7(new Function1(this) { // from class: o.bm4
                public final /* synthetic */ cm4 n;

                {
                    this.n = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    r66 recycledViewPool;
                    byte b4 = b2;
                    f88 f88Var = f88.a;
                    int i = 0;
                    cm4 cm4Var = this.n;
                    switch (b4) {
                        case 0:
                            RecyclerView recyclerView3 = cm4Var.w0;
                            if (recyclerView3 != null) {
                                recyclerView3.setVisibility(0);
                            }
                            ShimmerFrameLayout shimmerFrameLayout2 = cm4Var.z0;
                            if (shimmerFrameLayout2 == null) {
                                im3.e0("shimmerContainer");
                                throw null;
                            }
                            shimmerFrameLayout2.c();
                            ShimmerFrameLayout shimmerFrameLayout3 = cm4Var.z0;
                            if (shimmerFrameLayout3 == null) {
                                im3.e0("shimmerContainer");
                                throw null;
                            }
                            shimmerFrameLayout3.setVisibility(8);
                            RecyclerView recyclerView4 = cm4Var.w0;
                            if (recyclerView4 != null && (recycledViewPool = recyclerView4.getRecycledViewPool()) != null) {
                                recycledViewPool.a();
                            }
                            tc0 tc0Var = cm4Var.t0;
                            if (tc0Var != null) {
                                x93 x93Var3 = (x93) tc0Var.i;
                                tc0Var.g = (x93Var3 == null || ((zd0) x93Var3).V0() <= 0) ? 0 : 1;
                                if (x93Var3 != null) {
                                    PLManagerDevicesV2ViewModel pLManagerDevicesV2ViewModel = ((zd0) x93Var3).n;
                                    if ((pLManagerDevicesV2ViewModel != null ? (int) PLManagerDevicesV2ViewModelSWIGJNI.PLManagerDevicesV2ViewModel_GetOfflineDevicesSize(pLManagerDevicesV2ViewModel.a, pLManagerDevicesV2ViewModel) : 0) > 0) {
                                        i = 1;
                                    }
                                }
                                tc0Var.h = i;
                                tc0Var.d();
                            }
                            return f88Var;
                        default:
                            ShimmerFrameLayout shimmerFrameLayout4 = cm4Var.z0;
                            if (shimmerFrameLayout4 == null) {
                                im3.e0("shimmerContainer");
                                throw null;
                            }
                            shimmerFrameLayout4.c();
                            ShimmerFrameLayout shimmerFrameLayout5 = cm4Var.z0;
                            if (shimmerFrameLayout5 == null) {
                                im3.e0("shimmerContainer");
                                throw null;
                            }
                            shimmerFrameLayout5.setVisibility(8);
                            RecyclerView recyclerView5 = cm4Var.w0;
                            if (recyclerView5 != null) {
                                recyclerView5.setVisibility(8);
                            }
                            TextView textView = cm4Var.A0;
                            if (textView == null) {
                                im3.e0("noItemsTextView");
                                throw null;
                            }
                            textView.setVisibility(0);
                            bb5 bb5Var = cm4Var.r0;
                            if (bb5Var != null) {
                                bb5Var.q(gk6.n, false);
                            }
                            return f88Var;
                    }
                }
            }, b3));
        }
        x93 x93Var3 = this.u0;
        if (x93Var3 != null && (nw4Var2 = ((zd0) x93Var3).q) != null) {
            nw4Var2.observe(L(), new b7(new Function1(this) { // from class: o.bm4
                public final /* synthetic */ cm4 n;

                {
                    this.n = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    r66 recycledViewPool;
                    byte b4 = b;
                    f88 f88Var = f88.a;
                    int i = 0;
                    cm4 cm4Var = this.n;
                    switch (b4) {
                        case 0:
                            RecyclerView recyclerView3 = cm4Var.w0;
                            if (recyclerView3 != null) {
                                recyclerView3.setVisibility(0);
                            }
                            ShimmerFrameLayout shimmerFrameLayout2 = cm4Var.z0;
                            if (shimmerFrameLayout2 == null) {
                                im3.e0("shimmerContainer");
                                throw null;
                            }
                            shimmerFrameLayout2.c();
                            ShimmerFrameLayout shimmerFrameLayout3 = cm4Var.z0;
                            if (shimmerFrameLayout3 == null) {
                                im3.e0("shimmerContainer");
                                throw null;
                            }
                            shimmerFrameLayout3.setVisibility(8);
                            RecyclerView recyclerView4 = cm4Var.w0;
                            if (recyclerView4 != null && (recycledViewPool = recyclerView4.getRecycledViewPool()) != null) {
                                recycledViewPool.a();
                            }
                            tc0 tc0Var = cm4Var.t0;
                            if (tc0Var != null) {
                                x93 x93Var4 = (x93) tc0Var.i;
                                tc0Var.g = (x93Var4 == null || ((zd0) x93Var4).V0() <= 0) ? 0 : 1;
                                if (x93Var4 != null) {
                                    PLManagerDevicesV2ViewModel pLManagerDevicesV2ViewModel = ((zd0) x93Var4).n;
                                    if ((pLManagerDevicesV2ViewModel != null ? (int) PLManagerDevicesV2ViewModelSWIGJNI.PLManagerDevicesV2ViewModel_GetOfflineDevicesSize(pLManagerDevicesV2ViewModel.a, pLManagerDevicesV2ViewModel) : 0) > 0) {
                                        i = 1;
                                    }
                                }
                                tc0Var.h = i;
                                tc0Var.d();
                            }
                            return f88Var;
                        default:
                            ShimmerFrameLayout shimmerFrameLayout4 = cm4Var.z0;
                            if (shimmerFrameLayout4 == null) {
                                im3.e0("shimmerContainer");
                                throw null;
                            }
                            shimmerFrameLayout4.c();
                            ShimmerFrameLayout shimmerFrameLayout5 = cm4Var.z0;
                            if (shimmerFrameLayout5 == null) {
                                im3.e0("shimmerContainer");
                                throw null;
                            }
                            shimmerFrameLayout5.setVisibility(8);
                            RecyclerView recyclerView5 = cm4Var.w0;
                            if (recyclerView5 != null) {
                                recyclerView5.setVisibility(8);
                            }
                            TextView textView = cm4Var.A0;
                            if (textView == null) {
                                im3.e0("noItemsTextView");
                                throw null;
                            }
                            textView.setVisibility(0);
                            bb5 bb5Var = cm4Var.r0;
                            if (bb5Var != null) {
                                bb5Var.q(gk6.n, false);
                            }
                            return f88Var;
                    }
                }
            }, b3));
        }
        x93 x93Var4 = this.u0;
        if (x93Var4 != null && (nw4Var = ((zd0) x93Var4).r) != null) {
            nw4Var.observe(L(), new b7(new o43(this, viewInflate, (byte) 11), b3));
        }
        x93 x93Var5 = this.u0;
        if (x93Var5 != null) {
            zd0 zd0Var = (zd0) x93Var5;
            gu0 gu0VarN = e8.n(zd0Var);
            tk1 tk1Var = g22.a;
            im3.R(gu0VarN, gk1.f901o, null, new y0(zd0Var, hc1Var, (byte) 6), 2);
        }
        return viewInflate;
    }

    @Override // o.fv2, o.ut2
    public final void b0() {
        super.b0();
        this.w0 = null;
        this.t0 = null;
        this.u0 = null;
    }

    @Override // o.fv2, o.ut2
    public final void g0() {
        super.g0();
        x93 x93Var = this.u0;
        if (x93Var == null) {
            ye4.a.g("ManagerDevicesFragment", "onResume: ManagedDevicesListViewModel is null");
            return;
        }
        zd0 zd0Var = (zd0) x93Var;
        im3.R(e8.n(zd0Var), null, null, new ac(zd0Var, null, (byte) 2), 3);
    }

    @Override // o.hq4
    public final boolean j(MenuItem menuItem) {
        menuItem.getClass();
        return false;
    }
}
