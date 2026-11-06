package o;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public final class u76 extends n86 {
    public final Type a;
    public final n86 b;

    /* JADX WARN: Multi-variable type inference failed */
    public u76(Type type) {
        n86 l86Var;
        n86 l86Var2;
        this.a = type;
        if (!(type instanceof GenericArrayType)) {
            if (type instanceof Class) {
                Class cls = (Class) type;
                if (cls.isArray()) {
                    Class<?> componentType = cls.getComponentType();
                    componentType.getClass();
                    l86Var = componentType.isPrimitive() ? new l86(componentType) : ((componentType instanceof GenericArrayType) || componentType.isArray()) ? new u76(componentType) : componentType instanceof WildcardType ? new q86((WildcardType) componentType) : new c86(componentType);
                }
            }
            io.sentry.h2.j("Not an array type (", type.getClass(), "): ", type);
            throw null;
        }
        Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
        genericComponentType.getClass();
        boolean z = genericComponentType instanceof Class;
        if (z) {
            Class cls2 = (Class) genericComponentType;
            l86Var2 = cls2.isPrimitive() ? new l86(cls2) : l86Var2;
            this.b = l86Var2;
        }
        l86Var = ((genericComponentType instanceof GenericArrayType) || (z && ((Class) genericComponentType).isArray())) ? new u76(genericComponentType) : genericComponentType instanceof WildcardType ? new q86((WildcardType) genericComponentType) : new c86(genericComponentType);
        l86Var2 = l86Var;
        this.b = l86Var2;
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
