package o;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class zs8 extends yo8 {
    public com.google.android.gms.common.internal.a d;
    public final int e;

    public zs8(com.google.android.gms.common.internal.a aVar, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", (byte) 2);
        this.d = aVar;
        this.e = i;
    }

    @Override // o.yo8
    public final boolean h(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int i2 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) sr8.a(parcel, Bundle.CREATOR);
            sr8.b(parcel);
            nv1.t(this.d, "onPostInitComplete can be called only once per call to getRemoteService");
            com.google.android.gms.common.internal.a aVar = this.d;
            int i3 = this.e;
            aVar.getClass();
            eu8 eu8Var = new eu8(aVar, i2, strongBinder, bundle);
            dr8 dr8Var = aVar.e;
            dr8Var.sendMessage(dr8Var.obtainMessage(1, i3, -1, eu8Var));
            this.d = null;
        } else if (i == 2) {
            parcel.readInt();
            sr8.b(parcel);
            io.sentry.android.core.v0.m("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int i4 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            xv8 xv8Var = (xv8) sr8.a(parcel, xv8.CREATOR);
            sr8.b(parcel);
            com.google.android.gms.common.internal.a aVar2 = this.d;
            nv1.t(aVar2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            nv1.s(xv8Var);
            aVar2.v = xv8Var;
            if (aVar2 instanceof at8) {
                a51 a51Var = xv8Var.p;
                df6 df6VarR = df6.r();
                ef6 ef6Var = a51Var == null ? null : a51Var.m;
                synchronized (df6VarR) {
                    try {
                        if (ef6Var == null) {
                            ef6Var = df6.p;
                        } else {
                            ef6 ef6Var2 = (ef6) df6VarR.n;
                            if (ef6Var2 == null || ef6Var2.m < ef6Var.m) {
                            }
                        }
                        df6VarR.n = ef6Var;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            Bundle bundle2 = xv8Var.m;
            nv1.t(this.d, "onPostInitComplete can be called only once per call to getRemoteService");
            com.google.android.gms.common.internal.a aVar3 = this.d;
            int i5 = this.e;
            aVar3.getClass();
            eu8 eu8Var2 = new eu8(aVar3, i4, strongBinder2, bundle2);
            dr8 dr8Var2 = aVar3.e;
            dr8Var2.sendMessage(dr8Var2.obtainMessage(1, i5, -1, eu8Var2));
            this.d = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
