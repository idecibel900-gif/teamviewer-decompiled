package o;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;

/* JADX INFO: loaded from: classes.dex */
public final class ko4 implements Observer {
    public final LiveData m;
    public final Observer n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1286o = -1;

    public ko4(LiveData liveData, Observer observer) {
        this.m = liveData;
        this.n = observer;
    }

    @Override // androidx.lifecycle.Observer
    public final void a(Object obj) {
        int i = this.f1286o;
        LiveData liveData = this.m;
        if (i != liveData.getVersion()) {
            this.f1286o = liveData.getVersion();
            this.n.a(obj);
        }
    }
}
