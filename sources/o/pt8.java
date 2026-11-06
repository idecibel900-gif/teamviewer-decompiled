package o;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.IGmsServiceBroker;

/* JADX INFO: loaded from: classes.dex */
public final class pt8 implements ServiceConnection {
    public final int a;
    public final /* synthetic */ com.google.android.gms.common.internal.a b;

    public pt8(com.google.android.gms.common.internal.a aVar, int i) {
        this.b = aVar;
        this.a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        byte b;
        int i;
        com.google.android.gms.common.internal.a aVar = this.b;
        if (iBinder == null) {
            synchronized (aVar.f) {
                b = aVar.m;
            }
            if (b == 3) {
                aVar.u = true;
                i = 5;
            } else {
                i = 4;
            }
            dr8 dr8Var = aVar.e;
            dr8Var.sendMessage(dr8Var.obtainMessage(i, aVar.w.get(), 16));
            return;
        }
        synchronized (aVar.g) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                aVar.h = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IGmsServiceBroker)) ? new gq8(iBinder) : (IGmsServiceBroker) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.common.internal.a aVar2 = this.b;
        int i2 = this.a;
        pu8 pu8Var = new pu8(aVar2, 0, null);
        dr8 dr8Var2 = aVar2.e;
        dr8Var2.sendMessage(dr8Var2.obtainMessage(7, i2, -1, pu8Var));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.common.internal.a aVar = this.b;
        synchronized (aVar.g) {
            aVar.h = null;
        }
        com.google.android.gms.common.internal.a aVar2 = this.b;
        int i = this.a;
        dr8 dr8Var = aVar2.e;
        dr8Var.sendMessage(dr8Var.obtainMessage(6, i, 1));
    }
}
