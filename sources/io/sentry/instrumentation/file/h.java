package io.sentry.instrumentation.file;

import io.sentry.d5;
import io.sentry.q7;
import io.sentry.util.l;
import io.sentry.v1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class h extends FileOutputStream {
    public final FileOutputStream m;
    public final b n;

    /* JADX WARN: Illegal instructions before constructor call */
    public h(c cVar) throws FileNotFoundException {
        FileOutputStream fileOutputStream = (FileOutputStream) cVar.d;
        try {
            super(fileOutputStream.getFD());
            this.n = new b(cVar.b, cVar.a, cVar.c);
            this.m = fileOutputStream;
        } catch (IOException unused) {
            throw new FileNotFoundException("No file descriptor");
        }
    }

    public static c e(File file, FileOutputStream fileOutputStream, boolean z) {
        v1 v1VarM = l.a ? d5.c().m() : d5.c().g();
        return new c(file, v1VarM != null ? v1VarM.s("file.write") : null, fileOutputStream, d5.c().l());
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.n.a(this.m);
        super.close();
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.n.c(new e(this, bArr, i, i2, (byte) 1));
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) {
        this.n.c(new q7(this, bArr, (byte) 9));
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public final void write(int i) {
        this.n.c(new g(i, this));
    }
}
