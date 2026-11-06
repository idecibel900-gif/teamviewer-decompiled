package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.teamviewer.chatviewmodel.swig.ChatConversationID;
import com.teamviewer.chatviewmodel.swig.ChatMessageID;
import com.teamviewer.chatviewmodel.swig.ChatMessageUITypes;
import com.teamviewer.chatviewmodel.swig.IConversationHistoryListUIModel;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class wn0 extends va4 {
    public final IConversationHistoryListUIModel c;

    public wn0(IConversationHistoryListUIModel iConversationHistoryListUIModel, cr crVar) {
        iConversationHistoryListUIModel.getClass();
        this.c = iConversationHistoryListUIModel;
    }

    @Override // o.d66
    public final int a() {
        return this.c.GetNumberOfMessages();
    }

    @Override // o.d66
    public final int c(int i) {
        ChatMessageID chatMessageIDGetMessageAtPosition = this.c.GetMessageAtPosition(i);
        chatMessageIDGetMessageAtPosition.getClass();
        return chatMessageIDGetMessageAtPosition.GetType().swigValue();
    }

    @Override // o.d66
    public final void e(c76 c76Var, int i) {
        b0 b0Var = (b0) c76Var;
        IConversationHistoryListUIModel iConversationHistoryListUIModel = this.c;
        ChatConversationID chatConversationIDGetConversationID = iConversationHistoryListUIModel.GetConversationID();
        chatConversationIDGetConversationID.getClass();
        ChatMessageID chatMessageIDGetMessageAtPosition = iConversationHistoryListUIModel.GetMessageAtPosition(i);
        chatMessageIDGetMessageAtPosition.getClass();
        ArrayList arrayList = b0Var.H;
        Iterator it = arrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            ((VoidSignalCallback) next).Disconnect();
        }
        Object objR = b0Var.r(chatConversationIDGetConversationID, chatMessageIDGetMessageAtPosition);
        b0Var.G = objR;
        b0Var.s(objR, false);
        Object obj = b0Var.G;
        VoidSignalCallback[] voidSignalCallbackArr = (VoidSignalCallback[]) arrayList.toArray(new VoidSignalCallback[0]);
        b0Var.t(obj, (VoidSignalCallback[]) Arrays.copyOf(voidSignalCallbackArr, voidSignalCallbackArr.length));
    }

    @Override // o.d66
    public final c76 f(ViewGroup viewGroup, int i) {
        int iSwigValue = ChatMessageUITypes.RemoteMessage.swigValue();
        IConversationHistoryListUIModel iConversationHistoryListUIModel = this.c;
        if (i == iSwigValue) {
            boolean zIsGroupChat = iConversationHistoryListUIModel.IsGroupChat();
            int i2 = dp0.N;
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_chat_conversation_message_incoming_item, viewGroup, false);
            viewInflate.getClass();
            return new dp0(viewInflate, zIsGroupChat);
        }
        if (i == ChatMessageUITypes.OwnMessage.swigValue()) {
            int i3 = gp0.M;
            View viewInflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_chat_conversation_message_outgoing_item, viewGroup, false);
            viewInflate2.getClass();
            return new gp0(viewInflate2);
        }
        if (i == ChatMessageUITypes.RemoteFileMessage.swigValue()) {
            boolean zIsGroupChat2 = iConversationHistoryListUIModel.IsGroupChat();
            int i4 = tp0.Q;
            View viewInflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.chat_incoming_file_entry, viewGroup, false);
            viewInflate3.getClass();
            return new tp0(viewInflate3, zIsGroupChat2);
        }
        if (i == ChatMessageUITypes.OwnFileMessage.swigValue()) {
            int i5 = xp0.M;
            View viewInflate4 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.chat_outgoing_file_entry, viewGroup, false);
            viewInflate4.getClass();
            return new xp0(viewInflate4);
        }
        if (i == ChatMessageUITypes.Event.swigValue()) {
            int i6 = to0.J;
            View viewInflate5 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_chat_conversation_event, viewGroup, false);
            viewInflate5.getClass();
            return new to0(viewInflate5);
        }
        if (i == ChatMessageUITypes.Date.swigValue()) {
            iConversationHistoryListUIModel.getClass();
            int i7 = bo0.M;
            View viewInflate6 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_chat_conversation_date_separator, viewGroup, false);
            viewInflate6.getClass();
            return new bo0(viewInflate6, iConversationHistoryListUIModel, (byte) 0);
        }
        if (i == ChatMessageUITypes.NewSeparator.swigValue()) {
            int i8 = hp0.J;
            View viewInflate7 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_chat_conversation_newmessage_separator, viewGroup, false);
            viewInflate7.getClass();
            return new hp0(viewInflate7, 0, (byte) 0);
        }
        if (i == ChatMessageUITypes.RemoteTypingEvent.swigValue()) {
            int i9 = hp0.J;
            View viewInflate8 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_chat_conversation_typing_event, viewGroup, false);
            viewInflate8.getClass();
            return new hp0(viewInflate8, 0, (byte) 1);
        }
        if (i != ChatMessageUITypes.ReadSentState.swigValue()) {
            return new hp0(new View(viewGroup.getContext()), 0, (byte) 2);
        }
        iConversationHistoryListUIModel.getClass();
        int i10 = bo0.M;
        View viewInflate9 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_chat_conversation_readsent_state, viewGroup, false);
        viewInflate9.getClass();
        return new bo0(viewInflate9, iConversationHistoryListUIModel, (byte) 1);
    }
}
