package o;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.teamviewer.chatviewlib.view.RoundAccountPictureImageView;
import com.teamviewer.commonviewmodel.swig.ErrorCodeResultCallback;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListContactID;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListGroupID;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListGroupIDSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ContactEditViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ContactEditViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupListViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupListViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PartnerlistViewModelLocatorSWIGJNI;
import com.teamviewer.remotecontrolviewlib.activity.MainActivity;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo/le0;", "Lo/ic0;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class le0 extends ic0 {
    public static final /* synthetic */ int M0 = 0;
    public RoundAccountPictureImageView D0;
    public EditText E0;
    public EditText F0;
    public ContactEditViewModel G0;
    public String H0;
    public long I0;
    public String J0;
    public boolean K0;
    public final VoidSignalCallback L0 = SignalCallbackFactory.INSTANCE.getInstance().voidSignalCallback(new y(this, (byte) 21));

    @Override // o.ic0
    public final boolean J0() {
        ContactEditViewModel contactEditViewModel = this.G0;
        return contactEditViewModel != null && ContactEditViewModelSWIGJNI.ContactEditViewModel_IsEditableByMe(contactEditViewModel.a, contactEditViewModel);
    }

    @Override // o.ic0
    public final void K0() {
        ContactEditViewModel contactEditViewModel;
        Spinner spinner = this.v0;
        Object selectedItem = spinner != null ? spinner.getSelectedItem() : null;
        selectedItem.getClass();
        PListGroupID pListGroupID = (PListGroupID) selectedItem;
        EditText editText = this.F0;
        String strValueOf = String.valueOf(editText != null ? editText.getText() : null);
        if (this.s0 > 0) {
            ContactEditViewModel contactEditViewModel2 = this.G0;
            if (contactEditViewModel2 != null) {
                vy2 vy2Var = new vy2(r0(), "BuddyPEditFragment", "update contact failed");
                ContactEditViewModelSWIGJNI.ContactEditViewModel_UpdateContact(contactEditViewModel2.a, contactEditViewModel2, PListGroupID.a(pListGroupID), pListGroupID, strValueOf, ErrorCodeResultCallback.getCPtr((ErrorCodeResultCallback) vy2Var), vy2Var);
            }
        } else {
            long j = this.I0;
            if (j > 0) {
                ContactEditViewModel contactEditViewModel3 = this.G0;
                if (contactEditViewModel3 != null) {
                    ContactEditViewModelSWIGJNI.ContactEditViewModel_CreateContactByAccountId(contactEditViewModel3.a, contactEditViewModel3, j, strValueOf, pListGroupID.a, pListGroupID);
                }
                if (this.K0 && (contactEditViewModel = this.G0) != null) {
                    ContactEditViewModelSWIGJNI.ContactEditViewModel_ReportEvent(contactEditViewModel.a, contactEditViewModel, 0);
                }
            } else {
                EditText editText2 = this.E0;
                String strValueOf2 = String.valueOf(editText2 != null ? editText2.getText() : null);
                ContactEditViewModel contactEditViewModel4 = this.G0;
                if (contactEditViewModel4 != null) {
                    vy2 vy2Var2 = new vy2(r0(), "BuddyPEditFragment", "create contact failed");
                    ContactEditViewModelSWIGJNI.ContactEditViewModel_CreateContact(contactEditViewModel4.a, contactEditViewModel4, strValueOf2, pListGroupID.a, pListGroupID, strValueOf, ErrorCodeResultCallback.getCPtr((ErrorCodeResultCallback) vy2Var2), vy2Var2);
                }
            }
        }
        bb5 bb5Var = this.r0;
        if (bb5Var != null) {
            bb5Var.G0();
        }
    }

    @Override // o.ic0
    public final boolean L0() {
        return this.G0 != null;
    }

    @Override // o.ut2
    public final void Y(Menu menu, MenuInflater menuInflater) {
        menu.getClass();
        menuInflater.getClass();
        menuInflater.inflate(R.menu.buddylistpartneredit_menu, menu);
    }

    @Override // o.ut2
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ContactEditViewModel contactEditViewModel;
        ContactEditViewModel contactEditViewModel2;
        layoutInflater.getClass();
        M0(bundle);
        PListContactID pListContactID = new PListContactID(this.s0);
        long jPartnerlistViewModelLocator_GetContactEditViewModel = PartnerlistViewModelLocatorSWIGJNI.PartnerlistViewModelLocator_GetContactEditViewModel(pListContactID.a, pListContactID);
        if (jPartnerlistViewModelLocator_GetContactEditViewModel == 0) {
            contactEditViewModel = null;
        } else {
            contactEditViewModel = new ContactEditViewModel();
            contactEditViewModel.b = true;
            contactEditViewModel.a = jPartnerlistViewModelLocator_GetContactEditViewModel;
        }
        this.G0 = contactEditViewModel;
        if (contactEditViewModel == null) {
            v0(L0());
            return null;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_buddylistpartneredit, viewGroup, false);
        bb5 bb5Var = this.r0;
        if (bb5Var != null) {
            bb5Var.q(gk6.m, this.x0);
        }
        ContactEditViewModel contactEditViewModel3 = this.G0;
        if (bundle != null) {
            this.H0 = bundle.getString("AccountName", contactEditViewModel3 != null ? ContactEditViewModelSWIGJNI.ContactEditViewModel_GetName(contactEditViewModel3.a, contactEditViewModel3) : null);
            this.I0 = bundle.getLong("AccountId", 0L);
            ContactEditViewModel contactEditViewModel4 = this.G0;
            this.J0 = bundle.getString("Note", contactEditViewModel4 != null ? ContactEditViewModelSWIGJNI.ContactEditViewModel_GetNote(contactEditViewModel4.a, contactEditViewModel4) : null);
        } else {
            this.H0 = contactEditViewModel3 != null ? ContactEditViewModelSWIGJNI.ContactEditViewModel_GetName(contactEditViewModel3.a, contactEditViewModel3) : null;
            ContactEditViewModel contactEditViewModel5 = this.G0;
            this.J0 = contactEditViewModel5 != null ? ContactEditViewModelSWIGJNI.ContactEditViewModel_GetNote(contactEditViewModel5.a, contactEditViewModel5) : null;
        }
        PListGroupID pListGroupID = this.t0;
        if (!PListGroupIDSWIGJNI.PListGroupID_Valid(pListGroupID.a, pListGroupID) && (contactEditViewModel2 = this.G0) != null) {
            this.t0 = new PListGroupID(0, ContactEditViewModelSWIGJNI.ContactEditViewModel_GetGroupID(contactEditViewModel2.a, contactEditViewModel2));
        }
        this.E0 = (EditText) viewInflate.findViewById(R.id.partner_name);
        this.F0 = (EditText) viewInflate.findViewById(R.id.editPartnerNotes);
        this.v0 = (Spinner) viewInflate.findViewById(R.id.editPartnerGroupSpinner);
        Bundle bundle2 = this.r;
        if (bundle2 != null) {
            this.I0 = bundle2.getLong("AccountId");
            this.K0 = bundle2.getBoolean("NearbyContact", false);
        }
        GroupListViewModel groupListViewModelL = ds1.l(true);
        mq1 mq1Var = groupListViewModelL != null ? new mq1(groupListViewModelL) : null;
        if (C() instanceof fa3) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            RoundAccountPictureImageView roundAccountPictureImageView = new RoundAccountPictureImageView(r0());
            this.D0 = roundAccountPictureImageView;
            roundAccountPictureImageView.setLayoutParams(layoutParams);
            roundAccountPictureImageView.setPlaceHolder(2131230898);
            KeyEvent.Callback callbackC = C();
            callbackC.getClass();
            ((fa3) callbackC).setExpandedToolbarView(roundAccountPictureImageView);
        }
        boolean z = this.s0 == 0;
        xt2 xt2VarC = C();
        if (xt2VarC != null) {
            xt2VarC.setTitle(z ? I(R.string.tv_details_newContact) : this.H0);
        }
        v0(L0());
        viewInflate.findViewById(R.id.partner_name_container).setVisibility((!z || this.K0) ? 8 : 0);
        EditText editText = this.E0;
        if (editText != null) {
            editText.setText(this.H0);
        }
        Spinner spinner = this.v0;
        if (spinner != null) {
            spinner.setAdapter((SpinnerAdapter) mq1Var);
        }
        EditText editText2 = this.F0;
        if (editText2 != null) {
            editText2.setText(this.J0);
        }
        PListGroupID pListGroupID2 = this.t0;
        if (PListGroupIDSWIGJNI.PListGroupID_Valid(pListGroupID2.a, pListGroupID2) && mq1Var != null) {
            PListGroupID pListGroupID3 = this.t0;
            GroupListViewModel groupListViewModel = mq1Var.m;
            this.u0 = GroupListViewModelSWIGJNI.GroupListViewModel_GetIndexForGroupID(groupListViewModel.a, groupListViewModel, PListGroupID.a(pListGroupID3), pListGroupID3);
        }
        Spinner spinner2 = this.v0;
        if (spinner2 != null) {
            spinner2.setSelection(this.u0);
        }
        return viewInflate;
    }

    @Override // o.fv2, o.ut2
    public final void b0() {
        super.b0();
        if (C() instanceof fa3) {
            KeyEvent.Callback callbackC = C();
            callbackC.getClass();
            FrameLayout frameLayout = ((MainActivity) ((fa3) callbackC)).T;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
        }
        this.v0 = null;
        this.F0 = null;
        this.E0 = null;
        this.D0 = null;
    }

    @Override // o.ic0, o.fv2, o.ut2
    public final void h0(Bundle bundle) {
        super.h0(bundle);
        EditText editText = this.E0;
        if (editText != null) {
            bundle.putString("AccountName", editText.toString());
        }
        EditText editText2 = this.F0;
        if (editText2 != null) {
            bundle.putString("Note", editText2.toString());
        }
        bundle.putLong("AccountId", this.I0);
    }

    @Override // o.ic0, o.ut2
    public final void i0() {
        super.i0();
        ContactEditViewModel contactEditViewModel = this.G0;
        if (contactEditViewModel == null) {
            return;
        }
        RoundAccountPictureImageView roundAccountPictureImageView = this.D0;
        if (roundAccountPictureImageView != null) {
            roundAccountPictureImageView.a(ContactEditViewModelSWIGJNI.ContactEditViewModel_GetAccountPictureUrl(contactEditViewModel.a, contactEditViewModel), false);
        } else {
            ye4.c("BuddyPEditFragment", "Partner image view is not initialized");
        }
        EditText editText = this.E0;
        hc0 hc0Var = this.z0;
        if (editText != null) {
            editText.addTextChangedListener(hc0Var);
        }
        EditText editText2 = this.F0;
        if (editText2 != null) {
            editText2.addTextChangedListener(hc0Var);
        }
        long j = contactEditViewModel.a;
        VoidSignalCallback voidSignalCallback = this.L0;
        ContactEditViewModelSWIGJNI.ContactEditViewModel_RegisterForDelete(j, contactEditViewModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
    }

    @Override // o.ut2
    public final void j0() {
        this.S = true;
        EditText editText = this.E0;
        hc0 hc0Var = this.z0;
        if (editText != null) {
            editText.removeTextChangedListener(hc0Var);
        }
        EditText editText2 = this.F0;
        if (editText2 != null) {
            editText2.removeTextChangedListener(hc0Var);
        }
        this.L0.Disconnect();
    }
}
