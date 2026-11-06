package o;

/* JADX INFO: loaded from: classes.dex */
public final class eb7 {
    public String a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eb7) && this.a.equals(((eb7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return fx3.g("StringEventParam(value=", this.a, ")");
    }
}
