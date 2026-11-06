package o;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: loaded from: classes2.dex */
public interface v07 extends Closeable, Flushable {
    void W(bf0 bf0Var, long j);

    void close();

    @Override // java.io.Flushable
    void flush();

    ov7 i();
}
