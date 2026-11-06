package o;

import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class dx extends m1 implements RandomAccess {
    public final /* synthetic */ int[] m;

    public dx(int[] iArr) {
        this.m = iArr;
    }

    @Override // o.r0
    public final int a() {
        return this.m.length;
    }

    @Override // o.r0, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        return cx.C0(this.m, ((Number) obj).intValue());
    }

    @Override // java.util.List
    public final Object get(int i) {
        return Integer.valueOf(this.m[i]);
    }

    @Override // o.m1, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.m;
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            if (iIntValue == iArr[i]) {
                return i;
            }
        }
        return -1;
    }

    @Override // o.r0, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.m.length == 0;
    }

    @Override // o.m1, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            int iIntValue = ((Number) obj).intValue();
            int[] iArr = this.m;
            int length = iArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (iIntValue == iArr[length]) {
                        return length;
                    }
                    if (i >= 0) {
                        length = i;
                    }
                }
            }
        }
        return -1;
    }
}
