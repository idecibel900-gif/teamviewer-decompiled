package o;

import com.teamviewer.remotecontrolviewmodellib.swig.IAudioVoipClientViewModel;
import com.teamviewer.remotecontrolviewmodellib.swig.ILeaveSessionClientViewModel;
import com.teamviewer.remotecontrolviewmodellib.swig.IMarkingClientViewModel;
import com.teamviewer.remotecontrolviewmodellib.swig.ISupportMessagesClientViewModel;
import com.teamviewer.remotecontrolviewmodellib.swig.ITakePictureClientViewModel;
import com.teamviewer.remotecontrolviewmodellib.swig.IVideoStreamClientViewModel;
import com.teamviewer.remotecontrolviewmodellib.swig.SessionWindowViewModelFactoryClientSWIGJNI;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ra implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ int n;

    public /* synthetic */ ra(int i, byte b) {
        this.m = b;
        this.n = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        ITakePictureClientViewModel iTakePictureClientViewModel = null;
        IMarkingClientViewModel iMarkingClientViewModel = null;
        IAudioVoipClientViewModel iAudioVoipClientViewModel = null;
        ISupportMessagesClientViewModel iSupportMessagesClientViewModel = null;
        ILeaveSessionClientViewModel iLeaveSessionClientViewModel = null;
        IVideoStreamClientViewModel iVideoStreamClientViewModel = null;
        int i = this.n;
        switch (b) {
            case 0:
                return new yf5(i);
            case 1:
                long jPilotViewerViewModelFactoryNative_GetTakePictureClientViewModel = SessionWindowViewModelFactoryClientSWIGJNI.PilotViewerViewModelFactoryNative_GetTakePictureClientViewModel(i);
                if (jPilotViewerViewModelFactoryNative_GetTakePictureClientViewModel != 0) {
                    iTakePictureClientViewModel = new ITakePictureClientViewModel();
                    iTakePictureClientViewModel.f77o = true;
                    iTakePictureClientViewModel.n = jPilotViewerViewModelFactoryNative_GetTakePictureClientViewModel;
                }
                iTakePictureClientViewModel.getClass();
                return iTakePictureClientViewModel;
            case 2:
                long jPilotViewerViewModelFactoryNative_GetVideoStreamClientViewModel = SessionWindowViewModelFactoryClientSWIGJNI.PilotViewerViewModelFactoryNative_GetVideoStreamClientViewModel(i);
                if (jPilotViewerViewModelFactoryNative_GetVideoStreamClientViewModel != 0) {
                    iVideoStreamClientViewModel = new IVideoStreamClientViewModel();
                    iVideoStreamClientViewModel.f78o = true;
                    iVideoStreamClientViewModel.n = jPilotViewerViewModelFactoryNative_GetVideoStreamClientViewModel;
                }
                iVideoStreamClientViewModel.getClass();
                return iVideoStreamClientViewModel;
            case 3:
                long jPilotViewerViewModelFactoryNative_GetLeaveSessionClientViewModel = SessionWindowViewModelFactoryClientSWIGJNI.PilotViewerViewModelFactoryNative_GetLeaveSessionClientViewModel(i);
                if (jPilotViewerViewModelFactoryNative_GetLeaveSessionClientViewModel != 0) {
                    iLeaveSessionClientViewModel = new ILeaveSessionClientViewModel();
                    iLeaveSessionClientViewModel.f74o = true;
                    iLeaveSessionClientViewModel.n = jPilotViewerViewModelFactoryNative_GetLeaveSessionClientViewModel;
                }
                iLeaveSessionClientViewModel.getClass();
                return iLeaveSessionClientViewModel;
            case 4:
                long jPilotViewerViewModelFactoryNative_GetSupportMessagesClientViewModel = SessionWindowViewModelFactoryClientSWIGJNI.PilotViewerViewModelFactoryNative_GetSupportMessagesClientViewModel(i);
                if (jPilotViewerViewModelFactoryNative_GetSupportMessagesClientViewModel != 0) {
                    iSupportMessagesClientViewModel = new ISupportMessagesClientViewModel();
                    iSupportMessagesClientViewModel.f76o = true;
                    iSupportMessagesClientViewModel.n = jPilotViewerViewModelFactoryNative_GetSupportMessagesClientViewModel;
                }
                iSupportMessagesClientViewModel.getClass();
                return iSupportMessagesClientViewModel;
            case 5:
                long jPilotViewerViewModelFactoryNative_GetAudioVoipViewModel = SessionWindowViewModelFactoryClientSWIGJNI.PilotViewerViewModelFactoryNative_GetAudioVoipViewModel(i);
                if (jPilotViewerViewModelFactoryNative_GetAudioVoipViewModel != 0) {
                    iAudioVoipClientViewModel = new IAudioVoipClientViewModel();
                    iAudioVoipClientViewModel.f73o = true;
                    iAudioVoipClientViewModel.n = jPilotViewerViewModelFactoryNative_GetAudioVoipViewModel;
                }
                iAudioVoipClientViewModel.getClass();
                return iAudioVoipClientViewModel;
            default:
                long jPilotViewerViewModelFactoryNative_GetMarkingClientViewModel = SessionWindowViewModelFactoryClientSWIGJNI.PilotViewerViewModelFactoryNative_GetMarkingClientViewModel(i);
                if (jPilotViewerViewModelFactoryNative_GetMarkingClientViewModel != 0) {
                    iMarkingClientViewModel = new IMarkingClientViewModel();
                    iMarkingClientViewModel.f75o = true;
                    iMarkingClientViewModel.n = jPilotViewerViewModelFactoryNative_GetMarkingClientViewModel;
                }
                iMarkingClientViewModel.getClass();
                return iMarkingClientViewModel;
        }
    }
}
