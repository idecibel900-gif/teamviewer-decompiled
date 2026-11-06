package o;

/* JADX INFO: loaded from: classes.dex */
public final class yk7 implements al7 {
    public final int a;

    public yk7(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yk7) && this.a == ((yk7) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return fx3.f(this.a, "Android(resourceId=", ")");
    }
}
