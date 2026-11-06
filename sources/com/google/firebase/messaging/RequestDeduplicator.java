package com.google.firebase.messaging;

import android.util.Log;
import java.util.Map;
import java.util.concurrent.Executor;
import o.bo7;
import o.hy8;
import o.vw;

/* JADX INFO: loaded from: classes.dex */
class RequestDeduplicator {
    private final Executor executor;
    private final Map<String, bo7> getTokenRequests = new vw(0);

    public interface GetTokenRequest {
    }

    public RequestDeduplicator(Executor executor) {
        this.executor = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ bo7 lambda$getOrStartGetTokenRequest$0(String str, bo7 bo7Var) {
        synchronized (this) {
            this.getTokenRequests.remove(str);
        }
        return bo7Var;
    }

    public synchronized bo7 getOrStartGetTokenRequest(String str, GetTokenRequest getTokenRequest) {
        bo7 bo7Var = this.getTokenRequests.get(str);
        if (bo7Var != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + str);
            }
            return bo7Var;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Making new request for: " + str);
        }
        a aVar = (a) getTokenRequest;
        hy8 hy8VarG = aVar.m.lambda$blockingRegister$17(aVar.n, aVar.f51o, aVar.p).g(this.executor, new g((byte) 1, this, str));
        this.getTokenRequests.put(str, hy8VarG);
        return hy8VarG;
    }
}
