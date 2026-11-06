package o;

/* JADX INFO: loaded from: classes.dex */
public final class yn4 {
    public final String a;
    public final Long b;

    public yn4(String str, Long l) {
        this.a = str;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yn4)) {
            return false;
        }
        yn4 yn4Var = (yn4) obj;
        return this.a.equals(yn4Var.a) && im3.n(this.b, yn4Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "Mdv2ShortcutConnection(managementId=" + this.a + ", dyngateId=" + this.b + ")";
    }
}
