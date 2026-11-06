package o;

import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class oj5 extends sj5 {
    public final boolean d;

    public oj5(boolean z) {
        super(R.string.permissions_microphone, z ? R.string.permissions_on : R.string.permissions_off, R.drawable.mic);
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oj5) && this.d == ((oj5) obj).d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d);
    }

    public final String toString() {
        return "Microphone(isGranted=" + this.d + ")";
    }
}
