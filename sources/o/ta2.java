package o;

/* JADX INFO: loaded from: classes.dex */
public final class ta2 {
    public final String a;

    public ta2(String str) {
        if (str != null) {
            this.a = str;
        } else {
            yq4.l("name is null");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ta2)) {
            return false;
        }
        return this.a.equals(((ta2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return e41.l(new StringBuilder("Encoding{name=\""), this.a, "\"}");
    }
}
