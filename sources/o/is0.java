package o;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class is0 extends hm3 {
    public final /* synthetic */ Method K;
    public final /* synthetic */ Class L;
    public final /* synthetic */ int M;

    public is0(Method method, Class cls, int i) {
        this.K = method;
        this.L = cls;
        this.M = i;
    }

    public final String toString() {
        return this.L.getName();
    }

    @Override // o.hm3
    public final Object x() {
        return this.K.invoke(null, this.L, Integer.valueOf(this.M));
    }
}
