package o;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class ya7 implements ua7 {
    public ep3 a;

    @Override // o.ua7
    public final OutputStream a(OutputStream outputStream, byte[] bArr) {
        return ((ua7) ((ms5) this.a.f733o).a).a(outputStream, bArr);
    }

    @Override // o.ua7
    public final InputStream b(InputStream inputStream, byte[] bArr) {
        ep3 ep3Var = this.a;
        lj3 lj3Var = new lj3();
        lj3Var.m = false;
        lj3Var.n = null;
        lj3Var.p = ep3Var;
        if (inputStream.markSupported()) {
            lj3Var.f1367o = inputStream;
        } else {
            lj3Var.f1367o = new BufferedInputStream(inputStream);
        }
        lj3Var.f1367o.mark(Integer.MAX_VALUE);
        lj3Var.q = (byte[]) bArr.clone();
        return lj3Var;
    }
}
