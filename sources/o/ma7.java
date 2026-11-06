package o;

import android.content.Intent;
import android.os.Bundle;
import com.teamviewer.chatviewlib.helper.DownloadFileService;
import com.teamviewer.chatviewlib.helper.UploadFileService;
import com.teamviewer.chatviewmodel.swig.MapOfStringString;
import com.teamviewer.chatviewmodel.swig.StorageManagerTransferData;
import com.teamviewer.chatviewmodel.swig.StorageManagerTransferDataSignalCallbackImpl;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ma7 extends StorageManagerTransferDataSignalCallbackImpl {
    public final /* synthetic */ byte a;
    public final /* synthetic */ na7 b;

    public /* synthetic */ ma7(na7 na7Var, byte b) {
        this.a = b;
        this.b = na7Var;
    }

    @Override // com.teamviewer.chatviewmodel.swig.StorageManagerTransferDataSignalCallback
    public final void OnCallback(StorageManagerTransferData storageManagerTransferData) {
        byte b = this.a;
        ye4 ye4Var = ye4.a;
        na7 na7Var = this.b;
        storageManagerTransferData.getClass();
        switch (b) {
            case 0:
                String transferId = storageManagerTransferData.getTransferId();
                transferId.getClass();
                String url = storageManagerTransferData.getUrl();
                url.getClass();
                ye4Var.b("StorageManagerConnector", "scheduleDownload(" + transferId + ")");
                HashMap map = DownloadFileService.q;
                RemoteControlApplication remoteControlApplication = na7Var.a;
                Intent intent = new Intent(remoteControlApplication, (Class<?>) DownloadFileService.class);
                intent.putExtra("TRANSFER_ID", transferId);
                intent.putExtra("URL", url);
                ip3.a(remoteControlApplication, DownloadFileService.class, 1002, intent);
                break;
            default:
                Bundle bundle = new Bundle();
                MapOfStringString metadata = storageManagerTransferData.getMetadata();
                metadata.getClass();
                for (Map.Entry<String, String> entry : metadata.entrySet()) {
                    bundle.putString(entry.getKey(), entry.getValue());
                }
                String transferId2 = storageManagerTransferData.getTransferId();
                transferId2.getClass();
                String url2 = storageManagerTransferData.getUrl();
                url2.getClass();
                ye4Var.b("StorageManagerConnector", "scheduleUpload(" + transferId2 + ")");
                HashMap map2 = UploadFileService.r;
                RemoteControlApplication remoteControlApplication2 = na7Var.a;
                Intent intent2 = new Intent(remoteControlApplication2, (Class<?>) UploadFileService.class);
                intent2.putExtra("TRANSFER_ID", transferId2);
                intent2.putExtra("URL", url2);
                intent2.putExtra("METADATA", bundle);
                ip3.a(remoteControlApplication2, UploadFileService.class, 1001, intent2);
                break;
        }
    }
}
