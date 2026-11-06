package com.google.firebase.messaging;

import o.bo7;
import o.le7;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements le7, RequestDeduplicator.GetTokenRequest {
    public final /* synthetic */ FirebaseMessaging m;
    public final /* synthetic */ String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f51o;
    public final /* synthetic */ Store.Token p;

    public /* synthetic */ a(FirebaseMessaging firebaseMessaging, String str, boolean z, Store.Token token) {
        this.m = firebaseMessaging;
        this.n = str;
        this.f51o = z;
        this.p = token;
    }

    @Override // o.le7
    public bo7 i(Object obj) {
        return this.m.lambda$blockingRegister$16(this.n, this.f51o, this.p, (String) obj);
    }
}
