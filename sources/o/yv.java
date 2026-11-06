package o;

/* JADX INFO: loaded from: classes.dex */
public final class yv extends f57 {
    public static volatile yv c;
    public static final xv d = new xv((byte) 0);
    public final ol1 b = new ol1();

    public static yv u() {
        if (c != null) {
            return c;
        }
        synchronized (yv.class) {
            try {
                if (c == null) {
                    c = new yv();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c;
    }
}
