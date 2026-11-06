package o;

import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public abstract class yo8 extends Binder implements IInterface {
    public final /* synthetic */ byte c;

    public yo8(String str, byte b) {
        this.c = b;
        switch (b) {
            case 1:
                attachInterface(this, str);
                break;
            case 2:
                attachInterface(this, str);
                break;
            default:
                attachInterface(this, str);
                break;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        byte b = this.c;
        return this;
    }

    public abstract boolean f(Parcel parcel, int i);

    public boolean g(int i, Parcel parcel, Parcel parcel2) {
        boolean z = false;
        switch (i) {
            case 3:
                fp8.b(parcel);
                break;
            case 4:
                fp8.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                fp8.b(parcel);
                break;
            case 7:
                fp8.b(parcel);
                break;
            case 8:
                wp8 wp8Var = (wp8) fp8.a(parcel, wp8.CREATOR);
                fp8.b(parcel);
                ip8 ip8Var = (ip8) this;
                ip8Var.e.post(new it8((byte) 23, ip8Var, wp8Var, z));
                break;
            case ep1.b /* 9 */:
                fp8.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }

    public boolean h(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        boolean zOnTransact = false;
        Object[] objArr = 0;
        switch (this.c) {
            case 0:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return g(i, parcel, parcel2);
            case 1:
                if (i > 16777215) {
                    zOnTransact = super.onTransact(i, parcel, parcel2, i2);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                if (zOnTransact) {
                    return true;
                }
                return f(parcel, i);
            case 2:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return h(i, parcel, parcel2);
            default:
                if (i > 16777215) {
                    if (!super.onTransact(i, parcel, parcel2, i2)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                cv8 cv8Var = (cv8) this;
                if (i != 2) {
                    return false;
                }
                Parcelable.Creator creator = Bundle.CREATOR;
                int i3 = wr8.a;
                Bundle bundle = (Bundle) (parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel));
                int iDataAvail = parcel.dataAvail();
                if (iDataAvail > 0) {
                    throw new BadParcelableException(fx3.e(iDataAvail, "Parcel data not fully consumed, unread size: "));
                }
                cy8 cy8Var = cv8Var.f.a;
                if (cy8Var != null) {
                    do7 do7Var = cv8Var.e;
                    synchronized (cy8Var.f) {
                        cy8Var.e.remove(do7Var);
                        break;
                    }
                    cy8Var.a().post(new ox8(cy8Var, objArr == true ? 1 : 0));
                }
                cv8Var.d.a("onGetLaunchReviewFlowInfo", new Object[0]);
                cv8Var.e.c(new fq8((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
                return true;
        }
    }
}
