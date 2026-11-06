package o;

import androidx.lifecycle.LiveData;
import com.teamviewer.nativelivedatalib.swig.NativeLiveDataString;
import com.teamviewer.remotecontrolviewmodellib.swig.IConnectionInfoViewModel;
import com.teamviewer.remotecontrolviewmodellib.swig.IConnectionInfoViewModelSWIGJNI;

/* JADX INFO: loaded from: classes.dex */
public final class ez4 extends oe8 implements gd3 {
    public final IConnectionInfoViewModel n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final nw4 f754o;
    public final nw4 p;
    public final p q;

    public ez4(IConnectionInfoViewModel iConnectionInfoViewModel) {
        this.n = iConnectionInfoViewModel;
        nw4 nw4Var = new nw4();
        this.f754o = nw4Var;
        this.p = nw4Var;
        p pVar = new p((Object) this, (byte) 9);
        this.q = pVar;
        NativeLiveDataString.newInstance(IConnectionInfoViewModelSWIGJNI.IConnectionInfoViewModel_GetDuration(iConnectionInfoViewModel.a, iConnectionInfoViewModel), false).observeForever(pVar);
    }

    @Override // o.oe8
    public final void U0() {
        IConnectionInfoViewModel iConnectionInfoViewModel = this.n;
        NativeLiveDataString.newInstance(IConnectionInfoViewModelSWIGJNI.IConnectionInfoViewModel_GetDuration(iConnectionInfoViewModel.a, iConnectionInfoViewModel), false).removeObserver(this.q);
        iConnectionInfoViewModel.a();
    }

    @Override // o.gd3
    public final LiveData Y() {
        return this.p;
    }
}
