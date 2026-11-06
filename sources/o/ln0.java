package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ln0 extends fs5 {
    public char[] a;
    public int b;

    @Override // o.fs5
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // o.fs5
    public final void b(int i) {
        char[] cArr = this.a;
        if (cArr.length < i) {
            int length = cArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(cArr, i);
        }
    }

    @Override // o.fs5
    public final int d() {
        return this.b;
    }
}
