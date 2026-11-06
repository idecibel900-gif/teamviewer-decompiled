package io.sentry.android.core;

import android.app.ActivityOptions;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.EditText;
import com.teamviewer.chatviewmodel.swig.ChatConversationID;
import com.teamviewer.chatviewmodel.swig.DeleteOptions;
import com.teamviewer.chatviewmodel.swig.IConversationListUIModel;
import com.teamviewer.chatviewmodel.swig.ILocalMessageUIModelBase;
import com.teamviewer.chatviewmodel.swig.IOwnFileMessageUIModel;
import com.teamviewer.chatviewmodel.swig.IOwnTextMessageUIModel;
import com.teamviewer.chatviewmodel.swig.ResendOptions;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ServiceCaseDetailsViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ServiceCaseDetailsViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewlib.activity.M2MClientActivity;
import com.teamviewer.remotecontrolviewlib.activity.QRCodeAssignmentActivity;
import com.teamviewer.remotecontrolviewlib.fragment.session.ExpandableTopTextBox;
import com.teamviewer.remotecontrolviewlib.fragment.session.PilotMarkerTextInputFieldView;
import com.teamviewer.remotecontrolviewlib.inapppurchase.InAppPurchaseActivity;
import com.teamviewer.remotecontrolviewlib.view.session.InstructionsOverlayView;
import com.teamviewer.remotecontrolviewlib.view.session.RcSessionBottomToolbarView;
import com.teamviewer.remotecontrolviewlib.view.session.RcSessionExtraToolbarView;
import com.teamviewer.remotecontrolviewmodellib.swig.ITrustedDeviceRequestViewModelNative;
import com.teamviewer.remotecontrolviewmodellib.swig.ITrustedDeviceRequestViewModelSWIGJNI;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import o.a65;
import o.ao0;
import o.cj3;
import o.cl5;
import o.cm4;
import o.dd0;
import o.df6;
import o.ep1;
import o.fx3;
import o.ga7;
import o.gk7;
import o.ie0;
import o.ik7;
import o.im3;
import o.je0;
import o.ke0;
import o.nt2;
import o.nw4;
import o.o16;
import o.oz7;
import o.p02;
import o.px5;
import o.r02;
import o.r38;
import o.r55;
import o.so0;
import o.t38;
import o.wb0;
import o.x02;
import o.x16;
import o.yb0;
import o.ye4;
import o.yo0;
import o.zu1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p2 implements View.OnClickListener {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    public /* synthetic */ p2(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        ViewPropertyAnimator duration;
        ChatConversationID chatConversationIDRequestNewRoom;
        byte b = this.m;
        ye4 ye4Var = ye4.a;
        final byte b2 = 0;
        final byte b3 = 1;
        Object obj = this.n;
        switch (b) {
            case 0:
                ((r2) obj).cancel();
                return;
            case 1:
                wb0 wb0Var = (wb0) obj;
                int i = wb0.B0;
                x02 x02VarA = ik7.a();
                gk7 gk7Var = new gk7();
                fx3.o(1, "dialogId", x02VarA, gk7Var);
                gk7Var.Z0 = x02VarA;
                gk7Var.H0 = R.string.tv_partner_dialog_deleteBuddyBody_machine;
                gk7Var.F0 = R.string.tv_partner_dialog_deleteBuddyHeader_machine;
                gk7Var.K0 = R.string.tv_yes;
                gk7Var.O0 = R.string.tv_no;
                wb0Var.D0("delete_partner_positive", new r02(gk7Var, p02.Positive));
                wb0Var.D0("delete_partner_negative", new r02(gk7Var, p02.Negative));
                gk7Var.N0();
                return;
            case 2:
                yb0 yb0Var = (yb0) obj;
                int i2 = yb0.z0;
                x02 x02VarA2 = ik7.a();
                gk7 gk7Var2 = new gk7();
                fx3.o(1, "dialogId", x02VarA2, gk7Var2);
                gk7Var2.Z0 = x02VarA2;
                gk7Var2.H0 = R.string.tv_partner_dialog_deleteBuddyBody;
                gk7Var2.F0 = R.string.tv_partner_dialog_deleteBuddyHeader;
                gk7Var2.K0 = R.string.tv_yes;
                gk7Var2.O0 = R.string.tv_no;
                yb0Var.D0("delete_partner_positive", new r02(gk7Var2, p02.Positive));
                yb0Var.D0("delete_partner_negative", new r02(gk7Var2, p02.Negative));
                gk7Var2.N0();
                return;
            case 3:
                dd0 dd0Var = (dd0) obj;
                ServiceCaseDetailsViewModel serviceCaseDetailsViewModel = dd0Var.s0;
                if (serviceCaseDetailsViewModel == null) {
                    ye4Var.g("BuddyISDetailsFragment", "OnConnectAction: No VM!");
                    return;
                }
                StringBuilder sb = new StringBuilder(String.format(Locale.US, "%08d", Arrays.copyOf(new Object[]{Integer.valueOf(ServiceCaseDetailsViewModelSWIGJNI.ServiceCaseDetailsViewModel_GetID(serviceCaseDetailsViewModel.a, serviceCaseDetailsViewModel))}, 1)));
                int length = sb.length();
                sb.insert(length - 3, '-').insert(length - 6, '-').insert(0, 's');
                String string = sb.toString();
                ServiceCaseDetailsViewModel serviceCaseDetailsViewModel2 = dd0Var.s0;
                String strServiceCaseDetailsViewModel_GetPassword = serviceCaseDetailsViewModel2 != null ? ServiceCaseDetailsViewModelSWIGJNI.ServiceCaseDetailsViewModel_GetPassword(serviceCaseDetailsViewModel2.a, serviceCaseDetailsViewModel2) : null;
                if (strServiceCaseDetailsViewModel_GetPassword == null) {
                    strServiceCaseDetailsViewModel_GetPassword = "";
                }
                ServiceCaseDetailsViewModel serviceCaseDetailsViewModel3 = dd0Var.s0;
                String strServiceCaseDetailsViewModel_GetName = serviceCaseDetailsViewModel3 != null ? ServiceCaseDetailsViewModelSWIGJNI.ServiceCaseDetailsViewModel_GetName(serviceCaseDetailsViewModel3.a, serviceCaseDetailsViewModel3) : null;
                ServiceCaseDetailsViewModel serviceCaseDetailsViewModel4 = dd0Var.s0;
                zu1.Q(string, strServiceCaseDetailsViewModel_GetPassword, strServiceCaseDetailsViewModel_GetName, serviceCaseDetailsViewModel4 != null ? new DyngateID(ServiceCaseDetailsViewModelSWIGJNI.ServiceCaseDetailsViewModel_GetCustomerDyngateID(serviceCaseDetailsViewModel4.a, serviceCaseDetailsViewModel4), true) : null);
                return;
            case 4:
                ie0 ie0Var = (ie0) obj;
                ke0 ke0Var = ie0Var.s0;
                if (ke0Var != null) {
                    long j = ie0Var.w0;
                    cj3 cj3Var = ie0Var.G0;
                    cj3Var.getClass();
                    ke0Var.f1252o.e(j, false, new je0(b2, j, cj3Var));
                    return;
                }
                return;
            case 5:
                final ViewGroup viewGroup = ((ao0) obj).u0;
                if (viewGroup == null) {
                    return;
                }
                if (viewGroup.getVisibility() == 0) {
                    viewGroup.animate().alpha(0.0f).setDuration(300L).withEndAction(new Runnable() { // from class: o.xn0
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b4 = b2;
                            ViewGroup viewGroup2 = viewGroup;
                            switch (b4) {
                                case 0:
                                    viewGroup2.setVisibility(8);
                                    break;
                                case 1:
                                    viewGroup2.setVisibility(0);
                                    break;
                                case 2:
                                    viewGroup2.setVisibility(8);
                                    break;
                                default:
                                    viewGroup2.setVisibility(0);
                                    break;
                            }
                        }
                    }).start();
                    return;
                } else {
                    viewGroup.animate().alpha(1.0f).setDuration(300L).withStartAction(new Runnable() { // from class: o.xn0
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b4 = b3;
                            ViewGroup viewGroup2 = viewGroup;
                            switch (b4) {
                                case 0:
                                    viewGroup2.setVisibility(8);
                                    break;
                                case 1:
                                    viewGroup2.setVisibility(0);
                                    break;
                                case 2:
                                    viewGroup2.setVisibility(8);
                                    break;
                                default:
                                    viewGroup2.setVisibility(0);
                                    break;
                            }
                        }
                    }).start();
                    return;
                }
            case 6:
                final ViewGroup viewGroup2 = ((so0) obj).s;
                if (viewGroup2 != null && viewGroup2.getVisibility() == 0) {
                    final byte b4 = 2;
                    viewGroup2.animate().alpha(0.0f).setDuration(300L).withEndAction(new Runnable() { // from class: o.xn0
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b5 = b4;
                            ViewGroup viewGroup3 = viewGroup2;
                            switch (b5) {
                                case 0:
                                    viewGroup3.setVisibility(8);
                                    break;
                                case 1:
                                    viewGroup3.setVisibility(0);
                                    break;
                                case 2:
                                    viewGroup3.setVisibility(8);
                                    break;
                                default:
                                    viewGroup3.setVisibility(0);
                                    break;
                            }
                        }
                    }).start();
                    return;
                } else {
                    if (viewGroup2 == null || (viewPropertyAnimatorAnimate = viewGroup2.animate()) == null || (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(1.0f)) == null || (duration = viewPropertyAnimatorAlpha.setDuration(300L)) == null) {
                        return;
                    }
                    final byte b5 = 3;
                    ViewPropertyAnimator viewPropertyAnimatorWithStartAction = duration.withStartAction(new Runnable() { // from class: o.xn0
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b6 = b5;
                            ViewGroup viewGroup3 = viewGroup2;
                            switch (b6) {
                                case 0:
                                    viewGroup3.setVisibility(8);
                                    break;
                                case 1:
                                    viewGroup3.setVisibility(0);
                                    break;
                                case 2:
                                    viewGroup3.setVisibility(8);
                                    break;
                                default:
                                    viewGroup3.setVisibility(0);
                                    break;
                            }
                        }
                    });
                    if (viewPropertyAnimatorWithStartAction != null) {
                        viewPropertyAnimatorWithStartAction.start();
                        return;
                    }
                    return;
                }
            case 7:
                yo0 yo0Var = (yo0) obj;
                IConversationListUIModel iConversationListUIModel = yo0Var.r0;
                if (iConversationListUIModel == null || (chatConversationIDRequestNewRoom = iConversationListUIModel.RequestNewRoom()) == null) {
                    return;
                }
                yo0Var.B0(chatConversationIDRequestNewRoom);
                return;
            case 8:
                final IOwnTextMessageUIModel iOwnTextMessageUIModel = (IOwnTextMessageUIModel) obj;
                Context context = view.getContext();
                context.getClass();
                boolean z = iOwnTextMessageUIModel.GetResendOptions() == ResendOptions.ResendPossible;
                boolean z2 = iOwnTextMessageUIModel.GetDeleteOptions() == DeleteOptions.DeletePossible;
                if (!z && !z2) {
                    ye4Var.g("ChatConversationMessageOutgoingViewHolder", "No options...");
                    return;
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setCancelable(true);
                builder.setMessage(R.string.tv_chat_message_error_indicator_title);
                if (z) {
                    builder.setPositiveButton(R.string.tv_chat_message_error_indicator_resend, new DialogInterface.OnClickListener() { // from class: o.fp0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i3) {
                            byte b6 = b2;
                            IOwnTextMessageUIModel iOwnTextMessageUIModel2 = iOwnTextMessageUIModel;
                            switch (b6) {
                                case 0:
                                    ye4.a("ChatConversationMessageOutgoingViewHolder", "Resend message");
                                    iOwnTextMessageUIModel2.SendMessageAgain();
                                    dialogInterface.dismiss();
                                    break;
                                default:
                                    ye4.a("ChatConversationMessageOutgoingViewHolder", "Delete message");
                                    iOwnTextMessageUIModel2.DeleteMessage();
                                    dialogInterface.dismiss();
                                    break;
                            }
                        }
                    });
                }
                if (z2) {
                    builder.setNegativeButton(R.string.tv_chat_message_error_indicator_delete, new DialogInterface.OnClickListener() { // from class: o.fp0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i3) {
                            byte b6 = b3;
                            IOwnTextMessageUIModel iOwnTextMessageUIModel2 = iOwnTextMessageUIModel;
                            switch (b6) {
                                case 0:
                                    ye4.a("ChatConversationMessageOutgoingViewHolder", "Resend message");
                                    iOwnTextMessageUIModel2.SendMessageAgain();
                                    dialogInterface.dismiss();
                                    break;
                                default:
                                    ye4.a("ChatConversationMessageOutgoingViewHolder", "Delete message");
                                    iOwnTextMessageUIModel2.DeleteMessage();
                                    dialogInterface.dismiss();
                                    break;
                            }
                        }
                    });
                }
                AlertDialog alertDialogCreate = builder.create();
                alertDialogCreate.setCanceledOnTouchOutside(true);
                alertDialogCreate.show();
                return;
            case ep1.b /* 9 */:
                final IOwnFileMessageUIModel iOwnFileMessageUIModel = (IOwnFileMessageUIModel) obj;
                view.getClass();
                Context context2 = view.getContext();
                context2.getClass();
                boolean z3 = iOwnFileMessageUIModel.GetResendOptions() == ResendOptions.ResendPossible;
                boolean z4 = iOwnFileMessageUIModel.GetDeleteOptions() == DeleteOptions.DeletePossible;
                if (!z3 && !z4) {
                    ye4Var.g("ChatOutgoingFileEntryHolder", "No options...");
                    return;
                }
                AlertDialog.Builder builder2 = new AlertDialog.Builder(context2);
                builder2.setCancelable(true);
                builder2.setMessage(R.string.tv_chat_message_error_indicator_title);
                if (z3) {
                    builder2.setPositiveButton(R.string.tv_chat_message_error_indicator_resend, new DialogInterface.OnClickListener() { // from class: o.wp0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i3) {
                            byte b6 = b2;
                            IOwnFileMessageUIModel iOwnFileMessageUIModel2 = iOwnFileMessageUIModel;
                            switch (b6) {
                                case 0:
                                    dialogInterface.getClass();
                                    ye4.a("ChatOutgoingFileEntryHolder", "Resend message");
                                    iOwnFileMessageUIModel2.SendMessageAgain();
                                    dialogInterface.dismiss();
                                    break;
                                default:
                                    dialogInterface.getClass();
                                    ye4.a("ChatOutgoingFileEntryHolder", "Delete message");
                                    iOwnFileMessageUIModel2.DeleteMessage();
                                    dialogInterface.dismiss();
                                    break;
                            }
                        }
                    });
                }
                if (z4) {
                    builder2.setNegativeButton(R.string.tv_chat_message_error_indicator_delete, new DialogInterface.OnClickListener() { // from class: o.wp0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i3) {
                            byte b6 = b3;
                            IOwnFileMessageUIModel iOwnFileMessageUIModel2 = iOwnFileMessageUIModel;
                            switch (b6) {
                                case 0:
                                    dialogInterface.getClass();
                                    ye4.a("ChatOutgoingFileEntryHolder", "Resend message");
                                    iOwnFileMessageUIModel2.SendMessageAgain();
                                    dialogInterface.dismiss();
                                    break;
                                default:
                                    dialogInterface.getClass();
                                    ye4.a("ChatOutgoingFileEntryHolder", "Delete message");
                                    iOwnFileMessageUIModel2.DeleteMessage();
                                    dialogInterface.dismiss();
                                    break;
                            }
                        }
                    });
                }
                AlertDialog alertDialogCreate2 = builder2.create();
                alertDialogCreate2.setCanceledOnTouchOutside(true);
                alertDialogCreate2.show();
                return;
            case ep1.c /* 10 */:
                ExpandableTopTextBox.a((ExpandableTopTextBox) obj);
                return;
            case 11:
                int i3 = InAppPurchaseActivity.S;
                ((InAppPurchaseActivity) obj).c().d();
                return;
            case ep1.d /* 12 */:
                int i4 = InstructionsOverlayView.v;
                Context context3 = ((InstructionsOverlayView) obj).getContext();
                context3.getClass();
                ((M2MClientActivity) context3).I(true);
                return;
            case 13:
                cm4 cm4Var = (cm4) obj;
                int i5 = cm4.D0;
                IStatisticsHandler iStatisticsHandler = ga7.a;
                ga7.a(px5.p);
                Intent intent = new Intent(cm4Var.r0(), (Class<?>) QRCodeAssignmentActivity.class);
                df6 df6Var = new df6((Object) ActivityOptions.makeCustomAnimation(cm4Var.r0(), 0, 0), (byte) 9);
                nt2 nt2Var = cm4Var.y0;
                if (nt2Var != null) {
                    nt2Var.a(intent, df6Var);
                    return;
                } else {
                    im3.e0("qrCodeAssignmentActivityLauncher");
                    throw null;
                }
            case 14:
                PilotMarkerTextInputFieldView pilotMarkerTextInputFieldView = (PilotMarkerTextInputFieldView) obj;
                Function1 function1 = pilotMarkerTextInputFieldView.D;
                a65 a65Var = pilotMarkerTextInputFieldView.G;
                if (function1 != null) {
                    function1.invoke(String.valueOf(a65Var != null ? ((EditText) a65Var.n).getText() : null));
                }
                if (a65Var != null) {
                    ((EditText) a65Var.n).clearFocus();
                    return;
                }
                return;
            case 15:
                int i6 = RcSessionBottomToolbarView.s;
                ((RcSessionBottomToolbarView) obj).b();
                return;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                int i7 = RcSessionBottomToolbarView.s;
                ((o16) obj).h.a();
                return;
            case 17:
                int i8 = RcSessionExtraToolbarView.n;
                ((x16) obj).j.a();
                return;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                nw4 nw4Var = ((cl5) obj).f2259o;
                Object value = nw4Var.getValue();
                value.getClass();
                nw4Var.setValue(Boolean.valueOf(!((Boolean) value).booleanValue()));
                return;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                ((oz7) obj).b.a();
                return;
            default:
                r38 r38Var = (r38) obj;
                new r55(r38Var.r0()).a(r38Var.t0, "TeamViewerRcTrustedDeviceNotification");
                t38 t38Var = r38Var.q0;
                if (t38Var == null) {
                    im3.e0("viewModel");
                    throw null;
                }
                ITrustedDeviceRequestViewModelNative iTrustedDeviceRequestViewModelNative = t38Var.n;
                ITrustedDeviceRequestViewModelSWIGJNI.ITrustedDeviceRequestViewModelNative_OnSignInDeclined(iTrustedDeviceRequestViewModelNative.a, iTrustedDeviceRequestViewModelNative);
                r38Var.B0();
                return;
        }
    }

    public /* synthetic */ p2(o.b0 b0Var, ILocalMessageUIModelBase iLocalMessageUIModelBase, byte b) {
        this.m = b;
        this.n = iLocalMessageUIModelBase;
    }
}
