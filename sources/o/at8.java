package o;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public final class at8 extends com.google.android.gms.common.internal.a {
    @Override // com.google.android.gms.common.internal.a
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cloudmessaging.internal.ICloudMessagingService");
        return iInterfaceQueryLocalInterface instanceof qt8 ? (qt8) iInterfaceQueryLocalInterface : new qt8(iBinder);
    }

    @Override // com.google.android.gms.common.internal.a
    public final bi2[] d() {
        return qf0.u;
    }

    @Override // com.google.android.gms.common.internal.a
    public final int f() {
        return 261200000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String i() {
        return "com.google.android.gms.cloudmessaging.internal.ICloudMessagingService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String j() {
        return "com.google.android.gms.cloudmessaging.service.START";
    }
}
