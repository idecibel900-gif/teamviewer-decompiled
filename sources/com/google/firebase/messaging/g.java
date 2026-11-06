package com.google.firebase.messaging;

import o.bo7;
import o.ic1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements ic1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f54o;

    public /* synthetic */ g(byte b, Object obj, String str) {
        this.m = b;
        this.f54o = obj;
        this.n = str;
    }

    @Override // o.ic1
    public final Object j(bo7 bo7Var) {
        byte b = this.m;
        String str = this.n;
        Object obj = this.f54o;
        switch (b) {
            case 0:
                return ((GmsRegistrationClient) obj).lambda$fetchFidCredentials$0(str, bo7Var);
            default:
                return ((RequestDeduplicator) obj).lambda$getOrStartGetTokenRequest$0(str, bo7Var);
        }
    }
}
