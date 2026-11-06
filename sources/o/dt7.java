package o;

/* JADX INFO: loaded from: classes.dex */
public final class dt7 {
    public static final dt7 c = new dt7(2, false);
    public static final dt7 d = new dt7(1, true);
    public final int a;
    public final boolean b;

    public dt7(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dt7)) {
            return false;
        }
        dt7 dt7Var = (dt7) obj;
        return this.a == dt7Var.a && this.b == dt7Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        if (equals(c)) {
            return "TextMotion.Static";
        }
        return equals(d) ? "TextMotion.Animated" : "Invalid";
    }
}
