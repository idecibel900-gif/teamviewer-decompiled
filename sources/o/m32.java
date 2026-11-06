package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class m32 extends fs5 {
    public double[] a;
    public int b;

    @Override // o.fs5
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // o.fs5
    public final void b(int i) {
        double[] dArr = this.a;
        if (dArr.length < i) {
            int length = dArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(dArr, i);
        }
    }

    @Override // o.fs5
    public final int d() {
        return this.b;
    }
}
