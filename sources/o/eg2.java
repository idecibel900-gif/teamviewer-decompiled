package o;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class eg2 {
    public static volatile eg2 b;
    public static final eg2 c = new eg2();
    public final Map a = Collections.EMPTY_MAP;

    public static eg2 a() {
        eg2 eg2Var;
        vw5 vw5Var = vw5.c;
        eg2 eg2Var2 = b;
        if (eg2Var2 != null) {
            return eg2Var2;
        }
        synchronized (eg2.class) {
            try {
                eg2Var = b;
                if (eg2Var == null) {
                    Class cls = ag2.a;
                    eg2 eg2Var3 = null;
                    if (cls != null) {
                        try {
                            eg2Var3 = (eg2) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    eg2Var = eg2Var3 != null ? eg2Var3 : c;
                    b = eg2Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return eg2Var;
    }
}
