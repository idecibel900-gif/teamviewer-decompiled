package o;

/* JADX INFO: loaded from: classes.dex */
public final class i37 extends nv1 {
    public final String e;

    public i37(String str) {
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i37) && this.e.equals(((i37) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final String toString() {
        return fx3.g("SimpleString(text=", this.e, ")");
    }
}
