package o;

import androidx.lifecycle.LiveData;
import com.teamviewer.nativelivedatalib.swig.NativeLiveDataString;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupListViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberListViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberListViewModelSWIGJNI;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class bd0 extends oe8 implements u93 {
    public final GroupMemberListViewModel n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final GroupListViewModel f415o;
    public final nw4 p;
    public final nw4 q;
    public final nw4 r;
    public final LiveData s;
    public final VoidSignalCallback t;
    public final VoidSignalCallback u;

    public bd0(GroupMemberListViewModel groupMemberListViewModel, GroupListViewModel groupListViewModel) {
        Object objValueOf = Double.valueOf(0.0d);
        final byte b = 0;
        this.n = groupMemberListViewModel;
        this.f415o = groupListViewModel;
        final byte b2 = 1;
        this.p = new nw4(Boolean.valueOf(groupMemberListViewModel == null));
        this.q = new nw4();
        this.r = new nw4();
        LiveData liveDataNewInstance = groupMemberListViewModel != null ? NativeLiveDataString.newInstance(GroupMemberListViewModelSWIGJNI.GroupMemberListViewModel_GroupNameChanged(groupMemberListViewModel.a, groupMemberListViewModel), false) : null;
        wt3 wt3VarB = w86.a.b(String.class);
        String str = "";
        if (!wt3VarB.o("")) {
            Object obj = Boolean.FALSE;
            if (wt3VarB.o(obj)) {
                str = (String) obj;
            } else if (wt3VarB.o(0)) {
                str = (String) 0;
            } else if (wt3VarB.o(objValueOf)) {
                str = (String) objValueOf;
            } else {
                if (!wt3VarB.o(0L)) {
                    yq4.f();
                    throw null;
                }
                str = (String) 0L;
            }
        }
        this.s = liveDataNewInstance == null ? new nw4(str) : liveDataNewInstance;
        SignalCallbackFactory.Companion companion = SignalCallbackFactory.INSTANCE;
        VoidSignalCallback voidSignalCallback = companion.getInstance().voidSignalCallback(new Function0(this) { // from class: o.ad0
            public final /* synthetic */ bd0 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b3 = b;
                f88 f88Var = f88.a;
                bd0 bd0Var = this.n;
                switch (b3) {
                    case 0:
                        GroupMemberListViewModel groupMemberListViewModel2 = bd0Var.n;
                        if (groupMemberListViewModel2 != null) {
                            bd0Var.q.setValue(Boolean.valueOf(us1.R(GroupMemberListViewModelSWIGJNI.GroupMemberListViewModel_GetSize(groupMemberListViewModel2.a, groupMemberListViewModel2, 1)) + us1.R(GroupMemberListViewModelSWIGJNI.GroupMemberListViewModel_GetSize(groupMemberListViewModel2.a, groupMemberListViewModel2, 0)) != 0));
                        }
                        break;
                    default:
                        bd0Var.r.setValue(Boolean.TRUE);
                        break;
                }
                return f88Var;
            }
        });
        this.t = voidSignalCallback;
        VoidSignalCallback voidSignalCallback2 = companion.getInstance().voidSignalCallback(new Function0(this) { // from class: o.ad0
            public final /* synthetic */ bd0 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b3 = b2;
                f88 f88Var = f88.a;
                bd0 bd0Var = this.n;
                switch (b3) {
                    case 0:
                        GroupMemberListViewModel groupMemberListViewModel2 = bd0Var.n;
                        if (groupMemberListViewModel2 != null) {
                            bd0Var.q.setValue(Boolean.valueOf(us1.R(GroupMemberListViewModelSWIGJNI.GroupMemberListViewModel_GetSize(groupMemberListViewModel2.a, groupMemberListViewModel2, 1)) + us1.R(GroupMemberListViewModelSWIGJNI.GroupMemberListViewModel_GetSize(groupMemberListViewModel2.a, groupMemberListViewModel2, 0)) != 0));
                        }
                        break;
                    default:
                        bd0Var.r.setValue(Boolean.TRUE);
                        break;
                }
                return f88Var;
            }
        });
        this.u = voidSignalCallback2;
        if (groupMemberListViewModel != null) {
            GroupMemberListViewModelSWIGJNI.GroupMemberListViewModel_RegisterForChanges(groupMemberListViewModel.a, groupMemberListViewModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
        }
        if (groupMemberListViewModel != null) {
            GroupMemberListViewModelSWIGJNI.GroupMemberListViewModel_RegisterForDelete(groupMemberListViewModel.a, groupMemberListViewModel, VoidSignalCallback.getCPtr(voidSignalCallback2), voidSignalCallback2);
        }
    }

    @Override // o.oe8
    public final void U0() {
        this.u.Disconnect();
        this.t.Disconnect();
        GroupMemberListViewModel groupMemberListViewModel = this.n;
        if (groupMemberListViewModel != null) {
            groupMemberListViewModel.a();
        }
        GroupListViewModel groupListViewModel = this.f415o;
        if (groupListViewModel != null) {
            groupListViewModel.b();
        }
    }

    public final int V0(int i) {
        if (i == 0) {
            throw null;
        }
        GroupMemberListViewModel groupMemberListViewModel = this.n;
        if (groupMemberListViewModel != null) {
            return us1.R(GroupMemberListViewModelSWIGJNI.GroupMemberListViewModel_GetSize(groupMemberListViewModel.a, groupMemberListViewModel, e41.d(i) ? 1 : 0));
        }
        return 0;
    }
}
