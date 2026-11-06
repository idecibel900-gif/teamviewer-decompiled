package androidx.lifecycle;

import o.l84;
import o.m84;
import o.s84;

/* JADX INFO: loaded from: classes.dex */
public final class c extends LiveData.ObserverWrapper implements s84 {
    public final LifecycleOwner q;
    public final /* synthetic */ LiveData r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(LiveData liveData, LifecycleOwner lifecycleOwner, Observer observer) {
        super(observer);
        this.r = liveData;
        this.q = lifecycleOwner;
    }

    @Override // androidx.lifecycle.LiveData.ObserverWrapper
    public final void b() {
        this.q.getR().f(this);
    }

    @Override // androidx.lifecycle.LiveData.ObserverWrapper
    public final boolean c(LifecycleOwner lifecycleOwner) {
        return this.q == lifecycleOwner;
    }

    @Override // androidx.lifecycle.LiveData.ObserverWrapper
    public final boolean d() {
        return this.q.getR().i.compareTo(m84.p) >= 0;
    }

    @Override // o.s84
    public final void e(LifecycleOwner lifecycleOwner, l84 l84Var) {
        LifecycleOwner lifecycleOwner2 = this.q;
        m84 m84Var = lifecycleOwner2.getR().i;
        if (m84Var == m84.m) {
            this.r.removeObserver(this.m);
            return;
        }
        m84 m84Var2 = null;
        while (m84Var2 != m84Var) {
            a(d());
            m84Var2 = m84Var;
            m84Var = lifecycleOwner2.getR().i;
        }
    }
}
