package o;

import android.os.BadParcelableException;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class ws8 extends yo8 {
    public final sx8 d;

    public ws8(sx8 sx8Var) {
        super("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideServiceCallback", (byte) 1);
        this.d = sx8Var;
    }

    @Override // o.yo8
    public final boolean f(Parcel parcel, int i) {
        if (i != 1) {
            return false;
        }
        int i2 = parcel.readInt();
        int i3 = zq8.a;
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(fx3.e(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
        this.d.a(Integer.valueOf(i2));
        return true;
    }
}
