package o;

/* JADX INFO: loaded from: classes.dex */
public final class gx1 implements lx1 {
    public final h71 a;

    public gx1(h71 h71Var) {
        this.a = h71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gx1) && this.a.equals(((gx1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ToContactDetailPane(contact=" + this.a + ")";
    }
}
