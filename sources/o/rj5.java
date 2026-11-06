package o;

import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class rj5 extends sj5 {
    public final boolean d;

    public rj5(boolean z) {
        super(R.string.permissions_storage, z ? R.string.permissions_on : R.string.permissions_off, R.drawable.storage);
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rj5) && this.d == ((rj5) obj).d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d);
    }

    public final String toString() {
        return "Storage(isGranted=" + this.d + ")";
    }
}
