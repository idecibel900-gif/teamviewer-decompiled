package o;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public interface df7 extends Closeable {
    bf7 R();

    bf7 X();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z);
}
