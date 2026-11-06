package o;

/* JADX INFO: loaded from: classes.dex */
public final class ys5 {
    public final int a;

    public ys5(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ys5) {
            return this.a == ((ys5) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }
}
