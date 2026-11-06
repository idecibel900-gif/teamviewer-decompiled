package o;

import com.teamviewer.pilotsessionlib.swig.viewmodel.sessionwindow.IViewManagerViewModelSWIGJNI;
import com.teamviewer.pilotsessionlib.swig.viewmodel.sessionwindow.NativeLiveDataSessionData;
import com.teamviewer.pilotsessionlib.swig.viewmodel.sessionwindow.SessionData;
import com.teamviewer.remotecontrolviewmodellib.swig.IChangeResolutionViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewmodellib.swig.ListOfResolutions;
import com.teamviewer.remotecontrolviewmodellib.swig.NativeLiveDataListOfResolutions;
import com.teamviewer.remotecontrolviewmodellib.swig.NativeLiveDataResolution;
import com.teamviewer.remotecontrolviewmodellib.swig.Resolution;
import com.teamviewer.swigcallbacklib.VoidSignalCallbackImpl;

/* JADX INFO: loaded from: classes.dex */
public final class az4 extends VoidSignalCallbackImpl {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ az4(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // com.teamviewer.swigcallbacklib.VoidSignalCallback
    public final void OnCallback() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                NativeLiveDataListOfResolutions nativeLiveDataListOfResolutions = (NativeLiveDataListOfResolutions) obj;
                nativeLiveDataListOfResolutions.getClass();
                nativeLiveDataListOfResolutions.setValue(new ListOfResolutions(IChangeResolutionViewModelSWIGJNI.NativeLiveDataListOfResolutions_GetNativeValue(nativeLiveDataListOfResolutions.a, nativeLiveDataListOfResolutions)));
                break;
            case 1:
                NativeLiveDataResolution nativeLiveDataResolution = (NativeLiveDataResolution) obj;
                nativeLiveDataResolution.getClass();
                nativeLiveDataResolution.setValue(new Resolution(IChangeResolutionViewModelSWIGJNI.NativeLiveDataResolution_GetNativeValue(nativeLiveDataResolution.a, nativeLiveDataResolution), true));
                break;
            case 2:
                NativeLiveDataSessionData nativeLiveDataSessionData = (NativeLiveDataSessionData) obj;
                nativeLiveDataSessionData.getClass();
                long jNativeLiveDataSessionData_GetNativeValue = IViewManagerViewModelSWIGJNI.NativeLiveDataSessionData_GetNativeValue(nativeLiveDataSessionData.a, nativeLiveDataSessionData);
                SessionData sessionData = new SessionData();
                sessionData.b = true;
                sessionData.a = jNativeLiveDataSessionData_GetNativeValue;
                nativeLiveDataSessionData.setValue(sessionData);
                break;
            case 3:
                ((rx5) obj).a();
                break;
            case 4:
                ((rx5) obj).a();
                break;
            case 5:
                ((rx5) obj).a();
                break;
            case 6:
                ((rx5) obj).a();
                break;
            case 7:
                ((rx5) obj).a();
                break;
            default:
                ((rx5) obj).a();
                break;
        }
    }
}
