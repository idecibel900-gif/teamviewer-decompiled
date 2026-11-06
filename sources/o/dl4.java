package o;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.widget.NestedScrollView;
import com.teamviewer.chatviewmodel.swig.ChatConversationID;
import com.teamviewer.chatviewmodel.swig.ChatUIModelLocatorAndroid;
import com.teamviewer.chatviewmodel.swig.IStartChatUIModelAndroid;
import com.teamviewer.remotecontrollib.swig.LicenseViewModel;
import com.teamviewer.remotecontrollib.swig.LicenseViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IManagedDeviceV2ViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IManagedDeviceV2ViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ManagedDevicesV2MemberId;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ManagedDevicesV2MemberSWIGJNI;
import com.teamviewer.remotecontrolviewlib.activity.SettingsActivity;
import com.teamviewer.remotecontrolviewlib.view.partnerlist.DeviceOptionsActionButton;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo/dl4;", "Lo/zb0;", "Lo/bi3;", "Lo/hq4;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class dl4 extends zb0 implements bi3, hq4 {
    public static final /* synthetic */ int K0 = 0;
    public final zk4 A0;
    public final zk4 B0;
    public final zk4 C0;
    public final zk4 D0;
    public final zk4 E0;
    public final zk4 F0;
    public final zk4 G0;
    public rb3 s0;
    public LinearLayout t0;
    public AppCompatImageView u0;
    public yl4 v0;
    public ShortcutManager y0;
    public String w0 = "";
    public String x0 = "";
    public final cl4 z0 = new cl4(this);
    public final cl4 H0 = new cl4(this);
    public final b6 I0 = new b6(this, (byte) 7);
    public final pe0 J0 = new pe0(new al4(this, (byte) 0), (byte) 2);

    /* JADX WARN: Type inference failed for: r0v2, types: [o.zk4] */
    /* JADX WARN: Type inference failed for: r0v3, types: [o.zk4] */
    /* JADX WARN: Type inference failed for: r0v4, types: [o.zk4] */
    /* JADX WARN: Type inference failed for: r0v5, types: [o.zk4] */
    /* JADX WARN: Type inference failed for: r0v6, types: [o.zk4] */
    /* JADX WARN: Type inference failed for: r0v7, types: [o.zk4] */
    /* JADX WARN: Type inference failed for: r0v8, types: [o.zk4] */
    public dl4() {
        final byte b = 0;
        this.A0 = new View.OnClickListener(this) { // from class: o.zk4
            public final /* synthetic */ dl4 n;

            {
                this.n = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qb3 qb3Var;
                qb3 qb3Var2;
                qb3 qb3Var3;
                qb3 qb3Var4;
                qb3 qb3Var5;
                String strLicenseViewModel_GetAccountLoginName;
                ShortcutManager shortcutManager;
                Intent intentCreateShortcutResultIntent;
                nw4 nw4Var;
                nw4 nw4Var2;
                nw4 nw4Var3;
                nw4 nw4Var4;
                nw4 nw4Var5;
                byte b2 = b;
                Boolean boolValueOf = null;
                broadcast = null;
                PendingIntent broadcast = null;
                dl4 dl4Var = this.n;
                switch (b2) {
                    case 0:
                        rb3 rb3Var = dl4Var.s0;
                        if (rb3Var == null || (qb3Var = ((rk4) rb3Var).n) == null) {
                            return;
                        }
                        ((xd0) qb3Var).W0();
                        return;
                    case 1:
                        rb3 rb3Var2 = dl4Var.s0;
                        if (rb3Var2 == null || (qb3Var2 = ((rk4) rb3Var2).n) == null) {
                            return;
                        }
                        xd0 xd0Var = (xd0) qb3Var2;
                        nc0 nc0Var = xd0Var.D;
                        IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel = xd0Var.C;
                        iManagedDeviceV2ViewModel.getClass();
                        DyngateID dyngateID = new DyngateID(IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_GetDyngateID(iManagedDeviceV2ViewModel.a, iManagedDeviceV2ViewModel), true);
                        nc0Var.getClass();
                        nc0.d(dyngateID);
                        return;
                    case 2:
                        rb3 rb3Var3 = dl4Var.s0;
                        if (rb3Var3 != null && (qb3Var3 = ((rk4) rb3Var3).n) != null) {
                            xd0 xd0Var2 = (xd0) qb3Var3;
                            nc0 nc0Var2 = xd0Var2.D;
                            IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel2 = xd0Var2.C;
                            nc0Var2.getClass();
                            iManagedDeviceV2ViewModel2.getClass();
                            IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_WakeOnLan(iManagedDeviceV2ViewModel2.a, iManagedDeviceV2ViewModel2);
                        }
                        IStatisticsHandler iStatisticsHandler = ga7.a;
                        ga7.a(dh8.WakeUpFromDeviceActionsPage);
                        return;
                    case 3:
                        rb3 rb3Var4 = dl4Var.s0;
                        if (rb3Var4 != null) {
                            qb3 qb3Var6 = ((rk4) rb3Var4).n;
                            if (qb3Var6 != null) {
                                IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel3 = ((p1) qb3Var6).n;
                                boolValueOf = Boolean.valueOf(IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_ShowActivateRemoteAccessEndpoint(iManagedDeviceV2ViewModel3.a, iManagedDeviceV2ViewModel3));
                            }
                            if (!im3.n(boolValueOf, Boolean.TRUE)) {
                                rb3 rb3Var5 = dl4Var.s0;
                                if (rb3Var5 == null || (qb3Var4 = ((rk4) rb3Var5).n) == null) {
                                    return;
                                }
                                ((xd0) qb3Var4).X0();
                                return;
                            }
                            x02 x02VarA = ik7.a();
                            gk7 gk7Var = new gk7();
                            fx3.o(1, "dialogId", x02VarA, gk7Var);
                            gk7Var.Z0 = x02VarA;
                            gk7Var.H0 = R.string.tv_activate_endpoint_text;
                            gk7Var.O0 = R.string.tv_cancel;
                            gk7Var.K0 = R.string.tv_activate_endpoint;
                            xk1 xk1Var = ct1.a;
                            if (xk1Var != null) {
                                xk1Var.L(gk7Var);
                            }
                            if (xk1Var != null) {
                                xk1.M(dl4Var.I0, new r02(gk7Var, p02.Positive));
                            }
                            dl4Var.z0.g(gk7Var);
                            return;
                        }
                        return;
                    case 4:
                        rb3 rb3Var6 = dl4Var.s0;
                        if (rb3Var6 != null) {
                            cl4 cl4Var = dl4Var.H0;
                            cl4Var.getClass();
                            qb3 qb3Var7 = ((rk4) rb3Var6).n;
                            if (qb3Var7 != null) {
                                cl4 cl4Var2 = cl4Var.m.z0;
                                IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel4 = ((p1) qb3Var7).n;
                                boolean zIManagedDeviceV2ViewModel_ShowChatTo = IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_ShowChatTo(iManagedDeviceV2ViewModel4.a, iManagedDeviceV2ViewModel4);
                                ye4 ye4Var = ye4.a;
                                if (zIManagedDeviceV2ViewModel_ShowChatTo) {
                                    IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                    if (iStartChatUIModelAndroidGetStartChatUIModelAndroid == null) {
                                        ye4Var.g("AbstractManagedDeviceV2MemberViewModel", "chatTo: No VM!");
                                        return;
                                    }
                                    ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_GetChatEndPoint(iManagedDeviceV2ViewModel4.a, iManagedDeviceV2ViewModel4));
                                    if (it1.c == null) {
                                        im3.e0("viewFactory");
                                        throw null;
                                    }
                                    chatConversationIDRequestPrivateRoomWithEndPoint.getClass();
                                    cl4Var2.x(ep3.h(chatConversationIDRequestPrivateRoomWithEndPoint));
                                    return;
                                }
                                ye4Var.b("AbstractManagedDeviceV2MemberViewModel", "Chat should not be visible");
                                x02 x02VarA2 = ik7.a();
                                gk7 gk7Var2 = new gk7();
                                fx3.o(1, "dialogId", x02VarA2, gk7Var2);
                                gk7Var2.Z0 = x02VarA2;
                                gk7Var2.H0 = R.string.tv_IDS_CHAT_NO_PREVIOUS_CONNECTIONS;
                                gk7Var2.O0 = R.string.tv_ok;
                                xk1 xk1Var2 = ct1.a;
                                if (xk1Var2 != null) {
                                    xk1Var2.L(gk7Var2);
                                }
                                cl4Var2.g(gk7Var2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        rb3 rb3Var7 = dl4Var.s0;
                        if (rb3Var7 != null) {
                            rk4 rk4Var = (rk4) rb3Var7;
                            if (((String) rk4Var.v.getValue()) == null || (qb3Var5 = rk4Var.n) == null) {
                                return;
                            }
                            xd0 xd0Var3 = (xd0) qb3Var5;
                            gu0 gu0VarN = e8.n(xd0Var3);
                            tk1 tk1Var = g22.a;
                            im3.R(gu0VarN, gk1.f901o, null, new wd0(xd0Var3, null, (byte) 1), 2);
                            return;
                        }
                        return;
                    default:
                        ShortcutManager shortcutManager2 = dl4Var.y0;
                        if (shortcutManager2 == null || !shortcutManager2.isRequestPinShortcutSupported()) {
                            return;
                        }
                        ShortcutManager shortcutManager3 = dl4Var.y0;
                        List<ShortcutInfo> pinnedShortcuts = shortcutManager3 != null ? shortcutManager3.getPinnedShortcuts() : null;
                        Integer numValueOf = pinnedShortcuts != null ? Integer.valueOf(pinnedShortcuts.size()) : null;
                        boolean z = false;
                        if (pinnedShortcuts != null) {
                            Iterator<ShortcutInfo> it = pinnedShortcuts.iterator();
                            while (it.hasNext()) {
                                String id = it.next().getId();
                                rb3 rb3Var8 = dl4Var.s0;
                                if (im3.n(id, (rb3Var8 == null || (nw4Var5 = ((rk4) rb3Var8).r) == null) ? null : (String) nw4Var5.getValue())) {
                                    Toast toastMakeText = Toast.makeText(dl4Var.r0(), R.string.tv_device_options_home_screen_shortcut_already_exists, 1);
                                    toastMakeText.getClass();
                                    toastMakeText.show();
                                    z = true;
                                }
                            }
                        }
                        if (numValueOf == null || z) {
                            return;
                        }
                        if (numValueOf.intValue() >= 5) {
                            x02 x02VarA3 = ik7.a();
                            gk7 gk7Var3 = new gk7();
                            fx3.o(1, "dialogId", x02VarA3, gk7Var3);
                            gk7Var3.Z0 = x02VarA3;
                            gk7Var3.H0 = R.string.tv_device_options_home_screen_shortcut_max_number_dialog_text;
                            gk7Var3.F0 = R.string.tv_device_options_home_screen_shortcut_max_number_dialog_title;
                            gk7Var3.O0 = R.string.tv_ok;
                            gk7.O0(gk7Var3, dl4Var.p0());
                            return;
                        }
                        Uri uri = Uri.parse("tvshortcut://openshortcut");
                        rb3 rb3Var9 = dl4Var.s0;
                        ShortcutInfo.Builder builder = new ShortcutInfo.Builder(dl4Var.p0(), (rb3Var9 == null || (nw4Var4 = ((rk4) rb3Var9).r) == null) ? null : (String) nw4Var4.getValue());
                        rb3 rb3Var10 = dl4Var.s0;
                        ShortcutInfo.Builder shortLabel = builder.setShortLabel(String.valueOf((rb3Var10 == null || (nw4Var3 = ((rk4) rb3Var10).q) == null) ? null : (String) nw4Var3.getValue()));
                        rb3 rb3Var11 = dl4Var.s0;
                        ShortcutInfo.Builder icon = shortLabel.setLongLabel(String.valueOf((rb3Var11 == null || (nw4Var2 = ((rk4) rb3Var11).q) == null) ? null : (String) nw4Var2.getValue())).setIcon(Icon.createWithResource(dl4Var.E(), R.drawable.home_screen_shortcut_device_logo));
                        Intent intentPutExtra = new Intent("android.intent.action.VIEW", uri).putExtra("IS_SHORTCUT", true);
                        rb3 rb3Var12 = dl4Var.s0;
                        if (rb3Var12 != null) {
                            LicenseViewModel licenseViewModel = ((rk4) rb3Var12).p;
                            strLicenseViewModel_GetAccountLoginName = LicenseViewModelSWIGJNI.LicenseViewModel_GetAccountLoginName(licenseViewModel.a, licenseViewModel);
                        } else {
                            strLicenseViewModel_GetAccountLoginName = null;
                        }
                        Intent intentPutExtra2 = intentPutExtra.putExtra("KEY_ACCOUNTNAME", strLicenseViewModel_GetAccountLoginName);
                        rb3 rb3Var13 = dl4Var.s0;
                        ShortcutInfo shortcutInfoBuild = icon.setIntent(intentPutExtra2.putExtra("MDV2_MANAGEMENT_ID", (rb3Var13 == null || (nw4Var = ((rk4) rb3Var13).v) == null) ? null : (String) nw4Var.getValue()).addFlags(67108864).addFlags(268435456)).build();
                        shortcutInfoBuild.getClass();
                        ShortcutManager shortcutManager4 = dl4Var.y0;
                        if (shortcutManager4 != null && (intentCreateShortcutResultIntent = shortcutManager4.createShortcutResultIntent(shortcutInfoBuild)) != null) {
                            broadcast = PendingIntent.getBroadcast(dl4Var.E(), 1, intentCreateShortcutResultIntent, 67108864);
                        }
                        if (broadcast == null || (shortcutManager = dl4Var.y0) == null) {
                            return;
                        }
                        shortcutManager.requestPinShortcut(shortcutInfoBuild, broadcast.getIntentSender());
                        return;
                }
            }
        };
        final byte b2 = 1;
        this.B0 = new View.OnClickListener(this) { // from class: o.zk4
            public final /* synthetic */ dl4 n;

            {
                this.n = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qb3 qb3Var;
                qb3 qb3Var2;
                qb3 qb3Var3;
                qb3 qb3Var4;
                qb3 qb3Var5;
                String strLicenseViewModel_GetAccountLoginName;
                ShortcutManager shortcutManager;
                Intent intentCreateShortcutResultIntent;
                nw4 nw4Var;
                nw4 nw4Var2;
                nw4 nw4Var3;
                nw4 nw4Var4;
                nw4 nw4Var5;
                byte b3 = b2;
                Boolean boolValueOf = null;
                broadcast = null;
                PendingIntent broadcast = null;
                dl4 dl4Var = this.n;
                switch (b3) {
                    case 0:
                        rb3 rb3Var = dl4Var.s0;
                        if (rb3Var == null || (qb3Var = ((rk4) rb3Var).n) == null) {
                            return;
                        }
                        ((xd0) qb3Var).W0();
                        return;
                    case 1:
                        rb3 rb3Var2 = dl4Var.s0;
                        if (rb3Var2 == null || (qb3Var2 = ((rk4) rb3Var2).n) == null) {
                            return;
                        }
                        xd0 xd0Var = (xd0) qb3Var2;
                        nc0 nc0Var = xd0Var.D;
                        IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel = xd0Var.C;
                        iManagedDeviceV2ViewModel.getClass();
                        DyngateID dyngateID = new DyngateID(IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_GetDyngateID(iManagedDeviceV2ViewModel.a, iManagedDeviceV2ViewModel), true);
                        nc0Var.getClass();
                        nc0.d(dyngateID);
                        return;
                    case 2:
                        rb3 rb3Var3 = dl4Var.s0;
                        if (rb3Var3 != null && (qb3Var3 = ((rk4) rb3Var3).n) != null) {
                            xd0 xd0Var2 = (xd0) qb3Var3;
                            nc0 nc0Var2 = xd0Var2.D;
                            IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel2 = xd0Var2.C;
                            nc0Var2.getClass();
                            iManagedDeviceV2ViewModel2.getClass();
                            IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_WakeOnLan(iManagedDeviceV2ViewModel2.a, iManagedDeviceV2ViewModel2);
                        }
                        IStatisticsHandler iStatisticsHandler = ga7.a;
                        ga7.a(dh8.WakeUpFromDeviceActionsPage);
                        return;
                    case 3:
                        rb3 rb3Var4 = dl4Var.s0;
                        if (rb3Var4 != null) {
                            qb3 qb3Var6 = ((rk4) rb3Var4).n;
                            if (qb3Var6 != null) {
                                IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel3 = ((p1) qb3Var6).n;
                                boolValueOf = Boolean.valueOf(IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_ShowActivateRemoteAccessEndpoint(iManagedDeviceV2ViewModel3.a, iManagedDeviceV2ViewModel3));
                            }
                            if (!im3.n(boolValueOf, Boolean.TRUE)) {
                                rb3 rb3Var5 = dl4Var.s0;
                                if (rb3Var5 == null || (qb3Var4 = ((rk4) rb3Var5).n) == null) {
                                    return;
                                }
                                ((xd0) qb3Var4).X0();
                                return;
                            }
                            x02 x02VarA = ik7.a();
                            gk7 gk7Var = new gk7();
                            fx3.o(1, "dialogId", x02VarA, gk7Var);
                            gk7Var.Z0 = x02VarA;
                            gk7Var.H0 = R.string.tv_activate_endpoint_text;
                            gk7Var.O0 = R.string.tv_cancel;
                            gk7Var.K0 = R.string.tv_activate_endpoint;
                            xk1 xk1Var = ct1.a;
                            if (xk1Var != null) {
                                xk1Var.L(gk7Var);
                            }
                            if (xk1Var != null) {
                                xk1.M(dl4Var.I0, new r02(gk7Var, p02.Positive));
                            }
                            dl4Var.z0.g(gk7Var);
                            return;
                        }
                        return;
                    case 4:
                        rb3 rb3Var6 = dl4Var.s0;
                        if (rb3Var6 != null) {
                            cl4 cl4Var = dl4Var.H0;
                            cl4Var.getClass();
                            qb3 qb3Var7 = ((rk4) rb3Var6).n;
                            if (qb3Var7 != null) {
                                cl4 cl4Var2 = cl4Var.m.z0;
                                IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel4 = ((p1) qb3Var7).n;
                                boolean zIManagedDeviceV2ViewModel_ShowChatTo = IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_ShowChatTo(iManagedDeviceV2ViewModel4.a, iManagedDeviceV2ViewModel4);
                                ye4 ye4Var = ye4.a;
                                if (zIManagedDeviceV2ViewModel_ShowChatTo) {
                                    IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                    if (iStartChatUIModelAndroidGetStartChatUIModelAndroid == null) {
                                        ye4Var.g("AbstractManagedDeviceV2MemberViewModel", "chatTo: No VM!");
                                        return;
                                    }
                                    ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_GetChatEndPoint(iManagedDeviceV2ViewModel4.a, iManagedDeviceV2ViewModel4));
                                    if (it1.c == null) {
                                        im3.e0("viewFactory");
                                        throw null;
                                    }
                                    chatConversationIDRequestPrivateRoomWithEndPoint.getClass();
                                    cl4Var2.x(ep3.h(chatConversationIDRequestPrivateRoomWithEndPoint));
                                    return;
                                }
                                ye4Var.b("AbstractManagedDeviceV2MemberViewModel", "Chat should not be visible");
                                x02 x02VarA2 = ik7.a();
                                gk7 gk7Var2 = new gk7();
                                fx3.o(1, "dialogId", x02VarA2, gk7Var2);
                                gk7Var2.Z0 = x02VarA2;
                                gk7Var2.H0 = R.string.tv_IDS_CHAT_NO_PREVIOUS_CONNECTIONS;
                                gk7Var2.O0 = R.string.tv_ok;
                                xk1 xk1Var2 = ct1.a;
                                if (xk1Var2 != null) {
                                    xk1Var2.L(gk7Var2);
                                }
                                cl4Var2.g(gk7Var2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        rb3 rb3Var7 = dl4Var.s0;
                        if (rb3Var7 != null) {
                            rk4 rk4Var = (rk4) rb3Var7;
                            if (((String) rk4Var.v.getValue()) == null || (qb3Var5 = rk4Var.n) == null) {
                                return;
                            }
                            xd0 xd0Var3 = (xd0) qb3Var5;
                            gu0 gu0VarN = e8.n(xd0Var3);
                            tk1 tk1Var = g22.a;
                            im3.R(gu0VarN, gk1.f901o, null, new wd0(xd0Var3, null, (byte) 1), 2);
                            return;
                        }
                        return;
                    default:
                        ShortcutManager shortcutManager2 = dl4Var.y0;
                        if (shortcutManager2 == null || !shortcutManager2.isRequestPinShortcutSupported()) {
                            return;
                        }
                        ShortcutManager shortcutManager3 = dl4Var.y0;
                        List<ShortcutInfo> pinnedShortcuts = shortcutManager3 != null ? shortcutManager3.getPinnedShortcuts() : null;
                        Integer numValueOf = pinnedShortcuts != null ? Integer.valueOf(pinnedShortcuts.size()) : null;
                        boolean z = false;
                        if (pinnedShortcuts != null) {
                            Iterator<ShortcutInfo> it = pinnedShortcuts.iterator();
                            while (it.hasNext()) {
                                String id = it.next().getId();
                                rb3 rb3Var8 = dl4Var.s0;
                                if (im3.n(id, (rb3Var8 == null || (nw4Var5 = ((rk4) rb3Var8).r) == null) ? null : (String) nw4Var5.getValue())) {
                                    Toast toastMakeText = Toast.makeText(dl4Var.r0(), R.string.tv_device_options_home_screen_shortcut_already_exists, 1);
                                    toastMakeText.getClass();
                                    toastMakeText.show();
                                    z = true;
                                }
                            }
                        }
                        if (numValueOf == null || z) {
                            return;
                        }
                        if (numValueOf.intValue() >= 5) {
                            x02 x02VarA3 = ik7.a();
                            gk7 gk7Var3 = new gk7();
                            fx3.o(1, "dialogId", x02VarA3, gk7Var3);
                            gk7Var3.Z0 = x02VarA3;
                            gk7Var3.H0 = R.string.tv_device_options_home_screen_shortcut_max_number_dialog_text;
                            gk7Var3.F0 = R.string.tv_device_options_home_screen_shortcut_max_number_dialog_title;
                            gk7Var3.O0 = R.string.tv_ok;
                            gk7.O0(gk7Var3, dl4Var.p0());
                            return;
                        }
                        Uri uri = Uri.parse("tvshortcut://openshortcut");
                        rb3 rb3Var9 = dl4Var.s0;
                        ShortcutInfo.Builder builder = new ShortcutInfo.Builder(dl4Var.p0(), (rb3Var9 == null || (nw4Var4 = ((rk4) rb3Var9).r) == null) ? null : (String) nw4Var4.getValue());
                        rb3 rb3Var10 = dl4Var.s0;
                        ShortcutInfo.Builder shortLabel = builder.setShortLabel(String.valueOf((rb3Var10 == null || (nw4Var3 = ((rk4) rb3Var10).q) == null) ? null : (String) nw4Var3.getValue()));
                        rb3 rb3Var11 = dl4Var.s0;
                        ShortcutInfo.Builder icon = shortLabel.setLongLabel(String.valueOf((rb3Var11 == null || (nw4Var2 = ((rk4) rb3Var11).q) == null) ? null : (String) nw4Var2.getValue())).setIcon(Icon.createWithResource(dl4Var.E(), R.drawable.home_screen_shortcut_device_logo));
                        Intent intentPutExtra = new Intent("android.intent.action.VIEW", uri).putExtra("IS_SHORTCUT", true);
                        rb3 rb3Var12 = dl4Var.s0;
                        if (rb3Var12 != null) {
                            LicenseViewModel licenseViewModel = ((rk4) rb3Var12).p;
                            strLicenseViewModel_GetAccountLoginName = LicenseViewModelSWIGJNI.LicenseViewModel_GetAccountLoginName(licenseViewModel.a, licenseViewModel);
                        } else {
                            strLicenseViewModel_GetAccountLoginName = null;
                        }
                        Intent intentPutExtra2 = intentPutExtra.putExtra("KEY_ACCOUNTNAME", strLicenseViewModel_GetAccountLoginName);
                        rb3 rb3Var13 = dl4Var.s0;
                        ShortcutInfo shortcutInfoBuild = icon.setIntent(intentPutExtra2.putExtra("MDV2_MANAGEMENT_ID", (rb3Var13 == null || (nw4Var = ((rk4) rb3Var13).v) == null) ? null : (String) nw4Var.getValue()).addFlags(67108864).addFlags(268435456)).build();
                        shortcutInfoBuild.getClass();
                        ShortcutManager shortcutManager4 = dl4Var.y0;
                        if (shortcutManager4 != null && (intentCreateShortcutResultIntent = shortcutManager4.createShortcutResultIntent(shortcutInfoBuild)) != null) {
                            broadcast = PendingIntent.getBroadcast(dl4Var.E(), 1, intentCreateShortcutResultIntent, 67108864);
                        }
                        if (broadcast == null || (shortcutManager = dl4Var.y0) == null) {
                            return;
                        }
                        shortcutManager.requestPinShortcut(shortcutInfoBuild, broadcast.getIntentSender());
                        return;
                }
            }
        };
        final byte b3 = 2;
        this.C0 = new View.OnClickListener(this) { // from class: o.zk4
            public final /* synthetic */ dl4 n;

            {
                this.n = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qb3 qb3Var;
                qb3 qb3Var2;
                qb3 qb3Var3;
                qb3 qb3Var4;
                qb3 qb3Var5;
                String strLicenseViewModel_GetAccountLoginName;
                ShortcutManager shortcutManager;
                Intent intentCreateShortcutResultIntent;
                nw4 nw4Var;
                nw4 nw4Var2;
                nw4 nw4Var3;
                nw4 nw4Var4;
                nw4 nw4Var5;
                byte b4 = b3;
                Boolean boolValueOf = null;
                broadcast = null;
                PendingIntent broadcast = null;
                dl4 dl4Var = this.n;
                switch (b4) {
                    case 0:
                        rb3 rb3Var = dl4Var.s0;
                        if (rb3Var == null || (qb3Var = ((rk4) rb3Var).n) == null) {
                            return;
                        }
                        ((xd0) qb3Var).W0();
                        return;
                    case 1:
                        rb3 rb3Var2 = dl4Var.s0;
                        if (rb3Var2 == null || (qb3Var2 = ((rk4) rb3Var2).n) == null) {
                            return;
                        }
                        xd0 xd0Var = (xd0) qb3Var2;
                        nc0 nc0Var = xd0Var.D;
                        IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel = xd0Var.C;
                        iManagedDeviceV2ViewModel.getClass();
                        DyngateID dyngateID = new DyngateID(IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_GetDyngateID(iManagedDeviceV2ViewModel.a, iManagedDeviceV2ViewModel), true);
                        nc0Var.getClass();
                        nc0.d(dyngateID);
                        return;
                    case 2:
                        rb3 rb3Var3 = dl4Var.s0;
                        if (rb3Var3 != null && (qb3Var3 = ((rk4) rb3Var3).n) != null) {
                            xd0 xd0Var2 = (xd0) qb3Var3;
                            nc0 nc0Var2 = xd0Var2.D;
                            IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel2 = xd0Var2.C;
                            nc0Var2.getClass();
                            iManagedDeviceV2ViewModel2.getClass();
                            IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_WakeOnLan(iManagedDeviceV2ViewModel2.a, iManagedDeviceV2ViewModel2);
                        }
                        IStatisticsHandler iStatisticsHandler = ga7.a;
                        ga7.a(dh8.WakeUpFromDeviceActionsPage);
                        return;
                    case 3:
                        rb3 rb3Var4 = dl4Var.s0;
                        if (rb3Var4 != null) {
                            qb3 qb3Var6 = ((rk4) rb3Var4).n;
                            if (qb3Var6 != null) {
                                IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel3 = ((p1) qb3Var6).n;
                                boolValueOf = Boolean.valueOf(IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_ShowActivateRemoteAccessEndpoint(iManagedDeviceV2ViewModel3.a, iManagedDeviceV2ViewModel3));
                            }
                            if (!im3.n(boolValueOf, Boolean.TRUE)) {
                                rb3 rb3Var5 = dl4Var.s0;
                                if (rb3Var5 == null || (qb3Var4 = ((rk4) rb3Var5).n) == null) {
                                    return;
                                }
                                ((xd0) qb3Var4).X0();
                                return;
                            }
                            x02 x02VarA = ik7.a();
                            gk7 gk7Var = new gk7();
                            fx3.o(1, "dialogId", x02VarA, gk7Var);
                            gk7Var.Z0 = x02VarA;
                            gk7Var.H0 = R.string.tv_activate_endpoint_text;
                            gk7Var.O0 = R.string.tv_cancel;
                            gk7Var.K0 = R.string.tv_activate_endpoint;
                            xk1 xk1Var = ct1.a;
                            if (xk1Var != null) {
                                xk1Var.L(gk7Var);
                            }
                            if (xk1Var != null) {
                                xk1.M(dl4Var.I0, new r02(gk7Var, p02.Positive));
                            }
                            dl4Var.z0.g(gk7Var);
                            return;
                        }
                        return;
                    case 4:
                        rb3 rb3Var6 = dl4Var.s0;
                        if (rb3Var6 != null) {
                            cl4 cl4Var = dl4Var.H0;
                            cl4Var.getClass();
                            qb3 qb3Var7 = ((rk4) rb3Var6).n;
                            if (qb3Var7 != null) {
                                cl4 cl4Var2 = cl4Var.m.z0;
                                IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel4 = ((p1) qb3Var7).n;
                                boolean zIManagedDeviceV2ViewModel_ShowChatTo = IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_ShowChatTo(iManagedDeviceV2ViewModel4.a, iManagedDeviceV2ViewModel4);
                                ye4 ye4Var = ye4.a;
                                if (zIManagedDeviceV2ViewModel_ShowChatTo) {
                                    IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                    if (iStartChatUIModelAndroidGetStartChatUIModelAndroid == null) {
                                        ye4Var.g("AbstractManagedDeviceV2MemberViewModel", "chatTo: No VM!");
                                        return;
                                    }
                                    ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_GetChatEndPoint(iManagedDeviceV2ViewModel4.a, iManagedDeviceV2ViewModel4));
                                    if (it1.c == null) {
                                        im3.e0("viewFactory");
                                        throw null;
                                    }
                                    chatConversationIDRequestPrivateRoomWithEndPoint.getClass();
                                    cl4Var2.x(ep3.h(chatConversationIDRequestPrivateRoomWithEndPoint));
                                    return;
                                }
                                ye4Var.b("AbstractManagedDeviceV2MemberViewModel", "Chat should not be visible");
                                x02 x02VarA2 = ik7.a();
                                gk7 gk7Var2 = new gk7();
                                fx3.o(1, "dialogId", x02VarA2, gk7Var2);
                                gk7Var2.Z0 = x02VarA2;
                                gk7Var2.H0 = R.string.tv_IDS_CHAT_NO_PREVIOUS_CONNECTIONS;
                                gk7Var2.O0 = R.string.tv_ok;
                                xk1 xk1Var2 = ct1.a;
                                if (xk1Var2 != null) {
                                    xk1Var2.L(gk7Var2);
                                }
                                cl4Var2.g(gk7Var2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        rb3 rb3Var7 = dl4Var.s0;
                        if (rb3Var7 != null) {
                            rk4 rk4Var = (rk4) rb3Var7;
                            if (((String) rk4Var.v.getValue()) == null || (qb3Var5 = rk4Var.n) == null) {
                                return;
                            }
                            xd0 xd0Var3 = (xd0) qb3Var5;
                            gu0 gu0VarN = e8.n(xd0Var3);
                            tk1 tk1Var = g22.a;
                            im3.R(gu0VarN, gk1.f901o, null, new wd0(xd0Var3, null, (byte) 1), 2);
                            return;
                        }
                        return;
                    default:
                        ShortcutManager shortcutManager2 = dl4Var.y0;
                        if (shortcutManager2 == null || !shortcutManager2.isRequestPinShortcutSupported()) {
                            return;
                        }
                        ShortcutManager shortcutManager3 = dl4Var.y0;
                        List<ShortcutInfo> pinnedShortcuts = shortcutManager3 != null ? shortcutManager3.getPinnedShortcuts() : null;
                        Integer numValueOf = pinnedShortcuts != null ? Integer.valueOf(pinnedShortcuts.size()) : null;
                        boolean z = false;
                        if (pinnedShortcuts != null) {
                            Iterator<ShortcutInfo> it = pinnedShortcuts.iterator();
                            while (it.hasNext()) {
                                String id = it.next().getId();
                                rb3 rb3Var8 = dl4Var.s0;
                                if (im3.n(id, (rb3Var8 == null || (nw4Var5 = ((rk4) rb3Var8).r) == null) ? null : (String) nw4Var5.getValue())) {
                                    Toast toastMakeText = Toast.makeText(dl4Var.r0(), R.string.tv_device_options_home_screen_shortcut_already_exists, 1);
                                    toastMakeText.getClass();
                                    toastMakeText.show();
                                    z = true;
                                }
                            }
                        }
                        if (numValueOf == null || z) {
                            return;
                        }
                        if (numValueOf.intValue() >= 5) {
                            x02 x02VarA3 = ik7.a();
                            gk7 gk7Var3 = new gk7();
                            fx3.o(1, "dialogId", x02VarA3, gk7Var3);
                            gk7Var3.Z0 = x02VarA3;
                            gk7Var3.H0 = R.string.tv_device_options_home_screen_shortcut_max_number_dialog_text;
                            gk7Var3.F0 = R.string.tv_device_options_home_screen_shortcut_max_number_dialog_title;
                            gk7Var3.O0 = R.string.tv_ok;
                            gk7.O0(gk7Var3, dl4Var.p0());
                            return;
                        }
                        Uri uri = Uri.parse("tvshortcut://openshortcut");
                        rb3 rb3Var9 = dl4Var.s0;
                        ShortcutInfo.Builder builder = new ShortcutInfo.Builder(dl4Var.p0(), (rb3Var9 == null || (nw4Var4 = ((rk4) rb3Var9).r) == null) ? null : (String) nw4Var4.getValue());
                        rb3 rb3Var10 = dl4Var.s0;
                        ShortcutInfo.Builder shortLabel = builder.setShortLabel(String.valueOf((rb3Var10 == null || (nw4Var3 = ((rk4) rb3Var10).q) == null) ? null : (String) nw4Var3.getValue()));
                        rb3 rb3Var11 = dl4Var.s0;
                        ShortcutInfo.Builder icon = shortLabel.setLongLabel(String.valueOf((rb3Var11 == null || (nw4Var2 = ((rk4) rb3Var11).q) == null) ? null : (String) nw4Var2.getValue())).setIcon(Icon.createWithResource(dl4Var.E(), R.drawable.home_screen_shortcut_device_logo));
                        Intent intentPutExtra = new Intent("android.intent.action.VIEW", uri).putExtra("IS_SHORTCUT", true);
                        rb3 rb3Var12 = dl4Var.s0;
                        if (rb3Var12 != null) {
                            LicenseViewModel licenseViewModel = ((rk4) rb3Var12).p;
                            strLicenseViewModel_GetAccountLoginName = LicenseViewModelSWIGJNI.LicenseViewModel_GetAccountLoginName(licenseViewModel.a, licenseViewModel);
                        } else {
                            strLicenseViewModel_GetAccountLoginName = null;
                        }
                        Intent intentPutExtra2 = intentPutExtra.putExtra("KEY_ACCOUNTNAME", strLicenseViewModel_GetAccountLoginName);
                        rb3 rb3Var13 = dl4Var.s0;
                        ShortcutInfo shortcutInfoBuild = icon.setIntent(intentPutExtra2.putExtra("MDV2_MANAGEMENT_ID", (rb3Var13 == null || (nw4Var = ((rk4) rb3Var13).v) == null) ? null : (String) nw4Var.getValue()).addFlags(67108864).addFlags(268435456)).build();
                        shortcutInfoBuild.getClass();
                        ShortcutManager shortcutManager4 = dl4Var.y0;
                        if (shortcutManager4 != null && (intentCreateShortcutResultIntent = shortcutManager4.createShortcutResultIntent(shortcutInfoBuild)) != null) {
                            broadcast = PendingIntent.getBroadcast(dl4Var.E(), 1, intentCreateShortcutResultIntent, 67108864);
                        }
                        if (broadcast == null || (shortcutManager = dl4Var.y0) == null) {
                            return;
                        }
                        shortcutManager.requestPinShortcut(shortcutInfoBuild, broadcast.getIntentSender());
                        return;
                }
            }
        };
        final byte b4 = 3;
        this.D0 = new View.OnClickListener(this) { // from class: o.zk4
            public final /* synthetic */ dl4 n;

            {
                this.n = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qb3 qb3Var;
                qb3 qb3Var2;
                qb3 qb3Var3;
                qb3 qb3Var4;
                qb3 qb3Var5;
                String strLicenseViewModel_GetAccountLoginName;
                ShortcutManager shortcutManager;
                Intent intentCreateShortcutResultIntent;
                nw4 nw4Var;
                nw4 nw4Var2;
                nw4 nw4Var3;
                nw4 nw4Var4;
                nw4 nw4Var5;
                byte b5 = b4;
                Boolean boolValueOf = null;
                broadcast = null;
                PendingIntent broadcast = null;
                dl4 dl4Var = this.n;
                switch (b5) {
                    case 0:
                        rb3 rb3Var = dl4Var.s0;
                        if (rb3Var == null || (qb3Var = ((rk4) rb3Var).n) == null) {
                            return;
                        }
                        ((xd0) qb3Var).W0();
                        return;
                    case 1:
                        rb3 rb3Var2 = dl4Var.s0;
                        if (rb3Var2 == null || (qb3Var2 = ((rk4) rb3Var2).n) == null) {
                            return;
                        }
                        xd0 xd0Var = (xd0) qb3Var2;
                        nc0 nc0Var = xd0Var.D;
                        IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel = xd0Var.C;
                        iManagedDeviceV2ViewModel.getClass();
                        DyngateID dyngateID = new DyngateID(IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_GetDyngateID(iManagedDeviceV2ViewModel.a, iManagedDeviceV2ViewModel), true);
                        nc0Var.getClass();
                        nc0.d(dyngateID);
                        return;
                    case 2:
                        rb3 rb3Var3 = dl4Var.s0;
                        if (rb3Var3 != null && (qb3Var3 = ((rk4) rb3Var3).n) != null) {
                            xd0 xd0Var2 = (xd0) qb3Var3;
                            nc0 nc0Var2 = xd0Var2.D;
                            IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel2 = xd0Var2.C;
                            nc0Var2.getClass();
                            iManagedDeviceV2ViewModel2.getClass();
                            IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_WakeOnLan(iManagedDeviceV2ViewModel2.a, iManagedDeviceV2ViewModel2);
                        }
                        IStatisticsHandler iStatisticsHandler = ga7.a;
                        ga7.a(dh8.WakeUpFromDeviceActionsPage);
                        return;
                    case 3:
                        rb3 rb3Var4 = dl4Var.s0;
                        if (rb3Var4 != null) {
                            qb3 qb3Var6 = ((rk4) rb3Var4).n;
                            if (qb3Var6 != null) {
                                IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel3 = ((p1) qb3Var6).n;
                                boolValueOf = Boolean.valueOf(IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_ShowActivateRemoteAccessEndpoint(iManagedDeviceV2ViewModel3.a, iManagedDeviceV2ViewModel3));
                            }
                            if (!im3.n(boolValueOf, Boolean.TRUE)) {
                                rb3 rb3Var5 = dl4Var.s0;
                                if (rb3Var5 == null || (qb3Var4 = ((rk4) rb3Var5).n) == null) {
                                    return;
                                }
                                ((xd0) qb3Var4).X0();
                                return;
                            }
                            x02 x02VarA = ik7.a();
                            gk7 gk7Var = new gk7();
                            fx3.o(1, "dialogId", x02VarA, gk7Var);
                            gk7Var.Z0 = x02VarA;
                            gk7Var.H0 = R.string.tv_activate_endpoint_text;
                            gk7Var.O0 = R.string.tv_cancel;
                            gk7Var.K0 = R.string.tv_activate_endpoint;
                            xk1 xk1Var = ct1.a;
                            if (xk1Var != null) {
                                xk1Var.L(gk7Var);
                            }
                            if (xk1Var != null) {
                                xk1.M(dl4Var.I0, new r02(gk7Var, p02.Positive));
                            }
                            dl4Var.z0.g(gk7Var);
                            return;
                        }
                        return;
                    case 4:
                        rb3 rb3Var6 = dl4Var.s0;
                        if (rb3Var6 != null) {
                            cl4 cl4Var = dl4Var.H0;
                            cl4Var.getClass();
                            qb3 qb3Var7 = ((rk4) rb3Var6).n;
                            if (qb3Var7 != null) {
                                cl4 cl4Var2 = cl4Var.m.z0;
                                IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel4 = ((p1) qb3Var7).n;
                                boolean zIManagedDeviceV2ViewModel_ShowChatTo = IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_ShowChatTo(iManagedDeviceV2ViewModel4.a, iManagedDeviceV2ViewModel4);
                                ye4 ye4Var = ye4.a;
                                if (zIManagedDeviceV2ViewModel_ShowChatTo) {
                                    IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                    if (iStartChatUIModelAndroidGetStartChatUIModelAndroid == null) {
                                        ye4Var.g("AbstractManagedDeviceV2MemberViewModel", "chatTo: No VM!");
                                        return;
                                    }
                                    ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_GetChatEndPoint(iManagedDeviceV2ViewModel4.a, iManagedDeviceV2ViewModel4));
                                    if (it1.c == null) {
                                        im3.e0("viewFactory");
                                        throw null;
                                    }
                                    chatConversationIDRequestPrivateRoomWithEndPoint.getClass();
                                    cl4Var2.x(ep3.h(chatConversationIDRequestPrivateRoomWithEndPoint));
                                    return;
                                }
                                ye4Var.b("AbstractManagedDeviceV2MemberViewModel", "Chat should not be visible");
                                x02 x02VarA2 = ik7.a();
                                gk7 gk7Var2 = new gk7();
                                fx3.o(1, "dialogId", x02VarA2, gk7Var2);
                                gk7Var2.Z0 = x02VarA2;
                                gk7Var2.H0 = R.string.tv_IDS_CHAT_NO_PREVIOUS_CONNECTIONS;
                                gk7Var2.O0 = R.string.tv_ok;
                                xk1 xk1Var2 = ct1.a;
                                if (xk1Var2 != null) {
                                    xk1Var2.L(gk7Var2);
                                }
                                cl4Var2.g(gk7Var2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        rb3 rb3Var7 = dl4Var.s0;
                        if (rb3Var7 != null) {
                            rk4 rk4Var = (rk4) rb3Var7;
                            if (((String) rk4Var.v.getValue()) == null || (qb3Var5 = rk4Var.n) == null) {
                                return;
                            }
                            xd0 xd0Var3 = (xd0) qb3Var5;
                            gu0 gu0VarN = e8.n(xd0Var3);
                            tk1 tk1Var = g22.a;
                            im3.R(gu0VarN, gk1.f901o, null, new wd0(xd0Var3, null, (byte) 1), 2);
                            return;
                        }
                        return;
                    default:
                        ShortcutManager shortcutManager2 = dl4Var.y0;
                        if (shortcutManager2 == null || !shortcutManager2.isRequestPinShortcutSupported()) {
                            return;
                        }
                        ShortcutManager shortcutManager3 = dl4Var.y0;
                        List<ShortcutInfo> pinnedShortcuts = shortcutManager3 != null ? shortcutManager3.getPinnedShortcuts() : null;
                        Integer numValueOf = pinnedShortcuts != null ? Integer.valueOf(pinnedShortcuts.size()) : null;
                        boolean z = false;
                        if (pinnedShortcuts != null) {
                            Iterator<ShortcutInfo> it = pinnedShortcuts.iterator();
                            while (it.hasNext()) {
                                String id = it.next().getId();
                                rb3 rb3Var8 = dl4Var.s0;
                                if (im3.n(id, (rb3Var8 == null || (nw4Var5 = ((rk4) rb3Var8).r) == null) ? null : (String) nw4Var5.getValue())) {
                                    Toast toastMakeText = Toast.makeText(dl4Var.r0(), R.string.tv_device_options_home_screen_shortcut_already_exists, 1);
                                    toastMakeText.getClass();
                                    toastMakeText.show();
                                    z = true;
                                }
                            }
                        }
                        if (numValueOf == null || z) {
                            return;
                        }
                        if (numValueOf.intValue() >= 5) {
                            x02 x02VarA3 = ik7.a();
                            gk7 gk7Var3 = new gk7();
                            fx3.o(1, "dialogId", x02VarA3, gk7Var3);
                            gk7Var3.Z0 = x02VarA3;
                            gk7Var3.H0 = R.string.tv_device_options_home_screen_shortcut_max_number_dialog_text;
                            gk7Var3.F0 = R.string.tv_device_options_home_screen_shortcut_max_number_dialog_title;
                            gk7Var3.O0 = R.string.tv_ok;
                            gk7.O0(gk7Var3, dl4Var.p0());
                            return;
                        }
                        Uri uri = Uri.parse("tvshortcut://openshortcut");
                        rb3 rb3Var9 = dl4Var.s0;
                        ShortcutInfo.Builder builder = new ShortcutInfo.Builder(dl4Var.p0(), (rb3Var9 == null || (nw4Var4 = ((rk4) rb3Var9).r) == null) ? null : (String) nw4Var4.getValue());
                        rb3 rb3Var10 = dl4Var.s0;
                        ShortcutInfo.Builder shortLabel = builder.setShortLabel(String.valueOf((rb3Var10 == null || (nw4Var3 = ((rk4) rb3Var10).q) == null) ? null : (String) nw4Var3.getValue()));
                        rb3 rb3Var11 = dl4Var.s0;
                        ShortcutInfo.Builder icon = shortLabel.setLongLabel(String.valueOf((rb3Var11 == null || (nw4Var2 = ((rk4) rb3Var11).q) == null) ? null : (String) nw4Var2.getValue())).setIcon(Icon.createWithResource(dl4Var.E(), R.drawable.home_screen_shortcut_device_logo));
                        Intent intentPutExtra = new Intent("android.intent.action.VIEW", uri).putExtra("IS_SHORTCUT", true);
                        rb3 rb3Var12 = dl4Var.s0;
                        if (rb3Var12 != null) {
                            LicenseViewModel licenseViewModel = ((rk4) rb3Var12).p;
                            strLicenseViewModel_GetAccountLoginName = LicenseViewModelSWIGJNI.LicenseViewModel_GetAccountLoginName(licenseViewModel.a, licenseViewModel);
                        } else {
                            strLicenseViewModel_GetAccountLoginName = null;
                        }
                        Intent intentPutExtra2 = intentPutExtra.putExtra("KEY_ACCOUNTNAME", strLicenseViewModel_GetAccountLoginName);
                        rb3 rb3Var13 = dl4Var.s0;
                        ShortcutInfo shortcutInfoBuild = icon.setIntent(intentPutExtra2.putExtra("MDV2_MANAGEMENT_ID", (rb3Var13 == null || (nw4Var = ((rk4) rb3Var13).v) == null) ? null : (String) nw4Var.getValue()).addFlags(67108864).addFlags(268435456)).build();
                        shortcutInfoBuild.getClass();
                        ShortcutManager shortcutManager4 = dl4Var.y0;
                        if (shortcutManager4 != null && (intentCreateShortcutResultIntent = shortcutManager4.createShortcutResultIntent(shortcutInfoBuild)) != null) {
                            broadcast = PendingIntent.getBroadcast(dl4Var.E(), 1, intentCreateShortcutResultIntent, 67108864);
                        }
                        if (broadcast == null || (shortcutManager = dl4Var.y0) == null) {
                            return;
                        }
                        shortcutManager.requestPinShortcut(shortcutInfoBuild, broadcast.getIntentSender());
                        return;
                }
            }
        };
        final byte b5 = 4;
        this.E0 = new View.OnClickListener(this) { // from class: o.zk4
            public final /* synthetic */ dl4 n;

            {
                this.n = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qb3 qb3Var;
                qb3 qb3Var2;
                qb3 qb3Var3;
                qb3 qb3Var4;
                qb3 qb3Var5;
                String strLicenseViewModel_GetAccountLoginName;
                ShortcutManager shortcutManager;
                Intent intentCreateShortcutResultIntent;
                nw4 nw4Var;
                nw4 nw4Var2;
                nw4 nw4Var3;
                nw4 nw4Var4;
                nw4 nw4Var5;
                byte b6 = b5;
                Boolean boolValueOf = null;
                broadcast = null;
                PendingIntent broadcast = null;
                dl4 dl4Var = this.n;
                switch (b6) {
                    case 0:
                        rb3 rb3Var = dl4Var.s0;
                        if (rb3Var == null || (qb3Var = ((rk4) rb3Var).n) == null) {
                            return;
                        }
                        ((xd0) qb3Var).W0();
                        return;
                    case 1:
                        rb3 rb3Var2 = dl4Var.s0;
                        if (rb3Var2 == null || (qb3Var2 = ((rk4) rb3Var2).n) == null) {
                            return;
                        }
                        xd0 xd0Var = (xd0) qb3Var2;
                        nc0 nc0Var = xd0Var.D;
                        IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel = xd0Var.C;
                        iManagedDeviceV2ViewModel.getClass();
                        DyngateID dyngateID = new DyngateID(IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_GetDyngateID(iManagedDeviceV2ViewModel.a, iManagedDeviceV2ViewModel), true);
                        nc0Var.getClass();
                        nc0.d(dyngateID);
                        return;
                    case 2:
                        rb3 rb3Var3 = dl4Var.s0;
                        if (rb3Var3 != null && (qb3Var3 = ((rk4) rb3Var3).n) != null) {
                            xd0 xd0Var2 = (xd0) qb3Var3;
                            nc0 nc0Var2 = xd0Var2.D;
                            IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel2 = xd0Var2.C;
                            nc0Var2.getClass();
                            iManagedDeviceV2ViewModel2.getClass();
                            IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_WakeOnLan(iManagedDeviceV2ViewModel2.a, iManagedDeviceV2ViewModel2);
                        }
                        IStatisticsHandler iStatisticsHandler = ga7.a;
                        ga7.a(dh8.WakeUpFromDeviceActionsPage);
                        return;
                    case 3:
                        rb3 rb3Var4 = dl4Var.s0;
                        if (rb3Var4 != null) {
                            qb3 qb3Var6 = ((rk4) rb3Var4).n;
                            if (qb3Var6 != null) {
                                IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel3 = ((p1) qb3Var6).n;
                                boolValueOf = Boolean.valueOf(IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_ShowActivateRemoteAccessEndpoint(iManagedDeviceV2ViewModel3.a, iManagedDeviceV2ViewModel3));
                            }
                            if (!im3.n(boolValueOf, Boolean.TRUE)) {
                                rb3 rb3Var5 = dl4Var.s0;
                                if (rb3Var5 == null || (qb3Var4 = ((rk4) rb3Var5).n) == null) {
                                    return;
                                }
                                ((xd0) qb3Var4).X0();
                                return;
                            }
                            x02 x02VarA = ik7.a();
                            gk7 gk7Var = new gk7();
                            fx3.o(1, "dialogId", x02VarA, gk7Var);
                            gk7Var.Z0 = x02VarA;
                            gk7Var.H0 = R.string.tv_activate_endpoint_text;
                            gk7Var.O0 = R.string.tv_cancel;
                            gk7Var.K0 = R.string.tv_activate_endpoint;
                            xk1 xk1Var = ct1.a;
                            if (xk1Var != null) {
                                xk1Var.L(gk7Var);
                            }
                            if (xk1Var != null) {
                                xk1.M(dl4Var.I0, new r02(gk7Var, p02.Positive));
                            }
                            dl4Var.z0.g(gk7Var);
                            return;
                        }
                        return;
                    case 4:
                        rb3 rb3Var6 = dl4Var.s0;
                        if (rb3Var6 != null) {
                            cl4 cl4Var = dl4Var.H0;
                            cl4Var.getClass();
                            qb3 qb3Var7 = ((rk4) rb3Var6).n;
                            if (qb3Var7 != null) {
                                cl4 cl4Var2 = cl4Var.m.z0;
                                IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel4 = ((p1) qb3Var7).n;
                                boolean zIManagedDeviceV2ViewModel_ShowChatTo = IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_ShowChatTo(iManagedDeviceV2ViewModel4.a, iManagedDeviceV2ViewModel4);
                                ye4 ye4Var = ye4.a;
                                if (zIManagedDeviceV2ViewModel_ShowChatTo) {
                                    IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                    if (iStartChatUIModelAndroidGetStartChatUIModelAndroid == null) {
                                        ye4Var.g("AbstractManagedDeviceV2MemberViewModel", "chatTo: No VM!");
                                        return;
                                    }
                                    ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_GetChatEndPoint(iManagedDeviceV2ViewModel4.a, iManagedDeviceV2ViewModel4));
                                    if (it1.c == null) {
                                        im3.e0("viewFactory");
                                        throw null;
                                    }
                                    chatConversationIDRequestPrivateRoomWithEndPoint.getClass();
                                    cl4Var2.x(ep3.h(chatConversationIDRequestPrivateRoomWithEndPoint));
                                    return;
                                }
                                ye4Var.b("AbstractManagedDeviceV2MemberViewModel", "Chat should not be visible");
                                x02 x02VarA2 = ik7.a();
                                gk7 gk7Var2 = new gk7();
                                fx3.o(1, "dialogId", x02VarA2, gk7Var2);
                                gk7Var2.Z0 = x02VarA2;
                                gk7Var2.H0 = R.string.tv_IDS_CHAT_NO_PREVIOUS_CONNECTIONS;
                                gk7Var2.O0 = R.string.tv_ok;
                                xk1 xk1Var2 = ct1.a;
                                if (xk1Var2 != null) {
                                    xk1Var2.L(gk7Var2);
                                }
                                cl4Var2.g(gk7Var2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        rb3 rb3Var7 = dl4Var.s0;
                        if (rb3Var7 != null) {
                            rk4 rk4Var = (rk4) rb3Var7;
                            if (((String) rk4Var.v.getValue()) == null || (qb3Var5 = rk4Var.n) == null) {
                                return;
                            }
                            xd0 xd0Var3 = (xd0) qb3Var5;
                            gu0 gu0VarN = e8.n(xd0Var3);
                            tk1 tk1Var = g22.a;
                            im3.R(gu0VarN, gk1.f901o, null, new wd0(xd0Var3, null, (byte) 1), 2);
                            return;
                        }
                        return;
                    default:
                        ShortcutManager shortcutManager2 = dl4Var.y0;
                        if (shortcutManager2 == null || !shortcutManager2.isRequestPinShortcutSupported()) {
                            return;
                        }
                        ShortcutManager shortcutManager3 = dl4Var.y0;
                        List<ShortcutInfo> pinnedShortcuts = shortcutManager3 != null ? shortcutManager3.getPinnedShortcuts() : null;
                        Integer numValueOf = pinnedShortcuts != null ? Integer.valueOf(pinnedShortcuts.size()) : null;
                        boolean z = false;
                        if (pinnedShortcuts != null) {
                            Iterator<ShortcutInfo> it = pinnedShortcuts.iterator();
                            while (it.hasNext()) {
                                String id = it.next().getId();
                                rb3 rb3Var8 = dl4Var.s0;
                                if (im3.n(id, (rb3Var8 == null || (nw4Var5 = ((rk4) rb3Var8).r) == null) ? null : (String) nw4Var5.getValue())) {
                                    Toast toastMakeText = Toast.makeText(dl4Var.r0(), R.string.tv_device_options_home_screen_shortcut_already_exists, 1);
                                    toastMakeText.getClass();
                                    toastMakeText.show();
                                    z = true;
                                }
                            }
                        }
                        if (numValueOf == null || z) {
                            return;
                        }
                        if (numValueOf.intValue() >= 5) {
                            x02 x02VarA3 = ik7.a();
                            gk7 gk7Var3 = new gk7();
                            fx3.o(1, "dialogId", x02VarA3, gk7Var3);
                            gk7Var3.Z0 = x02VarA3;
                            gk7Var3.H0 = R.string.tv_device_options_home_screen_shortcut_max_number_dialog_text;
                            gk7Var3.F0 = R.string.tv_device_options_home_screen_shortcut_max_number_dialog_title;
                            gk7Var3.O0 = R.string.tv_ok;
                            gk7.O0(gk7Var3, dl4Var.p0());
                            return;
                        }
                        Uri uri = Uri.parse("tvshortcut://openshortcut");
                        rb3 rb3Var9 = dl4Var.s0;
                        ShortcutInfo.Builder builder = new ShortcutInfo.Builder(dl4Var.p0(), (rb3Var9 == null || (nw4Var4 = ((rk4) rb3Var9).r) == null) ? null : (String) nw4Var4.getValue());
                        rb3 rb3Var10 = dl4Var.s0;
                        ShortcutInfo.Builder shortLabel = builder.setShortLabel(String.valueOf((rb3Var10 == null || (nw4Var3 = ((rk4) rb3Var10).q) == null) ? null : (String) nw4Var3.getValue()));
                        rb3 rb3Var11 = dl4Var.s0;
                        ShortcutInfo.Builder icon = shortLabel.setLongLabel(String.valueOf((rb3Var11 == null || (nw4Var2 = ((rk4) rb3Var11).q) == null) ? null : (String) nw4Var2.getValue())).setIcon(Icon.createWithResource(dl4Var.E(), R.drawable.home_screen_shortcut_device_logo));
                        Intent intentPutExtra = new Intent("android.intent.action.VIEW", uri).putExtra("IS_SHORTCUT", true);
                        rb3 rb3Var12 = dl4Var.s0;
                        if (rb3Var12 != null) {
                            LicenseViewModel licenseViewModel = ((rk4) rb3Var12).p;
                            strLicenseViewModel_GetAccountLoginName = LicenseViewModelSWIGJNI.LicenseViewModel_GetAccountLoginName(licenseViewModel.a, licenseViewModel);
                        } else {
                            strLicenseViewModel_GetAccountLoginName = null;
                        }
                        Intent intentPutExtra2 = intentPutExtra.putExtra("KEY_ACCOUNTNAME", strLicenseViewModel_GetAccountLoginName);
                        rb3 rb3Var13 = dl4Var.s0;
                        ShortcutInfo shortcutInfoBuild = icon.setIntent(intentPutExtra2.putExtra("MDV2_MANAGEMENT_ID", (rb3Var13 == null || (nw4Var = ((rk4) rb3Var13).v) == null) ? null : (String) nw4Var.getValue()).addFlags(67108864).addFlags(268435456)).build();
                        shortcutInfoBuild.getClass();
                        ShortcutManager shortcutManager4 = dl4Var.y0;
                        if (shortcutManager4 != null && (intentCreateShortcutResultIntent = shortcutManager4.createShortcutResultIntent(shortcutInfoBuild)) != null) {
                            broadcast = PendingIntent.getBroadcast(dl4Var.E(), 1, intentCreateShortcutResultIntent, 67108864);
                        }
                        if (broadcast == null || (shortcutManager = dl4Var.y0) == null) {
                            return;
                        }
                        shortcutManager.requestPinShortcut(shortcutInfoBuild, broadcast.getIntentSender());
                        return;
                }
            }
        };
        final byte b6 = 5;
        this.F0 = new View.OnClickListener(this) { // from class: o.zk4
            public final /* synthetic */ dl4 n;

            {
                this.n = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qb3 qb3Var;
                qb3 qb3Var2;
                qb3 qb3Var3;
                qb3 qb3Var4;
                qb3 qb3Var5;
                String strLicenseViewModel_GetAccountLoginName;
                ShortcutManager shortcutManager;
                Intent intentCreateShortcutResultIntent;
                nw4 nw4Var;
                nw4 nw4Var2;
                nw4 nw4Var3;
                nw4 nw4Var4;
                nw4 nw4Var5;
                byte b7 = b6;
                Boolean boolValueOf = null;
                broadcast = null;
                PendingIntent broadcast = null;
                dl4 dl4Var = this.n;
                switch (b7) {
                    case 0:
                        rb3 rb3Var = dl4Var.s0;
                        if (rb3Var == null || (qb3Var = ((rk4) rb3Var).n) == null) {
                            return;
                        }
                        ((xd0) qb3Var).W0();
                        return;
                    case 1:
                        rb3 rb3Var2 = dl4Var.s0;
                        if (rb3Var2 == null || (qb3Var2 = ((rk4) rb3Var2).n) == null) {
                            return;
                        }
                        xd0 xd0Var = (xd0) qb3Var2;
                        nc0 nc0Var = xd0Var.D;
                        IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel = xd0Var.C;
                        iManagedDeviceV2ViewModel.getClass();
                        DyngateID dyngateID = new DyngateID(IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_GetDyngateID(iManagedDeviceV2ViewModel.a, iManagedDeviceV2ViewModel), true);
                        nc0Var.getClass();
                        nc0.d(dyngateID);
                        return;
                    case 2:
                        rb3 rb3Var3 = dl4Var.s0;
                        if (rb3Var3 != null && (qb3Var3 = ((rk4) rb3Var3).n) != null) {
                            xd0 xd0Var2 = (xd0) qb3Var3;
                            nc0 nc0Var2 = xd0Var2.D;
                            IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel2 = xd0Var2.C;
                            nc0Var2.getClass();
                            iManagedDeviceV2ViewModel2.getClass();
                            IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_WakeOnLan(iManagedDeviceV2ViewModel2.a, iManagedDeviceV2ViewModel2);
                        }
                        IStatisticsHandler iStatisticsHandler = ga7.a;
                        ga7.a(dh8.WakeUpFromDeviceActionsPage);
                        return;
                    case 3:
                        rb3 rb3Var4 = dl4Var.s0;
                        if (rb3Var4 != null) {
                            qb3 qb3Var6 = ((rk4) rb3Var4).n;
                            if (qb3Var6 != null) {
                                IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel3 = ((p1) qb3Var6).n;
                                boolValueOf = Boolean.valueOf(IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_ShowActivateRemoteAccessEndpoint(iManagedDeviceV2ViewModel3.a, iManagedDeviceV2ViewModel3));
                            }
                            if (!im3.n(boolValueOf, Boolean.TRUE)) {
                                rb3 rb3Var5 = dl4Var.s0;
                                if (rb3Var5 == null || (qb3Var4 = ((rk4) rb3Var5).n) == null) {
                                    return;
                                }
                                ((xd0) qb3Var4).X0();
                                return;
                            }
                            x02 x02VarA = ik7.a();
                            gk7 gk7Var = new gk7();
                            fx3.o(1, "dialogId", x02VarA, gk7Var);
                            gk7Var.Z0 = x02VarA;
                            gk7Var.H0 = R.string.tv_activate_endpoint_text;
                            gk7Var.O0 = R.string.tv_cancel;
                            gk7Var.K0 = R.string.tv_activate_endpoint;
                            xk1 xk1Var = ct1.a;
                            if (xk1Var != null) {
                                xk1Var.L(gk7Var);
                            }
                            if (xk1Var != null) {
                                xk1.M(dl4Var.I0, new r02(gk7Var, p02.Positive));
                            }
                            dl4Var.z0.g(gk7Var);
                            return;
                        }
                        return;
                    case 4:
                        rb3 rb3Var6 = dl4Var.s0;
                        if (rb3Var6 != null) {
                            cl4 cl4Var = dl4Var.H0;
                            cl4Var.getClass();
                            qb3 qb3Var7 = ((rk4) rb3Var6).n;
                            if (qb3Var7 != null) {
                                cl4 cl4Var2 = cl4Var.m.z0;
                                IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel4 = ((p1) qb3Var7).n;
                                boolean zIManagedDeviceV2ViewModel_ShowChatTo = IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_ShowChatTo(iManagedDeviceV2ViewModel4.a, iManagedDeviceV2ViewModel4);
                                ye4 ye4Var = ye4.a;
                                if (zIManagedDeviceV2ViewModel_ShowChatTo) {
                                    IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                    if (iStartChatUIModelAndroidGetStartChatUIModelAndroid == null) {
                                        ye4Var.g("AbstractManagedDeviceV2MemberViewModel", "chatTo: No VM!");
                                        return;
                                    }
                                    ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_GetChatEndPoint(iManagedDeviceV2ViewModel4.a, iManagedDeviceV2ViewModel4));
                                    if (it1.c == null) {
                                        im3.e0("viewFactory");
                                        throw null;
                                    }
                                    chatConversationIDRequestPrivateRoomWithEndPoint.getClass();
                                    cl4Var2.x(ep3.h(chatConversationIDRequestPrivateRoomWithEndPoint));
                                    return;
                                }
                                ye4Var.b("AbstractManagedDeviceV2MemberViewModel", "Chat should not be visible");
                                x02 x02VarA2 = ik7.a();
                                gk7 gk7Var2 = new gk7();
                                fx3.o(1, "dialogId", x02VarA2, gk7Var2);
                                gk7Var2.Z0 = x02VarA2;
                                gk7Var2.H0 = R.string.tv_IDS_CHAT_NO_PREVIOUS_CONNECTIONS;
                                gk7Var2.O0 = R.string.tv_ok;
                                xk1 xk1Var2 = ct1.a;
                                if (xk1Var2 != null) {
                                    xk1Var2.L(gk7Var2);
                                }
                                cl4Var2.g(gk7Var2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        rb3 rb3Var7 = dl4Var.s0;
                        if (rb3Var7 != null) {
                            rk4 rk4Var = (rk4) rb3Var7;
                            if (((String) rk4Var.v.getValue()) == null || (qb3Var5 = rk4Var.n) == null) {
                                return;
                            }
                            xd0 xd0Var3 = (xd0) qb3Var5;
                            gu0 gu0VarN = e8.n(xd0Var3);
                            tk1 tk1Var = g22.a;
                            im3.R(gu0VarN, gk1.f901o, null, new wd0(xd0Var3, null, (byte) 1), 2);
                            return;
                        }
                        return;
                    default:
                        ShortcutManager shortcutManager2 = dl4Var.y0;
                        if (shortcutManager2 == null || !shortcutManager2.isRequestPinShortcutSupported()) {
                            return;
                        }
                        ShortcutManager shortcutManager3 = dl4Var.y0;
                        List<ShortcutInfo> pinnedShortcuts = shortcutManager3 != null ? shortcutManager3.getPinnedShortcuts() : null;
                        Integer numValueOf = pinnedShortcuts != null ? Integer.valueOf(pinnedShortcuts.size()) : null;
                        boolean z = false;
                        if (pinnedShortcuts != null) {
                            Iterator<ShortcutInfo> it = pinnedShortcuts.iterator();
                            while (it.hasNext()) {
                                String id = it.next().getId();
                                rb3 rb3Var8 = dl4Var.s0;
                                if (im3.n(id, (rb3Var8 == null || (nw4Var5 = ((rk4) rb3Var8).r) == null) ? null : (String) nw4Var5.getValue())) {
                                    Toast toastMakeText = Toast.makeText(dl4Var.r0(), R.string.tv_device_options_home_screen_shortcut_already_exists, 1);
                                    toastMakeText.getClass();
                                    toastMakeText.show();
                                    z = true;
                                }
                            }
                        }
                        if (numValueOf == null || z) {
                            return;
                        }
                        if (numValueOf.intValue() >= 5) {
                            x02 x02VarA3 = ik7.a();
                            gk7 gk7Var3 = new gk7();
                            fx3.o(1, "dialogId", x02VarA3, gk7Var3);
                            gk7Var3.Z0 = x02VarA3;
                            gk7Var3.H0 = R.string.tv_device_options_home_screen_shortcut_max_number_dialog_text;
                            gk7Var3.F0 = R.string.tv_device_options_home_screen_shortcut_max_number_dialog_title;
                            gk7Var3.O0 = R.string.tv_ok;
                            gk7.O0(gk7Var3, dl4Var.p0());
                            return;
                        }
                        Uri uri = Uri.parse("tvshortcut://openshortcut");
                        rb3 rb3Var9 = dl4Var.s0;
                        ShortcutInfo.Builder builder = new ShortcutInfo.Builder(dl4Var.p0(), (rb3Var9 == null || (nw4Var4 = ((rk4) rb3Var9).r) == null) ? null : (String) nw4Var4.getValue());
                        rb3 rb3Var10 = dl4Var.s0;
                        ShortcutInfo.Builder shortLabel = builder.setShortLabel(String.valueOf((rb3Var10 == null || (nw4Var3 = ((rk4) rb3Var10).q) == null) ? null : (String) nw4Var3.getValue()));
                        rb3 rb3Var11 = dl4Var.s0;
                        ShortcutInfo.Builder icon = shortLabel.setLongLabel(String.valueOf((rb3Var11 == null || (nw4Var2 = ((rk4) rb3Var11).q) == null) ? null : (String) nw4Var2.getValue())).setIcon(Icon.createWithResource(dl4Var.E(), R.drawable.home_screen_shortcut_device_logo));
                        Intent intentPutExtra = new Intent("android.intent.action.VIEW", uri).putExtra("IS_SHORTCUT", true);
                        rb3 rb3Var12 = dl4Var.s0;
                        if (rb3Var12 != null) {
                            LicenseViewModel licenseViewModel = ((rk4) rb3Var12).p;
                            strLicenseViewModel_GetAccountLoginName = LicenseViewModelSWIGJNI.LicenseViewModel_GetAccountLoginName(licenseViewModel.a, licenseViewModel);
                        } else {
                            strLicenseViewModel_GetAccountLoginName = null;
                        }
                        Intent intentPutExtra2 = intentPutExtra.putExtra("KEY_ACCOUNTNAME", strLicenseViewModel_GetAccountLoginName);
                        rb3 rb3Var13 = dl4Var.s0;
                        ShortcutInfo shortcutInfoBuild = icon.setIntent(intentPutExtra2.putExtra("MDV2_MANAGEMENT_ID", (rb3Var13 == null || (nw4Var = ((rk4) rb3Var13).v) == null) ? null : (String) nw4Var.getValue()).addFlags(67108864).addFlags(268435456)).build();
                        shortcutInfoBuild.getClass();
                        ShortcutManager shortcutManager4 = dl4Var.y0;
                        if (shortcutManager4 != null && (intentCreateShortcutResultIntent = shortcutManager4.createShortcutResultIntent(shortcutInfoBuild)) != null) {
                            broadcast = PendingIntent.getBroadcast(dl4Var.E(), 1, intentCreateShortcutResultIntent, 67108864);
                        }
                        if (broadcast == null || (shortcutManager = dl4Var.y0) == null) {
                            return;
                        }
                        shortcutManager.requestPinShortcut(shortcutInfoBuild, broadcast.getIntentSender());
                        return;
                }
            }
        };
        final byte b7 = 6;
        this.G0 = new View.OnClickListener(this) { // from class: o.zk4
            public final /* synthetic */ dl4 n;

            {
                this.n = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qb3 qb3Var;
                qb3 qb3Var2;
                qb3 qb3Var3;
                qb3 qb3Var4;
                qb3 qb3Var5;
                String strLicenseViewModel_GetAccountLoginName;
                ShortcutManager shortcutManager;
                Intent intentCreateShortcutResultIntent;
                nw4 nw4Var;
                nw4 nw4Var2;
                nw4 nw4Var3;
                nw4 nw4Var4;
                nw4 nw4Var5;
                byte b8 = b7;
                Boolean boolValueOf = null;
                broadcast = null;
                PendingIntent broadcast = null;
                dl4 dl4Var = this.n;
                switch (b8) {
                    case 0:
                        rb3 rb3Var = dl4Var.s0;
                        if (rb3Var == null || (qb3Var = ((rk4) rb3Var).n) == null) {
                            return;
                        }
                        ((xd0) qb3Var).W0();
                        return;
                    case 1:
                        rb3 rb3Var2 = dl4Var.s0;
                        if (rb3Var2 == null || (qb3Var2 = ((rk4) rb3Var2).n) == null) {
                            return;
                        }
                        xd0 xd0Var = (xd0) qb3Var2;
                        nc0 nc0Var = xd0Var.D;
                        IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel = xd0Var.C;
                        iManagedDeviceV2ViewModel.getClass();
                        DyngateID dyngateID = new DyngateID(IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_GetDyngateID(iManagedDeviceV2ViewModel.a, iManagedDeviceV2ViewModel), true);
                        nc0Var.getClass();
                        nc0.d(dyngateID);
                        return;
                    case 2:
                        rb3 rb3Var3 = dl4Var.s0;
                        if (rb3Var3 != null && (qb3Var3 = ((rk4) rb3Var3).n) != null) {
                            xd0 xd0Var2 = (xd0) qb3Var3;
                            nc0 nc0Var2 = xd0Var2.D;
                            IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel2 = xd0Var2.C;
                            nc0Var2.getClass();
                            iManagedDeviceV2ViewModel2.getClass();
                            IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_WakeOnLan(iManagedDeviceV2ViewModel2.a, iManagedDeviceV2ViewModel2);
                        }
                        IStatisticsHandler iStatisticsHandler = ga7.a;
                        ga7.a(dh8.WakeUpFromDeviceActionsPage);
                        return;
                    case 3:
                        rb3 rb3Var4 = dl4Var.s0;
                        if (rb3Var4 != null) {
                            qb3 qb3Var6 = ((rk4) rb3Var4).n;
                            if (qb3Var6 != null) {
                                IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel3 = ((p1) qb3Var6).n;
                                boolValueOf = Boolean.valueOf(IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_ShowActivateRemoteAccessEndpoint(iManagedDeviceV2ViewModel3.a, iManagedDeviceV2ViewModel3));
                            }
                            if (!im3.n(boolValueOf, Boolean.TRUE)) {
                                rb3 rb3Var5 = dl4Var.s0;
                                if (rb3Var5 == null || (qb3Var4 = ((rk4) rb3Var5).n) == null) {
                                    return;
                                }
                                ((xd0) qb3Var4).X0();
                                return;
                            }
                            x02 x02VarA = ik7.a();
                            gk7 gk7Var = new gk7();
                            fx3.o(1, "dialogId", x02VarA, gk7Var);
                            gk7Var.Z0 = x02VarA;
                            gk7Var.H0 = R.string.tv_activate_endpoint_text;
                            gk7Var.O0 = R.string.tv_cancel;
                            gk7Var.K0 = R.string.tv_activate_endpoint;
                            xk1 xk1Var = ct1.a;
                            if (xk1Var != null) {
                                xk1Var.L(gk7Var);
                            }
                            if (xk1Var != null) {
                                xk1.M(dl4Var.I0, new r02(gk7Var, p02.Positive));
                            }
                            dl4Var.z0.g(gk7Var);
                            return;
                        }
                        return;
                    case 4:
                        rb3 rb3Var6 = dl4Var.s0;
                        if (rb3Var6 != null) {
                            cl4 cl4Var = dl4Var.H0;
                            cl4Var.getClass();
                            qb3 qb3Var7 = ((rk4) rb3Var6).n;
                            if (qb3Var7 != null) {
                                cl4 cl4Var2 = cl4Var.m.z0;
                                IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel4 = ((p1) qb3Var7).n;
                                boolean zIManagedDeviceV2ViewModel_ShowChatTo = IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_ShowChatTo(iManagedDeviceV2ViewModel4.a, iManagedDeviceV2ViewModel4);
                                ye4 ye4Var = ye4.a;
                                if (zIManagedDeviceV2ViewModel_ShowChatTo) {
                                    IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                    if (iStartChatUIModelAndroidGetStartChatUIModelAndroid == null) {
                                        ye4Var.g("AbstractManagedDeviceV2MemberViewModel", "chatTo: No VM!");
                                        return;
                                    }
                                    ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_GetChatEndPoint(iManagedDeviceV2ViewModel4.a, iManagedDeviceV2ViewModel4));
                                    if (it1.c == null) {
                                        im3.e0("viewFactory");
                                        throw null;
                                    }
                                    chatConversationIDRequestPrivateRoomWithEndPoint.getClass();
                                    cl4Var2.x(ep3.h(chatConversationIDRequestPrivateRoomWithEndPoint));
                                    return;
                                }
                                ye4Var.b("AbstractManagedDeviceV2MemberViewModel", "Chat should not be visible");
                                x02 x02VarA2 = ik7.a();
                                gk7 gk7Var2 = new gk7();
                                fx3.o(1, "dialogId", x02VarA2, gk7Var2);
                                gk7Var2.Z0 = x02VarA2;
                                gk7Var2.H0 = R.string.tv_IDS_CHAT_NO_PREVIOUS_CONNECTIONS;
                                gk7Var2.O0 = R.string.tv_ok;
                                xk1 xk1Var2 = ct1.a;
                                if (xk1Var2 != null) {
                                    xk1Var2.L(gk7Var2);
                                }
                                cl4Var2.g(gk7Var2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        rb3 rb3Var7 = dl4Var.s0;
                        if (rb3Var7 != null) {
                            rk4 rk4Var = (rk4) rb3Var7;
                            if (((String) rk4Var.v.getValue()) == null || (qb3Var5 = rk4Var.n) == null) {
                                return;
                            }
                            xd0 xd0Var3 = (xd0) qb3Var5;
                            gu0 gu0VarN = e8.n(xd0Var3);
                            tk1 tk1Var = g22.a;
                            im3.R(gu0VarN, gk1.f901o, null, new wd0(xd0Var3, null, (byte) 1), 2);
                            return;
                        }
                        return;
                    default:
                        ShortcutManager shortcutManager2 = dl4Var.y0;
                        if (shortcutManager2 == null || !shortcutManager2.isRequestPinShortcutSupported()) {
                            return;
                        }
                        ShortcutManager shortcutManager3 = dl4Var.y0;
                        List<ShortcutInfo> pinnedShortcuts = shortcutManager3 != null ? shortcutManager3.getPinnedShortcuts() : null;
                        Integer numValueOf = pinnedShortcuts != null ? Integer.valueOf(pinnedShortcuts.size()) : null;
                        boolean z = false;
                        if (pinnedShortcuts != null) {
                            Iterator<ShortcutInfo> it = pinnedShortcuts.iterator();
                            while (it.hasNext()) {
                                String id = it.next().getId();
                                rb3 rb3Var8 = dl4Var.s0;
                                if (im3.n(id, (rb3Var8 == null || (nw4Var5 = ((rk4) rb3Var8).r) == null) ? null : (String) nw4Var5.getValue())) {
                                    Toast toastMakeText = Toast.makeText(dl4Var.r0(), R.string.tv_device_options_home_screen_shortcut_already_exists, 1);
                                    toastMakeText.getClass();
                                    toastMakeText.show();
                                    z = true;
                                }
                            }
                        }
                        if (numValueOf == null || z) {
                            return;
                        }
                        if (numValueOf.intValue() >= 5) {
                            x02 x02VarA3 = ik7.a();
                            gk7 gk7Var3 = new gk7();
                            fx3.o(1, "dialogId", x02VarA3, gk7Var3);
                            gk7Var3.Z0 = x02VarA3;
                            gk7Var3.H0 = R.string.tv_device_options_home_screen_shortcut_max_number_dialog_text;
                            gk7Var3.F0 = R.string.tv_device_options_home_screen_shortcut_max_number_dialog_title;
                            gk7Var3.O0 = R.string.tv_ok;
                            gk7.O0(gk7Var3, dl4Var.p0());
                            return;
                        }
                        Uri uri = Uri.parse("tvshortcut://openshortcut");
                        rb3 rb3Var9 = dl4Var.s0;
                        ShortcutInfo.Builder builder = new ShortcutInfo.Builder(dl4Var.p0(), (rb3Var9 == null || (nw4Var4 = ((rk4) rb3Var9).r) == null) ? null : (String) nw4Var4.getValue());
                        rb3 rb3Var10 = dl4Var.s0;
                        ShortcutInfo.Builder shortLabel = builder.setShortLabel(String.valueOf((rb3Var10 == null || (nw4Var3 = ((rk4) rb3Var10).q) == null) ? null : (String) nw4Var3.getValue()));
                        rb3 rb3Var11 = dl4Var.s0;
                        ShortcutInfo.Builder icon = shortLabel.setLongLabel(String.valueOf((rb3Var11 == null || (nw4Var2 = ((rk4) rb3Var11).q) == null) ? null : (String) nw4Var2.getValue())).setIcon(Icon.createWithResource(dl4Var.E(), R.drawable.home_screen_shortcut_device_logo));
                        Intent intentPutExtra = new Intent("android.intent.action.VIEW", uri).putExtra("IS_SHORTCUT", true);
                        rb3 rb3Var12 = dl4Var.s0;
                        if (rb3Var12 != null) {
                            LicenseViewModel licenseViewModel = ((rk4) rb3Var12).p;
                            strLicenseViewModel_GetAccountLoginName = LicenseViewModelSWIGJNI.LicenseViewModel_GetAccountLoginName(licenseViewModel.a, licenseViewModel);
                        } else {
                            strLicenseViewModel_GetAccountLoginName = null;
                        }
                        Intent intentPutExtra2 = intentPutExtra.putExtra("KEY_ACCOUNTNAME", strLicenseViewModel_GetAccountLoginName);
                        rb3 rb3Var13 = dl4Var.s0;
                        ShortcutInfo shortcutInfoBuild = icon.setIntent(intentPutExtra2.putExtra("MDV2_MANAGEMENT_ID", (rb3Var13 == null || (nw4Var = ((rk4) rb3Var13).v) == null) ? null : (String) nw4Var.getValue()).addFlags(67108864).addFlags(268435456)).build();
                        shortcutInfoBuild.getClass();
                        ShortcutManager shortcutManager4 = dl4Var.y0;
                        if (shortcutManager4 != null && (intentCreateShortcutResultIntent = shortcutManager4.createShortcutResultIntent(shortcutInfoBuild)) != null) {
                            broadcast = PendingIntent.getBroadcast(dl4Var.E(), 1, intentCreateShortcutResultIntent, 67108864);
                        }
                        if (broadcast == null || (shortcutManager = dl4Var.y0) == null) {
                            return;
                        }
                        shortcutManager.requestPinShortcut(shortcutInfoBuild, broadcast.getIntentSender());
                        return;
                }
            }
        };
    }

    @Override // o.zb0
    public final boolean G0() {
        return true;
    }

    public final void H0() {
        LinearLayout linearLayout = this.t0;
        yk3 yk3Var = new yk3(0, linearLayout != null ? linearLayout.getChildCount() : 0, 1);
        ArrayList arrayList = new ArrayList(mv0.Z(yk3Var, 10));
        Iterator it = yk3Var.iterator();
        while (true) {
            View childAt = null;
            if (!it.hasNext()) {
                break;
            }
            int iNextInt = ((xk3) it).nextInt();
            LinearLayout linearLayout2 = this.t0;
            if (linearLayout2 != null) {
                childAt = linearLayout2.getChildAt(iNextInt);
            }
            arrayList.add(childAt);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof DeviceOptionsActionButton) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (((DeviceOptionsActionButton) obj2).getVisibility() == 0) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(mv0.Z(arrayList3, 10));
        int i = 0;
        for (Object obj3 : arrayList3) {
            int i2 = i + 1;
            if (i < 0) {
                qf0.U();
                throw null;
            }
            ((DeviceOptionsActionButton) obj3).setPrimary(i == 0);
            arrayList4.add(f88.a);
            i = i2;
        }
    }

    public final void I0(String str) {
        x02 x02VarA = ik7.a();
        gk7 gk7Var = new gk7();
        fx3.o(1, "dialogId", x02VarA, gk7Var);
        gk7Var.Z0 = x02VarA;
        gk7Var.L0(str);
        gk7Var.O0 = R.string.tv_ok;
        xk1 xk1Var = ct1.a;
        if (xk1Var != null) {
            xk1Var.L(gk7Var);
        }
        this.z0.g(gk7Var);
    }

    public final void J0(int i) {
        rb3 rb3Var = this.s0;
        String strJ = J(i, rb3Var != null ? ((rk4) rb3Var).u : null);
        strJ.getClass();
        I0(strJ);
    }

    @Override // o.fv2, o.ut2
    public final void X(Bundle bundle) {
        yl4 yl4Var;
        String string;
        Bundle bundle2;
        super.X(bundle);
        if (bundle == null || (yl4Var = (yl4) pm8.w(bundle, "memberType", yl4.class)) == null) {
            Bundle bundle3 = this.r;
            yl4Var = bundle3 != null ? (yl4) pm8.w(bundle3, "memberType", yl4.class) : null;
            if (yl4Var == null) {
                yl4Var = yl4.ManagedDeviceV2;
            }
        }
        this.v0 = yl4Var;
        String string2 = bundle != null ? bundle.getString("GroupID") : null;
        String str = "";
        if (string2 == null && ((bundle2 = this.r) == null || (string2 = bundle2.getString("GroupID")) == null)) {
            string2 = "";
        }
        this.w0 = string2;
        String string3 = bundle != null ? bundle.getString("ManagedDeviceV2Id") : null;
        if (string3 == null) {
            Bundle bundle4 = this.r;
            if (bundle4 != null && (string = bundle4.getString("ManagedDeviceV2Id")) != null) {
                str = string;
            }
        } else {
            str = string3;
        }
        this.x0 = str;
    }

    @Override // o.ut2
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        nw4 nw4Var;
        nw4 nw4Var2;
        nw4 nw4Var3;
        nw4 nw4Var4;
        nw4 nw4Var5;
        nw4 nw4Var6;
        nw4 nw4Var7;
        nw4 nw4Var8;
        nw4 nw4Var9;
        nw4 nw4Var10;
        nw4 nw4Var11;
        layoutInflater.getClass();
        final du2 du2VarA = du2.a(layoutInflater, viewGroup);
        this.t0 = du2VarA.b;
        this.u0 = du2VarA.e;
        c36 c36Var = zu1.c;
        if (c36Var == null) {
            hk0.g("Required value was null.");
            return null;
        }
        String str = this.x0;
        String str2 = this.w0;
        str2.getClass();
        eb ebVar = new eb(str, this, c36Var, str2);
        final byte b = 2;
        dl5 dl5Var = new dl5(ebVar, (byte) 2);
        ve8 g0 = getG0();
        bf1 bf1VarK = h57.k(this);
        pn5 pn5VarT = ua5.t(bf1VarK, g0, dl5Var, bf1VarK);
        wt3 wt3VarB = w86.a.b(rk4.class);
        String strC = wt3VarB.c();
        if (strC == null) {
            hk0.g("Local and anonymous classes can not be ViewModels");
            return null;
        }
        this.s0 = (rb3) pn5VarT.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
        if (it1.c == null) {
            im3.e0("viewFactory");
            throw null;
        }
        p0().v(this, L());
        du2VarA.f.setOnClickListener(this.A0);
        du2VarA.h.setOnClickListener(this.B0);
        du2VarA.j.setOnClickListener(this.D0);
        du2VarA.f655o.setOnClickListener(this.F0);
        du2VarA.s.setOnClickListener(this.C0);
        du2VarA.d.setOnClickListener(this.E0);
        du2VarA.r.setOnClickListener(this.G0);
        Context contextE = E();
        if (contextE != null) {
            this.y0 = (ShortcutManager) contextE.getSystemService(ShortcutManager.class);
        }
        rb3 rb3Var = this.s0;
        final byte b2 = 4;
        if (rb3Var != null && (nw4Var11 = ((rk4) rb3Var).q) != null) {
            nw4Var11.observe(L(), new b7(new cv1(du2VarA, (byte) 4), (byte) 18));
        }
        rb3 rb3Var2 = this.s0;
        final byte b3 = 5;
        if (rb3Var2 != null && (nw4Var10 = ((rk4) rb3Var2).C) != null) {
            nw4Var10.observe(L(), new b7(new cv1(du2VarA, (byte) 5), (byte) 18));
        }
        rb3 rb3Var3 = this.s0;
        if (rb3Var3 != null && (nw4Var9 = ((rk4) rb3Var3).r) != null) {
            nw4Var9.observe(L(), new b7(new cv1(du2VarA, (byte) 6), (byte) 18));
        }
        rb3 rb3Var4 = this.s0;
        if (rb3Var4 != null && (nw4Var8 = ((rk4) rb3Var4).s) != null) {
            nw4Var8.observe(L(), new b7(new cv1(du2VarA, (byte) 7), (byte) 18));
        }
        du2VarA.c.setPlaceHolder(R.drawable.device_icon);
        rb3 rb3Var5 = this.s0;
        final byte b4 = 1;
        if (rb3Var5 != null && (nw4Var7 = ((rk4) rb3Var5).w) != null) {
            nw4Var7.observe(L(), new b7(new Function1() { // from class: o.yk4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    byte b5 = b4;
                    f88 f88Var = f88.a;
                    dl4 dl4Var = this;
                    du2 du2Var = du2VarA;
                    Boolean bool = (Boolean) obj;
                    switch (b5) {
                        case 0:
                            int i = dl4.K0;
                            DeviceOptionsActionButton deviceOptionsActionButton = du2Var.s;
                            bool.getClass();
                            deviceOptionsActionButton.setVisibility(ka0.v(bool.booleanValue()));
                            dl4Var.H0();
                            break;
                        case 1:
                            int i2 = dl4.K0;
                            DeviceOptionsActionButton deviceOptionsActionButton2 = du2Var.f;
                            bool.getClass();
                            deviceOptionsActionButton2.setVisibility(ka0.v(bool.booleanValue()));
                            du2Var.g.setVisibility(ka0.v(bool.booleanValue()));
                            dl4Var.H0();
                            break;
                        case 2:
                            int i3 = dl4.K0;
                            DeviceOptionsActionButton deviceOptionsActionButton3 = du2Var.h;
                            bool.getClass();
                            deviceOptionsActionButton3.setVisibility(ka0.v(bool.booleanValue()));
                            du2Var.i.setVisibility(ka0.v(bool.booleanValue()));
                            dl4Var.H0();
                            break;
                        case 3:
                            int i4 = dl4.K0;
                            DeviceOptionsActionButton deviceOptionsActionButton4 = du2Var.j;
                            bool.getClass();
                            deviceOptionsActionButton4.setVisibility(ka0.v(bool.booleanValue()));
                            dl4Var.H0();
                            break;
                        case 4:
                            int i5 = dl4.K0;
                            DeviceOptionsActionButton deviceOptionsActionButton5 = du2Var.f655o;
                            bool.getClass();
                            deviceOptionsActionButton5.setVisibility(ka0.v(bool.booleanValue()));
                            dl4Var.H0();
                            break;
                        default:
                            int i6 = dl4.K0;
                            DeviceOptionsActionButton deviceOptionsActionButton6 = du2Var.d;
                            bool.getClass();
                            deviceOptionsActionButton6.setVisibility(ka0.v(bool.booleanValue()));
                            dl4Var.H0();
                            break;
                    }
                    return f88Var;
                }
            }, (byte) 18));
        }
        rb3 rb3Var6 = this.s0;
        if (rb3Var6 != null && (nw4Var6 = ((rk4) rb3Var6).x) != null) {
            nw4Var6.observe(L(), new b7(new Function1() { // from class: o.yk4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    byte b5 = b;
                    f88 f88Var = f88.a;
                    dl4 dl4Var = this;
                    du2 du2Var = du2VarA;
                    Boolean bool = (Boolean) obj;
                    switch (b5) {
                        case 0:
                            int i = dl4.K0;
                            DeviceOptionsActionButton deviceOptionsActionButton = du2Var.s;
                            bool.getClass();
                            deviceOptionsActionButton.setVisibility(ka0.v(bool.booleanValue()));
                            dl4Var.H0();
                            break;
                        case 1:
                            int i2 = dl4.K0;
                            DeviceOptionsActionButton deviceOptionsActionButton2 = du2Var.f;
                            bool.getClass();
                            deviceOptionsActionButton2.setVisibility(ka0.v(bool.booleanValue()));
                            du2Var.g.setVisibility(ka0.v(bool.booleanValue()));
                            dl4Var.H0();
                            break;
                        case 2:
                            int i3 = dl4.K0;
                            DeviceOptionsActionButton deviceOptionsActionButton3 = du2Var.h;
                            bool.getClass();
                            deviceOptionsActionButton3.setVisibility(ka0.v(bool.booleanValue()));
                            du2Var.i.setVisibility(ka0.v(bool.booleanValue()));
                            dl4Var.H0();
                            break;
                        case 3:
                            int i4 = dl4.K0;
                            DeviceOptionsActionButton deviceOptionsActionButton4 = du2Var.j;
                            bool.getClass();
                            deviceOptionsActionButton4.setVisibility(ka0.v(bool.booleanValue()));
                            dl4Var.H0();
                            break;
                        case 4:
                            int i5 = dl4.K0;
                            DeviceOptionsActionButton deviceOptionsActionButton5 = du2Var.f655o;
                            bool.getClass();
                            deviceOptionsActionButton5.setVisibility(ka0.v(bool.booleanValue()));
                            dl4Var.H0();
                            break;
                        default:
                            int i6 = dl4.K0;
                            DeviceOptionsActionButton deviceOptionsActionButton6 = du2Var.d;
                            bool.getClass();
                            deviceOptionsActionButton6.setVisibility(ka0.v(bool.booleanValue()));
                            dl4Var.H0();
                            break;
                    }
                    return f88Var;
                }
            }, (byte) 18));
        }
        rb3 rb3Var7 = this.s0;
        if (rb3Var7 != null && (nw4Var5 = ((rk4) rb3Var7).y) != null) {
            final byte b5 = 3;
            nw4Var5.observe(L(), new b7(new Function1() { // from class: o.yk4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    byte b6 = b5;
                    f88 f88Var = f88.a;
                    dl4 dl4Var = this;
                    du2 du2Var = du2VarA;
                    Boolean bool = (Boolean) obj;
                    switch (b6) {
                        case 0:
                            int i = dl4.K0;
                            DeviceOptionsActionButton deviceOptionsActionButton = du2Var.s;
                            bool.getClass();
                            deviceOptionsActionButton.setVisibility(ka0.v(bool.booleanValue()));
                            dl4Var.H0();
                            break;
                        case 1:
                            int i2 = dl4.K0;
                            DeviceOptionsActionButton deviceOptionsActionButton2 = du2Var.f;
                            bool.getClass();
                            deviceOptionsActionButton2.setVisibility(ka0.v(bool.booleanValue()));
                            du2Var.g.setVisibility(ka0.v(bool.booleanValue()));
                            dl4Var.H0();
                            break;
                        case 2:
                            int i3 = dl4.K0;
                            DeviceOptionsActionButton deviceOptionsActionButton3 = du2Var.h;
                            bool.getClass();
                            deviceOptionsActionButton3.setVisibility(ka0.v(bool.booleanValue()));
                            du2Var.i.setVisibility(ka0.v(bool.booleanValue()));
                            dl4Var.H0();
                            break;
                        case 3:
                            int i4 = dl4.K0;
                            DeviceOptionsActionButton deviceOptionsActionButton4 = du2Var.j;
                            bool.getClass();
                            deviceOptionsActionButton4.setVisibility(ka0.v(bool.booleanValue()));
                            dl4Var.H0();
                            break;
                        case 4:
                            int i5 = dl4.K0;
                            DeviceOptionsActionButton deviceOptionsActionButton5 = du2Var.f655o;
                            bool.getClass();
                            deviceOptionsActionButton5.setVisibility(ka0.v(bool.booleanValue()));
                            dl4Var.H0();
                            break;
                        default:
                            int i6 = dl4.K0;
                            DeviceOptionsActionButton deviceOptionsActionButton6 = du2Var.d;
                            bool.getClass();
                            deviceOptionsActionButton6.setVisibility(ka0.v(bool.booleanValue()));
                            dl4Var.H0();
                            break;
                    }
                    return f88Var;
                }
            }, (byte) 18));
        }
        rb3 rb3Var8 = this.s0;
        if (rb3Var8 != null && (nw4Var4 = ((rk4) rb3Var8).z) != null) {
            nw4Var4.observe(L(), new b7(new Function1() { // from class: o.yk4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    byte b6 = b2;
                    f88 f88Var = f88.a;
                    dl4 dl4Var = this;
                    du2 du2Var = du2VarA;
                    Boolean bool = (Boolean) obj;
                    switch (b6) {
                        case 0:
                            int i = dl4.K0;
                            DeviceOptionsActionButton deviceOptionsActionButton = du2Var.s;
                            bool.getClass();
                            deviceOptionsActionButton.setVisibility(ka0.v(bool.booleanValue()));
                            dl4Var.H0();
                            break;
                        case 1:
                            int i2 = dl4.K0;
                            DeviceOptionsActionButton deviceOptionsActionButton2 = du2Var.f;
                            bool.getClass();
                            deviceOptionsActionButton2.setVisibility(ka0.v(bool.booleanValue()));
                            du2Var.g.setVisibility(ka0.v(bool.booleanValue()));
                            dl4Var.H0();
                            break;
                        case 2:
                            int i3 = dl4.K0;
                            DeviceOptionsActionButton deviceOptionsActionButton3 = du2Var.h;
                            bool.getClass();
                            deviceOptionsActionButton3.setVisibility(ka0.v(bool.booleanValue()));
                            du2Var.i.setVisibility(ka0.v(bool.booleanValue()));
                            dl4Var.H0();
                            break;
                        case 3:
                            int i4 = dl4.K0;
                            DeviceOptionsActionButton deviceOptionsActionButton4 = du2Var.j;
                            bool.getClass();
                            deviceOptionsActionButton4.setVisibility(ka0.v(bool.booleanValue()));
                            dl4Var.H0();
                            break;
                        case 4:
                            int i5 = dl4.K0;
                            DeviceOptionsActionButton deviceOptionsActionButton5 = du2Var.f655o;
                            bool.getClass();
                            deviceOptionsActionButton5.setVisibility(ka0.v(bool.booleanValue()));
                            dl4Var.H0();
                            break;
                        default:
                            int i6 = dl4.K0;
                            DeviceOptionsActionButton deviceOptionsActionButton6 = du2Var.d;
                            bool.getClass();
                            deviceOptionsActionButton6.setVisibility(ka0.v(bool.booleanValue()));
                            dl4Var.H0();
                            break;
                    }
                    return f88Var;
                }
            }, (byte) 18));
        }
        rb3 rb3Var9 = this.s0;
        if (rb3Var9 != null && (nw4Var3 = ((rk4) rb3Var9).A) != null) {
            nw4Var3.observe(L(), new b7(new Function1() { // from class: o.yk4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    byte b6 = b3;
                    f88 f88Var = f88.a;
                    dl4 dl4Var = this;
                    du2 du2Var = du2VarA;
                    Boolean bool = (Boolean) obj;
                    switch (b6) {
                        case 0:
                            int i = dl4.K0;
                            DeviceOptionsActionButton deviceOptionsActionButton = du2Var.s;
                            bool.getClass();
                            deviceOptionsActionButton.setVisibility(ka0.v(bool.booleanValue()));
                            dl4Var.H0();
                            break;
                        case 1:
                            int i2 = dl4.K0;
                            DeviceOptionsActionButton deviceOptionsActionButton2 = du2Var.f;
                            bool.getClass();
                            deviceOptionsActionButton2.setVisibility(ka0.v(bool.booleanValue()));
                            du2Var.g.setVisibility(ka0.v(bool.booleanValue()));
                            dl4Var.H0();
                            break;
                        case 2:
                            int i3 = dl4.K0;
                            DeviceOptionsActionButton deviceOptionsActionButton3 = du2Var.h;
                            bool.getClass();
                            deviceOptionsActionButton3.setVisibility(ka0.v(bool.booleanValue()));
                            du2Var.i.setVisibility(ka0.v(bool.booleanValue()));
                            dl4Var.H0();
                            break;
                        case 3:
                            int i4 = dl4.K0;
                            DeviceOptionsActionButton deviceOptionsActionButton4 = du2Var.j;
                            bool.getClass();
                            deviceOptionsActionButton4.setVisibility(ka0.v(bool.booleanValue()));
                            dl4Var.H0();
                            break;
                        case 4:
                            int i5 = dl4.K0;
                            DeviceOptionsActionButton deviceOptionsActionButton5 = du2Var.f655o;
                            bool.getClass();
                            deviceOptionsActionButton5.setVisibility(ka0.v(bool.booleanValue()));
                            dl4Var.H0();
                            break;
                        default:
                            int i6 = dl4.K0;
                            DeviceOptionsActionButton deviceOptionsActionButton6 = du2Var.d;
                            bool.getClass();
                            deviceOptionsActionButton6.setVisibility(ka0.v(bool.booleanValue()));
                            dl4Var.H0();
                            break;
                    }
                    return f88Var;
                }
            }, (byte) 18));
        }
        rb3 rb3Var10 = this.s0;
        if (rb3Var10 != null && (nw4Var2 = ((rk4) rb3Var10).B) != null) {
            final byte b6 = 0;
            nw4Var2.observe(L(), new b7(new Function1() { // from class: o.yk4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    byte b7 = b6;
                    f88 f88Var = f88.a;
                    dl4 dl4Var = this;
                    du2 du2Var = du2VarA;
                    Boolean bool = (Boolean) obj;
                    switch (b7) {
                        case 0:
                            int i = dl4.K0;
                            DeviceOptionsActionButton deviceOptionsActionButton = du2Var.s;
                            bool.getClass();
                            deviceOptionsActionButton.setVisibility(ka0.v(bool.booleanValue()));
                            dl4Var.H0();
                            break;
                        case 1:
                            int i2 = dl4.K0;
                            DeviceOptionsActionButton deviceOptionsActionButton2 = du2Var.f;
                            bool.getClass();
                            deviceOptionsActionButton2.setVisibility(ka0.v(bool.booleanValue()));
                            du2Var.g.setVisibility(ka0.v(bool.booleanValue()));
                            dl4Var.H0();
                            break;
                        case 2:
                            int i3 = dl4.K0;
                            DeviceOptionsActionButton deviceOptionsActionButton3 = du2Var.h;
                            bool.getClass();
                            deviceOptionsActionButton3.setVisibility(ka0.v(bool.booleanValue()));
                            du2Var.i.setVisibility(ka0.v(bool.booleanValue()));
                            dl4Var.H0();
                            break;
                        case 3:
                            int i4 = dl4.K0;
                            DeviceOptionsActionButton deviceOptionsActionButton4 = du2Var.j;
                            bool.getClass();
                            deviceOptionsActionButton4.setVisibility(ka0.v(bool.booleanValue()));
                            dl4Var.H0();
                            break;
                        case 4:
                            int i5 = dl4.K0;
                            DeviceOptionsActionButton deviceOptionsActionButton5 = du2Var.f655o;
                            bool.getClass();
                            deviceOptionsActionButton5.setVisibility(ka0.v(bool.booleanValue()));
                            dl4Var.H0();
                            break;
                        default:
                            int i6 = dl4.K0;
                            DeviceOptionsActionButton deviceOptionsActionButton6 = du2Var.d;
                            bool.getClass();
                            deviceOptionsActionButton6.setVisibility(ka0.v(bool.booleanValue()));
                            dl4Var.H0();
                            break;
                    }
                    return f88Var;
                }
            }, (byte) 18));
        }
        rb3 rb3Var11 = this.s0;
        if (rb3Var11 != null && (nw4Var = ((rk4) rb3Var11).t) != null) {
            nw4Var.observe(L(), new b7(new al4(this, (byte) 1), (byte) 18));
        }
        xt2 xt2VarC = C();
        if (xt2VarC != null) {
            yl4 yl4Var = this.v0;
            if (yl4Var == null) {
                im3.e0("type");
                throw null;
            }
            if (bl4.a[yl4Var.ordinal()] == 1) {
                xt2VarC.setTitle(I(R.string.tv_device_options_title));
            }
        }
        NestedScrollView nestedScrollView = du2VarA.a;
        nestedScrollView.getClass();
        return nestedScrollView;
    }

    @Override // o.fv2, o.ut2
    public final void h0(Bundle bundle) {
        E0(bundle);
        bundle.putString("ManagedDeviceV2Id", this.w0);
        yl4 yl4Var = this.v0;
        if (yl4Var != null) {
            bundle.putSerializable("memberType", yl4Var);
        } else {
            im3.e0("type");
            throw null;
        }
    }

    @Override // o.ut2
    public final void i0() {
        ManagedDevicesV2MemberId managedDevicesV2MemberId;
        bb5 bb5Var;
        this.S = true;
        if (this.s0 != null) {
            String str = this.x0;
            str.getClass();
            managedDevicesV2MemberId = new ManagedDevicesV2MemberId(yl4.ManagedDeviceV2, str);
        } else {
            managedDevicesV2MemberId = null;
        }
        if ((managedDevicesV2MemberId != null ? yl4.a(ManagedDevicesV2MemberSWIGJNI.ManagedDevicesV2MemberId_getType(managedDevicesV2MemberId.a, managedDevicesV2MemberId)) : null) == yl4.ManagedDeviceV2 || (bb5Var = this.r0) == null) {
            return;
        }
        bb5Var.G0();
    }

    @Override // o.hq4
    public final boolean j(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.device_options_settings_button) {
            return false;
        }
        if (it1.c != null) {
            y0(new Intent(E(), (Class<?>) SettingsActivity.class));
            return true;
        }
        im3.e0("viewFactory");
        throw null;
    }

    @Override // o.hq4
    public final void u(Menu menu, MenuInflater menuInflater) {
        menu.getClass();
        menuInflater.getClass();
        menuInflater.inflate(R.menu.managed_device_v2_options_menu, menu);
    }
}
