package o;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IPLSynchronizationStateViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IPLSynchronizationStateViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PartnerlistViewModelLocatorSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ServiceCaseListViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ServiceCaseListViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewlib.activity.SettingsActivity;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lo/br6;", "Lo/zb0;", "Lo/hq4;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class br6 extends zb0 implements hq4 {
    public static final /* synthetic */ int A0 = 0;
    public ServiceCaseListViewModel s0;
    public IPLSynchronizationStateViewModel t0;
    public ProgressBar u0;
    public RecyclerView v0;
    public de w0;
    public View x0;
    public final VoidSignalCallback y0;
    public final VoidSignalCallback z0;

    public br6() {
        SignalCallbackFactory.Companion companion = SignalCallbackFactory.INSTANCE;
        final byte b = 0;
        this.y0 = companion.getInstance().voidSignalCallback(new Function0(this) { // from class: o.ar6
            public final /* synthetic */ br6 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b2 = b;
                f88 f88Var = f88.a;
                br6 br6Var = this.n;
                switch (b2) {
                    case 0:
                        de deVar = br6Var.w0;
                        if (deVar != null) {
                            deVar.d();
                        }
                        br6Var.H0();
                        break;
                    default:
                        int i = br6.A0;
                        br6Var.H0();
                        break;
                }
                return f88Var;
            }
        });
        final byte b2 = 1;
        this.z0 = companion.getInstance().voidSignalCallback(new Function0(this) { // from class: o.ar6
            public final /* synthetic */ br6 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b3 = b2;
                f88 f88Var = f88.a;
                br6 br6Var = this.n;
                switch (b3) {
                    case 0:
                        de deVar = br6Var.w0;
                        if (deVar != null) {
                            deVar.d();
                        }
                        br6Var.H0();
                        break;
                    default:
                        int i = br6.A0;
                        br6Var.H0();
                        break;
                }
                return f88Var;
            }
        });
    }

    @Override // o.zb0
    public final boolean G0() {
        return true;
    }

    public final void H0() {
        ServiceCaseListViewModel serviceCaseListViewModel = this.s0;
        int iServiceCaseListViewModel_GetSize = serviceCaseListViewModel != null ? ServiceCaseListViewModelSWIGJNI.ServiceCaseListViewModel_GetSize(serviceCaseListViewModel.a, serviceCaseListViewModel) : 0;
        IPLSynchronizationStateViewModel iPLSynchronizationStateViewModel = this.t0;
        boolean zIPLSynchronizationStateViewModel_SynchronizationSucceeded = iPLSynchronizationStateViewModel != null ? IPLSynchronizationStateViewModelSWIGJNI.IPLSynchronizationStateViewModel_SynchronizationSucceeded(iPLSynchronizationStateViewModel.a, iPLSynchronizationStateViewModel) : true;
        ProgressBar progressBar = this.u0;
        if (iServiceCaseListViewModel_GetSize == 0) {
            if (progressBar != null) {
                progressBar.setVisibility(zIPLSynchronizationStateViewModel_SynchronizationSucceeded ? 8 : 0);
            }
            View view = this.x0;
            if (view != null) {
                view.setVisibility(zIPLSynchronizationStateViewModel_SynchronizationSucceeded ? 0 : 8);
            }
            RecyclerView recyclerView = this.v0;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
                return;
            }
            return;
        }
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        View view2 = this.x0;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        RecyclerView recyclerView2 = this.v0;
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(0);
        }
    }

    @Override // o.ut2
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ServiceCaseListViewModel serviceCaseListViewModel;
        layoutInflater.getClass();
        p0().setTitle(R.string.tv_serviceCases);
        p0().v(this, L());
        long jPartnerlistViewModelLocator_GetServiceCaseListViewModel = PartnerlistViewModelLocatorSWIGJNI.PartnerlistViewModelLocator_GetServiceCaseListViewModel();
        if (jPartnerlistViewModelLocator_GetServiceCaseListViewModel == 0) {
            serviceCaseListViewModel = null;
        } else {
            serviceCaseListViewModel = new ServiceCaseListViewModel();
            serviceCaseListViewModel.b = true;
            serviceCaseListViewModel.a = jPartnerlistViewModelLocator_GetServiceCaseListViewModel;
        }
        this.s0 = serviceCaseListViewModel;
        ye4 ye4Var = ye4.a;
        if (serviceCaseListViewModel == null) {
            ye4Var.g("ServiceQueueFragment", "onCreateView: serviceCaseListViewModel is null");
            return null;
        }
        IPLSynchronizationStateViewModel iPLSynchronizationStateViewModelP = ds1.p();
        this.t0 = iPLSynchronizationStateViewModelP;
        if (iPLSynchronizationStateViewModelP == null) {
            ye4Var.g("ServiceQueueFragment", "onCreateView: plSyncViewModel is null");
        }
        this.w0 = new de(this.s0, new g95(this));
        View viewInflate = layoutInflater.inflate(R.layout.fragment_service_queue, viewGroup, false);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0);
        RecyclerView recyclerView = viewInflate != null ? (RecyclerView) viewInflate.findViewById(R.id.serviceQueueRecyclerView) : null;
        this.v0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        RecyclerView recyclerView2 = this.v0;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.w0);
        }
        this.u0 = viewInflate != null ? (ProgressBar) viewInflate.findViewById(R.id.service_queue_loading_progress_bar) : null;
        this.x0 = viewInflate != null ? viewInflate.findViewById(R.id.service_queue_empty_state) : null;
        H0();
        bb5 bb5Var = this.r0;
        if (bb5Var != null) {
            bb5Var.q(gk6.n, false);
        }
        return viewInflate;
    }

    @Override // o.fv2, o.ut2
    public final void g0() {
        super.g0();
        de deVar = this.w0;
        if (deVar != null) {
            deVar.d();
        }
        H0();
    }

    @Override // o.ut2
    public final void i0() {
        this.S = true;
        ServiceCaseListViewModel serviceCaseListViewModel = this.s0;
        if (serviceCaseListViewModel != null) {
            long j = serviceCaseListViewModel.a;
            VoidSignalCallback voidSignalCallback = this.y0;
            ServiceCaseListViewModelSWIGJNI.ServiceCaseListViewModel_RegisterForChanges(j, serviceCaseListViewModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
        }
        IPLSynchronizationStateViewModel iPLSynchronizationStateViewModel = this.t0;
        if (iPLSynchronizationStateViewModel != null) {
            long j2 = iPLSynchronizationStateViewModel.a;
            VoidSignalCallback voidSignalCallback2 = this.z0;
            IPLSynchronizationStateViewModelSWIGJNI.IPLSynchronizationStateViewModel_RegisterForSynchronizationChanges(j2, iPLSynchronizationStateViewModel, VoidSignalCallback.getCPtr(voidSignalCallback2), voidSignalCallback2);
        }
        s7 s7Var = u7.g;
        vn4.g0();
        u7.d(this);
    }

    @Override // o.hq4
    public final boolean j(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.service_queue_settings_button) {
            return false;
        }
        if (it1.c != null) {
            y0(new Intent(E(), (Class<?>) SettingsActivity.class));
            return true;
        }
        im3.e0("viewFactory");
        throw null;
    }

    @Override // o.ut2
    public final void j0() {
        if (this.t0 != null) {
            this.z0.Disconnect();
        }
        if (this.s0 != null) {
            this.y0.Disconnect();
        }
        this.S = true;
        s7 s7Var = u7.g;
        vn4.g0();
        u7.e(this);
    }

    @Override // o.hq4
    public final void u(Menu menu, MenuInflater menuInflater) {
        menu.getClass();
        menuInflater.getClass();
        menu.clear();
        menuInflater.inflate(R.menu.service_queue_overview_menu, menu);
    }
}
