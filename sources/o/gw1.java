package o;

import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;

/* JADX INFO: loaded from: classes.dex */
public final class gw1 {
    public final h71 a;
    public final ns1 b;
    public final SupportSession c;
    public final tx1 d;

    public gw1(h71 h71Var, ns1 ns1Var, SupportSession supportSession, tx1 tx1Var) {
        this.a = h71Var;
        this.b = ns1Var;
        this.c = supportSession;
        this.d = tx1Var;
    }

    public static gw1 a(gw1 gw1Var, h71 h71Var, ns1 ns1Var, SupportSession supportSession, tx1 tx1Var, int i) {
        if ((i & 1) != 0) {
            h71Var = gw1Var.a;
        }
        if ((i & 2) != 0) {
            ns1Var = gw1Var.b;
        }
        if ((i & 4) != 0) {
            supportSession = gw1Var.c;
        }
        if ((i & 8) != 0) {
            tx1Var = gw1Var.d;
        }
        gw1Var.getClass();
        return new gw1(h71Var, ns1Var, supportSession, tx1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gw1)) {
            return false;
        }
        gw1 gw1Var = (gw1) obj;
        return im3.n(this.a, gw1Var.a) && im3.n(this.b, gw1Var.b) && im3.n(this.c, gw1Var.c) && im3.n(this.d, gw1Var.d);
    }

    public final int hashCode() {
        h71 h71Var = this.a;
        int iHashCode = (h71Var == null ? 0 : h71Var.hashCode()) * 31;
        ns1 ns1Var = this.b;
        int iHashCode2 = (iHashCode + (ns1Var == null ? 0 : ns1Var.hashCode())) * 31;
        SupportSession supportSession = this.c;
        int iHashCode3 = (iHashCode2 + (supportSession == null ? 0 : supportSession.hashCode())) * 31;
        tx1 tx1Var = this.d;
        return iHashCode3 + (tx1Var != null ? tx1Var.hashCode() : 0);
    }

    public final String toString() {
        return "DeviceTabListDetailState(selectedContact=" + this.a + ", selectedDeviceInfo=" + this.b + ", selectedSupportSession=" + this.c + ", searchSelection=" + this.d + ")";
    }
}
