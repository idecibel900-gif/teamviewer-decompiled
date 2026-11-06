package o;

import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;
import com.teamviewer.teamviewerlib.swig.tvpartnerlistconnection.ConnectionParam;
import com.teamviewer.teamviewerlib.swig.tvsessionprotocol.ConnectionMode;

/* JADX INFO: loaded from: classes.dex */
public final class xt5 extends du6 {
    public final String u;
    public final String v;
    public final boolean w;
    public final dk7 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xt5(ConnectionParam connectionParam, st6 st6Var, int i, d31 d31Var) {
        super(ConnectionMode.RemoteControl, connectionParam, st6Var, i);
        st6Var.getClass();
        d31Var.getClass();
        this.u = st6Var.g;
        this.v = st6Var.b;
        this.m = d31Var.b();
        this.f = connectionParam.getActionId();
        this.g = connectionParam.getTimeoutSecs();
        DyngateID destClientId = connectionParam.getDestClientId();
        destClientId.getClass();
        DyngateID dyngateIDM20clone = destClientId.m20clone();
        dyngateIDM20clone.getClass();
        this.j = dyngateIDM20clone;
        this.w = true;
        this.x = dk7.InstantSupport;
    }

    @Override // o.du6
    public final dk7 a() {
        return this.x;
    }

    @Override // o.du6
    public final boolean c() {
        return this.w;
    }
}
