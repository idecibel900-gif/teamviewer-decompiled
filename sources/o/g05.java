package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class g05 implements Parcelable {
    public static final Parcelable.Creator<g05> CREATOR = new dq8((byte) 26);
    public int m;
    public cg5 n;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.m);
        parcel.writeParcelable(this.n, 0);
    }
}
