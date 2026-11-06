package o;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PartnerlistViewModelLocatorSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ServiceCaseDetailsViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ServiceCaseDetailsViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewlib.activity.MainActivity;
import com.teamviewer.remotecontrolviewlib.activity.SettingsActivity;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lo/dd0;", "Lo/zb0;", "Lo/bi3;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class dd0 extends zb0 implements bi3 {
    public static final /* synthetic */ int J0 = 0;
    public String A0;
    public String B0;
    public String C0;
    public boolean D0;
    public View E0;
    public FloatingActionButton F0;
    public final io.sentry.android.core.p2 G0 = new io.sentry.android.core.p2(this, (byte) 3);
    public final VoidSignalCallback H0;
    public final VoidSignalCallback I0;
    public ServiceCaseDetailsViewModel s0;
    public TextView t0;
    public TextView u0;
    public TextView v0;
    public TextView w0;
    public long x0;
    public String y0;
    public String z0;

    public dd0() {
        SignalCallbackFactory.Companion companion = SignalCallbackFactory.INSTANCE;
        final byte b = 0;
        this.H0 = companion.getInstance().voidSignalCallback(new Function0(this) { // from class: o.cd0
            public final /* synthetic */ dd0 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b2 = b;
                f88 f88Var = f88.a;
                dd0 dd0Var = this.n;
                switch (b2) {
                    case 0:
                        int i = dd0.J0;
                        dd0Var.H0();
                        dd0Var.I0();
                        break;
                    default:
                        int i2 = dd0.J0;
                        bb5 bb5Var = dd0Var.r0;
                        if (bb5Var != null) {
                            bb5Var.D0();
                        }
                        break;
                }
                return f88Var;
            }
        });
        final byte b2 = 1;
        this.I0 = companion.getInstance().voidSignalCallback(new Function0(this) { // from class: o.cd0
            public final /* synthetic */ dd0 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b3 = b2;
                f88 f88Var = f88.a;
                dd0 dd0Var = this.n;
                switch (b3) {
                    case 0:
                        int i = dd0.J0;
                        dd0Var.H0();
                        dd0Var.I0();
                        break;
                    default:
                        int i2 = dd0.J0;
                        bb5 bb5Var = dd0Var.r0;
                        if (bb5Var != null) {
                            bb5Var.D0();
                        }
                        break;
                }
                return f88Var;
            }
        });
    }

    @Override // o.zb0, o.fv2
    public final hk7 C0(String str) {
        str.getClass();
        return null;
    }

    @Override // o.zb0
    public final boolean G0() {
        return true;
    }

    public final void H0() {
        ServiceCaseDetailsViewModel serviceCaseDetailsViewModel = this.s0;
        if (serviceCaseDetailsViewModel == null) {
            return;
        }
        this.B0 = serviceCaseDetailsViewModel != null ? ServiceCaseDetailsViewModelSWIGJNI.ServiceCaseDetailsViewModel_GetDisplayID(serviceCaseDetailsViewModel.a, serviceCaseDetailsViewModel) : null;
        ServiceCaseDetailsViewModel serviceCaseDetailsViewModel2 = this.s0;
        this.y0 = serviceCaseDetailsViewModel2 != null ? ServiceCaseDetailsViewModelSWIGJNI.ServiceCaseDetailsViewModel_GetName(serviceCaseDetailsViewModel2.a, serviceCaseDetailsViewModel2) : null;
        ServiceCaseDetailsViewModel serviceCaseDetailsViewModel3 = this.s0;
        this.z0 = serviceCaseDetailsViewModel3 != null ? ServiceCaseDetailsViewModelSWIGJNI.ServiceCaseDetailsViewModel_GetGroup(serviceCaseDetailsViewModel3.a, serviceCaseDetailsViewModel3) : null;
        ServiceCaseDetailsViewModel serviceCaseDetailsViewModel4 = this.s0;
        this.A0 = serviceCaseDetailsViewModel4 != null ? ServiceCaseDetailsViewModelSWIGJNI.ServiceCaseDetailsViewModel_GetAssignee(serviceCaseDetailsViewModel4.a, serviceCaseDetailsViewModel4) : null;
        ServiceCaseDetailsViewModel serviceCaseDetailsViewModel5 = this.s0;
        this.C0 = serviceCaseDetailsViewModel5 != null ? ServiceCaseDetailsViewModelSWIGJNI.ServiceCaseDetailsViewModel_GetDescription(serviceCaseDetailsViewModel5.a, serviceCaseDetailsViewModel5) : null;
    }

    public final void I0() {
        if (this.s0 != null) {
            xt2 xt2VarC = C();
            if (xt2VarC != null) {
                xt2VarC.setTitle(this.y0);
            }
            TextView textView = this.v0;
            if (textView != null) {
                textView.setText(this.B0);
            }
            TextView textView2 = this.t0;
            if (textView2 != null) {
                textView2.setText(this.z0);
            }
            TextView textView3 = this.u0;
            if (textView3 != null) {
                textView3.setText(this.A0);
            }
            TextView textView4 = this.w0;
            if (textView4 != null) {
                textView4.setText(this.C0);
            }
            if (this.F0 == null) {
                ye4.c("BuddyISDetailsFragment", "FAB is not initialized");
                return;
            }
            ServiceCaseDetailsViewModel serviceCaseDetailsViewModel = this.s0;
            if (serviceCaseDetailsViewModel == null || !ServiceCaseDetailsViewModelSWIGJNI.ServiceCaseDetailsViewModel_ShowConnect(serviceCaseDetailsViewModel.a, serviceCaseDetailsViewModel)) {
                FloatingActionButton floatingActionButton = this.F0;
                if (floatingActionButton != null) {
                    floatingActionButton.setOnClickListener(null);
                }
                FloatingActionButton floatingActionButton2 = this.F0;
                if (floatingActionButton2 != null) {
                    floatingActionButton2.setVisibility(8);
                    return;
                }
                return;
            }
            FloatingActionButton floatingActionButton3 = this.F0;
            if (floatingActionButton3 != null) {
                floatingActionButton3.setOnClickListener(this.G0);
            }
            FloatingActionButton floatingActionButton4 = this.F0;
            if (floatingActionButton4 != null) {
                floatingActionButton4.setVisibility(0);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:9:0x0017  */
    @Override // o.fv2, o.ut2
    public final void X(Bundle bundle) {
        Bundle bundle2;
        super.X(bundle);
        long j = 0;
        if (bundle != null) {
            long j2 = bundle.getLong("BuddyId", 0L);
            if (j2 != 0) {
                j = j2;
            } else {
                bundle2 = this.r;
                if (bundle2 != null) {
                    j = bundle2.getLong("BuddyId", 0L);
                }
            }
        } else {
            bundle2 = this.r;
            if (bundle2 != null) {
                j = bundle2.getLong("BuddyId", 0L);
            }
        }
        this.x0 = j;
        Bundle bundle3 = this.r;
        if (bundle3 != null) {
            this.D0 = bundle3.getBoolean("ExpandToolbar", false);
        }
    }

    @Override // o.ut2
    public final void Y(Menu menu, MenuInflater menuInflater) {
        ServiceCaseDetailsViewModel serviceCaseDetailsViewModel;
        menu.getClass();
        menuInflater.getClass();
        ServiceCaseDetailsViewModel serviceCaseDetailsViewModel2 = this.s0;
        if (serviceCaseDetailsViewModel2 != null) {
            if ((serviceCaseDetailsViewModel2 == null || !ServiceCaseDetailsViewModelSWIGJNI.ServiceCaseDetailsViewModel_IsEditableByMe(serviceCaseDetailsViewModel2.a, serviceCaseDetailsViewModel2)) && ((serviceCaseDetailsViewModel = this.s0) == null || !ServiceCaseDetailsViewModelSWIGJNI.ServiceCaseDetailsViewModel_IsCloseAllowed(serviceCaseDetailsViewModel.a, serviceCaseDetailsViewModel))) {
                return;
            }
            menuInflater.inflate(R.menu.buddylistinstantsupportdetails_menu, menu);
            ServiceCaseDetailsViewModel serviceCaseDetailsViewModel3 = this.s0;
            if (serviceCaseDetailsViewModel3 == null || !ServiceCaseDetailsViewModelSWIGJNI.ServiceCaseDetailsViewModel_IsEditableByMe(serviceCaseDetailsViewModel3.a, serviceCaseDetailsViewModel3)) {
                menu.removeItem(R.id.editServiceCase);
            }
            ServiceCaseDetailsViewModel serviceCaseDetailsViewModel4 = this.s0;
            if (serviceCaseDetailsViewModel4 == null || !ServiceCaseDetailsViewModelSWIGJNI.ServiceCaseDetailsViewModel_IsCloseAllowed(serviceCaseDetailsViewModel4.a, serviceCaseDetailsViewModel4)) {
                menu.removeItem(R.id.closeServiceCase);
            }
        }
    }

    @Override // o.ut2
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ServiceCaseDetailsViewModel serviceCaseDetailsViewModel;
        layoutInflater.getClass();
        long jPartnerlistViewModelLocator_GetServiceCaseDetailsViewModel = PartnerlistViewModelLocatorSWIGJNI.PartnerlistViewModelLocator_GetServiceCaseDetailsViewModel((int) this.x0);
        if (jPartnerlistViewModelLocator_GetServiceCaseDetailsViewModel == 0) {
            serviceCaseDetailsViewModel = null;
        } else {
            serviceCaseDetailsViewModel = new ServiceCaseDetailsViewModel();
            serviceCaseDetailsViewModel.b = true;
            serviceCaseDetailsViewModel.a = jPartnerlistViewModelLocator_GetServiceCaseDetailsViewModel;
        }
        this.s0 = serviceCaseDetailsViewModel;
        if (serviceCaseDetailsViewModel == null) {
            v0(false);
            return null;
        }
        bb5 bb5Var = this.r0;
        if (bb5Var != null) {
            bb5Var.q(gk6.m, this.D0);
        }
        v0(true);
        View viewInflate = layoutInflater.inflate(R.layout.fragment_buddylistinstantsupportdetails, viewGroup, false);
        if (C() instanceof pa3) {
            KeyEvent.Callback callbackC = C();
            callbackC.getClass();
            CoordinatorLayout coordinatorLayoutU = ((MainActivity) ((pa3) callbackC)).U();
            View viewInflate2 = layoutInflater.inflate(R.layout.partner_details_fab_actions, (ViewGroup) coordinatorLayoutU, false);
            this.E0 = viewInflate2;
            FloatingActionButton floatingActionButton = viewInflate2 != null ? (FloatingActionButton) viewInflate2.findViewById(R.id.partner_floating_action_button) : null;
            this.F0 = floatingActionButton;
            if (floatingActionButton != null) {
                floatingActionButton.setOnClickListener(this.G0);
            }
            coordinatorLayoutU.addView(this.E0);
        }
        this.v0 = (TextView) viewInflate.findViewById(R.id.instantSupport_displayId);
        this.u0 = (TextView) viewInflate.findViewById(R.id.instantSupport_assignee);
        this.t0 = (TextView) viewInflate.findViewById(R.id.instantSupport_group);
        this.w0 = (TextView) viewInflate.findViewById(R.id.instantSupport_description);
        return viewInflate;
    }

    @Override // o.fv2, o.ut2
    public final void b0() {
        super.b0();
        KeyEvent.Callback callbackC = C();
        pa3 pa3Var = callbackC instanceof pa3 ? (pa3) callbackC : null;
        if (pa3Var != null) {
            ((MainActivity) pa3Var).U().removeView(this.E0);
        }
        this.D0 = false;
        this.F0 = null;
        this.w0 = null;
        this.t0 = null;
        this.u0 = null;
        this.v0 = null;
        this.s0 = null;
    }

    @Override // o.ut2
    public final boolean e0(MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == R.id.editServiceCase) {
            bb5 bb5Var = this.r0;
            if (bb5Var == null) {
                return true;
            }
            if (it1.c == null) {
                im3.e0("viewFactory");
                throw null;
            }
            long j = this.x0;
            ed0 ed0Var = new ed0();
            Bundle bundle = new Bundle();
            bundle.putLong("BuddyId", j);
            bundle.putBoolean("ExpandToolbar", false);
            ed0Var.u0(bundle);
            bb5Var.I0(ed0Var, true);
            return true;
        }
        if (itemId == R.id.closeServiceCase) {
            ServiceCaseDetailsViewModel serviceCaseDetailsViewModel = this.s0;
            if (serviceCaseDetailsViewModel != null) {
                ServiceCaseDetailsViewModelSWIGJNI.ServiceCaseDetailsViewModel_CloseCase(serviceCaseDetailsViewModel.a, serviceCaseDetailsViewModel);
            }
            bb5 bb5Var2 = this.r0;
            if (bb5Var2 != null) {
                bb5Var2.G0();
                return false;
            }
        } else if (itemId == R.id.service_queue_item_settings_button) {
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
        return false;
    }

    @Override // o.fv2, o.ut2
    public final void h0(Bundle bundle) {
        E0(bundle);
        bundle.putLong("BuddyId", this.x0);
    }

    @Override // o.ut2
    public final void i0() {
        this.S = true;
        H0();
        I0();
        ServiceCaseDetailsViewModel serviceCaseDetailsViewModel = this.s0;
        if (serviceCaseDetailsViewModel != null) {
            if (serviceCaseDetailsViewModel != null) {
                long j = serviceCaseDetailsViewModel.a;
                VoidSignalCallback voidSignalCallback = this.H0;
                ServiceCaseDetailsViewModelSWIGJNI.ServiceCaseDetailsViewModel_RegisterForChanges(j, serviceCaseDetailsViewModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
            }
            ServiceCaseDetailsViewModel serviceCaseDetailsViewModel2 = this.s0;
            if (serviceCaseDetailsViewModel2 != null) {
                long j2 = serviceCaseDetailsViewModel2.a;
                VoidSignalCallback voidSignalCallback2 = this.I0;
                ServiceCaseDetailsViewModelSWIGJNI.ServiceCaseDetailsViewModel_RegisterForDelete(j2, serviceCaseDetailsViewModel2, VoidSignalCallback.getCPtr(voidSignalCallback2), voidSignalCallback2);
            }
        }
    }

    @Override // o.ut2
    public final void j0() {
        this.S = true;
        this.H0.Disconnect();
        this.I0.Disconnect();
    }

    @Override // o.ut2
    public final void u0(Bundle bundle) {
        super.u0(bundle);
        if (bundle != null) {
            this.x0 = bundle.getLong("BuddyId", 0L);
        }
    }
}
