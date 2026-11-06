package o;

import androidx.recyclerview.widget.RecyclerView;
import com.teamviewer.chatviewmodel.swig.ListChangeArgs;
import com.teamviewer.chatviewmodel.swig.ListChangeSignalCallbackImpl;

/* JADX INFO: loaded from: classes.dex */
public final class zn0 extends ListChangeSignalCallbackImpl {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zn0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // com.teamviewer.chatviewmodel.swig.ListChangeSignalCallback
    public final void OnCallback(ListChangeArgs listChangeArgs) {
        va4 va4Var;
        byte b = this.a;
        Object obj = this.b;
        listChangeArgs.getClass();
        switch (b) {
            case 0:
                RecyclerView recyclerView = ((ao0) obj).s0;
                if (recyclerView != null) {
                    d66 adapter = recyclerView.getAdapter();
                    va4Var = adapter instanceof va4 ? (va4) adapter : null;
                    if (va4Var != null) {
                        va4Var.h(listChangeArgs);
                    }
                } else {
                    ye4.c("ChatConversationAddParticipantFragment", "OnListChanged: no view");
                }
                break;
            default:
                RecyclerView recyclerView2 = ((so0) obj).p;
                if (recyclerView2 != null) {
                    d66 adapter2 = recyclerView2.getAdapter();
                    va4Var = adapter2 instanceof va4 ? (va4) adapter2 : null;
                    if (va4Var != null) {
                        va4Var.h(listChangeArgs);
                    }
                } else {
                    ye4.c("ChatConversationEmptyRoomLogic", "OnListChanged: no view");
                }
                break;
        }
    }
}
