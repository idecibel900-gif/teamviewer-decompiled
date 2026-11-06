package o;

import com.teamviewer.commonviewmodel.swig.ErrorCode;
import com.teamviewer.commonviewmodel.swig.ErrorCodeResultCallbackImpl;

/* JADX INFO: loaded from: classes.dex */
public abstract class uc2 extends ErrorCodeResultCallbackImpl {
    public uc2() {
        swigReleaseOwnership();
    }

    @Override // com.teamviewer.commonviewmodel.swig.ErrorCodeResultCallback
    public final void OnError(ErrorCode errorCode) {
        errorCode.getClass();
        a(errorCode);
        swigTakeOwnership();
    }

    @Override // com.teamviewer.commonviewmodel.swig.ErrorCodeResultCallback
    public final void OnSuccess() {
        b();
        swigTakeOwnership();
    }

    public abstract void a(ErrorCode errorCode);

    public abstract void b();
}
