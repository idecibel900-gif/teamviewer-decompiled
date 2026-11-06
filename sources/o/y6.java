package o;

import android.app.ActivityOptions;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.teamviewer.chatviewmodel.swig.ChatConversationID;
import com.teamviewer.chatviewmodel.swig.ChatUIModelLocatorAndroid;
import com.teamviewer.chatviewmodel.swig.IChatEndpointListUIModel;
import com.teamviewer.chatviewmodel.swig.IChatEndpointUIModel;
import com.teamviewer.chatviewmodel.swig.IConversationHistoryListUIModel;
import com.teamviewer.remotecontrollib.swig.IAlarmsSumsViewModel;
import com.teamviewer.remotecontrollib.swig.IAlarmsSumsViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.IBiometricsStatisticsViewModel;
import com.teamviewer.remotecontrollib.swig.IBiometricsStatisticsViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewlib.activity.FileTransferActivity;
import com.teamviewer.remotecontrolviewlib.activity.QRCodeAssignmentActivity;
import com.teamviewer.remotecontrolviewmodellib.swig.ITrustedDeviceRequestViewModelNative;
import com.teamviewer.remotecontrolviewmodellib.swig.ITrustedDeviceRequestViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewmodellib.swig.TrustedDeviceResponseSignalCallback;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y6 implements View.OnClickListener {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2580o;

    public /* synthetic */ y6(Object obj, Object obj2, byte b) {
        this.m = b;
        this.n = obj;
        this.f2580o = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x01cb A[PHI: r15
      0x01cb: PHI (r15v15 java.lang.String) = (r15v9 java.lang.String), (r15v11 java.lang.String), (r15v12 java.lang.String), (r15v16 java.lang.String) binds: [B:126:0x01f0, B:120:0x01e3, B:114:0x01d6, B:107:0x01c8] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        IChatEndpointListUIModel iChatEndpointListUIModel;
        RecyclerView recyclerView;
        d66 adapter;
        int iJ;
        byte b = this.m;
        Object obj = this.f2580o;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                z6 z6Var = (z6) obj;
                if (((Boolean) ((g26) obj2).f.a()).booleanValue()) {
                    return;
                }
                z6Var.c.toggle();
                return;
            case 1:
                x60 x60Var = (x60) obj2;
                String[] strArr = (String[]) obj;
                SwitchCompat switchCompat = x60Var.p0;
                if (switchCompat == null) {
                    im3.e0("switchButton");
                    throw null;
                }
                if (!switchCompat.isChecked()) {
                    y60 y60Var = x60Var.t0;
                    if (y60Var == null) {
                        im3.e0("viewModel");
                        throw null;
                    }
                    SharedPreferences.Editor editorEdit = y60Var.n.edit();
                    editorEdit.getClass();
                    editorEdit.putBoolean("lock_enabled", false);
                    editorEdit.putBoolean("lock_promoted", true);
                    editorEdit.apply();
                    IBiometricsStatisticsViewModel iBiometricsStatisticsViewModel = y60Var.f2581o;
                    IBiometricsStatisticsViewModelSWIGJNI.IBiometricsStatisticsViewModel_ReportSkippedEvent(iBiometricsStatisticsViewModel.a, iBiometricsStatisticsViewModel);
                    x60Var.p0().finish();
                    return;
                }
                RadioGroup radioGroup = x60Var.q0;
                if (radioGroup == null) {
                    im3.e0("radioButtonGroup");
                    throw null;
                }
                int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
                String str2 = "0";
                if (checkedRadioButtonId == R.id.radio_immediately) {
                    if (strArr != null && (str = strArr[0]) != null) {
                        str2 = str;
                    }
                } else if (checkedRadioButtonId == R.id.radio_one_min) {
                    if (strArr != null && (str = strArr[1]) != null) {
                        str2 = str;
                    }
                } else if (checkedRadioButtonId == R.id.radio_five_min) {
                    if (strArr != null && (str = strArr[2]) != null) {
                        str2 = str;
                    }
                } else if (checkedRadioButtonId != R.id.radio_ten_min) {
                    str2 = "600000";
                } else if (strArr != null && (str = strArr[3]) != null) {
                    str2 = str;
                }
                y60 y60Var2 = x60Var.t0;
                if (y60Var2 == null) {
                    im3.e0("viewModel");
                    throw null;
                }
                SwitchCompat switchCompat2 = x60Var.p0;
                if (switchCompat2 == null) {
                    im3.e0("switchButton");
                    throw null;
                }
                if (switchCompat2.isChecked()) {
                    SharedPreferences.Editor editorEdit2 = y60Var2.n.edit();
                    editorEdit2.getClass();
                    editorEdit2.putBoolean("lock_enabled", true);
                    editorEdit2.putBoolean("lock_promoted", true);
                    editorEdit2.putString("lock_timeout_value", str2);
                    editorEdit2.apply();
                    IBiometricsStatisticsViewModel iBiometricsStatisticsViewModel2 = y60Var2.f2581o;
                    IBiometricsStatisticsViewModelSWIGJNI.IBiometricsStatisticsViewModel_ReportEvent(iBiometricsStatisticsViewModel2.a, iBiometricsStatisticsViewModel2, true, Integer.parseInt(str2));
                }
                x60Var.p0().finish();
                return;
            case 2:
                ae0 ae0Var = (ae0) obj2;
                int i = ae0.F0;
                IStatisticsHandler iStatisticsHandler = ga7.a;
                ga7.a(px5.p);
                Intent intent = new Intent(ae0Var.r0(), (Class<?>) QRCodeAssignmentActivity.class);
                intent.putExtra("groupId", (String) obj);
                df6 df6Var = new df6((Object) ActivityOptions.makeCustomAnimation(ae0Var.r0(), 0, 0), (byte) 9);
                nt2 nt2Var = ae0Var.z0;
                if (nt2Var != null) {
                    nt2Var.a(intent, df6Var);
                    return;
                } else {
                    im3.e0("qrCodeAssignmentActivityLauncher");
                    throw null;
                }
            case 3:
                EditText editText = (EditText) obj2;
                so0 so0Var = (so0) obj;
                String string = ub7.x0(editText.getText().toString()).toString();
                if (string.length() <= 0 || (iChatEndpointListUIModel = so0Var.n) == null || !iChatEndpointListUIModel.CanRequestConversation()) {
                    return;
                }
                SwitchCompat switchCompat3 = so0Var.q;
                boolean zIsChecked = switchCompat3 != null ? switchCompat3.isChecked() : false;
                IChatEndpointListUIModel iChatEndpointListUIModel2 = so0Var.n;
                ChatConversationID chatConversationIDRequestConversation = iChatEndpointListUIModel2 != null ? iChatEndpointListUIModel2.RequestConversation(zIsChecked) : null;
                xc0 xc0Var = so0Var.m;
                if (xc0Var != null) {
                    ye4.a.b("ChatConversationFragment", "switch logic to default");
                    if (chatConversationIDRequestConversation != null) {
                        ((uo0) xc0Var.n).B0(chatConversationIDRequestConversation);
                    }
                    IConversationHistoryListUIModel iConversationHistoryListUIModelGetConversationHistoryListUIModelById = ChatUIModelLocatorAndroid.GetChatUIModelLocator().GetConversationHistoryListUIModelById(chatConversationIDRequestConversation);
                    if (iConversationHistoryListUIModelGetConversationHistoryListUIModelById == null || !iConversationHistoryListUIModelGetConversationHistoryListUIModelById.SendMessage(string)) {
                        return;
                    }
                    editText.setText("");
                    return;
                }
                return;
            case 4:
                np0 np0Var = (np0) obj2;
                IChatEndpointUIModel iChatEndpointUIModel = (IChatEndpointUIModel) obj;
                lp0 lp0Var = np0Var.G;
                int i2 = -1;
                if (np0Var.E != null && (recyclerView = np0Var.D) != null && (adapter = recyclerView.getAdapter()) != null && (iJ = np0Var.D.J(np0Var)) != -1 && np0Var.E == adapter) {
                    i2 = iJ;
                }
                lp0Var.b(iChatEndpointUIModel, i2);
                return;
            case 5:
                mr1 mr1Var = (mr1) obj2;
                tu1 tu1Var = (tu1) obj;
                sa3 sa3Var = mr1Var.r0;
                if (sa3Var == null) {
                    im3.e0("viewModel");
                    throw null;
                }
                IAlarmsSumsViewModel iAlarmsSumsViewModel = ((or1) sa3Var).n;
                IAlarmsSumsViewModelSWIGJNI.IAlarmsSumsViewModel_ReportEvent(iAlarmsSumsViewModel.a, iAlarmsSumsViewModel, 0);
                bb5 bb5Var = mr1Var.p0;
                if (bb5Var != null) {
                    bb5Var.I0(tu1Var, true);
                    return;
                }
                return;
            case 6:
                ik2 ik2Var = (ik2) obj2;
                FileTransferActivity fileTransferActivity = (FileTransferActivity) obj;
                pk2 pk2Var = ik2Var.z0;
                if (pk2Var != null) {
                    pk2Var.a();
                }
                if (fileTransferActivity != null) {
                    fileTransferActivity.runOnUiThread(new dk2(fileTransferActivity, ik2Var));
                    return;
                }
                return;
            default:
                r38 r38Var = (r38) obj2;
                String str3 = (String) obj;
                View viewS0 = r38Var.s0();
                if (r38Var.q0 == null) {
                    im3.e0("viewModel");
                    throw null;
                }
                if (!l25.b()) {
                    int[] iArr = f37.s;
                    f37.g(viewS0, viewS0.getResources().getText(R.string.tv_trusted_device_internet_not_available_text), 0).i();
                    return;
                }
                t38 t38Var = r38Var.q0;
                if (t38Var == null) {
                    im3.e0("viewModel");
                    throw null;
                }
                j38 j38Var = r38Var.r0;
                boolean z = r38Var.s0;
                q38 q38Var = r38Var.v0;
                j38Var.getClass();
                q38Var.getClass();
                ITrustedDeviceRequestViewModelNative iTrustedDeviceRequestViewModelNative = t38Var.n;
                ITrustedDeviceRequestViewModelSWIGJNI.ITrustedDeviceRequestViewModelNative_SendResponse(iTrustedDeviceRequestViewModelNative.a, iTrustedDeviceRequestViewModelNative, j38Var.m ? 1 : 0, z, str3, TrustedDeviceResponseSignalCallback.getCPtr((TrustedDeviceResponseSignalCallback) q38Var), q38Var);
                new r55(r38Var.r0()).a(r38Var.t0, "TeamViewerRcTrustedDeviceNotification");
                if (r38Var.s0) {
                    t38 t38Var2 = r38Var.q0;
                    if (t38Var2 == null) {
                        im3.e0("viewModel");
                        throw null;
                    }
                    ITrustedDeviceRequestViewModelNative iTrustedDeviceRequestViewModelNative2 = t38Var2.n;
                    ITrustedDeviceRequestViewModelSWIGJNI.ITrustedDeviceRequestViewModelNative_OnSignInConfirmedOnce(iTrustedDeviceRequestViewModelNative2.a, iTrustedDeviceRequestViewModelNative2);
                    return;
                }
                int iOrdinal = r38Var.r0.ordinal();
                if (iOrdinal == 0) {
                    t38 t38Var3 = r38Var.q0;
                    if (t38Var3 == null) {
                        im3.e0("viewModel");
                        throw null;
                    }
                    ITrustedDeviceRequestViewModelNative iTrustedDeviceRequestViewModelNative3 = t38Var3.n;
                    ITrustedDeviceRequestViewModelSWIGJNI.ITrustedDeviceRequestViewModelNative_OnSignInConfirmedDevice(iTrustedDeviceRequestViewModelNative3.a, iTrustedDeviceRequestViewModelNative3);
                    return;
                }
                if (iOrdinal != 1) {
                    return;
                }
                t38 t38Var4 = r38Var.q0;
                if (t38Var4 == null) {
                    im3.e0("viewModel");
                    throw null;
                }
                ITrustedDeviceRequestViewModelNative iTrustedDeviceRequestViewModelNative4 = t38Var4.n;
                ITrustedDeviceRequestViewModelSWIGJNI.ITrustedDeviceRequestViewModelNative_OnSignInConfirmedIpAddress(iTrustedDeviceRequestViewModelNative4.a, iTrustedDeviceRequestViewModelNative4);
                return;
        }
    }
}
