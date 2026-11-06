package o;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class pe8 {
    public final rk5 a = new rk5((byte) 11);
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashSet c = new LinkedHashSet();
    public volatile boolean d;

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                to7.q(autoCloseable);
            } catch (Exception e) {
                gk0.r(e);
            }
        }
    }
}
