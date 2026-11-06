package o;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public abstract class w45 implements ua7 {
    @Override // o.ua7
    public final OutputStream a(OutputStream outputStream, byte[] bArr) {
        return new xa7(this, outputStream, bArr);
    }

    @Override // o.ua7
    public final InputStream b(InputStream inputStream, byte[] bArr) {
        return new wa7(this, inputStream, bArr);
    }

    public abstract int c();

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract ra7 g();

    public abstract sa7 h(byte[] bArr);
}
