package o;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.view.View;
import android.widget.Toast;
import androidx.lifecycle.LiveData;
import com.teamviewer.remotecontrollib.swig.IDeviceOptionsViewModel;
import com.teamviewer.remotecontrollib.swig.IDeviceOptionsViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.LicenseViewModel;
import com.teamviewer.remotecontrollib.swig.LicenseViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberListElementViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberListElementViewModelSWIGJNI;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class av1 implements View.OnClickListener {
    public final /* synthetic */ byte m;
    public final /* synthetic */ fv1 n;

    public /* synthetic */ av1(fv1 fv1Var, byte b) {
        this.m = b;
        this.n = fv1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String strLicenseViewModel_GetAccountLoginName;
        Intent intentCreateShortcutResultIntent;
        Long lP;
        LiveData liveData;
        LiveData liveData2;
        LiveData liveData3;
        LiveData liveData4;
        byte b = this.m;
        boolean z = false;
        fv1 fv1Var = this.n;
        switch (b) {
            case 0:
                va3 va3Var = fv1Var.s0;
                if (va3Var != null) {
                    ev1 ev1Var = fv1Var.H0;
                    ev1Var.getClass();
                    ((iv1) va3Var).f1105o.X0(ev1Var);
                }
                break;
            case 1:
                va3 va3Var2 = fv1Var.s0;
                if (va3Var2 != null) {
                    ev1 ev1Var2 = fv1Var.I0;
                    ev1Var2.getClass();
                    ((iv1) va3Var2).f1105o.Y0(ev1Var2);
                }
                break;
            case 2:
                va3 va3Var3 = fv1Var.s0;
                if (va3Var3 != null) {
                    GroupMemberListElementViewModel groupMemberListElementViewModel = ((iv1) va3Var3).f1105o.n;
                    if (!GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_ShowActivateRemoteAccessEndpoint(groupMemberListElementViewModel.a, groupMemberListElementViewModel)) {
                        va3 va3Var4 = fv1Var.s0;
                        if (va3Var4 != null) {
                            ((iv1) va3Var4).f1105o.Z0();
                        }
                    } else {
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
                            xk1.M(fv1Var.J0, new r02(gk7Var, p02.Positive));
                        }
                        fv1Var.z0.g(gk7Var);
                    }
                }
                break;
            case 3:
                va3 va3Var5 = fv1Var.s0;
                if (va3Var5 != null) {
                    ev1 ev1Var3 = fv1Var.L0;
                    ev1Var3.getClass();
                    ((iv1) va3Var5).f1105o.W0(ev1Var3);
                }
                break;
            case 4:
                va3 va3Var6 = fv1Var.s0;
                if (va3Var6 != null) {
                    ev1 ev1Var4 = fv1Var.K0;
                    ev1Var4.getClass();
                    ((iv1) va3Var6).f1105o.e1(ev1Var4);
                }
                break;
            case 5:
                va3 va3Var7 = fv1Var.s0;
                if (va3Var7 != null) {
                    GroupMemberListElementViewModel groupMemberListElementViewModel2 = ((iv1) va3Var7).f1105o.n;
                    GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_WakeOnLan(groupMemberListElementViewModel2.a, groupMemberListElementViewModel2);
                }
                IStatisticsHandler iStatisticsHandler = ga7.a;
                ga7.a(dh8.WakeUpFromDeviceActionsPage);
                break;
            case 6:
                va3 va3Var8 = fv1Var.s0;
                if (va3Var8 != null) {
                    IDeviceOptionsViewModel iDeviceOptionsViewModel = ((iv1) va3Var8).n;
                    IDeviceOptionsViewModelSWIGJNI.IDeviceOptionsViewModel_ReportEvent(iDeviceOptionsViewModel.a, iDeviceOptionsViewModel, 1);
                }
                ShortcutManager shortcutManager = fv1Var.y0;
                if (shortcutManager != null && shortcutManager.isRequestPinShortcutSupported()) {
                    ShortcutManager shortcutManager2 = fv1Var.y0;
                    List<ShortcutInfo> pinnedShortcuts = shortcutManager2 != null ? shortcutManager2.getPinnedShortcuts() : null;
                    Integer numValueOf = pinnedShortcuts != null ? Integer.valueOf(pinnedShortcuts.size()) : null;
                    va3 va3Var9 = fv1Var.s0;
                    if (va3Var9 != null) {
                        LicenseViewModel licenseViewModel = ((iv1) va3Var9).s;
                        strLicenseViewModel_GetAccountLoginName = LicenseViewModelSWIGJNI.LicenseViewModel_GetAccountLoginName(licenseViewModel.a, licenseViewModel);
                    } else {
                        strLicenseViewModel_GetAccountLoginName = null;
                    }
                    if (pinnedShortcuts != null) {
                        Iterator<ShortcutInfo> it = pinnedShortcuts.iterator();
                        while (it.hasNext()) {
                            String id = it.next().getId();
                            va3 va3Var10 = fv1Var.s0;
                            if (im3.n(id, (va3Var10 == null || (liveData4 = ((iv1) va3Var10).v) == null) ? null : (String) liveData4.getValue())) {
                                Toast toastMakeText = Toast.makeText(fv1Var.r0(), R.string.tv_device_options_home_screen_shortcut_already_exists, 1);
                                toastMakeText.getClass();
                                toastMakeText.show();
                                z = true;
                            }
                        }
                    }
                    if (numValueOf != null && !z) {
                        if (numValueOf.intValue() >= 5) {
                            x02 x02VarA2 = ik7.a();
                            gk7 gk7Var2 = new gk7();
                            fx3.o(1, "dialogId", x02VarA2, gk7Var2);
                            gk7Var2.Z0 = x02VarA2;
                            gk7Var2.H0 = R.string.tv_device_options_home_screen_shortcut_max_number_dialog_text;
                            gk7Var2.F0 = R.string.tv_device_options_home_screen_shortcut_max_number_dialog_title;
                            gk7Var2.O0 = R.string.tv_ok;
                            gk7.O0(gk7Var2, fv1Var.p0());
                        } else {
                            Uri uri = Uri.parse("tvshortcut://openshortcut");
                            va3 va3Var11 = fv1Var.s0;
                            String str = (va3Var11 == null || (liveData3 = ((iv1) va3Var11).v) == null) ? null : (String) liveData3.getValue();
                            ShortcutInfo.Builder builder = new ShortcutInfo.Builder(fv1Var.p0(), str);
                            va3 va3Var12 = fv1Var.s0;
                            ShortcutInfo.Builder shortLabel = builder.setShortLabel(String.valueOf((va3Var12 == null || (liveData2 = ((iv1) va3Var12).t) == null) ? null : (String) liveData2.getValue()));
                            va3 va3Var13 = fv1Var.s0;
                            ShortcutInfo.Builder icon = shortLabel.setLongLabel(String.valueOf((va3Var13 == null || (liveData = ((iv1) va3Var13).t) == null) ? null : (String) liveData.getValue())).setIcon(Icon.createWithResource(fv1Var.E(), R.drawable.home_screen_shortcut_device_logo));
                            Intent intentPutExtra = new Intent("android.intent.action.VIEW", uri).putExtra("IS_SHORTCUT", true).putExtra("MEMBER_ID", fv1Var.w0).putExtra("KEY_ACCOUNTNAME", strLicenseViewModel_GetAccountLoginName);
                            if (str != null && (lP = bc7.P(str)) != null) {
                                intentPutExtra.putExtra("SHORTCUT_DYNGATE_ID", lP.longValue());
                            }
                            ShortcutInfo shortcutInfoBuild = icon.setIntent(intentPutExtra.addFlags(67108864).addFlags(268435456)).build();
                            shortcutInfoBuild.getClass();
                            ShortcutManager shortcutManager3 = fv1Var.y0;
                            PendingIntent broadcast = (shortcutManager3 == null || (intentCreateShortcutResultIntent = shortcutManager3.createShortcutResultIntent(shortcutInfoBuild)) == null) ? null : PendingIntent.getBroadcast(fv1Var.E(), 1, intentCreateShortcutResultIntent, 67108864);
                            ShortcutManager shortcutManager4 = fv1Var.y0;
                            if (shortcutManager4 != null) {
                                shortcutManager4.requestPinShortcut(shortcutInfoBuild, broadcast != null ? broadcast.getIntentSender() : null);
                            }
                        }
                        break;
                    }
                }
                break;
            default:
                va3 va3Var14 = fv1Var.s0;
                if (va3Var14 != null) {
                    IDeviceOptionsViewModel iDeviceOptionsViewModel2 = ((iv1) va3Var14).n;
                    IDeviceOptionsViewModelSWIGJNI.IDeviceOptionsViewModel_ReportEvent(iDeviceOptionsViewModel2.a, iDeviceOptionsViewModel2, 0);
                }
                va3 va3Var15 = fv1Var.s0;
                if (va3Var15 != null) {
                    ev1 ev1Var5 = fv1Var.N0;
                    iv1 iv1Var = (iv1) va3Var15;
                    ev1Var5.getClass();
                    iv1Var.f1105o.d1(iv1Var.q, ev1Var5);
                }
                break;
        }
    }
}
