package o;

/* JADX INFO: loaded from: classes.dex */
public final class dw6 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final String l;
    public final boolean m;
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f660o;

    public dw6(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str, boolean z8, boolean z9, boolean z10, String str2, boolean z11, boolean z12, boolean z13) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = str;
        this.i = z8;
        this.j = z9;
        this.k = z10;
        this.l = str2;
        this.m = z11;
        this.n = z12;
        this.f660o = z13;
    }

    public static dw6 a(dw6 dw6Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, String str, boolean z10, boolean z11, boolean z12, int i) {
        boolean z13 = (i & 1) != 0 ? dw6Var.a : z;
        boolean z14 = (i & 2) != 0 ? dw6Var.b : z2;
        boolean z15 = (i & 4) != 0 ? dw6Var.c : z3;
        boolean z16 = (i & 8) != 0 ? dw6Var.d : z4;
        boolean z17 = (i & 16) != 0 ? dw6Var.e : z5;
        boolean z18 = (i & 32) != 0 ? dw6Var.f : z6;
        boolean z19 = (i & 64) != 0 ? dw6Var.g : z7;
        String str2 = dw6Var.h;
        boolean z20 = (i & 256) != 0 ? dw6Var.i : z8;
        boolean z21 = (i & 512) != 0 ? dw6Var.j : z9;
        boolean z22 = dw6Var.k;
        String str3 = (i & 2048) != 0 ? dw6Var.l : str;
        boolean z23 = (i & 4096) != 0 ? dw6Var.m : z10;
        boolean z24 = (i & 8192) != 0 ? dw6Var.n : z11;
        boolean z25 = (i & 16384) != 0 ? dw6Var.f660o : z12;
        dw6Var.getClass();
        return new dw6(z13, z14, z15, z16, z17, z18, z19, str2, z20, z21, z22, str3, z23, z24, z25);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dw6)) {
            return false;
        }
        dw6 dw6Var = (dw6) obj;
        return this.a == dw6Var.a && this.b == dw6Var.b && this.c == dw6Var.c && this.d == dw6Var.d && this.e == dw6Var.e && this.f == dw6Var.f && this.g == dw6Var.g && this.h.equals(dw6Var.h) && this.i == dw6Var.i && this.j == dw6Var.j && this.k == dw6Var.k && im3.n(this.l, dw6Var.l) && this.m == dw6Var.m && this.n == dw6Var.n && this.f660o == dw6Var.f660o;
    }

    public final int hashCode() {
        int iF = to7.f(to7.f(to7.f(to7.e(to7.f(to7.f(to7.f(to7.f(to7.f(to7.f(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
        String str = this.l;
        return Boolean.hashCode(this.f660o) + to7.f(to7.f((iF + (str == null ? 0 : str.hashCode())) * 31, 31, this.m), 31, this.n);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SettingsState(isAccountDetailsVisible=");
        sb.append(this.a);
        sb.append(", remoteCursorEnabled=");
        sb.append(this.b);
        sb.append(", savePasswordsEnabled=");
        fx3.s(sb, this.c, ", udpStateEnabled=", this.d, ", wallpaperStateEnabled=");
        fx3.s(sb, this.e, ", remoteAudioStateEnabled=", this.f, ", biometricsEnabled=");
        sb.append(this.g);
        sb.append(", dyngateIdSummary=");
        sb.append(this.h);
        sb.append(", advancedLoggingEnabled=");
        fx3.s(sb, this.i, ", shouldAskForBiometricEnrollment=", this.j, ", biometricsStateAvailable=");
        sb.append(this.k);
        sb.append(", lockTimeSummary=");
        sb.append(this.l);
        sb.append(", isNativeSessionRCEnabled=");
        fx3.s(sb, this.m, ", isNativeSessionFTEnabled=", this.n, ", isDevicesRedesignEnabled=");
        return ua5.n(")", sb, this.f660o);
    }
}
