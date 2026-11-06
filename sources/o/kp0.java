package o;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.teamviewer.chatviewlib.view.AccountPictureView;
import com.teamviewer.chatviewmodel.swig.ChatConversationID;
import com.teamviewer.chatviewmodel.swig.ChatSignalsHelper;
import com.teamviewer.chatviewmodel.swig.EndpointUIState;
import com.teamviewer.chatviewmodel.swig.IConversationListUIModel;
import com.teamviewer.chatviewmodel.swig.IConversationUIModel;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import com.teamviewer.teamviewer.market.mobile.R;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class kp0 extends x implements View.OnClickListener, View.OnAttachStateChangeListener {
    public final ar G;
    public final AccountPictureView H;
    public final ImageView I;
    public final TextView J;
    public final TextView K;
    public final TextView L;
    public IConversationUIModel M;
    public jp0 N;
    public final VoidSignalCallback O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kp0(View view, ar arVar) {
        super(view);
        arVar.getClass();
        this.G = arVar;
        View viewFindViewById = view.findViewById(R.id.chat_conversation_account_picture_view);
        viewFindViewById.getClass();
        this.H = (AccountPictureView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.chat_conversation_icon_view);
        viewFindViewById2.getClass();
        this.I = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.chat_conversation_title);
        viewFindViewById3.getClass();
        this.J = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.chat_conversation_last_message);
        viewFindViewById4.getClass();
        this.K = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.chat_conversation_timestamp);
        viewFindViewById5.getClass();
        this.L = (TextView) viewFindViewById5;
        this.O = SignalCallbackFactory.INSTANCE.getInstance().voidSignalCallback(new y(this, (byte) 24));
        view.setOnClickListener(this);
        view.addOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        view.getClass();
        IConversationUIModel iConversationUIModel = this.M;
        if (iConversationUIModel != null) {
            ChatConversationID chatConversationIDGetConversationID = iConversationUIModel.GetConversationID();
            chatConversationIDGetConversationID.getClass();
            yo0 yo0Var = (yo0) this.G.n;
            yo0Var.B0(chatConversationIDGetConversationID);
            IConversationListUIModel iConversationListUIModel = yo0Var.r0;
            if (iConversationListUIModel != null) {
                iConversationListUIModel.SelectRoomFromSearch(chatConversationIDGetConversationID);
            }
            IConversationListUIModel iConversationListUIModel2 = yo0Var.r0;
            if (iConversationListUIModel2 != null) {
                iConversationListUIModel2.ResetRoomSearch();
            }
            vo0 vo0Var = yo0Var.s0;
            if (vo0Var != null) {
                vo0Var.f = chatConversationIDGetConversationID;
                vo0Var.d();
                vo0 vo0Var2 = yo0Var.s0;
                int i = 0;
                if (vo0Var2 != null && vo0Var2.f != null) {
                    for (int i2 = 0; i2 < vo0Var2.a(); i2++) {
                        ChatConversationID chatConversationIDGetConversationAtPosition = vo0Var2.c.GetConversationAtPosition(i2);
                        chatConversationIDGetConversationAtPosition.getClass();
                        ChatConversationID chatConversationID = vo0Var2.f;
                        if (chatConversationID != null && chatConversationID.Equal(chatConversationIDGetConversationAtPosition)) {
                            i = i2;
                            break;
                        }
                    }
                }
                RecyclerView recyclerView = yo0Var.w0;
                if (recyclerView != null) {
                    recyclerView.i0(i);
                }
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getClass();
        VoidSignalCallback voidSignalCallback = this.O;
        if (!voidSignalCallback.IsConnected()) {
            ChatSignalsHelper.RegisterConversationChangedSlot(this.M, voidSignalCallback);
        }
        IConversationUIModel iConversationUIModel = this.M;
        iConversationUIModel.getClass();
        s(iConversationUIModel.GetLastActivityTimestamp());
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getClass();
        this.O.Disconnect();
        jp0 jp0Var = this.N;
        if (jp0Var != null) {
            jp0Var.cancel();
            this.N = null;
        }
    }

    @Override // o.x
    public final void r(IConversationUIModel iConversationUIModel) {
        VoidSignalCallback voidSignalCallback = this.O;
        voidSignalCallback.Disconnect();
        t(iConversationUIModel, false);
        this.M = iConversationUIModel;
        ChatSignalsHelper.RegisterConversationChangedSlot(iConversationUIModel, voidSignalCallback);
    }

    public final void s(long j) {
        String string;
        long j2;
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        SimpleDateFormat simpleDateFormat = rp0.a;
        TextView textView = this.L;
        Resources resources = textView.getResources();
        resources.getClass();
        if (jCurrentTimeMillis < 60000) {
            string = resources.getString(R.string.tv_chat_time_now);
            string.getClass();
        } else if (jCurrentTimeMillis < 3600000) {
            string = (jCurrentTimeMillis / 60000) + resources.getString(R.string.tv_chat_time_minutesAgoSuffix);
        } else if (jCurrentTimeMillis < 86400000) {
            string = (jCurrentTimeMillis / 3600000) + resources.getString(R.string.tv_chat_time_hoursAgoSuffix);
        } else {
            string = rp0.b.format(new Date(j));
            string.getClass();
        }
        textView.setText(string);
        if (jCurrentTimeMillis < 3600000) {
            j2 = 60000 - (jCurrentTimeMillis % 60000);
        } else {
            j2 = jCurrentTimeMillis < 86400000 ? 3600000 - (jCurrentTimeMillis % 3600000) : 86400000 - (jCurrentTimeMillis % 86400000);
        }
        long j3 = j2;
        jp0 jp0Var = this.N;
        if (jp0Var != null) {
            jp0Var.cancel();
        }
        jp0 jp0Var2 = new jp0(this, j3, j);
        this.N = jp0Var2;
        jp0Var2.start();
    }

    public final void t(IConversationUIModel iConversationUIModel, boolean z) {
        int i;
        y4 y4Var;
        iConversationUIModel.getClass();
        IConversationUIModel.ConversationType conversationTypeGetConversationType = iConversationUIModel.GetConversationType();
        IConversationUIModel.ConversationType conversationType = IConversationUIModel.ConversationType.ContactConversation;
        ImageView imageView = this.I;
        AccountPictureView accountPictureView = this.H;
        if (conversationTypeGetConversationType == conversationType) {
            String strGetAccountPictureUrl = iConversationUIModel.GetAccountPictureUrl();
            EndpointUIState endpointUIStateGetEndpointState = iConversationUIModel.GetEndpointState();
            endpointUIStateGetEndpointState.getClass();
            int i2 = a16.a[endpointUIStateGetEndpointState.ordinal()];
            if (i2 == 1) {
                y4Var = y4.ONLINE;
            } else if (i2 == 2) {
                y4Var = y4.AWAY;
            } else if (i2 != 3) {
                y4Var = (i2 == 4 || i2 == 5) ? y4.OFFLINE : y4.NOSTATE;
            } else {
                y4Var = y4.BUSY;
            }
            accountPictureView.b(strGetAccountPictureUrl, y4Var, z);
            accountPictureView.setVisibility(0);
            imageView.setVisibility(8);
        } else {
            conversationTypeGetConversationType.getClass();
            EndpointUIState endpointUIStateGetEndpointState2 = iConversationUIModel.GetEndpointState();
            endpointUIStateGetEndpointState2.getClass();
            switch (a16.b[conversationTypeGetConversationType.ordinal()]) {
                case 1:
                    i = (endpointUIStateGetEndpointState2 != EndpointUIState.Online && endpointUIStateGetEndpointState2 != EndpointUIState.OnlineAway && endpointUIStateGetEndpointState2 != EndpointUIState.OnlineBusy) ? 2131230893 : 2131230894;
                    break;
                case 2:
                case 3:
                    i = 2131231100;
                    break;
                case 4:
                    i = 2131231103;
                    break;
                case 5:
                    i = (endpointUIStateGetEndpointState2 != EndpointUIState.Online && endpointUIStateGetEndpointState2 != EndpointUIState.OnlineAway && endpointUIStateGetEndpointState2 != EndpointUIState.OnlineBusy) ? 2131231257 : 2131231258;
                    break;
                case 6:
                    i = 0;
                    break;
                case 7:
                    ye4.c("RcChatHelper", "Unknown conversationType value " + conversationTypeGetConversationType);
                    i = 2131230826;
                    break;
                default:
                    gk0.s();
                    return;
            }
            imageView.setImageResource(i);
            imageView.setVisibility(0);
            accountPictureView.setVisibility(8);
        }
        IConversationUIModel.ConversationType conversationType2 = IConversationUIModel.ConversationType.EmptyConversation;
        TextView textView = this.J;
        TextView textView2 = this.L;
        if (conversationTypeGetConversationType == conversationType2) {
            textView.setText(R.string.tv_chat_conversation_empty_room_title);
            textView2.setVisibility(8);
        } else {
            textView.setText(iConversationUIModel.GetTitle());
            textView2.setVisibility(0);
        }
        boolean zHasUnreadMessages = iConversationUIModel.HasUnreadMessages();
        TextView textView3 = this.K;
        if (zHasUnreadMessages) {
            textView.setTextAppearance(R.style.tv_chat_conversation_title_unread);
            textView3.setTextAppearance(R.style.tv_chat_conversation_last_message_unread);
            textView2.setTextAppearance(R.style.tv_chat_conversation_timestamp_unread);
        } else {
            textView.setTextAppearance(R.style.tv_chat_conversation_title);
            textView3.setTextAppearance(R.style.tv_chat_conversation_last_message);
            textView2.setTextAppearance(R.style.tv_chat_conversation_timestamp);
        }
        textView3.setText(iConversationUIModel.GetSubTitle());
    }
}
