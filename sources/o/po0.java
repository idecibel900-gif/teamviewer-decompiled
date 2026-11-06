package o;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.teamviewer.chatviewmodel.swig.ChatConversationID;
import com.teamviewer.chatviewmodel.swig.ChatConversationIDSerializer;
import com.teamviewer.chatviewmodel.swig.ChatMessageUITypes;
import com.teamviewer.chatviewmodel.swig.ChatSignalsHelper;
import com.teamviewer.chatviewmodel.swig.ChatUIModelLocatorAndroid;
import com.teamviewer.chatviewmodel.swig.IChatUIModelLocator;
import com.teamviewer.chatviewmodel.swig.IConversationHistoryListUIModel;
import com.teamviewer.chatviewmodel.swig.IConversationHistoryListUIModelAndroid;
import com.teamviewer.chatviewmodel.swig.IConversationMemberListUIModel;
import com.teamviewer.chatviewmodel.swig.IConversationOptionsUIModelAndroid;
import com.teamviewer.nativelivedatalib.swig.NativeLiveDataBool;
import com.teamviewer.nativelivedatalib.swig.NativeLiveDataInt;
import com.teamviewer.nativelivedatalib.swig.NativeLiveDataStringUTF8;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class po0 implements ba3 {
    public ProgressBar A;
    public int B;
    public boolean C;
    public int D;
    public final do0 E;
    public final do0 F;
    public final do0 G;
    public final do0 H;
    public final VoidSignalCallback I;
    public final VoidSignalCallback J;
    public final no0 K;
    public final VoidSignalCallback L;
    public xc0 m;
    public IConversationHistoryListUIModel n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public IConversationHistoryListUIModelAndroid f1756o;
    public IConversationOptionsUIModelAndroid p;
    public bb5 q;
    public View r;
    public Context s;
    public RecyclerView t;
    public xt2 u;
    public TextView v;
    public View w;
    public View x;
    public View y;
    public TextView z;

    /* JADX WARN: Type inference failed for: r2v2, types: [o.do0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [o.do0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [o.do0] */
    /* JADX WARN: Type inference failed for: r2v5, types: [o.do0] */
    public po0(xc0 xc0Var, IConversationHistoryListUIModel iConversationHistoryListUIModel, IConversationHistoryListUIModelAndroid iConversationHistoryListUIModelAndroid, IConversationOptionsUIModelAndroid iConversationOptionsUIModelAndroid, bb5 bb5Var, uo0 uo0Var) {
        NativeLiveDataInt nativeLiveDataIntCurrentUploadProgress;
        NativeLiveDataStringUTF8 nativeLiveDataStringUTF8CurrentUploadFileName;
        NativeLiveDataBool nativeLiveDataBoolHasQueuedUploads;
        bb5Var.getClass();
        this.m = xc0Var;
        this.n = iConversationHistoryListUIModel;
        this.f1756o = iConversationHistoryListUIModelAndroid;
        this.p = iConversationOptionsUIModelAndroid;
        this.q = bb5Var;
        this.D = -1;
        final byte b = 1;
        this.E = new hk7(this) { // from class: o.do0
            public final /* synthetic */ po0 b;

            {
                this.b = this;
            }

            @Override // o.hk7
            public final void a(gk7 gk7Var) {
                IConversationOptionsUIModelAndroid iConversationOptionsUIModelAndroid2;
                byte b2 = b;
                ye4 ye4Var = ye4.a;
                po0 po0Var = this.b;
                switch (b2) {
                    case 0:
                        ye4Var.b("ChatConversationDefaultLogic", "Leave conversation");
                        IConversationOptionsUIModelAndroid iConversationOptionsUIModelAndroid3 = po0Var.p;
                        if (iConversationOptionsUIModelAndroid3 != null) {
                            iConversationOptionsUIModelAndroid3.LeaveConversation();
                        }
                        gk7Var.A0();
                        break;
                    case 1:
                        ye4Var.b("ChatConversationDefaultLogic", "Rename conversation");
                        if (gk7Var instanceof fs7) {
                            String strP0 = ((fs7) gk7Var).P0();
                            if (strP0.length() > 0 && (iConversationOptionsUIModelAndroid2 = po0Var.p) != null) {
                                iConversationOptionsUIModelAndroid2.RequestRenameConversation(strP0);
                            }
                        } else {
                            ye4.c("ChatConversationDefaultLogic", "dialog is not a text input dialog!");
                        }
                        gk7Var.A0();
                        break;
                    case 2:
                        ye4Var.b("ChatConversationDefaultLogic", "Delete conversation");
                        IConversationOptionsUIModelAndroid iConversationOptionsUIModelAndroid4 = po0Var.p;
                        if (iConversationOptionsUIModelAndroid4 != null) {
                            iConversationOptionsUIModelAndroid4.DeleteConversation();
                        }
                        gk7Var.A0();
                        break;
                    default:
                        ye4Var.b("ChatConversationDefaultLogic", "Delete history");
                        IConversationOptionsUIModelAndroid iConversationOptionsUIModelAndroid5 = po0Var.p;
                        if (iConversationOptionsUIModelAndroid5 != null) {
                            iConversationOptionsUIModelAndroid5.DeleteHistory();
                        }
                        gk7Var.A0();
                        break;
                }
            }
        };
        final byte b2 = 2;
        this.F = new hk7(this) { // from class: o.do0
            public final /* synthetic */ po0 b;

            {
                this.b = this;
            }

            @Override // o.hk7
            public final void a(gk7 gk7Var) {
                IConversationOptionsUIModelAndroid iConversationOptionsUIModelAndroid2;
                byte b3 = b2;
                ye4 ye4Var = ye4.a;
                po0 po0Var = this.b;
                switch (b3) {
                    case 0:
                        ye4Var.b("ChatConversationDefaultLogic", "Leave conversation");
                        IConversationOptionsUIModelAndroid iConversationOptionsUIModelAndroid3 = po0Var.p;
                        if (iConversationOptionsUIModelAndroid3 != null) {
                            iConversationOptionsUIModelAndroid3.LeaveConversation();
                        }
                        gk7Var.A0();
                        break;
                    case 1:
                        ye4Var.b("ChatConversationDefaultLogic", "Rename conversation");
                        if (gk7Var instanceof fs7) {
                            String strP0 = ((fs7) gk7Var).P0();
                            if (strP0.length() > 0 && (iConversationOptionsUIModelAndroid2 = po0Var.p) != null) {
                                iConversationOptionsUIModelAndroid2.RequestRenameConversation(strP0);
                            }
                        } else {
                            ye4.c("ChatConversationDefaultLogic", "dialog is not a text input dialog!");
                        }
                        gk7Var.A0();
                        break;
                    case 2:
                        ye4Var.b("ChatConversationDefaultLogic", "Delete conversation");
                        IConversationOptionsUIModelAndroid iConversationOptionsUIModelAndroid4 = po0Var.p;
                        if (iConversationOptionsUIModelAndroid4 != null) {
                            iConversationOptionsUIModelAndroid4.DeleteConversation();
                        }
                        gk7Var.A0();
                        break;
                    default:
                        ye4Var.b("ChatConversationDefaultLogic", "Delete history");
                        IConversationOptionsUIModelAndroid iConversationOptionsUIModelAndroid5 = po0Var.p;
                        if (iConversationOptionsUIModelAndroid5 != null) {
                            iConversationOptionsUIModelAndroid5.DeleteHistory();
                        }
                        gk7Var.A0();
                        break;
                }
            }
        };
        final byte b3 = 3;
        this.G = new hk7(this) { // from class: o.do0
            public final /* synthetic */ po0 b;

            {
                this.b = this;
            }

            @Override // o.hk7
            public final void a(gk7 gk7Var) {
                IConversationOptionsUIModelAndroid iConversationOptionsUIModelAndroid2;
                byte b4 = b3;
                ye4 ye4Var = ye4.a;
                po0 po0Var = this.b;
                switch (b4) {
                    case 0:
                        ye4Var.b("ChatConversationDefaultLogic", "Leave conversation");
                        IConversationOptionsUIModelAndroid iConversationOptionsUIModelAndroid3 = po0Var.p;
                        if (iConversationOptionsUIModelAndroid3 != null) {
                            iConversationOptionsUIModelAndroid3.LeaveConversation();
                        }
                        gk7Var.A0();
                        break;
                    case 1:
                        ye4Var.b("ChatConversationDefaultLogic", "Rename conversation");
                        if (gk7Var instanceof fs7) {
                            String strP0 = ((fs7) gk7Var).P0();
                            if (strP0.length() > 0 && (iConversationOptionsUIModelAndroid2 = po0Var.p) != null) {
                                iConversationOptionsUIModelAndroid2.RequestRenameConversation(strP0);
                            }
                        } else {
                            ye4.c("ChatConversationDefaultLogic", "dialog is not a text input dialog!");
                        }
                        gk7Var.A0();
                        break;
                    case 2:
                        ye4Var.b("ChatConversationDefaultLogic", "Delete conversation");
                        IConversationOptionsUIModelAndroid iConversationOptionsUIModelAndroid4 = po0Var.p;
                        if (iConversationOptionsUIModelAndroid4 != null) {
                            iConversationOptionsUIModelAndroid4.DeleteConversation();
                        }
                        gk7Var.A0();
                        break;
                    default:
                        ye4Var.b("ChatConversationDefaultLogic", "Delete history");
                        IConversationOptionsUIModelAndroid iConversationOptionsUIModelAndroid5 = po0Var.p;
                        if (iConversationOptionsUIModelAndroid5 != null) {
                            iConversationOptionsUIModelAndroid5.DeleteHistory();
                        }
                        gk7Var.A0();
                        break;
                }
            }
        };
        final byte b4 = 0;
        this.H = new hk7(this) { // from class: o.do0
            public final /* synthetic */ po0 b;

            {
                this.b = this;
            }

            @Override // o.hk7
            public final void a(gk7 gk7Var) {
                IConversationOptionsUIModelAndroid iConversationOptionsUIModelAndroid2;
                byte b5 = b4;
                ye4 ye4Var = ye4.a;
                po0 po0Var = this.b;
                switch (b5) {
                    case 0:
                        ye4Var.b("ChatConversationDefaultLogic", "Leave conversation");
                        IConversationOptionsUIModelAndroid iConversationOptionsUIModelAndroid3 = po0Var.p;
                        if (iConversationOptionsUIModelAndroid3 != null) {
                            iConversationOptionsUIModelAndroid3.LeaveConversation();
                        }
                        gk7Var.A0();
                        break;
                    case 1:
                        ye4Var.b("ChatConversationDefaultLogic", "Rename conversation");
                        if (gk7Var instanceof fs7) {
                            String strP0 = ((fs7) gk7Var).P0();
                            if (strP0.length() > 0 && (iConversationOptionsUIModelAndroid2 = po0Var.p) != null) {
                                iConversationOptionsUIModelAndroid2.RequestRenameConversation(strP0);
                            }
                        } else {
                            ye4.c("ChatConversationDefaultLogic", "dialog is not a text input dialog!");
                        }
                        gk7Var.A0();
                        break;
                    case 2:
                        ye4Var.b("ChatConversationDefaultLogic", "Delete conversation");
                        IConversationOptionsUIModelAndroid iConversationOptionsUIModelAndroid4 = po0Var.p;
                        if (iConversationOptionsUIModelAndroid4 != null) {
                            iConversationOptionsUIModelAndroid4.DeleteConversation();
                        }
                        gk7Var.A0();
                        break;
                    default:
                        ye4Var.b("ChatConversationDefaultLogic", "Delete history");
                        IConversationOptionsUIModelAndroid iConversationOptionsUIModelAndroid5 = po0Var.p;
                        if (iConversationOptionsUIModelAndroid5 != null) {
                            iConversationOptionsUIModelAndroid5.DeleteHistory();
                        }
                        gk7Var.A0();
                        break;
                }
            }
        };
        SignalCallbackFactory.Companion companion = SignalCallbackFactory.INSTANCE;
        this.I = companion.getInstance().voidSignalCallback(new Function0(this) { // from class: o.eo0
            public final /* synthetic */ po0 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                bb5 bb5Var2;
                byte b5 = b4;
                f88 f88Var = f88.a;
                po0 po0Var = this.n;
                switch (b5) {
                    case 0:
                        xc0 xc0Var2 = po0Var.m;
                        if (xc0Var2 != null && (bb5Var2 = ((uo0) xc0Var2.n).p0) != null) {
                            bb5Var2.D0();
                        }
                        break;
                    case 1:
                        po0Var.l();
                        po0Var.c();
                        break;
                    default:
                        po0Var.g();
                        po0Var.l();
                        break;
                }
                return f88Var;
            }
        });
        this.J = companion.getInstance().voidSignalCallback(new Function0(this) { // from class: o.eo0
            public final /* synthetic */ po0 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                bb5 bb5Var2;
                byte b5 = b;
                f88 f88Var = f88.a;
                po0 po0Var = this.n;
                switch (b5) {
                    case 0:
                        xc0 xc0Var2 = po0Var.m;
                        if (xc0Var2 != null && (bb5Var2 = ((uo0) xc0Var2.n).p0) != null) {
                            bb5Var2.D0();
                        }
                        break;
                    case 1:
                        po0Var.l();
                        po0Var.c();
                        break;
                    default:
                        po0Var.g();
                        po0Var.l();
                        break;
                }
                return f88Var;
            }
        });
        this.K = new no0(this);
        this.L = companion.getInstance().voidSignalCallback(new Function0(this) { // from class: o.eo0
            public final /* synthetic */ po0 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                bb5 bb5Var2;
                byte b5 = b2;
                f88 f88Var = f88.a;
                po0 po0Var = this.n;
                switch (b5) {
                    case 0:
                        xc0 xc0Var2 = po0Var.m;
                        if (xc0Var2 != null && (bb5Var2 = ((uo0) xc0Var2.n).p0) != null) {
                            bb5Var2.D0();
                        }
                        break;
                    case 1:
                        po0Var.l();
                        po0Var.c();
                        break;
                    default:
                        po0Var.g();
                        po0Var.l();
                        break;
                }
                return f88Var;
            }
        });
        IConversationHistoryListUIModelAndroid iConversationHistoryListUIModelAndroid2 = this.f1756o;
        byte b5 = 8;
        if (iConversationHistoryListUIModelAndroid2 != null && (nativeLiveDataBoolHasQueuedUploads = iConversationHistoryListUIModelAndroid2.HasQueuedUploads()) != null) {
            nativeLiveDataBoolHasQueuedUploads.observe(uo0Var, new b7(new Function1(this) { // from class: o.fo0
                public final /* synthetic */ po0 n;

                {
                    this.n = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    byte b6 = b4;
                    f88 f88Var = f88.a;
                    po0 po0Var = this.n;
                    switch (b6) {
                        case 0:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            View view = po0Var.y;
                            if (!zBooleanValue) {
                                if (view != null) {
                                    view.setVisibility(8);
                                }
                            } else if (view != null) {
                                view.setVisibility(0);
                            }
                            break;
                        case 1:
                            String str = (String) obj;
                            TextView textView = po0Var.z;
                            if (textView != null) {
                                textView.setText(str);
                            }
                            break;
                        default:
                            Integer num = (Integer) obj;
                            ProgressBar progressBar = po0Var.A;
                            if (progressBar != null) {
                                progressBar.setIndeterminate(false);
                            }
                            ProgressBar progressBar2 = po0Var.A;
                            if (progressBar2 != null) {
                                progressBar2.setProgress(num != null ? num.intValue() : 0);
                            }
                            break;
                    }
                    return f88Var;
                }
            }, b5));
        }
        IConversationHistoryListUIModelAndroid iConversationHistoryListUIModelAndroid3 = this.f1756o;
        if (iConversationHistoryListUIModelAndroid3 != null && (nativeLiveDataStringUTF8CurrentUploadFileName = iConversationHistoryListUIModelAndroid3.CurrentUploadFileName()) != null) {
            nativeLiveDataStringUTF8CurrentUploadFileName.observe(uo0Var, new b7(new Function1(this) { // from class: o.fo0
                public final /* synthetic */ po0 n;

                {
                    this.n = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    byte b6 = b;
                    f88 f88Var = f88.a;
                    po0 po0Var = this.n;
                    switch (b6) {
                        case 0:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            View view = po0Var.y;
                            if (!zBooleanValue) {
                                if (view != null) {
                                    view.setVisibility(8);
                                }
                            } else if (view != null) {
                                view.setVisibility(0);
                            }
                            break;
                        case 1:
                            String str = (String) obj;
                            TextView textView = po0Var.z;
                            if (textView != null) {
                                textView.setText(str);
                            }
                            break;
                        default:
                            Integer num = (Integer) obj;
                            ProgressBar progressBar = po0Var.A;
                            if (progressBar != null) {
                                progressBar.setIndeterminate(false);
                            }
                            ProgressBar progressBar2 = po0Var.A;
                            if (progressBar2 != null) {
                                progressBar2.setProgress(num != null ? num.intValue() : 0);
                            }
                            break;
                    }
                    return f88Var;
                }
            }, b5));
        }
        IConversationHistoryListUIModelAndroid iConversationHistoryListUIModelAndroid4 = this.f1756o;
        if (iConversationHistoryListUIModelAndroid4 == null || (nativeLiveDataIntCurrentUploadProgress = iConversationHistoryListUIModelAndroid4.CurrentUploadProgress()) == null) {
            return;
        }
        nativeLiveDataIntCurrentUploadProgress.observe(uo0Var, new b7(new Function1(this) { // from class: o.fo0
            public final /* synthetic */ po0 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b6 = b2;
                f88 f88Var = f88.a;
                po0 po0Var = this.n;
                switch (b6) {
                    case 0:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        View view = po0Var.y;
                        if (!zBooleanValue) {
                            if (view != null) {
                                view.setVisibility(8);
                            }
                        } else if (view != null) {
                            view.setVisibility(0);
                        }
                        break;
                    case 1:
                        String str = (String) obj;
                        TextView textView = po0Var.z;
                        if (textView != null) {
                            textView.setText(str);
                        }
                        break;
                    default:
                        Integer num = (Integer) obj;
                        ProgressBar progressBar = po0Var.A;
                        if (progressBar != null) {
                            progressBar.setIndeterminate(false);
                        }
                        ProgressBar progressBar2 = po0Var.A;
                        if (progressBar2 != null) {
                            progressBar2.setProgress(num != null ? num.intValue() : 0);
                        }
                        break;
                }
                return f88Var;
            }
        }, b5));
    }

    @Override // o.ba3
    public final void a() {
        IConversationHistoryListUIModel iConversationHistoryListUIModel = this.n;
        if (iConversationHistoryListUIModel != null) {
            iConversationHistoryListUIModel.SendTypingEvent(false);
        }
    }

    @Override // o.ba3
    public final void b() {
        RecyclerView recyclerView;
        d66 adapter;
        d66 adapter2;
        IConversationHistoryListUIModel iConversationHistoryListUIModel;
        ChatSignalsHelper.RegisterConversationHistoryListRemovedChangedSlot(this.n, this.I);
        ChatSignalsHelper.RegisterConversationHistoryListStatusChangedSlot(this.n, this.J);
        ChatSignalsHelper.RegisterConversationHistoryListListChangedSlot(this.n, this.K);
        ChatSignalsHelper.RegisterConversationOptionsChangedSlot(this.p, this.L);
        g();
        c();
        IConversationHistoryListUIModel iConversationHistoryListUIModel2 = this.n;
        if (iConversationHistoryListUIModel2 != null) {
            iConversationHistoryListUIModel2.MessagesRead();
        }
        if ((this.B <= 0 || ((iConversationHistoryListUIModel = this.n) != null && iConversationHistoryListUIModel.GetNumberOfMessages() == this.B)) && !this.C) {
            return;
        }
        RecyclerView recyclerView2 = this.t;
        if (recyclerView2 != null && (adapter2 = recyclerView2.getAdapter()) != null) {
            adapter2.d();
        }
        RecyclerView recyclerView3 = this.t;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) (recyclerView3 != null ? recyclerView3.getLayoutManager() : null);
        if (linearLayoutManager != null && (recyclerView = this.t) != null && (adapter = recyclerView.getAdapter()) != null) {
            int iA = adapter.a() - 1;
            while (iA >= 0 && adapter.c(iA) != ChatMessageUITypes.NewSeparator.swigValue()) {
                iA--;
            }
            ye4 ye4Var = ye4.a;
            if (iA < 0) {
                linearLayoutManager.z0(adapter.a() - 1);
                ye4Var.b("ChatConversationDefaultLogic", "scrolling to last message");
            } else {
                linearLayoutManager.J = iA;
                linearLayoutManager.K = 0;
                z94 z94Var = linearLayoutManager.L;
                if (z94Var != null) {
                    z94Var.m = -1;
                }
                linearLayoutManager.x0();
                ye4Var.b("ChatConversationDefaultLogic", "scrolling to new separator position");
            }
        }
        this.C = false;
    }

    public final void c() {
        IConversationHistoryListUIModel iConversationHistoryListUIModel = this.n;
        if (iConversationHistoryListUIModel == null || !iConversationHistoryListUIModel.IsLoading()) {
            View view = this.r;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        View view2 = this.r;
        if (view2 != null) {
            view2.setVisibility(0);
        }
    }

    @Override // o.ba3
    public final void d() {
        this.m = null;
        this.n = null;
        this.p = null;
        this.f1756o = null;
    }

    @Override // o.ba3
    public final void e(bb5 bb5Var) {
        this.q = bb5Var;
    }

    @Override // o.ba3
    public final void f() {
        this.I.Disconnect();
        this.J.Disconnect();
        this.K.Disconnect();
        this.L.Disconnect();
        IConversationHistoryListUIModel iConversationHistoryListUIModel = this.n;
        this.B = iConversationHistoryListUIModel != null ? iConversationHistoryListUIModel.GetNumberOfMessages() : 0;
    }

    public final void g() {
        xt2 xt2VarC;
        xc0 xc0Var = this.m;
        if (xc0Var != null) {
            IConversationOptionsUIModelAndroid iConversationOptionsUIModelAndroid = this.p;
            boolean z = false;
            if (iConversationOptionsUIModelAndroid != null && (iConversationOptionsUIModelAndroid.CanRemoteControl() || iConversationOptionsUIModelAndroid.CanAddParticipants() || iConversationOptionsUIModelAndroid.CanRenameConversation() || iConversationOptionsUIModelAndroid.CanDeleteConversation() || iConversationOptionsUIModelAndroid.CanDeleteHistory() || iConversationOptionsUIModelAndroid.CanLeaveConversation())) {
                z = true;
            }
            uo0 uo0Var = (uo0) xc0Var.n;
            uo0Var.v0(z);
            if (!z || (xt2VarC = uo0Var.C()) == null) {
                return;
            }
            xt2VarC.invalidateOptionsMenu();
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0245  */
    /* JADX WARN: Code duplicated, block: B:114:0x0249  */
    @Override // o.ba3
    public final boolean h(MenuItem menuItem) {
        ChatConversationID chatConversationIDGetConversationID;
        xt2 xt2Var;
        menuItem.getClass();
        if (menuItem.getItemId() == R.id.start_remotecontrol) {
            IConversationOptionsUIModelAndroid iConversationOptionsUIModelAndroid = this.p;
            if (iConversationOptionsUIModelAndroid == null || !iConversationOptionsUIModelAndroid.CanRemoteControl()) {
                xt2Var = this.u;
                if (xt2Var != null) {
                    d82.t(xt2Var, R.string.tv_unexpected_options_menu_item_selected);
                    ye4.c("ChatConversationDefaultLogic", "Cannot handle selected options item, illegal state!");
                }
            } else {
                IConversationOptionsUIModelAndroid iConversationOptionsUIModelAndroid2 = this.p;
                if (iConversationOptionsUIModelAndroid2 != null) {
                    iConversationOptionsUIModelAndroid2.GetConnectionInfoForRemoteControl(new oo0());
                    return true;
                }
            }
        } else if (menuItem.getItemId() == R.id.add_participant) {
            IConversationOptionsUIModelAndroid iConversationOptionsUIModelAndroid3 = this.p;
            if (iConversationOptionsUIModelAndroid3 == null || !iConversationOptionsUIModelAndroid3.CanAddParticipants()) {
                xt2Var = this.u;
                if (xt2Var != null) {
                    d82.t(xt2Var, R.string.tv_unexpected_options_menu_item_selected);
                    ye4.c("ChatConversationDefaultLogic", "Cannot handle selected options item, illegal state!");
                }
            } else {
                IConversationHistoryListUIModel iConversationHistoryListUIModel = this.n;
                if (iConversationHistoryListUIModel != null && (chatConversationIDGetConversationID = iConversationHistoryListUIModel.GetConversationID()) != null) {
                    bb5 bb5Var = this.q;
                    if (it1.c == null) {
                        im3.e0("viewFactory");
                        throw null;
                    }
                    ao0 ao0Var = new ao0();
                    Bundle bundle = new Bundle(1);
                    bundle.putString("CHAT_CONVERSATION_ID", ChatConversationIDSerializer.Serialize(chatConversationIDGetConversationID));
                    ao0Var.u0(bundle);
                    bb5Var.I0(ao0Var, true);
                    return true;
                }
            }
        } else {
            byte b = 0;
            if (menuItem.getItemId() == R.id.remove_participant) {
                IConversationOptionsUIModelAndroid iConversationOptionsUIModelAndroid4 = this.p;
                if (iConversationOptionsUIModelAndroid4 == null || !iConversationOptionsUIModelAndroid4.CanRemoveParticipants()) {
                    xt2Var = this.u;
                    if (xt2Var != null) {
                        d82.t(xt2Var, R.string.tv_unexpected_options_menu_item_selected);
                        ye4.c("ChatConversationDefaultLogic", "Cannot handle selected options item, illegal state!");
                    }
                } else {
                    Context context = this.s;
                    if (context != null) {
                        IChatUIModelLocator iChatUIModelLocatorGetChatUIModelLocator = ChatUIModelLocatorAndroid.GetChatUIModelLocator();
                        IConversationHistoryListUIModel iConversationHistoryListUIModel2 = this.n;
                        IConversationMemberListUIModel iConversationMemberListUIModelGetConversationMemberListUIModel = iChatUIModelLocatorGetChatUIModelLocator.GetConversationMemberListUIModel(iConversationHistoryListUIModel2 != null ? iConversationHistoryListUIModel2.GetConversationID() : null);
                        int iGetMemberCount = iConversationMemberListUIModelGetConversationMemberListUIModel.GetMemberCount();
                        String[] strArr = new String[iGetMemberCount];
                        for (int i = 0; i < iGetMemberCount; i++) {
                            strArr[i] = iConversationMemberListUIModelGetConversationMemberListUIModel.GetConversationMemberAtPosition(i).GetName();
                        }
                        nd ndVar = new nd(context);
                        jd jdVar = (jd) ndVar.f1562o;
                        jdVar.d = jdVar.a.getText(R.string.tv_chat_dialog_remove_participant_title);
                        z zVar = new z(this, (byte) 2);
                        jd jdVar2 = (jd) ndVar.f1562o;
                        jdVar2.f1150o = strArr;
                        jdVar2.q = zVar;
                        jdVar2.v = -1;
                        jdVar2.u = true;
                        ho0 ho0Var = new ho0(this, iConversationMemberListUIModelGetConversationMemberListUIModel, b);
                        jdVar2.g = jdVar2.a.getText(R.string.tv_chat_dialog_remove_participant_positive);
                        jdVar2.h = ho0Var;
                        jd jdVar3 = (jd) ndVar.f1562o;
                        jdVar3.i = jdVar3.a.getText(R.string.tv_cancel);
                        jdVar3.j = null;
                        ndVar.e().show();
                        this.D = -1;
                        return true;
                    }
                }
            } else {
                if (menuItem.getItemId() == R.id.rename_conversation) {
                    IConversationOptionsUIModelAndroid iConversationOptionsUIModelAndroid5 = this.p;
                    if (iConversationOptionsUIModelAndroid5 != null && iConversationOptionsUIModelAndroid5.CanRenameConversation()) {
                        if (nv1.d == null) {
                            im3.e0("dialogFactory");
                            throw null;
                        }
                        IConversationHistoryListUIModel iConversationHistoryListUIModel3 = this.n;
                        fs7 fs7VarE = yi5.e(iConversationHistoryListUIModel3 != null ? iConversationHistoryListUIModel3.GetTitle() : null);
                        fs7VarE.F0 = R.string.tv_chat_dialog_rename_conversation_title;
                        fs7VarE.O0 = R.string.tv_cancel;
                        fs7VarE.K0 = R.string.tv_chat_dialog_rename_conversation_positive;
                        xk1 xk1Var = ct1.a;
                        if (xk1Var != null) {
                            xk1Var.L(fs7VarE);
                        }
                        if (xk1Var != null) {
                            ik7.b(this.E, new r02(fs7VarE, p02.Positive));
                        }
                        fs7VarE.N0();
                        return true;
                    }
                } else if (menuItem.getItemId() == R.id.delete_conversation) {
                    IConversationOptionsUIModelAndroid iConversationOptionsUIModelAndroid6 = this.p;
                    if (iConversationOptionsUIModelAndroid6 != null && iConversationOptionsUIModelAndroid6.CanDeleteConversation()) {
                        xt2 xt2Var2 = this.u;
                        if (xt2Var2 != null) {
                            x02 x02VarA = ik7.a();
                            gk7 gk7Var = new gk7();
                            fx3.o(1, "dialogId", x02VarA, gk7Var);
                            gk7Var.Z0 = x02VarA;
                            gk7Var.a1 = true;
                            gk7Var.F0 = R.string.tv_chat_dialog_delete_conversation_title;
                            gk7Var.H0 = R.string.tv_chat_dialog_delete_conversation_message;
                            gk7Var.O0 = R.string.tv_cancel;
                            gk7Var.K0 = R.string.tv_chat_dialog_delete_conversation_positive;
                            xk1 xk1Var2 = ct1.a;
                            if (xk1Var2 != null) {
                                xk1Var2.L(gk7Var);
                            }
                            if (xk1Var2 != null) {
                                ik7.b(this.F, new r02(gk7Var, p02.Positive));
                            }
                            gk7.O0(gk7Var, xt2Var2);
                            return true;
                        }
                    }
                } else if (menuItem.getItemId() == R.id.delete_history) {
                    IConversationOptionsUIModelAndroid iConversationOptionsUIModelAndroid7 = this.p;
                    if (iConversationOptionsUIModelAndroid7 != null && iConversationOptionsUIModelAndroid7.CanDeleteHistory()) {
                        xt2 xt2Var3 = this.u;
                        if (xt2Var3 != null) {
                            x02 x02VarA2 = ik7.a();
                            gk7 gk7Var2 = new gk7();
                            fx3.o(1, "dialogId", x02VarA2, gk7Var2);
                            gk7Var2.Z0 = x02VarA2;
                            gk7Var2.a1 = true;
                            gk7Var2.F0 = R.string.tv_chat_dialog_delete_history_title;
                            gk7Var2.H0 = R.string.tv_chat_dialog_delete_history_message;
                            gk7Var2.O0 = R.string.tv_cancel;
                            gk7Var2.K0 = R.string.tv_chat_dialog_delete_history_positive;
                            xk1 xk1Var3 = ct1.a;
                            if (xk1Var3 != null) {
                                xk1Var3.L(gk7Var2);
                            }
                            if (xk1Var3 != null) {
                                ik7.b(this.G, new r02(gk7Var2, p02.Positive));
                            }
                            gk7.O0(gk7Var2, xt2Var3);
                            return true;
                        }
                    }
                } else {
                    if (menuItem.getItemId() != R.id.leave_conversation) {
                        return false;
                    }
                    IConversationOptionsUIModelAndroid iConversationOptionsUIModelAndroid8 = this.p;
                    if (iConversationOptionsUIModelAndroid8 != null && iConversationOptionsUIModelAndroid8.CanLeaveConversation()) {
                        xt2 xt2Var4 = this.u;
                        if (xt2Var4 != null) {
                            x02 x02VarA3 = ik7.a();
                            gk7 gk7Var3 = new gk7();
                            fx3.o(1, "dialogId", x02VarA3, gk7Var3);
                            gk7Var3.Z0 = x02VarA3;
                            gk7Var3.a1 = true;
                            gk7Var3.F0 = R.string.tv_chat_dialog_leave_conversation_title;
                            gk7Var3.H0 = R.string.tv_chat_dialog_leave_conversation_message;
                            gk7Var3.O0 = R.string.tv_cancel;
                            gk7Var3.K0 = R.string.tv_chat_dialog_leave_conversation_positive;
                            xk1 xk1Var4 = ct1.a;
                            if (xk1Var4 != null) {
                                xk1Var4.L(gk7Var3);
                            }
                            if (xk1Var4 != null) {
                                ik7.b(this.H, new r02(gk7Var3, p02.Positive));
                            }
                            gk7.O0(gk7Var3, xt2Var4);
                            return true;
                        }
                    }
                }
                xt2Var = this.u;
                if (xt2Var != null) {
                    d82.t(xt2Var, R.string.tv_unexpected_options_menu_item_selected);
                    ye4.c("ChatConversationDefaultLogic", "Cannot handle selected options item, illegal state!");
                }
            }
        }
        return true;
    }

    @Override // o.ba3
    public final void i() {
        k(this.v);
    }

    @Override // o.ba3
    public final void j(View view, Bundle bundle, xt2 xt2Var) {
        this.u = xt2Var;
        this.s = view.getContext();
        this.r = view.findViewById(R.id.chat_conversation_loading_indicator);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.chat_conversation_recyclerview);
        this.t = recyclerView;
        if (recyclerView != null) {
            IConversationHistoryListUIModel iConversationHistoryListUIModel = this.n;
            recyclerView.setAdapter(iConversationHistoryListUIModel != null ? new wn0(iConversationHistoryListUIModel, new cr((byte) 6)) : null);
        }
        this.y = view.findViewById(R.id.progressbar_container);
        this.z = (TextView) view.findViewById(R.id.progressbar_filename);
        this.A = (ProgressBar) view.findViewById(R.id.progressbar);
        final byte b = 0;
        view.findViewById(R.id.progressbar_cancel).setOnClickListener(new View.OnClickListener(this) { // from class: o.co0
            public final /* synthetic */ po0 n;

            {
                this.n = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TextView textView;
                TextView textView2;
                byte b2 = b;
                po0 po0Var = this.n;
                switch (b2) {
                    case 0:
                        IConversationHistoryListUIModel iConversationHistoryListUIModel2 = po0Var.n;
                        if (iConversationHistoryListUIModel2 != null) {
                            iConversationHistoryListUIModel2.CancelAllUploads();
                        }
                        break;
                    case 1:
                        IConversationOptionsUIModelAndroid iConversationOptionsUIModelAndroid = po0Var.p;
                        if (iConversationOptionsUIModelAndroid != null && iConversationOptionsUIModelAndroid.CanSendMessage() && (textView = po0Var.v) != null) {
                            IConversationHistoryListUIModel iConversationHistoryListUIModel3 = po0Var.n;
                            if (im3.n(iConversationHistoryListUIModel3 != null ? Boolean.valueOf(iConversationHistoryListUIModel3.SendMessage(ub7.x0(String.valueOf(textView.getText())).toString())) : null, Boolean.TRUE) && (textView2 = po0Var.v) != null) {
                                textView2.setText("");
                                break;
                            }
                        }
                        break;
                    default:
                        xc0 xc0Var = po0Var.m;
                        if (xc0Var != null) {
                            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                            intent.addCategory("android.intent.category.OPENABLE");
                            intent.setType("*/*");
                            intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*", "audio/*", "application/*", "text/*"});
                            ((uo0) xc0Var.n).z0(intent, 789);
                        }
                        break;
                }
            }
        });
        RecyclerView recyclerView2 = this.t;
        androidx.recyclerview.widget.a layoutManager = recyclerView2 != null ? recyclerView2.getLayoutManager() : null;
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        final byte b2 = 1;
        if (linearLayoutManager != null) {
            linearLayoutManager.k1(true);
        }
        RecyclerView recyclerView3 = this.t;
        if (recyclerView3 != null) {
            recyclerView3.addOnLayoutChangeListener(new io0(linearLayoutManager, this));
        }
        if (bundle == null) {
            this.C = true;
        }
        RecyclerView recyclerView4 = this.t;
        if (recyclerView4 != null) {
            jo0 jo0Var = new jo0(linearLayoutManager, this);
            ArrayList arrayList = recyclerView4.u0;
            if (arrayList == null) {
                arrayList = new ArrayList();
                recyclerView4.u0 = arrayList;
            }
            arrayList.add(jo0Var);
        }
        RecyclerView recyclerView5 = this.t;
        if (recyclerView5 != null) {
            recyclerView5.setOnTouchListener(new lo0(xt2Var, this));
        }
        TextView textView = (TextView) view.findViewById(R.id.chat_conversation_message_edittext);
        this.v = textView;
        if (textView != null) {
            IConversationHistoryListUIModel iConversationHistoryListUIModel2 = this.n;
            textView.setText(iConversationHistoryListUIModel2 != null ? iConversationHistoryListUIModel2.GetLastTypedMessage() : null);
        }
        TextView textView2 = this.v;
        if (textView2 != null) {
            textView2.setOnFocusChangeListener(new v6(this, (byte) 4));
        }
        TextView textView3 = this.v;
        if (textView3 != null) {
            textView3.addTextChangedListener(new hc0(this, b2));
        }
        View viewFindViewById = view.findViewById(R.id.chat_conversation_message_button);
        this.w = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new View.OnClickListener(this) { // from class: o.co0
                public final /* synthetic */ po0 n;

                {
                    this.n = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    TextView textView4;
                    TextView textView5;
                    byte b3 = b2;
                    po0 po0Var = this.n;
                    switch (b3) {
                        case 0:
                            IConversationHistoryListUIModel iConversationHistoryListUIModel3 = po0Var.n;
                            if (iConversationHistoryListUIModel3 != null) {
                                iConversationHistoryListUIModel3.CancelAllUploads();
                            }
                            break;
                        case 1:
                            IConversationOptionsUIModelAndroid iConversationOptionsUIModelAndroid = po0Var.p;
                            if (iConversationOptionsUIModelAndroid != null && iConversationOptionsUIModelAndroid.CanSendMessage() && (textView4 = po0Var.v) != null) {
                                IConversationHistoryListUIModel iConversationHistoryListUIModel4 = po0Var.n;
                                if (im3.n(iConversationHistoryListUIModel4 != null ? Boolean.valueOf(iConversationHistoryListUIModel4.SendMessage(ub7.x0(String.valueOf(textView4.getText())).toString())) : null, Boolean.TRUE) && (textView5 = po0Var.v) != null) {
                                    textView5.setText("");
                                    break;
                                }
                            }
                            break;
                        default:
                            xc0 xc0Var = po0Var.m;
                            if (xc0Var != null) {
                                Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                                intent.addCategory("android.intent.category.OPENABLE");
                                intent.setType("*/*");
                                intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*", "audio/*", "application/*", "text/*"});
                                ((uo0) xc0Var.n).z0(intent, 789);
                            }
                            break;
                    }
                }
            });
        }
        this.x = view.findViewById(R.id.chat_conversation_attach_file_button);
        IConversationOptionsUIModelAndroid iConversationOptionsUIModelAndroid = this.p;
        if (iConversationOptionsUIModelAndroid == null || !iConversationOptionsUIModelAndroid.CanSendFile()) {
            View view2 = this.x;
            if (view2 != null) {
                view2.setVisibility(8);
            }
        } else {
            View view3 = this.x;
            if (view3 != null) {
                view3.setVisibility(0);
            }
            View view4 = this.x;
            if (view4 != null) {
                final byte b3 = 2;
                view4.setOnClickListener(new View.OnClickListener(this) { // from class: o.co0
                    public final /* synthetic */ po0 n;

                    {
                        this.n = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view5) {
                        TextView textView4;
                        TextView textView5;
                        byte b4 = b3;
                        po0 po0Var = this.n;
                        switch (b4) {
                            case 0:
                                IConversationHistoryListUIModel iConversationHistoryListUIModel3 = po0Var.n;
                                if (iConversationHistoryListUIModel3 != null) {
                                    iConversationHistoryListUIModel3.CancelAllUploads();
                                }
                                break;
                            case 1:
                                IConversationOptionsUIModelAndroid iConversationOptionsUIModelAndroid2 = po0Var.p;
                                if (iConversationOptionsUIModelAndroid2 != null && iConversationOptionsUIModelAndroid2.CanSendMessage() && (textView4 = po0Var.v) != null) {
                                    IConversationHistoryListUIModel iConversationHistoryListUIModel4 = po0Var.n;
                                    if (im3.n(iConversationHistoryListUIModel4 != null ? Boolean.valueOf(iConversationHistoryListUIModel4.SendMessage(ub7.x0(String.valueOf(textView4.getText())).toString())) : null, Boolean.TRUE) && (textView5 = po0Var.v) != null) {
                                        textView5.setText("");
                                        break;
                                    }
                                }
                                break;
                            default:
                                xc0 xc0Var = po0Var.m;
                                if (xc0Var != null) {
                                    Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                                    intent.addCategory("android.intent.category.OPENABLE");
                                    intent.setType("*/*");
                                    intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*", "audio/*", "application/*", "text/*"});
                                    ((uo0) xc0Var.n).z0(intent, 789);
                                }
                                break;
                        }
                    }
                });
            }
        }
        l();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public final void k(TextView textView) {
        boolean z;
        if (textView != null) {
            if (textView.hasFocus()) {
                CharSequence text = textView.getText();
                text.getClass();
                if (text.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            IConversationHistoryListUIModel iConversationHistoryListUIModel = this.n;
            if (iConversationHistoryListUIModel != null) {
                iConversationHistoryListUIModel.SendTypingEvent(z);
            }
        }
    }

    public final void l() {
        xt2 xt2Var = this.u;
        if (xt2Var != null) {
            IConversationHistoryListUIModel iConversationHistoryListUIModel = this.n;
            xt2Var.setTitle(iConversationHistoryListUIModel != null ? iConversationHistoryListUIModel.GetTitle() : null);
        }
        IConversationOptionsUIModelAndroid iConversationOptionsUIModelAndroid = this.p;
        boolean z = false;
        boolean z2 = iConversationOptionsUIModelAndroid != null && iConversationOptionsUIModelAndroid.CanSendMessage();
        TextView textView = this.v;
        if (textView != null) {
            textView.setEnabled(z2);
        }
        TextView textView2 = this.v;
        boolean z3 = ub7.x0(String.valueOf(textView2 != null ? textView2.getText() : null)).toString().length() > 0;
        View view = this.w;
        if (view != null) {
            if (z2 && z3) {
                z = true;
            }
            view.setEnabled(z);
        }
        View view2 = this.x;
        if (view2 != null) {
            view2.setEnabled(z2);
        }
    }

    @Override // o.ba3
    public final void m(Menu menu, MenuInflater menuInflater) {
        menu.getClass();
        menuInflater.getClass();
        IConversationOptionsUIModelAndroid iConversationOptionsUIModelAndroid = this.p;
        if (iConversationOptionsUIModelAndroid == null) {
            ye4.c("ChatConversationDefaultLogic", "Cannot create options menu");
            return;
        }
        if (iConversationOptionsUIModelAndroid != null && iConversationOptionsUIModelAndroid.CanRemoteControl()) {
            MenuItem menuItemAdd = menu.add(0, R.id.start_remotecontrol, 1, R.string.tv_chat_conversation_menu_start_remote_control);
            menuItemAdd.setShowAsAction(1);
            menuItemAdd.setIcon(2131230829);
        }
        IConversationOptionsUIModelAndroid iConversationOptionsUIModelAndroid2 = this.p;
        if (iConversationOptionsUIModelAndroid2 != null && iConversationOptionsUIModelAndroid2.CanAddParticipants()) {
            IConversationHistoryListUIModel iConversationHistoryListUIModel = this.n;
            if (iConversationHistoryListUIModel == null || !iConversationHistoryListUIModel.IsGroupChat()) {
                menu.add(0, R.id.add_participant, 1, R.string.tv_chat_conversation_menu_create_group_chat).setShowAsAction(0);
            } else {
                menu.add(0, R.id.add_participant, 1, R.string.tv_chat_conversation_menu_add_participant).setShowAsAction(0);
            }
        }
        IConversationOptionsUIModelAndroid iConversationOptionsUIModelAndroid3 = this.p;
        if (iConversationOptionsUIModelAndroid3 != null && iConversationOptionsUIModelAndroid3.CanRemoveParticipants()) {
            menu.add(0, R.id.remove_participant, 1, R.string.tv_chat_conversation_menu_remove_participant).setShowAsAction(0);
        }
        IConversationOptionsUIModelAndroid iConversationOptionsUIModelAndroid4 = this.p;
        if (iConversationOptionsUIModelAndroid4 != null && iConversationOptionsUIModelAndroid4.CanRenameConversation()) {
            menu.add(0, R.id.rename_conversation, 1, R.string.tv_chat_conversation_menu_rename_conversation).setShowAsAction(0);
        }
        IConversationOptionsUIModelAndroid iConversationOptionsUIModelAndroid5 = this.p;
        if (iConversationOptionsUIModelAndroid5 != null && iConversationOptionsUIModelAndroid5.CanDeleteConversation()) {
            menu.add(0, R.id.delete_conversation, 1, R.string.tv_chat_conversation_menu_delete_conversation).setShowAsAction(0);
        }
        IConversationOptionsUIModelAndroid iConversationOptionsUIModelAndroid6 = this.p;
        if (iConversationOptionsUIModelAndroid6 != null && iConversationOptionsUIModelAndroid6.CanDeleteHistory()) {
            menu.add(0, R.id.delete_history, 1, R.string.tv_chat_conversation_menu_delete_history).setShowAsAction(0);
        }
        IConversationOptionsUIModelAndroid iConversationOptionsUIModelAndroid7 = this.p;
        if (iConversationOptionsUIModelAndroid7 == null || !iConversationOptionsUIModelAndroid7.CanLeaveConversation()) {
            return;
        }
        menu.add(0, R.id.leave_conversation, 1, R.string.tv_chat_conversation_menu_leave_conversation).setShowAsAction(0);
    }

    @Override // o.ba3
    public final void n(Uri uri) {
        Context context = this.s;
        gy8 gy8Var = context != null ? new gy8(context, uri) : null;
        String str = gy8Var != null ? (String) gy8Var.e : null;
        if (str == null) {
            ye4.c("ChatConversationDefaultLogic", "onFilePicked(): Couldn't open file");
            return;
        }
        IConversationHistoryListUIModelAndroid iConversationHistoryListUIModelAndroid = this.f1756o;
        if (iConversationHistoryListUIModelAndroid != null) {
            iConversationHistoryListUIModelAndroid.PrepareUpload(str);
        }
        bu7.CACHEDTHREADPOOL.a(new io.sentry.android.core.internal.util.j((Object) this, (Object) gy8Var, (Object) str, (byte) 3));
    }

    @Override // o.ba3
    public final void o() {
        IConversationHistoryListUIModel iConversationHistoryListUIModel = this.n;
        if (iConversationHistoryListUIModel != null) {
            TextView textView = this.v;
            iConversationHistoryListUIModel.SetLastTypedMessage(String.valueOf(textView != null ? textView.getText() : null));
        }
        this.w = null;
        this.v = null;
        this.t = null;
        this.r = null;
        this.u = null;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.s = null;
    }
}
