package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class yw {
    public static final int a;

    static {
        Object sc6Var;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            sc6Var = property != null ? bc7.O(property) : null;
        } catch (Throwable th) {
            sc6Var = new sc6(th);
        }
        Integer num = (Integer) (sc6Var instanceof sc6 ? null : sc6Var);
        a = num != null ? num.intValue() : 2097152;
    }
}
