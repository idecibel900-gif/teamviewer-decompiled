package io.sentry.android.core.anr;

import io.sentry.cache.tape.g;
import io.sentry.cache.tape.j;
import io.sentry.f6;
import io.sentry.g1;
import io.sentry.g7;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes.dex */
public final class d implements AutoCloseable {
    public final g m;

    public d(g7 g7Var, File file) {
        j jVar;
        g1 logger = g7Var.getLogger();
        try {
            try {
                RandomAccessFile randomAccessFileG = j.G(file, true);
                try {
                    jVar = new j(file, randomAccessFileG, 120, true);
                } catch (Throwable th) {
                    randomAccessFileG.close();
                    throw th;
                }
            } catch (IOException unused) {
                if (!file.delete()) {
                    throw new IOException("Could not delete file");
                }
                RandomAccessFile randomAccessFileG2 = j.G(file, true);
                try {
                    jVar = new j(file, randomAccessFileG2, 120, true);
                } catch (Throwable th2) {
                    randomAccessFileG2.close();
                    throw th2;
                }
            }
        } catch (IOException e) {
            logger.d(f6.ERROR, "Failed to create stacktrace queue", e);
            jVar = null;
        }
        if (jVar == null) {
            this.m = new io.sentry.cache.tape.b();
        } else {
            this.m = new io.sentry.cache.tape.e(jVar, new io.sentry.hints.j());
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.m.close();
    }
}
