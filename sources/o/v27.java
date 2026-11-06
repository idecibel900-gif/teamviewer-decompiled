package o;

/* JADX INFO: loaded from: classes.dex */
public final class v27 extends d37 {
    public final String a;

    public v27(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v27) && im3.n(this.a, ((v27) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return fx3.g("ServiceQueueAssignToMeSuccess(sessionName=", this.a, ")");
    }
}
