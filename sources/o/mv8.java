package o;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class mv8 extends Binder implements IInterface {
    public final /* synthetic */ do7 c;

    public mv8(yp8 yp8Var, do7 do7Var) {
        this.c = do7Var;
        Objects.requireNonNull(yp8Var);
        attachInterface(this, "com.google.android.gms.cloudmessaging.internal.IRegisterCallback");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        int i3 = rr8.a;
        Status statusCreateFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
        String string = parcel.readString();
        hr hrVarCreateFromParcel = parcel.readInt() != 0 ? hr.CREATOR.createFromParcel(parcel) : null;
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(iDataAvail).length() + 45);
            sb.append("Parcel data not fully consumed, unread size: ");
            sb.append(iDataAvail);
            throw new BadParcelableException(sb.toString());
        }
        int i4 = statusCreateFromParcel.m;
        do7 do7Var = this.c;
        if (i4 <= 0) {
            do7Var.a(string);
            return true;
        }
        do7Var.a.n(statusCreateFromParcel.f34o != null ? new nb6(statusCreateFromParcel) : new br(statusCreateFromParcel));
        return true;
    }
}
