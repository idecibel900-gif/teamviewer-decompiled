package o;

import android.os.Bundle;
import com.teamviewer.chatviewmodel.swig.ChatConversationID;
import com.teamviewer.chatviewmodel.swig.ChatConversationIDSerializer;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo/tc1;", "Lo/op0;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class tc1 extends op0 {
    public ChatConversationID q0;

    @Override // o.ut2
    public final void h0(Bundle bundle) {
        ChatConversationID chatConversationID = this.q0;
        if (chatConversationID != null) {
            bundle.putString("CHAT_CONVERSATION_ID", ChatConversationIDSerializer.Serialize(chatConversationID));
        }
    }

    @Override // o.ut2
    public final void u0(Bundle bundle) {
        String string;
        super.u0(bundle);
        if (bundle == null || (string = bundle.getString("CHAT_CONVERSATION_ID")) == null) {
            return;
        }
        this.q0 = ChatConversationIDSerializer.Deserialize(string);
    }
}
