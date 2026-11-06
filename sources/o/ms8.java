package o;

/* JADX INFO: loaded from: classes.dex */
public final class ms8 {
    public static final ms8 c;
    public static final ms8 d;
    public final boolean a;
    public final Throwable b;

    static {
        if (vs8.r) {
            d = null;
            c = null;
        } else {
            d = new ms8(null, false);
            c = new ms8(null, true);
        }
    }

    public ms8(Throwable th, boolean z) {
        this.a = z;
        this.b = th;
    }
}
