package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.teamviewer.chatviewlib.view.AccountPictureView;
import com.teamviewer.chatviewmodel.swig.ChatEndpointTypeUI;
import com.teamviewer.chatviewmodel.swig.EndpointUIState;
import com.teamviewer.chatviewmodel.swig.IChatEndpointListUIModelBase;
import com.teamviewer.chatviewmodel.swig.IChatEndpointUIModel;
import com.teamviewer.teamviewer.market.mobile.R;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes.dex */
public final class mp0 extends va4 {
    public final IChatEndpointListUIModelBase c;
    public final lp0 d;

    public mp0(IChatEndpointListUIModelBase iChatEndpointListUIModelBase, lp0 lp0Var, cr crVar) {
        iChatEndpointListUIModelBase.getClass();
        this.c = iChatEndpointListUIModelBase;
        this.d = lp0Var;
    }

    @Override // o.d66
    public final int a() {
        IChatEndpointListUIModelBase iChatEndpointListUIModelBase = this.c;
        if (iChatEndpointListUIModelBase.CanSelectMoreEndpoints()) {
            return iChatEndpointListUIModelBase.GetNumberOfChatEndpoints();
        }
        return 0;
    }

    @Override // o.d66
    public final void e(c76 c76Var, int i) {
        int i2;
        y4 y4Var;
        np0 np0Var = (np0) c76Var;
        IChatEndpointUIModel iChatEndpointUIModelGetChatEndpointUIModelAtPosition = this.c.GetChatEndpointUIModelAtPosition(i);
        iChatEndpointUIModelGetChatEndpointUIModelAtPosition.getClass();
        ImageView imageView = np0Var.J;
        AccountPictureView accountPictureView = np0Var.I;
        np0Var.H.setText(iChatEndpointUIModelGetChatEndpointUIModelAtPosition.GetDisplayName());
        ChatEndpointTypeUI chatEndpointTypeUIGetType = iChatEndpointUIModelGetChatEndpointUIModelAtPosition.GetType();
        if (chatEndpointTypeUIGetType == ChatEndpointTypeUI.ContactEndpoint) {
            String strGetAccountPictureUrl = iChatEndpointUIModelGetChatEndpointUIModelAtPosition.GetAccountPictureUrl();
            EndpointUIState endpointUIStateGetState = iChatEndpointUIModelGetChatEndpointUIModelAtPosition.GetState();
            endpointUIStateGetState.getClass();
            int i3 = a16.a[endpointUIStateGetState.ordinal()];
            if (i3 == 1) {
                y4Var = y4.ONLINE;
            } else if (i3 == 2) {
                y4Var = y4.AWAY;
            } else if (i3 != 3) {
                y4Var = (i3 == 4 || i3 == 5) ? y4.OFFLINE : y4.NOSTATE;
            } else {
                y4Var = y4.BUSY;
            }
            accountPictureView.b(strGetAccountPictureUrl, y4Var, false);
            accountPictureView.setVisibility(0);
            imageView.setVisibility(8);
        } else {
            SimpleDateFormat simpleDateFormat = rp0.a;
            chatEndpointTypeUIGetType.getClass();
            int i4 = qp0.a[chatEndpointTypeUIGetType.ordinal()];
            if (i4 != 1) {
                i2 = i4 != 2 ? 2131230826 : R.drawable.icon_chat_servicecase_online;
            } else {
                i2 = R.drawable.icon_chat_computer_online;
            }
            imageView.setImageResource(i2);
            imageView.setVisibility(0);
            accountPictureView.setVisibility(8);
        }
        np0Var.m.setOnClickListener(new y6(np0Var, iChatEndpointUIModelGetChatEndpointUIModelAtPosition, (byte) 4));
    }

    @Override // o.d66
    public final c76 f(ViewGroup viewGroup, int i) {
        int i2 = np0.K;
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_chat_conversation_chatendpoint, viewGroup, false);
        viewInflate.getClass();
        return new np0(viewInflate, this.d);
    }
}
