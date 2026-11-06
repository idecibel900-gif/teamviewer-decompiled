package o;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes.dex */
public final class e94 implements DefaultLifecycleObserver {
    public final /* synthetic */ gl0 m;

    public e94(gl0 gl0Var) {
        this.m = gl0Var;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        this.m.resumeWith(f88.a);
    }
}
