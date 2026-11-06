package io.sentry.util;

import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
public final class e extends Writer {
    public long m = 0;

    public static int e(char c) {
        if (c <= 127) {
            return 1;
        }
        return (c > 2047 && !Character.isSurrogate(c)) ? 3 : 2;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }

    @Override // java.io.Writer
    public final void write(String str, int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            this.m += (long) e(str.charAt(i3));
        }
    }

    @Override // java.io.Writer
    public final void write(int i) {
        this.m += (long) e((char) i);
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            this.m += (long) e(cArr[i3]);
        }
    }
}
