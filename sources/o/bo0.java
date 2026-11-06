package o;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.teamviewer.chatviewmodel.swig.ChatConversationID;
import com.teamviewer.chatviewmodel.swig.ChatMessageID;
import com.teamviewer.chatviewmodel.swig.ChatMessageState;
import com.teamviewer.chatviewmodel.swig.ChatSignalsHelper;
import com.teamviewer.chatviewmodel.swig.IConversationHistoryListUIModel;
import com.teamviewer.chatviewmodel.swig.IDateSeparatorUIModel;
import com.teamviewer.chatviewmodel.swig.IReadSentIndicatorUIModel;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import com.teamviewer.teamviewer.market.mobile.R;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes.dex */
public final class bo0 extends b0 {
    public static final /* synthetic */ int L = 0;
    public static final /* synthetic */ int M = 0;
    public final /* synthetic */ byte I;
    public final IConversationHistoryListUIModel J;
    public final TextView K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo0(View view, IConversationHistoryListUIModel iConversationHistoryListUIModel, byte b) {
        super(view, 0);
        this.I = b;
        switch (b) {
            case 1:
                super(view, 1);
                this.J = iConversationHistoryListUIModel;
                View viewFindViewById = view.findViewById(R.id.chat_message_readsend_state_textview);
                viewFindViewById.getClass();
                this.K = (TextView) viewFindViewById;
                break;
            default:
                this.J = iConversationHistoryListUIModel;
                View viewFindViewById2 = view.findViewById(R.id.chat_conversation_date_separator_textview);
                viewFindViewById2.getClass();
                this.K = (TextView) viewFindViewById2;
                break;
        }
    }

    @Override // o.b0
    public final Object r(ChatConversationID chatConversationID, ChatMessageID chatMessageID) {
        byte b = this.I;
        IConversationHistoryListUIModel iConversationHistoryListUIModel = this.J;
        switch (b) {
            case 0:
                IDateSeparatorUIModel iDateSeparatorUIModelGetDateSeparatorUIModelById = iConversationHistoryListUIModel.GetDateSeparatorUIModelById(chatMessageID);
                iDateSeparatorUIModelGetDateSeparatorUIModelById.getClass();
                return iDateSeparatorUIModelGetDateSeparatorUIModelById;
            default:
                return iConversationHistoryListUIModel.GetReadSentIndicatorUIModelById(chatMessageID);
        }
    }

    @Override // o.b0
    public final void s(Object obj, boolean z) {
        String string;
        String string2;
        byte b = this.I;
        TextView textView = this.K;
        switch (b) {
            case 0:
                IDateSeparatorUIModel iDateSeparatorUIModel = (IDateSeparatorUIModel) obj;
                SimpleDateFormat simpleDateFormat = rp0.a;
                Resources resources = textView.getResources();
                resources.getClass();
                iDateSeparatorUIModel.getClass();
                long jGetTimestamp = iDateSeparatorUIModel.GetTimestamp();
                long jCurrentTimeMillis = System.currentTimeMillis() - jGetTimestamp;
                if (jCurrentTimeMillis < 86400000) {
                    string = resources.getString(R.string.tv_chat_time_today);
                    string.getClass();
                } else if (jCurrentTimeMillis < 172800000) {
                    string = resources.getString(R.string.tv_chat_time_yesterday);
                    string.getClass();
                } else {
                    string = rp0.c.format(Long.valueOf(jGetTimestamp));
                    string.getClass();
                }
                textView.setText(string);
                break;
            default:
                IReadSentIndicatorUIModel iReadSentIndicatorUIModel = (IReadSentIndicatorUIModel) obj;
                Resources resources2 = textView.getResources();
                resources2.getClass();
                iReadSentIndicatorUIModel.getClass();
                ChatMessageState chatMessageStateGetState = iReadSentIndicatorUIModel.GetState();
                chatMessageStateGetState.getClass();
                int i = ip0.a[chatMessageStateGetState.ordinal()];
                if (i == 1) {
                    string2 = resources2.getString(R.string.tv_chat_read_state_read);
                    string2.getClass();
                } else if (i != 2) {
                    string2 = "";
                } else {
                    string2 = resources2.getString(R.string.tv_chat_read_state_sent);
                    string2.getClass();
                }
                textView.setText(string2);
                break;
        }
    }

    @Override // o.b0
    public final void t(Object obj, VoidSignalCallback[] voidSignalCallbackArr) {
        switch (this.I) {
            case 0:
                break;
            default:
                ChatSignalsHelper.RegisterReadSentStateChangedSlot((IReadSentIndicatorUIModel) obj, voidSignalCallbackArr[0]);
                break;
        }
    }
}
