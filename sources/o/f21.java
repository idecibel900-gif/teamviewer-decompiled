package o;

import android.content.Context;
import android.content.Intent;
import com.google.firebase.messaging.FcmBroadcastProcessor;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f21 implements le7, ic1 {
    public final /* synthetic */ boolean m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f761o;

    public /* synthetic */ f21(Context context, Intent intent, boolean z) {
        this.n = context;
        this.f761o = intent;
        this.m = z;
    }

    @Override // o.le7
    public bo7 i(Object obj) {
        return ((ConfigCacheClient) this.n).lambda$put$1(this.m, (ConfigContainer) this.f761o, (Void) obj);
    }

    @Override // o.ic1
    public Object j(bo7 bo7Var) {
        return FcmBroadcastProcessor.lambda$startMessagingService$2((Context) this.n, (Intent) this.f761o, this.m, bo7Var);
    }

    public /* synthetic */ f21(ConfigCacheClient configCacheClient, boolean z, ConfigContainer configContainer) {
        this.n = configCacheClient;
        this.m = z;
        this.f761o = configContainer;
    }
}
