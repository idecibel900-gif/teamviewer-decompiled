package o;

import android.util.Size;
import com.teamviewer.nativelivedatalib.swig.NativeLiveDataInt;
import com.teamviewer.nativelivedatalib.swig.NativeLiveDataSize;
import com.teamviewer.remotecontrollib.swig.IRemoteScreenInformationViewModel;
import com.teamviewer.remotecontrollib.swig.IRemoteScreenInformationViewModelSWIGJNI;

/* JADX INFO: loaded from: classes.dex */
public final class dz4 extends m30 implements oa3 {
    public final IRemoteScreenInformationViewModel q;
    public final float r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dz4(IRemoteScreenInformationViewModel iRemoteScreenInformationViewModel, j93 j93Var) {
        super(iRemoteScreenInformationViewModel);
        iRemoteScreenInformationViewModel.getClass();
        j93Var.getClass();
        this.q = iRemoteScreenInformationViewModel;
        this.r = j93Var.R();
    }

    @Override // o.oa3
    public final j22 b() {
        IRemoteScreenInformationViewModel iRemoteScreenInformationViewModel = this.q;
        Size size = (Size) NativeLiveDataSize.newInstance(IRemoteScreenInformationViewModelSWIGJNI.IRemoteScreenInformationViewModel_RemoteOriginalSize(iRemoteScreenInformationViewModel.a, iRemoteScreenInformationViewModel), false).getValue();
        return size != null ? new j22(size.getWidth(), size.getHeight(), 0, 0) : new j22();
    }

    @Override // o.oa3
    public final int c() {
        IRemoteScreenInformationViewModel iRemoteScreenInformationViewModel = this.q;
        Integer num = (Integer) NativeLiveDataInt.newInstance(IRemoteScreenInformationViewModelSWIGJNI.IRemoteScreenInformationViewModel_DpiScale(iRemoteScreenInformationViewModel.a, iRemoteScreenInformationViewModel), false).getValue();
        if (num != null) {
            return num.intValue();
        }
        return 100;
    }

    @Override // o.oa3
    public final float g() {
        return this.r;
    }
}
