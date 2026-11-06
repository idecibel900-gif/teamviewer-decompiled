package o;

import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.teamviewer.chatviewmodel.swig.ChatConversationID;
import com.teamviewer.chatviewmodel.swig.ChatUIModelLocatorAndroid;
import com.teamviewer.chatviewmodel.swig.IConversationListUIModel;
import com.teamviewer.chatviewmodel.swig.IConversationUIModel;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class vo0 extends va4 {
    public final IConversationListUIModel c;
    public final ar d;
    public boolean e;
    public ChatConversationID f;

    public vo0(IConversationListUIModel iConversationListUIModel, ar arVar, aw awVar) {
        iConversationListUIModel.getClass();
        arVar.getClass();
        this.c = iConversationListUIModel;
        this.d = arVar;
    }

    @Override // o.d66
    public final int a() {
        return (int) (this.c.GetNumberOfConversations() + (this.e ? 1L : 0L));
    }

    @Override // o.d66
    public final int c(int i) {
        return (this.e && (a() - 1 == i)) ? 1 : 0;
    }

    @Override // o.d66
    public final void e(c76 c76Var, int i) {
        x xVar = (x) c76Var;
        boolean z = xVar instanceof ap0;
        IConversationListUIModel iConversationListUIModel = this.c;
        if (!z) {
            ChatConversationID chatConversationIDGetConversationAtPosition = iConversationListUIModel.GetConversationAtPosition(i);
            IConversationUIModel iConversationUIModelGetConversationUIModelById = ChatUIModelLocatorAndroid.GetChatUIModelLocator().GetConversationUIModelById(chatConversationIDGetConversationAtPosition);
            ChatConversationID chatConversationID = this.f;
            if (chatConversationID != null) {
                chatConversationID.Equal(chatConversationIDGetConversationAtPosition);
            }
            iConversationUIModelGetConversationUIModelById.getClass();
            xVar.r(iConversationUIModelGetConversationUIModelById);
        }
        if (!this.e && i == a() - 1 && iConversationListUIModel.HasMoreConversations()) {
            new Handler(Looper.getMainLooper()).post(new pc0((Object) this, (byte) 3));
        }
    }

    @Override // o.d66
    public final c76 f(ViewGroup viewGroup, int i) {
        if (i != 0) {
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.chat_conversation_loading_indicator, viewGroup, false);
            viewInflate.getClass();
            return new ap0(viewInflate);
        }
        ar arVar = this.d;
        arVar.getClass();
        View viewInflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.chat_conversation_list_item, viewGroup, false);
        viewInflate2.getClass();
        return new kp0(viewInflate2, arVar);
    }
}
