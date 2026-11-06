package o;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class ra8 implements ParameterizedType {
    public final Type m;
    public final Type n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Type[] f1908o;

    public ra8(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                yq4.f();
                throw null;
            }
        }
        for (Type type3 : typeArr) {
            Objects.requireNonNull(type3, "typeArgument == null");
            im3.r(type3);
        }
        this.m = type;
        this.n = type2;
        this.f1908o = (Type[]) typeArr.clone();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && im3.C(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f1908o.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.m;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.n;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f1908o) ^ this.n.hashCode();
        Type type = this.m;
        return (type != null ? type.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        Type[] typeArr = this.f1908o;
        int length = typeArr.length;
        Type type = this.n;
        if (length == 0) {
            return im3.i0(type);
        }
        StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
        sb.append(im3.i0(type));
        sb.append("<");
        sb.append(im3.i0(typeArr[0]));
        for (int i = 1; i < typeArr.length; i++) {
            sb.append(", ");
            sb.append(im3.i0(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
