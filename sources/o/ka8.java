package o;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ka8 implements ParameterizedType {
    public final Type m;
    public final Type n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Type[] f1247o;

    public ka8(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            Class<?> enclosingClass = ((Class) type2).getEnclosingClass();
            if (type != null) {
                if (enclosingClass == null || f57.j(type) != enclosingClass) {
                    yq4.s("unexpected owner type for ", type2, ": ", type);
                    throw null;
                }
            } else if (enclosingClass != null) {
                io.sentry.h2.g(type2, ": null", "unexpected owner type for ");
                throw null;
            }
        }
        this.m = type != null ? ma8.a(type) : null;
        this.n = ma8.a(type2);
        this.f1247o = (Type[]) typeArr.clone();
        int i = 0;
        while (true) {
            Type[] typeArr2 = this.f1247o;
            if (i >= typeArr2.length) {
                return;
            }
            typeArr2[i].getClass();
            ma8.b(this.f1247o[i]);
            Type[] typeArr3 = this.f1247o;
            typeArr3[i] = ma8.a(typeArr3[i]);
            i++;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && f57.h(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f1247o.clone();
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
        int iHashCode = Arrays.hashCode(this.f1247o) ^ this.n.hashCode();
        Set set = ma8.a;
        Type type = this.m;
        return (type != null ? type.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        Type[] typeArr = this.f1247o;
        StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
        sb.append(ma8.k(this.n));
        if (typeArr.length == 0) {
            return sb.toString();
        }
        sb.append("<");
        sb.append(ma8.k(typeArr[0]));
        for (int i = 1; i < typeArr.length; i++) {
            sb.append(", ");
            sb.append(ma8.k(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
