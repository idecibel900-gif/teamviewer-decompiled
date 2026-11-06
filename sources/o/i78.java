package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class i78 extends fs5 {
    public short[] a;
    public int b;

    @Override // o.fs5
    public final Object a() {
        return new h78(Arrays.copyOf(this.a, this.b));
    }

    @Override // o.fs5
    public final void b(int i) {
        short[] sArr = this.a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(sArr, i);
        }
    }

    @Override // o.fs5
    public final int d() {
        return this.b;
    }
}
