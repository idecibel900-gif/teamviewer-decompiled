package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ei0 {
    public static final /* synthetic */ int a = 0;

    static {
        Object sc6Var;
        try {
            sc6Var = Class.forName("java.lang.ClassValue");
        } catch (Throwable th) {
            sc6Var = new sc6(th);
        }
        if (!(sc6Var instanceof sc6)) {
            sc6Var = Boolean.TRUE;
        }
        Object obj = Boolean.FALSE;
        if (sc6Var instanceof sc6) {
            sc6Var = obj;
        }
    }
}
