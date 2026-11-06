package o;

/* JADX INFO: loaded from: classes.dex */
public final class r4 extends ga0 {
    public final String v0;
    public final String w0;

    public r4(String str, String str2) {
        str.getClass();
        this.v0 = str;
        this.w0 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r4)) {
            return false;
        }
        r4 r4Var = (r4) obj;
        return im3.n(this.v0, r4Var.v0) && im3.n(this.w0, r4Var.w0);
    }

    public final int hashCode() {
        int iHashCode = this.v0.hashCode() * 31;
        String str = this.w0;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // o.ga0
    public final String o() {
        return this.w0;
    }

    @Override // o.ga0
    public final String p() {
        return this.v0;
    }

    public final String toString() {
        return fx3.h("Basic(name=", this.v0, ", avatarUrl=", this.w0, ")");
    }
}
