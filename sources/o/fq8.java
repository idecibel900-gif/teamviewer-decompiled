package o;

import android.app.PendingIntent;

/* JADX INFO: loaded from: classes.dex */
public final class fq8 extends od6 {
    public final PendingIntent m;
    public final boolean n;

    public fq8(PendingIntent pendingIntent, boolean z) {
        if (pendingIntent == null) {
            yq4.l("Null pendingIntent");
            throw null;
        }
        this.m = pendingIntent;
        this.n = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof od6) {
            fq8 fq8Var = (fq8) ((od6) obj);
            if (this.m.equals(fq8Var.m) && this.n == fq8Var.n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.n ? 1237 : 1231) ^ ((this.m.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return ua5.n("}", ua5.p("ReviewInfo{pendingIntent=", this.m.toString(), ", isNoOp="), this.n);
    }
}
