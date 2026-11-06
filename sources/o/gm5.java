package o;

/* JADX INFO: loaded from: classes.dex */
public final class gm5 {
    public static final gm5 c = new gm5(0, false);
    public final boolean a;
    public final int b;

    public gm5() {
        this.a = false;
        this.b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gm5)) {
            return false;
        }
        gm5 gm5Var = (gm5) obj;
        return this.a == gm5Var.a && this.b == gm5Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.a + ", emojiSupportMatch=" + o92.a(this.b) + ")";
    }

    public gm5(int i, boolean z) {
        this.a = z;
        this.b = i;
    }
}
