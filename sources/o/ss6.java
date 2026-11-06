package o;

import com.teamviewer.remotecontrollib.swig.INativeSessionHandler;
import com.teamviewer.remotecontrollib.swig.INativeSessionHandlerSWIGJNI;
import com.teamviewer.remotecontrollib.swig.NativeSessionHandlerFactorySWIGJNI;
import com.teamviewer.remotecontrollib.swig.SessionPropertiesWrapper;
import com.teamviewer.remotecontrollib.swig.SessionPropertiesWrapperSWIGJNI;
import com.teamviewer.swigcallbacklib.IntSignalCallback;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import com.teamviewer.teamviewerlib.network.InterProcessGUIConnector;
import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;
import com.teamviewer.teamviewerlib.swig.tvmodularsessiontypes.ModularSessionType;
import com.teamviewer.teamviewerlib.swig.tvsessionprotocol.ConnectionMode;
import com.teamviewer.teamviewerlib.swig.tvstream.KnownStreams;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ss6 implements mo7, g71 {
    public final yu6 m;
    public final fz4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ps6 f2050o;
    public final xt6 p;
    public final du6 q;
    public final x84 r;

    public ss6(yu6 yu6Var, fz4 fz4Var, ps6 ps6Var, xt6 xt6Var, du6 du6Var) {
        INativeSessionHandler iNativeSessionHandler;
        yu6Var.getClass();
        ps6Var.getClass();
        this.m = yu6Var;
        this.n = fz4Var;
        this.f2050o = ps6Var;
        this.p = xt6Var;
        this.q = du6Var;
        new ArrayList();
        zt6 zt6Var = (zt6) xt6Var;
        zt6Var.f = this;
        zt6Var.j = false;
        zt6Var.e.N(this);
        fz4Var.d = this;
        if (fz4Var.c == null) {
            ye4.a("NativeSessionHandoverManager", "Create new native session handler instance");
            IntSignalCallback intSignalCallback = fz4Var.e;
            VoidSignalCallback voidSignalCallback = fz4Var.f;
            long jNativeSessionHandlerFactory_CreateNativeSessionHandler = NativeSessionHandlerFactorySWIGJNI.NativeSessionHandlerFactory_CreateNativeSessionHandler(IntSignalCallback.getCPtr(intSignalCallback), intSignalCallback, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
            if (jNativeSessionHandlerFactory_CreateNativeSessionHandler == 0) {
                iNativeSessionHandler = null;
            } else {
                iNativeSessionHandler = new INativeSessionHandler();
                iNativeSessionHandler.b = true;
                iNativeSessionHandler.a = jNativeSessionHandlerFactory_CreateNativeSessionHandler;
            }
            fz4Var.c = iNativeSessionHandler;
        }
        long jNew_SessionPropertiesWrapper = SessionPropertiesWrapperSWIGJNI.new_SessionPropertiesWrapper();
        SessionPropertiesWrapper sessionPropertiesWrapper = new SessionPropertiesWrapper();
        sessionPropertiesWrapper.b = true;
        sessionPropertiesWrapper.a = jNew_SessionPropertiesWrapper;
        SessionPropertiesWrapperSWIGJNI.SessionPropertiesWrapper_actionId_set(jNew_SessionPropertiesWrapper, sessionPropertiesWrapper, du6Var.f);
        SessionPropertiesWrapperSWIGJNI.SessionPropertiesWrapper_sessionId_set(sessionPropertiesWrapper.a, sessionPropertiesWrapper, du6Var.c);
        DyngateID dyngateID = du6Var.j;
        SessionPropertiesWrapperSWIGJNI.SessionPropertiesWrapper_targetTeamViewerId_set(sessionPropertiesWrapper.a, sessionPropertiesWrapper, DyngateID.getCPtr(dyngateID), dyngateID);
        ae aeVar = ae.g;
        if (aeVar == null) {
            aeVar = new ae((byte) 7);
            ae.g = aeVar;
        }
        BitSet bitSet = (BitSet) aeVar.d;
        if (bitSet != null) {
            SessionPropertiesWrapperSWIGJNI.SessionPropertiesWrapper_ownLicenseFeatures_set(sessionPropertiesWrapper.a, sessionPropertiesWrapper, mo8.x(bitSet));
        }
        ConnectionMode connectionMode = du6Var.a;
        ModularSessionType modularSessionType = du6Var.t;
        ModularSessionType modularSessionType2 = modularSessionType == null ? new ModularSessionType() : modularSessionType;
        InterProcessGUIConnector.a.jniStartIgnoringCommands();
        INativeSessionHandler iNativeSessionHandler2 = fz4Var.c;
        if (iNativeSessionHandler2 != null) {
            INativeSessionHandlerSWIGJNI.INativeSessionHandler_EnableSession(iNativeSessionHandler2.a, iNativeSessionHandler2, yu6Var.m, sessionPropertiesWrapper.a, sessionPropertiesWrapper, ModularSessionType.getCPtr(modularSessionType2), modularSessionType2, connectionMode.swigValue());
        }
        ConnectionMode connectionMode2 = du6Var.a;
        bk7 bk7Var = bk7.TVCmdConnectionMode;
        KnownStreams knownStreams = KnownStreams.DefaultStream_Misc;
        ak7 ak7VarN = fx3.n(knownStreams, bk7Var, knownStreams);
        ak7VarN.d(yi7.Mode, connectionMode2.swigValue());
        ps6Var.e(ak7VarN);
        this.r = new x84(this, true);
    }

    @Override // o.g71
    public final void a(ha7 ha7Var) {
    }

    @Override // o.mo7
    public final boolean d() {
        return false;
    }

    @Override // o.g71
    public final void destroy() {
        bu7.MAIN.a(new rs6(this, (byte) 0));
    }

    @Override // o.g71
    public final void e(ak7 ak7Var) {
    }

    @Override // o.mo7
    public final void h(ys6 ys6Var) {
        this.f2050o.c(this, ys6Var);
        Iterator it = ((zt6) this.p).b().iterator();
        while (it.hasNext()) {
            ((u2) it.next()).d(this);
        }
    }

    @Override // o.mo7
    public final void n(i41 i41Var) {
        ps6 ps6Var = this.f2050o;
        ps6Var.getClass();
        ps6Var.g(i41Var);
    }

    @Override // o.mo7
    public final ConnectionMode p() {
        return ConnectionMode.Unknown;
    }

    @Override // o.mo7
    public final void start() {
        bu7.MAIN.a(new rs6(this, (byte) 1));
        int i = this.q.c;
        INativeSessionHandler iNativeSessionHandler = this.n.c;
        if (iNativeSessionHandler != null) {
            INativeSessionHandlerSWIGJNI.INativeSessionHandler_StartSession(iNativeSessionHandler.a, iNativeSessionHandler, i);
        }
    }

    @Override // o.mo7
    public final du6 t() {
        return this.q;
    }

    @Override // o.mo7
    public final int w() {
        return this.q.c;
    }

    @Override // o.mo7
    public final void y() {
    }

    @Override // androidx.lifecycle.LifecycleOwner
    /* JADX INFO: renamed from: z */
    public final x84 getR() {
        return this.r;
    }
}
