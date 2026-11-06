package o;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes2.dex */
public final class qa8 implements GenericArrayType {
    public final Type m;

    public qa8(Type type) {
        this.m = type;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && im3.C(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.m;
    }

    public final int hashCode() {
        return this.m.hashCode();
    }

    public final String toString() {
        return im3.i0(this.m) + "[]";
    }
}
