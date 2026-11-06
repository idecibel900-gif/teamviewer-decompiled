package o;

/* JADX INFO: loaded from: classes.dex */
public final class er5 {
    public final String a;

    public er5(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof er5)) {
            return false;
        }
        return im3.n(this.a, ((er5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
