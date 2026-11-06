package o;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class cg2 {
    public static volatile cg2 b;
    public static final cg2 c = new cg2();
    public final Map a = Collections.EMPTY_MAP;

    public static cg2 a() {
        cg2 cg2Var;
        cg2 cg2Var2 = b;
        if (cg2Var2 != null) {
            return cg2Var2;
        }
        synchronized (cg2.class) {
            try {
                cg2Var = b;
                if (cg2Var == null) {
                    Class cls = zf2.a;
                    cg2 cg2Var3 = null;
                    if (cls != null) {
                        try {
                            cg2Var3 = (cg2) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    cg2Var = cg2Var3 != null ? cg2Var3 : c;
                    b = cg2Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cg2Var;
    }
}
