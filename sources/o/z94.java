package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class z94 implements Parcelable {
    public static final Parcelable.Creator<z94> CREATOR = new dq8((byte) 23);
    public int m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f2682o;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.m);
        parcel.writeInt(this.n);
        parcel.writeInt(this.f2682o ? 1 : 0);
    }
}
