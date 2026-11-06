package o;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class eu8 extends eq8 {
    public final IBinder g;
    public final /* synthetic */ com.google.android.gms.common.internal.a h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eu8(com.google.android.gms.common.internal.a aVar, int i, IBinder iBinder, Bundle bundle) {
        super(aVar, i, bundle);
        this.h = aVar;
        this.g = iBinder;
    }

    @Override // o.eq8
    public final boolean a() {
        IBinder iBinder = this.g;
        try {
            nv1.s(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            com.google.android.gms.common.internal.a aVar = this.h;
            if (!aVar.i().equals(interfaceDescriptor)) {
                String strI = aVar.i();
                io.sentry.android.core.v0.j("GmsClient", e41.m(new StringBuilder(strI.length() + 34 + String.valueOf(interfaceDescriptor).length()), "service descriptor mismatch: ", strI, " vs. ", interfaceDescriptor));
                return false;
            }
            IInterface iInterfaceA = aVar.a(iBinder);
            if (iInterfaceA == null || !(aVar.o(2, 4, iInterfaceA) || aVar.o(3, 4, iInterfaceA))) {
                return false;
            }
            aVar.t = null;
            hj8 hj8Var = aVar.n;
            if (hj8Var == null) {
                return true;
            }
            ((tz2) hj8Var.n).e();
            return true;
        } catch (RemoteException unused) {
            io.sentry.android.core.v0.j("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // o.eq8
    public final void b(w41 w41Var) {
        hj8 hj8Var = this.h.f35o;
        if (hj8Var != null) {
            ((uz2) hj8Var.n).c(w41Var);
        }
        System.currentTimeMillis();
    }
}
