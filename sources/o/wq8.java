package o;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class wq8 extends uo8 implements yq8 {
    public final int e(int i, String str, String str2) {
        Parcel parcelC = c();
        parcelC.writeInt(i);
        parcelC.writeString(str);
        parcelC.writeString(str2);
        Parcel parcelD = d(parcelC, 1);
        int i2 = parcelD.readInt();
        parcelD.recycle();
        return i2;
    }

    public final int f(int i, String str, String str2, Bundle bundle) {
        Parcel parcelC = c();
        parcelC.writeInt(i);
        parcelC.writeString(str);
        parcelC.writeString(str2);
        int i2 = zq8.a;
        parcelC.writeInt(1);
        bundle.writeToParcel(parcelC, 0);
        Parcel parcelD = d(parcelC, 10);
        int i3 = parcelD.readInt();
        parcelD.recycle();
        return i3;
    }

    public final Bundle g(String str, String str2, String str3) {
        Parcel parcelC = c();
        parcelC.writeInt(3);
        parcelC.writeString(str);
        parcelC.writeString(str2);
        parcelC.writeString(str3);
        parcelC.writeString(null);
        Parcel parcelD = d(parcelC, 3);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) zq8.a(parcelD);
        parcelD.recycle();
        return bundle;
    }

    public final Bundle h(int i, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelC = c();
        parcelC.writeInt(i);
        parcelC.writeString(str);
        parcelC.writeString(str2);
        parcelC.writeString(str3);
        parcelC.writeString(null);
        int i2 = zq8.a;
        parcelC.writeInt(1);
        bundle.writeToParcel(parcelC, 0);
        Parcel parcelD = d(parcelC, 8);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) zq8.a(parcelD);
        parcelD.recycle();
        return bundle2;
    }

    public final Bundle i(String str, String str2, String str3) {
        Parcel parcelC = c();
        parcelC.writeInt(3);
        parcelC.writeString(str);
        parcelC.writeString(str2);
        parcelC.writeString(str3);
        Parcel parcelD = d(parcelC, 4);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) zq8.a(parcelD);
        parcelD.recycle();
        return bundle;
    }

    public final Bundle j(int i, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelC = c();
        parcelC.writeInt(i);
        parcelC.writeString(str);
        parcelC.writeString(str2);
        parcelC.writeString(str3);
        int i2 = zq8.a;
        parcelC.writeInt(1);
        bundle.writeToParcel(parcelC, 0);
        Parcel parcelD = d(parcelC, 11);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) zq8.a(parcelD);
        parcelD.recycle();
        return bundle2;
    }

    public final Bundle k(int i, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel parcelC = c();
        parcelC.writeInt(i);
        parcelC.writeString(str);
        parcelC.writeString(str2);
        int i2 = zq8.a;
        parcelC.writeInt(1);
        bundle.writeToParcel(parcelC, 0);
        parcelC.writeInt(1);
        bundle2.writeToParcel(parcelC, 0);
        Parcel parcelD = d(parcelC, 901);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle3 = (Bundle) zq8.a(parcelD);
        parcelD.recycle();
        return bundle3;
    }

    public final void l(String str, Bundle bundle, bs8 bs8Var) {
        Parcel parcelC = c();
        parcelC.writeInt(25);
        parcelC.writeString(str);
        int i = zq8.a;
        parcelC.writeInt(1);
        bundle.writeToParcel(parcelC, 0);
        parcelC.writeStrongBinder(bs8Var);
        try {
            this.d.transact(2101, parcelC, null, 1);
        } finally {
            parcelC.recycle();
        }
    }
}
