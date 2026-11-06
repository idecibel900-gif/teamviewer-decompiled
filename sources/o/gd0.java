package o;

import com.teamviewer.remotecontrollib.swig.partnerlist.PListDyngateID;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListDyngateIDSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListGroupID;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ComputerDetailsViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ComputerDetailsViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupListElementViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupListElementViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberListElementViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberListElementViewModelSWIGJNI;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class gd0 implements v93 {
    public final kc0 a;
    public final g1 b;
    public final nw4 c = new nw4();
    public final nw4 d = new nw4();
    public final nw4 e = new nw4();
    public final nw4 f = new nw4();
    public final nw4 g = new nw4();
    public final nw4 h = new nw4();
    public final nw4 i = new nw4();
    public final nw4 j = new nw4();
    public final nw4 k = new nw4();
    public final nw4 l = new nw4();
    public final nw4 m = new nw4();
    public final nw4 n = new nw4();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final VoidSignalCallback f882o;
    public final VoidSignalCallback p;

    public gd0(kc0 kc0Var, g1 g1Var) {
        this.a = kc0Var;
        this.b = g1Var;
        SignalCallbackFactory.Companion companion = SignalCallbackFactory.INSTANCE;
        final byte b = 0;
        VoidSignalCallback voidSignalCallback = companion.getInstance().voidSignalCallback(new Function0(this) { // from class: o.fd0
            public final /* synthetic */ gd0 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b2 = b;
                f88 f88Var = f88.a;
                gd0 gd0Var = this.n;
                switch (b2) {
                    case 0:
                        gd0Var.c();
                        break;
                    default:
                        gd0Var.m();
                        break;
                }
                return f88Var;
            }
        });
        this.f882o = voidSignalCallback;
        final byte b2 = 1;
        VoidSignalCallback voidSignalCallback2 = companion.getInstance().voidSignalCallback(new Function0(this) { // from class: o.fd0
            public final /* synthetic */ gd0 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b3 = b2;
                f88 f88Var = f88.a;
                gd0 gd0Var = this.n;
                switch (b3) {
                    case 0:
                        gd0Var.c();
                        break;
                    default:
                        gd0Var.m();
                        break;
                }
                return f88Var;
            }
        });
        this.p = voidSignalCallback2;
        c();
        m();
        ComputerDetailsViewModel computerDetailsViewModel = kc0Var.n;
        ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_RegisterForChanges(computerDetailsViewModel.a, computerDetailsViewModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
        GroupMemberListElementViewModel groupMemberListElementViewModel = g1Var.n;
        GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_RegisterForChanges(groupMemberListElementViewModel.a, groupMemberListElementViewModel, VoidSignalCallback.getCPtr(voidSignalCallback2), voidSignalCallback2);
    }

    @Override // o.v93
    public final nw4 a() {
        return this.k;
    }

    @Override // o.v93
    public final nw4 b() {
        return this.n;
    }

    @Override // o.v93
    public final void c() {
        ComputerDetailsViewModel computerDetailsViewModel = this.a.n;
        String strComputerDetailsViewModel_GetDisplayName = ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_GetDisplayName(computerDetailsViewModel.a, computerDetailsViewModel);
        strComputerDetailsViewModel_GetDisplayName.getClass();
        this.c.setValue(strComputerDetailsViewModel_GetDisplayName);
        GroupListElementViewModel groupListElementViewModelK = ds1.k(new PListGroupID(0, ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_GetGroupID(computerDetailsViewModel.a, computerDetailsViewModel)));
        if (groupListElementViewModelK != null) {
            this.d.setValue(GroupListElementViewModelSWIGJNI.GroupListElementViewModel_GetName(groupListElementViewModelK.c, groupListElementViewModelK));
        }
        PListDyngateID pListDyngateID = new PListDyngateID(ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_GetDyngateID(computerDetailsViewModel.a, computerDetailsViewModel), true);
        this.e.setValue(PListDyngateIDSWIGJNI.PListDyngateID_GetAsString(pListDyngateID.a, pListDyngateID));
        String strComputerDetailsViewModel_GetNote = ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_GetNote(computerDetailsViewModel.a, computerDetailsViewModel);
        strComputerDetailsViewModel_GetNote.getClass();
        this.f.setValue(strComputerDetailsViewModel_GetNote);
        this.g.setValue("");
    }

    @Override // o.v93
    public final nw4 d() {
        return this.m;
    }

    @Override // o.v93
    public final nw4 e() {
        return this.c;
    }

    @Override // o.v93
    public final nw4 f() {
        return this.f;
    }

    @Override // o.v93
    public final nw4 g() {
        return this.d;
    }

    @Override // o.v93
    public final nw4 h() {
        return this.g;
    }

    @Override // o.v93
    public final nw4 i() {
        return this.i;
    }

    @Override // o.v93
    public final nw4 j() {
        return this.l;
    }

    @Override // o.v93
    public final void k(gv1 gv1Var) {
        ComputerDetailsViewModel computerDetailsViewModel = this.a.n;
        jc0 jc0Var = new jc0(new WeakReference(gv1Var), (byte) 0);
        ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_RegisterForDeviceDelete(computerDetailsViewModel.a, computerDetailsViewModel, VoidSignalCallback.getCPtr((VoidSignalCallback) jc0Var), jc0Var);
    }

    @Override // o.v93
    public final nw4 l() {
        return this.h;
    }

    @Override // o.v93
    public final void m() {
        GroupMemberListElementViewModel groupMemberListElementViewModel = this.b.n;
        this.h.setValue(Boolean.valueOf(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_ShowConnect(groupMemberListElementViewModel.a, groupMemberListElementViewModel)));
        this.i.setValue(Boolean.valueOf(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_ShowConnectConfirm(groupMemberListElementViewModel.a, groupMemberListElementViewModel)));
        this.j.setValue(Boolean.valueOf(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_ShowConnectRemoteAccess(groupMemberListElementViewModel.a, groupMemberListElementViewModel) || GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_ShowActivateRemoteAccessEndpoint(groupMemberListElementViewModel.a, groupMemberListElementViewModel)));
        this.k.setValue(Boolean.valueOf(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_ShowFileTransfer(groupMemberListElementViewModel.a, groupMemberListElementViewModel)));
        this.l.setValue(Boolean.valueOf(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_ShowChatTo(groupMemberListElementViewModel.a, groupMemberListElementViewModel)));
        this.m.setValue(Boolean.valueOf(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_ShowWakeOnLan(groupMemberListElementViewModel.a, groupMemberListElementViewModel)));
        this.n.setValue(Boolean.valueOf(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_ShouldShowAlarmsOverview(groupMemberListElementViewModel.a, groupMemberListElementViewModel)));
    }

    @Override // o.v93
    public final nw4 n() {
        return this.j;
    }

    @Override // o.v93
    public final nw4 o() {
        return this.e;
    }
}
