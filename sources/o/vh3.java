package o;

/* JADX INFO: loaded from: classes.dex */
public final class vh3 {
    public final String a;
    public final String b;
    public final zh3 c;

    public vh3(String str, String str2, zh3 zh3Var) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = zh3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vh3)) {
            return false;
        }
        vh3 vh3Var = (vh3) obj;
        return im3.n(this.a, vh3Var.a) && im3.n(this.b, vh3Var.b) && this.c == vh3Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        zh3 zh3Var = this.c;
        return iHashCode2 + (zh3Var != null ? zh3Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = e41.o("InfoDialogData(title=", this.a, ", message=", this.b, ", statisticEventType=");
        sbO.append(this.c);
        sbO.append(")");
        return sbO.toString();
    }
}
