package o;

/* JADX INFO: loaded from: classes.dex */
public final class g27 extends d37 {
    public final String a;

    public g27(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g27) && im3.n(this.a, ((g27) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return fx3.g("ContactInvitationAlreadyExistsError(email=", this.a, ")");
    }
}
