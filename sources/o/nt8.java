package o;

import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
final class nt8 extends TimeoutException {
    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
