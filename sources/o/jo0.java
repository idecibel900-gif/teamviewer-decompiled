package o;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.teamviewer.chatviewmodel.swig.IConversationHistoryListUIModel;

/* JADX INFO: loaded from: classes.dex */
public final class jo0 extends p66 {
    public final /* synthetic */ LinearLayoutManager a;
    public final /* synthetic */ po0 b;

    public jo0(LinearLayoutManager linearLayoutManager, po0 po0Var) {
        this.a = linearLayoutManager;
        this.b = po0Var;
    }

    @Override // o.p66
    public final void a(RecyclerView recyclerView, int i) {
        Integer numValueOf;
        po0 po0Var;
        IConversationHistoryListUIModel iConversationHistoryListUIModel;
        IConversationHistoryListUIModel iConversationHistoryListUIModel2;
        if (i == 0) {
            LinearLayoutManager linearLayoutManager = this.a;
            if (linearLayoutManager != null) {
                View viewW0 = linearLayoutManager.W0(0, linearLayoutManager.G(), true, false);
                numValueOf = Integer.valueOf(viewW0 == null ? -1 : androidx.recyclerview.widget.a.O(viewW0));
            } else {
                numValueOf = null;
            }
            if (numValueOf == null || numValueOf.intValue() != 0 || (iConversationHistoryListUIModel = (po0Var = this.b).n) == null || !iConversationHistoryListUIModel.GetHasMoreMessages() || (iConversationHistoryListUIModel2 = po0Var.n) == null) {
                return;
            }
            iConversationHistoryListUIModel2.LoadMoreMessages(10L);
        }
    }
}
