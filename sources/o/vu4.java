package o;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: loaded from: classes.dex */
public final class vu4 extends Binder implements xb3 {
    public final /* synthetic */ MultiInstanceInvalidationService c;

    public vu4(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.c = multiInstanceInvalidationService;
        attachInterface(this, xb3.b);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        wu4 wu4Var;
        String str = xb3.b;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        int i3 = 0;
        wb3 wb3Var = null;
        wb3 wb3Var2 = null;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(wb3.a);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof wb3)) {
                    vb3 vb3Var = new vb3();
                    vb3Var.c = strongBinder;
                    wb3Var = vb3Var;
                } else {
                    wb3Var = (wb3) iInterfaceQueryLocalInterface;
                }
            }
            String string = parcel.readString();
            wb3Var.getClass();
            if (string != null) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.c;
                synchronized (multiInstanceInvalidationService.f25o) {
                    try {
                        int i4 = multiInstanceInvalidationService.m + 1;
                        multiInstanceInvalidationService.m = i4;
                        if (multiInstanceInvalidationService.f25o.register(wb3Var, Integer.valueOf(i4))) {
                            multiInstanceInvalidationService.n.put(Integer.valueOf(i4), string);
                            i3 = i4;
                        } else {
                            multiInstanceInvalidationService.m--;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            parcel2.writeNoException();
            parcel2.writeInt(i3);
            return true;
        }
        if (i == 2) {
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(wb3.a);
                if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof wb3)) {
                    vb3 vb3Var2 = new vb3();
                    vb3Var2.c = strongBinder2;
                    wb3Var2 = vb3Var2;
                } else {
                    wb3Var2 = (wb3) iInterfaceQueryLocalInterface2;
                }
            }
            int i5 = parcel.readInt();
            wb3Var2.getClass();
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.c;
            synchronized (multiInstanceInvalidationService2.f25o) {
                multiInstanceInvalidationService2.f25o.unregister(wb3Var2);
            }
            parcel2.writeNoException();
            return true;
        }
        if (i != 3) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        int i6 = parcel.readInt();
        String[] strArrCreateStringArray = parcel.createStringArray();
        strArrCreateStringArray.getClass();
        MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.c;
        synchronized (multiInstanceInvalidationService3.f25o) {
            String str2 = (String) multiInstanceInvalidationService3.n.get(Integer.valueOf(i6));
            if (str2 == null) {
                io.sentry.android.core.v0.j("ROOM", "Remote invalidation client ID not registered");
            } else {
                int iBeginBroadcast = multiInstanceInvalidationService3.f25o.beginBroadcast();
                while (true) {
                    wu4Var = multiInstanceInvalidationService3.f25o;
                    if (i3 >= iBeginBroadcast) {
                        break;
                    }
                    try {
                        Object broadcastCookie = wu4Var.getBroadcastCookie(i3);
                        broadcastCookie.getClass();
                        Integer num = (Integer) broadcastCookie;
                        int iIntValue = num.intValue();
                        String str3 = (String) multiInstanceInvalidationService3.n.get(num);
                        if (i6 != iIntValue && str2.equals(str3)) {
                            try {
                                ((wb3) multiInstanceInvalidationService3.f25o.getBroadcastItem(i3)).a(strArrCreateStringArray);
                            } catch (RemoteException e) {
                                io.sentry.android.core.v0.l("ROOM", "Error invoking a remote callback", e);
                            }
                        }
                        i3++;
                    } catch (Throwable th2) {
                        multiInstanceInvalidationService3.f25o.finishBroadcast();
                        throw th2;
                    }
                }
                wu4Var.finishBroadcast();
            }
        }
        return true;
    }
}
