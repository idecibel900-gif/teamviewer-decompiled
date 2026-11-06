package o;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class hs0 extends hm3 {
    public final /* synthetic */ Method K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Class M;

    public hs0(Method method, Object obj, Class cls) {
        this.K = method;
        this.L = obj;
        this.M = cls;
    }

    public final String toString() {
        return this.M.getName();
    }

    @Override // o.hm3
    public final Object x() {
        return this.K.invoke(this.L, this.M);
    }
}
