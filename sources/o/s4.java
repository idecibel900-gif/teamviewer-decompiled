package o;

/* JADX INFO: loaded from: classes.dex */
public final class s4 extends ga0 {
    public final String v0;
    public final String w0;
    public final String x0;

    public s4(String str, String str2, String str3) {
        str.getClass();
        this.v0 = str;
        this.w0 = str2;
        this.x0 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4)) {
            return false;
        }
        s4 s4Var = (s4) obj;
        return im3.n(this.v0, s4Var.v0) && im3.n(this.w0, s4Var.w0) && im3.n(this.x0, s4Var.x0);
    }

    public final int hashCode() {
        int iHashCode = this.v0.hashCode() * 31;
        String str = this.w0;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.x0;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // o.ga0
    public final String o() {
        return this.x0;
    }

    @Override // o.ga0
    public final String p() {
        return this.v0;
    }

    public final String toString() {
        return e41.l(e41.o("WithLicense(name=", this.v0, ", license=", this.w0, ", avatarUrl="), this.x0, ")");
    }
}
