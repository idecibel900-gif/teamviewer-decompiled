package o;

import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class lj3 extends InputStream {
    public boolean m;
    public InputStream n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public InputStream f1367o;
    public ep3 p;
    public byte[] q;

    @Override // java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream = this.n;
        if (inputStream == null) {
            return 0;
        }
        return inputStream.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f1367o.close();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = this.n;
        if (inputStream != null) {
            return inputStream.read(bArr, i, i2);
        }
        if (this.m) {
            throw new IOException("No matching key found for the ciphertext in the stream.");
        }
        this.m = true;
        List list = (List) ((ConcurrentHashMap) this.p.n).get(new ns5(di1.p));
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                try {
                    InputStream inputStreamB = ((ua7) ((ms5) it.next()).a).b(this.f1367o, this.q);
                    int i3 = inputStreamB.read(bArr, i, i2);
                    if (i3 == 0) {
                        throw new IOException("Could not read bytes from the ciphertext stream");
                    }
                    this.n = inputStreamB;
                    this.f1367o.mark(0);
                    return i3;
                } catch (IOException unused) {
                    this.f1367o.reset();
                }
            } catch (GeneralSecurityException unused2) {
                this.f1367o.reset();
            }
        }
        throw new IOException("No matching key found for the ciphertext in the stream.");
    }

    @Override // java.io.InputStream
    public final synchronized int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = new byte[1];
        if (read(bArr) != 1) {
            return -1;
        }
        return bArr[0];
    }
}
