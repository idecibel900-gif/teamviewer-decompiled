package o;

import com.teamviewer.remotecontrollib.swig.ISessionToolbarViewModel;
import com.teamviewer.remotecontrollib.swig.ISessionToolbarViewModelSWIGJNI;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t16 implements jc3, ic3 {
    public final /* synthetic */ w16 a;

    public /* synthetic */ t16(w16 w16Var) {
        this.a = w16Var;
    }

    @Override // o.jc3
    public void a(n72 n72Var) {
        n72Var.getClass();
        int i = u16.a[n72Var.ordinal()];
        ISessionToolbarViewModel iSessionToolbarViewModel = this.a.u;
        if (i == 1) {
            ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel.a, iSessionToolbarViewModel, 4);
        } else {
            ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel.a, iSessionToolbarViewModel, 5);
        }
    }

    @Override // o.ic3
    public void b() {
        ISessionToolbarViewModel iSessionToolbarViewModel = this.a.u;
        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel.a, iSessionToolbarViewModel, 0);
    }
}
