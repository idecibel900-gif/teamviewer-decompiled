package o;

import androidx.lifecycle.LiveData;
import com.teamviewer.nativelivedatalib.swig.NativeLiveDataString;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberListViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberListViewModelSWIGJNI;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class ec0 extends oe8 implements s93 {
    public final GroupMemberListViewModel n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final LiveData f702o;
    public final qf2 p;
    public final VoidSignalCallback q;

    public ec0(GroupMemberListViewModel groupMemberListViewModel) {
        Object objValueOf = Double.valueOf(0.0d);
        final byte b = 0;
        this.n = groupMemberListViewModel;
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
        this.f702o = liveDataNewInstance == null ? new nw4(str) : liveDataNewInstance;
        this.p = new qf2(new Function0(this) { // from class: o.dc0
            public final /* synthetic */ ec0 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b2 = b;
                ec0 ec0Var = this.n;
                switch (b2) {
                    case 0:
                        GroupMemberListViewModel groupMemberListViewModel2 = ec0Var.n;
                        return Integer.valueOf((groupMemberListViewModel2 != null ? us1.R(GroupMemberListViewModelSWIGJNI.GroupMemberListViewModel_GetSize(groupMemberListViewModel2.a, groupMemberListViewModel2, 0)) : 0) + (groupMemberListViewModel2 != null ? us1.R(GroupMemberListViewModelSWIGJNI.GroupMemberListViewModel_GetSize(groupMemberListViewModel2.a, groupMemberListViewModel2, 1)) : 0));
                    default:
                        qf2 qf2Var = ec0Var.p;
                        qf2Var.postValue(qf2Var.a.a());
                        return f88.a;
                }
            }
        });
        final byte b2 = 1;
        VoidSignalCallback voidSignalCallback = SignalCallbackFactory.INSTANCE.getInstance().voidSignalCallback(new Function0(this) { // from class: o.dc0
            public final /* synthetic */ ec0 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b3 = b2;
                ec0 ec0Var = this.n;
                switch (b3) {
                    case 0:
                        GroupMemberListViewModel groupMemberListViewModel2 = ec0Var.n;
                        return Integer.valueOf((groupMemberListViewModel2 != null ? us1.R(GroupMemberListViewModelSWIGJNI.GroupMemberListViewModel_GetSize(groupMemberListViewModel2.a, groupMemberListViewModel2, 0)) : 0) + (groupMemberListViewModel2 != null ? us1.R(GroupMemberListViewModelSWIGJNI.GroupMemberListViewModel_GetSize(groupMemberListViewModel2.a, groupMemberListViewModel2, 1)) : 0));
                    default:
                        qf2 qf2Var = ec0Var.p;
                        qf2Var.postValue(qf2Var.a.a());
                        return f88.a;
                }
            }
        });
        this.q = voidSignalCallback;
        if (groupMemberListViewModel != null) {
            GroupMemberListViewModelSWIGJNI.GroupMemberListViewModel_RegisterForChanges(groupMemberListViewModel.a, groupMemberListViewModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
        }
    }

    @Override // o.oe8
    public final void U0() {
        this.q.Disconnect();
        GroupMemberListViewModel groupMemberListViewModel = this.n;
        if (groupMemberListViewModel != null) {
            groupMemberListViewModel.a();
        }
    }
}
