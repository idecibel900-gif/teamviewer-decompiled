package o;

/* JADX INFO: loaded from: classes.dex */
public final class jq5 {
    public final String a;
    public final Long b;

    public jq5(String str, Long l) {
        this.a = str;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jq5)) {
            return false;
        }
        jq5 jq5Var = (jq5) obj;
        return this.a.equals(jq5Var.a) && this.b.equals(jq5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Preference(key=" + this.a + ", value=" + this.b + ")";
    }
}
