package o;

/* JADX INFO: loaded from: classes.dex */
public final class ur extends ka0 {
    public final String z;

    public ur(String str) {
        str.getClass();
        this.z = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ur) && im3.n(this.z, ((ur) obj).z);
    }

    public final int hashCode() {
        return this.z.hashCode();
    }

    public final String toString() {
        return fx3.g("Text(text=", this.z, ")");
    }
}
