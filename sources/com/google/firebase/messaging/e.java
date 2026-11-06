package com.google.firebase.messaging;

import o.bo7;
import o.ic1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements ic1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ GmsRegistrationClient n;

    public /* synthetic */ e(GmsRegistrationClient gmsRegistrationClient, byte b) {
        this.m = b;
        this.n = gmsRegistrationClient;
    }

    @Override // o.ic1
    public final Object j(bo7 bo7Var) {
        byte b = this.m;
        GmsRegistrationClient gmsRegistrationClient = this.n;
        switch (b) {
            case 0:
                return gmsRegistrationClient.lambda$unregisterOverV1$5(bo7Var);
            default:
                return gmsRegistrationClient.lambda$register$2(bo7Var);
        }
    }
}
