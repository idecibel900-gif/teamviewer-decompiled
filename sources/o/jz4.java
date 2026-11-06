package o;

import com.teamviewer.remotecontrollib.swig.IRemoteScreenTouchViewModel;
import com.teamviewer.remotecontrollib.swig.IRemoteScreenTouchViewModelSWIGJNI;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jz4 implements md3, qw2 {
    public final /* synthetic */ IRemoteScreenTouchViewModel m;

    public jz4(IRemoteScreenTouchViewModel iRemoteScreenTouchViewModel) {
        this.m = iRemoteScreenTouchViewModel;
    }

    @Override // o.md3
    public final void a(int i, int i2, int i3, int i4, int i5, int i6) {
        IRemoteScreenTouchViewModel iRemoteScreenTouchViewModel = this.m;
        IRemoteScreenTouchViewModelSWIGJNI.IRemoteScreenTouchViewModel_SendTouch(iRemoteScreenTouchViewModel.a, iRemoteScreenTouchViewModel, i, i2, i3, i4, i5, i6);
    }

    @Override // o.qw2
    public final pw2 b() {
        return new cx2(6, this.m, IRemoteScreenTouchViewModel.class, "SendTouch", "SendTouch(IIIIII)V", 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof md3) && (obj instanceof qw2)) {
            return im3.n(b(), ((qw2) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
