package io.sentry.util;

import io.sentry.s1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements s1 {
    @Override // java.lang.AutoCloseable
    public final void close() {
        ThreadLocal threadLocal = o.a;
        Integer num = (Integer) threadLocal.get();
        if (num == null || num.intValue() <= 1) {
            threadLocal.remove();
        } else {
            threadLocal.set(Integer.valueOf(num.intValue() - 1));
        }
    }
}
