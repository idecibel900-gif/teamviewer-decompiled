package o;

import androidx.recyclerview.widget.RecyclerView;
import com.teamviewer.chatviewmodel.swig.IConversationHistoryListUIModelAndroid;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class go0 implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ po0 n;

    public /* synthetic */ go0(po0 po0Var, byte b) {
        this.m = b;
        this.n = po0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.m;
        po0 po0Var = this.n;
        switch (b) {
            case 0:
                IConversationHistoryListUIModelAndroid iConversationHistoryListUIModelAndroid = po0Var.f1756o;
                if (iConversationHistoryListUIModelAndroid != null) {
                    iConversationHistoryListUIModelAndroid.PrepareUploadFailed();
                }
                break;
            default:
                RecyclerView recyclerView = po0Var.t;
                if (recyclerView != null) {
                    recyclerView.requestLayout();
                }
                break;
        }
    }
}
