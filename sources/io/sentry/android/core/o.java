package io.sentry.android.core;

import android.os.Debug;
import io.sentry.z3;

/* JADX INFO: loaded from: classes.dex */
public final class o implements io.sentry.j1 {
    @Override // io.sentry.j1
    public final void a(z3 z3Var) {
        long jFreeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long nativeHeapSize = Debug.getNativeHeapSize() - Debug.getNativeHeapFreeSize();
        z3Var.c = jFreeMemory;
        z3Var.d = true;
        z3Var.e = nativeHeapSize;
        z3Var.f = true;
    }

    @Override // io.sentry.j1
    public final void c() {
    }
}
