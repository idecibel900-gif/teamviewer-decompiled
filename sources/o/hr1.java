package o;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.tabs.TabLayout;
import com.teamviewer.remotecontrollib.swig.LicenseViewModel;
import com.teamviewer.remotecontrollib.swig.LicenseViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.LogoutViewModel;
import com.teamviewer.remotecontrollib.swig.LogoutViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListComputerID;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ComputerDetailsViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ComputerDetailsViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewlib.activity.SettingsActivity;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo/hr1;", "Lo/zb0;", "Lo/bi3;", "Lo/hq4;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class hr1 extends zb0 implements bi3, hq4 {
    public static final /* synthetic */ int u0 = 0;
    public ra3 s0;
    public long t0;

    @Override // o.zb0
    public final boolean G0() {
        return true;
    }

    public final View H0(int i) {
        String string;
        LayoutInflater layoutInflaterD0 = this.Z;
        if (layoutInflaterD0 == null) {
            layoutInflaterD0 = d0(null);
            this.Z = layoutInflaterD0;
        }
        View viewInflate = layoutInflaterD0.inflate(R.layout.alert_tab_layout, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.alert_tab_textview);
        if (i == 0) {
            string = H().getString(R.string.tv_alarm_filter_all);
            string.getClass();
        } else if (i == 1) {
            string = H().getString(R.string.tv_alarm_filter_failed);
            string.getClass();
        } else if (i != 2) {
            string = "";
        } else {
            string = H().getString(R.string.tv_alarm_filter_acknowledged);
            string.getClass();
        }
        textView.setText(string);
        return viewInflate;
    }

    public final void I0(dd ddVar) {
        if (it1.c == null) {
            im3.e0("viewFactory");
            throw null;
        }
        long j = this.t0;
        dr1 dr1Var = new dr1();
        Bundle bundle = new Bundle();
        bundle.putLong("BuddyId", j);
        bundle.putSerializable("AlarmFilter", ddVar);
        dr1Var.u0(bundle);
        dr1Var.p0 = F0();
        su2 su2VarD = D();
        su2VarD.getClass();
        w10 w10Var = new w10(su2VarD);
        w10Var.k(R.id.alerts_container, dr1Var, null);
        w10Var.f();
    }

    @Override // o.fv2, o.ut2
    public final void X(Bundle bundle) {
        long jLongValue;
        super.X(bundle);
        Long lValueOf = bundle != null ? Long.valueOf(bundle.getLong("BuddyId")) : null;
        if (lValueOf != null) {
            jLongValue = lValueOf.longValue();
        } else {
            Bundle bundle2 = this.r;
            Long lValueOf2 = bundle2 != null ? Long.valueOf(bundle2.getLong("BuddyId")) : null;
            jLongValue = lValueOf2 != null ? lValueOf2.longValue() : 0L;
        }
        this.t0 = jLongValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.ut2
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final int iIntValue;
        nw4 nw4Var;
        nw4 nw4Var2;
        layoutInflater.getClass();
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        View viewInflate = layoutInflater.inflate(R.layout.device_alarms_overview, viewGroup, false);
        int i = R.id.alert_tabs;
        TabLayout tabLayout = (TabLayout) r47.s(viewInflate, R.id.alert_tabs);
        if (tabLayout != null) {
            i = R.id.alerts_container;
            if (((FrameLayout) r47.s(viewInflate, R.id.alerts_container)) != null) {
                i = R.id.alerts_overview_container;
                if (((FrameLayout) r47.s(viewInflate, R.id.alerts_overview_container)) != null) {
                    if (((FrameLayout) r47.s(viewInflate, R.id.avatar_image_container)) != null) {
                        int i2 = R.id.device_alarms_overview_recheckAllAlerts;
                        if (((SwipeRefreshLayout) r47.s(viewInflate, R.id.device_alarms_overview_recheckAllAlerts)) != null) {
                            i2 = R.id.partner_computer_name;
                            TextView textView = (TextView) r47.s(viewInflate, R.id.partner_computer_name);
                            if (textView != null) {
                                wk0 wk0Var = new wk0((FrameLayout) viewInflate, tabLayout, textView);
                                if (zu1.c == null) {
                                    hk0.g("Required value was null.");
                                    return null;
                                }
                                final long j = this.t0;
                                Integer numValueOf = bundle != null ? Integer.valueOf(bundle.getInt("SelectedTab")) : null;
                                if (numValueOf != null) {
                                    iIntValue = numValueOf.intValue();
                                } else {
                                    Bundle bundle2 = this.r;
                                    iIntValue = bundle2 != null ? bundle2.getInt("SelectedTab") : 0;
                                }
                                Function0 function0 = new Function0() { // from class: o.z26
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object a() {
                                        ComputerDetailsViewModel computerDetailsViewModelH = ds1.h(new PListComputerID(j));
                                        computerDetailsViewModelH.getClass();
                                        LogoutViewModel logoutViewModelI = di1.i();
                                        logoutViewModelI.getClass();
                                        LicenseViewModel licenseViewModelH = di1.h();
                                        licenseViewModelH.getClass();
                                        return new kr1(computerDetailsViewModelH, logoutViewModelI, licenseViewModelH, iIntValue);
                                    }
                                };
                                final byte b = 2;
                                dl5 dl5Var = new dl5(function0, (byte) 2);
                                ve8 ve8VarO = getG0();
                                bf1 bf1VarK = h57.k(this);
                                pn5 pn5VarT = ua5.t(bf1VarK, ve8VarO, dl5Var, bf1VarK);
                                wt3 wt3VarB = w86.a.b(kr1.class);
                                String strC = wt3VarB.c();
                                if (strC == null) {
                                    hk0.g("Local and anonymous classes can not be ViewModels");
                                    return null;
                                }
                                this.s0 = (ra3) pn5VarT.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
                                final byte b2 = 1;
                                if (bundle == null) {
                                    if (it1.c == null) {
                                        im3.e0("viewFactory");
                                        throw null;
                                    }
                                    long j2 = this.t0;
                                    mr1 mr1Var = new mr1();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("BuddyId", j2);
                                    mr1Var.u0(bundle3);
                                    mr1Var.p0 = F0();
                                    su2 su2VarD = D();
                                    su2VarD.getClass();
                                    w10 w10Var = new w10(su2VarD);
                                    w10Var.h(R.id.alerts_overview_container, mr1Var, null, 1);
                                    w10Var.f();
                                    I0(dd.m);
                                    ut2 ut2VarE = D().E(R.id.avatar_image_container);
                                    if (it1.c == null) {
                                        im3.e0("viewFactory");
                                        throw null;
                                    }
                                    p33 p33VarO = ep3.o(this.t0, t33.n);
                                    if (ut2VarE == null) {
                                        su2 su2VarD2 = D();
                                        su2VarD2.getClass();
                                        w10 w10Var2 = new w10(su2VarD2);
                                        w10Var2.h(R.id.avatar_image_container, p33VarO, null, 1);
                                        w10Var2.f();
                                    }
                                }
                                p0().v(this, L());
                                bb5 bb5Var = this.r0;
                                if (bb5Var != null) {
                                    bb5Var.q(gk6.n, false);
                                }
                                xt2 xt2VarC = C();
                                if (xt2VarC != null) {
                                    xt2VarC.setTitle(R.string.tv_toolbar_alerts_title);
                                }
                                ra3 ra3Var = this.s0;
                                if (ra3Var != null) {
                                    kr1 kr1Var = (kr1) ra3Var;
                                    LicenseViewModel licenseViewModel = kr1Var.p;
                                    String strLicenseViewModel_GetAccountLoginName = LicenseViewModelSWIGJNI.LicenseViewModel_GetAccountLoginName(licenseViewModel.a, licenseViewModel);
                                    strLicenseViewModel_GetAccountLoginName.getClass();
                                    kr1Var.v = strLicenseViewModel_GetAccountLoginName;
                                }
                                ra3 ra3Var2 = this.s0;
                                byte b3 = 10;
                                if (ra3Var2 != null && (nw4Var2 = ((kr1) ra3Var2).r) != null) {
                                    nw4Var2.observe(L(), new b7(new a81(wk0Var, b2), b3));
                                }
                                ra3 ra3Var3 = this.s0;
                                if (ra3Var3 != null && (nw4Var = ((kr1) ra3Var3).s) != null) {
                                    nw4Var.observe(L(), new b7(new a81(this, b), b3));
                                }
                                ra3 ra3Var4 = this.s0;
                                if (ra3Var4 != null) {
                                    final Object[] objArr3 = objArr2 == true ? 1 : 0;
                                    ((kr1) ra3Var4).u.a(new Function0(this) { // from class: o.er1
                                        public final /* synthetic */ hr1 n;

                                        {
                                            this.n = this;
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object a() {
                                            bb5 bb5Var2;
                                            VoidSignalCallback voidSignalCallback;
                                            byte b4 = objArr3;
                                            f88 f88Var = f88.a;
                                            hr1 hr1Var = this.n;
                                            switch (b4) {
                                                case 0:
                                                    int i3 = hr1.u0;
                                                    bb5 bb5Var3 = hr1Var.r0;
                                                    if (bb5Var3 != null) {
                                                        bb5Var3.D0();
                                                    }
                                                    break;
                                                case 1:
                                                    int i4 = hr1.u0;
                                                    if (hr1Var.F0().O() && (hr1Var.F0().B0() instanceof hr1) && (bb5Var2 = hr1Var.r0) != null) {
                                                        bb5Var2.G0();
                                                    }
                                                    break;
                                                default:
                                                    int i5 = hr1.u0;
                                                    if (hr1Var.F0().O()) {
                                                        ra3 ra3Var5 = hr1Var.s0;
                                                        if (ra3Var5 != null && (voidSignalCallback = ((kr1) ra3Var5).z) != null) {
                                                            voidSignalCallback.Disconnect();
                                                        }
                                                        bb5 bb5Var4 = hr1Var.r0;
                                                        if (bb5Var4 != null) {
                                                            bb5Var4.G0();
                                                        }
                                                    }
                                                    break;
                                            }
                                            return f88Var;
                                        }
                                    });
                                }
                                ra3 ra3Var5 = this.s0;
                                if (ra3Var5 != null) {
                                    ((kr1) ra3Var5).t.a(new Function0(this) { // from class: o.er1
                                        public final /* synthetic */ hr1 n;

                                        {
                                            this.n = this;
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object a() {
                                            bb5 bb5Var2;
                                            VoidSignalCallback voidSignalCallback;
                                            byte b4 = b2;
                                            f88 f88Var = f88.a;
                                            hr1 hr1Var = this.n;
                                            switch (b4) {
                                                case 0:
                                                    int i3 = hr1.u0;
                                                    bb5 bb5Var3 = hr1Var.r0;
                                                    if (bb5Var3 != null) {
                                                        bb5Var3.D0();
                                                    }
                                                    break;
                                                case 1:
                                                    int i4 = hr1.u0;
                                                    if (hr1Var.F0().O() && (hr1Var.F0().B0() instanceof hr1) && (bb5Var2 = hr1Var.r0) != null) {
                                                        bb5Var2.G0();
                                                    }
                                                    break;
                                                default:
                                                    int i5 = hr1.u0;
                                                    if (hr1Var.F0().O()) {
                                                        ra3 ra3Var6 = hr1Var.s0;
                                                        if (ra3Var6 != null && (voidSignalCallback = ((kr1) ra3Var6).z) != null) {
                                                            voidSignalCallback.Disconnect();
                                                        }
                                                        bb5 bb5Var4 = hr1Var.r0;
                                                        if (bb5Var4 != null) {
                                                            bb5Var4.G0();
                                                        }
                                                    }
                                                    break;
                                            }
                                            return f88Var;
                                        }
                                    });
                                }
                                ra3 ra3Var6 = this.s0;
                                if (ra3Var6 != null) {
                                    kr1 kr1Var2 = (kr1) ra3Var6;
                                    VoidSignalCallback voidSignalCallback = SignalCallbackFactory.INSTANCE.getInstance().voidSignalCallback(new Function0(this) { // from class: o.er1
                                        public final /* synthetic */ hr1 n;

                                        {
                                            this.n = this;
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object a() {
                                            bb5 bb5Var2;
                                            VoidSignalCallback voidSignalCallback2;
                                            byte b4 = b;
                                            f88 f88Var = f88.a;
                                            hr1 hr1Var = this.n;
                                            switch (b4) {
                                                case 0:
                                                    int i3 = hr1.u0;
                                                    bb5 bb5Var3 = hr1Var.r0;
                                                    if (bb5Var3 != null) {
                                                        bb5Var3.D0();
                                                    }
                                                    break;
                                                case 1:
                                                    int i4 = hr1.u0;
                                                    if (hr1Var.F0().O() && (hr1Var.F0().B0() instanceof hr1) && (bb5Var2 = hr1Var.r0) != null) {
                                                        bb5Var2.G0();
                                                    }
                                                    break;
                                                default:
                                                    int i5 = hr1.u0;
                                                    if (hr1Var.F0().O()) {
                                                        ra3 ra3Var7 = hr1Var.s0;
                                                        if (ra3Var7 != null && (voidSignalCallback2 = ((kr1) ra3Var7).z) != null) {
                                                            voidSignalCallback2.Disconnect();
                                                        }
                                                        bb5 bb5Var4 = hr1Var.r0;
                                                        if (bb5Var4 != null) {
                                                            bb5Var4.G0();
                                                        }
                                                    }
                                                    break;
                                            }
                                            return f88Var;
                                        }
                                    });
                                    kr1Var2.z = voidSignalCallback;
                                    ComputerDetailsViewModel computerDetailsViewModel = kr1Var2.n;
                                    ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_RegisterForMonitoringUnInstallation(computerDetailsViewModel.a, computerDetailsViewModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
                                }
                                tm7 tm7VarG = tabLayout.g();
                                tm7VarG.b = H0(0);
                                tm7VarG.b();
                                tabLayout.a(tm7VarG, 0);
                                tm7 tm7VarG2 = tabLayout.g();
                                tm7VarG2.b = H0(1);
                                tm7VarG2.b();
                                tabLayout.a(tm7VarG2, 1);
                                tm7 tm7VarG3 = tabLayout.g();
                                tm7VarG3.b = H0(2);
                                tm7VarG3.b();
                                tabLayout.a(tm7VarG3, 2);
                                int tabCount = tabLayout.getTabCount();
                                for (int i3 = 0; i3 < tabCount; i3++) {
                                    tm7 tm7VarF = tabLayout.f(i3);
                                    View view = tm7VarF != null ? tm7VarF.b : null;
                                    TextView textView2 = view != null ? (TextView) view.findViewById(R.id.alert_tab_textview) : null;
                                    if (textView2 != null) {
                                        textView2.post(new fr1(textView2, this, (byte) 0));
                                    }
                                }
                                gr1 gr1Var = new gr1(this, objArr == true ? 1 : 0);
                                ArrayList arrayList = tabLayout.R;
                                if (!arrayList.contains(gr1Var)) {
                                    arrayList.add(gr1Var);
                                }
                                ra3 ra3Var7 = this.s0;
                                tm7 tm7VarF2 = tabLayout.f(ra3Var7 != null ? ((kr1) ra3Var7).q : 0);
                                if (tm7VarF2 != null) {
                                    tm7VarF2.a();
                                }
                                FrameLayout frameLayout = (FrameLayout) wk0Var.n;
                                frameLayout.getClass();
                                return frameLayout;
                            }
                        }
                        i = i2;
                    } else {
                        i = R.id.avatar_image_container;
                    }
                }
            }
        }
        yq4.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // o.fv2, o.ut2
    public final void g0() {
        ra3 ra3Var;
        bb5 bb5Var;
        super.g0();
        ComputerDetailsViewModel computerDetailsViewModelH = ds1.h(new PListComputerID(this.t0));
        ra3 ra3Var2 = this.s0;
        if (ra3Var2 != null) {
            LogoutViewModel logoutViewModel = ((kr1) ra3Var2).f1296o;
            if (LogoutViewModelSWIGJNI.LogoutViewModel_IsEnabled(logoutViewModel.c, logoutViewModel)) {
                if (computerDetailsViewModelH != null || (ra3Var = this.s0) == null) {
                    return;
                }
                kr1 kr1Var = (kr1) ra3Var;
                String str = kr1Var.v;
                if (str == null) {
                    im3.e0("lastAccount");
                    throw null;
                }
                LicenseViewModel licenseViewModel = kr1Var.p;
                if (!im3.n(str, LicenseViewModelSWIGJNI.LicenseViewModel_GetAccountLoginName(licenseViewModel.a, licenseViewModel)) || (bb5Var = this.r0) == null) {
                    return;
                }
                bb5Var.G0();
                return;
            }
        }
        bb5 bb5Var2 = this.r0;
        if (bb5Var2 != null) {
            bb5Var2.D0();
        }
    }

    @Override // o.fv2, o.ut2
    public final void h0(Bundle bundle) {
        E0(bundle);
        bundle.putLong("BuddyId", this.t0);
        bundle.putInt("SelectedTab", 0);
    }

    @Override // o.ut2
    public final void i0() {
        this.S = true;
        ut2 ut2VarE = D().E(R.id.alerts_overview_container);
        h1 h1Var = ut2VarE instanceof h1 ? (h1) ut2VarE : null;
        if (h1Var != null) {
            h1Var.p0 = F0();
        }
        ut2 ut2VarE2 = D().E(R.id.alerts_container);
        h1 h1Var2 = ut2VarE2 instanceof h1 ? (h1) ut2VarE2 : null;
        if (h1Var2 != null) {
            h1Var2.p0 = F0();
        }
    }

    @Override // o.hq4
    public final boolean j(MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == R.id.alert_settings_button) {
            if (it1.c != null) {
                y0(new Intent(E(), (Class<?>) SettingsActivity.class));
                return true;
            }
            im3.e0("viewFactory");
            throw null;
        }
        if (itemId != R.id.alert_help_button) {
            return false;
        }
        x02 x02VarA = ik7.a();
        gk7 gk7Var = new gk7();
        fx3.o(1, "dialogId", x02VarA, gk7Var);
        gk7Var.Z0 = x02VarA;
        gk7Var.H0 = R.string.tv_alerts_dialog_body;
        gk7Var.F0 = R.string.tv_alerts_dialog_title;
        gk7Var.O0 = R.string.tv_ok;
        gk7.O0(gk7Var, C());
        return true;
    }

    @Override // o.ut2
    public final void k0(View view, Bundle bundle) {
        view.getClass();
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.device_alarms_overview_recheckAllAlerts);
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setOnRefreshListener(new io.sentry.q7(this, swipeRefreshLayout, (byte) 17));
        }
    }

    @Override // o.hq4
    public final void u(Menu menu, MenuInflater menuInflater) {
        menu.getClass();
        menuInflater.getClass();
        menuInflater.inflate(R.menu.alerts_overview_menu, menu);
    }
}
