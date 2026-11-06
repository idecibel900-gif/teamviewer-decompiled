package o;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class v51 implements zp6 {
    public final AtomicReference a;

    public v51(zp6 zp6Var) {
        this.a = new AtomicReference(zp6Var);
    }

    @Override // o.zp6
    public final Iterator iterator() {
        zp6 zp6Var = (zp6) this.a.getAndSet(null);
        if (zp6Var != null) {
            return zp6Var.iterator();
        }
        hk0.l("This sequence can be consumed only once.");
        return null;
    }
}
