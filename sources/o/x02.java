package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class x02 implements Parcelable {
    public static final w02 CREATOR = new w02();
    public final int m;
    public final int n;

    public x02(Parcel parcel) {
        this.m = parcel.readInt();
        this.n = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x02) {
            x02 x02Var = (x02) obj;
            if (this.m == x02Var.m && this.n == x02Var.n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.m * 31) + this.n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.m);
        parcel.writeInt(this.n);
    }

    public x02(int i, int i2) {
        this.m = i;
        this.n = i2;
    }
}
