package o;

import android.app.Application;
import com.teamviewer.apidefinitions.rolloutconfigurations.apis.RolloutconfigurationsApi;
import com.teamviewer.apidefinitions.rolloutconfigurations.models.RolloutConfiguration;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListDyngateID;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListDyngateIDSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.DyngateViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.DyngateViewModelSWIGJNI;
import com.teamviewer.teamviewerlib.swig.tvaccount.IAccountAndroid;
import com.teamviewer.teamviewerlib.swig.tvbackendcontainer.BackendContainerAndroid;
import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;
import com.teamviewer.teamviewerlib.swig.tvpartnerlistconnection.ClientConnectParams;
import com.teamviewer.teamviewerlib.swig.tvsessionprotocol.ConnectionMode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class ol5 implements qg5, yj6, s67, f18 {
    public final /* synthetic */ byte m;

    public /* synthetic */ ol5(byte b) {
        this.m = b;
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((yw5) obj) != yw5.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(mv0.Z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((yw5) it.next()).m);
        }
        return arrayList2;
    }

    public static byte[] b(List list) {
        bf0 bf0Var = new bf0();
        for (String str : a(list)) {
            bf0Var.U0(str.length());
            bf0Var.Z0(str);
        }
        return bf0Var.k0(bf0Var.n);
    }

    public static ClientConnectParams c(String str, int i, String str2, Long l) {
        ClientConnectParams clientConnectParams = new ClientConnectParams();
        clientConnectParams.setConnectionMode(ConnectionMode.RemoteControl.swigValue());
        clientConnectParams.setDestination(str);
        clientConnectParams.setPartnerSessionID(i);
        clientConnectParams.setActiveDeviceName(str2);
        if (l != null) {
            clientConnectParams.setPartnerBuddyID(l.longValue());
        }
        return clientConnectParams;
    }

    public static yw5 h(String str) throws IOException {
        if (str.equals("http/1.0")) {
            return yw5.HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return yw5.HTTP_1_1;
        }
        if (str.equals("h2_prior_knowledge")) {
            return yw5.H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals("h2")) {
            return yw5.HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return yw5.SPDY_3;
        }
        if (str.equals("quic")) {
            return yw5.QUIC;
        }
        if (bc7.N(false, str, "h3")) {
            return yw5.HTTP_3;
        }
        gk0.l("Unexpected protocol: ".concat(str));
        return null;
    }

    public static DyngateViewModel i(DyngateID dyngateID) {
        IAccountAndroid iAccountAndroidGetAccount = BackendContainerAndroid.GetInstance().GetAccount();
        if (iAccountAndroidGetAccount == null || !iAccountAndroidGetAccount.IsLoggedIn()) {
            return null;
        }
        PListDyngateID pListDyngateID = new PListDyngateID(dyngateID);
        if (PListDyngateIDSWIGJNI.PListDyngateID_Valid(pListDyngateID.a, pListDyngateID)) {
            return ds1.j(pListDyngateID);
        }
        return null;
    }

    @Override // o.f18
    public Object apply(Object obj) {
        return ((ax8) obj).b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(RolloutConfiguration rolloutConfiguration, jc1 jc1Var) {
        qe6 qe6Var;
        long j;
        if (jc1Var instanceof qe6) {
            qe6Var = (qe6) jc1Var;
            int i = qe6Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                qe6Var.q = i - Integer.MIN_VALUE;
            } else {
                qe6Var = new qe6(this, jc1Var);
            }
        } else {
            qe6Var = new qe6(this, jc1Var);
        }
        Object objA = qe6Var.f1825o;
        int i2 = qe6Var.q;
        ne1 ne1Var = ne1.m;
        if (i2 == 0) {
            ct1.a0(objA);
            n85 n85Var = n85.a;
            qe6Var.m = rolloutConfiguration;
            j = 30000;
            qe6Var.n = 30000L;
            qe6Var.q = 1;
            objA = n85Var.a(30000L, qe6Var);
            if (objA != ne1Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ct1.a0(objA);
                return ((tc6) objA).m;
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j2 = qe6Var.n;
        RolloutConfiguration rolloutConfiguration2 = qe6Var.m;
        ct1.a0(objA);
        j = j2;
        rolloutConfiguration = rolloutConfiguration2;
        if (!((Boolean) objA).booleanValue()) {
            return new sc6(new IllegalStateException("OneAPI not available (not logged in)"));
        }
        qi0<RolloutConfiguration> qi0VarCreateRolloutConfiguration = ((RolloutconfigurationsApi) ((kh7) y85.m.t().e).getValue()).createRolloutConfiguration(rolloutConfiguration);
        qe6Var.m = null;
        qe6Var.n = j;
        qe6Var.q = 2;
        Object objM = nv1.m(qi0VarCreateRolloutConfiguration, qe6Var);
        return objM == ne1Var ? ne1Var : objM;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object f(UUID uuid, jc1 jc1Var) {
        re6 re6Var;
        long j;
        if (jc1Var instanceof re6) {
            re6Var = (re6) jc1Var;
            int i = re6Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                re6Var.q = i - Integer.MIN_VALUE;
            } else {
                re6Var = new re6(this, jc1Var);
            }
        } else {
            re6Var = new re6(this, jc1Var);
        }
        Object objA = re6Var.f1917o;
        int i2 = re6Var.q;
        ne1 ne1Var = ne1.m;
        if (i2 == 0) {
            ct1.a0(objA);
            n85 n85Var = n85.a;
            re6Var.m = uuid;
            j = 30000;
            re6Var.n = 30000L;
            re6Var.q = 1;
            objA = n85Var.a(30000L, re6Var);
            if (objA != ne1Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ct1.a0(objA);
                return ((tc6) objA).m;
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j2 = re6Var.n;
        UUID uuid2 = re6Var.m;
        ct1.a0(objA);
        j = j2;
        uuid = uuid2;
        if (!((Boolean) objA).booleanValue()) {
            return new sc6(new IllegalStateException("OneAPI not available (not logged in)"));
        }
        qi0<f88> qi0VarDeleteRolloutConfiguration = ((RolloutconfigurationsApi) ((kh7) y85.m.t().e).getValue()).deleteRolloutConfiguration(uuid);
        re6Var.m = null;
        re6Var.n = j;
        re6Var.q = 2;
        Object objM = nv1.m(qi0VarDeleteRolloutConfiguration, re6Var);
        return objM == ne1Var ? ne1Var : objM;
    }

    @Override // o.qg5
    public String g(DyngateID dyngateID) {
        String strDyngateViewModel_GetDisplayName;
        DyngateViewModel dyngateViewModelI = i(dyngateID);
        return (dyngateViewModelI == null || (strDyngateViewModel_GetDisplayName = DyngateViewModelSWIGJNI.DyngateViewModel_GetDisplayName(dyngateViewModelI.a, dyngateViewModelI)) == null) ? "" : strDyngateViewModel_GetDisplayName;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object j(RolloutConfiguration rolloutConfiguration, jc1 jc1Var) {
        se6 se6Var;
        long j;
        if (jc1Var instanceof se6) {
            se6Var = (se6) jc1Var;
            int i = se6Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                se6Var.q = i - Integer.MIN_VALUE;
            } else {
                se6Var = new se6(this, jc1Var);
            }
        } else {
            se6Var = new se6(this, jc1Var);
        }
        Object objA = se6Var.f2014o;
        int i2 = se6Var.q;
        ne1 ne1Var = ne1.m;
        if (i2 == 0) {
            ct1.a0(objA);
            n85 n85Var = n85.a;
            se6Var.m = rolloutConfiguration;
            j = 30000;
            se6Var.n = 30000L;
            se6Var.q = 1;
            objA = n85Var.a(30000L, se6Var);
            if (objA != ne1Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ct1.a0(objA);
                return ((tc6) objA).m;
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j2 = se6Var.n;
        RolloutConfiguration rolloutConfiguration2 = se6Var.m;
        ct1.a0(objA);
        j = j2;
        rolloutConfiguration = rolloutConfiguration2;
        if (!((Boolean) objA).booleanValue()) {
            return new sc6(new IllegalStateException("OneAPI not available (not logged in)"));
        }
        qi0<RolloutConfiguration> qi0VarUpdateRolloutConfiguration = ((RolloutconfigurationsApi) ((kh7) y85.m.t().e).getValue()).updateRolloutConfiguration(rolloutConfiguration);
        se6Var.m = null;
        se6Var.n = j;
        se6Var.q = 2;
        Object objM = nv1.m(qi0VarUpdateRolloutConfiguration, se6Var);
        return objM == ne1Var ? ne1Var : objM;
    }

    @Override // o.qg5
    public void k(DyngateID dyngateID) {
        DyngateViewModel dyngateViewModelI = i(dyngateID);
        if (dyngateViewModelI != null) {
            DyngateViewModelSWIGJNI.DyngateViewModel_SetHadConnectionFlag(dyngateViewModelI.a, dyngateViewModelI);
        }
    }

    @Override // o.yj6
    public void onScrollLimit(int i, int i2, int i3, boolean z) {
    }

    @Override // o.yj6
    public void onScrollProgress(int i, int i2, int i3, int i4) {
    }

    public String toString() {
        switch (this.m) {
            case 6:
                int iHashCode = hashCode();
                qf0.s(16);
                String string = Integer.toString(iHashCode, 16);
                string.getClass();
                return fx3.h("CreationExtras.Key@", string, "<", w86.a.b(we8.class).f(), ">");
            case ep1.b /* 9 */:
                return "NO_SOURCE";
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                int iHashCode2 = hashCode();
                qf0.s(16);
                String string2 = Integer.toString(iHashCode2, 16);
                string2.getClass();
                return fx3.h("CreationExtras.Key@", string2, "<", w86.a.b(Application.class).f(), ">");
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                return "NULL_VALUE";
            default:
                return super.toString();
        }
    }
}
