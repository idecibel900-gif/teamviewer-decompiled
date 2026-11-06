package o;

import android.media.MediaDataSource;
import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class we2 extends MediaDataSource {
    public long m;
    public final /* synthetic */ bf2 n;

    public we2(bf2 bf2Var) {
        this.n = bf2Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        bf2 bf2Var = this.n;
        DataInputStream dataInputStream = bf2Var.m;
        if (i2 == 0) {
            return 0;
        }
        if (j >= 0) {
            try {
                long j2 = this.m;
                if (j2 != j) {
                    if (j2 < 0 || j < j2 + ((long) dataInputStream.available())) {
                        bf2Var.j(j);
                        this.m = j;
                    }
                }
                if (i2 > dataInputStream.available()) {
                    i2 = dataInputStream.available();
                }
                int i3 = bf2Var.read(bArr, i, i2);
                if (i3 >= 0) {
                    this.m += (long) i3;
                    return i3;
                }
            } catch (IOException unused) {
            }
            this.m = -1L;
            return -1;
        }
        return -1;
    }
}
