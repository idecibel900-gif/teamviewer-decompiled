package o;

import java.lang.reflect.Type;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n86 implements rn3 {
    @Override // o.rn3
    public q76 a(ht2 ht2Var) {
        Object next;
        ht2Var.getClass();
        Iterator it = getAnnotations().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (im3.n(p76.a(et1.z(et1.x(((q76) next).a))).a(), ht2Var)) {
                return (q76) next;
            }
        }
        next = null;
        return (q76) next;
    }

    public abstract Type b();

    public final boolean equals(Object obj) {
        return (obj instanceof n86) && im3.n(b(), ((n86) obj).b());
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + b();
    }
}
