package o;

import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class mj5 extends sj5 {
    public final boolean d;

    public mj5(boolean z) {
        super(R.string.permissions_camera, z ? R.string.permissions_on : R.string.permissions_off, R.drawable.camera);
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mj5) && this.d == ((mj5) obj).d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d);
    }

    public final String toString() {
        return "Camera(isGranted=" + this.d + ")";
    }
}
