package o;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.PowerManager;
import androidx.work.impl.foreground.SystemForegroundService;
import com.teamviewer.remotecontrollib.swig.LicenseViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IManagedDeviceV2FactoryContainer;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IManagedDeviceV2FactoryContainerSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ManagedDevicesV2MemberId;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ManagedGroupV2ViewModel;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eb implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f698o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public /* synthetic */ eb(String str, dl4 dl4Var, c36 c36Var, String str2) {
        this.m = (byte) 11;
        this.p = str;
        this.f698o = dl4Var;
        this.n = c36Var;
        this.q = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [o.hc1] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v21 */
    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        Object value;
        byte b = 14;
        byte b2 = 3;
        ManagedGroupV2ViewModel managedGroupV2ViewModel = 0;
        jz2 jz2Var = null;
        managedGroupV2ViewModel = 0;
        switch (this.m) {
            case 0:
                Context context = (Context) this.f698o;
                String str = (String) this.p;
                Function0 function0 = (Function0) this.n;
                hb hbVar = (hb) this.q;
                f88 f88Var = f88.a;
                IStatisticsHandler iStatisticsHandler = ga7.a;
                ga7.a(g02.T);
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", str);
                if (intent.resolveActivity(context.getPackageManager()) == null) {
                    hbVar.f.a();
                } else {
                    context.startActivity(Intent.createChooser(intent, null));
                }
                function0.a();
                return f88Var;
            case 1:
                ((d12) this.f698o).j((Function0) this.n, (a12) this.p, (j04) this.q);
                return f88.a;
            case 2:
                Function0 function1 = (Function0) this.n;
                av avVar = (av) this.f698o;
                ak3 ak3Var = (ak3) this.p;
                ((px4) this.q).setValue(Boolean.FALSE);
                function1.a();
                SharedPreferences.Editor editorEdit = avVar.a.edit();
                editorEdit.putBoolean("UPDATE_CANCELLED_BY_USER", true);
                editorEdit.apply();
                kh7 kh7Var = ev.a;
                ak3Var.getClass();
                ev.a(new dv(cv.t, ak3Var, null, true, 4));
                return f88.a;
            case 3:
                xy6 xy6Var = (xy6) this.f698o;
                me1 me1Var = (me1) this.p;
                km kmVar = (km) this.q;
                Function0 function2 = (Function0) this.n;
                if (xy6Var.c() == yy6.n && xy6Var.g.e().c(yy6.f2656o)) {
                    im3.R(me1Var, null, null, new gy(xy6Var, managedGroupV2ViewModel, b2), 3);
                    im3.R(me1Var, null, null, new y0(kmVar, managedGroupV2ViewModel, (byte) 5), 3);
                } else {
                    im3.R(me1Var, null, null, new gy(xy6Var, managedGroupV2ViewModel, (byte) 4), 3).o0(new cy(xy6Var, function2, (byte) 3));
                }
                return f88.a;
            case 4:
                List list = (List) this.f698o;
                Function1 function3 = (Function1) this.p;
                px4 px4Var = (px4) this.n;
                Set set = (Set) this.q;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    UUID uuidB = bt1.B((l33) it.next());
                    if (uuidB != null) {
                        arrayList.add(uuidB);
                    }
                }
                Set setT0 = lv0.T0(arrayList);
                Set set2 = (Set) px4Var.getValue();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (Object obj : set2) {
                    UUID uuid = (UUID) obj;
                    if (setT0.contains(uuid) || set.contains(uuid)) {
                        linkedHashSet.add(obj);
                    }
                }
                function3.invoke(linkedHashSet);
                return f88.a;
            case 5:
                im3.R((me1) this.f698o, null, null, new j0(this.p, this.q, this.n, (hc1) null, (byte) 14), 3);
                return f88.a;
            case 6:
                ru1 ru1Var = (ru1) this.f698o;
                px4 px4Var2 = (px4) this.p;
                px4 px4Var3 = (px4) this.n;
                px4 px4Var4 = (px4) this.q;
                ru1Var.p1();
                Function1 function4 = (Function1) px4Var2.getValue();
                Boolean bool = Boolean.FALSE;
                function4.invoke(bool);
                ((Function1) px4Var3.getValue()).invoke(bool);
                ((Function0) px4Var4.getValue()).a();
                return f88.a;
            case 7:
                ((Function1) this.f698o).invoke(new n5((me1) this.p, (Function0) this.n, (ul1) this.q, b));
                return f88.a;
            case 8:
                l33 l33Var = (l33) this.f698o;
                Function1 function5 = (Function1) this.p;
                fx1 fx1Var = (fx1) this.n;
                ns1 ns1Var = (ns1) this.q;
                if (l33Var == null) {
                    l33Var = new l33(new h33(-1), null, 14);
                }
                function5.invoke(l33Var);
                k33 h33Var = l33Var.a;
                fx1Var.V0();
                l97 l97Var = fx1Var.n;
                do {
                    value = l97Var.getValue();
                } while (!l97Var.j(value, gw1.a((gw1) value, null, ns1Var, null, null, 13)));
                if (h33Var == null) {
                    h33Var = new h33(-1);
                }
                fx1Var.W0(new ix1(ns1Var.a, h33Var));
                return f88.a;
            case ep1.b /* 9 */:
                Float f = (Float) this.f698o;
                rh3 rh3Var = (rh3) this.p;
                Float f2 = (Float) this.n;
                qh3 qh3Var = (qh3) this.q;
                if (!f.equals(rh3Var.m) || !f2.equals(rh3Var.n)) {
                    rh3Var.m = f;
                    rh3Var.n = f2;
                    rh3Var.p = new wn7(qh3Var, vn4.j0, f, f2, null);
                    rh3Var.t.b.setValue(Boolean.TRUE);
                    rh3Var.q = false;
                    rh3Var.r = true;
                }
                return f88.a;
            case ep1.c /* 10 */:
                List list2 = (List) this.f698o;
                kh4 kh4Var = (kh4) this.p;
                wf5 wf5Var = (wf5) this.n;
                yf5 yf5Var = (yf5) this.q;
                int iFloatValue = (int) (((Number) kh4Var.getValue()).floatValue() * 660.0f);
                if (((Number) kh4Var.getValue()).floatValue() < wf5Var.z()) {
                    yf5Var.A(yf5Var.z() + 1);
                }
                wf5Var.A(((Number) kh4Var.getValue()).floatValue());
                if (yf5Var.z() % 2 == 0 && iFloatValue < 306) {
                    return (String) list2.get(0);
                }
                if (yf5Var.z() % 2 != 0 || iFloatValue < 306) {
                    return (yf5Var.z() % 2 != 1 || iFloatValue >= 306) ? (String) list2.get(3) : (String) list2.get(2);
                }
                return (String) list2.get(1);
            case 11:
                String str2 = (String) this.p;
                dl4 dl4Var = (dl4) this.f698o;
                c36 c36Var = (c36) this.n;
                String str3 = (String) this.q;
                ManagedDevicesV2MemberId managedDevicesV2MemberId = new ManagedDevicesV2MemberId(yl4.ManagedDeviceV2, str2);
                au2 au2Var = vt1.c;
                qb3 qb3VarI = au2Var != null ? au2Var.i(dl4Var, managedDevicesV2MemberId) : null;
                IManagedDeviceV2FactoryContainer iManagedDeviceV2FactoryContainer = c36Var.q;
                if (iManagedDeviceV2FactoryContainer != null) {
                    long jIManagedDeviceV2FactoryContainer_GetManagedGroupV2ViewModel = IManagedDeviceV2FactoryContainerSWIGJNI.IManagedDeviceV2FactoryContainer_GetManagedGroupV2ViewModel(iManagedDeviceV2FactoryContainer.a, iManagedDeviceV2FactoryContainer, str3);
                    if (jIManagedDeviceV2FactoryContainer_GetManagedGroupV2ViewModel != 0) {
                        ManagedGroupV2ViewModel managedGroupV2ViewModel2 = new ManagedGroupV2ViewModel();
                        managedGroupV2ViewModel2.b = true;
                        managedGroupV2ViewModel2.a = jIManagedDeviceV2FactoryContainer_GetManagedGroupV2ViewModel;
                        managedGroupV2ViewModel = managedGroupV2ViewModel2;
                    }
                }
                LicenseViewModel licenseViewModelH = di1.h();
                licenseViewModelH.getClass();
                Resources resources = c36Var.a.getResources();
                resources.getClass();
                return new rk4(qb3VarI, managedGroupV2ViewModel, licenseViewModelH, resources);
            case ep1.d /* 12 */:
                z31 z31Var = (z31) this.f698o;
                ql6 ql6Var = (ql6) this.p;
                iq2 iq2Var = (iq2) this.n;
                q57 q57Var = (q57) this.q;
                switch (z31Var.j.ordinal()) {
                    case 0:
                        jz2Var = jz2.u;
                        break;
                    case 1:
                    case 2:
                        jz2Var = jz2.t;
                        break;
                    case 3:
                        jz2Var = jz2.s;
                        break;
                    case 4:
                    case 5:
                        jz2Var = jz2.v;
                        break;
                    case 6:
                        break;
                    default:
                        gk0.s();
                        return null;
                }
                if (jz2Var != null) {
                    ga7.a(jz2Var);
                }
                bt1.l(iq2Var, q57Var);
                ((pl6) ql6Var).d.invoke(z31Var);
                return f88.a;
            default:
                jm8 jm8Var = (jm8) this.p;
                UUID uuid2 = (UUID) this.n;
                ts2 ts2Var = (ts2) this.q;
                Context context2 = (Context) this.f698o;
                String string = uuid2.toString();
                xm8 xm8VarB = jm8Var.c.b(string);
                if (xm8VarB == null || xm8VarB.b.a()) {
                    hk0.l("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                } else {
                    dt5 dt5Var = jm8Var.b;
                    synchronized (dt5Var.k) {
                        try {
                            we4.f().g(dt5.l, "Moving WorkSpec (" + string + ") to the foreground");
                            nn8 nn8Var = (nn8) dt5Var.g.remove(string);
                            if (nn8Var != null) {
                                if (dt5Var.a == null) {
                                    PowerManager.WakeLock wakeLockA = ah8.a(dt5Var.b);
                                    dt5Var.a = wakeLockA;
                                    wakeLockA.acquire();
                                }
                                dt5Var.f.put(string, nn8Var);
                                dt5Var.b.startForegroundService(qh7.b(dt5Var.b, u47.j(nn8Var.a), ts2Var));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    km8 km8VarJ = u47.j(xm8VarB);
                    String str4 = qh7.v;
                    Intent intent2 = new Intent(context2, (Class<?>) SystemForegroundService.class);
                    intent2.setAction("ACTION_NOTIFY");
                    intent2.putExtra("KEY_NOTIFICATION_ID", ts2Var.a);
                    intent2.putExtra("KEY_FOREGROUND_SERVICE_TYPE", ts2Var.b);
                    intent2.putExtra("KEY_NOTIFICATION", ts2Var.c);
                    intent2.putExtra("KEY_WORKSPEC_ID", km8VarJ.a);
                    intent2.putExtra("KEY_GENERATION", km8VarJ.b);
                    context2.startService(intent2);
                }
                return null;
        }
    }

    public /* synthetic */ eb(Object obj, Object obj2, Object obj3, Function0 function0, byte b) {
        this.m = b;
        this.f698o = obj;
        this.p = obj2;
        this.q = obj3;
        this.n = function0;
    }

    public /* synthetic */ eb(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.m = b;
        this.f698o = obj;
        this.p = obj2;
        this.n = obj3;
        this.q = obj4;
    }

    public /* synthetic */ eb(Function0 function0, av avVar, ak3 ak3Var, px4 px4Var) {
        this.m = (byte) 2;
        this.n = function0;
        this.f698o = avVar;
        this.p = ak3Var;
        this.q = px4Var;
    }

    public /* synthetic */ eb(d12 d12Var, Function0 function0, a12 a12Var, j04 j04Var) {
        this.m = (byte) 1;
        this.f698o = d12Var;
        this.n = function0;
        this.p = a12Var;
        this.q = j04Var;
    }

    public /* synthetic */ eb(jm8 jm8Var, UUID uuid, ts2 ts2Var, Context context) {
        this.m = (byte) 13;
        this.p = jm8Var;
        this.n = uuid;
        this.q = ts2Var;
        this.f698o = context;
    }
}
