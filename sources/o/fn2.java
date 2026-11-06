package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class fn2 extends fs5 {
    public float[] a;
    public int b;

    @Override // o.fs5
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // o.fs5
    public final void b(int i) {
        float[] fArr = this.a;
        if (fArr.length < i) {
            int length = fArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(fArr, i);
        }
    }

    @Override // o.fs5
    public final int d() {
        return this.b;
    }
}
