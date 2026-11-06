package o;

import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public final class s70 implements v07 {
    @Override // o.v07
    public final void W(bf0 bf0Var, long j) throws EOFException {
        bf0Var.skip(j);
    }

    @Override // o.v07, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
    }

    @Override // o.v07, java.io.Flushable
    public final void flush() {
    }

    @Override // o.v07
    public final ov7 i() {
        return ov7.d;
    }
}
