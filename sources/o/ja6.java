package o;

import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ja6 {
    public o53 a;
    public o53 b;

    public final void a(ak7 ak7Var) {
        Object next;
        ci7 ci7VarQ = ak7Var.q(zj7.Event);
        byte b = ci7VarQ.a;
        int i = ci7VarQ.b;
        String strE = b > 0 ? fx3.e(i, "windows session info event=") : "windows session info";
        ci7 ci7VarQ2 = ak7Var.q(zj7.CADDisabled);
        if (ci7VarQ2.a > 0) {
            strE = strE + " cad=" + ci7VarQ2.b;
        }
        ye4.a("RemoteWindowsSessionInfo", strE);
        if (ci7VarQ.a > 0) {
            yj7.n.getClass();
            Iterator it = yj7.q.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((yj7) next).m != i);
            yj7 yj7Var = (yj7) next;
            if (yj7Var == null) {
                yj7Var = yj7.INVALID;
            }
            int iOrdinal = yj7Var.ordinal();
            o53 o53Var = o53.n;
            if (iOrdinal != 5) {
                o53 o53Var2 = o53.f1630o;
                if (iOrdinal == 6) {
                    this.b = o53Var2;
                } else if (iOrdinal == 7) {
                    this.a = o53Var;
                } else if (iOrdinal == 8) {
                    this.a = o53Var2;
                }
            } else {
                this.b = o53Var;
            }
        }
        EventHub.e(EventHub.e.f(), EventType.EVENT_REMOTE_WINDOWS_SESSION_INFO_RECEIVED);
    }
}
