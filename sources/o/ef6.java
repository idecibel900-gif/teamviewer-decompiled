package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class ef6 extends q2 {
    public static final Parcelable.Creator<ef6> CREATOR = new pq8((byte) 0);
    public final int m;
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f709o;
    public final int p;
    public final int q;

    public ef6(int i, boolean z, boolean z2, int i2, int i3) {
        this.m = i;
        this.n = z;
        this.f709o = z2;
        this.p = i2;
        this.q = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB0 = et1.b0(parcel, 20293);
        et1.a0(parcel, 1, 4);
        parcel.writeInt(this.m);
        et1.a0(parcel, 2, 4);
        parcel.writeInt(this.n ? 1 : 0);
        et1.a0(parcel, 3, 4);
        parcel.writeInt(this.f709o ? 1 : 0);
        et1.a0(parcel, 4, 4);
        parcel.writeInt(this.p);
        et1.a0(parcel, 5, 4);
        parcel.writeInt(this.q);
        et1.c0(parcel, iB0);
    }
}
