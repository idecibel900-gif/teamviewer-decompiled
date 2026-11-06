package com.teamviewer.remotecontrollib.mru;

import com.teamviewer.remotecontrollib.mru.ConnectionHistoryManager;
import com.teamviewer.remotecontrollib.swig.AccountViewModelBase;
import com.teamviewer.remotecontrollib.swig.LoginState;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;
import com.teamviewer.teamviewerlib.swig.tvshared.EventParam;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import o.k6;
import o.l41;
import o.o41;
import o.ot6;
import o.vd2;
import o.xt6;
import o.yt6;
import o.zt6;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/teamviewer/remotecontrollib/mru/ConnectionHistoryManager;", "", "Lo/yt6;", "sessionManagerListener", "Lo/yt6;", "RemoteControlLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ConnectionHistoryManager {
    public final xt6 a;
    public final l41 b;
    public final AccountViewModelBase c;
    public LoginState d = LoginState.NotReady;
    public final k6 e;
    private final yt6 sessionManagerListener;

    public ConnectionHistoryManager(xt6 xt6Var, EventHub eventHub, l41 l41Var, AccountViewModelBase accountViewModelBase) {
        this.a = xt6Var;
        this.b = l41Var;
        this.c = accountViewModelBase;
        k6 k6Var = new k6(this, (byte) 3);
        this.e = k6Var;
        final byte b = 0;
        ot6 ot6Var = new ot6(new o41(this, (byte) 0));
        ((zt6) xt6Var).n.a.add(new WeakReference(ot6Var));
        this.sessionManagerListener = ot6Var;
        eventHub.c(EventType.EVENT_SESSION_CONNECTION_STATE_UPDATE, new vd2(this) { // from class: o.m41
            public final /* synthetic */ ConnectionHistoryManager b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // o.vd2
            public final void a(EventType eventType, he2 he2Var) {
                mo7 mo7Var;
                byte[][] bArr;
                DyngateID dyngateID;
                pg5 pg5Var;
                byte b2 = b;
                byte[] byteArray = null;
                ConnectionHistoryManager connectionHistoryManager = this.b;
                switch (b2) {
                    case 0:
                        eventType.getClass();
                        he2Var.getClass();
                        i41 i41Var = (i41) he2Var.e(EventParam.EP_SESSION_CONNECTION_STATE);
                        if ((i41Var == null ? -1 : n41.a[i41Var.ordinal()]) != 1 || (mo7Var = ((zt6) connectionHistoryManager.a).f) == null) {
                            return;
                        }
                        e51 e51Var = e51.RemoteControl;
                        du6 du6VarT = mo7Var.t();
                        mb5 mb5Var = du6VarT.b;
                        connectionHistoryManager.b.c(du6VarT.j, mb5Var.b, e51Var, mb5Var.a, du6VarT.h);
                        return;
                    case 1:
                        eventType.getClass();
                        he2Var.getClass();
                        l41 l41Var2 = connectionHistoryManager.b;
                        ye4.a("ConnectionHistory", "starting save connection history");
                        synchronized (l41Var2.b) {
                            try {
                                bArr = new byte[l41Var2.b.size()][];
                                int size = l41Var2.b.size();
                                for (int i = 0; i < size; i++) {
                                    h41 h41Var = (h41) l41Var2.b.get(i);
                                    bArr[i] = h41Var != null ? h41Var.a() : null;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                            objectOutputStream.writeObject(bArr);
                            objectOutputStream.close();
                            byteArray = byteArrayOutputStream.toByteArray();
                            break;
                        } catch (IOException unused) {
                            ye4.c("ConnectionHistory", "saveConnectionHistory(): IOException on serialization");
                        }
                        if (byteArray != null) {
                            l41Var2.f.D("RECENT_CONNECTION_LIST", byteArray);
                        }
                        ye4.a("ConnectionHistory", "done save connection history");
                        return;
                    default:
                        eventType.getClass();
                        he2Var.getClass();
                        if (he2Var.e(EventParam.EP_RS_MODULE_TYPE) != ss4.p) {
                            return;
                        }
                        l41 l41Var3 = connectionHistoryManager.b;
                        mo7 mo7Var2 = ((zt6) connectionHistoryManager.a).f;
                        ec3 ec3Var = mo7Var2 instanceof ec3 ? (ec3) mo7Var2 : null;
                        if (ec3Var == null || (pg5Var = ((a2) ec3Var).r) == null || (dyngateID = pg5Var.a().DyngateID()) == null) {
                            dyngateID = new DyngateID();
                        }
                        l41Var3.c(dyngateID, "", e51.RemoteControl, "", false);
                        return;
                }
            }
        });
        final byte b2 = 1;
        eventHub.c(EventType.EVENT_TEAMVIEWER_UI_CLOSED, new vd2(this) { // from class: o.m41
            public final /* synthetic */ ConnectionHistoryManager b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // o.vd2
            public final void a(EventType eventType, he2 he2Var) {
                mo7 mo7Var;
                byte[][] bArr;
                DyngateID dyngateID;
                pg5 pg5Var;
                byte b3 = b2;
                byte[] byteArray = null;
                ConnectionHistoryManager connectionHistoryManager = this.b;
                switch (b3) {
                    case 0:
                        eventType.getClass();
                        he2Var.getClass();
                        i41 i41Var = (i41) he2Var.e(EventParam.EP_SESSION_CONNECTION_STATE);
                        if ((i41Var == null ? -1 : n41.a[i41Var.ordinal()]) != 1 || (mo7Var = ((zt6) connectionHistoryManager.a).f) == null) {
                            return;
                        }
                        e51 e51Var = e51.RemoteControl;
                        du6 du6VarT = mo7Var.t();
                        mb5 mb5Var = du6VarT.b;
                        connectionHistoryManager.b.c(du6VarT.j, mb5Var.b, e51Var, mb5Var.a, du6VarT.h);
                        return;
                    case 1:
                        eventType.getClass();
                        he2Var.getClass();
                        l41 l41Var2 = connectionHistoryManager.b;
                        ye4.a("ConnectionHistory", "starting save connection history");
                        synchronized (l41Var2.b) {
                            try {
                                bArr = new byte[l41Var2.b.size()][];
                                int size = l41Var2.b.size();
                                for (int i = 0; i < size; i++) {
                                    h41 h41Var = (h41) l41Var2.b.get(i);
                                    bArr[i] = h41Var != null ? h41Var.a() : null;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                            objectOutputStream.writeObject(bArr);
                            objectOutputStream.close();
                            byteArray = byteArrayOutputStream.toByteArray();
                            break;
                        } catch (IOException unused) {
                            ye4.c("ConnectionHistory", "saveConnectionHistory(): IOException on serialization");
                        }
                        if (byteArray != null) {
                            l41Var2.f.D("RECENT_CONNECTION_LIST", byteArray);
                        }
                        ye4.a("ConnectionHistory", "done save connection history");
                        return;
                    default:
                        eventType.getClass();
                        he2Var.getClass();
                        if (he2Var.e(EventParam.EP_RS_MODULE_TYPE) != ss4.p) {
                            return;
                        }
                        l41 l41Var3 = connectionHistoryManager.b;
                        mo7 mo7Var2 = ((zt6) connectionHistoryManager.a).f;
                        ec3 ec3Var = mo7Var2 instanceof ec3 ? (ec3) mo7Var2 : null;
                        if (ec3Var == null || (pg5Var = ((a2) ec3Var).r) == null || (dyngateID = pg5Var.a().DyngateID()) == null) {
                            dyngateID = new DyngateID();
                        }
                        l41Var3.c(dyngateID, "", e51.RemoteControl, "", false);
                        return;
                }
            }
        });
        final byte b3 = 2;
        eventHub.c(EventType.EVENT_RS_MODULE_STARTED, new vd2(this) { // from class: o.m41
            public final /* synthetic */ ConnectionHistoryManager b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // o.vd2
            public final void a(EventType eventType, he2 he2Var) {
                mo7 mo7Var;
                byte[][] bArr;
                DyngateID dyngateID;
                pg5 pg5Var;
                byte b4 = b3;
                byte[] byteArray = null;
                ConnectionHistoryManager connectionHistoryManager = this.b;
                switch (b4) {
                    case 0:
                        eventType.getClass();
                        he2Var.getClass();
                        i41 i41Var = (i41) he2Var.e(EventParam.EP_SESSION_CONNECTION_STATE);
                        if ((i41Var == null ? -1 : n41.a[i41Var.ordinal()]) != 1 || (mo7Var = ((zt6) connectionHistoryManager.a).f) == null) {
                            return;
                        }
                        e51 e51Var = e51.RemoteControl;
                        du6 du6VarT = mo7Var.t();
                        mb5 mb5Var = du6VarT.b;
                        connectionHistoryManager.b.c(du6VarT.j, mb5Var.b, e51Var, mb5Var.a, du6VarT.h);
                        return;
                    case 1:
                        eventType.getClass();
                        he2Var.getClass();
                        l41 l41Var2 = connectionHistoryManager.b;
                        ye4.a("ConnectionHistory", "starting save connection history");
                        synchronized (l41Var2.b) {
                            try {
                                bArr = new byte[l41Var2.b.size()][];
                                int size = l41Var2.b.size();
                                for (int i = 0; i < size; i++) {
                                    h41 h41Var = (h41) l41Var2.b.get(i);
                                    bArr[i] = h41Var != null ? h41Var.a() : null;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                            objectOutputStream.writeObject(bArr);
                            objectOutputStream.close();
                            byteArray = byteArrayOutputStream.toByteArray();
                            break;
                        } catch (IOException unused) {
                            ye4.c("ConnectionHistory", "saveConnectionHistory(): IOException on serialization");
                        }
                        if (byteArray != null) {
                            l41Var2.f.D("RECENT_CONNECTION_LIST", byteArray);
                        }
                        ye4.a("ConnectionHistory", "done save connection history");
                        return;
                    default:
                        eventType.getClass();
                        he2Var.getClass();
                        if (he2Var.e(EventParam.EP_RS_MODULE_TYPE) != ss4.p) {
                            return;
                        }
                        l41 l41Var3 = connectionHistoryManager.b;
                        mo7 mo7Var2 = ((zt6) connectionHistoryManager.a).f;
                        ec3 ec3Var = mo7Var2 instanceof ec3 ? (ec3) mo7Var2 : null;
                        if (ec3Var == null || (pg5Var = ((a2) ec3Var).r) == null || (dyngateID = pg5Var.a().DyngateID()) == null) {
                            dyngateID = new DyngateID();
                        }
                        l41Var3.c(dyngateID, "", e51.RemoteControl, "", false);
                        return;
                }
            }
        });
        accountViewModelBase.b(k6Var);
    }
}
