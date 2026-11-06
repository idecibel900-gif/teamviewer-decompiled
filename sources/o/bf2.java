package o;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class bf2 extends xe2 {
    public bf2(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.m.mark(Integer.MAX_VALUE);
        } else {
            hk0.g("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
            throw null;
        }
    }

    public final void j(long j) throws IOException {
        int i = this.n;
        if (i > j) {
            this.n = 0;
            this.m.reset();
        } else {
            j -= (long) i;
        }
        e((int) j);
    }

    public bf2(byte[] bArr) {
        super(bArr);
        this.m.mark(Integer.MAX_VALUE);
    }
}
