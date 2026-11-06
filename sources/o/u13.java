package o;

/* JADX INFO: loaded from: classes.dex */
public final class u13 implements w13 {
    public final Throwable a;

    public u13(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u13) && this.a.equals(((u13) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failed(throwable=" + this.a + ")";
    }
}
