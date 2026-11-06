package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.teamviewer.chatviewmodel.swig.ChatConversationID;
import com.teamviewer.chatviewmodel.swig.ChatMessageID;
import com.teamviewer.chatviewmodel.swig.ChatSignalsHelper;
import com.teamviewer.chatviewmodel.swig.ChatUIModelLocatorAndroid;
import com.teamviewer.chatviewmodel.swig.IRemoteTextMessageUIModel;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import com.teamviewer.teamviewer.market.mobile.R;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes.dex */
public final class dp0 extends b0 {
    public static final /* synthetic */ int N = 0;
    public final boolean I;
    public final TextView J;
    public final TextView K;
    public final TextView L;
    public boolean M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dp0(View view, boolean z) {
        super(view, 1);
        final byte b = 1;
        this.I = z;
        View viewFindViewById = view.findViewById(R.id.chat_message_timestamp_textview);
        viewFindViewById.getClass();
        this.J = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.chat_message_textview);
        viewFindViewById2.getClass();
        TextView textView = (TextView) viewFindViewById2;
        this.K = textView;
        View viewFindViewById3 = view.findViewById(R.id.chat_conversation_partner_name_textview);
        viewFindViewById3.getClass();
        TextView textView2 = (TextView) viewFindViewById3;
        this.L = textView2;
        final byte b2 = 0;
        textView.setOnLongClickListener(new View.OnLongClickListener(this) { // from class: o.bp0
            public final /* synthetic */ dp0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                byte b3 = b2;
                dp0 dp0Var = this.b;
                switch (b3) {
                    case 0:
                        dp0Var.M = true;
                        dp0Var.u(dp0Var.K.getText().toString());
                        break;
                    default:
                        dp0Var.u(dp0Var.K.getText().toString());
                        break;
                }
                return true;
            }
        });
        textView.setOnTouchListener(new cp0(this, (byte) 0));
        view.setOnLongClickListener(new View.OnLongClickListener(this) { // from class: o.bp0
            public final /* synthetic */ dp0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                byte b3 = b;
                dp0 dp0Var = this.b;
                switch (b3) {
                    case 0:
                        dp0Var.M = true;
                        dp0Var.u(dp0Var.K.getText().toString());
                        break;
                    default:
                        dp0Var.u(dp0Var.K.getText().toString());
                        break;
                }
                return true;
            }
        });
        if (z) {
            return;
        }
        textView2.setVisibility(8);
    }

    @Override // o.b0
    public final Object r(ChatConversationID chatConversationID, ChatMessageID chatMessageID) {
        IRemoteTextMessageUIModel iRemoteTextMessageUIModelGetRemoteTextMessageById = ChatUIModelLocatorAndroid.GetChatUIModelLocator().GetRemoteTextMessageById(chatConversationID, chatMessageID);
        iRemoteTextMessageUIModelGetRemoteTextMessageById.getClass();
        return iRemoteTextMessageUIModelGetRemoteTextMessageById;
    }

    @Override // o.b0
    public final void s(Object obj, boolean z) {
        IRemoteTextMessageUIModel iRemoteTextMessageUIModel = (IRemoteTextMessageUIModel) obj;
        TextView textView = this.J;
        if (iRemoteTextMessageUIModel != null) {
            SimpleDateFormat simpleDateFormat = rp0.a;
            textView.setText(rp0.a(iRemoteTextMessageUIModel.GetTimestamp()));
        }
        String strGetMessageContent = iRemoteTextMessageUIModel != null ? iRemoteTextMessageUIModel.GetMessageContent() : null;
        TextView textView2 = this.K;
        textView2.setText(strGetMessageContent);
        if (this.I) {
            this.L.setText(iRemoteTextMessageUIModel != null ? iRemoteTextMessageUIModel.GetDisplayName() : null);
        }
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        layoutParams.getClass();
        b61 b61Var = (b61) layoutParams;
        ViewGroup.LayoutParams layoutParams2 = textView2.getLayoutParams();
        layoutParams2.getClass();
        b61 b61Var2 = (b61) layoutParams2;
        if (strGetMessageContent == null || strGetMessageContent.length() <= 15) {
            b61Var.j = -1;
            Object parent = textView.getParent();
            parent.getClass();
            b61Var.l = ((View) parent).getId();
            textView.setLayoutParams(b61Var);
            b61Var2.u = textView.getId();
            b61Var2.v = -1;
            b61Var2.t = -1;
            textView2.setLayoutParams(b61Var2);
            return;
        }
        b61Var.j = textView2.getId();
        textView.setLayoutParams(b61Var);
        b61Var2.u = -1;
        Object parent2 = textView2.getParent();
        parent2.getClass();
        b61Var2.v = ((View) parent2).getId();
        Object parent3 = textView2.getParent();
        parent3.getClass();
        b61Var2.t = ((View) parent3).getId();
        textView2.setLayoutParams(b61Var2);
    }

    @Override // o.b0
    public final void t(Object obj, VoidSignalCallback[] voidSignalCallbackArr) {
        ChatSignalsHelper.RegisterRemoteTextMessageChangedSlot((IRemoteTextMessageUIModel) obj, voidSignalCallbackArr[0]);
    }
}
