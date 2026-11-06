package o;

/* JADX INFO: loaded from: classes.dex */
public final class mx0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public mx0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
    }

    public static mx0 a(mx0 mx0Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i) {
        if ((i & 1) != 0) {
            z = mx0Var.a;
        }
        boolean z7 = z;
        if ((i & 2) != 0) {
            z2 = mx0Var.b;
        }
        boolean z8 = z2;
        if ((i & 4) != 0) {
            z3 = mx0Var.c;
        }
        boolean z9 = z3;
        if ((i & 8) != 0) {
            z4 = mx0Var.d;
        }
        boolean z10 = z4;
        if ((i & 16) != 0) {
            z5 = mx0Var.e;
        }
        boolean z11 = z5;
        if ((i & 32) != 0) {
            z6 = mx0Var.f;
        }
        mx0Var.getClass();
        return new mx0(z7, z8, z9, z10, z11, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mx0)) {
            return false;
        }
        mx0 mx0Var = (mx0) obj;
        return this.a == mx0Var.a && this.b == mx0Var.b && this.c == mx0Var.c && this.d == mx0Var.d && this.e == mx0Var.e && this.f == mx0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + to7.f(to7.f(to7.f(to7.f(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommonPermissionsState(isOverlayPermissionGranted=");
        sb.append(this.a);
        sb.append(", isNotificationsPermissionGranted=");
        sb.append(this.b);
        sb.append(", isLocationPermissionGranted=");
        fx3.s(sb, this.c, ", isStoragePermissionGranted=", this.d, ", isMicrophonePermissionGranted=");
        sb.append(this.e);
        sb.append(", isCameraPermissionGranted=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
