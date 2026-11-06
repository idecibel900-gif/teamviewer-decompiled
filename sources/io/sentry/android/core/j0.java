package io.sentry.android.core;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class j0 implements DefaultLifecycleObserver {
    public final i0 m = new i0(this, (byte) 0);
    public final /* synthetic */ k0 n;

    public j0(k0 k0Var) {
        this.n = k0Var;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        this.n.p = Boolean.FALSE;
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            ((h0) it.next()).e();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        this.n.p = Boolean.TRUE;
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            ((h0) it.next()).j();
        }
    }
}
