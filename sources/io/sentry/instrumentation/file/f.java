package io.sentry.instrumentation.file;

import io.sentry.d5;
import io.sentry.q7;
import io.sentry.util.l;
import io.sentry.v1;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class f extends FileInputStream {
    public final FileInputStream m;
    public final b n;

    /* JADX WARN: Illegal instructions before constructor call */
    public f(c cVar) throws FileNotFoundException {
        FileInputStream fileInputStream = (FileInputStream) cVar.d;
        try {
            super(fileInputStream.getFD());
            this.n = new b(cVar.b, cVar.a, cVar.c);
            this.m = fileInputStream;
        } catch (IOException unused) {
            throw new FileNotFoundException("No file descriptor");
        }
    }

    public static c e(File file, FileInputStream fileInputStream) {
        v1 v1VarM = l.a ? d5.c().m() : d5.c().g();
        v1 v1VarS = v1VarM != null ? v1VarM.s("file.read") : null;
        if (fileInputStream == null) {
            fileInputStream = new FileInputStream(file);
        }
        return new c(file, v1VarS, fileInputStream, d5.c().l());
    }

    @Override // java.io.FileInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.n.a(this.m);
        super.close();
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final int read() {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        this.n.c(new q7(this, atomicInteger, (byte) 8));
        return atomicInteger.get();
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final long skip(long j) {
        return ((Long) this.n.c(new d(this, j))).longValue();
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return ((Integer) this.n.c(new q7(this, bArr, (byte) 7))).intValue();
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        return ((Integer) this.n.c(new e(this, bArr, i, i2, (byte) 0))).intValue();
    }

    public f(c cVar, FileDescriptor fileDescriptor) {
        super(fileDescriptor);
        this.n = new b(cVar.b, cVar.a, cVar.c);
        this.m = (FileInputStream) cVar.d;
    }
}
