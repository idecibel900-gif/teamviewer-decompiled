package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class vf4 extends fs5 {
    public long[] a;
    public int b;

    @Override // o.fs5
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // o.fs5
    public final void b(int i) {
        long[] jArr = this.a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(jArr, i);
        }
    }

    @Override // o.fs5
    public final int d() {
        return this.b;
    }
}
