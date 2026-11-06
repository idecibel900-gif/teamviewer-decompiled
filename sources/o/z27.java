package o;

/* JADX INFO: loaded from: classes.dex */
public final class z27 extends d37 {
    public final String a;

    public z27(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z27) && im3.n(this.a, ((z27) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return fx3.g("ServiceQueueUnassignSuccess(sessionName=", this.a, ")");
    }
}
