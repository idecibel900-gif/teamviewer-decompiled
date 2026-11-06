package o;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.teamviewer.chatviewlib.view.MultipleElementsPicker;
import com.teamviewer.chatviewmodel.swig.ChatConversationID;
import com.teamviewer.chatviewmodel.swig.ChatConversationIDSerializer;
import com.teamviewer.chatviewmodel.swig.ChatSignalsHelper;
import com.teamviewer.chatviewmodel.swig.ChatUIModelLocatorAndroid;
import com.teamviewer.chatviewmodel.swig.IAddChatEndpointListUIModel;
import com.teamviewer.remotecontrolviewlib.activity.MainActivity;
import com.teamviewer.remotecontrolviewlib.activity.SettingsActivity;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import java.util.WeakHashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lo/ao0;", "Lo/tc1;", "Lo/bi3;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ao0 extends tc1 implements bi3 {
    public IAddChatEndpointListUIModel r0;
    public RecyclerView s0;
    public ViewGroup t0;
    public ViewGroup u0;
    public MultipleElementsPicker v0;
    public SwitchCompat w0;
    public MenuItem x0;
    public final yn0 y0 = new yn0(this);
    public final zn0 z0 = new zn0(this, (byte) 0);

    @Override // o.op0
    public final boolean A0() {
        return true;
    }

    public final void B0(ChatConversationID chatConversationID) {
        bb5 bb5Var = this.p0;
        if (bb5Var != null) {
            bb5Var.D0();
        }
        bb5 bb5Var2 = this.p0;
        if (bb5Var2 != null) {
            if (it1.c != null) {
                bb5Var2.I0(ep3.h(chatConversationID), true);
            } else {
                im3.e0("viewFactory");
                throw null;
            }
        }
    }

    public final void C0(int i) {
        IAddChatEndpointListUIModel iAddChatEndpointListUIModel;
        ViewGroup viewGroup = this.u0;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        SwitchCompat switchCompat = this.w0;
        if (switchCompat != null) {
            switchCompat.setChecked(false);
        }
        if (i <= 0 || (iAddChatEndpointListUIModel = this.r0) == null || !iAddChatEndpointListUIModel.CanSharedHistoryRooms()) {
            ViewGroup viewGroup2 = this.t0;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(8);
                return;
            }
            return;
        }
        ViewGroup viewGroup3 = this.t0;
        if (viewGroup3 != null) {
            viewGroup3.setVisibility(0);
        }
    }

    @Override // o.ut2
    public final void S() {
        this.S = true;
        KeyEvent.Callback callbackC = C();
        ac3 ac3Var = callbackC instanceof ac3 ? (ac3) callbackC : null;
        if (ac3Var != null) {
            ((MainActivity) ac3Var).c0(8);
        }
    }

    @Override // o.ut2
    public final void U(Context context) {
        super.U(context);
        p0().getWindow().setSoftInputMode(18);
    }

    @Override // o.ut2
    public final void Y(Menu menu, MenuInflater menuInflater) {
        menu.getClass();
        menuInflater.getClass();
        menuInflater.inflate(R.menu.chat_conversation_add_participant_menu, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.add_participant);
        this.x0 = menuItemFindItem;
        if (menuItemFindItem != null) {
            menuItemFindItem.setEnabled(false);
        }
    }

    @Override // o.ut2
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        layoutInflater.getClass();
        xt2 xt2VarC = C();
        if (xt2VarC != null) {
            xt2VarC.setTitle(R.string.tv_chat_conversation_add_participant_title);
        }
        v0(true);
        w0();
        bb5 bb5Var = this.p0;
        if (bb5Var != null) {
            bb5Var.q(gk6.n, false);
        }
        if ((bundle != null || (bundle = this.r) != null) && this.q0 == null && (string = bundle.getString("CHAT_CONVERSATION_ID")) != null) {
            this.q0 = ChatConversationIDSerializer.Deserialize(string);
        }
        if (this.q0 == null) {
            return null;
        }
        if (this.r0 == null) {
            this.r0 = ChatUIModelLocatorAndroid.GetChatUIModelLocator().GetAddChatEndpointListUIModel(this.q0);
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_chat_conversation_add_participant, viewGroup, false);
        MultipleElementsPicker multipleElementsPicker = (MultipleElementsPicker) viewInflate.findViewById(R.id.chat_conversation_recipients_edittext);
        this.v0 = multipleElementsPicker;
        if (multipleElementsPicker != null) {
            multipleElementsPicker.setListener(this.y0);
        }
        this.t0 = (ViewGroup) viewInflate.findViewById(R.id.sharedHistoryGroup);
        this.u0 = (ViewGroup) viewInflate.findViewById(R.id.sharedHistoryTooltip);
        this.w0 = (SwitchCompat) viewInflate.findViewById(R.id.sharedHistorySwitch);
        viewInflate.findViewById(R.id.ivInfo).setOnClickListener(new io.sentry.android.core.p2(this, (byte) 5));
        this.s0 = (RecyclerView) viewInflate.findViewById(R.id.chat_conversation_recyclerview);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0);
        RecyclerView recyclerView = this.s0;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        RecyclerView recyclerView2 = this.s0;
        if (recyclerView2 != null) {
            IAddChatEndpointListUIModel iAddChatEndpointListUIModel = this.r0;
            recyclerView2.setAdapter(iAddChatEndpointListUIModel != null ? new mp0(iAddChatEndpointListUIModel, new yn0(this), new cr((byte) 6)) : null);
        }
        hk0 hk0Var = new hk0((byte) 6);
        WeakHashMap weakHashMap = be8.a;
        sd8.c(viewInflate, hk0Var);
        return viewInflate;
    }

    @Override // o.ut2
    public final void a0() {
        this.r0 = null;
        this.S = true;
    }

    @Override // o.ut2
    public final void b0() {
        if (this.x) {
            View view = this.U;
            if (view == null) {
                ye4.c("GUIHelperFuncs", "hideSoftkeyboard(): can't hide - view is null!");
            } else {
                Object systemService = view.getContext().getApplicationContext().getSystemService("input_method");
                systemService.getClass();
                ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        }
        this.s0 = null;
        this.S = true;
    }

    @Override // o.ut2
    public final void c0() {
        Window window;
        xt2 xt2VarC = C();
        if (xt2VarC != null && (window = xt2VarC.getWindow()) != null) {
            window.setSoftInputMode(34);
        }
        this.S = true;
    }

    @Override // o.ut2
    public final boolean e0(MenuItem menuItem) {
        ChatConversationID chatConversationIDAddChatEndpoints;
        menuItem.getClass();
        if (menuItem.getItemId() == R.id.add_participant) {
            ye4.a("ChatConversationAddParticipantFragment", "Add chat endpoints");
            SwitchCompat switchCompat = this.w0;
            boolean zIsChecked = switchCompat != null ? switchCompat.isChecked() : false;
            IAddChatEndpointListUIModel iAddChatEndpointListUIModel = this.r0;
            if (iAddChatEndpointListUIModel != null && (chatConversationIDAddChatEndpoints = iAddChatEndpointListUIModel.AddChatEndpoints(zIsChecked)) != null) {
                B0(chatConversationIDAddChatEndpoints);
            }
            return true;
        }
        if (menuItem.getItemId() != R.id.add_participant_settings_button) {
            return false;
        }
        IStatisticsHandler iStatisticsHandler = ga7.a;
        ga7.a(i15.t);
        Context contextE = E();
        if (it1.c != null) {
            y0(new Intent(contextE, (Class<?>) SettingsActivity.class));
            return true;
        }
        im3.e0("viewFactory");
        throw null;
    }

    @Override // o.ca3
    public final void i(String str) {
        str.getClass();
        ChatConversationID chatConversationIDGetConversationGuidForProviderId = ChatUIModelLocatorAndroid.GetChatUIModelLocator().GetConversationListUIModel().GetConversationGuidForProviderId(str);
        if (ChatConversationID.getInvalidConversationID().Equal(chatConversationIDGetConversationGuidForProviderId)) {
            ye4.c("ChatConversationAddParticipantFragment", "Open conversation: Invalid id");
            return;
        }
        ye4.a.b("ChatConversationAddParticipantFragment", "switching chat rooms");
        chatConversationIDGetConversationGuidForProviderId.getClass();
        B0(chatConversationIDGetConversationGuidForProviderId);
    }

    @Override // o.op0, o.ut2
    public final void i0() {
        super.i0();
        ChatSignalsHelper.RegisterChatEndpointListChangedSlot(this.r0, this.z0);
    }

    @Override // o.ut2
    public final void j0() {
        this.z0.Disconnect();
        this.S = true;
    }
}
