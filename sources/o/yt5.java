package o;

import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;
import com.teamviewer.teamviewerlib.swig.tvpartnerlistconnection.ConnectionParam;
import com.teamviewer.teamviewerlib.swig.tvsessionprotocol.ConnectionMode;

/* JADX INFO: loaded from: classes.dex */
public final class yt5 extends du6 {
    public final dk7 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yt5(ConnectionParam connectionParam, mb5 mb5Var, int i, d31 d31Var) {
        super(ConnectionMode.RemoteControl, connectionParam, mb5Var, i);
        mb5Var.getClass();
        d31Var.getClass();
        this.u = dk7.RemoteControlActive;
        this.m = d31Var.b();
        this.f = connectionParam.getActionId();
        this.g = connectionParam.getTimeoutSecs();
        DyngateID destClientId = connectionParam.getDestClientId();
        destClientId.getClass();
        DyngateID dyngateIDM20clone = destClientId.m20clone();
        dyngateIDM20clone.getClass();
        this.j = dyngateIDM20clone;
        if (mb5Var.d) {
            this.n = true;
        }
    }

    @Override // o.du6
    public final dk7 a() {
        return this.u;
    }

    @Override // o.du6
    public final boolean b() {
        mb5 mb5Var = this.b;
        if (mb5Var instanceof tt6) {
            return true;
        }
        return (mb5Var instanceof wt6) && !((wt6) mb5Var).h;
    }

    @Override // o.du6
    public final boolean c() {
        return !this.n;
    }
}
