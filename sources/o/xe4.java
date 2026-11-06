package o;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class xe4 {
    public static final se4 a = new se4();

    public static void a(String str) {
        a.getClass();
        HashSet hashSet = se4.a;
        if (hashSet.contains(str)) {
            return;
        }
        io.sentry.android.core.v0.l("LOTTIE", str, null);
        hashSet.add(str);
    }

    public static void b(String str, Throwable th) {
        a.getClass();
        HashSet hashSet = se4.a;
        if (hashSet.contains(str)) {
            return;
        }
        io.sentry.android.core.v0.l("LOTTIE", str, th);
        hashSet.add(str);
    }
}
