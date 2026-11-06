package o;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class zp8 extends com.google.android.gms.common.internal.a {
    public final oo7 z;

    public zp8(Context context, Looper looper, io.sentry.android.core.d dVar, oo7 oo7Var, ap8 ap8Var, ap8 ap8Var2) {
        super(context, looper, 270, dVar, ap8Var, ap8Var2);
        this.z = oo7Var;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof up8 ? (up8) iInterfaceQueryLocalInterface : new up8(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", (byte) 0);
    }

    @Override // com.google.android.gms.common.internal.a
    public final bi2[] d() {
        return kh.e0;
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle e() {
        this.z.getClass();
        return new Bundle();
    }

    @Override // com.google.android.gms.common.internal.a
    public final int f() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String i() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String j() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean k() {
        return true;
    }
}
