package o;

import android.content.res.Resources;
import com.teamviewer.remotecontrolviewlib.activity.SessionSettingsActivity;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;

/* JADX INFO: loaded from: classes.dex */
public final class uu6 extends oe8 {
    public final Resources n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final EventHub f2250o;
    public final io.sentry.android.core.n1 p;
    public final xt6 q;
    public final String r;
    public boolean s;
    public final tu6 t;
    public final tu6 u;
    public SessionSettingsActivity v;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [o.tu6, o.vd2] */
    /* JADX WARN: Type inference failed for: r5v1, types: [o.tu6, o.vd2] */
    public uu6(Resources resources, EventHub eventHub, io.sentry.android.core.n1 n1Var, xt6 xt6Var) {
        eventHub.getClass();
        n1Var.getClass();
        this.n = resources;
        this.f2250o = eventHub;
        this.p = n1Var;
        this.q = xt6Var;
        this.r = "SessionSettingsActivityViewModel";
        final byte b = 0;
        ?? r5 = new vd2(this) { // from class: o.tu6
            public final /* synthetic */ uu6 b;

            {
                this.b = this;
            }

            @Override // o.vd2
            public final void a(EventType eventType, he2 he2Var) {
                byte b2 = b;
                uu6 uu6Var = this.b;
                switch (b2) {
                    case 0:
                        eventType.getClass();
                        he2Var.getClass();
                        uu6Var.V0();
                        break;
                    default:
                        eventType.getClass();
                        he2Var.getClass();
                        bu7.MAIN.a(new pc0(uu6Var, (byte) 29));
                        break;
                }
            }
        };
        this.t = r5;
        final byte b2 = 1;
        ?? r0 = new vd2(this) { // from class: o.tu6
            public final /* synthetic */ uu6 b;

            {
                this.b = this;
            }

            @Override // o.vd2
            public final void a(EventType eventType, he2 he2Var) {
                byte b3 = b2;
                uu6 uu6Var = this.b;
                switch (b3) {
                    case 0:
                        eventType.getClass();
                        he2Var.getClass();
                        uu6Var.V0();
                        break;
                    default:
                        eventType.getClass();
                        he2Var.getClass();
                        bu7.MAIN.a(new pc0(uu6Var, (byte) 29));
                        break;
                }
            }
        };
        this.u = r0;
        if (!((zt6) xt6Var).b.get()) {
            V0();
        }
        if (!eventHub.c(EventType.EVENT_LOW_ON_MEMORY, r0)) {
            ye4.c("SessionSettingsActivityViewModel", "register OnLowMemory event failed");
        }
        if (eventHub.c(EventType.EVENT_SESSION_SHUTDOWN, r5)) {
            return;
        }
        ye4.c("SessionSettingsActivityViewModel", "register OnSessionEnd event failed");
    }

    @Override // o.oe8
    public final void U0() {
        tu6 tu6Var = this.u;
        EventHub eventHub = this.f2250o;
        boolean zF = eventHub.f(tu6Var);
        String str = this.r;
        if (!zF) {
            ye4.c(str, "unregister OnLowMemory event failed");
        }
        if (eventHub.f(this.t)) {
            return;
        }
        ye4.c(str, "unregister OnSessionEnd event failed");
    }

    public final void V0() {
        du6 du6VarT;
        mo7 mo7Var = ((zt6) this.q).f;
        String strD = (mo7Var == null || (du6VarT = mo7Var.t()) == null) ? null : et1.D(du6VarT);
        if (strD == null) {
            strD = "";
        }
        bu7.MAIN.a(new be3(this, strD, (byte) 10));
    }
}
