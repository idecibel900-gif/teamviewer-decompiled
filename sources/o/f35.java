package o;

import android.content.Context;
import android.net.ConnectivityManager;

/* JADX INFO: loaded from: classes.dex */
public final class f35 extends l61 {
    public final ConnectivityManager f;
    public final Object g;
    public volatile boolean h;
    public final io.sentry.android.core.internal.util.b i;

    public f35(Context context, yc4 yc4Var) {
        super(context, yc4Var);
        Object systemService = this.b.getSystemService("connectivity");
        systemService.getClass();
        this.f = (ConnectivityManager) systemService;
        this.g = new Object();
        this.i = new io.sentry.android.core.internal.util.b(this, (byte) 2);
    }

    @Override // o.l61
    public final Object a() {
        return e35.a(this.f, this.h);
    }

    @Override // o.l61
    public final void c() {
        try {
            we4.f().c(e35.a, "Registering network callback");
            ConnectivityManager connectivityManager = this.f;
            io.sentry.android.core.internal.util.b bVar = this.i;
            connectivityManager.getClass();
            bVar.getClass();
            connectivityManager.registerDefaultNetworkCallback(bVar);
        } catch (IllegalArgumentException e) {
            we4.f().e(e35.a, "Received exception while registering network callback", e);
        } catch (SecurityException e2) {
            we4.f().e(e35.a, "Received exception while registering network callback", e2);
        }
    }

    @Override // o.l61
    public final void d() {
        try {
            we4.f().c(e35.a, "Unregistering network callback");
            this.f.unregisterNetworkCallback(this.i);
        } catch (IllegalArgumentException e) {
            we4.f().e(e35.a, "Received exception while unregistering network callback", e);
        } catch (SecurityException e2) {
            we4.f().e(e35.a, "Received exception while unregistering network callback", e2);
        }
    }
}
