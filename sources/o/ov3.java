package o;

import java.lang.reflect.Type;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ov3 implements Type {
    public final Type[] m;
    public final int n;

    public ov3(Type[] typeArr) {
        this.m = typeArr;
        this.n = Arrays.hashCode(typeArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ov3) {
            return Arrays.equals(this.m, ((ov3) obj).m);
        }
        return false;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return cx.Z0(this.m, ", ", "[", "]", null, 56);
    }

    public final int hashCode() {
        return this.n;
    }

    public final String toString() {
        return getTypeName();
    }
}
