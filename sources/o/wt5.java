package o;

import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;
import com.teamviewer.teamviewerlib.swig.tvpartnerlistconnection.ConnectionParam;
import com.teamviewer.teamviewerlib.swig.tvsessionprotocol.ConnectionMode;

/* JADX INFO: loaded from: classes.dex */
public final class wt5 extends du6 {
    public final dk7 u;
    public final boolean v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wt5(ConnectionParam connectionParam, rt6 rt6Var, int i, d31 d31Var) {
        super(ConnectionMode.Filetransfer, connectionParam, rt6Var, i);
        rt6Var.getClass();
        d31Var.getClass();
        this.u = dk7.FileTransferActive;
        this.v = true;
        this.m = d31Var.b();
        this.f = connectionParam.getActionId();
        this.g = connectionParam.getTimeoutSecs();
        DyngateID destClientId = connectionParam.getDestClientId();
        destClientId.getClass();
        DyngateID dyngateIDM20clone = destClientId.m20clone();
        dyngateIDM20clone.getClass();
        this.j = dyngateIDM20clone;
        if (rt6Var.d) {
            this.n = true;
        }
    }

    @Override // o.du6
    public final dk7 a() {
        return this.u;
    }

    @Override // o.du6
    public final boolean b() {
        return this.v;
    }
}
