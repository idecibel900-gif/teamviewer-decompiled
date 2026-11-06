package o;

import java.io.Serializable;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class jc2 extends m1 implements ic2, RandomAccess, Serializable {
    public final Enum[] m;

    public jc2(Enum[] enumArr) {
        enumArr.getClass();
        this.m = enumArr;
    }

    @Override // o.r0
    public final int a() {
        return this.m.length;
    }

    @Override // o.r0, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r3 = (Enum) obj;
        return ((Enum) cx.V0(r3.ordinal(), this.m)) == r3;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.m;
        int length = enumArr.length;
        if (i >= 0 && i < length) {
            return enumArr[i];
        }
        hk0.r(ua5.l("index: ", i, length, ", size: "));
        return null;
    }

    @Override // o.m1, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (((Enum) cx.V0(iOrdinal, this.m)) == r3) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // o.m1, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (((Enum) cx.V0(iOrdinal, this.m)) == r3) {
            return iOrdinal;
        }
        return -1;
    }
}
