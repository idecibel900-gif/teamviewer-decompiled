package o;

import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class pj5 extends sj5 {
    public final boolean d;

    public pj5(boolean z) {
        super(R.string.permissions_notifications, z ? R.string.permissions_on : R.string.permissions_off, R.drawable.notifications);
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pj5) && this.d == ((pj5) obj).d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d);
    }

    public final String toString() {
        return "Notifications(isGranted=" + this.d + ")";
    }
}
