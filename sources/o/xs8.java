package o;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public final class xs8 implements ServiceConnection {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xs8(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        gr8 ar8Var;
        switch (this.a) {
            case 0:
                tr8.g("BillingClientTesting", "Billing Override Service connected.");
                ft8 ft8Var = (ft8) this.b;
                int i = br8.d;
                if (iBinder == null) {
                    ar8Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
                    ar8Var = iInterfaceQueryLocalInterface instanceof gr8 ? (gr8) iInterfaceQueryLocalInterface : new ar8(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", (byte) 1);
                }
                ft8Var.H = ar8Var;
                ft8Var.G = (byte) 2;
                ft8Var.J(26);
                break;
            default:
                cy8 cy8Var = (cy8) this.b;
                cy8Var.b.a("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                cy8Var.a().post(new gu8(this, iBinder));
                break;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.a) {
            case 0:
                tr8.h("BillingClientTesting", "Billing Override Service disconnected.");
                ft8 ft8Var = (ft8) this.b;
                ft8Var.H = null;
                ft8Var.G = (byte) 0;
                break;
            default:
                cy8 cy8Var = (cy8) this.b;
                cy8Var.b.a("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                cy8Var.a().post(new ox8(this, (byte) 1));
                break;
        }
    }
}
