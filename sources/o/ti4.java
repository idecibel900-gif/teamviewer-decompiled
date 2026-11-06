package o;

import com.teamviewer.apidefinitions.custommodules.apis.CustommodulesApi;
import com.teamviewer.apidefinitions.legacydevices.apis.LegacydevicesApi;
import com.teamviewer.apidefinitions.mobilewake.apis.MobilewakeApi;
import com.teamviewer.apidefinitions.policies.apis.PoliciesApi;
import com.teamviewer.apidefinitions.remotecontrol.apis.ConnectApi;
import com.teamviewer.apidefinitions.wakeonlan.apis.WakeonlanApi;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.oneapinetworklib.adapters.CompanyPermissionAdapter;
import com.teamviewer.oneapinetworklib.adapters.LicenseFeatureAdapter;
import com.teamviewer.oneapinetworklib.adapters.OffsetDateTimeAdapter;
import com.teamviewer.oneapinetworklib.adapters.UUIDAdapter;
import com.teamviewer.remotecontrolviewlib.activity.M2MClientActivity;
import com.teamviewer.remotecontrolviewlib.activity.MainActivity;
import com.teamviewer.teamviewerlib.settings.Settings;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ti4 implements Function0 {
    public final /* synthetic */ byte m;

    public /* synthetic */ ti4(k65 k65Var) {
        this.m = (byte) 18;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        byte b2 = 4;
        switch (b) {
            case 0:
                int i = M2MClientActivity.h0;
                return new gp5();
            case 1:
                int i2 = MainActivity.w0;
                return new gp5();
            case 2:
                int i3 = MainActivity.w0;
                return f88Var;
            case 3:
                return f88Var;
            case 4:
                return Boolean.FALSE;
            case 5:
                return new rn4(bw0.d(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 65535), new h68(), new tx6(), cu4.a);
            case 6:
                return UUID.randomUUID();
            case 7:
                int i4 = ht4.u0;
                return f88Var;
            case 8:
                mt4 mt4Var = new mt4();
                mt4Var.a(new CompanyPermissionAdapter());
                xu1 xu1Var = new xu1();
                ArrayList arrayList = pt4.e;
                mt4Var.b(new lt4(xu1Var));
                mt4Var.a(new LicenseFeatureAdapter());
                mt4Var.a(new OffsetDateTimeAdapter());
                mt4Var.a(new UUIDAdapter());
                mt4Var.b(yf1.a);
                mt4Var.b(new lw((byte) 3));
                return new pt4(mt4Var);
            case ep1.b /* 9 */:
                pt4 pt4VarA = rt4.a();
                List list = pt4VarA.a;
                mt4 mt4Var2 = new mt4();
                int i5 = pt4VarA.b;
                for (int i6 = 0; i6 < i5; i6++) {
                    mt4Var2.b((up3) list.get(i6));
                }
                int size = list.size() - pt4.e.size();
                while (i5 < size) {
                    up3 up3Var = (up3) list.get(i5);
                    if (up3Var == null) {
                        hk0.g("factory == null");
                        return null;
                    }
                    mt4Var2.a.add(up3Var);
                    i5++;
                }
                mt4Var2.b(lo7.a);
                return new pt4(mt4Var2);
            case ep1.c /* 10 */:
                return new AtomicBoolean(false);
            case 11:
                return new ConcurrentLinkedQueue();
            case ep1.d /* 12 */:
                return Boolean.TRUE;
            case 13:
                fc1 fc1VarC = hm3.c(ba2.m);
                hm3.f(fc1VarC, null);
                return fc1VarC;
            case 14:
                Settings.i.n();
                if (Settings.a(gv6.MACHINE, rt0.P_GENERAL_LAN_ONLY)) {
                    return null;
                }
                ww3 ww3Var = new ww3();
                ww3Var.a = k25.m;
                Settings.i.n().f(new z11(ww3Var, (byte) 2));
                return ww3Var;
            case 15:
                Settings.i.n();
                return new j25();
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                return li0.a;
            case 17:
                return s78.a;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                lc7 lc7Var = lc7.g;
                fq6[] fq6VarArr = new fq6[0];
                if (ub7.b0("kotlin.Unit")) {
                    hk0.g("Blank serial names are prohibited");
                    return null;
                }
                if (lc7Var == lc7.d) {
                    hk0.g("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
                    return null;
                }
                rs0 rs0Var = new rs0("kotlin.Unit");
                return new hq6("kotlin.Unit", lc7Var, rs0Var.b.size(), cx.g1(fq6VarArr), rs0Var);
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                return new ui0(new c75());
            case 20:
                return h57.p("");
            case 21:
                return h57.p("");
            case 22:
                c36 c36Var = zu1.c;
                if (c36Var != null) {
                    return new l85(c36Var.b);
                }
                hk0.g("Required value was null.");
                return null;
            case 23:
                Object value = rt4.b.getValue();
                value.getClass();
                return ((pt4) value).a(Object.class, ma8.a, null);
            case 24:
                return (LegacydevicesApi) ((kh7) new d11(LegacydevicesApi.class, "https://teamviewer-internal-b1f1235a/api/legacydevices/v1/", x00.w, new qt4(rt4.a()), qf0.K(new wi0(b2))).r).getValue();
            case 25:
                return (CustommodulesApi) ((kh7) new d11(CustommodulesApi.class, "https://teamviewer-internal-b1f1235a/api/custommodules/v1/", x00.w, new qt4(rt4.a()), qf0.K(new wi0(b2))).r).getValue();
            case 26:
                return (MobilewakeApi) ((kh7) new d11(MobilewakeApi.class, "https://teamviewer-internal-b1f1235a/api/mobilewake/v1/", x00.w, new qt4(rt4.a()), qf0.K(new wi0(b2))).r).getValue();
            case 27:
                return (WakeonlanApi) ((kh7) new d11(WakeonlanApi.class, "https://teamviewer-internal-b1f1235a/api/wakeonlan/v1/", x00.w, new qt4(rt4.a()), qf0.K(new wi0(b2))).r).getValue();
            case 28:
                return (PoliciesApi) ((kh7) new d11(PoliciesApi.class, "https://teamviewer-internal-b1f1235a/api/policies/v0/", x00.w, new qt4(rt4.a()), qf0.K(new wi0(b2))).r).getValue();
            default:
                return (ConnectApi) ((kh7) new d11(ConnectApi.class, "https://teamviewer-internal-b1f1235a/api/remotecontrol/v1/", x00.w, new qt4(rt4.a()), qf0.K(new wi0(b2))).r).getValue();
        }
    }

    public /* synthetic */ ti4(byte b) {
        this.m = b;
    }
}
