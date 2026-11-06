package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.PowerManager;

/* JADX INFO: loaded from: classes.dex */
public final class p12 extends BroadcastReceiver {
    public final /* synthetic */ byte a = 0;
    public Object b;
    public final Object c;

    public p12(PowerManager powerManager, q12 q12Var) {
        this.b = powerManager;
        this.c = q12Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.a) {
            case 0:
                context.getClass();
                intent.getClass();
                if (((PowerManager) this.b).isDeviceIdleMode()) {
                    ye4.a("DirectNetworkControlMethod", "Idle mode activated.");
                    ((q12) this.c).D();
                    return;
                }
                return;
            default:
                Uri data = intent.getData();
                if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
                    throw null;
                }
                return;
        }
    }

    public p12(lh7 lh7Var) {
        this.c = lh7Var;
    }
}
