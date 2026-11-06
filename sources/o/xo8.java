package o;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public final class xo8 extends com.google.android.gms.common.internal.a {
    @Override // com.google.android.gms.common.internal.a
    public final IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientNotificationTelemetryService");
        return iInterfaceQueryLocalInterface instanceof sp8 ? (sp8) iInterfaceQueryLocalInterface : new sp8(iBinder, "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService", (byte) 0);
    }

    @Override // com.google.android.gms.common.internal.a
    public final bi2[] d() {
        return kh.e0;
    }

    @Override // com.google.android.gms.common.internal.a
    public final int f() {
        return 253600000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String i() {
        return "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String j() {
        return "com.google.android.gms.common.telemetry.notification.service.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean k() {
        return true;
    }
}
