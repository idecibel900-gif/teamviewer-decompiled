package o;

/* JADX INFO: loaded from: classes2.dex */
public final class fu3 extends hu3 {
    public final oz3 a;

    public fu3(oz3 oz3Var) {
        this.a = oz3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fu3) && this.a.equals(((fu3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LocalClass(type=" + this.a + ')';
    }
}
