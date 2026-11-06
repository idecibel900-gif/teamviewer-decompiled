package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class tu2 implements Parcelable {
    public static final Parcelable.Creator<tu2> CREATOR = new dq8((byte) 17);
    public ArrayList m;
    public ArrayList n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public x10[] f2144o;
    public int p;
    public String q;
    public ArrayList r;
    public ArrayList s;
    public ArrayList t;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.m);
        parcel.writeStringList(this.n);
        parcel.writeTypedArray(this.f2144o, i);
        parcel.writeInt(this.p);
        parcel.writeString(this.q);
        parcel.writeStringList(this.r);
        parcel.writeTypedList(this.s);
        parcel.writeTypedList(this.t);
    }
}
