package o;

import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class tk2 {
    public final Object a;
    public final Object b;
    public volatile Object c;

    public tk2(RemoteControlApplication remoteControlApplication, xt6 xt6Var, EventHub eventHub) {
        this.a = remoteControlApplication;
        ((zt6) xt6Var).d(new d6(this, (byte) 2));
        final byte b = 0;
        eventHub.c(EventType.EVENT_SESSION_SHUTDOWN, new vd2(this) { // from class: o.qk2
            public final /* synthetic */ tk2 b;

            {
                this.b = this;
            }

            @Override // o.vd2
            public final void a(EventType eventType, he2 he2Var) {
                byte b2 = b;
                tk2 tk2Var = this.b;
                switch (b2) {
                    case 0:
                        eventType.getClass();
                        he2Var.getClass();
                        xa3 xa3Var = xa3.m;
                        if (((xa3) tk2Var.c) == null) {
                            tk2Var.c = xa3Var;
                        }
                        break;
                    default:
                        eventType.getClass();
                        he2Var.getClass();
                        xa3 xa3Var2 = xa3.n;
                        if (((xa3) tk2Var.c) == null) {
                            tk2Var.c = xa3Var2;
                        }
                        break;
                }
            }
        });
        final byte b2 = 1;
        eventHub.c(EventType.EVENT_FILETRANSFER_SESSION_CLOSED_BY_PARTNER, new vd2(this) { // from class: o.qk2
            public final /* synthetic */ tk2 b;

            {
                this.b = this;
            }

            @Override // o.vd2
            public final void a(EventType eventType, he2 he2Var) {
                byte b3 = b2;
                tk2 tk2Var = this.b;
                switch (b3) {
                    case 0:
                        eventType.getClass();
                        he2Var.getClass();
                        xa3 xa3Var = xa3.m;
                        if (((xa3) tk2Var.c) == null) {
                            tk2Var.c = xa3Var;
                        }
                        break;
                    default:
                        eventType.getClass();
                        he2Var.getClass();
                        xa3 xa3Var2 = xa3.n;
                        if (((xa3) tk2Var.c) == null) {
                            tk2Var.c = xa3Var2;
                        }
                        break;
                }
            }
        });
        this.b = new c6((byte) 12);
    }

    public Logger a() {
        Logger logger = (Logger) this.c;
        if (logger != null) {
            return logger;
        }
        synchronized (((aj0) this.a)) {
            try {
                Logger logger2 = (Logger) this.c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger((String) this.b);
                this.c = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public tk2(Class cls) {
        this.a = new aj0();
        this.b = cls.getName();
    }
}
