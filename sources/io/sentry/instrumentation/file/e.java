package io.sentry.instrumentation.file;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements a {
    public final /* synthetic */ byte m;
    public final /* synthetic */ byte[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f204o;
    public final /* synthetic */ int p;
    public final /* synthetic */ Closeable q;

    public /* synthetic */ e(Closeable closeable, byte[] bArr, int i, int i2, byte b) {
        this.m = b;
        this.q = closeable;
        this.n = bArr;
        this.f204o = i;
        this.p = i2;
    }

    @Override // io.sentry.instrumentation.file.a
    public final Object call() throws IOException {
        byte b = this.m;
        int i = this.p;
        int i2 = this.f204o;
        byte[] bArr = this.n;
        Closeable closeable = this.q;
        switch (b) {
            case 0:
                return Integer.valueOf(((f) closeable).m.read(bArr, i2, i));
            default:
                ((h) closeable).m.write(bArr, i2, i);
                return Integer.valueOf(i);
        }
    }
}
