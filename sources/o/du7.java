package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class du7 {
    public static final ThreadLocal a = new ThreadLocal();

    public static be2 a() {
        ThreadLocal threadLocal = a;
        be2 be2Var = (be2) threadLocal.get();
        if (be2Var != null) {
            return be2Var;
        }
        x70 x70Var = new x70(Thread.currentThread());
        threadLocal.set(x70Var);
        return x70Var;
    }
}
