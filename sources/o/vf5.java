package o;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class vf5 implements ParameterizedType, Type {
    public final Class m;
    public final Type n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Type[] f2305o;

    public vf5(Class cls, Type type, ArrayList arrayList) {
        this.m = cls;
        this.n = type;
        this.f2305o = (Type[]) arrayList.toArray(new Type[0]);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        return this.m.equals(parameterizedType.getRawType()) && im3.n(this.n, parameterizedType.getOwnerType()) && Arrays.equals(this.f2305o, parameterizedType.getActualTypeArguments());
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.f2305o;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.n;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.m;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        StringBuilder sb = new StringBuilder();
        Class cls = this.m;
        Type type = this.n;
        if (type != null) {
            sb.append(g68.D(type));
            sb.append("$");
            sb.append(cls.getSimpleName());
        } else {
            sb.append(g68.D(cls));
        }
        Type[] typeArr = this.f2305o;
        if (typeArr.length != 0) {
            cx.X0(typeArr, sb, ", ", "<", ">", "...", uf5.n);
        }
        return sb.toString();
    }

    public final int hashCode() {
        int iHashCode = this.m.hashCode();
        Type type = this.n;
        return Arrays.hashCode(this.f2305o) ^ (iHashCode ^ (type != null ? type.hashCode() : 0));
    }

    public final String toString() {
        return getTypeName();
    }
}
