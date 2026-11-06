package o;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.teamviewer.chatviewmodel.swig.ChatConversationID;
import com.teamviewer.chatviewmodel.swig.ChatConversationIDSerializer;
import com.teamviewer.chatviewmodel.swig.ChatSignalsHelper;
import com.teamviewer.chatviewmodel.swig.ChatUIModelLocatorAndroid;
import com.teamviewer.chatviewmodel.swig.IConversationListUIModel;
import com.teamviewer.remotecontrolviewlib.activity.MainActivity;
import com.teamviewer.remotecontrolviewlib.activity.SettingsActivity;
import com.teamviewer.remotecontrolviewlib.fragment.chat.ChatConversationListFragment$onCreateView$2;
import com.teamviewer.remotecontrolviewlib.inapppurchase.InAppPurchaseActivity;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import o.bb5;
import o.gk6;
import o.s66;
import o.vo0;
import o.y66;
import o.yo0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lo/yo0;", "Lo/op0;", "Lo/bi3;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class yo0 extends op0 implements bi3 {
    public View B0;
    public boolean C0;
    public final VoidSignalCallback E0;
    public final kh7 q0;
    public IConversationListUIModel r0;
    public vo0 s0;
    public ChatConversationListFragment$onCreateView$2 t0;
    public wk0 u0;
    public View v0;
    public RecyclerView w0;
    public String x0;
    public int y0;
    public boolean z0;
    public gk6 A0 = gk6.f902o;
    public final ar D0 = new ar(this, 4);
    public final xo0 F0 = new xo0(this);
    public final io.sentry.android.core.p2 G0 = new io.sentry.android.core.p2(this, 7);

    public yo0() {
        final byte b = 0;
        this.q0 = new kh7(new Function0(this) { // from class: o.wo0
            public final /* synthetic */ yo0 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b2 = b;
                yo0 yo0Var = this.n;
                switch (b2) {
                    case 0:
                        if (zu1.c == null) {
                            hk0.g("Required value was null.");
                            return null;
                        }
                        dl5 dl5Var = new dl5(new w26((byte) 1), (byte) 2);
                        ve8 g0 = yo0Var.getG0();
                        bf1 bf1VarK = h57.k(yo0Var);
                        pn5 pn5VarT = ua5.t(bf1VarK, g0, dl5Var, bf1VarK);
                        wt3 wt3VarB = w86.a.b(zo0.class);
                        String strC = wt3VarB.c();
                        if (strC != null) {
                            return (zo0) pn5VarT.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
                        }
                        hk0.g("Local and anonymous classes can not be ViewModels");
                        return null;
                    default:
                        String str = yo0Var.x0;
                        if (str != null) {
                            yo0Var.i(str);
                        }
                        vo0 vo0Var = yo0Var.s0;
                        if (vo0Var != null) {
                            IConversationListUIModel iConversationListUIModel = yo0Var.r0;
                            boolean z = iConversationListUIModel != null && iConversationListUIModel.IsLoading();
                            e66 e66Var = vo0Var.a;
                            if (vo0Var.e != z) {
                                if (z) {
                                    e66Var.e(vo0Var.a(), 1);
                                } else {
                                    e66Var.f(vo0Var.a() - 1, 1);
                                }
                                vo0Var.e = z;
                            }
                        }
                        View view = yo0Var.B0;
                        if (view != null) {
                            IConversationListUIModel iConversationListUIModel2 = yo0Var.r0;
                            view.setVisibility((iConversationListUIModel2 == null || !iConversationListUIModel2.CanCreateNewConversation()) ? 8 : 0);
                        }
                        View view2 = yo0Var.v0;
                        if (view2 != null) {
                            vo0 vo0Var2 = yo0Var.s0;
                            view2.setVisibility((vo0Var2 == null || vo0Var2.a() >= 1 || !yo0Var.z0) ? 8 : 0);
                        }
                        return f88.a;
                }
            }
        });
        final byte b2 = 1;
        this.E0 = SignalCallbackFactory.INSTANCE.getInstance().voidSignalCallback(new Function0(this) { // from class: o.wo0
            public final /* synthetic */ yo0 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b3 = b2;
                yo0 yo0Var = this.n;
                switch (b3) {
                    case 0:
                        if (zu1.c == null) {
                            hk0.g("Required value was null.");
                            return null;
                        }
                        dl5 dl5Var = new dl5(new w26((byte) 1), (byte) 2);
                        ve8 g0 = yo0Var.getG0();
                        bf1 bf1VarK = h57.k(yo0Var);
                        pn5 pn5VarT = ua5.t(bf1VarK, g0, dl5Var, bf1VarK);
                        wt3 wt3VarB = w86.a.b(zo0.class);
                        String strC = wt3VarB.c();
                        if (strC != null) {
                            return (zo0) pn5VarT.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
                        }
                        hk0.g("Local and anonymous classes can not be ViewModels");
                        return null;
                    default:
                        String str = yo0Var.x0;
                        if (str != null) {
                            yo0Var.i(str);
                        }
                        vo0 vo0Var = yo0Var.s0;
                        if (vo0Var != null) {
                            IConversationListUIModel iConversationListUIModel = yo0Var.r0;
                            boolean z = iConversationListUIModel != null && iConversationListUIModel.IsLoading();
                            e66 e66Var = vo0Var.a;
                            if (vo0Var.e != z) {
                                if (z) {
                                    e66Var.e(vo0Var.a(), 1);
                                } else {
                                    e66Var.f(vo0Var.a() - 1, 1);
                                }
                                vo0Var.e = z;
                            }
                        }
                        View view = yo0Var.B0;
                        if (view != null) {
                            IConversationListUIModel iConversationListUIModel2 = yo0Var.r0;
                            view.setVisibility((iConversationListUIModel2 == null || !iConversationListUIModel2.CanCreateNewConversation()) ? 8 : 0);
                        }
                        View view2 = yo0Var.v0;
                        if (view2 != null) {
                            vo0 vo0Var2 = yo0Var.s0;
                            view2.setVisibility((vo0Var2 == null || vo0Var2.a() >= 1 || !yo0Var.z0) ? 8 : 0);
                        }
                        return f88.a;
                }
            }
        });
    }

    @Override // o.op0
    public final boolean A0() {
        return false;
    }

    public final void B0(ChatConversationID chatConversationID) {
        bb5 bb5Var = this.p0;
        if (bb5Var != null) {
            uo0 uo0Var = new uo0();
            Bundle bundle = new Bundle(1);
            bundle.putString("CHAT_CONVERSATION_ID", ChatConversationIDSerializer.Serialize(chatConversationID));
            uo0Var.u0(bundle);
            bb5Var.I0(uo0Var, true);
        }
    }

    @Override // o.ut2
    public final void S() {
        this.S = true;
        KeyEvent.Callback callbackC = C();
        ac3 ac3Var = callbackC instanceof ac3 ? (ac3) callbackC : null;
        if (ac3Var != null) {
            ((MainActivity) ac3Var).c0(0);
        }
    }

    @Override // o.ut2
    public final void X(Bundle bundle) {
        super.X(bundle);
        v0(true);
    }

    @Override // o.ut2
    public final void Y(Menu menu, MenuInflater menuInflater) {
        wk0 wk0Var;
        menu.getClass();
        menuInflater.getClass();
        menuInflater.inflate(R.menu.chat_conversation_list_menu, menu);
        IConversationListUIModel iConversationListUIModel = this.r0;
        if (iConversationListUIModel != null && iConversationListUIModel.CanSearchForRooms() && (wk0Var = this.u0) != null) {
            CharSequence charSequence = (CharSequence) wk0Var.f2420o;
            menuInflater.inflate(R.menu.buddylistgroup_search_menu, menu);
            MenuItem menuItemFindItem = menu.findItem(R.id.action_search);
            SearchView searchView = (SearchView) menuItemFindItem.getActionView();
            wk0Var.n = searchView;
            if (searchView != null) {
                searchView.setSubmitButtonEnabled(true);
            }
            SearchView searchView2 = (SearchView) wk0Var.n;
            if (searchView2 != null) {
                searchView2.setOnQueryTextListener(new wk0(iConversationListUIModel, searchView2));
            }
            menuItemFindItem.setOnActionExpandListener(new yp0(iConversationListUIModel));
            if (charSequence != null && charSequence.length() != 0) {
                menuItemFindItem.expandActionView();
                SearchView searchView3 = (SearchView) wk0Var.n;
                if (searchView3 != null) {
                    searchView3.r(charSequence, true);
                }
            }
        }
        menu.findItem(R.id.chat_conversation_list_subscribe_button).setVisible(this.C0);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.teamviewer.remotecontrolviewlib.fragment.chat.ChatConversationListFragment$onCreateView$2] */
    @Override // o.ut2
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        layoutInflater.getClass();
        this.r0 = ChatUIModelLocatorAndroid.GetChatUIModelLocator().GetConversationListUIModel();
        KeyEvent.Callback callbackC = C();
        id3 id3Var = callbackC instanceof id3 ? (id3) callbackC : null;
        if (id3Var != null) {
            id3Var.f(null, false, null, (15 & 8) == 0);
        }
        xt2 xt2VarC = C();
        if (xt2VarC != null) {
            xt2VarC.setTitle(R.string.tv_chat_title);
        }
        Bundle bundle2 = this.r;
        if (bundle2 != null && (string = bundle2.getString("CHATROOMID")) != null) {
            i(string);
        }
        IConversationListUIModel iConversationListUIModel = this.r0;
        this.s0 = iConversationListUIModel != null ? new vo0(iConversationListUIModel, this.D0, new aw((byte) 5)) : null;
        this.t0 = new LinearLayoutManager() { // from class: com.teamviewer.remotecontrolviewlib.fragment.chat.ChatConversationListFragment$onCreateView$2
            {
                super(0);
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
            public final void m0(s66 s66Var, y66 y66Var) {
                s66Var.getClass();
                y66Var.getClass();
                super.m0(s66Var, y66Var);
                yo0 yo0Var = this.Q;
                vo0 vo0Var = yo0Var.s0;
                int iA = vo0Var != null ? vo0Var.a() : 0;
                if (y66Var.f || yo0Var.y0 != iA) {
                    yo0Var.y0 = iA;
                    gk6 gk6Var = yo0Var.A0;
                    gk6 gk6Var2 = gk6.n;
                    if (gk6Var2 != gk6Var) {
                        bb5 bb5Var = yo0Var.p0;
                        if (bb5Var != null) {
                            bb5Var.q(gk6Var2, false);
                        }
                        yo0Var.A0 = gk6Var2;
                    }
                }
            }
        };
        ((zo0) this.q0.getValue()).f2724o.observe(L(), new a7(new q0(this, (byte) 22), (byte) 1));
        if (bundle != null) {
            Parcelable parcelable = (Parcelable) pm8.u(bundle, "KEY_LAYOUT_MANAGER_STATE", Parcelable.class);
            ChatConversationListFragment$onCreateView$2 chatConversationListFragment$onCreateView$2 = this.t0;
            if (chatConversationListFragment$onCreateView$2 != null) {
                chatConversationListFragment$onCreateView$2.o0(parcelable);
            }
        }
        boolean z = false;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_chat_conversation_list, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.chat_list_recycler_view);
        this.w0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(this.t0);
        }
        RecyclerView recyclerView2 = this.w0;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.s0);
        }
        RecyclerView recyclerView3 = this.w0;
        if (recyclerView3 != null) {
            recyclerView3.setOnTouchListener(new lo0(this));
        }
        KeyEvent.Callback callbackC2 = C();
        if (callbackC2 instanceof pa3) {
            CoordinatorLayout coordinatorLayoutU = ((MainActivity) ((pa3) callbackC2)).U();
            View viewInflate2 = layoutInflater.inflate(R.layout.chat_fab_new_conversation, (ViewGroup) coordinatorLayoutU, false);
            this.B0 = viewInflate2;
            View viewFindViewById = viewInflate2 != null ? viewInflate2.findViewById(R.id.chat_main_floating_button) : null;
            if (viewFindViewById != null) {
                viewFindViewById.setOnClickListener(this.G0);
            }
            coordinatorLayoutU.addView(this.B0);
            View view = this.B0;
            if (view != null) {
                IConversationListUIModel iConversationListUIModel2 = this.r0;
                view.setVisibility((iConversationListUIModel2 == null || !iConversationListUIModel2.CanCreateNewConversation()) ? 8 : 0);
            }
        }
        wk0 wk0Var = new wk0((byte) 3, z);
        if (bundle != null) {
            wk0Var.f2420o = bundle.getCharSequence("SEARCHTEXT");
        }
        this.u0 = wk0Var;
        this.v0 = viewInflate.findViewById(R.id.no_chat_room_results_view);
        vo0 vo0Var = this.s0;
        if (vo0Var != null && vo0Var.a() > 1) {
            this.z0 = true;
        }
        return viewInflate;
    }

    @Override // o.ut2
    public final void b0() {
        this.S = true;
        KeyEvent.Callback callbackC = C();
        if (callbackC instanceof pa3) {
            ((MainActivity) ((pa3) callbackC)).U().removeView(this.B0);
        }
        this.B0 = null;
        this.t0 = null;
        this.s0 = null;
        this.r0 = null;
        this.u0 = null;
    }

    @Override // o.ut2
    public final boolean e0(MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == R.id.chat_conversation_list_settings_button) {
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
        if (itemId != R.id.chat_conversation_list_subscribe_button) {
            return false;
        }
        IStatisticsHandler iStatisticsHandler2 = ga7.a;
        ga7.a(fg3.p);
        int i = InAppPurchaseActivity.S;
        Intent intentJ = ct1.J(C());
        if (intentJ != null) {
            KeyEvent.Callback callbackC = C();
            bb3 bb3Var = callbackC instanceof bb3 ? (bb3) callbackC : null;
            if (bb3Var != null) {
                bb3Var.i(intentJ);
            }
        }
        return true;
    }

    @Override // o.ut2
    public final void h0(Bundle bundle) {
        ChatConversationListFragment$onCreateView$2 chatConversationListFragment$onCreateView$2 = this.t0;
        if (chatConversationListFragment$onCreateView$2 != null) {
            bundle.putParcelable("KEY_LAYOUT_MANAGER_STATE", chatConversationListFragment$onCreateView$2.p0());
        }
    }

    @Override // o.ca3
    public final void i(String str) {
        str.getClass();
        IConversationListUIModel iConversationListUIModelGetConversationListUIModel = this.r0;
        if (iConversationListUIModelGetConversationListUIModel == null) {
            iConversationListUIModelGetConversationListUIModel = ChatUIModelLocatorAndroid.GetChatUIModelLocator().GetConversationListUIModel();
            this.r0 = iConversationListUIModelGetConversationListUIModel;
        }
        ChatConversationID chatConversationIDGetConversationGuidForProviderId = iConversationListUIModelGetConversationListUIModel != null ? iConversationListUIModelGetConversationListUIModel.GetConversationGuidForProviderId(str) : null;
        if (chatConversationIDGetConversationGuidForProviderId != null && chatConversationIDGetConversationGuidForProviderId.Equal(ChatConversationID.getInvalidConversationID())) {
            this.x0 = str;
        } else if (chatConversationIDGetConversationGuidForProviderId != null) {
            this.x0 = null;
            B0(chatConversationIDGetConversationGuidForProviderId);
        }
    }

    @Override // o.op0, o.ut2
    public final void i0() {
        super.i0();
        ChatSignalsHelper.RegisterConversationListStatusChangedSlot(this.r0, this.E0);
        ChatSignalsHelper.RegisterConversationListListChangedSlot(this.r0, this.F0);
        vo0 vo0Var = this.s0;
        if (vo0Var != null) {
            IConversationListUIModel iConversationListUIModel = this.r0;
            boolean z = false;
            if (iConversationListUIModel != null && iConversationListUIModel.IsLoading()) {
                z = true;
            }
            e66 e66Var = vo0Var.a;
            if (vo0Var.e != z) {
                if (z) {
                    e66Var.e(vo0Var.a(), 1);
                } else {
                    e66Var.f(vo0Var.a() - 1, 1);
                }
                vo0Var.e = z;
            }
        }
        vo0 vo0Var2 = this.s0;
        if (vo0Var2 != null) {
            vo0Var2.d();
        }
        this.A0 = gk6.f902o;
    }

    @Override // o.ut2
    public final void j0() {
        this.S = true;
        this.E0.Disconnect();
        this.F0.Disconnect();
    }
}
