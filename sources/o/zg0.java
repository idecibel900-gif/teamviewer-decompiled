package o;

/* JADX INFO: loaded from: classes.dex */
public final class zg0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public zg0(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zg0)) {
            return false;
        }
        zg0 zg0Var = (zg0) obj;
        return this.a == zg0Var.a && this.b == zg0Var.b && this.c == zg0Var.c && this.d == zg0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + to7.f(to7.f(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "ByocConfigurationState(requireValidationIncoming=" + this.a + ", requireValidationOutgoing=" + this.b + ", hasByocNegotiation=" + this.c + ", hasUserCertificate=" + this.d + ")";
    }
}
