package o;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class xv8 extends q2 {
    public static final Parcelable.Creator<xv8> CREATOR = new pq8((byte) 7);
    public Bundle m;
    public bi2[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2555o;
    public a51 p;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB0 = et1.b0(parcel, 20293);
        et1.V(parcel, 1, this.m);
        et1.Y(parcel, 2, this.n, i);
        int i2 = this.f2555o;
        et1.a0(parcel, 3, 4);
        parcel.writeInt(i2);
        et1.W(parcel, 4, this.p, i);
        et1.c0(parcel, iB0);
    }
}
