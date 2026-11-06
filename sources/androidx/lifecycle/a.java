package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {
    public final /* synthetic */ LiveData m;

    public a(LiveData liveData) {
        this.m = liveData;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        synchronized (this.m.mDataLock) {
            obj = this.m.mPendingData;
            this.m.mPendingData = LiveData.NOT_SET;
        }
        this.m.setValue(obj);
    }
}
