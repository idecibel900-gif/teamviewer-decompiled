package o;

/* JADX INFO: loaded from: classes.dex */
public final class qr6 {
    public final String a;
    public final rr6 b;
    public final sr6 c;
    public final String d;

    public qr6(String str, rr6 rr6Var, sr6 sr6Var, String str2) {
        str.getClass();
        this.a = str;
        this.b = rr6Var;
        this.c = sr6Var;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qr6)) {
            return false;
        }
        qr6 qr6Var = (qr6) obj;
        return im3.n(this.a, qr6Var.a) && this.b == qr6Var.b && this.c == qr6Var.c && this.d.equals(qr6Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        sr6 sr6Var = this.c;
        return this.d.hashCode() + ((iHashCode + (sr6Var == null ? 0 : sr6Var.hashCode())) * 31);
    }

    public final String toString() {
        return "ServiceQueueSortOption(label=" + this.a + ", value=" + this.b + ", statisticEvent=" + this.c + ", testTag=" + this.d + ")";
    }
}
