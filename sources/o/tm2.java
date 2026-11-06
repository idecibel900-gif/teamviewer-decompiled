package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class tm2 implements Parcelable {
    public static final Parcelable.Creator<tm2> CREATOR = new dq8((byte) 15);
    public int m;
    public int n;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SavedState{mAnchorPosition=");
        sb.append(this.m);
        sb.append(", mAnchorOffset=");
        return e41.j(sb, this.n, '}');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.m);
        parcel.writeInt(this.n);
    }
}
