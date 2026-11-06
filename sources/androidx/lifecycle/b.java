package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class b extends LiveData.ObserverWrapper {
    public final /* synthetic */ LiveData q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(LiveData liveData, Observer observer) {
        super(observer);
        this.q = liveData;
    }

    @Override // androidx.lifecycle.LiveData.ObserverWrapper
    public final boolean d() {
        return true;
    }
}
