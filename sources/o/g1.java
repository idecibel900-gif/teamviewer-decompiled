package o;

import com.teamviewer.chatviewmodel.swig.ChatUIModelLocatorAndroid;
import com.teamviewer.chatviewmodel.swig.IStartChatUIModelAndroid;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberId;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberIdSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberListElementViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberListElementViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.RemoteAccessEndpointActivationSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public abstract class g1 extends oe8 {
    public final GroupMemberListElementViewModel n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final nc0 f843o;

    public g1(GroupMemberListElementViewModel groupMemberListElementViewModel, nc0 nc0Var) {
        this.n = groupMemberListElementViewModel;
        this.f843o = nc0Var;
    }

    public void V0() {
        GroupMemberListElementViewModel groupMemberListElementViewModel = this.n;
        GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_ActivateRemoteAccessEndpoint(groupMemberListElementViewModel.a, groupMemberListElementViewModel);
    }

    public final void W0(za3 za3Var) {
        za3Var.getClass();
        GroupMemberListElementViewModel groupMemberListElementViewModel = this.n;
        if (!GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsChatPossible(groupMemberListElementViewModel.a, groupMemberListElementViewModel)) {
            za3Var.c();
            return;
        }
        IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
        if (iStartChatUIModelAndroidGetStartChatUIModelAndroid == null) {
            ye4.a.g("AbstractGroupMemberViewModel", "chatTo: No VM!");
        } else {
            za3Var.a(iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetChatEndPoint(groupMemberListElementViewModel.a, groupMemberListElementViewModel)));
        }
    }

    public void X0(ab3 ab3Var) {
        ab3Var.getClass();
        this.f843o.c(a1(), false);
    }

    public void Y0(ab3 ab3Var) {
        ab3Var.getClass();
        this.f843o.c(a1(), true);
    }

    public void Z0() {
        this.f843o.c(a1(), false);
    }

    public final long a1() {
        GroupMemberListElementViewModel groupMemberListElementViewModel = this.n;
        return GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetID(groupMemberListElementViewModel.a, groupMemberListElementViewModel);
    }

    public final t33 b1() {
        GroupMemberListElementViewModel groupMemberListElementViewModel = this.n;
        s33 s33VarA = s33.a(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetType(groupMemberListElementViewModel.a, groupMemberListElementViewModel));
        s33VarA.getClass();
        int iOrdinal = s33VarA.ordinal();
        if (iOrdinal == 0) {
            return t33.m;
        }
        if (iOrdinal == 1) {
            return t33.n;
        }
        if (iOrdinal == 2) {
            return t33.f2076o;
        }
        gk0.s();
        return null;
    }

    public void c1(RemoteAccessEndpointActivationSignalCallback remoteAccessEndpointActivationSignalCallback) {
        remoteAccessEndpointActivationSignalCallback.getClass();
        GroupMemberListElementViewModel groupMemberListElementViewModel = this.n;
        GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_RegisterForEndpointActivationChanges(groupMemberListElementViewModel.a, groupMemberListElementViewModel, RemoteAccessEndpointActivationSignalCallback.getCPtr(remoteAccessEndpointActivationSignalCallback), remoteAccessEndpointActivationSignalCallback);
    }

    public void d1(GroupMemberId groupMemberId, ev1 ev1Var) {
        groupMemberId.getClass();
        ev1Var.getClass();
        long jGroupMemberId_getMemberId = GroupMemberIdSWIGJNI.GroupMemberId_getMemberId(groupMemberId.a, groupMemberId);
        if (it1.c == null) {
            im3.e0("viewFactory");
            throw null;
        }
        ev1Var.n.z0.x(ep3.k(jGroupMemberId_getMemberId, dd.m));
    }

    public void e1(ab3 ab3Var) {
        ab3Var.getClass();
        nc0.a(a1(), new xc0((Object) ab3Var, (byte) 4));
    }
}
