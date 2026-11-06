package o;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public final class ja8 implements GenericArrayType {
    public final Type m;

    public ja8(Type type) {
        this.m = ma8.a(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && f57.h(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.m;
    }

    public final int hashCode() {
        return this.m.hashCode();
    }

    public final String toString() {
        return ma8.k(this.m) + "[]";
    }
}
