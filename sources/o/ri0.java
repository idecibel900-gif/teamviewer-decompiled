package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ri0 {
    public si0 a(Type type, Annotation[] annotationArr) {
        if (im3.L(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            hk0.l("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
            return null;
        }
        byte b = 0;
        Type typeI = im3.I(0, (ParameterizedType) type);
        if (im3.L(typeI) != kc6.class) {
            return new sx0(typeI, b);
        }
        if (typeI instanceof ParameterizedType) {
            return new sx0(im3.I(0, (ParameterizedType) typeI), (byte) 1);
        }
        hk0.l("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        return null;
    }
}
