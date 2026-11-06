package o;

/* JADX INFO: loaded from: classes.dex */
public final class o92 {
    public final int a;

    public static String a(int i) {
        if (i == 0) {
            return "EmojiSupportMatch.Default";
        }
        if (i == 1) {
            return "EmojiSupportMatch.None";
        }
        return i == 2 ? "EmojiSupportMatch.All" : fx3.f(i, "Invalid(value=", ")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o92) {
            return this.a == ((o92) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
