package o;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.remotecontrollib.swig.ISessionToolbarViewModel;
import com.teamviewer.remotecontrollib.swig.ISessionToolbarViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewmodellib.swig.IQRCodeMDV2AssignmentViewModelClient;
import com.teamviewer.remotecontrolviewmodellib.swig.IQRCodeMDV2AssignmentViewModelClientSWIGJNI;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.settings.Settings;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import com.teamviewer.teamviewerlib.swig.tvsessionprotocol.ParticipantIdentifier;
import com.teamviewer.teamviewerlib.swig.tvstream.KnownStreams;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ql1 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1842o;

    public /* synthetic */ ql1(Object obj, Object obj2, byte b) {
        this.m = b;
        this.n = obj;
        this.f1842o = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r5v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r6v10, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v17 */
    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        Object value;
        y33 y33Var;
        long jA;
        String[] strArrNames;
        p83[] p83VarArr = null;
        switch (this.m) {
            case 0:
                ((mp7) this.n).d.invoke((rp7) this.f1842o);
                return f88.a;
            case 1:
                fx1 fx1Var = (fx1) this.n;
                ((px4) this.f1842o).setValue(null);
                fx1Var.f1(null);
                return f88.a;
            case 2:
                ((Function1) this.n).invoke((l33) this.f1842o);
                return f88.a;
            case 3:
                nc2 nc2Var = (nc2) this.n;
                String str = (String) this.f1842o;
                Enum[] enumArr = nc2Var.a;
                hc2 hc2Var = new hc2(str, enumArr.length);
                for (Enum r0 : enumArr) {
                    hc2Var.j(r0.name(), false);
                }
                return hc2Var;
            case 4:
                ((k76) this.n).m = xk0.q((zq2) this.f1842o, hl5.a);
                return f88.a;
            case 5:
                ((k76) this.n).m = ((br2) this.f1842o).W0();
                return f88.a;
            case 6:
                ((k76) this.n).m = xk0.q((fr2) this.f1842o, hl5.a);
                return f88.a;
            case 7:
                f33 f33Var = (f33) this.n;
                Function0 function0 = (Function0) this.f1842o;
                l97 l97Var = f33Var.C;
                do {
                    value = l97Var.getValue();
                } while (!l97Var.j(value, v23.a((v23) value, null, false, false, false, null, false, null, false, false, false, false, false, 0, 0, 14335)));
                function0.a();
                return f88.a;
            case 8:
                ((Function1) this.n).invoke(Long.valueOf(((ns1) this.f1842o).a));
                return f88.a;
            case ep1.b /* 9 */:
                Function1 function1 = (Function1) this.n;
                l13 l13Var = (l13) this.f1842o;
                function1.invoke(l13Var.b);
                IStatisticsHandler iStatisticsHandler = ga7.a;
                ga7.a(l13Var.c);
                return f88.a;
            case ep1.c /* 10 */:
                px4 px4Var = (px4) this.n;
                l33 l33Var = (l33) this.f1842o;
                k33 k33Var = l33Var != null ? l33Var.a : null;
                if (k33Var == null || (k33Var instanceof i33)) {
                    y33Var = y33.n;
                } else {
                    if (!(k33Var instanceof j33) && !(k33Var instanceof h33)) {
                        gk0.s();
                        return null;
                    }
                    y33Var = y33.f2574o;
                }
                px4Var.setValue(y33Var);
                return f88.a;
            case 11:
                ((Function1) ((px4) this.f1842o).getValue()).invoke((d37) this.n);
                return f88.a;
            case ep1.d /* 12 */:
                ((u53) this.n).d((es4) this.f1842o);
                return f88.a;
            case 13:
                i83 i83Var = (i83) this.n;
                p83 p83Var = (p83) this.f1842o;
                try {
                    i83Var.m.b(p83Var);
                    break;
                } catch (IOException e) {
                    ql5 ql5Var = ql5.a;
                    ql5.a.j(4, "Http2Connection.Listener failure for " + i83Var.f1043o, e);
                    try {
                        p83Var.d(tc2.PROTOCOL_ERROR, e);
                        break;
                    } catch (IOException unused) {
                    }
                }
                return f88.a;
            case 14:
                e3 e3Var = (e3) this.n;
                hv6 hv6Var = (hv6) this.f1842o;
                k76 k76Var = new k76();
                i83 i83Var2 = (i83) e3Var.n;
                synchronized (i83Var2.I) {
                    synchronized (i83Var2) {
                        try {
                            hv6 hv6Var2 = i83Var2.D;
                            hv6 hv6Var3 = new hv6();
                            hv6Var2.getClass();
                            for (int i = 0; i < 10; i++) {
                                if (((1 << i) & hv6Var2.a) != 0) {
                                    hv6Var3.b(i, hv6Var2.b[i]);
                                }
                            }
                            for (int i2 = 0; i2 < 10; i2++) {
                                if (((1 << i2) & hv6Var.a) != 0) {
                                    hv6Var3.b(i2, hv6Var.b[i2]);
                                }
                            }
                            k76Var.m = hv6Var3;
                            jA = ((long) hv6Var3.a()) - ((long) hv6Var2.a());
                            if (jA != 0 && !i83Var2.n.isEmpty()) {
                                p83VarArr = (p83[]) i83Var2.n.values().toArray(new p83[0]);
                            }
                            hv6 hv6Var4 = (hv6) k76Var.m;
                            hv6Var4.getClass();
                            i83Var2.D = hv6Var4;
                            go7.b(i83Var2.v, i83Var2.f1043o + " onSettings", new ql1(i83Var2, k76Var, (byte) 15));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        i83Var2.I.e((hv6) k76Var.m);
                    } catch (IOException e2) {
                        tc2 tc2Var = tc2.PROTOCOL_ERROR;
                        i83Var2.e(tc2Var, tc2Var, e2);
                    }
                    break;
                }
                if (p83VarArr != null) {
                    for (p83 p83Var2 : p83VarArr) {
                        synchronized (p83Var2) {
                            p83Var2.q += jA;
                            if (jA > 0) {
                                p83Var2.notifyAll();
                            }
                            break;
                        }
                    }
                }
                return f88.a;
            case 15:
                i83 i83Var3 = (i83) this.n;
                i83Var3.m.a(i83Var3, (hv6) ((k76) this.f1842o).m);
                return f88.a;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                fq6 fq6Var = (fq6) this.n;
                rp3 rp3Var = (rp3) this.f1842o;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                qf0.O(rp3Var, fq6Var);
                int iE = fq6Var.e();
                for (int i3 = 0; i3 < iE; i3++) {
                    List listG = fq6Var.g(i3);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listG) {
                        if (obj instanceof yq3) {
                            arrayList.add(obj);
                        }
                    }
                    yq3 yq3Var = (yq3) lv0.H0(arrayList);
                    if (yq3Var != null && (strArrNames = yq3Var.names()) != null) {
                        for (String str2 : strArrNames) {
                            String str3 = im3.n(fq6Var.k(), kq6.d) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str2)) {
                                throw new jq3(vs1.u("The suggested name '" + str2 + "' for " + str3 + ' ' + fq6Var.f(i3) + " is already one of the names for " + str3 + ' ' + fq6Var.f(((Number) xm4.P(str2, linkedHashMap)).intValue()) + " in " + fq6Var, null, -1, null, null));
                            }
                            linkedHashMap.put(str2, Integer.valueOf(i3));
                        }
                    }
                }
                return linkedHashMap.isEmpty() ? fa2.m : linkedHashMap;
            case 17:
                LayoutNode layoutNode = (LayoutNode) this.n;
                k76 k76Var2 = (k76) this.f1842o;
                nf nfVar = layoutNode.S;
                if ((((es4) nfVar.g).p & 8) != 0) {
                    for (es4 es4Var = (kn7) nfVar.f; es4Var != null; es4Var = es4Var.q) {
                        if ((es4Var.f737o & 8) != 0) {
                            ?? L0 = es4Var;
                            ?? xx4Var = 0;
                            while (L0 != 0) {
                                if (L0 instanceof dp6) {
                                    dp6 dp6Var = (dp6) L0;
                                    if (dp6Var.F()) {
                                        ap6 ap6Var = new ap6();
                                        k76Var2.m = ap6Var;
                                        ap6Var.p = true;
                                    }
                                    if (dp6Var.F0()) {
                                        ((ap6) k76Var2.m).f346o = true;
                                    }
                                    dp6Var.z((op6) k76Var2.m);
                                } else if ((L0.f737o & 8) != 0 && (L0 instanceof vm1)) {
                                    es4 es4Var2 = ((vm1) L0).B;
                                    int i4 = 0;
                                    while (es4Var2 != null) {
                                        if ((es4Var2.f737o & 8) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                L0 = L0;
                                                xx4Var = xx4Var;
                                                xx4Var = xx4Var;
                                                L0 = es4Var2;
                                            } else {
                                                if (xx4Var == 0) {
                                                    xx4Var = new xx4(new es4[16]);
                                                }
                                                if (L0 != 0) {
                                                    xx4Var.b(L0);
                                                    L0 = 0;
                                                }
                                                xx4Var.b(es4Var2);
                                            }
                                        } else {
                                            L0 = L0;
                                            xx4Var = xx4Var;
                                        }
                                        es4Var2 = es4Var2.r;
                                        L0 = L0;
                                        xx4Var = xx4Var;
                                    }
                                    if (i4 == 1) {
                                        L0 = L0;
                                        xx4Var = xx4Var;
                                    } else {
                                        L0 = L0;
                                        xx4Var = xx4Var;
                                    }
                                }
                                L0 = vn4.l0(xx4Var);
                            }
                        }
                    }
                }
                return f88.a;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                return new c54((nh6) this.n, fa2.m, (kh6) this.f1842o);
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                Context context = (Context) this.n;
                iv6 iv6Var = (iv6) this.f1842o;
                IStatisticsHandler iStatisticsHandler2 = ga7.a;
                ga7.a(ew6.OnLogFileShared);
                Settings.i.n();
                String formattedId = Settings.e().toFormattedId();
                String string = context.getString(R.string.tv_options_EventLogDefaultReceiver);
                string.getClass();
                String str4 = n37.f;
                if (str4 == null) {
                    im3.e0("versionString");
                    throw null;
                }
                String string2 = context.getString(R.string.tv_eventlog_subject, formattedId, str4);
                string2.getClass();
                String string3 = context.getString(R.string.tv_eventlog_emailtext);
                string3.getClass();
                ye4.a("MailHelper", "Create event log mail intent.");
                Uri uriM = yl7.m(context, "files.zip");
                ye4.a("MailHelper", "Create event log mail intent for uri: " + uriM);
                try {
                    context.startActivity(sj4.a(context, string2, string3, uriM, string));
                    break;
                } catch (ActivityNotFoundException unused2) {
                    sl7 sl7Var = sl7.f2030o;
                    String string4 = context.getString(R.string.log_file_email_app_not_available_error);
                    string4.getClass();
                    iv6Var.j.invoke(new ul7(sl7Var, string4, g37.n, null, null, iv6Var.k, 184));
                    ye4.c("LogFileScreen", "no mail app found. skipping attempt");
                }
                return f88.a;
            case 20:
                tq1 tq1Var = (tq1) this.n;
                Function0 function2 = (Function0) this.f1842o;
                tq1Var.f.a();
                function2.a();
                return f88.a;
            case 21:
                ep3 ep3Var = (ep3) this.n;
                k56 k56Var = (k56) this.f1842o;
                if (((yx) ep3Var.n).get() == 0) {
                    k56Var.a();
                }
                return f88.a;
            case 22:
                ew4 ew4Var = (ew4) this.n;
                px4 px4Var2 = (px4) this.f1842o;
                ew4Var.c();
                px4Var2.setValue(null);
                return f88.a;
            case 23:
                sj5 sj5Var = (sj5) this.n;
                Context context2 = (Context) this.f1842o;
                if ((sj5Var instanceof pj5) || (sj5Var instanceof nj5) || (sj5Var instanceof mj5) || (sj5Var instanceof oj5)) {
                    Uri uri = Uri.parse("package:" + context2.getPackageName());
                    uri.getClass();
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", uri);
                    intent.addCategory("android.intent.category.DEFAULT");
                    intent.setFlags(268435456);
                    context2.startActivity(intent);
                } else if (!(sj5Var instanceof rj5)) {
                    if (!(sj5Var instanceof qj5)) {
                        gk0.s();
                        return null;
                    }
                    Uri uri2 = Uri.parse("package:" + context2.getPackageName());
                    uri2.getClass();
                    Intent intent2 = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", uri2);
                    if (intent2.resolveActivity(context2.getPackageManager()) != null) {
                        context2.startActivity(intent2);
                    } else {
                        ye4.c("SettingsPermissionsListItem", "Failed to display overlay permission screen");
                    }
                } else if (Build.VERSION.SDK_INT >= 30) {
                    Uri uri3 = Uri.parse("package:" + context2.getPackageName());
                    uri3.getClass();
                    Intent intent3 = new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION", uri3);
                    if (intent3.resolveActivity(context2.getPackageManager()) != null) {
                        context2.startActivity(intent3);
                    } else {
                        ye4.c("SettingsPermissionsListItem", "Failed to display overlay permission screen");
                    }
                } else {
                    Uri uri4 = Uri.parse("package:" + context2.getPackageName());
                    uri4.getClass();
                    Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", uri4);
                    intent4.addCategory("android.intent.category.DEFAULT");
                    intent4.setFlags(268435456);
                    context2.startActivity(intent4);
                }
                return f88.a;
            case 24:
                ((qz0) this.n).d = (hw2) this.f1842o;
                return f88.a;
            case 25:
                ((SharedPreferences) ((pn5) this.n).m).unregisterOnSharedPreferenceChangeListener((iq5) this.f1842o);
                return f88.a;
            case 26:
                tx5 tx5Var = (tx5) this.n;
                Function0 function3 = (Function0) this.f1842o;
                tx5Var.q.setValue(Boolean.FALSE);
                function3.a();
                return f88.a;
            case 27:
                ((qk4) this.f1842o).a(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", ((Context) this.n).getPackageName(), null)), null);
                return f88.a;
            case 28:
                tx5 tx5Var2 = (tx5) this.n;
                String str5 = (String) ((px4) this.f1842o).getValue();
                str5.getClass();
                tx5Var2.u.setValue(Boolean.TRUE);
                IQRCodeMDV2AssignmentViewModelClient iQRCodeMDV2AssignmentViewModelClient = tx5Var2.n;
                IQRCodeMDV2AssignmentViewModelClientSWIGJNI.IQRCodeMDV2AssignmentViewModelClient_SendAssignmentIdAndPin(iQRCodeMDV2AssignmentViewModelClient.a, iQRCodeMDV2AssignmentViewModelClient, (String) tx5Var2.s.getValue(), str5);
                return f88.a;
            default:
                ep3 ep3Var2 = (ep3) this.n;
                w16 w16Var = (w16) this.f1842o;
                eu6 eu6Var = (eu6) ((wc3) ((fp1) ep3Var2.n).a);
                if (!eu6Var.z) {
                    bk7 bk7Var = bk7.TVCmdAskConfirmation;
                    ParticipantIdentifier participantIdentifierA = eu6Var.r.a();
                    ak7 ak7Var = new ak7(bk7Var);
                    ak7Var.z(KnownStreams.PrivateStream);
                    ak7Var.B(participantIdentifierA);
                    ak7Var.d(ri7.WhatAccess, 1);
                    if (eu6Var.f(ak7Var, false)) {
                        eu6Var.z = true;
                    }
                }
                ISessionToolbarViewModel iSessionToolbarViewModel = w16Var.u;
                ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel.a, iSessionToolbarViewModel, 6);
                return f88.a;
        }
    }
}
