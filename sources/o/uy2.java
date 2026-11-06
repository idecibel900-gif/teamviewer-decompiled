package o;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes2.dex */
public final class uy2 implements GenericArrayType, Type {
    public final Type m;

    public uy2(Type type) {
        type.getClass();
        this.m = type;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GenericArrayType) {
            return im3.n(this.m, ((GenericArrayType) obj).getGenericComponentType());
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.m;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return g68.D(this.m) + "[]";
    }

    public final int hashCode() {
        return this.m.hashCode();
    }

    public final String toString() {
        return getTypeName();
    }
}
