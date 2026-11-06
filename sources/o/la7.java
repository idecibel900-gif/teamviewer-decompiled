package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class la7 extends BroadcastReceiver {
    public final /* synthetic */ byte a;
    public final /* synthetic */ na7 b;

    public /* synthetic */ la7(na7 na7Var, byte b) {
        this.a = b;
        this.b = na7Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        byte b = this.a;
        na7 na7Var = this.b;
        context.getClass();
        intent.getClass();
        switch (b) {
            case 0:
                String stringExtra = intent.getStringExtra("TRANSFER_ID");
                int intExtra = intent.getIntExtra("UPLOAD_PROGRESS", -1);
                if (stringExtra != null && intExtra > 0) {
                    na7Var.b.NotifyUploadProgress(stringExtra, intExtra);
                    break;
                }
                break;
            case 1:
                String stringExtra2 = intent.getStringExtra("TRANSFER_ID");
                if (stringExtra2 != null) {
                    na7Var.b.NotifyUploadFinished(stringExtra2, intent.getIntExtra("UPLOAD_RESULT", 0));
                }
                break;
            default:
                String stringExtra3 = intent.getStringExtra("TRANSFER_ID");
                if (stringExtra3 != null) {
                    na7Var.b.NotifyDownloadFinished(stringExtra3, intent.getIntExtra("DOWNLOAD_RESULT", 0));
                }
                break;
        }
    }
}
