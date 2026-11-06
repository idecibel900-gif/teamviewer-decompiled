package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class h33 implements k33 {
    public static final Parcelable.Creator<h33> CREATOR = new dq8((byte) 19);
    public final int m;

    public h33(int i) {
        this.m = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h33) && this.m == ((h33) obj).m;
    }

    public final int hashCode() {
        return Integer.hashCode(this.m);
    }

    public final String toString() {
        return fx3.f(this.m, "AllManagedDevices(id=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.m);
    }
}
