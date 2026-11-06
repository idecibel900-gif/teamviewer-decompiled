package o;

/* JADX INFO: loaded from: classes.dex */
public final class qx1 implements tx1 {
    public final h71 a;

    public qx1(h71 h71Var) {
        this.a = h71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qx1) && this.a.equals(((qx1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Contact(contact=" + this.a + ")";
    }
}
