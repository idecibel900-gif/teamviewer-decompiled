package o;

import java.lang.reflect.Type;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public final class l86 extends n86 {
    public final Class a;

    public l86(Class cls) {
        this.a = cls;
    }

    @Override // o.n86
    public final Type b() {
        return this.a;
    }

    @Override // o.rn3
    public final Collection getAnnotations() {
        return ea2.m;
    }
}
