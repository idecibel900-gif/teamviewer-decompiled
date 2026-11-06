package o;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.teamviewer.commonviewmodel.swig.ErrorCodeResultCallback;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListGroupID;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PartnerlistViewModelLocatorSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ServiceCaseEditViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ServiceCaseEditViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewlib.activity.SettingsActivity;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lo/ed0;", "Lo/ic0;", "Lo/bi3;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ed0 extends ic0 implements bi3 {
    public static final /* synthetic */ int L0 = 0;
    public TextView D0;
    public ServiceCaseEditViewModel E0;
    public String F0;
    public String G0;
    public String H0;
    public String I0;
    public String J0;
    public final VoidSignalCallback K0 = SignalCallbackFactory.INSTANCE.getInstance().voidSignalCallback(new y(this, (byte) 18));

    @Override // o.ic0
    public final boolean J0() {
        ServiceCaseEditViewModel serviceCaseEditViewModel = this.E0;
        return (serviceCaseEditViewModel == null || serviceCaseEditViewModel == null || !ServiceCaseEditViewModelSWIGJNI.ServiceCaseEditViewModel_IsEditableByMe(serviceCaseEditViewModel.a, serviceCaseEditViewModel)) ? false : true;
    }

    @Override // o.ic0
    public final void K0() {
        TextView textView = this.D0;
        if (textView != null) {
            this.J0 = String.valueOf(textView != null ? textView.getText() : null);
        }
        ServiceCaseEditViewModel serviceCaseEditViewModel = this.E0;
        if (serviceCaseEditViewModel != null) {
            String str = this.J0;
            vy2 vy2Var = new vy2(r0(), "BuddyISEditFragment", "update note failed");
            ServiceCaseEditViewModelSWIGJNI.ServiceCaseEditViewModel_UpdateNote(serviceCaseEditViewModel.a, serviceCaseEditViewModel, str, ErrorCodeResultCallback.getCPtr((ErrorCodeResultCallback) vy2Var), vy2Var);
        }
        bb5 bb5Var = this.r0;
        if (bb5Var != null) {
            bb5Var.G0();
        }
    }

    @Override // o.ic0
    public final boolean L0() {
        return this.E0 != null;
    }

    @Override // o.ut2
    public final void Y(Menu menu, MenuInflater menuInflater) {
        menu.getClass();
        menuInflater.getClass();
        menuInflater.inflate(R.menu.buddylistinstantsupportedit_menu, menu);
    }

    @Override // o.ut2
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ServiceCaseEditViewModel serviceCaseEditViewModel;
        String strServiceCaseEditViewModel_GetDescription;
        layoutInflater.getClass();
        M0(bundle);
        long jPartnerlistViewModelLocator_GetServiceCaseEditViewModel = PartnerlistViewModelLocatorSWIGJNI.PartnerlistViewModelLocator_GetServiceCaseEditViewModel((int) this.s0);
        if (jPartnerlistViewModelLocator_GetServiceCaseEditViewModel == 0) {
            serviceCaseEditViewModel = null;
        } else {
            serviceCaseEditViewModel = new ServiceCaseEditViewModel();
            serviceCaseEditViewModel.b = true;
            serviceCaseEditViewModel.a = jPartnerlistViewModelLocator_GetServiceCaseEditViewModel;
        }
        this.E0 = serviceCaseEditViewModel;
        if (serviceCaseEditViewModel == null) {
            v0(L0());
            return null;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_buddylistinstantsupportedit, viewGroup, false);
        bb5 bb5Var = this.r0;
        if (bb5Var != null) {
            bb5Var.q(gk6.m, this.x0);
        }
        ServiceCaseEditViewModel serviceCaseEditViewModel2 = this.E0;
        if (bundle != null) {
            strServiceCaseEditViewModel_GetDescription = bundle.getString("buddyNote", serviceCaseEditViewModel2 != null ? ServiceCaseEditViewModelSWIGJNI.ServiceCaseEditViewModel_GetDescription(serviceCaseEditViewModel2.a, serviceCaseEditViewModel2) : null);
        } else {
            strServiceCaseEditViewModel_GetDescription = serviceCaseEditViewModel2 != null ? ServiceCaseEditViewModelSWIGJNI.ServiceCaseEditViewModel_GetDescription(serviceCaseEditViewModel2.a, serviceCaseEditViewModel2) : null;
        }
        this.J0 = strServiceCaseEditViewModel_GetDescription;
        ServiceCaseEditViewModel serviceCaseEditViewModel3 = this.E0;
        this.I0 = serviceCaseEditViewModel3 != null ? ServiceCaseEditViewModelSWIGJNI.ServiceCaseEditViewModel_GetDisplayID(serviceCaseEditViewModel3.a, serviceCaseEditViewModel3) : null;
        ServiceCaseEditViewModel serviceCaseEditViewModel4 = this.E0;
        this.F0 = serviceCaseEditViewModel4 != null ? ServiceCaseEditViewModelSWIGJNI.ServiceCaseEditViewModel_GetName(serviceCaseEditViewModel4.a, serviceCaseEditViewModel4) : null;
        ServiceCaseEditViewModel serviceCaseEditViewModel5 = this.E0;
        this.G0 = serviceCaseEditViewModel5 != null ? ServiceCaseEditViewModelSWIGJNI.ServiceCaseEditViewModel_GetGroup(serviceCaseEditViewModel5.a, serviceCaseEditViewModel5) : null;
        ServiceCaseEditViewModel serviceCaseEditViewModel6 = this.E0;
        this.t0 = new PListGroupID(serviceCaseEditViewModel6 != null ? ServiceCaseEditViewModelSWIGJNI.ServiceCaseEditViewModel_GetGroupID(serviceCaseEditViewModel6.a, serviceCaseEditViewModel6) : 0L);
        ServiceCaseEditViewModel serviceCaseEditViewModel7 = this.E0;
        this.H0 = serviceCaseEditViewModel7 != null ? ServiceCaseEditViewModelSWIGJNI.ServiceCaseEditViewModel_GetAssignee(serviceCaseEditViewModel7.a, serviceCaseEditViewModel7) : null;
        p0().setTitle(this.F0);
        v0(L0());
        TextView textView = (TextView) viewInflate.findViewById(R.id.editInstantSupportId);
        textView.setEnabled(false);
        textView.setText(this.I0);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.editInstantSupportNotes);
        this.D0 = textView2;
        if (textView2 != null) {
            textView2.setText(this.J0);
        }
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.editInstantSupportAssignee);
        textView3.setEnabled(false);
        textView3.setText(this.H0);
        TextView textView4 = (TextView) viewInflate.findViewById(R.id.editPartnerGroup);
        textView4.setEnabled(false);
        textView4.setText(this.G0);
        return viewInflate;
    }

    @Override // o.fv2, o.ut2
    public final void b0() {
        this.D0 = null;
        super.b0();
    }

    @Override // o.ic0, o.ut2
    public final boolean e0(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.instant_support_settings_button) {
            return super.e0(menuItem);
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

    @Override // o.ic0, o.fv2, o.ut2
    public final void h0(Bundle bundle) {
        super.h0(bundle);
        TextView textView = this.D0;
        if (textView != null) {
            this.J0 = String.valueOf(textView.getText());
        }
        bundle.putString("buddyNote", this.J0);
    }

    @Override // o.ic0, o.ut2
    public final void i0() {
        super.i0();
        ServiceCaseEditViewModel serviceCaseEditViewModel = this.E0;
        if (serviceCaseEditViewModel == null) {
            return;
        }
        long j = serviceCaseEditViewModel.a;
        VoidSignalCallback voidSignalCallback = this.K0;
        ServiceCaseEditViewModelSWIGJNI.ServiceCaseEditViewModel_RegisterForDelete(j, serviceCaseEditViewModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
        TextView textView = this.D0;
        if (textView != null) {
            textView.addTextChangedListener(this.z0);
        }
    }

    @Override // o.ut2
    public final void j0() {
        this.S = true;
        this.K0.Disconnect();
        TextView textView = this.D0;
        if (textView != null) {
            textView.removeTextChangedListener(this.z0);
        }
    }
}
