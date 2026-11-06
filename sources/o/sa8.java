package o;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* JADX INFO: loaded from: classes2.dex */
public final class sa8 implements WildcardType {
    public final Type m;
    public final Type n;

    public sa8(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            yq4.f();
            throw null;
        }
        if (typeArr.length != 1) {
            yq4.f();
            throw null;
        }
        if (typeArr2.length != 1) {
            typeArr[0].getClass();
            im3.r(typeArr[0]);
            this.n = null;
            this.m = typeArr[0];
            return;
        }
        typeArr2[0].getClass();
        im3.r(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            yq4.f();
            throw null;
        }
        this.n = typeArr2[0];
        this.m = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && im3.C(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.n;
        return type != null ? new Type[]{type} : im3.C;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.m};
    }

    public final int hashCode() {
        Type type = this.n;
        return (this.m.hashCode() + 31) ^ (type != null ? type.hashCode() + 31 : 1);
    }

    public final String toString() {
        Type type = this.n;
        if (type != null) {
            return "? super " + im3.i0(type);
        }
        Type type2 = this.m;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + im3.i0(type2);
    }
}
