package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class p36 extends Exception {
    public static final boolean m;
    public static final StackTraceElement[] n;

    static {
        m = System.getProperty("surefire.test.class.path") != null;
        n = new StackTraceElement[0];
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
