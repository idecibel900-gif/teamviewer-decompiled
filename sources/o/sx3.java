package o;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class sx3 {
    public final /* synthetic */ byte a = 0;
    public final Object b;
    public final Object c;
    public final Object d;

    public sx3(Class cls, rc[] rcVarArr) {
        this.b = cls;
        HashMap map = new HashMap();
        for (rc rcVar : rcVarArr) {
            rcVar.getClass();
            if (map.containsKey(ua7.class)) {
                io.sentry.h2.h(ua7.class.getCanonicalName(), "KeyTypeManager constructed with duplicate factories for primitive ");
                throw null;
            }
            map.put(ua7.class, rcVar);
        }
        if (rcVarArr.length > 0) {
            rcVarArr[0].getClass();
            this.c = ua7.class;
        } else {
            this.c = Void.class;
        }
        this.d = Collections.unmodifiableMap(map);
    }

    public abstract ht2 a();

    public abstract String b();

    public abstract ds1 c();

    public abstract s1 d(yh0 yh0Var);

    public abstract void e(s1 s1Var);

    public String toString() {
        switch (this.a) {
            case 1:
                return getClass().getSimpleName() + ": " + a();
            default:
                return super.toString();
        }
    }

    public sx3(ty4 ty4Var, d22 d22Var, s67 s67Var) {
        this.b = ty4Var;
        this.c = d22Var;
        this.d = s67Var;
    }
}
