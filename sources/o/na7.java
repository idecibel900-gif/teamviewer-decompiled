package o;

import android.content.IntentFilter;
import com.teamviewer.chatviewmodel.swig.IStorageManagerUIModel;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.StringSignalCallback;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;

/* JADX INFO: loaded from: classes.dex */
public final class na7 {
    public final RemoteControlApplication a;
    public final IStorageManagerUIModel b;
    public final ma7 c;
    public final ma7 d;
    public final StringSignalCallback e;

    public na7(RemoteControlApplication remoteControlApplication, IStorageManagerUIModel iStorageManagerUIModel) {
        this.a = remoteControlApplication;
        this.b = iStorageManagerUIModel;
        ma7 ma7Var = new ma7(this, (byte) 1);
        this.c = ma7Var;
        ma7 ma7Var2 = new ma7(this, (byte) 0);
        this.d = ma7Var2;
        StringSignalCallback stringSignalCallback = SignalCallbackFactory.INSTANCE.getInstance().stringSignalCallback(new vs6(this));
        this.e = stringSignalCallback;
        iStorageManagerUIModel.RegisterForUpload(ma7Var);
        iStorageManagerUIModel.RegisterForDownload(ma7Var2);
        iStorageManagerUIModel.RegisterForCancel(stringSignalCallback);
        yc4 yc4VarI = yc4.I(remoteControlApplication);
        yc4VarI.Q(new la7(this, (byte) 0), new IntentFilter("com.teamviewer.teamviewer.market.application.UploadFileService.UPLOAD_PROGRESS"));
        yc4VarI.Q(new la7(this, (byte) 1), new IntentFilter("com.teamviewer.teamviewer.market.application.UploadFileService.UPLOAD_FINISHED"));
        yc4VarI.Q(new la7(this, (byte) 2), new IntentFilter("com.teamviewer.teamviewer.market.application.DownloadFileService.DOWNLOAD_FINISHED"));
    }
}
