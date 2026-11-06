package o;

import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberId;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberIdSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IGroupMemberListSearchViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IGroupMemberListSearchViewModelSWIGJNI;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class we0 extends oe8 implements aa3 {
    public final IGroupMemberListSearchViewModel n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final LinkedHashSet f2402o = new LinkedHashSet();
    public final VoidSignalCallback p = SignalCallbackFactory.INSTANCE.getInstance().voidSignalCallback(new y(this, 23));

    public we0(IGroupMemberListSearchViewModel iGroupMemberListSearchViewModel) {
        this.n = iGroupMemberListSearchViewModel;
    }

    @Override // o.oe8
    public final void U0() {
        this.p.Disconnect();
        this.n.a();
    }

    public final z93 V0(int i) {
        t33 t33Var;
        IGroupMemberListSearchViewModel iGroupMemberListSearchViewModel = this.n;
        long jIGroupMemberListSearchViewModel_GetItemIdAtPosition = IGroupMemberListSearchViewModelSWIGJNI.IGroupMemberListSearchViewModel_GetItemIdAtPosition(iGroupMemberListSearchViewModel.a, iGroupMemberListSearchViewModel, i);
        GroupMemberId groupMemberId = jIGroupMemberListSearchViewModel_GetItemIdAtPosition == 0 ? null : new GroupMemberId(jIGroupMemberListSearchViewModel_GetItemIdAtPosition);
        if (groupMemberId == null) {
            return null;
        }
        long jGroupMemberId_getMemberId = GroupMemberIdSWIGJNI.GroupMemberId_getMemberId(groupMemberId.a, groupMemberId);
        s33 s33VarA = s33.a(GroupMemberIdSWIGJNI.GroupMemberId_getType(groupMemberId.a, groupMemberId));
        s33VarA.getClass();
        int iOrdinal = s33VarA.ordinal();
        if (iOrdinal == 0) {
            t33Var = t33.m;
        } else if (iOrdinal == 1) {
            t33Var = t33.n;
        } else {
            if (iOrdinal != 2) {
                gk0.s();
                return null;
            }
            t33Var = t33.f2076o;
        }
        return new z93(jGroupMemberId_getMemberId, t33Var);
    }
}
