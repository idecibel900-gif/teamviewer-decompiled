package com.google.firebase.messaging;

import android.content.Intent;
import java.util.concurrent.ScheduledFuture;
import o.bo7;
import o.d85;
import o.ic1;
import o.t75;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements d85, ic1, t75 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    public /* synthetic */ b(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    @Override // o.ic1
    public Object j(bo7 bo7Var) {
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 1:
                return GmsRegistrationClient.lambda$registerInternal$3((String) obj, bo7Var);
            default:
                return ((GmsRpc) obj).lambda$extractResponseWhenComplete$0(bo7Var);
        }
    }

    @Override // o.t75
    public void m(bo7 bo7Var) {
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 3:
                WakeLockHolder.completeWakefulIntent((Intent) obj);
                break;
            case 4:
                ((WithinAppServiceConnection.BindRequest) obj).finish();
                break;
            default:
                ((ScheduledFuture) obj).cancel(false);
                break;
        }
    }

    @Override // o.d85
    public void onSuccess(Object obj) {
        ((FirebaseMessaging) this.n).lambda$new$4((TopicsSubscriber) obj);
    }
}
