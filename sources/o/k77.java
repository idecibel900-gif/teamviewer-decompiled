package o;

/* JADX INFO: loaded from: classes.dex */
public final class k77 extends l77 {
    public final String a;

    public k77(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k77) && im3.n(this.a, ((k77) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return fx3.g("Url(url=", this.a, ")");
    }
}
