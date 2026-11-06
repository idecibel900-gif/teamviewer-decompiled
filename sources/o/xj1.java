package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xj1 {
    public static final nm1 a;

    static {
        String property;
        q43 q43Var;
        nm1 nm1Var;
        int i = yh7.a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            tk1 tk1Var = g22.a;
            q43Var = ok4.a;
            q43 q43Var2 = q43Var.r;
            if (q43Var == null) {
                nm1Var = q43Var;
                nm1Var = wj1.w;
            }
        } else {
            nm1Var = wj1.w;
        }
        nm1Var = q43Var;
        a = nm1Var;
    }
}
