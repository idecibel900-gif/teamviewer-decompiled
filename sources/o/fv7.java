package o;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class fv7 implements mj0 {
    public static final fv7 a = new fv7();

    @Override // o.mj0
    public final List a() {
        return ea2.m;
    }

    @Override // o.mj0
    public final Member b() {
        return null;
    }

    @Override // o.mj0
    public final Object call(Object[] objArr) {
        objArr.getClass();
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    @Override // o.mj0
    public final Type getReturnType() {
        Class cls = Void.TYPE;
        cls.getClass();
        return cls;
    }
}
