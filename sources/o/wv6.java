package o;

import android.content.IntentFilter;
import android.content.RestrictionsManager;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.helper.DeviceInfoHelper;
import com.teamviewer.teamviewerlib.settings.Settings;
import com.teamviewer.teamviewerlib.statistics.AndroidAppConfigStatistics;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class wv6 {
    public final fi7 a;
    public final Settings b;
    public final SharedPreferences c;
    public final RestrictionsManager d;
    public String e;
    public String f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f2451o;
    public boolean p;

    public wv6(fi7 fi7Var, Settings settings, yl7 yl7Var) {
        SharedPreferences sharedPreferences = h57.a;
        if (sharedPreferences == null) {
            im3.e0("sharedPreferences");
            throw null;
        }
        this.a = fi7Var;
        this.b = settings;
        this.c = sharedPreferences;
        Object systemService = fi7Var.getSystemService("restrictions");
        systemService.getClass();
        this.d = (RestrictionsManager) systemService;
        this.p = true;
        ns nsVar = new ns(this, (byte) 6);
        a();
        ye4.a("SettingsRestrictionsManager", "Registering listener for custom configuration changes.");
        fi7Var.registerReceiver(nsVar, new IntentFilter("android.intent.action.APPLICATION_RESTRICTIONS_CHANGED"));
    }

    /* JADX WARN: Code duplicated, block: B:147:0x032b  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        hc1 hc1Var;
        String string;
        boolean z;
        String strReplaceAll;
        String str;
        String strReplaceAll2;
        String str2;
        String strReplaceAll3;
        String str3;
        String string2;
        String strReplaceAll4;
        String strReplaceAll5;
        String strReplaceAll6;
        String strReplaceAll7;
        ye4.a("SettingsRestrictionsManager", "Retrieving custom configurations.");
        Bundle applicationRestrictions = this.d.getApplicationRestrictions();
        boolean zContainsKey = applicationRestrictions.containsKey("keepAliveServerName");
        ye4 ye4Var = ye4.a;
        if (zContainsKey) {
            String string3 = applicationRestrictions.getString("keepAliveServerName");
            if (string3 == null) {
                strReplaceAll7 = null;
            } else if (string3.length() == 0) {
                strReplaceAll7 = "";
            } else {
                String string4 = ub7.x0(string3).toString();
                Pattern patternCompile = Pattern.compile("\\s");
                patternCompile.getClass();
                string4.getClass();
                strReplaceAll7 = patternCompile.matcher(string4).replaceAll("");
                strReplaceAll7.getClass();
            }
            if (strReplaceAll7 != null && strReplaceAll7.length() != 0) {
                ye4Var.g("SettingsRestrictionsManager", "Use keep alive server: ".concat(strReplaceAll7));
                Settings.h(rt0.P_CUSTOM_KEEPALIVESERVER, strReplaceAll7);
                this.g = true;
            }
        }
        if (applicationRestrictions.containsKey("whitelistAccounts")) {
            String string5 = applicationRestrictions.getString("whitelistAccounts");
            if (string5 == null) {
                strReplaceAll6 = null;
            } else if (string5.length() == 0) {
                strReplaceAll6 = "";
            } else {
                String string6 = ub7.x0(string5).toString();
                Pattern patternCompile2 = Pattern.compile("\\s");
                patternCompile2.getClass();
                string6.getClass();
                strReplaceAll6 = patternCompile2.matcher(string6).replaceAll("");
                strReplaceAll6.getClass();
            }
            if (strReplaceAll6 != null && strReplaceAll6.length() != 0) {
                int[] iArrO0 = strReplaceAll6.length() == 0 ? new int[0] : lv0.O0(bq6.l0(bq6.k0(new fx(ub7.n0(strReplaceAll6, new String[]{";"}, 6), (byte) 1), new at4((byte) 10))));
                ye4Var.g("SettingsRestrictionsManager", "Using allow list accounts");
                Settings.i(rt0.P_SECURITY_WHITELIST_BUDDY_ACCOUNT_ID, iArrO0);
                this.h = true;
            }
        }
        if (applicationRestrictions.containsKey("whitelistCompanies")) {
            String string7 = applicationRestrictions.getString("whitelistCompanies");
            if (string7 == null) {
                strReplaceAll5 = null;
            } else if (string7.length() == 0) {
                strReplaceAll5 = "";
            } else {
                String string8 = ub7.x0(string7).toString();
                Pattern patternCompile3 = Pattern.compile("\\s");
                patternCompile3.getClass();
                string8.getClass();
                strReplaceAll5 = patternCompile3.matcher(string8).replaceAll("");
                strReplaceAll5.getClass();
            }
            if (strReplaceAll5 != null && strReplaceAll5.length() != 0) {
                int[] iArrO1 = strReplaceAll5.length() == 0 ? new int[0] : lv0.O0(bq6.l0(bq6.k0(new fx(ub7.n0(strReplaceAll5, new String[]{";"}, 6), (byte) 1), new at4((byte) 10))));
                ye4Var.g("SettingsRestrictionsManager", "Using allow list companies");
                Settings.i(rt0.P_SECURITY_WHITELIST_COMPANY_ID, iArrO1);
                this.i = true;
            }
        }
        if (applicationRestrictions.containsKey("partnerListApiToken") && (string2 = applicationRestrictions.getString("partnerListApiToken")) != null && string2.length() != 0) {
            ye4Var.g("SettingsRestrictionsManager", "API token is found");
            if (string2.length() == 0) {
                strReplaceAll4 = "";
            } else {
                String string9 = ub7.x0(string2).toString();
                Pattern patternCompile4 = Pattern.compile("\\s");
                patternCompile4.getClass();
                string9.getClass();
                strReplaceAll4 = patternCompile4.matcher(string9).replaceAll("");
                strReplaceAll4.getClass();
            }
            this.e = strReplaceAll4;
            this.j = true;
        }
        boolean zContainsKey2 = applicationRestrictions.containsKey("partnerListDeviceName");
        SharedPreferences sharedPreferences = this.c;
        if (zContainsKey2) {
            String string10 = applicationRestrictions.getString("partnerListDeviceName");
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.getClass();
            if (!im3.n(sharedPreferences.getString("RESTRICTION_DEVICE_ALIAS", null), !(string10 == null || string10.length() == 0) ? string10 : null)) {
                editorEdit.putBoolean("KEY_RESTRICTION_DEVICE_REASSIGN_REQUIRED", true);
            }
            if (string10 == null || string10.length() == 0) {
                editorEdit.remove("RESTRICTION_DEVICE_ALIAS").commit();
                ye4.a("SettingsRestrictionsManager", "Custom device name not found, using default device name");
            } else {
                editorEdit.putString("RESTRICTION_DEVICE_ALIAS", string10).commit();
                ye4Var.g("SettingsRestrictionsManager", "Custom device name is found : " + string10);
                this.f = string10;
                this.l = true;
            }
        }
        boolean zContainsKey3 = applicationRestrictions.containsKey("partnerListGroupId");
        Settings settings = this.b;
        if (zContainsKey3) {
            String string11 = applicationRestrictions.getString("partnerListGroupId");
            if (string11 == null) {
                strReplaceAll3 = null;
            } else if (string11.length() == 0) {
                strReplaceAll3 = "";
            } else {
                String string12 = ub7.x0(string11).toString();
                Pattern patternCompile5 = Pattern.compile("\\s");
                patternCompile5.getClass();
                string12.getClass();
                strReplaceAll3 = patternCompile5.matcher(string12).replaceAll("");
                strReplaceAll3.getClass();
            }
            if (strReplaceAll3 == null || strReplaceAll3.length() == 0) {
                hc1Var = null;
            } else if (this.j) {
                String str4 = this.e;
                if (str4 == null) {
                    im3.e0("apiToken");
                    throw null;
                }
                String strK = this.f;
                str4.getClass();
                yc4 yc4Var = new yc4();
                yc4Var.m = strReplaceAll3;
                yc4Var.n = str4;
                String strA = DeviceInfoHelper.a();
                String str5 = Build.MODEL;
                str5.getClass();
                fi7 fi7Var = this.a;
                String strB = DeviceInfoHelper.b(fi7Var);
                String str6 = "unknown".equals(strB) ? null : strB;
                String string13 = fi7Var.getString(R.string.tv_custom_settings_restrictions_assignment_description, strA, str5, strB);
                string13.getClass();
                yc4Var.f2598o = string13;
                if (strK == null) {
                    String[] strArr = {strA, str5, str6};
                    StringBuilder sb = new StringBuilder();
                    boolean z2 = false;
                    for (int i = 0; i < 3; i++) {
                        String str7 = strArr[i];
                        if (str7 != null && str7.length() != 0) {
                            if (z2) {
                                sb.append('_');
                            }
                            sb.append(str7);
                            z2 = true;
                        }
                    }
                    String string14 = sb.toString();
                    if (n37.b) {
                        str3 = "QuickSupport";
                    } else if (n37.c) {
                        str3 = "Host";
                    } else if (n37.a) {
                        str3 = "RemoteControl";
                    } else if (n37.d) {
                        str3 = "Pilot";
                    } else {
                        str3 = n37.e ? "PilotLite" : "Undefined";
                    }
                    strK = to7.k(string14, " (", str3, ")");
                }
                yc4Var.p = strK;
                ye4.a("AddToGroup", "Initializing manager");
                yc4Var.q = new zb(yc4Var, (byte) 0);
                ye4.a("AddToGroup", "Registering listener and adding the device the specified group");
                settings.g((zb) yc4Var.q);
                if (Settings.e().IsValid()) {
                    tk1 tk1Var = g22.a;
                    hc1Var = null;
                    im3.R(hm3.c(gk1.f901o), null, null, new ac(yc4Var, hc1Var, (byte) 0), 3);
                } else {
                    hc1Var = null;
                }
                ye4Var.g("SettingsRestrictionsManager", "Assigning device to partner list");
                this.k = true;
            } else {
                hc1Var = null;
                ye4.c("SettingsRestrictionsManager", "Restriction was configured without API token!");
            }
        } else {
            hc1Var = null;
        }
        if (applicationRestrictions.containsKey("sessionRequestConfigurationID")) {
            String string15 = applicationRestrictions.getString("sessionRequestConfigurationID");
            if (string15 == null) {
                str2 = hc1Var;
            } else if (string15.length() == 0) {
                str2 = "";
            } else {
                String string16 = ub7.x0(string15).toString();
                Pattern patternCompile6 = Pattern.compile("\\s");
                patternCompile6.getClass();
                string16.getClass();
                strReplaceAll2 = patternCompile6.matcher(string16).replaceAll("");
                strReplaceAll2.getClass();
            }
            if (str2 != 0) {
                str2 = strReplaceAll2;
                ye4Var.g("SettingsRestrictionsManager", "Using session request configuration id: ".concat(str2));
                Settings.h(rt0.P_SESSION_REQUEST_CONFIGURATION_ID, str2);
                this.m = str2.length() > 0;
            }
        }
        str2 = strReplaceAll2;
        if (applicationRestrictions.containsKey("customModuleConfigId")) {
            String string17 = applicationRestrictions.getString("customModuleConfigId");
            if (string17 == null) {
                str = hc1Var;
            } else if (string17.length() == 0) {
                str = "";
            } else {
                String string18 = ub7.x0(string17).toString();
                Pattern patternCompile7 = Pattern.compile("\\s");
                patternCompile7.getClass();
                string18.getClass();
                strReplaceAll = patternCompile7.matcher(string18).replaceAll("");
                strReplaceAll.getClass();
            }
            if (str != 0) {
                str = strReplaceAll;
                if (str.length() != 0) {
                    Pattern patternCompile8 = Pattern.compile("^[a-zA-Z0-9]{7}+$");
                    patternCompile8.getClass();
                    if (patternCompile8.matcher(str).matches()) {
                        ye4Var.g("SettingsRestrictionsManager", "Using custom module config id: ".concat(str));
                        Settings.h(rt0.P_CUSTOM_MODULE_CONFIG_ID, str);
                        this.n = true;
                    }
                }
            }
        }
        str = strReplaceAll;
        if (applicationRestrictions.containsKey("conditionalAccessServers")) {
            String string19 = applicationRestrictions.getString("conditionalAccessServers");
            String strM = string19 == null ? hc1Var : o67.m(string19);
            rt0 rt0Var = rt0.P_GENERAL_DIRECTLAN;
            rt0 rt0Var2 = rt0.P_GENERAL_LAN_ONLY;
            gv6 gv6Var = gv6.MACHINE;
            if (strM == 0 || strM.length() == 0) {
                Settings.k(gv6Var, rt0Var2, false);
                Settings.k(gv6Var, rt0Var, false);
            } else {
                String[] strArrK = o67.k(strM);
                strArrK.getClass();
                if (cx.B0("127.0.0.1", strArrK)) {
                    ye4Var.g("SettingsRestrictionsManager", "Using Direct LAN mode");
                    z = true;
                    Settings.k(gv6Var, rt0Var2, true);
                    Settings.k(gv6Var, rt0Var, true);
                } else {
                    z = true;
                    ye4Var.g("SettingsRestrictionsManager", "Using Conditional Access list");
                    Settings.l(strArrK);
                    Settings.k(gv6Var, rt0Var2, false);
                    Settings.k(gv6Var, rt0Var, false);
                }
                this.f2451o = z;
            }
        }
        if (applicationRestrictions.containsKey("enableSessionFeaturesConfigId") && (string = applicationRestrictions.getString("enableSessionFeaturesConfigId")) != null && string.length() != 0) {
            String string20 = ub7.x0(string).toString();
            Pattern patternCompile9 = Pattern.compile("\\s");
            patternCompile9.getClass();
            string20.getClass();
            patternCompile9.matcher(string20).replaceAll("").getClass();
        }
        if (applicationRestrictions.containsKey("allowAssignmentRemoval")) {
            this.p = applicationRestrictions.getBoolean("allowAssignmentRemoval");
            SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
            editorEdit2.getClass();
            editorEdit2.putBoolean("KEY_RESTRICTION_ALLOW_ASSIGNMENT_REMOVAL", this.p);
            editorEdit2.apply();
        }
        if (applicationRestrictions.containsKey("preferUniversalAddon")) {
            boolean z3 = applicationRestrictions.getBoolean("preferUniversalAddon");
            ye4.a("SettingsRestrictionsManager", "Prefer Universal Add-On: " + z3);
            SharedPreferences.Editor editorEdit3 = sharedPreferences.edit();
            editorEdit3.getClass();
            editorEdit3.putBoolean("KEY_RESTRICTION_PREFER_UNIVERSAL_ADDON", z3);
            editorEdit3.apply();
        }
        if (applicationRestrictions.containsKey("byocConfigurationJson")) {
            String string21 = applicationRestrictions.getString("byocConfigurationJson");
            if (string21 == null || ub7.b0(string21)) {
                ye4.a("SettingsRestrictionsManager", "BYOC configuration not found in managed app config");
            } else {
                kh.k(settings, string21);
                ye4.a("SettingsRestrictionsManager", "Applying BYOC configuration from managed app config");
            }
        }
        AndroidAppConfigStatistics.a.a(this.f2451o, this.g, this.l, this.j, this.k, this.h, this.i, this.m, this.n, this.p);
    }
}
