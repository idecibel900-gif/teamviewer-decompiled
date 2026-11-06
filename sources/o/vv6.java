package o;

/* JADX INFO: loaded from: classes.dex */
public final class vv6 {
    public final String a;
    public final String b;
    public final ew6 c;
    public final String d;

    public vv6(String str, String str2, ew6 ew6Var, String str3) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = ew6Var;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv6)) {
            return false;
        }
        vv6 vv6Var = (vv6) obj;
        return im3.n(this.a, vv6Var.a) && im3.n(this.b, vv6Var.b) && this.c == vv6Var.c && im3.n(this.d, vv6Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ew6 ew6Var = this.c;
        int iHashCode3 = (iHashCode2 + (ew6Var == null ? 0 : ew6Var.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = e41.o("SettingsRadioButtonOption(title=", this.a, ", subtitle=", this.b, ", statisticEvent=");
        sbO.append(this.c);
        sbO.append(", testTag=");
        sbO.append(this.d);
        sbO.append(")");
        return sbO.toString();
    }

    public /* synthetic */ vv6(String str, ew6 ew6Var, String str2, int i) {
        this(str, (String) null, (i & 4) != 0 ? null : ew6Var, str2);
    }
}
