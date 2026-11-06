package o;

import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class ya5 extends m1 implements RandomAccess {
    public final ai0[] m;
    public final int[] n;

    public ya5(ai0[] ai0VarArr, int[] iArr) {
        this.m = ai0VarArr;
        this.n = iArr;
    }

    @Override // o.r0
    public final int a() {
        return this.m.length;
    }

    @Override // o.r0, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ai0) {
            return super.contains((ai0) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.m[i];
    }

    @Override // o.m1, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ai0) {
            return super.indexOf((ai0) obj);
        }
        return -1;
    }

    @Override // o.m1, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ai0) {
            return super.lastIndexOf((ai0) obj);
        }
        return -1;
    }
}
