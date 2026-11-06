package o;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IGroupMemberListSearchViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IGroupMemberListSearchViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PListNavigationStatisticsViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PartnerlistViewModelLocatorSWIGJNI;
import com.teamviewer.remotecontrolviewlib.activity.SettingsActivity;
import com.teamviewer.remotecontrolviewlib.layout.TVTabOutsideLinearLayout;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lo/ve0;", "Lo/zb0;", "Lo/bi3;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ve0 extends zb0 implements bi3 {
    public static final /* synthetic */ int F0 = 0;
    public final ue0 A0 = new ue0(this);
    public final ue0 B0 = new ue0(this);
    public final ue0 C0 = new ue0(this);
    public final ue0 D0 = new ue0(this);
    public final io.sentry.r0 E0 = new io.sentry.r0(this, (byte) 3);
    public io.sentry.android.core.d s0;
    public iu t0;
    public RecyclerView u0;
    public LinearLayoutManager v0;
    public Parcelable w0;
    public View x0;
    public te0 y0;
    public aa3 z0;

    @Override // o.zb0, o.fv2
    public final hk7 C0(String str) {
        str.getClass();
        return null;
    }

    @Override // o.zb0
    public final boolean G0() {
        return false;
    }

    public final void H0() {
        View view;
        te0 te0Var = this.y0;
        if (te0Var != null) {
            te0Var.d();
        }
        aa3 aa3Var = this.z0;
        if (aa3Var == null || (view = this.x0) == null) {
            return;
        }
        IGroupMemberListSearchViewModel iGroupMemberListSearchViewModel = ((we0) aa3Var).n;
        view.setVisibility(IGroupMemberListSearchViewModelSWIGJNI.IGroupMemberListSearchViewModel_ShouldShowEmptyResultsView(iGroupMemberListSearchViewModel.a, iGroupMemberListSearchViewModel) ? 0 : 8);
    }

    @Override // o.fv2, o.ut2
    public final void X(Bundle bundle) {
        super.X(bundle);
        Bundle bundle2 = bundle != null ? bundle.getBundle("searchState") : null;
        if (it1.c == null) {
            im3.e0("viewFactory");
            throw null;
        }
        xt2 xt2VarP0 = p0();
        ue0 ue0Var = this.A0;
        ue0Var.getClass();
        ue0Var.getClass();
        io.sentry.android.core.d dVar = new io.sentry.android.core.d();
        dVar.m = ue0Var;
        if (zu1.c == null) {
            hk0.g("Required value was null.");
            throw null;
        }
        byte b = 0;
        dl5 dl5Var = new dl5(new y26(bundle2, b), (byte) 2);
        ve8 ve8VarO = xt2VarP0.getG0();
        bf1 bf1VarK = h57.k(xt2VarP0);
        pn5 pn5VarT = ua5.t(bf1VarK, ve8VarO, dl5Var, bf1VarK);
        wt3 wt3VarB = w86.a.b(u6.class);
        String strC = wt3VarB.c();
        if (strC == null) {
            hk0.g("Local and anonymous classes can not be ViewModels");
            throw null;
        }
        dVar.f100o = (u6) pn5VarT.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
        dVar.p = new w6(dVar);
        dVar.q = new v6(dVar, b);
        dVar.r = new w6(dVar);
        dVar.s = new w6(dVar);
        this.s0 = dVar;
        if (it1.c == null) {
            im3.e0("viewFactory");
            throw null;
        }
        ue0 ue0Var2 = this.B0;
        ue0Var2.getClass();
        this.t0 = new iu(dVar, ue0Var2);
    }

    @Override // o.ut2
    public final void Y(Menu menu, MenuInflater menuInflater) {
        menu.getClass();
        menuInflater.getClass();
        iu iuVar = this.t0;
        if (iuVar != null) {
            io.sentry.android.core.d dVar = (io.sentry.android.core.d) iuVar.f1103o;
            menuInflater.inflate(R.menu.buddylistgroup_search_menu, menu);
            MenuItem menuItemFindItem = menu.findItem(R.id.action_search);
            menuItemFindItem.setOnActionExpandListener((yp0) iuVar.n);
            View actionView = menuItemFindItem.getActionView();
            if (actionView != null) {
                dVar.n = (SearchView) actionView;
            }
            SearchView searchView = (SearchView) dVar.n;
            if (searchView != null) {
                searchView.setMaxWidth(Integer.MAX_VALUE);
            }
            SearchView searchView2 = (SearchView) dVar.n;
            if (searchView2 != null) {
                searchView2.setQueryHint(searchView2.getContext().getString(R.string.search_hint));
            }
            menuItemFindItem.expandActionView();
            u6 u6Var = (u6) dVar.f100o;
            SearchView searchView3 = (SearchView) dVar.n;
            if (searchView3 != null) {
                searchView3.setOnQueryTextListener((w6) dVar.p);
            }
            w6 w6Var = (w6) dVar.r;
            if (!"".equals(u6Var.n)) {
                String str = u6Var.n;
                str.getClass();
                SearchView searchView4 = (SearchView) w6Var.m.n;
                searchView4.getClass();
                searchView4.r(str, false);
            }
            w6 w6Var2 = (w6) dVar.s;
            boolean z = u6Var.f2174o;
            if (true != z && !z) {
                io.sentry.android.core.d dVar2 = w6Var2.m;
                SearchView searchView5 = (SearchView) dVar2.n;
                if (searchView5 != null && searchView5.hasFocus()) {
                    SearchView searchView6 = (SearchView) dVar2.n;
                    searchView6.getClass();
                    searchView6.clearFocus();
                }
            }
            SearchView searchView7 = (SearchView) dVar.n;
            if (searchView7 != null) {
                searchView7.setOnQueryTextFocusChangeListener((v6) dVar.q);
            }
        }
    }

    @Override // o.ut2
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        aa3 aa3Var;
        IGroupMemberListSearchViewModel iGroupMemberListSearchViewModel;
        aa3 aa3Var2;
        layoutInflater.getClass();
        au2 au2Var = vt1.c;
        byte b = 1;
        if (au2Var != null) {
            RemoteControlApplication remoteControlApplication = (RemoteControlApplication) au2Var.b;
            long jPartnerlistViewModelLocator_GetGroupMemberListSearchViewModel = PartnerlistViewModelLocatorSWIGJNI.PartnerlistViewModelLocator_GetGroupMemberListSearchViewModel(remoteControlApplication.getString(R.string.tv_managed_groups), remoteControlApplication.getString(R.string.tv_managed_device_title));
            if (jPartnerlistViewModelLocator_GetGroupMemberListSearchViewModel == 0) {
                iGroupMemberListSearchViewModel = null;
            } else {
                iGroupMemberListSearchViewModel = new IGroupMemberListSearchViewModel();
                iGroupMemberListSearchViewModel.b = true;
                iGroupMemberListSearchViewModel.a = jPartnerlistViewModelLocator_GetGroupMemberListSearchViewModel;
            }
            if (iGroupMemberListSearchViewModel == null) {
                aa3Var2 = null;
            } else {
                l26 l26Var = new l26(iGroupMemberListSearchViewModel, b);
                ve8 ve8VarO = getG0();
                bf1 bf1VarK = h57.k(this);
                bf1VarK.getClass();
                pn5 pn5Var = new pn5(ve8VarO, l26Var, bf1VarK);
                wt3 wt3VarB = w86.a.b(we0.class);
                String strC = wt3VarB.c();
                if (strC == null) {
                    hk0.g("Local and anonymous classes can not be ViewModels");
                    return null;
                }
                aa3Var2 = (aa3) pn5Var.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
            }
            aa3Var = aa3Var2;
        } else {
            aa3Var = null;
        }
        this.z0 = aa3Var;
        if (aa3Var == null) {
            v0(false);
            return null;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_buddylist_search, viewGroup, false);
        if (bundle != null) {
            this.w0 = (Parcelable) pm8.u(bundle, "partnerListState", Parcelable.class);
        }
        xt2 xt2VarC = C();
        if (xt2VarC != null) {
            xt2VarC.setTitle(I(R.string.search_title));
        }
        v0(true);
        bb5 bb5Var = this.r0;
        if (bb5Var != null) {
            bb5Var.q(gk6.n, false);
        }
        this.y0 = new te0(aa3Var, new yi5((byte) 8), this.D0, bundle, new PListNavigationStatisticsViewModel(), p0());
        this.v0 = new LinearLayoutManager(0);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.search_results);
        this.u0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setAdapter(this.y0);
        }
        RecyclerView recyclerView2 = this.u0;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(this.v0);
        }
        this.x0 = viewInflate.findViewById(R.id.no_results_view);
        ((TVTabOutsideLinearLayout) viewInflate.findViewById(R.id.layout)).setOnClickOutsideEditTextsListener(this.C0);
        return viewInflate;
    }

    @Override // o.ut2
    public final void a0() {
        this.S = true;
        this.w0 = null;
        this.t0 = null;
        this.s0 = null;
    }

    @Override // o.fv2, o.ut2
    public final void b0() {
        super.b0();
        this.u0 = null;
        this.y0 = null;
        this.z0 = null;
        iu iuVar = this.t0;
        if (iuVar != null) {
            io.sentry.android.core.d dVar = (io.sentry.android.core.d) iuVar.f1103o;
            SearchView searchView = (SearchView) dVar.n;
            if (searchView != null) {
                searchView.setOnQueryTextFocusChangeListener(null);
                searchView.setOnQueryTextListener(null);
                dVar.n = null;
            }
        }
    }

    @Override // o.ut2
    public final boolean e0(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.search_settings_button) {
            return false;
        }
        IStatisticsHandler iStatisticsHandler = ga7.a;
        ga7.a(i15.t);
        Context contextE = E();
        if (it1.c != null) {
            y0(new Intent(contextE, (Class<?>) SettingsActivity.class));
            return true;
        }
        im3.e0("viewFactory");
        throw null;
    }

    @Override // o.fv2, o.ut2
    public final void f0() {
        super.f0();
        bu7.MAIN.a(new ed((byte) 6));
        LinearLayoutManager linearLayoutManager = this.v0;
        if (linearLayoutManager != null) {
            this.w0 = linearLayoutManager.p0();
        }
    }

    @Override // o.fv2, o.ut2
    public final void g0() {
        LinearLayoutManager linearLayoutManager;
        super.g0();
        Parcelable parcelable = this.w0;
        if (parcelable == null || (linearLayoutManager = this.v0) == null || linearLayoutManager == null) {
            return;
        }
        linearLayoutManager.o0(parcelable);
    }

    @Override // o.fv2, o.ut2
    public final void h0(Bundle bundle) {
        E0(bundle);
        Bundle bundle2 = new Bundle();
        io.sentry.android.core.d dVar = this.s0;
        if (dVar != null) {
            u6 u6Var = (u6) dVar.f100o;
            bundle2.putString("SEARCHTEXT", u6Var.n);
            bundle2.putBoolean("FOCUSED", u6Var.f2174o);
        }
        bundle.putBundle("searchState", bundle2);
        LinearLayoutManager linearLayoutManager = this.v0;
        Parcelable parcelableP0 = linearLayoutManager != null ? linearLayoutManager.p0() : null;
        this.w0 = parcelableP0;
        if (parcelableP0 != null) {
            bundle.putParcelable("partnerListState", parcelableP0);
        }
        te0 te0Var = this.y0;
        if (te0Var != null) {
            bundle.putLong("PartnerSelectedItemId", te0Var.g.a);
        }
    }

    @Override // o.ut2
    public final void i0() {
        this.S = true;
        aa3 aa3Var = this.z0;
        if (aa3Var == null) {
            ye4.a.g("BuddyListSearchFragment", "onStart(): m_ViewModel is null");
            return;
        }
        we0 we0Var = (we0) aa3Var;
        io.sentry.r0 r0Var = this.E0;
        r0Var.getClass();
        we0Var.f2402o.add(new WeakReference(r0Var));
        IGroupMemberListSearchViewModel iGroupMemberListSearchViewModel = we0Var.n;
        VoidSignalCallback voidSignalCallback = we0Var.p;
        IGroupMemberListSearchViewModelSWIGJNI.IGroupMemberListSearchViewModel_RegisterForChanges(iGroupMemberListSearchViewModel.a, iGroupMemberListSearchViewModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
        H0();
    }

    @Override // o.ut2
    public final void j0() {
        this.S = true;
        aa3 aa3Var = this.z0;
        if (aa3Var == null) {
            ye4.a.g("BuddyListSearchFragment", "onStop(): m_ViewModel is null");
            return;
        }
        io.sentry.r0 r0Var = this.E0;
        r0Var.getClass();
        LinkedHashSet linkedHashSet = ((we0) aa3Var).f2402o;
        linkedHashSet.getClass();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            weakReference.getClass();
            if (weakReference.get() == null || im3.n(weakReference.get(), r0Var)) {
                it.remove();
            }
        }
    }
}
