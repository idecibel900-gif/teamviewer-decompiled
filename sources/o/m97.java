package o;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class m97 extends x2 {
    public final AtomicReference a = new AtomicReference(null);

    @Override // o.x2
    public final boolean a(w2 w2Var) {
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(im3.A);
        return true;
    }

    @Override // o.x2
    public final hc1[] b(w2 w2Var) {
        this.a.set(null);
        return qf0.a;
    }
}
