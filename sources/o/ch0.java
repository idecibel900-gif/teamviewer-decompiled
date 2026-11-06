package o;

/* JADX INFO: loaded from: classes.dex */
public final class ch0 {
    public final String a;

    public ch0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ch0) && this.a.equals(((ch0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return fx3.g("Fail(logMessage=", this.a, ")");
    }
}
