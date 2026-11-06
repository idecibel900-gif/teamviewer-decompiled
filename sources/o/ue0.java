package o;

import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IGroupMemberListSearchViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IGroupMemberListSearchViewModelSWIGJNI;

/* JADX INFO: loaded from: classes.dex */
public final class ue0 implements wl7, ze0, dm6 {
    public final /* synthetic */ ve0 m;

    public /* synthetic */ ue0(ve0 ve0Var) {
        this.m = ve0Var;
    }

    @Override // o.ze0
    public void g(gk7 gk7Var) {
        gk7.O0(gk7Var, this.m.C());
    }

    @Override // o.dm6
    public boolean h(String str) {
        str.getClass();
        aa3 aa3Var = this.m.z0;
        if (aa3Var == null) {
            return true;
        }
        IGroupMemberListSearchViewModel iGroupMemberListSearchViewModel = ((we0) aa3Var).n;
        IGroupMemberListSearchViewModelSWIGJNI.IGroupMemberListSearchViewModel_UpdateSearch(iGroupMemberListSearchViewModel.a, iGroupMemberListSearchViewModel, str);
        return true;
    }

    @Override // o.dm6
    public boolean i(String str) {
        str.getClass();
        aa3 aa3Var = this.m.z0;
        if (aa3Var == null) {
            return true;
        }
        IGroupMemberListSearchViewModel iGroupMemberListSearchViewModel = ((we0) aa3Var).n;
        IGroupMemberListSearchViewModelSWIGJNI.IGroupMemberListSearchViewModel_UpdateSearch(iGroupMemberListSearchViewModel.a, iGroupMemberListSearchViewModel, str);
        return true;
    }

    @Override // o.ze0
    public void x(oq0 oq0Var) {
        bb5 bb5Var = this.m.r0;
        if (bb5Var != null) {
            bb5Var.I0(oq0Var, true);
        }
    }
}
