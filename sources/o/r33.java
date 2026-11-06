package o;

import com.teamviewer.commonviewmodel.swig.ViewModelOnlineState;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberListElementViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberListElementViewModelSWIGJNI;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public final class r33 extends oe8 implements n93 {
    public final GroupMemberListElementViewModel n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final nw4 f1888o = new nw4();
    public final nw4 p;
    public final VoidSignalCallback q;

    public r33(GroupMemberListElementViewModel groupMemberListElementViewModel) {
        this.n = groupMemberListElementViewModel;
        nw4 nw4Var = new nw4();
        this.p = nw4Var;
        VoidSignalCallback voidSignalCallback = SignalCallbackFactory.INSTANCE.getInstance().voidSignalCallback(new zz0(this, (byte) 20));
        this.q = voidSignalCallback;
        V0();
        nw4Var.setValue(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetAccountPictureUrl(groupMemberListElementViewModel.a, groupMemberListElementViewModel));
        GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_RegisterForChanges(groupMemberListElementViewModel.a, groupMemberListElementViewModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
    }

    @Override // o.oe8
    public final void U0() {
        this.q.Disconnect();
        this.n.a();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003f  */
    /* JADX WARN: Code duplicated, block: B:19:0x0044  */
    public final void V0() {
        GroupMemberListElementViewModel groupMemberListElementViewModel = this.n;
        s33 s33VarA = s33.a(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetType(groupMemberListElementViewModel.a, groupMemberListElementViewModel));
        int i = s33VarA == null ? -1 : q33.a[s33VarA.ordinal()];
        long j = groupMemberListElementViewModel.a;
        m93 m93Var = m93.m;
        m93 m93Var2 = m93.n;
        m93 m93Var3 = m93.p;
        if (i == 1) {
            ViewModelOnlineState viewModelOnlineStateSwigToEnum = ViewModelOnlineState.swigToEnum(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetOnlineState(j, groupMemberListElementViewModel));
            int i2 = viewModelOnlineStateSwigToEnum != null ? q33.b[viewModelOnlineStateSwigToEnum.ordinal()] : -1;
            if (i2 != 1) {
                if (i2 == 2) {
                    m93Var = m93Var2;
                } else if (i2 != 3) {
                    m93Var = m93Var3;
                } else {
                    m93Var = m93.f1451o;
                }
            }
        } else if (!GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsOnline(j, groupMemberListElementViewModel)) {
            if (GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsMobileWakeActive(groupMemberListElementViewModel.a, groupMemberListElementViewModel)) {
                m93Var = m93Var2;
            } else {
                m93Var = m93Var3;
            }
        }
        this.f1888o.setValue(m93Var);
    }
}
