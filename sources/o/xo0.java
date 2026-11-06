package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.teamviewer.chatviewmodel.swig.ListChangeArgs;
import com.teamviewer.chatviewmodel.swig.ListChangeSignalCallbackImpl;
import com.teamviewer.remotecontrolviewlib.fragment.chat.ChatConversationListFragment$onCreateView$2;

/* JADX INFO: loaded from: classes.dex */
public final class xo0 extends ListChangeSignalCallbackImpl {
    public final /* synthetic */ yo0 a;

    public xo0(yo0 yo0Var) {
        this.a = yo0Var;
    }

    @Override // com.teamviewer.chatviewmodel.swig.ListChangeSignalCallback
    public final void OnCallback(ListChangeArgs listChangeArgs) {
        RecyclerView recyclerView;
        ChatConversationListFragment$onCreateView$2 chatConversationListFragment$onCreateView$2;
        ChatConversationListFragment$onCreateView$2 chatConversationListFragment$onCreateView$3;
        RecyclerView recyclerView2;
        listChangeArgs.getClass();
        yo0 yo0Var = this.a;
        vo0 vo0Var = yo0Var.s0;
        if (vo0Var != null) {
            boolean z = vo0Var.e && (recyclerView2 = yo0Var.w0) != null && recyclerView2.getChildCount() == 1 && listChangeArgs.GetListChangeType() == ListChangeArgs.ListChangeType.Added;
            vo0 vo0Var2 = yo0Var.s0;
            lf1 lf1VarH = vo0Var2 != null ? vo0Var2.h(listChangeArgs) : null;
            if (lf1VarH != null && lf1VarH.b == 0 && (chatConversationListFragment$onCreateView$2 = yo0Var.t0) != null) {
                View viewW0 = chatConversationListFragment$onCreateView$2.W0(0, chatConversationListFragment$onCreateView$2.G(), false, true);
                if ((viewW0 == null ? -1 : androidx.recyclerview.widget.a.O(viewW0)) == 0 && (chatConversationListFragment$onCreateView$3 = yo0Var.t0) != null) {
                    chatConversationListFragment$onCreateView$3.z0(0);
                }
            }
            if (z && (recyclerView = yo0Var.w0) != null) {
                recyclerView.i0(0);
            }
            vo0 vo0Var3 = yo0Var.s0;
            if (vo0Var3 != null && vo0Var3.a() > 1) {
                yo0Var.z0 = true;
            }
            View view = yo0Var.v0;
            if (view != null) {
                vo0 vo0Var4 = yo0Var.s0;
                view.setVisibility((vo0Var4 == null || vo0Var4.a() >= 1 || !yo0Var.z0) ? 8 : 0);
            }
        }
    }
}
