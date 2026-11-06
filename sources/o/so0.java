package o;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.teamviewer.chatviewlib.view.MultipleElementsPicker;
import com.teamviewer.chatviewmodel.swig.ChatSignalsHelper;
import com.teamviewer.chatviewmodel.swig.IChatEndpointListUIModel;
import com.teamviewer.remotecontrolviewlib.activity.SettingsActivity;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class so0 implements ba3 {
    public xc0 m;
    public IChatEndpointListUIModel n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Context f2037o;
    public RecyclerView p;
    public SwitchCompat q;
    public ViewGroup r;
    public ViewGroup s;
    public MultipleElementsPicker t;
    public final qo0 u = new qo0(this);
    public final zn0 v = new zn0(this, (byte) 1);
    public final VoidSignalCallback w = SignalCallbackFactory.INSTANCE.getInstance().voidSignalCallback(new zq((byte) 21));

    public so0(xc0 xc0Var, IChatEndpointListUIModel iChatEndpointListUIModel, Context context) {
        this.m = xc0Var;
        this.n = iChatEndpointListUIModel;
        this.f2037o = context;
    }

    @Override // o.ba3
    public final void a() {
    }

    @Override // o.ba3
    public final void b() {
        d66 adapter;
        ChatSignalsHelper.RegisterChatEndpointListChangedSlot(this.n, this.v);
        ChatSignalsHelper.RegisterChatEndpointChangedSlot(this.n, this.w);
        RecyclerView recyclerView = this.p;
        if (recyclerView == null || (adapter = recyclerView.getAdapter()) == null) {
            return;
        }
        adapter.d();
    }

    public final void c(int i) {
        IChatEndpointListUIModel iChatEndpointListUIModel;
        ViewGroup viewGroup = this.s;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        SwitchCompat switchCompat = this.q;
        if (switchCompat != null) {
            switchCompat.setChecked(false);
        }
        if (i <= 1 || (iChatEndpointListUIModel = this.n) == null || !iChatEndpointListUIModel.CanSharedHistoryRooms()) {
            ViewGroup viewGroup2 = this.r;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(8);
                return;
            }
            return;
        }
        ViewGroup viewGroup3 = this.r;
        if (viewGroup3 != null) {
            viewGroup3.setVisibility(0);
        }
    }

    @Override // o.ba3
    public final void d() {
        this.m = null;
        this.n = null;
    }

    @Override // o.ba3
    public final void e(bb5 bb5Var) {
    }

    @Override // o.ba3
    public final void f() {
        this.v.Disconnect();
        this.w.Disconnect();
    }

    @Override // o.ba3
    public final boolean h(MenuItem menuItem) {
        bb5 bb5Var;
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.cancel) {
            if (menuItem.getItemId() != R.id.chat_conversation_settings_button) {
                return false;
            }
            if (it1.c == null) {
                im3.e0("viewFactory");
                throw null;
            }
            Context context = this.f2037o;
            context.startActivity(new Intent(context, (Class<?>) SettingsActivity.class));
            return true;
        }
        ye4.a.b("ChatConversationEmptyRoomLogic", "Remove new conversation");
        IChatEndpointListUIModel iChatEndpointListUIModel = this.n;
        if (iChatEndpointListUIModel != null) {
            iChatEndpointListUIModel.RemoveNewConversation();
        }
        xc0 xc0Var = this.m;
        if (xc0Var != null && (bb5Var = ((uo0) xc0Var.n).p0) != null) {
            bb5Var.D0();
        }
        return true;
    }

    @Override // o.ba3
    public final void i() {
    }

    @Override // o.ba3
    public final void j(View view, Bundle bundle, xt2 xt2Var) {
        IChatEndpointListUIModel iChatEndpointListUIModel;
        xt2Var.setTitle(R.string.tv_chat_conversation_empty_room_title);
        xc0 xc0Var = this.m;
        if (xc0Var != null) {
            uo0 uo0Var = (uo0) xc0Var.n;
            uo0Var.v0(true);
            xt2 xt2VarC = uo0Var.C();
            if (xt2VarC != null) {
                xt2VarC.invalidateOptionsMenu();
            }
        }
        this.r = (ViewGroup) view.findViewById(R.id.sharedHistoryGroup);
        this.s = (ViewGroup) view.findViewById(R.id.sharedHistoryTooltip);
        this.q = (SwitchCompat) view.findViewById(R.id.sharedHistorySwitch);
        MultipleElementsPicker multipleElementsPicker = (MultipleElementsPicker) view.findViewById(R.id.chat_conversation_recipients_edittext);
        this.t = multipleElementsPicker;
        if (multipleElementsPicker != null) {
            multipleElementsPicker.setListener(this.u);
        }
        view.findViewById(R.id.ivInfo).setOnClickListener(new io.sentry.android.core.p2(this, (byte) 6));
        this.p = (RecyclerView) view.findViewById(R.id.chat_conversation_recyclerview);
        qo0 qo0Var = new qo0(this);
        IChatEndpointListUIModel iChatEndpointListUIModel2 = this.n;
        mp0 mp0Var = iChatEndpointListUIModel2 != null ? new mp0(iChatEndpointListUIModel2, qo0Var, new cr((byte) 6)) : null;
        RecyclerView recyclerView = this.p;
        if (recyclerView != null) {
            recyclerView.setAdapter(mp0Var);
        }
        view.findViewById(R.id.chat_conversation_recipients_container).setVisibility(0);
        EditText editText = (EditText) view.findViewById(R.id.chat_conversation_message_edittext);
        View viewFindViewById = view.findViewById(R.id.chat_conversation_message_button);
        Editable text = editText.getText();
        text.getClass();
        viewFindViewById.setEnabled(ub7.x0(text.toString()).toString().length() > 0 && (iChatEndpointListUIModel = this.n) != null && iChatEndpointListUIModel.CanRequestConversation());
        editText.addTextChangedListener(new ro0((byte) 0, viewFindViewById, this));
        viewFindViewById.setOnClickListener(new y6(editText, this, (byte) 3));
    }

    @Override // o.ba3
    public final void m(Menu menu, MenuInflater menuInflater) {
        menu.getClass();
        menuInflater.getClass();
        menu.clear();
        menuInflater.inflate(R.menu.chat_conversation_empty_room_menu, menu);
    }

    @Override // o.ba3
    public final void n(Uri uri) {
    }

    @Override // o.ba3
    public final void o() {
        this.p = null;
    }
}
