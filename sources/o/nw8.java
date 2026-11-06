package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class nw8 extends wv8 {
    public final byte[] e;

    public nw8(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.e = bArr;
    }

    @Override // o.wv8
    public final byte[] i() {
        return this.e;
    }
}
