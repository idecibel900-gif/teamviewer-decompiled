package o;

import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;

/* JADX INFO: loaded from: classes.dex */
public final class yr6 {
    public final SupportSession a;
    public final xg8 b;

    public yr6(SupportSession supportSession, xg8 xg8Var) {
        supportSession.getClass();
        this.a = supportSession;
        this.b = xg8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yr6)) {
            return false;
        }
        yr6 yr6Var = (yr6) obj;
        return im3.n(this.a, yr6Var.a) && this.b.equals(yr6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ServiceQueueWaitingRoomState(session=" + this.a + ", actions=" + this.b + ")";
    }
}
