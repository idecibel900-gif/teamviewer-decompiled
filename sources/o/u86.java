package o;

import java.lang.ref.SoftReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class u86 implements Function0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ol5 f2184o = new ol5(3);
    public final Function0 m;
    public volatile SoftReference n;

    public u86(Object obj, Function0 function0) {
        if (function0 == null) {
            hk0.g("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal.<init> must not be null");
            throw null;
        }
        this.n = null;
        this.m = function0;
        if (obj != null) {
            this.n = new SoftReference(obj);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        Object obj;
        Object obj2 = f2184o;
        SoftReference softReference = this.n;
        if (softReference != null && (obj = softReference.get()) != null) {
            if (obj == obj2) {
                return null;
            }
            return obj;
        }
        Object objA = this.m.a();
        if (objA != null) {
            obj2 = objA;
        }
        this.n = new SoftReference(obj2);
        return objA;
    }
}
