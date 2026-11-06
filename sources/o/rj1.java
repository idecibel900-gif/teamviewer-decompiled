package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class rj1 extends ri0 {
    public final Executor a;

    public rj1(Executor executor) {
        this.a = executor;
    }

    @Override // o.ri0
    public final si0 a(Type type, Annotation[] annotationArr) {
        if (im3.L(type) != qi0.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new wk0((Object) im3.I(0, (ParameterizedType) type), (Object) (im3.P(annotationArr, c17.class) ? null : this.a), (byte) 11);
        }
        hk0.g("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
        return null;
    }
}
