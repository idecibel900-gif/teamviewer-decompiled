package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class mk3 extends fs5 {
    public int[] a;
    public int b;

    @Override // o.fs5
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // o.fs5
    public final void b(int i) {
        int[] iArr = this.a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(iArr, i);
        }
    }

    @Override // o.fs5
    public final int d() {
        return this.b;
    }
}
