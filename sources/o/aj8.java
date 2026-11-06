package o;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class aj8 implements WildcardType, Type {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final aj8 f330o = new aj8(null, null);
    public final Type m;
    public final Type n;

    public aj8(Type type, Type type2) {
        this.m = type;
        this.n = type2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WildcardType)) {
            return false;
        }
        WildcardType wildcardType = (WildcardType) obj;
        return Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds());
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.n;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        Type type = this.n;
        if (type != null) {
            return "? super " + g68.D(type);
        }
        Type type2 = this.m;
        if (type2 == null || im3.n(type2, Object.class)) {
            return "?";
        }
        return "? extends " + g68.D(type2);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        Type type = this.m;
        if (type == null) {
            type = Object.class;
        }
        return new Type[]{type};
    }

    public final int hashCode() {
        return Arrays.hashCode(getLowerBounds()) ^ Arrays.hashCode(getUpperBounds());
    }

    public final String toString() {
        return getTypeName();
    }
}
