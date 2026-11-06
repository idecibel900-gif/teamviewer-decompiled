package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public abstract class od6 implements Parcelable {
    public static final Parcelable.Creator<od6> CREATOR = new pq8(2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fq8 fq8Var = (fq8) this;
        parcel.writeParcelable(fq8Var.m, 0);
        parcel.writeInt(fq8Var.n ? 1 : 0);
    }
}
