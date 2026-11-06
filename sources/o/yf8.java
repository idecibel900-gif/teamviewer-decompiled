package o;

import com.teamviewer.remotecontrolviewmodellib.swig.TakePictureResponse;
import com.teamviewer.remotecontrolviewmodellib.swig.TakePictureResponseSignalCallbackImpl;

/* JADX INFO: loaded from: classes.dex */
public final class yf8 extends TakePictureResponseSignalCallbackImpl {
    @Override // com.teamviewer.remotecontrolviewmodellib.swig.TakePictureResponseSignalCallback
    public final void OnCallback(TakePictureResponse takePictureResponse) {
        takePictureResponse.getClass();
        ye4.a("ViewerFragment", "Response from presenter on take picture request: " + takePictureResponse);
    }
}
