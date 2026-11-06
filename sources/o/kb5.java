package o;

import android.content.Context;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.swig.tvbackendcontainer.BackendContainerAndroid;
import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;
import com.teamviewer.teamviewerlib.swig.tvpartnerlistconnection.ClientConnectParams;
import com.teamviewer.teamviewerlib.swig.tvpartnerlistconnection.ConnectionParam;
import com.teamviewer.teamviewerlib.swig.tvsessionprotocol.ConnectionMode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class kb5 extends Thread {
    public final mb5 m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final au6 f1249o;
    public final ol5 p;
    public final j93 q;
    public final d31 r;

    public kb5(mb5 mb5Var, int i, au6 au6Var, ol5 ol5Var, j93 j93Var, d31 d31Var) {
        mb5Var.getClass();
        d31Var.getClass();
        this.m = mb5Var;
        this.n = i;
        this.f1249o = au6Var;
        this.p = ol5Var;
        this.q = j93Var;
        this.r = d31Var;
        setName("OutgoingConnectSessionThread");
    }

    public final void a(String str) {
        eb7 eb7Var = new eb7();
        eb7Var.a = str;
        this.f1249o.f(this.n, i41.q, eb7Var);
    }

    public final boolean b(ConnectionParam connectionParam) {
        String errorMessage = connectionParam.getErrorMessage();
        if (im3.n(errorMessage, "Success")) {
            return true;
        }
        if (!im3.n(errorMessage, "LicenseBlocked")) {
            if (errorMessage == null) {
                a("");
                return false;
            }
            String errorMessage2 = connectionParam.getErrorMessage();
            errorMessage2.getClass();
            a(errorMessage2);
            return false;
        }
        short blockingReason = connectionParam.getBlockingReason();
        if (blockingReason == 1) {
            a("LicenseBlockedActive");
            return false;
        }
        if (blockingReason == 2) {
            a("LicenseBlockedPassive");
            return false;
        }
        if (blockingReason == 3) {
            a("LicenseBlockedMarketingTrialActive");
            return false;
        }
        if (blockingReason == 4) {
            a("LicenseBlockedMarketingTrialPassive");
            return false;
        }
        a("");
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0258  */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ConnectionParam connectionParamGetConnectionParams;
        i41 i41Var = i41.n;
        ye4.a("OutgoingConnectSessionThread", "start");
        if (!this.m.c()) {
            ye4.c("OutgoingConnectSessionThread", "invalid input");
            this.f1249o.e(this.n, i41Var);
            return;
        }
        this.f1249o.e(this.n, i41.p);
        mb5 mb5Var = this.m;
        ps6 ps6VarE = null;
        if (mb5Var == null) {
            ye4.c("OutgoingConnectSessionThread", "connectNative(): unknown session");
            this.f1249o.e(this.n, i41Var);
        } else if (mb5Var instanceof wt6) {
            wt6 wt6Var = (wt6) mb5Var;
            d31 d31Var = this.r;
            ol5 ol5Var = this.p;
            int i = this.n;
            String str = wt6Var.j;
            boolean z = wt6Var.f;
            String str2 = wt6Var.a;
            if (str == null || str.length() == 0) {
                Boolean bool = wt6Var.c;
                String str3 = bool != null ? bool.booleanValue() : wt6Var.a() ? wt6Var.e : null;
                Long l = wt6Var.g ? wt6Var.i : null;
                String strB = d31Var.b();
                ol5Var.getClass();
                str2.getClass();
                ClientConnectParams clientConnectParamsC = ol5.c(str2, i, strB, l);
                if (str3 != null) {
                    clientConnectParamsC.setUseEasyAccess(str3);
                }
                BackendContainerAndroid backendContainerAndroidGetInstance = BackendContainerAndroid.GetInstance();
                backendContainerAndroidGetInstance.GetPartnerlistClientConnector().RemoteControl(clientConnectParamsC, z, kf4.Unknown.m, null);
                connectionParamGetConnectionParams = backendContainerAndroidGetInstance.GetClientConnector().GetConnectionParams();
                connectionParamGetConnectionParams.getClass();
            } else {
                String strB2 = d31Var.b();
                String str4 = wt6Var.j;
                ol5Var.getClass();
                str2.getClass();
                ClientConnectParams clientConnectParamsC2 = ol5.c(str2, i, strB2, null);
                clientConnectParamsC2.setManagerId(str4);
                clientConnectParamsC2.setManagerSigningKey(null);
                BackendContainerAndroid backendContainerAndroidGetInstance2 = BackendContainerAndroid.GetInstance();
                backendContainerAndroidGetInstance2.GetPartnerlistClientConnector().RemoteControl(clientConnectParamsC2, z, kf4.Unknown.m, null);
                connectionParamGetConnectionParams = backendContainerAndroidGetInstance2.GetClientConnector().GetConnectionParams();
                connectionParamGetConnectionParams.getClass();
            }
            if (b(connectionParamGetConnectionParams)) {
                ps6VarE = this.q.E(connectionParamGetConnectionParams, wt6Var, i);
            }
        } else if (mb5Var instanceof ut6) {
            ut6 ut6Var = (ut6) mb5Var;
            ol5 ol5Var2 = this.p;
            String str5 = ut6Var.a;
            int i2 = this.n;
            String str6 = ut6Var.f;
            ol5Var2.getClass();
            BackendContainerAndroid backendContainerAndroidGetInstance3 = BackendContainerAndroid.GetInstance();
            backendContainerAndroidGetInstance3.GetClientConnector().ConnectRemoteControlSession(str5, i2, str6);
            ConnectionParam connectionParamGetConnectionParams2 = backendContainerAndroidGetInstance3.GetClientConnector().GetConnectionParams();
            if (connectionParamGetConnectionParams2 != null && b(connectionParamGetConnectionParams2)) {
                ps6VarE = this.q.E(connectionParamGetConnectionParams2, ut6Var, i2);
            }
        } else if (mb5Var instanceof st6) {
            st6 st6Var = (st6) mb5Var;
            ol5 ol5Var3 = this.p;
            String str7 = st6Var.a;
            int i3 = this.n;
            String str8 = st6Var.g;
            String strB3 = this.r.b();
            DyngateID dyngateID = st6Var.f;
            ol5Var3.getClass();
            ClientConnectParams clientConnectParams = new ClientConnectParams();
            clientConnectParams.setConnectionMode(ConnectionMode.RemoteControl.swigValue());
            clientConnectParams.setDestination(str7);
            clientConnectParams.setPartnerSessionID(i3);
            clientConnectParams.setInstantSupportSessionId(str8);
            clientConnectParams.setInstantSupportFlags(1);
            clientConnectParams.setActiveDeviceName(strB3);
            clientConnectParams.setPartnerDyngateId(dyngateID);
            BackendContainerAndroid backendContainerAndroidGetInstance4 = BackendContainerAndroid.GetInstance();
            backendContainerAndroidGetInstance4.GetPartnerlistClientConnector().RemoteControl(clientConnectParams, false, kf4.Unknown.m, null);
            ConnectionParam connectionParamGetConnectionParams3 = backendContainerAndroidGetInstance4.GetClientConnector().GetConnectionParams();
            connectionParamGetConnectionParams3.getClass();
            if (b(connectionParamGetConnectionParams3)) {
                j93 j93Var = this.q;
                j93Var.getClass();
                ae aeVar = ae.g;
                if (aeVar == null) {
                    aeVar = new ae((byte) 7);
                    ae.g = aeVar;
                }
                aeVar.c = connectionParamGetConnectionParams3.getPartnerLicenseFeatures();
                aeVar.d = connectionParamGetConnectionParams3.getMyLicenseFeatures();
                ps6VarE = new ps6(new xt5(connectionParamGetConnectionParams3, st6Var, i3, (d31) j93Var.q), (au6) j93Var.n, (Context) j93Var.f1141o, (EventHub) j93Var.p, (d31) j93Var.q);
            }
        } else if (mb5Var instanceof rt6) {
            rt6 rt6Var = (rt6) mb5Var;
            d31 d31Var2 = this.r;
            ol5 ol5Var4 = this.p;
            int i4 = this.n;
            String str9 = rt6Var.a;
            String str10 = rt6Var.f;
            String strB4 = d31Var2.b();
            ol5Var4.getClass();
            ClientConnectParams clientConnectParams2 = new ClientConnectParams();
            clientConnectParams2.setConnectionMode(ConnectionMode.Filetransfer.swigValue());
            clientConnectParams2.setDestination(str9);
            clientConnectParams2.setPartnerSessionID(i4);
            clientConnectParams2.setActiveDeviceName(strB4);
            clientConnectParams2.setUseEasyAccess(str10);
            BackendContainerAndroid backendContainerAndroidGetInstance5 = BackendContainerAndroid.GetInstance();
            backendContainerAndroidGetInstance5.GetPartnerlistClientConnector().RemoteControl(clientConnectParams2, false, kf4.Unknown.m, null);
            ConnectionParam connectionParamGetConnectionParams4 = backendContainerAndroidGetInstance5.GetClientConnector().GetConnectionParams();
            connectionParamGetConnectionParams4.getClass();
            if (b(connectionParamGetConnectionParams4)) {
                j93 j93Var2 = this.q;
                j93Var2.getClass();
                ps6VarE = new ps6(new wt5(connectionParamGetConnectionParams4, rt6Var, i4, (d31) j93Var2.q), (au6) j93Var2.n, (Context) j93Var2.f1141o, (EventHub) j93Var2.p, (d31) j93Var2.q);
            }
        } else if (mb5Var instanceof tt6) {
            tt6 tt6Var = (tt6) mb5Var;
            ol5 ol5Var5 = this.p;
            String str11 = tt6Var.a;
            int i5 = this.n;
            String str12 = tt6Var.g;
            String str13 = tt6Var.h;
            ol5Var5.getClass();
            BackendContainerAndroid backendContainerAndroidGetInstance6 = BackendContainerAndroid.GetInstance();
            backendContainerAndroidGetInstance6.GetClientConnector().ConnectRaapiSession(str11, i5, str12, str13);
            ConnectionParam connectionParamGetConnectionParams5 = backendContainerAndroidGetInstance6.GetClientConnector().GetConnectionParams();
            if (connectionParamGetConnectionParams5 != null && b(connectionParamGetConnectionParams5)) {
                ps6VarE = this.q.E(connectionParamGetConnectionParams5, tt6Var, i5);
            }
        } else {
            ye4.c("OutgoingConnectSessionThread", "connectNative(): unknown session");
            this.f1249o.e(this.n, i41Var);
        }
        if (ps6VarE != null) {
            au6 au6Var = this.f1249o;
            au6Var.d = ps6VarE;
            ArrayList arrayList = au6Var.n.a;
            for (WeakReference weakReference : lv0.P0(arrayList)) {
                Object obj = weakReference.get();
                if (obj != null) {
                    ps6VarE.n.a.add(new WeakReference(((ot6) ((yt6) obj)).a));
                } else {
                    arrayList.remove(weakReference);
                }
            }
        }
    }
}
