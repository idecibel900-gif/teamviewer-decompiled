package o;

/* JADX INFO: loaded from: classes.dex */
public final class lc4 extends mc4 {
    public final pg1 a = pg1.b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lc4.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((lc4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (lc4.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.a + '}';
    }
}
