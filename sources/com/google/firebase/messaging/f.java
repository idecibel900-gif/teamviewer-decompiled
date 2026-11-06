package com.google.firebase.messaging;

import java.util.concurrent.ExecutorService;
import o.bo7;
import o.ic1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements ic1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ GmsRegistrationClient n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ExecutorService f53o;

    public /* synthetic */ f(GmsRegistrationClient gmsRegistrationClient, ExecutorService executorService, byte b) {
        this.m = b;
        this.n = gmsRegistrationClient;
        this.f53o = executorService;
    }

    @Override // o.ic1
    public final Object j(bo7 bo7Var) {
        byte b = this.m;
        ExecutorService executorService = this.f53o;
        GmsRegistrationClient gmsRegistrationClient = this.n;
        switch (b) {
            case 0:
                return gmsRegistrationClient.lambda$registerInternal$4(executorService, bo7Var);
            default:
                return gmsRegistrationClient.lambda$fetchFidCredentials$1(executorService, bo7Var);
        }
    }
}
