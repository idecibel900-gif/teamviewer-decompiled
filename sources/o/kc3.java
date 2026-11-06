package o;

/* JADX INFO: loaded from: classes.dex */
public final class kc3 {
    public final String a;
    public final long b;
    public final boolean c;
    public final String d;
    public final long e;

    public kc3(String str, long j, boolean z, String str2, long j2) {
        this.a = str;
        this.b = j;
        this.c = z;
        this.d = str2;
        this.e = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kc3)) {
            return false;
        }
        kc3 kc3Var = (kc3) obj;
        return this.a.equals(kc3Var.a) && this.b == kc3Var.b && this.c == kc3Var.c && im3.n(this.d, kc3Var.d) && this.e == kc3Var.e;
    }

    public final int hashCode() {
        int iF = to7.f(fx3.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return Long.hashCode(this.e) + ((iF + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "ShortCut(accountName=" + this.a + ", groupMemberId=" + this.b + ", isConnectFromShortCut=" + this.c + ", managementIdV2=" + this.d + ", dyngateId=" + this.e + ")";
    }
}
