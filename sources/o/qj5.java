package o;

import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class qj5 extends sj5 {
    public final boolean d;

    public qj5(boolean z) {
        super(R.string.permissions_draw_over_other_apps, z ? R.string.permissions_on : R.string.permissions_off, R.drawable.draw_over_other_apps);
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qj5) && this.d == ((qj5) obj).d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d);
    }

    public final String toString() {
        return "Overlay(isGranted=" + this.d + ")";
    }
}
