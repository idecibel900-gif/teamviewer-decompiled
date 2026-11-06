package o;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class cn7 {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final byte f;
    public final int g;

    /* JADX WARN: Multi-variable type inference failed */
    public cn7(String str, String str2, boolean z, int i, String str3, int i2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = str3;
        this.f = i2;
        String upperCase = str2.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        this.g = ub7.Q(upperCase, "INT", false) ? 3 : (ub7.Q(upperCase, "CHAR", false) || ub7.Q(upperCase, "CLOB", false) || ub7.Q(upperCase, "TEXT", false)) ? 2 : ub7.Q(upperCase, "BLOB", false) ? 5 : (ub7.Q(upperCase, "REAL", false) || ub7.Q(upperCase, "FLOA", false) || ub7.Q(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof cn7) {
                boolean z = this.d > 0;
                cn7 cn7Var = (cn7) obj;
                byte b = cn7Var.f;
                if (z == (cn7Var.d > 0) && im3.n(this.a, cn7Var.a) && this.c == cn7Var.c) {
                    String str = cn7Var.e;
                    byte b2 = this.f;
                    String str2 = this.e;
                    if ((b2 != 1 || b != 2 || str2 == null || r47.q(str2, str)) && ((b2 != 2 || b != 1 || str == null || r47.q(str, str2)) && ((b2 == 0 || b2 != b || (str2 == null ? str == null : r47.q(str2, str))) && this.g == cn7Var.g))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.g) * 31) + (this.c ? 1231 : 1237)) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
        sb.append(this.a);
        sb.append("',\n            |   type = '");
        sb.append(this.b);
        sb.append("',\n            |   affinity = '");
        sb.append(this.g);
        sb.append("',\n            |   notNull = '");
        sb.append(this.c);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(this.d);
        sb.append("',\n            |   defaultValue = '");
        String str = this.e;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return vb7.B(vb7.D(sb.toString()));
    }
}
