package o;

import android.os.Bundle;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberId;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberIdSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.RemoteAccessEndpointActivationSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public final class re0 extends g1 {
    @Override // o.g1
    public final void V0() {
    }

    @Override // o.g1
    public final void X0(ab3 ab3Var) {
        ab3Var.getClass();
        this.f843o.e(a1(), false, new xc0((Object) ab3Var, (byte) 4));
    }

    @Override // o.g1
    public final void Y0(ab3 ab3Var) {
        ab3Var.getClass();
        this.f843o.e(a1(), true, new xc0((Object) ab3Var, (byte) 4));
    }

    @Override // o.g1
    public final void Z0() {
    }

    @Override // o.g1
    public final void c1(RemoteAccessEndpointActivationSignalCallback remoteAccessEndpointActivationSignalCallback) {
        remoteAccessEndpointActivationSignalCallback.getClass();
    }

    @Override // o.g1
    public final void d1(GroupMemberId groupMemberId, ev1 ev1Var) {
        groupMemberId.getClass();
        ev1Var.getClass();
        long jGroupMemberId_getMemberId = GroupMemberIdSWIGJNI.GroupMemberId_getMemberId(groupMemberId.a, groupMemberId);
        if (it1.c == null) {
            im3.e0("viewFactory");
            throw null;
        }
        ie0 ie0Var = new ie0();
        Bundle bundle = new Bundle();
        bundle.putLong("BuddyId", jGroupMemberId_getMemberId);
        bundle.putBoolean("ExpandToolbar", true);
        ie0Var.u0(bundle);
        ev1Var.n.z0.x(ie0Var);
    }
}
