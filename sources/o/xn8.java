package o;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class xn8 {
    public static final xn8 b;
    public t60 a;

    static {
        xn8 xn8Var = new xn8();
        xn8Var.a = null;
        b = xn8Var;
    }

    public static t60 a(Context context) {
        t60 t60Var;
        xn8 xn8Var = b;
        synchronized (xn8Var) {
            try {
                t60Var = xn8Var.a;
                if (t60Var == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    t60Var = new t60(context, false);
                    xn8Var.a = t60Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t60Var;
    }
}
