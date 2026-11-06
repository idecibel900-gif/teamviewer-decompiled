package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ob7 {
    public static final e96 a = new e96("<format>(.*?)</format>(?!<format>.*?</format>)");

    public static final List a(String str) {
        str.getClass();
        return bq6.l0(new h18(e96.a(a, str), new vs6((byte) 12)));
    }

    public static final String b(String str) {
        str.getClass();
        return a.e(str, new vs6((byte) 9));
    }
}
