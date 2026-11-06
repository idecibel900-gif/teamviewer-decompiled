package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class jh0 extends fs5 {
    public byte[] a;
    public int b;

    @Override // o.fs5
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // o.fs5
    public final void b(int i) {
        byte[] bArr = this.a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(bArr, i);
        }
    }

    @Override // o.fs5
    public final int d() {
        return this.b;
    }
}
