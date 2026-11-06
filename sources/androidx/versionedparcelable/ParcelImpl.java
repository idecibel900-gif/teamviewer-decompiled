package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import o.dq8;
import o.gd8;
import o.hd8;

/* JADX INFO: loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new dq8((byte) 28);
    public final hd8 m;

    public ParcelImpl(Parcel parcel) {
        this.m = new gd8(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new gd8(parcel).i(this.m);
    }
}
