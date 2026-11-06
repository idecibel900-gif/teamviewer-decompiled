package o;

import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes2.dex */
public final class js3 extends it1 {
    public final Constructor d;

    public js3(Constructor constructor) {
        super((byte) 10);
        this.d = constructor;
    }

    @Override // o.it1
    public final String l() {
        Class<?>[] parameterTypes = this.d.getParameterTypes();
        parameterTypes.getClass();
        return cx.Z0(parameterTypes, "", "<init>(", ")V", ek.O, 24);
    }
}
