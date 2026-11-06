package o;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PListNavigationStatisticsViewModel;
import com.teamviewer.remotecontrolviewlib.activity.MainActivity;
import com.teamviewer.remotecontrolviewlib.activity.SettingsActivity;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lo/ae0;", "Lo/ye0;", "Lo/hq4;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ae0 extends ye0 {
    public static final /* synthetic */ int F0 = 0;
    public ce0 A0;
    public ShimmerFrameLayout B0;
    public final boolean C0 = true;
    public final boolean D0 = true;
    public final xc0 E0 = new xc0(this, (byte) 2);
    public yd0 t0;
    public RecyclerView u0;
    public Parcelable v0;
    public LinearLayoutManager w0;
    public FloatingActionButton x0;
    public String y0;
    public nt2 z0;

    @Override // o.zb0, o.fv2
    public final hk7 C0(String str) {
        str.getClass();
        return null;
    }

    @Override // o.zb0
    public final boolean G0() {
        return true;
    }

    @Override // o.ye0
    /* JADX INFO: renamed from: I0, reason: from getter */
    public final boolean getB0() {
        return this.C0;
    }

    @Override // o.ye0
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final boolean getC0() {
        return this.D0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.ut2
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        layoutInflater.getClass();
        this.z0 = (nt2) o0(new io.sentry.android.core.h2(this, (byte) 5), new e8((byte) 3));
        if (bundle != null) {
            string = bundle.getString("groupId", "");
            string.getClass();
        } else {
            Bundle bundle2 = this.r;
            if (bundle2 == null || (string = bundle2.getString("groupId", "")) == null) {
                string = "";
            }
        }
        this.y0 = string;
        Bundle bundle3 = this.r;
        hc1 hc1Var = null;
        String string2 = bundle3 != null ? bundle3.getString("groupName", "") : null;
        this.v0 = bundle != null ? (Parcelable) pm8.u(bundle, "partnerListState", Parcelable.class) : null;
        xt2 xt2VarC = C();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_manager_devices, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(R.id.shimmerFrameLayout);
        viewFindViewById.getClass();
        this.B0 = (ShimmerFrameLayout) viewFindViewById;
        c36 c36Var = zu1.c;
        if (c36Var == null) {
            hk0.g("Required value was null.");
            return null;
        }
        dl5 dl5Var = new dl5(new q26(c36Var, (byte) 16), (byte) 2);
        ve8 g0 = getG0();
        bf1 bf1VarK = h57.k(this);
        pn5 pn5VarT = ua5.t(bf1VarK, g0, dl5Var, bf1VarK);
        wt3 wt3VarB = w86.a.b(ce0.class);
        String strC = wt3VarB.c();
        if (strC == null) {
            hk0.g("Local and anonymous classes can not be ViewModels");
            return null;
        }
        ce0 ce0Var = (ce0) pn5VarT.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
        this.A0 = ce0Var;
        String str = this.y0;
        this.t0 = new yd0(ce0Var, str != null ? str : "", new ir((byte) 26), this.E0, bundle, new PListNavigationStatisticsViewModel(), this);
        p0();
        this.w0 = new LinearLayoutManager(0);
        bb5 bb5Var = this.r0;
        if (bb5Var != null) {
            bb5Var.q(gk6.n, false);
        }
        if (xt2VarC instanceof fa3) {
            View viewFindViewById2 = ((MainActivity) ((fa3) xt2VarC)).findViewById(R.id.app_bar_layout);
            viewFindViewById2.getClass();
            ((AppBarLayout) viewFindViewById2).d(true, false, true);
        }
        View viewFindViewById3 = viewInflate.findViewById(R.id.plMyManagedDevicesRecyclerView);
        viewFindViewById3.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById3;
        this.u0 = recyclerView;
        recyclerView.setLayoutManager(this.w0);
        RecyclerView recyclerView2 = this.u0;
        if (recyclerView2 == null) {
            im3.e0("managerGroupDevicesRecyclerView");
            throw null;
        }
        recyclerView2.setAdapter(this.t0);
        RecyclerView recyclerView3 = this.u0;
        if (recyclerView3 == null) {
            im3.e0("managerGroupDevicesRecyclerView");
            throw null;
        }
        recyclerView3.setNestedScrollingEnabled(false);
        ce0 ce0Var2 = this.A0;
        if (ce0Var2 == null) {
            im3.e0("managerGroupViewModel");
            throw null;
        }
        byte b = 6;
        ce0Var2.p.observe(L(), new b7(new q0(this, (byte) 21), b));
        ce0 ce0Var3 = this.A0;
        if (ce0Var3 == null) {
            im3.e0("managerGroupViewModel");
            throw null;
        }
        ce0Var3.q.observe(L(), new b7(new g0(this, viewInflate, (byte) 20), b));
        ce0 ce0Var4 = this.A0;
        if (ce0Var4 == null) {
            im3.e0("managerGroupViewModel");
            throw null;
        }
        gu0 gu0VarN = e8.n(ce0Var4);
        tk1 tk1Var = g22.a;
        im3.R(gu0VarN, gk1.f901o, null, new y0(ce0Var4, hc1Var, (byte) 7), 2);
        if (xt2VarC != 0) {
            xt2VarC.setTitle(string2);
        }
        p0().v(this, L());
        return viewInflate;
    }

    @Override // o.ut2
    public final void a0() {
        this.S = true;
        this.v0 = null;
    }

    @Override // o.fv2, o.ut2
    public final void f0() {
        super.f0();
        bu7.MAIN.a(new ed((byte) 6));
        LinearLayoutManager linearLayoutManager = this.w0;
        this.v0 = linearLayoutManager != null ? linearLayoutManager.p0() : null;
    }

    @Override // o.fv2, o.ut2
    public final void h0(Bundle bundle) {
        E0(bundle);
        bundle.putString("groupId", this.y0);
        LinearLayoutManager linearLayoutManager = this.w0;
        Parcelable parcelableP0 = linearLayoutManager != null ? linearLayoutManager.p0() : null;
        this.v0 = parcelableP0;
        if (parcelableP0 != null) {
            bundle.putParcelable("partnerListState", parcelableP0);
        }
        yd0 yd0Var = this.t0;
        if (yd0Var != null) {
            bi7 bi7Var = yd0Var.i;
            bi7Var.getClass();
            bundle.putLong("ManagedDeviceV2SelectedItemId", bi7Var.a);
        }
    }

    @Override // o.hq4
    public final boolean j(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.settingsMenuItem) {
            return false;
        }
        if (it1.c != null) {
            y0(new Intent(E(), (Class<?>) SettingsActivity.class));
            return true;
        }
        im3.e0("viewFactory");
        throw null;
    }

    @Override // o.ye0, o.hq4
    public final void u(Menu menu, MenuInflater menuInflater) {
        menu.getClass();
        menuInflater.getClass();
        super.u(menu, menuInflater);
    }
}
