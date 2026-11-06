package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class y10 implements Parcelable {
    public static final Parcelable.Creator<y10> CREATOR = new dq8((byte) 6);
    public final ArrayList m;
    public final ArrayList n;

    public y10(Parcel parcel) {
        this.m = parcel.createStringArrayList();
        this.n = parcel.createTypedArrayList(x10.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.m);
        parcel.writeTypedList(this.n);
    }
}
