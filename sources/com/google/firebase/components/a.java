package com.google.firebase.components;

import com.google.firebase.inject.Provider;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Provider n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Provider f46o;

    public /* synthetic */ a(Provider provider, Provider provider2, byte b) {
        this.m = b;
        this.f46o = provider;
        this.n = provider2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.m) {
            case 0:
                ((OptionalProvider) this.f46o).set(this.n);
                break;
            default:
                ((LazySet) this.f46o).add(this.n);
                break;
        }
    }
}
