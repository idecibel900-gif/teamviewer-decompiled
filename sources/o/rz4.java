package o;

import com.teamviewer.remotecontrollib.swig.ISessionToolbarViewModel;
import com.teamviewer.remotecontrollib.swig.ISessionToolbarViewModelSWIGJNI;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rz4 implements jc3, ic3 {
    public final /* synthetic */ tz4 a;

    public /* synthetic */ rz4(tz4 tz4Var) {
        this.a = tz4Var;
    }

    @Override // o.jc3
    public void a(n72 n72Var) {
        n72Var.getClass();
        int i = sz4.a[n72Var.ordinal()];
        ISessionToolbarViewModel iSessionToolbarViewModel = this.a.s;
        if (i == 1) {
            ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel.a, iSessionToolbarViewModel, 4);
        } else {
            ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel.a, iSessionToolbarViewModel, 5);
        }
    }

    @Override // o.ic3
    public void b() {
        ISessionToolbarViewModel iSessionToolbarViewModel = this.a.s;
        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel.a, iSessionToolbarViewModel, 0);
    }
}
