package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.format.DateFormat;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.swig.tvbackendcontainer.BackendContainerAndroid;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class j41 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j41(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(i41 i41Var, eb7 eb7Var) {
        String str;
        byte b = this.a;
        i41 i41Var2 = i41.w;
        final byte b2 = 1;
        Object obj = this.b;
        Object[] objArr = 0;
        switch (b) {
            case 0:
                final pn5 pn5Var = (pn5) obj;
                int iOrdinal = i41Var.ordinal();
                if (iOrdinal == 1) {
                    Context context = d82.M;
                    if (context != null) {
                        d82.t(context, R.string.tv_errorMessage_connect_ERROR_CONNECT_PENDING);
                        return;
                    } else {
                        ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                        return;
                    }
                }
                final byte b3 = 2;
                if (iOrdinal == 2) {
                    Context context2 = d82.M;
                    if (context2 != null) {
                        d82.t(context2, R.string.tv_IDS_STATUS_MSG_NOROUTE_IdNotFound);
                        return;
                    } else {
                        ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                        return;
                    }
                }
                final byte b4 = 3;
                if (iOrdinal == 3) {
                    Context context3 = d82.M;
                    if (context3 != null) {
                        d82.t(context3, R.string.tv_errorMessage_connect_ACTION_CONNECT_ABORT);
                        return;
                    } else {
                        ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                        return;
                    }
                }
                if (iOrdinal != 5) {
                    if (iOrdinal == 6) {
                        pn5Var.t(i41.r, eb7Var != null ? eb7Var.a : null);
                        return;
                    }
                    if (iOrdinal == 12) {
                        Context context4 = d82.M;
                        if (context4 != null) {
                            d82.t(context4, R.string.tv_errorMessage_connect_ERROR_AUTHENTIFICATION);
                            return;
                        } else {
                            ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                            return;
                        }
                    }
                    if (iOrdinal != 13) {
                        if (iOrdinal != 20) {
                            return;
                        }
                        pn5Var.t(i41.C, eb7Var != null ? eb7Var.a : null);
                        return;
                    }
                    str = eb7Var != null ? eb7Var.a : null;
                    Context context5 = d82.M;
                    if (context5 != null) {
                        String string = context5.getString(R.string.tv_IDS_STATUS_AUTHENTICATIONREJECTED);
                        string.getClass();
                        fx3.r(string, 1, context5, bu7.MAIN);
                    } else {
                        ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                    }
                    pn5Var.t(i41.v, str);
                    return;
                }
                str = eb7Var != null ? eb7Var.a : null;
                RemoteControlApplication remoteControlApplication = (RemoteControlApplication) pn5Var.f1752o;
                if (str != null && str.length() > 11 && str.substring(0, 12).equals("TimeoutBlock")) {
                    String string2 = remoteControlApplication.getString(R.string.tv_IDS_STATUS_MSG_NOROUTE_TimeoutBlock, DateFormat.getTimeFormat(remoteControlApplication).format(new Date(System.currentTimeMillis() + ((long) (((str.length() > 13 ? Integer.parseInt(str.substring(13)) : 0) + 59) * 1000)))));
                    string2.getClass();
                    pn5Var.F(bx0.s, string2);
                    return;
                }
                if (str != null) {
                    switch (str.hashCode()) {
                        case -1592958458:
                            if (str.equals("AccountIdentityNotValidated")) {
                                bu7 bu7Var = bu7.MAIN;
                                final Object[] objArr2 = objArr == true ? 1 : 0;
                                bu7Var.a(new Runnable() { // from class: o.e16
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b5 = objArr2;
                                        pn5 pn5Var2 = pn5Var;
                                        switch (b5) {
                                            case 0:
                                                ((EventHub) pn5Var2.n).d(EventType.EVENT_REQUEST_ROUTE_ERROR_ACCOUNT_IDENTITY_NOT_VALIDATED, new he2());
                                                break;
                                            case 1:
                                                ((EventHub) pn5Var2.n).d(EventType.EVENT_REQUEST_ROUTE_ERROR_BLOCKED_BY_REMOTE_DEVICE, new he2());
                                                break;
                                            case 2:
                                                ((EventHub) pn5Var2.n).d(EventType.EVENT_REQUEST_ROUTE_ERROR_ACCOUNT_EMAIL_NOT_VALIDATED, new he2());
                                                break;
                                            default:
                                                ((EventHub) pn5Var2.n).d(EventType.EVENT_REQUEST_ROUTE_ERROR_ACCOUNT_NOT_LOGGED_IN, new he2());
                                                break;
                                        }
                                    }
                                });
                                return;
                            }
                            break;
                        case -1405197778:
                            if (str.equals("ExpiredMarketingTrialLicenseDetected")) {
                                pn5Var.F(bx0.A, "");
                                return;
                            }
                            break;
                        case -740967900:
                            if (str.equals("Phase1Ended")) {
                                String string3 = remoteControlApplication.getString(R.string.tv_IDS_STATUS_MSG_NOROUTE_CommercialUse);
                                string3.getClass();
                                pn5Var.F(bx0.t, string3);
                                return;
                            }
                            break;
                        case -218690711:
                            if (str.equals("HighCommercialRating")) {
                                String string4 = remoteControlApplication.getString(R.string.tv_IDS_STATUS_MSG_NOROUTE_HighCommercialRating);
                                string4.getClass();
                                pn5Var.F(bx0.r, string4);
                                return;
                            }
                            break;
                        case 696544716:
                            if (str.equals("BLOCKED")) {
                                if (BackendContainerAndroid.GetInstance().GetAccount().IsLoggedIn()) {
                                    bu7.MAIN.a(new Runnable() { // from class: o.e16
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b5 = b2;
                                            pn5 pn5Var2 = pn5Var;
                                            switch (b5) {
                                                case 0:
                                                    ((EventHub) pn5Var2.n).d(EventType.EVENT_REQUEST_ROUTE_ERROR_ACCOUNT_IDENTITY_NOT_VALIDATED, new he2());
                                                    break;
                                                case 1:
                                                    ((EventHub) pn5Var2.n).d(EventType.EVENT_REQUEST_ROUTE_ERROR_BLOCKED_BY_REMOTE_DEVICE, new he2());
                                                    break;
                                                case 2:
                                                    ((EventHub) pn5Var2.n).d(EventType.EVENT_REQUEST_ROUTE_ERROR_ACCOUNT_EMAIL_NOT_VALIDATED, new he2());
                                                    break;
                                                default:
                                                    ((EventHub) pn5Var2.n).d(EventType.EVENT_REQUEST_ROUTE_ERROR_ACCOUNT_NOT_LOGGED_IN, new he2());
                                                    break;
                                            }
                                        }
                                    });
                                    return;
                                } else {
                                    bu7.MAIN.a(new Runnable() { // from class: o.e16
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b5 = b4;
                                            pn5 pn5Var2 = pn5Var;
                                            switch (b5) {
                                                case 0:
                                                    ((EventHub) pn5Var2.n).d(EventType.EVENT_REQUEST_ROUTE_ERROR_ACCOUNT_IDENTITY_NOT_VALIDATED, new he2());
                                                    break;
                                                case 1:
                                                    ((EventHub) pn5Var2.n).d(EventType.EVENT_REQUEST_ROUTE_ERROR_BLOCKED_BY_REMOTE_DEVICE, new he2());
                                                    break;
                                                case 2:
                                                    ((EventHub) pn5Var2.n).d(EventType.EVENT_REQUEST_ROUTE_ERROR_ACCOUNT_EMAIL_NOT_VALIDATED, new he2());
                                                    break;
                                                default:
                                                    ((EventHub) pn5Var2.n).d(EventType.EVENT_REQUEST_ROUTE_ERROR_ACCOUNT_NOT_LOGGED_IN, new he2());
                                                    break;
                                            }
                                        }
                                    });
                                    return;
                                }
                            }
                            break;
                        case 878296433:
                            if (str.equals("LicenseBlockedActive")) {
                                pn5Var.F(bx0.u, "");
                                return;
                            }
                            break;
                        case 1008181985:
                            if (str.equals("LicenseBlockedMarketingTrialActive")) {
                                pn5Var.F(bx0.y, "");
                                return;
                            }
                            break;
                        case 1071654263:
                            if (str.equals("PassiveUnpaidLicenseDetected")) {
                                pn5Var.F(bx0.x, "");
                                return;
                            }
                            break;
                        case 1558628012:
                            if (str.equals("LicenseBlockedMarketingTrialPassive")) {
                                pn5Var.F(bx0.z, "");
                                return;
                            }
                            break;
                        case 1577577386:
                            if (str.equals("AccountEmailNotValidated")) {
                                bu7.MAIN.a(new Runnable() { // from class: o.e16
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b5 = b3;
                                        pn5 pn5Var2 = pn5Var;
                                        switch (b5) {
                                            case 0:
                                                ((EventHub) pn5Var2.n).d(EventType.EVENT_REQUEST_ROUTE_ERROR_ACCOUNT_IDENTITY_NOT_VALIDATED, new he2());
                                                break;
                                            case 1:
                                                ((EventHub) pn5Var2.n).d(EventType.EVENT_REQUEST_ROUTE_ERROR_BLOCKED_BY_REMOTE_DEVICE, new he2());
                                                break;
                                            case 2:
                                                ((EventHub) pn5Var2.n).d(EventType.EVENT_REQUEST_ROUTE_ERROR_ACCOUNT_EMAIL_NOT_VALIDATED, new he2());
                                                break;
                                            default:
                                                ((EventHub) pn5Var2.n).d(EventType.EVENT_REQUEST_ROUTE_ERROR_ACCOUNT_NOT_LOGGED_IN, new he2());
                                                break;
                                        }
                                    }
                                });
                                return;
                            }
                            break;
                        case 1827143196:
                            if (str.equals("LicenseBlockedPassive")) {
                                pn5Var.F(bx0.v, "");
                                return;
                            }
                            break;
                        case 1849733662:
                            if (str.equals("UnpaidLicenseDetected")) {
                                pn5Var.F(bx0.w, "");
                                return;
                            }
                            break;
                        case 1950604781:
                            if (str.equals("AccountNotLoggedIn")) {
                                bu7.MAIN.a(new Runnable() { // from class: o.e16
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b5 = b4;
                                        pn5 pn5Var2 = pn5Var;
                                        switch (b5) {
                                            case 0:
                                                ((EventHub) pn5Var2.n).d(EventType.EVENT_REQUEST_ROUTE_ERROR_ACCOUNT_IDENTITY_NOT_VALIDATED, new he2());
                                                break;
                                            case 1:
                                                ((EventHub) pn5Var2.n).d(EventType.EVENT_REQUEST_ROUTE_ERROR_BLOCKED_BY_REMOTE_DEVICE, new he2());
                                                break;
                                            case 2:
                                                ((EventHub) pn5Var2.n).d(EventType.EVENT_REQUEST_ROUTE_ERROR_ACCOUNT_EMAIL_NOT_VALIDATED, new he2());
                                                break;
                                            default:
                                                ((EventHub) pn5Var2.n).d(EventType.EVENT_REQUEST_ROUTE_ERROR_ACCOUNT_NOT_LOGGED_IN, new he2());
                                                break;
                                        }
                                    }
                                });
                                return;
                            }
                            break;
                        case 2065740213:
                            if (str.equals("PassiveExpiredMarketingTrialLicenseDetected")) {
                                pn5Var.F(bx0.B, "");
                                return;
                            }
                            break;
                    }
                }
                if (str != null) {
                    switch (str.hashCode()) {
                        case -2137581149:
                            if (str.equals("RemoteAccessConnectionDenied")) {
                                pn5.A(R.string.tv_IDS_STATUS_MSG_NOROUTE_REMOTEACCESS_CONNECTION_DENIED);
                                return;
                            }
                            break;
                        case -2119045268:
                            if (str.equals("KeepAliveLost")) {
                                pn5.A(R.string.tv_IDS_STATUS_MSG_NOROUTE_KeepAliveLost);
                                return;
                            }
                            break;
                        case -1478148185:
                            if (str.equals("ControlIDNotFound")) {
                                pn5.A(R.string.tv_IDS_STATUS_MSG_NOROUTE_ControlIDNotFound);
                                return;
                            }
                            break;
                        case -1153359254:
                            if (str.equals("InvalidLicense")) {
                                pn5.A(R.string.tv_IDS_STATUS_MSG_NOROUTE_InvalidLicense);
                                return;
                            }
                            break;
                        case -1076614292:
                            if (str.equals("UnknownSupportSessionID")) {
                                pn5.A(R.string.tv_IDS_STATUS_MSG_NOROUTE_UnknownSupportSessionID);
                                return;
                            }
                            break;
                        case -954238697:
                            if (str.equals("ConnectAlreadyJoined")) {
                                pn5.A(R.string.tv_IDS_STATUS_MSG_NOROUTE_ConnectAlreadyJoined);
                                return;
                            }
                            break;
                        case -809303936:
                            if (str.equals("InvalidSupporterID")) {
                                pn5.A(R.string.tv_IDS_STATUS_MSG_NOROUTE_InvalidSupporterID);
                                return;
                            }
                            break;
                        case -806636989:
                            if (str.equals("NoMachineAvailable")) {
                                pn5.A(R.string.tv_IDS_STATUS_MSG_NOROUTE_NoMachineAvailable);
                                return;
                            }
                            break;
                        case -729329241:
                            if (str.equals("ConnectFailed")) {
                                pn5Var.B(str);
                                return;
                            }
                            break;
                        case -712338749:
                            if (str.equals("Phase2Ended")) {
                                pn5.A(R.string.tv_IDS_STATUS_MSG_NOROUTE_LicenseExpired);
                                return;
                            }
                            break;
                        case -663693325:
                            if (str.equals("NoControlSupport")) {
                                pn5.A(R.string.tv_IDS_STATUS_MSG_NOROUTE_NoControlSupport);
                                return;
                            }
                            break;
                        case -558636430:
                            if (str.equals("DenyIncoming")) {
                                pn5.A(R.string.tv_IDS_STATUS_MSG_NOROUTE_DenyIncoming);
                                return;
                            }
                            break;
                        case -539796763:
                            if (str.equals("SessionLimit")) {
                                pn5.A(R.string.tv_IDS_STATUS_MSG_NOROUTE_SessionLimit);
                                return;
                            }
                            break;
                        case -538995761:
                            if (str.equals("SessionExpired")) {
                                pn5Var.B(str);
                                return;
                            }
                            break;
                        case -484826957:
                            if (str.equals("KeepAliveInactive")) {
                                pn5.A(R.string.tv_IDS_STATUS_MSG_NOROUTE_KeepAliveInactive);
                                return;
                            }
                            break;
                        case -199439670:
                            if (str.equals("IdNotFound")) {
                                pn5.A(R.string.tv_IDS_STATUS_MSG_NOROUTE_IdNotFound);
                                return;
                            }
                            break;
                        case -162115920:
                            if (str.equals("InvalidCustomerID")) {
                                pn5Var.B(str);
                                return;
                            }
                            break;
                        case -51735708:
                            if (str.equals("ExcessiveUse")) {
                                pn5.A(R.string.tv_IDS_STATUS_MSG_NOROUTE_ExcessiveUse);
                                return;
                            }
                            break;
                        case 191346562:
                            if (str.equals("SessionClosed")) {
                                pn5Var.B(str);
                                return;
                            }
                            break;
                        case 199755557:
                            if (str.equals("MeetingIdNotFound")) {
                                pn5.A(R.string.tv_errorMessage_connect_ERROR_MASTER_UNKNOWN_MEETING_ID);
                                return;
                            }
                            break;
                        case 219568716:
                            if (str.equals("LoggedOut")) {
                                pn5.A(R.string.tv_IDS_STATUS_MSG_NOROUTE_LoggedOut);
                                return;
                            }
                            break;
                        case 356514468:
                            if (str.equals("FreeRoutersInUse")) {
                                pn5.A(R.string.tv_IDS_STATUS_MSG_NOROUTE_FreeRoutersInUse);
                                return;
                            }
                            break;
                        case 701921412:
                            if (str.equals("NoServer")) {
                                pn5.A(R.string.tv_IDS_STATUS_MSG_NOROUTE_NoServer);
                                return;
                            }
                            break;
                        case 735004356:
                            if (str.equals("MeetingIncompatibleVersion")) {
                                pn5.A(R.string.tv_IDS_STATUS_MSG_NOROUTE_MeetingIncompatibleVersion);
                                return;
                            }
                            break;
                        case 750433189:
                            if (str.equals("ConditionalAccessDenied")) {
                                pn5Var.B(str);
                                return;
                            }
                            break;
                        case 784338319:
                            if (str.equals("MeetingOver")) {
                                pn5.A(R.string.tv_errorMessage_connect_MEETING_OVER);
                                return;
                            }
                            break;
                        case 1304905320:
                            if (str.equals("SmartAccessDenied")) {
                                pn5.A(R.string.tv_IDS_STATUS_MSG_NOROUTE_SmartAccessDenied);
                                return;
                            }
                            break;
                        case 1579147289:
                            if (str.equals("KeepAliveTimeout")) {
                                pn5.A(R.string.tv_IDS_STATUS_MSG_NOROUTE_KeepAliveTimeout);
                                return;
                            }
                            break;
                    }
                }
                Context context6 = d82.M;
                if (context6 != null) {
                    String string5 = context6.getString(R.string.tv_IDS_STATUS_ConnectNoRoute);
                    string5.getClass();
                    fx3.r(string5, 1, context6, bu7.MAIN);
                } else {
                    ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                }
                ye4.c("ConnectionEventManager", "connection event: noRoute");
                return;
            case 1:
                pn5 pn5Var2 = (pn5) obj;
                int iOrdinal2 = i41Var.ordinal();
                if (iOrdinal2 != 14) {
                    if (iOrdinal2 != 16) {
                        return;
                    }
                    pn5Var2.t(i41.y, null);
                    return;
                }
                SharedPreferences sharedPreferences = (SharedPreferences) pn5Var2.p;
                int i = sharedPreferences.getInt("STAT_COUNT_CONNECTIONS", 0);
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.getClass();
                editorEdit.putInt("STAT_COUNT_CONNECTIONS", i + 1);
                editorEdit.commit();
                pn5Var2.t(i41Var2, null);
                return;
            default:
                if (i41Var == i41Var2) {
                    try {
                        ((io.sentry.android.core.n1) obj).o(false);
                        return;
                    } catch (Throwable th) {
                        if (Build.VERSION.SDK_INT < 31 || !pz2.p(th)) {
                            throw th;
                        }
                        ye4.a("SessionTimeoutController", "Error starting foreground service with session: " + th);
                        return;
                    }
                }
                return;
        }
    }
}
