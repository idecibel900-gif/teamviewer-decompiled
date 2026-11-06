package o;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.teamviewer.chatviewmodel.swig.ChatConversationID;
import com.teamviewer.chatviewmodel.swig.ChatConversationIDSerializer;
import com.teamviewer.chatviewmodel.swig.ChatUIModelLocatorAndroid;
import com.teamviewer.chatviewmodel.swig.IChatEndpointListUIModel;
import com.teamviewer.chatviewmodel.swig.IConversationHistoryListUIModel;
import com.teamviewer.chatviewmodel.swig.IConversationHistoryListUIModelAndroid;
import com.teamviewer.chatviewmodel.swig.IConversationOptionsUIModelAndroid;
import com.teamviewer.remotecontrolviewlib.activity.MainActivity;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.WeakHashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo/uo0;", "Lo/tc1;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class uo0 extends tc1 {
    public static final vv u0 = new vv((byte) 13);
    public boolean r0;
    public ba3 s0;
    public final xc0 t0 = new xc0(this, (byte) 11);

    @Override // o.op0
    public final boolean A0() {
        return true;
    }

    public final void B0(ChatConversationID chatConversationID) {
        this.q0 = chatConversationID;
        this.r0 = true;
        bb5 bb5Var = this.p0;
        if (bb5Var != null) {
            bb5Var.G0();
        }
        bb5 bb5Var2 = this.p0;
        if (bb5Var2 != null) {
            ChatConversationID chatConversationID2 = this.q0;
            uo0 uo0Var = new uo0();
            Bundle bundle = new Bundle(1);
            bundle.putString("CHAT_CONVERSATION_ID", ChatConversationIDSerializer.Serialize(chatConversationID2));
            uo0Var.u0(bundle);
            bb5Var2.I0(uo0Var, true);
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
    public final void T(int i, int i2, Intent intent) {
        ba3 ba3Var;
        if (i == 789 && i2 == -1) {
            if ((intent != null ? intent.getData() : null) == null || (ba3Var = this.s0) == null) {
                return;
            }
            Uri data = intent.getData();
            data.getClass();
            ba3Var.n(data);
        }
    }

    @Override // o.ut2
    public final void U(Context context) {
        Window window;
        super.U(context);
        xt2 xt2VarC = C();
        if (xt2VarC == null || (window = xt2VarC.getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(18);
    }

    @Override // o.ut2
    public final void Y(Menu menu, MenuInflater menuInflater) {
        menu.getClass();
        menuInflater.getClass();
        ba3 ba3Var = this.s0;
        if (ba3Var != null) {
            ba3Var.m(menu, menuInflater);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0056  */
    /* JADX WARN: Code duplicated, block: B:25:0x0063  */
    /* JADX WARN: Code duplicated, block: B:27:0x0067  */
    /* JADX WARN: Code duplicated, block: B:28:0x006b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0075  */
    /* JADX WARN: Code duplicated, block: B:32:0x007f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0083  */
    /* JADX WARN: Code duplicated, block: B:35:0x0087  */
    /* JADX WARN: Code duplicated, block: B:36:0x0098  */
    /* JADX WARN: Code duplicated, block: B:38:0x00aa A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00de  */
    @Override // o.ut2
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        View viewInflate;
        ChatConversationID chatConversationID;
        ba3 po0Var;
        boolean zIsTemporaryRoomForNewConversation;
        ye4 ye4Var;
        IConversationHistoryListUIModel iConversationHistoryListUIModelGetConversationHistoryListUIModelById;
        bb5 bb5Var;
        IChatEndpointListUIModel iChatEndpointListUIModelGetChatEndpointListUIModel;
        bb5 bb5Var2;
        Bundle bundle3;
        bb5 bb5Var3;
        ba3 ba3Var;
        String string;
        layoutInflater.getClass();
        xt2 xt2VarC = C();
        if (xt2VarC != null) {
            xt2VarC.setTitle(R.string.tv_chat_title);
        }
        bb5 bb5Var4 = this.p0;
        if (bb5Var4 != null) {
            bb5Var4.q(gk6.n, false);
        }
        w0();
        if (bundle == null) {
            bundle2 = this.r;
            if (bundle2 != null) {
            }
            viewInflate = layoutInflater.inflate(R.layout.fragment_chat_conversation, viewGroup, false);
            ((RecyclerView) viewInflate.findViewById(R.id.chat_conversation_recyclerview)).setLayoutManager(new LinearLayoutManager(0));
            if (this.s0 != null || this.r0) {
                chatConversationID = this.q0;
                xt2 xt2VarP0 = p0();
                v0(false);
                po0Var = u0;
                if (chatConversationID == null) {
                    bb5Var3 = this.p0;
                    if (bb5Var3 != null) {
                        bb5Var3.G0();
                    }
                } else {
                    zIsTemporaryRoomForNewConversation = chatConversationID.IsTemporaryRoomForNewConversation();
                    ye4Var = ye4.a;
                    if (zIsTemporaryRoomForNewConversation) {
                        iChatEndpointListUIModelGetChatEndpointListUIModel = ChatUIModelLocatorAndroid.GetChatUIModelLocator().GetChatEndpointListUIModel(chatConversationID);
                        if (iChatEndpointListUIModelGetChatEndpointListUIModel == null) {
                            bb5Var2 = this.p0;
                            if (bb5Var2 != null) {
                                bb5Var2.G0();
                            }
                        } else {
                            ye4Var.b("ChatConversationFragment", "create new empty room logic");
                            po0Var = new so0(this.t0, iChatEndpointListUIModelGetChatEndpointListUIModel, r0());
                        }
                    } else {
                        iConversationHistoryListUIModelGetConversationHistoryListUIModelById = ChatUIModelLocatorAndroid.GetChatUIModelLocator().GetConversationHistoryListUIModelById(chatConversationID);
                        IConversationOptionsUIModelAndroid iConversationOptionsUIModelAndroidGetConversationOptionsUIModelAndroid = ChatUIModelLocatorAndroid.GetConversationOptionsUIModelAndroid(chatConversationID);
                        IConversationHistoryListUIModelAndroid iConversationHistoryListUIModelAndroidGetConversationHistoryListUIModelAndroid = ChatUIModelLocatorAndroid.GetConversationHistoryListUIModelAndroid(chatConversationID);
                        if (iConversationHistoryListUIModelGetConversationHistoryListUIModelById != null || iConversationHistoryListUIModelAndroidGetConversationHistoryListUIModelAndroid == null || iConversationOptionsUIModelAndroidGetConversationOptionsUIModelAndroid == null) {
                            bb5Var = this.p0;
                            if (bb5Var != null) {
                                bb5Var.G0();
                            }
                        } else {
                            ye4Var.b("ChatConversationFragment", "create new default logic");
                            bb5 bb5Var5 = this.p0;
                            bb5Var5.getClass();
                            po0Var = new po0(this.t0, iConversationHistoryListUIModelGetConversationHistoryListUIModelById, iConversationHistoryListUIModelAndroidGetConversationHistoryListUIModelAndroid, iConversationOptionsUIModelAndroidGetConversationOptionsUIModelAndroid, bb5Var5, this);
                        }
                    }
                }
                this.s0 = po0Var;
                xt2VarP0.invalidateOptionsMenu();
                if (this.r0) {
                    this.r0 = false;
                    bundle3 = null;
                } else {
                    bundle3 = bundle;
                }
            } else {
                bundle3 = bundle;
            }
            ba3Var = this.s0;
            if (ba3Var != null) {
                ba3Var.j(viewInflate, bundle3, p0());
            }
            gk0 gk0Var = new gk0((byte) 7);
            WeakHashMap weakHashMap = be8.a;
            sd8.c(viewInflate, gk0Var);
            return viewInflate;
        }
        bundle2 = bundle;
        if (this.q0 == null && (string = bundle2.getString("CHAT_CONVERSATION_ID")) != null) {
            this.q0 = ChatConversationIDSerializer.Deserialize(string);
        }
        viewInflate = layoutInflater.inflate(R.layout.fragment_chat_conversation, viewGroup, false);
        ((RecyclerView) viewInflate.findViewById(R.id.chat_conversation_recyclerview)).setLayoutManager(new LinearLayoutManager(0));
        if (this.s0 != null) {
            chatConversationID = this.q0;
            xt2 xt2VarP1 = p0();
            v0(false);
            po0Var = u0;
            if (chatConversationID == null) {
                bb5Var3 = this.p0;
                if (bb5Var3 != null) {
                    bb5Var3.G0();
                }
            } else {
                zIsTemporaryRoomForNewConversation = chatConversationID.IsTemporaryRoomForNewConversation();
                ye4Var = ye4.a;
                if (zIsTemporaryRoomForNewConversation) {
                    iChatEndpointListUIModelGetChatEndpointListUIModel = ChatUIModelLocatorAndroid.GetChatUIModelLocator().GetChatEndpointListUIModel(chatConversationID);
                    if (iChatEndpointListUIModelGetChatEndpointListUIModel == null) {
                        bb5Var2 = this.p0;
                        if (bb5Var2 != null) {
                            bb5Var2.G0();
                        }
                    } else {
                        ye4Var.b("ChatConversationFragment", "create new empty room logic");
                        po0Var = new so0(this.t0, iChatEndpointListUIModelGetChatEndpointListUIModel, r0());
                    }
                } else {
                    iConversationHistoryListUIModelGetConversationHistoryListUIModelById = ChatUIModelLocatorAndroid.GetChatUIModelLocator().GetConversationHistoryListUIModelById(chatConversationID);
                    IConversationOptionsUIModelAndroid iConversationOptionsUIModelAndroidGetConversationOptionsUIModelAndroid2 = ChatUIModelLocatorAndroid.GetConversationOptionsUIModelAndroid(chatConversationID);
                    IConversationHistoryListUIModelAndroid iConversationHistoryListUIModelAndroidGetConversationHistoryListUIModelAndroid2 = ChatUIModelLocatorAndroid.GetConversationHistoryListUIModelAndroid(chatConversationID);
                    if (iConversationHistoryListUIModelGetConversationHistoryListUIModelById != null) {
                        bb5Var = this.p0;
                        if (bb5Var != null) {
                            bb5Var.G0();
                        }
                    } else {
                        bb5Var = this.p0;
                        if (bb5Var != null) {
                            bb5Var.G0();
                        }
                    }
                }
            }
            this.s0 = po0Var;
            xt2VarP1.invalidateOptionsMenu();
            if (this.r0) {
                this.r0 = false;
                bundle3 = null;
            } else {
                bundle3 = bundle;
            }
        } else {
            chatConversationID = this.q0;
            xt2 xt2VarP2 = p0();
            v0(false);
            po0Var = u0;
            if (chatConversationID == null) {
                bb5Var3 = this.p0;
                if (bb5Var3 != null) {
                    bb5Var3.G0();
                }
            } else {
                zIsTemporaryRoomForNewConversation = chatConversationID.IsTemporaryRoomForNewConversation();
                ye4Var = ye4.a;
                if (zIsTemporaryRoomForNewConversation) {
                    iChatEndpointListUIModelGetChatEndpointListUIModel = ChatUIModelLocatorAndroid.GetChatUIModelLocator().GetChatEndpointListUIModel(chatConversationID);
                    if (iChatEndpointListUIModelGetChatEndpointListUIModel == null) {
                        bb5Var2 = this.p0;
                        if (bb5Var2 != null) {
                            bb5Var2.G0();
                        }
                    } else {
                        ye4Var.b("ChatConversationFragment", "create new empty room logic");
                        po0Var = new so0(this.t0, iChatEndpointListUIModelGetChatEndpointListUIModel, r0());
                    }
                } else {
                    iConversationHistoryListUIModelGetConversationHistoryListUIModelById = ChatUIModelLocatorAndroid.GetChatUIModelLocator().GetConversationHistoryListUIModelById(chatConversationID);
                    IConversationOptionsUIModelAndroid iConversationOptionsUIModelAndroidGetConversationOptionsUIModelAndroid3 = ChatUIModelLocatorAndroid.GetConversationOptionsUIModelAndroid(chatConversationID);
                    IConversationHistoryListUIModelAndroid iConversationHistoryListUIModelAndroidGetConversationHistoryListUIModelAndroid3 = ChatUIModelLocatorAndroid.GetConversationHistoryListUIModelAndroid(chatConversationID);
                    if (iConversationHistoryListUIModelGetConversationHistoryListUIModelById != null) {
                        bb5Var = this.p0;
                        if (bb5Var != null) {
                            bb5Var.G0();
                        }
                    } else {
                        bb5Var = this.p0;
                        if (bb5Var != null) {
                            bb5Var.G0();
                        }
                    }
                }
            }
            this.s0 = po0Var;
            xt2VarP2.invalidateOptionsMenu();
            if (this.r0) {
                this.r0 = false;
                bundle3 = null;
            } else {
                bundle3 = bundle;
            }
        }
        ba3Var = this.s0;
        if (ba3Var != null) {
            ba3Var.j(viewInflate, bundle3, p0());
        }
        gk0 gk0Var2 = new gk0((byte) 7);
        WeakHashMap weakHashMap2 = be8.a;
        sd8.c(viewInflate, gk0Var2);
        return viewInflate;
    }

    @Override // o.ut2
    public final void a0() {
        ba3 ba3Var = this.s0;
        if (ba3Var != null) {
            ba3Var.d();
        }
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
        ba3 ba3Var = this.s0;
        if (ba3Var != null) {
            ba3Var.o();
        }
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

    @Override // o.op0, o.oq0
    public final void e(bb5 bb5Var) {
        this.p0 = bb5Var;
        ba3 ba3Var = this.s0;
        if (ba3Var != null) {
            ba3Var.e(bb5Var);
        }
    }

    @Override // o.ut2
    public final boolean e0(MenuItem menuItem) {
        menuItem.getClass();
        ba3 ba3Var = this.s0;
        return ba3Var != null && ba3Var.h(menuItem);
    }

    @Override // o.ut2
    public final void f0() {
        ba3 ba3Var = this.s0;
        if (ba3Var != null) {
            ba3Var.a();
        }
        this.S = true;
    }

    @Override // o.ut2
    public final void g0() {
        this.S = true;
        ba3 ba3Var = this.s0;
        if (ba3Var != null) {
            ba3Var.i();
        }
    }

    @Override // o.ca3
    public final void i(String str) {
        str.getClass();
        ChatConversationID chatConversationIDGetConversationGuidForProviderId = ChatUIModelLocatorAndroid.GetChatUIModelLocator().GetConversationListUIModel().GetConversationGuidForProviderId(str);
        if (chatConversationIDGetConversationGuidForProviderId == null || !chatConversationIDGetConversationGuidForProviderId.Equal(chatConversationIDGetConversationGuidForProviderId)) {
            ye4.a.b("ChatConversationFragment", "switching chatrooms");
            chatConversationIDGetConversationGuidForProviderId.getClass();
            B0(chatConversationIDGetConversationGuidForProviderId);
        }
    }

    @Override // o.op0, o.ut2
    public final void i0() {
        super.i0();
        ba3 ba3Var = this.s0;
        if (ba3Var != null) {
            ba3Var.b();
        }
    }

    @Override // o.ut2
    public final void j0() {
        ba3 ba3Var = this.s0;
        if (ba3Var != null) {
            ba3Var.f();
        }
        this.S = true;
    }
}
