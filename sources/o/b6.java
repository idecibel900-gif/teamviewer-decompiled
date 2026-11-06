package o;

import android.app.Dialog;
import android.content.Context;
import android.widget.EditText;
import com.teamviewer.commonviewmodel.swig.ErrorCodeResultCallback;
import com.teamviewer.remotecontrollib.swig.AccountTrialViewModel;
import com.teamviewer.remotecontrollib.swig.AccountTrialViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListComputerID;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListContactID;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ComputerDetailsViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ComputerDetailsViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ContactDetailsViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ContactDetailsViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupListViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupListViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IManagedDeviceV2ViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IManagedDeviceV2ViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.RemoteAccessEndpointActivationSignalCallback;
import com.teamviewer.remotecontrolviewlib.preferences.TVChangeResolutionPreference;
import com.teamviewer.remotecontrolviewlib.preferences.TVSessionQualityPreference;
import com.teamviewer.swigcallbacklib.VoidResultCallback;
import com.teamviewer.teamviewer.market.mobile.R;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b6 implements hk7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ca  */
    @Override // o.hk7
    public final void a(gk7 gk7Var) {
        Context context;
        byte b = this.a;
        byte b2 = 2;
        Object obj = this.b;
        switch (b) {
            case 0:
                gk7Var.A0();
                long jNew_AccountTrialViewModel = AccountTrialViewModelSWIGJNI.new_AccountTrialViewModel();
                AccountTrialViewModel accountTrialViewModel = new AccountTrialViewModel();
                accountTrialViewModel.b = true;
                accountTrialViewModel.a = jNew_AccountTrialViewModel;
                e6 e6Var = (e6) ((j93) obj).f1141o;
                AccountTrialViewModelSWIGJNI.AccountTrialViewModel_AccountTrialRequest(jNew_AccountTrialViewModel, accountTrialViewModel, VoidResultCallback.getCPtr((VoidResultCallback) e6Var), e6Var);
                return;
            case 1:
                wb0 wb0Var = (wb0) obj;
                int i = wb0.B0;
                gk7Var.A0();
                ga3 ga3Var = wb0Var.x0;
                if (ga3Var != null) {
                    Context contextR0 = wb0Var.r0();
                    long j = wb0Var.y0;
                    vb0 vb0Var = new vb0(wb0Var, b2);
                    ComputerDetailsViewModel computerDetailsViewModel = ((h11) ga3Var).f940o;
                    if (ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_IsEditableByMe(computerDetailsViewModel.a, computerDetailsViewModel)) {
                        PListComputerID pListComputerID = new PListComputerID(j);
                        vy2 vy2Var = new vy2(contextR0, "BuddyComputerEditDetailsViewModelWrapper", "remove computer failed");
                        ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_RemoveComputer(computerDetailsViewModel.a, computerDetailsViewModel, pListComputerID.a, pListComputerID, ErrorCodeResultCallback.getCPtr((ErrorCodeResultCallback) vy2Var), vy2Var);
                        return;
                    } else {
                        Function0 function0 = (Function0) new WeakReference(vb0Var).get();
                        if (function0 != null) {
                            function0.a();
                            return;
                        }
                        return;
                    }
                }
                return;
            case 2:
                yb0 yb0Var = (yb0) obj;
                int i2 = yb0.z0;
                gk7Var.A0();
                la3 la3Var = yb0Var.s0;
                if (la3Var != null) {
                    Context contextR1 = yb0Var.r0();
                    long j2 = yb0Var.t0;
                    xb0 xb0Var = new xb0(yb0Var, b2);
                    ContactDetailsViewModel contactDetailsViewModel = ((j71) la3Var).f1136o;
                    if (ContactDetailsViewModelSWIGJNI.ContactDetailsViewModel_IsEditableByMe(contactDetailsViewModel.a, contactDetailsViewModel)) {
                        PListContactID pListContactID = new PListContactID(j2);
                        vy2 vy2Var2 = new vy2(contextR1, "BuddyContactEditDetailsViewModelWrapper", "remove contact failed");
                        ContactDetailsViewModelSWIGJNI.ContactDetailsViewModel_RemoveContact(contactDetailsViewModel.a, contactDetailsViewModel, pListContactID.a, pListContactID, ErrorCodeResultCallback.getCPtr((ErrorCodeResultCallback) vy2Var2), vy2Var2);
                        return;
                    } else {
                        Function0 function1 = (Function0) new WeakReference(xb0Var).get();
                        if (function1 != null) {
                            function1.a();
                            return;
                        }
                        return;
                    }
                }
                return;
            case 3:
                yc0 yc0Var = (yc0) obj;
                int i3 = yc0.G0;
                Dialog dialog = gk7Var.A0;
                EditText editText = dialog != null ? (EditText) dialog.findViewById(R.id.tv_new_group_name) : null;
                u93 u93Var = yc0Var.z0;
                if (u93Var != null) {
                    Context contextR2 = yc0Var.r0();
                    String strValueOf = String.valueOf(editText != null ? editText.getText() : null);
                    GroupListViewModel groupListViewModel = ((bd0) u93Var).f415o;
                    if (groupListViewModel != null) {
                        vy2 vy2Var3 = new vy2(contextR2, "BuddyListGroupViewModel", "create group failed");
                        GroupListViewModelSWIGJNI.GroupListViewModel_CreateGroup(groupListViewModel.a, groupListViewModel, strValueOf, ErrorCodeResultCallback.getCPtr((ErrorCodeResultCallback) vy2Var3), vy2Var3);
                    }
                }
                gk7Var.A0();
                yc0Var.N0();
                return;
            case 4:
                ie0 ie0Var = (ie0) obj;
                int i4 = ie0.H0;
                gk7Var.A0();
                ke0 ke0Var = ie0Var.s0;
                if (ke0Var == null) {
                    ye4.a.g("BuddyPDetailsFragment", "OnDeletePartner: No VM!");
                    return;
                }
                ContactDetailsViewModel contactDetailsViewModel2 = ke0Var.n;
                if (!ContactDetailsViewModelSWIGJNI.ContactDetailsViewModel_IsEditableByMe(contactDetailsViewModel2.a, contactDetailsViewModel2)) {
                    d82.t(ie0Var.E(), R.string.tv_toastDeletingFailedItemNotEditable);
                    return;
                }
                ke0 ke0Var2 = ie0Var.s0;
                if (ke0Var2 != null) {
                    PListContactID pListContactID2 = new PListContactID(ie0Var.w0);
                    vy2 vy2Var4 = new vy2(ie0Var.r0(), "BuddyPDetailsFragment", "remove contact failed");
                    ContactDetailsViewModel contactDetailsViewModel3 = ke0Var2.n;
                    ContactDetailsViewModelSWIGJNI.ContactDetailsViewModel_RemoveContact(contactDetailsViewModel3.a, contactDetailsViewModel3, pListContactID2.a, pListContactID2, ErrorCodeResultCallback.getCPtr((ErrorCodeResultCallback) vy2Var4), vy2Var4);
                }
                bb5 bb5Var = ie0Var.r0;
                if (bb5Var != null) {
                    bb5Var.G0();
                    return;
                }
                return;
            case 5:
                fv1 fv1Var = (fv1) obj;
                int i5 = fv1.O0;
                gk7Var.A0();
                va3 va3Var = fv1Var.s0;
                if (va3Var != null) {
                    pe0 pe0Var = fv1Var.M0;
                    pe0Var.getClass();
                    g1 g1Var = ((iv1) va3Var).f1105o;
                    g1Var.c1(pe0Var);
                    g1Var.V0();
                    return;
                }
                return;
            case 6:
                nk2 nk2Var = (nk2) obj;
                int i6 = nk2.b1;
                if (gk7Var instanceof fs7) {
                    String strP0 = ((fs7) gk7Var).P0();
                    if (strP0.length() > 0) {
                        nk7 nk7Var = nk2Var.G0;
                        wk2 wk2Var = nk2Var.F0;
                        if (wk2Var == null || nk7Var == null) {
                            context = d82.M;
                            if (context != null) {
                                String string = context.getString(R.string.tv_filetransfer_rename_cant);
                                string.getClass();
                                fx3.r(string, 1, context, bu7.MAIN);
                            } else {
                                ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                            }
                        } else {
                            String str = nk7Var.f1575o;
                            str.getClass();
                            if (!wk2Var.f2421o.n(str, strP0)) {
                                context = d82.M;
                                if (context != null) {
                                    String string2 = context.getString(R.string.tv_filetransfer_rename_cant);
                                    string2.getClass();
                                    fx3.r(string2, 1, context, bu7.MAIN);
                                } else {
                                    ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                                }
                            }
                        }
                        wk2 wk2Var2 = nk2Var.F0;
                        if (wk2Var2 != null) {
                            wk2Var2.m1();
                        }
                        nk2Var.L0();
                    }
                } else {
                    ye4.c("FileTransferLocalFragment", "dialog is not a text input dialog!");
                }
                gk7Var.A0();
                return;
            case 7:
                dl4 dl4Var = (dl4) obj;
                int i7 = dl4.K0;
                gk7Var.A0();
                rb3 rb3Var = dl4Var.s0;
                if (rb3Var != null) {
                    pe0 pe0Var2 = dl4Var.J0;
                    pe0Var2.getClass();
                    qb3 qb3Var = ((rk4) rb3Var).n;
                    if (qb3Var != null) {
                        IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel = ((xd0) qb3Var).C;
                        IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_registerForEndpointActivationChanges(iManagedDeviceV2ViewModel.a, iManagedDeviceV2ViewModel, RemoteAccessEndpointActivationSignalCallback.getCPtr((RemoteAccessEndpointActivationSignalCallback) pe0Var2), pe0Var2);
                    }
                    if (qb3Var != null) {
                        IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel2 = ((xd0) qb3Var).C;
                        IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_ActivateRemoteAccessEndpoint(iManagedDeviceV2ViewModel2.a, iManagedDeviceV2ViewModel2);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                nd3 nd3Var = ((yk5) obj).s0;
                if (nd3Var != null) {
                    ((zf8) nd3Var).A0();
                    return;
                }
                return;
            case ep1.b /* 9 */:
                pn5 pn5Var = (pn5) obj;
                ReentrantLock reentrantLock = (ReentrantLock) pn5Var.n;
                reentrantLock.lock();
                try {
                    ((Condition) pn5Var.f1752o).signal();
                    reentrantLock.unlock();
                    gk7Var.A0();
                    return;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            case ep1.c /* 10 */:
                TVChangeResolutionPreference tVChangeResolutionPreference = (TVChangeResolutionPreference) obj;
                if (gk7Var instanceof fc4) {
                    tVChangeResolutionPreference.Z.c0(((fc4) gk7Var).f1);
                    return;
                }
                return;
            default:
                TVSessionQualityPreference tVSessionQualityPreference = (TVSessionQualityPreference) obj;
                if (gk7Var instanceof fc4) {
                    tVSessionQualityPreference.Z.b0(String.valueOf(((fc4) gk7Var).f1));
                    return;
                }
                return;
        }
    }
}
