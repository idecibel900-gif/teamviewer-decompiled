package io.sentry.android.core.util;

import android.content.Context;
import android.view.View;
import io.sentry.h2;
import java.util.concurrent.CopyOnWriteArraySet;
import o.dm1;
import o.em1;
import o.o22;

/* JADX INFO: loaded from: classes.dex */
public final class a implements o22 {
    public final Object m;
    public volatile Object n;

    public a() {
        this.m = new CopyOnWriteArraySet();
    }

    public Object a(Context context) {
        if (this.n == null) {
            synchronized (this) {
                try {
                    if (this.n == null) {
                        this.n = ((h2) this.m).d(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.n;
    }

    @Override // o.o22
    public dm1 c() {
        return (em1) this.n;
    }

    public a(h2 h2Var) {
        this.n = null;
        this.m = h2Var;
    }

    public a(View view, em1 em1Var) {
        this.m = view;
        this.n = em1Var;
    }
}
