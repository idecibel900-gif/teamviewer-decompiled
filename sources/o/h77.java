package o;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class h77 {
    public final String a;
    public final String b;
    public final LinkedHashMap c;

    public h77(String str, String str2, LinkedHashMap linkedHashMap) {
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h77)) {
            return false;
        }
        h77 h77Var = (h77) obj;
        return this.a.equals(h77Var.a) && im3.n(this.b, h77Var.b) && this.c.equals(h77Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + to7.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbO = e41.o("SpannableInstruction(testTag=", this.a, ", wholeText=", this.b, ", spannedTextsWithTypes=");
        sbO.append(this.c);
        sbO.append(")");
        return sbO.toString();
    }
}
