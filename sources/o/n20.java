package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class n20 implements Parcelable {
    public static final Parcelable.Creator<n20> CREATOR = new dq8((byte) 7);
    public int m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1534o;
    public int p;
    public int q;
    public String r;
    public int s;
    public int t;
    public int u;
    public boolean v;
    public int w;
    public int x;
    public int y;
    public int z;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.m);
        parcel.writeInt(this.n);
        parcel.writeInt(this.f1534o);
        parcel.writeInt(this.p);
        parcel.writeInt(this.q);
        parcel.writeString(this.r.toString());
        parcel.writeInt(this.s);
        parcel.writeInt(this.u);
        parcel.writeInt(this.w);
        parcel.writeInt(this.x);
        parcel.writeInt(this.y);
        parcel.writeInt(this.z);
        parcel.writeInt(this.v ? 1 : 0);
    }
}
