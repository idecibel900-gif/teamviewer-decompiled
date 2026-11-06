package io.sentry;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q0 implements Callable {
    public final /* synthetic */ byte a;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                return InetAddress.getLocalHost();
            case 1:
                return new ArrayList();
            default:
                return io.sentry.android.core.internal.util.h.c.a();
        }
    }
}
