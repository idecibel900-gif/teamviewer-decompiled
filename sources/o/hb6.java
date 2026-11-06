package o;

import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hb6 {
    public static final Constructor a;

    static {
        try {
            a = Class.forName("org.jsoup.helper.HttpClientExecutor").asSubclass(aa8.class).getConstructor(t83.class, u83.class);
        } catch (Exception unused) {
        }
    }
}
