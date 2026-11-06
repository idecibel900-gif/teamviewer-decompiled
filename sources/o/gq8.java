package o;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.IGmsServiceBroker;

/* JADX INFO: loaded from: classes.dex */
public final class gq8 implements IGmsServiceBroker {
    public final IBinder c;

    public gq8(IBinder iBinder) {
        this.c = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.c;
    }

    @Override // com.google.android.gms.common.internal.IGmsServiceBroker
    public final void b(zs8 zs8Var, bz2 bz2Var) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(zs8Var);
            parcelObtain.writeInt(1);
            pq8.a(bz2Var, parcelObtain, 0);
            this.c.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
