package o;

import android.app.AlertDialog;
import android.view.View;
import com.teamviewer.chatviewmodel.swig.ChatConversationID;
import com.teamviewer.chatviewmodel.swig.ChatMessageID;
import com.teamviewer.chatviewmodel.swig.ChatUIModelLocatorAndroid;
import com.teamviewer.chatviewmodel.swig.IEventMessageUIModel;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class b0 extends c76 {
    public Object G;
    public final ArrayList H;

    public b0(View view, int i) {
        super(view);
        this.H = new ArrayList();
        byte b = 0;
        view.addOnAttachStateChangeListener(new a0(this, b));
        if (i < 0) {
            gk0.h(fx3.e(i, "numberOfCallbacks must not be a negative number! "));
            throw null;
        }
        for (int i2 = 0; i2 < i; i2++) {
            this.H.add(SignalCallbackFactory.INSTANCE.getInstance().voidSignalCallback(new y(this, b)));
        }
    }

    public Object r(ChatConversationID chatConversationID, ChatMessageID chatMessageID) {
        IEventMessageUIModel iEventMessageUIModelGetEventMessageById = ChatUIModelLocatorAndroid.GetChatUIModelLocator().GetEventMessageById(chatConversationID, chatMessageID);
        iEventMessageUIModelGetEventMessageById.getClass();
        return iEventMessageUIModelGetEventMessageById;
    }

    public abstract void s(Object obj, boolean z);

    public void t(Object obj, VoidSignalCallback[] voidSignalCallbackArr) {
    }

    public final void u(String str) {
        str.getClass();
        View view = this.m;
        AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
        builder.setItems(new String[]{view.getResources().getString(R.string.tv_chat_copy_message)}, new z(str, (byte) 0));
        builder.create().show();
    }
}
