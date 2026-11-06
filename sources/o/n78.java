package o;

/* JADX INFO: loaded from: classes.dex */
public final class n78 implements o78 {
    public final String a;

    public n78(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n78) && im3.n(this.a, ((n78) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return fx3.g("DynamicString(value=", this.a, ")");
    }
}
