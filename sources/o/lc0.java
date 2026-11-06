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
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.teamviewer.commonviewmodel.swig.ErrorCodeResultCallback;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListComputerID;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListDyngateID;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListDyngateIDSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListGroupID;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListGroupIDSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ComputerEditViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ComputerEditViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupListViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupListViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewlib.activity.MainActivity;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo/lc0;", "Lo/ic0;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class lc0 extends ic0 {
    public static final /* synthetic */ int P0 = 0;
    public boolean D0;
    public boolean E0;
    public EditText F0;
    public EditText G0;
    public EditText H0;
    public EditText I0;
    public ComputerEditViewModel J0;
    public String K0;
    public String L0;
    public String M0;
    public String N0;
    public final VoidSignalCallback O0 = SignalCallbackFactory.INSTANCE.getInstance().voidSignalCallback(new y(this, (byte) 16));

    @Override // o.ic0, o.zb0, o.fv2
    public final hk7 C0(String str) {
        str.getClass();
        return "InvalidTeamViewerId".equals(str) ? new c6((byte) 3) : super.C0(str);
    }

    @Override // o.ic0
    public final boolean J0() {
        ComputerEditViewModel computerEditViewModel = this.J0;
        return (computerEditViewModel == null || computerEditViewModel == null || !ComputerEditViewModelSWIGJNI.ComputerEditViewModel_IsEditableByMe(computerEditViewModel.a, computerEditViewModel)) ? false : true;
    }

    @Override // o.ic0
    public final void K0() {
        ComputerEditViewModel computerEditViewModel;
        EditText editText = this.G0;
        String strValueOf = String.valueOf(editText != null ? editText.getText() : null);
        EditText editText2 = this.H0;
        String strValueOf2 = String.valueOf(editText2 != null ? editText2.getText() : null);
        Spinner spinner = this.v0;
        Object selectedItem = spinner != null ? spinner.getSelectedItem() : null;
        selectedItem.getClass();
        PListGroupID pListGroupID = (PListGroupID) selectedItem;
        EditText editText3 = this.I0;
        String strValueOf3 = String.valueOf(editText3 != null ? editText3.getText() : null);
        EditText editText4 = this.F0;
        if (ub7.x0(String.valueOf(editText4 != null ? editText4.getText() : null)).toString().length() > 10) {
            x02 x02VarA = ik7.a();
            gk7 gk7Var = new gk7();
            fx3.o(1, "dialogId", x02VarA, gk7Var);
            gk7Var.Z0 = x02VarA;
            gk7Var.F0 = R.string.tv_popupWrongTvIdHead;
            gk7Var.H0 = R.string.tv_popupWrongTvIdDesc;
            gk7Var.K0 = R.string.tv_ok;
            D0("InvalidTeamViewerId", new r02(gk7Var, p02.Neutral));
            gk7.O0(gk7Var, C());
            return;
        }
        if (this.s0 > 0) {
            ComputerEditViewModel computerEditViewModel2 = this.J0;
            if (computerEditViewModel2 != null) {
                boolean z = this.D0;
                vy2 vy2Var = new vy2(r0(), "BuddyCEditFragment", "update computer failed");
                ComputerEditViewModelSWIGJNI.ComputerEditViewModel_UpdateComputer(computerEditViewModel2.a, computerEditViewModel2, strValueOf, strValueOf2, z, PListGroupID.a(pListGroupID), pListGroupID, strValueOf3, ErrorCodeResultCallback.getCPtr((ErrorCodeResultCallback) vy2Var), vy2Var);
            }
        } else {
            EditText editText5 = this.F0;
            String strValueOf4 = String.valueOf(editText5 != null ? editText5.getText() : null);
            ComputerEditViewModel computerEditViewModel3 = this.J0;
            if (computerEditViewModel3 != null) {
                vy2 vy2Var2 = new vy2(r0(), "BuddyCEditFragment", "create computer failed");
                ComputerEditViewModelSWIGJNI.ComputerEditViewModel_CreateComputer(computerEditViewModel3.a, computerEditViewModel3, strValueOf4, strValueOf, strValueOf2, pListGroupID.a, pListGroupID, strValueOf3, ErrorCodeResultCallback.getCPtr((ErrorCodeResultCallback) vy2Var2), vy2Var2);
            }
            if (this.E0 && (computerEditViewModel = this.J0) != null) {
                ComputerEditViewModelSWIGJNI.ComputerEditViewModel_ReportEvent(computerEditViewModel.a, computerEditViewModel, 0);
            }
        }
        bb5 bb5Var = this.r0;
        if (bb5Var != null) {
            bb5Var.G0();
        }
    }

    @Override // o.ic0
    public final boolean L0() {
        return this.J0 != null;
    }

    @Override // o.ut2
    public final void Y(Menu menu, MenuInflater menuInflater) {
        menu.getClass();
        menuInflater.getClass();
        menuInflater.inflate(R.menu.buddylistcomputeredit_menu, menu);
    }

    @Override // o.ut2
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String strPListDyngateID_GetAsString;
        String string;
        EditText editText;
        String strPListDyngateID_GetAsString2;
        layoutInflater.getClass();
        M0(bundle);
        ComputerEditViewModel computerEditViewModelI = ds1.i(new PListComputerID(this.s0));
        this.J0 = computerEditViewModelI;
        if (computerEditViewModelI == null) {
            v0(L0());
            return null;
        }
        boolean z = false;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_buddylistcomputeredit, viewGroup, false);
        bb5 bb5Var = this.r0;
        if (bb5Var != null) {
            bb5Var.q(gk6.m, this.x0);
        }
        if (bundle != null) {
            this.D0 = bundle.getBoolean("PasswordChanged", false);
            ComputerEditViewModel computerEditViewModel = this.J0;
            if (computerEditViewModel != null) {
                PListDyngateID pListDyngateIDA = computerEditViewModel.a();
                strPListDyngateID_GetAsString2 = PListDyngateIDSWIGJNI.PListDyngateID_GetAsString(pListDyngateIDA.a, pListDyngateIDA);
            } else {
                strPListDyngateID_GetAsString2 = null;
            }
            this.L0 = bundle.getString("TeamViewerID", strPListDyngateID_GetAsString2);
            ComputerEditViewModel computerEditViewModel2 = this.J0;
            this.M0 = bundle.getString("Alias", computerEditViewModel2 != null ? ComputerEditViewModelSWIGJNI.ComputerEditViewModel_GetAlias(computerEditViewModel2.a, computerEditViewModel2) : null);
            string = bundle.getString("Password", null);
            ComputerEditViewModel computerEditViewModel3 = this.J0;
            this.N0 = bundle.getString("Note", computerEditViewModel3 != null ? ComputerEditViewModelSWIGJNI.ComputerEditViewModel_GetNote(computerEditViewModel3.a, computerEditViewModel3) : null);
        } else {
            ComputerEditViewModel computerEditViewModel4 = this.J0;
            if (computerEditViewModel4 != null) {
                PListDyngateID pListDyngateIDA2 = computerEditViewModel4.a();
                strPListDyngateID_GetAsString = PListDyngateIDSWIGJNI.PListDyngateID_GetAsString(pListDyngateIDA2.a, pListDyngateIDA2);
            } else {
                strPListDyngateID_GetAsString = null;
            }
            this.L0 = strPListDyngateID_GetAsString;
            if (im3.n(strPListDyngateID_GetAsString, "0")) {
                this.L0 = "";
            }
            ComputerEditViewModel computerEditViewModel5 = this.J0;
            this.M0 = computerEditViewModel5 != null ? ComputerEditViewModelSWIGJNI.ComputerEditViewModel_GetAlias(computerEditViewModel5.a, computerEditViewModel5) : null;
            ComputerEditViewModel computerEditViewModel6 = this.J0;
            this.N0 = computerEditViewModel6 != null ? ComputerEditViewModelSWIGJNI.ComputerEditViewModel_GetNote(computerEditViewModel6.a, computerEditViewModel6) : null;
            string = null;
        }
        ComputerEditViewModel computerEditViewModel7 = this.J0;
        this.K0 = computerEditViewModel7 != null ? ComputerEditViewModelSWIGJNI.ComputerEditViewModel_GetDisplayName(computerEditViewModel7.a, computerEditViewModel7) : null;
        ComputerEditViewModel computerEditViewModel8 = this.J0;
        PListGroupID pListGroupID = this.t0;
        if (!PListGroupIDSWIGJNI.PListGroupID_Valid(pListGroupID.a, pListGroupID) && computerEditViewModel8 != null) {
            this.t0 = new PListGroupID(0, ComputerEditViewModelSWIGJNI.ComputerEditViewModel_GetGroupID(computerEditViewModel8.a, computerEditViewModel8));
        }
        this.F0 = (EditText) viewInflate.findViewById(R.id.editComputerId);
        this.G0 = (EditText) viewInflate.findViewById(R.id.editComputerAlias);
        this.H0 = (EditText) viewInflate.findViewById(R.id.editComputerPassword);
        this.I0 = (EditText) viewInflate.findViewById(R.id.editComputerNotes);
        this.v0 = (Spinner) viewInflate.findViewById(R.id.editComputerGroupSpinner);
        Bundle bundle2 = this.r;
        if (bundle2 != null) {
            this.L0 = bundle2.getString("TeamViewerID");
            this.M0 = bundle2.getString("Alias");
            this.E0 = bundle2.getBoolean("NearbyDevice", false);
        }
        if (C() instanceof fa3) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, H().getDimensionPixelSize(R.dimen.collapsing_toolbar_expanded_background_computer_height));
            layoutParams.gravity = 17;
            ImageView imageView = new ImageView(E());
            imageView.setLayoutParams(layoutParams);
            imageView.setImageResource(R.drawable.computer_details_header);
            KeyEvent.Callback callbackC = C();
            callbackC.getClass();
            ((fa3) callbackC).setExpandedToolbarView(imageView);
        }
        boolean z2 = this.s0 == 0;
        xt2 xt2VarC = C();
        if (xt2VarC != null) {
            xt2VarC.setTitle(z2 ? I(R.string.tv_details_newComputer) : this.K0);
        }
        v0(L0());
        EditText editText2 = this.F0;
        if (editText2 != null) {
            editText2.setText(this.L0);
        }
        EditText editText3 = this.F0;
        if (editText3 != null) {
            if (z2 && !this.E0) {
                z = true;
            }
            editText3.setEnabled(z);
        }
        EditText editText4 = this.G0;
        if (editText4 != null) {
            editText4.setText(this.M0);
        }
        if (string != null) {
            EditText editText5 = this.H0;
            if (editText5 != null) {
                editText5.setText(string);
            }
        } else {
            ComputerEditViewModel computerEditViewModel9 = this.J0;
            if (computerEditViewModel9 != null && ComputerEditViewModelSWIGJNI.ComputerEditViewModel_HasPasswordSet(computerEditViewModel9.a, computerEditViewModel9) && (editText = this.H0) != null) {
                editText.setText("************");
            }
        }
        EditText editText6 = this.H0;
        if (editText6 != null) {
            editText6.setOnFocusChangeListener(new v6(this, (byte) 3));
        }
        EditText editText7 = this.I0;
        if (editText7 != null) {
            editText7.setText(this.N0);
        }
        GroupListViewModel groupListViewModelL = ds1.l(true);
        if (groupListViewModelL != null) {
            mq1 mq1Var = new mq1(groupListViewModelL);
            Spinner spinner = this.v0;
            if (spinner != null) {
                spinner.setAdapter((SpinnerAdapter) mq1Var);
            }
            PListGroupID pListGroupID2 = this.t0;
            if (PListGroupIDSWIGJNI.PListGroupID_Valid(pListGroupID2.a, pListGroupID2)) {
                PListGroupID pListGroupID3 = this.t0;
                GroupListViewModel groupListViewModel = mq1Var.m;
                this.u0 = GroupListViewModelSWIGJNI.GroupListViewModel_GetIndexForGroupID(groupListViewModel.a, groupListViewModel, PListGroupID.a(pListGroupID3), pListGroupID3);
            }
        }
        Spinner spinner2 = this.v0;
        if (spinner2 != null) {
            spinner2.setSelection(this.u0);
        }
        return viewInflate;
    }

    @Override // o.fv2, o.ut2
    public final void b0() {
        FrameLayout frameLayout;
        super.b0();
        KeyEvent.Callback callbackC = C();
        if ((callbackC instanceof fa3) && (frameLayout = ((MainActivity) ((fa3) callbackC)).T) != null) {
            frameLayout.removeAllViews();
        }
        this.F0 = null;
        this.G0 = null;
        this.H0 = null;
        this.I0 = null;
    }

    @Override // o.ic0, o.fv2, o.ut2
    public final void h0(Bundle bundle) {
        super.h0(bundle);
        bundle.putBoolean("PasswordChanged", this.D0);
        EditText editText = this.F0;
        if (editText != null) {
            bundle.putString("TeamViewerID", editText.getText().toString());
        }
        EditText editText2 = this.G0;
        if (editText2 != null) {
            bundle.putString("Alias", editText2.getText().toString());
        }
        EditText editText3 = this.H0;
        if (editText3 != null) {
            bundle.putString("Password", editText3.getText().toString());
        }
        EditText editText4 = this.I0;
        if (editText4 != null) {
            bundle.putString("Note", editText4.getText().toString());
        }
    }

    @Override // o.ic0, o.ut2
    public final void i0() {
        super.i0();
        ComputerEditViewModel computerEditViewModel = this.J0;
        if (computerEditViewModel == null) {
            return;
        }
        long j = computerEditViewModel.a;
        VoidSignalCallback voidSignalCallback = this.O0;
        ComputerEditViewModelSWIGJNI.ComputerEditViewModel_RegisterForDelete(j, computerEditViewModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
        EditText editText = this.F0;
        hc0 hc0Var = this.z0;
        if (editText != null) {
            editText.addTextChangedListener(hc0Var);
        }
        EditText editText2 = this.G0;
        if (editText2 != null) {
            editText2.addTextChangedListener(hc0Var);
        }
        EditText editText3 = this.H0;
        if (editText3 != null) {
            editText3.addTextChangedListener(hc0Var);
        }
        EditText editText4 = this.I0;
        if (editText4 != null) {
            editText4.addTextChangedListener(hc0Var);
        }
    }

    @Override // o.ut2
    public final void j0() {
        this.S = true;
        EditText editText = this.F0;
        hc0 hc0Var = this.z0;
        if (editText != null) {
            editText.removeTextChangedListener(hc0Var);
        }
        EditText editText2 = this.G0;
        if (editText2 != null) {
            editText2.removeTextChangedListener(hc0Var);
        }
        EditText editText3 = this.H0;
        if (editText3 != null) {
            editText3.removeTextChangedListener(hc0Var);
        }
        EditText editText4 = this.I0;
        if (editText4 != null) {
            editText4.removeTextChangedListener(hc0Var);
        }
        this.O0.Disconnect();
    }
}
