package o;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xl3 implements mj0 {
    public final Method a;
    public final List b;
    public final Class c;

    public xl3(Method method, List list) {
        this.a = method;
        this.b = list;
        Class<?> returnType = method.getReturnType();
        returnType.getClass();
        this.c = returnType;
    }

    @Override // o.mj0
    public final List a() {
        return this.b;
    }

    @Override // o.mj0
    public final Member b() {
        return null;
    }

    @Override // o.mj0
    public final Type getReturnType() {
        return this.c;
    }
}
