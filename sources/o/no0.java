package o;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.teamviewer.chatviewmodel.swig.ChatMessageUITypes;
import com.teamviewer.chatviewmodel.swig.IConversationHistoryListUIModel;
import com.teamviewer.chatviewmodel.swig.ListChangeArgs;
import com.teamviewer.chatviewmodel.swig.ListChangeSignalCallbackImpl;

/* JADX INFO: loaded from: classes.dex */
public final class no0 extends ListChangeSignalCallbackImpl {
    public final /* synthetic */ po0 a;

    public no0(po0 po0Var) {
        this.a = po0Var;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0081  */
    /* JADX WARN: Code duplicated, block: B:45:0x008d  */
    /* JADX WARN: Code duplicated, block: B:46:0x008f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0095 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:53:0x00a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ab  */
    @Override // com.teamviewer.chatviewmodel.swig.ListChangeSignalCallback
    public final void OnCallback(ListChangeArgs listChangeArgs) {
        IConversationHistoryListUIModel iConversationHistoryListUIModel;
        View viewW0;
        int iO;
        listChangeArgs.getClass();
        po0 po0Var = this.a;
        RecyclerView recyclerView = po0Var.t;
        if (recyclerView == null) {
            ye4.c("ChatConversationDefaultLogic", "OnListChanged: no view");
            return;
        }
        d66 adapter = recyclerView.getAdapter();
        va4 va4Var = adapter instanceof va4 ? (va4) adapter : null;
        lf1 lf1VarH = va4Var != null ? va4Var.h(listChangeArgs) : null;
        if (lf1VarH != null) {
            int i = lf1VarH.b;
            int i2 = lf1VarH.c;
            if (va4Var != null) {
                RecyclerView recyclerView2 = po0Var.t;
                androidx.recyclerview.widget.a layoutManager = recyclerView2 != null ? recyclerView2.getLayoutManager() : null;
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager != null) {
                    if (i == i2 && va4Var.c(i) == ChatMessageUITypes.OwnMessage.swigValue()) {
                        int iA = va4Var.a();
                        if (i == iA - 2 || i == iA - 3) {
                            int i3 = iA - 1;
                            int i4 = i + 1;
                            if (i4 <= i3) {
                                while (true) {
                                    int iC = va4Var.c(i3);
                                    if (iC != ChatMessageUITypes.ReadSentState.swigValue() && iC != ChatMessageUITypes.RemoteTypingEvent.swigValue()) {
                                        viewW0 = linearLayoutManager.W0(linearLayoutManager.G() - 1, -1, false, true);
                                        if (viewW0 == null) {
                                            iO = -1;
                                        } else {
                                            iO = androidx.recyclerview.widget.a.O(viewW0);
                                        }
                                        if (i2 <= iO) {
                                        }
                                        if (i != 0) {
                                            linearLayoutManager.z0(i2 + 1);
                                        } else {
                                            linearLayoutManager.z0(i2 + 1);
                                        }
                                    } else if (i3 != i4) {
                                        i3--;
                                    }
                                }
                            }
                            linearLayoutManager.z0(va4Var.a() - 1);
                        } else {
                            viewW0 = linearLayoutManager.W0(linearLayoutManager.G() - 1, -1, false, true);
                            if (viewW0 == null) {
                                iO = -1;
                            } else {
                                iO = androidx.recyclerview.widget.a.O(viewW0);
                            }
                            if (i2 <= iO) {
                            }
                            if (i != 0) {
                                linearLayoutManager.z0(i2 + 1);
                            } else {
                                linearLayoutManager.z0(i2 + 1);
                            }
                        }
                    } else {
                        viewW0 = linearLayoutManager.W0(linearLayoutManager.G() - 1, -1, false, true);
                        if (viewW0 == null) {
                            iO = -1;
                        } else {
                            iO = androidx.recyclerview.widget.a.O(viewW0);
                        }
                        if (i2 <= iO && iO != -1 && iO + 2 == va4Var.a()) {
                            linearLayoutManager.z0(va4Var.a() - 1);
                        } else if (i != 0 || i == 1) {
                            linearLayoutManager.z0(i2 + 1);
                        }
                    }
                }
            }
        }
        ListChangeArgs.ListChangeType listChangeTypeGetListChangeType = listChangeArgs.GetListChangeType();
        int i5 = listChangeTypeGetListChangeType != null ? mo0.a[listChangeTypeGetListChangeType.ordinal()] : -1;
        if ((i5 == 1 || i5 == 2 || i5 == 3) && (iConversationHistoryListUIModel = po0Var.n) != null) {
            iConversationHistoryListUIModel.MessagesRead();
        }
    }
}
