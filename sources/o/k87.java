package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class k87 implements Parcelable {
    public static final Parcelable.Creator<k87> CREATOR = new xf5((byte) 10);
    public int m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1238o;
    public int[] p;
    public int q;
    public int[] r;
    public ArrayList s;
    public boolean t;
    public boolean u;
    public boolean v;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.m);
        parcel.writeInt(this.n);
        parcel.writeInt(this.f1238o);
        if (this.f1238o > 0) {
            parcel.writeIntArray(this.p);
        }
        parcel.writeInt(this.q);
        if (this.q > 0) {
            parcel.writeIntArray(this.r);
        }
        parcel.writeInt(this.t ? 1 : 0);
        parcel.writeInt(this.u ? 1 : 0);
        parcel.writeInt(this.v ? 1 : 0);
        parcel.writeList(this.s);
    }
}
