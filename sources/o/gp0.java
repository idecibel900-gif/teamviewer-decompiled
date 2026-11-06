package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.teamviewer.chatviewmodel.swig.ChatConversationID;
import com.teamviewer.chatviewmodel.swig.ChatMessageID;
import com.teamviewer.chatviewmodel.swig.ChatSignalsHelper;
import com.teamviewer.chatviewmodel.swig.ChatUIModelLocatorAndroid;
import com.teamviewer.chatviewmodel.swig.IOwnTextMessageUIModel;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import com.teamviewer.teamviewer.market.mobile.R;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes.dex */
public final class gp0 extends b0 {
    public static final /* synthetic */ int M = 0;
    public final TextView I;
    public final TextView J;
    public final View K;
    public boolean L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gp0(View view) {
        super(view, 1);
        final byte b = 1;
        View viewFindViewById = view.findViewById(R.id.chat_message_outgoing_timestamp_textview);
        viewFindViewById.getClass();
        this.I = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.chat_message_outgoing_textview);
        viewFindViewById2.getClass();
        TextView textView = (TextView) viewFindViewById2;
        this.J = textView;
        View viewFindViewById3 = view.findViewById(R.id.chat_message_outgoing_error_indicator);
        viewFindViewById3.getClass();
        this.K = viewFindViewById3;
        final byte b2 = 0;
        textView.setOnLongClickListener(new View.OnLongClickListener(this) { // from class: o.ep0
            public final /* synthetic */ gp0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                byte b3 = b2;
                gp0 gp0Var = this.b;
                switch (b3) {
                    case 0:
                        gp0Var.L = true;
                        gp0Var.u(gp0Var.J.getText().toString());
                        break;
                    default:
                        gp0Var.u(gp0Var.J.getText().toString());
                        break;
                }
                return true;
            }
        });
        textView.setOnTouchListener(new cp0(this, (byte) 1));
        view.setOnLongClickListener(new View.OnLongClickListener(this) { // from class: o.ep0
            public final /* synthetic */ gp0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                byte b3 = b;
                gp0 gp0Var = this.b;
                switch (b3) {
                    case 0:
                        gp0Var.L = true;
                        gp0Var.u(gp0Var.J.getText().toString());
                        break;
                    default:
                        gp0Var.u(gp0Var.J.getText().toString());
                        break;
                }
                return true;
            }
        });
    }

    @Override // o.b0
    public final Object r(ChatConversationID chatConversationID, ChatMessageID chatMessageID) {
        return ChatUIModelLocatorAndroid.GetChatUIModelLocator().GetOwnTextMessageById(chatConversationID, chatMessageID);
    }

    @Override // o.b0
    public final void s(Object obj, boolean z) {
        IOwnTextMessageUIModel iOwnTextMessageUIModel = (IOwnTextMessageUIModel) obj;
        View view = this.K;
        TextView textView = this.I;
        if (iOwnTextMessageUIModel != null && iOwnTextMessageUIModel.DeliveryFailed()) {
            textView.setVisibility(0);
            textView.setText(R.string.tv_chat_message_error_indicator);
            view.setVisibility(0);
            view.setOnClickListener(new io.sentry.android.core.p2(this, iOwnTextMessageUIModel, (byte) 8));
        } else if (iOwnTextMessageUIModel == null || !iOwnTextMessageUIModel.WasSent()) {
            textView.setVisibility(4);
            view.setVisibility(8);
            view.setOnClickListener(null);
        } else {
            textView.setVisibility(0);
            SimpleDateFormat simpleDateFormat = rp0.a;
            textView.setText(rp0.a(iOwnTextMessageUIModel.GetTimestamp()));
            view.setVisibility(8);
            view.setOnClickListener(null);
        }
        String strGetMessageContent = iOwnTextMessageUIModel != null ? iOwnTextMessageUIModel.GetMessageContent() : null;
        TextView textView2 = this.J;
        textView2.setText(strGetMessageContent);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        layoutParams.getClass();
        b61 b61Var = (b61) layoutParams;
        ViewGroup.LayoutParams layoutParams2 = textView2.getLayoutParams();
        layoutParams2.getClass();
        b61 b61Var2 = (b61) layoutParams2;
        if (strGetMessageContent == null || strGetMessageContent.length() <= 15) {
            b61Var.j = -1;
            textView.setLayoutParams(b61Var);
            b61Var2.v = -1;
            b61Var2.u = textView.getId();
            b61Var2.t = -1;
            b61Var2.k = -1;
            textView2.setLayoutParams(b61Var2);
            return;
        }
        b61Var.j = textView2.getId();
        textView.setLayoutParams(b61Var);
        b61Var2.v = textView.getId();
        b61Var2.u = -1;
        Object parent = textView2.getParent();
        parent.getClass();
        b61Var2.t = ((View) parent).getId();
        b61Var2.k = textView.getId();
        textView2.setLayoutParams(b61Var2);
    }

    @Override // o.b0
    public final void t(Object obj, VoidSignalCallback[] voidSignalCallbackArr) {
        ChatSignalsHelper.RegisterOwnTextMessageChangedSlot((IOwnTextMessageUIModel) obj, voidSignalCallbackArr[0]);
    }
}
