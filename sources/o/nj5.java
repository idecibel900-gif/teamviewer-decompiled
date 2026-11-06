package o;

import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class nj5 extends sj5 {
    public final boolean d;

    public nj5(boolean z) {
        super(R.string.permissions_location, z ? R.string.permissions_on : R.string.permissions_off, R.drawable.location);
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nj5) && this.d == ((nj5) obj).d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d);
    }

    public final String toString() {
        return "Location(isGranted=" + this.d + ")";
    }
}
