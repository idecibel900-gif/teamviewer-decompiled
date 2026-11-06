package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class nu2 implements Parcelable {
    public static final Parcelable.Creator<nu2> CREATOR = new dq8((byte) 16);
    public String m;
    public int n;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.m);
        parcel.writeInt(this.n);
    }
}
