package o;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class ks3 extends it1 {
    public final Method d;

    public ks3(Method method) {
        super((byte) 10);
        this.d = method;
    }

    @Override // o.it1
    public final String l() {
        return qs1.Q(this.d);
    }
}
