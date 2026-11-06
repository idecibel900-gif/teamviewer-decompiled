package o;

import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import com.teamviewer.teamviewerlib.event.EventHub;

/* JADX INFO: loaded from: classes.dex */
public final class au6 extends zt6 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final RemoteControlApplication f363o;
    public final EventHub p;
    public final d31 q;

    public au6(RemoteControlApplication remoteControlApplication, EventHub eventHub, d31 d31Var) {
        eventHub.getClass();
        this.f363o = remoteControlApplication;
        this.p = eventHub;
        this.q = d31Var;
    }

    @Override // o.zt6
    public final synchronized void f(int i, i41 i41Var, eb7 eb7Var) {
        try {
            int iOrdinal = i41Var.ordinal();
            if (iOrdinal == 15) {
                ye4.a("SessionManagerOutgoingImpl", "start meeting");
            } else if (iOrdinal == 17) {
                ye4.a("SessionManagerOutgoingImpl", "!ft started!");
                this.a.set(false);
            } else if (iOrdinal != 18) {
                super.f(i, i41Var, eb7Var);
            } else {
                ye4.a("SessionManagerOutgoingImpl", "!ft connection established!");
                this.a.set(false);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void h(mb5 mb5Var) {
        mb5Var.getClass();
        ye4.a("SessionManagerOutgoingImpl", "createSession outgoing");
        if (this.b.get() || !this.a.compareAndSet(false, true)) {
            e(-1, i41.m);
            return;
        }
        int andIncrement = this.c.getAndIncrement();
        ye4.a("SessionManager", "getMeetingSessionID: " + andIncrement);
        new kb5(mb5Var, andIncrement, this, new ol5((byte) 8), new j93(this, this.f363o, this.p, this.q), this.q).start();
    }
}
