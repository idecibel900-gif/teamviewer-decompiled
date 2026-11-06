package o;

/* JADX INFO: loaded from: classes.dex */
public final class i2 {
    public static final i2 c;
    public static final i2 d;
    public final boolean a;
    public final Throwable b;

    static {
        if (p2.GENERATE_CANCELLATION_CAUSES) {
            d = null;
            c = null;
        } else {
            d = new i2(null, false);
            c = new i2(null, true);
        }
    }

    public i2(Throwable th, boolean z) {
        this.a = z;
        this.b = th;
    }
}
