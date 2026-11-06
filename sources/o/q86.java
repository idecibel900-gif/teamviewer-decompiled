package o;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public final class q86 extends n86 {
    public final WildcardType a;

    public q86(WildcardType wildcardType) {
        this.a = wildcardType;
    }

    @Override // o.n86
    public final Type b() {
        return this.a;
    }

    public final n86 c() {
        WildcardType wildcardType = this.a;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            an4.u(wildcardType, "Wildcard types with many bounds are not yet supported: ");
            return null;
        }
        if (lowerBounds.length == 1) {
            Object objC1 = cx.c1(lowerBounds);
            objC1.getClass();
            Type type = (Type) objC1;
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new l86(cls);
                }
            }
            if ((type instanceof GenericArrayType) || (z && ((Class) type).isArray())) {
                return new u76(type);
            }
            return type instanceof WildcardType ? new q86((WildcardType) type) : new c86(type);
        }
        if (upperBounds.length == 1) {
            Type type2 = (Type) cx.c1(upperBounds);
            if (!im3.n(type2, Object.class)) {
                type2.getClass();
                boolean z2 = type2 instanceof Class;
                if (z2) {
                    Class cls2 = (Class) type2;
                    if (cls2.isPrimitive()) {
                        return new l86(cls2);
                    }
                }
                if ((type2 instanceof GenericArrayType) || (z2 && ((Class) type2).isArray())) {
                    return new u76(type2);
                }
                return type2 instanceof WildcardType ? new q86((WildcardType) type2) : new c86(type2);
            }
        }
        return null;
    }

    @Override // o.rn3
    public final Collection getAnnotations() {
        return ea2.m;
    }
}
