package o;

import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.view.textclassifier.TextClassification;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.remotecontrollib.swig.AccountViewModelFactorySWIGJNI;
import com.teamviewer.remotecontrollib.swig.IConnectivityStateViewModel;
import com.teamviewer.remotecontrollib.swig.IRemoteScreenKeyboardViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ComputerDetailsViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ContactDetailsViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IMonitoringOverviewEndpointListViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.MonitoringOverviewEndpointListViewModelFactorySWIGJNI;
import com.teamviewer.remotecontrolviewmodellib.swig.IDeviceAuthInstructionsFragmentViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewmodellib.swig.IDeviceAuthenticationInstructionsFragmentViewModel;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import java.time.OffsetDateTime;
import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a26 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f288o;

    public /* synthetic */ a26(at7 at7Var, wo woVar, nl nlVar) {
        this.m = (byte) 26;
        this.n = woVar;
        this.f288o = nlVar;
    }

    /* JADX WARN: Code duplicated, block: B:177:0x0444 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:178:0x0446 A[LOOP:1: B:168:0x0411->B:178:0x0446, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:238:0x0449 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [o.hc1] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v4, types: [o.oc0] */
    @Override // kotlin.jvm.functions.Function0
    public final Object a() throws PendingIntent.CanceledException {
        IMonitoringOverviewEndpointListViewModel iMonitoringOverviewEndpointListViewModel;
        IConnectivityStateViewModel iConnectivityStateViewModel;
        jz2 jz2Var;
        s01 s01Var;
        long j;
        ws7 ws7VarD;
        j64 j64Var;
        xo xoVar;
        di7 di7Var;
        byte b = 3;
        boolean z = false;
        z = false;
        byte b2 = 1;
        oc0 oc0Var = 0;
        oc0Var = 0;
        switch (this.m) {
            case 0:
                b26 b26Var = (b26) this.n;
                fb3 fb3Var = (fb3) this.f288o;
                j93 j93Var = b26Var.s;
                j93Var.getClass();
                nw4 nw4VarS = j93Var.S(fb3Var);
                Boolean bool = (Boolean) nw4VarS.getValue();
                if (bool != null && !bool.booleanValue()) {
                    z = true;
                }
                nw4VarS.setValue(Boolean.valueOf(z));
                if (!z) {
                    j93Var.a0();
                }
                return f88.a;
            case 1:
                mo7 mo7Var = (mo7) this.n;
                Resources resources = (Resources) this.f288o;
                IRemoteScreenKeyboardViewModel iRemoteScreenKeyboardViewModelI = xo1.i(mo7Var.w());
                iRemoteScreenKeyboardViewModelI.getClass();
                return new b26(new j93(new oh3(new l07((Object) iRemoteScreenKeyboardViewModelI, (byte) 23)), mo7Var), iRemoteScreenKeyboardViewModelI.a() == vc3.OSVersion_OSX, iRemoteScreenKeyboardViewModelI.a() == vc3.OSVersion_Linux, resources);
            case 2:
                dt4 dt4Var = (dt4) this.n;
                dd ddVar = (dd) this.f288o;
                if (vt1.c != null) {
                    long jMonitoringOverviewEndpointListViewModelFactory_GetMonitoringOverviewEndpointListViewModel = MonitoringOverviewEndpointListViewModelFactorySWIGJNI.MonitoringOverviewEndpointListViewModelFactory_GetMonitoringOverviewEndpointListViewModel();
                    if (jMonitoringOverviewEndpointListViewModelFactory_GetMonitoringOverviewEndpointListViewModel == 0) {
                        iMonitoringOverviewEndpointListViewModel = null;
                    } else {
                        iMonitoringOverviewEndpointListViewModel = new IMonitoringOverviewEndpointListViewModel();
                        iMonitoringOverviewEndpointListViewModel.b = true;
                        iMonitoringOverviewEndpointListViewModel.a = jMonitoringOverviewEndpointListViewModelFactory_GetMonitoringOverviewEndpointListViewModel;
                    }
                    if (iMonitoringOverviewEndpointListViewModel != null) {
                        l26 l26Var = new l26(iMonitoringOverviewEndpointListViewModel, z ? (byte) 1 : (byte) 0);
                        ve8 ve8VarO = dt4Var.getG0();
                        bf1 bf1VarK = h57.k(dt4Var);
                        bf1VarK.getClass();
                        pn5 pn5Var = new pn5(ve8VarO, l26Var, bf1VarK);
                        wt3 wt3VarB = w86.a.b(oc0.class);
                        String strC = wt3VarB.c();
                        if (strC == null) {
                            hk0.g("Local and anonymous classes can not be ViewModels");
                            return null;
                        }
                        oc0Var = (oc0) pn5Var.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
                    }
                }
                return new bt4(oc0Var, ddVar);
            case 3:
                c36 c36Var = (c36) this.n;
                ee0 ee0Var = (ee0) this.f288o;
                long jAccountViewModelFactory_GetConnectivityStateViewModel = AccountViewModelFactorySWIGJNI.AccountViewModelFactory_GetConnectivityStateViewModel();
                if (jAccountViewModelFactory_GetConnectivityStateViewModel == 0) {
                    iConnectivityStateViewModel = null;
                } else {
                    iConnectivityStateViewModel = new IConnectivityStateViewModel();
                    iConnectivityStateViewModel.b = true;
                    iConnectivityStateViewModel.a = jAccountViewModelFactory_GetConnectivityStateViewModel;
                }
                iConnectivityStateViewModel.getClass();
                dl5 dl5Var = new dl5(new q26(c36Var, (byte) 12), (byte) 2);
                ve8 ve8VarO2 = ee0Var.getG0();
                bf1 bf1VarK2 = h57.k(ee0Var);
                pn5 pn5VarT = ua5.t(bf1VarK2, ve8VarO2, dl5Var, bf1VarK2);
                wt3 wt3VarB2 = w86.a.b(q7.class);
                String strC2 = wt3VarB2.c();
                if (strC2 == null) {
                    hk0.g("Local and anonymous classes can not be ViewModels");
                    return null;
                }
                q7 q7Var = (q7) pn5VarT.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC2), wt3VarB2);
                Resources resources2 = c36Var.a.getResources();
                resources2.getClass();
                return new fe0(iConnectivityStateViewModel, q7Var, resources2);
            case 4:
                return new ke0((ContactDetailsViewModel) this.n, (nc0) this.f288o);
            case 5:
                c36 c36Var2 = (c36) this.n;
                return new kc0((ComputerDetailsViewModel) this.f288o, new nc0(c36Var2.h, c36Var2.f, c36Var2.a));
            case 6:
                c36 c36Var3 = (c36) this.n;
                ax0 ax0Var = (ax0) this.f288o;
                Resources resources3 = c36Var3.a.getResources();
                resources3.getClass();
                return new ns6(resources3, ax0Var);
            case 7:
                kx4 kx4Var = (kx4) this.n;
                s01 s01Var2 = (s01) this.f288o;
                Object[] objArr = kx4Var.b;
                long[] jArr = kx4Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j2 = jArr[i];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j2) < 128) {
                                    s01Var2.z(objArr[(i << 3) + i3]);
                                }
                                j2 >>= 8;
                            }
                            if (i2 == 8) {
                                if (i != length) {
                                    i++;
                                }
                            }
                        } else if (i != length) {
                            i++;
                        }
                    }
                }
                return f88.a;
            case 8:
                e96 e96Var = (e96) this.n;
                String str = (String) this.f288o;
                Matcher matcher = e96Var.m.matcher(str);
                matcher.getClass();
                if (matcher.find(0)) {
                    return new fn4(matcher, str);
                }
                return null;
            case ep1.b /* 9 */:
                ll6 ll6Var = (ll6) this.n;
                bn6 bn6Var = (bn6) this.f288o;
                IStatisticsHandler iStatisticsHandler = ga7.a;
                int iOrdinal = ll6Var.ordinal();
                if (iOrdinal == 0) {
                    jz2Var = jz2.w;
                } else if (iOrdinal == 1) {
                    jz2Var = jz2.x;
                } else if (iOrdinal == 2) {
                    jz2Var = jz2.y;
                } else {
                    if (iOrdinal != 3) {
                        gk0.s();
                        return null;
                    }
                    jz2Var = jz2.z;
                }
                ga7.a(jz2Var);
                l97 l97Var = bn6Var.u;
                while (true) {
                    Object value = l97Var.getValue();
                    yl6 yl6Var = (yl6) value;
                    yl6Var.getClass();
                    String str2 = yl6Var.a;
                    bn6 bn6Var2 = bn6Var;
                    z31 z31VarD1 = bn6Var2.d1(str2, bn6.W0(bn6Var, yl6Var, null, null, null, 15), ll6Var);
                    if (l97Var.j(value, yl6.a(yl6Var, null, ll6Var, z31VarD1, bn6.c1(str2, z31VarD1), null, null, null, null, null, null, null, false, null, false, false, false, null, null, false, 2097137))) {
                        bn6Var2.h1();
                        return f88.a;
                    }
                    bn6Var = bn6Var2;
                }
                break;
            case ep1.c /* 10 */:
                bn6 bn6Var3 = (bn6) this.n;
                Function0 function0 = (Function0) this.f288o;
                bn6Var3.E = null;
                bn6Var3.j1(new fk6(b));
                bn6Var3.E = null;
                bn6Var3.i1("");
                function0.a();
                return f88.a;
            case 11:
                ((Function1) this.n).invoke((z31) this.f288o);
                return f88.a;
            case ep1.d /* 12 */:
                Function1 function1 = (Function1) this.n;
                qr6 qr6Var = (qr6) this.f288o;
                function1.invoke(qr6Var.b);
                sr6 sr6Var = qr6Var.c;
                if (sr6Var != null) {
                    ga7.a(sr6Var);
                }
                return f88.a;
            case 13:
                SupportSession supportSession = (SupportSession) this.n;
                su6 su6Var = (su6) this.f288o;
                if (supportSession != null) {
                    int sessioncode = supportSession.getSessioncode();
                    OffsetDateTime validUntil = supportSession.getValidUntil();
                    validUntil.getClass();
                    SupportSession supportSession2 = ((it6) su6Var.u.m.getValue()).a;
                    if (supportSession2 != null && supportSession2.getSessioncode() == sessioncode && im3.n(supportSession2.getValidUntil(), validUntil) && h57.o(supportSession2, su6Var.s)) {
                        su6Var.d1(sessioncode);
                    }
                }
                return f88.a;
            case 14:
                o43 o43Var = (o43) this.n;
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f288o;
                synchronized (ey6.b) {
                    LinkedHashMap linkedHashMap = ey6.c;
                    linkedHashMap.remove(o43Var);
                    if (linkedHashMap.isEmpty()) {
                        we4.f().c(cm8.a, "NetworkRequestConstraintController unregister shared callback");
                        connectivityManager.unregisterNetworkCallback(ey6.a);
                        ey6.f = null;
                        ey6.d = null;
                        ey6.e = false;
                    }
                    break;
                }
                return f88.a;
            case 15:
                o37 o37Var = (o37) this.n;
                kh2 kh2Var = (kh2) this.f288o;
                if (!im3.n(o37Var, kh2Var.a)) {
                    qv0.d0(kh2Var.b, new y46((Object) o37Var, (byte) 19));
                    j56 j56Var = kh2Var.c;
                    if (j56Var != null && (s01Var = j56Var.a) != null) {
                        s01Var.s(j56Var, null);
                    }
                }
                return f88.a;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                ud7 ud7Var = (ud7) this.n;
                if (im3.n((kp5) ((px4) this.f288o).getValue(), jp5.q)) {
                    try {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setData(Uri.parse("https://play.google.com/store/account/paymentmethods"));
                        intent.setPackage("com.android.vending");
                        Context contextE = ud7Var.E();
                        if (contextE != null) {
                            contextE.startActivity(intent);
                        }
                    } catch (ActivityNotFoundException unused) {
                        ye4.a("SubscriptionPlanBaseFragment", "PlayStore not installed");
                    }
                    break;
                }
                return f88.a;
            case 17:
                Function0 function2 = (Function0) this.n;
                ge7 ge7Var = (ge7) this.f288o;
                function2.a();
                if (ge7Var instanceof de7) {
                    IStatisticsHandler iStatisticsHandler2 = ga7.a;
                    ga7.a(fg3.t);
                }
                return f88.a;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                Function0 function3 = (Function0) this.n;
                yr1 yr1Var = (yr1) this.f288o;
                function3.a();
                IDeviceAuthenticationInstructionsFragmentViewModel iDeviceAuthenticationInstructionsFragmentViewModel = yr1Var.p;
                IDeviceAuthInstructionsFragmentViewModelSWIGJNI.IDeviceAuthenticationInstructionsFragmentViewModel_ReportScanQrCodeIsTapped(iDeviceAuthenticationInstructionsFragmentViewModel.a, iDeviceAuthenticationInstructionsFragmentViewModel);
                return f88.a;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                Context context = (Context) this.n;
                ((px4) this.f288o).setValue(Boolean.FALSE);
                context.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", context.getPackageName(), null)));
                return f88.a;
            case 20:
                nl7 nl7Var = (nl7) this.n;
                o37 o37Var2 = (o37) this.f288o;
                nl7Var.b.a();
                gl0 gl0Var = o37Var2.b;
                if (gl0Var.r() instanceof z45) {
                    gl0Var.resumeWith(z37.n);
                }
                return f88.a;
            case 21:
                Function0 function4 = (Function0) this.n;
                o37 o37Var3 = (o37) this.f288o;
                function4.a();
                o37Var3.a();
                return f88.a;
            case 22:
                String str3 = (String) this.n;
                return h57.p(str3 != null ? bc7.L(str3, "[size]", ((hi7) this.f288o).q) : null);
            case 23:
                Context context2 = (Context) this.n;
                TextClassification textClassification = (TextClassification) this.f288o;
                String text = textClassification.getText();
                n67.q(PendingIntent.getActivity(context2, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592));
                return f88.a;
            case 24:
                pr7 pr7Var = (pr7) this.n;
                long j3 = ((dl3) ((px4) this.f288o).getValue()).a;
                t65 t65VarG = pr7Var.g();
                long jFloatToRawIntBits = 9205357640488583168L;
                if (t65VarG != null) {
                    long j4 = t65VarG.a;
                    xo xoVarK = pr7Var.k();
                    if (xoVarK != null && xoVarK.n.length() != 0) {
                        l43 l43Var = (l43) pr7Var.r.getValue();
                        int i4 = l43Var == null ? -1 : rr7.a[l43Var.ordinal()];
                        if (i4 != -1) {
                            if (i4 == 1 || i4 == 2) {
                                long j5 = pr7Var.l().b;
                                int i5 = gt7.c;
                                j = j5 >> 32;
                            } else {
                                if (i4 != 3) {
                                    gk0.s();
                                    return null;
                                }
                                long j6 = pr7Var.l().b;
                                int i6 = gt7.c;
                                j = j6 & 4294967295L;
                            }
                            int i7 = (int) j;
                            j64 j64Var2 = pr7Var.d;
                            if (j64Var2 != null && (ws7VarD = j64Var2.d()) != null && (j64Var = pr7Var.d) != null && (xoVar = (xo) j64Var.a.b) != null) {
                                int iV = ct1.v(pr7Var.b.q(i7), 0, xoVar.n.length());
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (ws7VarD.d(j4) >> 32));
                                vs7 vs7Var = ws7VarD.a;
                                xu4 xu4Var = vs7Var.b;
                                int iD = xu4Var.d(iV);
                                float fE = vs7Var.e(iD);
                                float f = vs7Var.f(iD);
                                float fU = ct1.u(fIntBitsToFloat, Math.min(fE, f), Math.max(fE, f));
                                if (dl3.b(j3, 0L) || Math.abs(fIntBitsToFloat - fU) <= ((int) (j3 >> 32)) / 2) {
                                    float f2 = xu4Var.f(iD);
                                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fU)) << 32) | (((long) Float.floatToRawIntBits(((xu4Var.b(iD) - f2) / 2.0f) + f2)) & 4294967295L);
                                }
                            }
                        }
                    }
                }
                return new t65(jFloatToRawIntBits);
            case 25:
                im3.R((me1) this.n, null, pe1.p, new mx(b2, (Function1) this.f288o, oc0Var), 1);
                return f88.a;
            case 26:
                wo woVar = (wo) this.n;
                nl nlVar = (nl) this.f288o;
                ga4 ga4Var = (ga4) woVar.a;
                if (ga4Var instanceof fa4) {
                    di7 di7Var2 = ((fa4) ga4Var).c;
                    if (di7Var2 != null) {
                        ((i77) di7Var2.a).a.a();
                    } else {
                        try {
                            nlVar.a(((fa4) ga4Var).a);
                            break;
                        } catch (IllegalArgumentException unused2) {
                        }
                    }
                } else if ((ga4Var instanceof ea4) && (di7Var = ((ea4) ga4Var).c) != null) {
                    ((i77) di7Var.a).a.a();
                }
                return f88.a;
            case 27:
                ((x84) this.n).f((yh6) this.f288o);
                return f88.a;
            case 28:
                iv6 iv6Var = (iv6) this.n;
                Function0 function5 = (Function0) this.f288o;
                iv6Var.m.a();
                function5.a();
                return f88.a;
            default:
                ((ej8) ((hj8) this.n).n).b((zr) this.f288o);
                return f88.a;
        }
    }

    public /* synthetic */ a26(Object obj, Object obj2, byte b) {
        this.m = b;
        this.n = obj;
        this.f288o = obj2;
    }
}
