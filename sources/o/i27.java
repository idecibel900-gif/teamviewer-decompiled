package o;

/* JADX INFO: loaded from: classes.dex */
public final class i27 extends d37 {
    public final String a;

    public i27(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i27) && im3.n(this.a, ((i27) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return fx3.g("ContactInvitationSuccess(email=", this.a, ")");
    }
}
