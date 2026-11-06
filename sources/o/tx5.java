package o;

import com.teamviewer.remotecontrolviewmodellib.swig.IQRCodeMDV2AssignmentViewModelClient;
import com.teamviewer.remotecontrolviewmodellib.swig.IQRCodeMDV2AssignmentViewModelClientSWIGJNI;
import com.teamviewer.swigcallbacklib.IntSignalCallback;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class tx5 extends oe8 {
    public final yx6 A;
    public final yx6 B;
    public String C;
    public List D;
    public final be0 E;
    public final az4 F;
    public final az4 G;
    public final az4 H;
    public final az4 I;
    public final az4 J;
    public final az4 K;
    public final IQRCodeMDV2AssignmentViewModelClient n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ol5 f2153o;
    public final bg5 p;
    public final bg5 q;
    public final bg5 r;
    public final bg5 s;
    public final bg5 t;
    public final bg5 u;
    public final yx6 v;
    public final yx6 w;
    public final yx6 x;
    public final yx6 y;
    public final yx6 z;

    public tx5(IQRCodeMDV2AssignmentViewModelClient iQRCodeMDV2AssignmentViewModelClient) {
        ol5 ol5Var = new ol5((byte) 5);
        this.n = iQRCodeMDV2AssignmentViewModelClient;
        this.f2153o = ol5Var;
        Boolean bool = Boolean.FALSE;
        this.p = h57.p(bool);
        this.q = h57.p(bool);
        this.r = h57.p(bool);
        this.s = h57.p(null);
        this.t = h57.p(null);
        this.u = h57.p(bool);
        this.v = au8.l(0, 7, null);
        this.w = au8.l(0, 7, null);
        this.x = au8.l(0, 7, null);
        this.y = au8.l(0, 7, null);
        this.z = au8.l(0, 7, null);
        this.A = au8.l(0, 7, null);
        this.B = au8.l(0, 7, null);
        this.C = "";
        this.D = ea2.m;
        be0 be0Var = new be0(new qx5(this, (byte) 0), (byte) 1);
        this.E = be0Var;
        az4 az4Var = new az4(new rx5(this, (byte) 0), (byte) 7);
        this.F = az4Var;
        az4 az4Var2 = new az4(new rx5(this, (byte) 1), (byte) 8);
        this.G = az4Var2;
        az4 az4Var3 = new az4(new rx5(this, (byte) 2), (byte) 6);
        this.H = az4Var3;
        az4 az4Var4 = new az4(new rx5(this, (byte) 3), (byte) 5);
        this.I = az4Var4;
        az4 az4Var5 = new az4(new rx5(this, (byte) 4), (byte) 4);
        this.J = az4Var5;
        az4 az4Var6 = new az4(new rx5(this, (byte) 5), (byte) 3);
        this.K = az4Var6;
        IQRCodeMDV2AssignmentViewModelClientSWIGJNI.IQRCodeMDV2AssignmentViewModelClient_RegisterForDisplayPinInput(iQRCodeMDV2AssignmentViewModelClient.a, iQRCodeMDV2AssignmentViewModelClient, VoidSignalCallback.getCPtr((VoidSignalCallback) az4Var), az4Var);
        IQRCodeMDV2AssignmentViewModelClientSWIGJNI.IQRCodeMDV2AssignmentViewModelClient_RegisterForUpdateFailedAttempts(iQRCodeMDV2AssignmentViewModelClient.a, iQRCodeMDV2AssignmentViewModelClient, IntSignalCallback.getCPtr((IntSignalCallback) be0Var), be0Var);
        IQRCodeMDV2AssignmentViewModelClientSWIGJNI.IQRCodeMDV2AssignmentViewModelClient_RegisterForInvalidQRCode(iQRCodeMDV2AssignmentViewModelClient.a, iQRCodeMDV2AssignmentViewModelClient, VoidSignalCallback.getCPtr((VoidSignalCallback) az4Var3), az4Var3);
        IQRCodeMDV2AssignmentViewModelClientSWIGJNI.IQRCodeMDV2AssignmentViewModelClient_RegisterForExpiredQRCode(iQRCodeMDV2AssignmentViewModelClient.a, iQRCodeMDV2AssignmentViewModelClient, VoidSignalCallback.getCPtr((VoidSignalCallback) az4Var4), az4Var4);
        IQRCodeMDV2AssignmentViewModelClientSWIGJNI.IQRCodeMDV2AssignmentViewModelClient_RegisterForValidationSuccess(iQRCodeMDV2AssignmentViewModelClient.a, iQRCodeMDV2AssignmentViewModelClient, VoidSignalCallback.getCPtr((VoidSignalCallback) az4Var2), az4Var2);
        IQRCodeMDV2AssignmentViewModelClientSWIGJNI.IQRCodeMDV2AssignmentViewModelClient_RegisterForProcessIsCanceledByTimeout(iQRCodeMDV2AssignmentViewModelClient.a, iQRCodeMDV2AssignmentViewModelClient, VoidSignalCallback.getCPtr((VoidSignalCallback) az4Var6), az4Var6);
        IQRCodeMDV2AssignmentViewModelClientSWIGJNI.IQRCodeMDV2AssignmentViewModelClient_RegisterForProcessIsCanceledByUser(iQRCodeMDV2AssignmentViewModelClient.a, iQRCodeMDV2AssignmentViewModelClient, VoidSignalCallback.getCPtr((VoidSignalCallback) az4Var5), az4Var5);
    }

    @Override // o.oe8
    public final void U0() {
        this.F.Disconnect();
        this.E.Disconnect();
        this.H.Disconnect();
        this.I.Disconnect();
        this.G.Disconnect();
        this.K.Disconnect();
        this.J.Disconnect();
        this.n.a();
    }

    public final void V0() {
        IQRCodeMDV2AssignmentViewModelClient iQRCodeMDV2AssignmentViewModelClient = this.n;
        IQRCodeMDV2AssignmentViewModelClientSWIGJNI.IQRCodeMDV2AssignmentViewModelClient_CancelAssignment(iQRCodeMDV2AssignmentViewModelClient.a, iQRCodeMDV2AssignmentViewModelClient);
        UUID uuid = (UUID) this.t.getValue();
        hc1 hc1Var = null;
        if (uuid != null) {
            im3.R(e8.n(this), null, null, new bj((Object) uuid, (Object) this, hc1Var, (byte) 16), 3);
        }
        this.C = "";
        Boolean bool = Boolean.FALSE;
        this.r.setValue(bool);
        this.s.setValue(null);
        this.p.setValue(bool);
        this.u.setValue(bool);
    }
}
