package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class dr4 extends q2 {
    public static final Parcelable.Creator<dr4> CREATOR = new xf5(24);
    public final int m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f647o;
    public final long p;
    public final long q;
    public final String r;
    public final String s;
    public final int t;
    public final int u;

    public dr4(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.m = i;
        this.n = i2;
        this.f647o = i3;
        this.p = j;
        this.q = j2;
        this.r = str;
        this.s = str2;
        this.t = i4;
        this.u = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB0 = et1.b0(parcel, 20293);
        et1.a0(parcel, 1, 4);
        parcel.writeInt(this.m);
        et1.a0(parcel, 2, 4);
        parcel.writeInt(this.n);
        et1.a0(parcel, 3, 4);
        parcel.writeInt(this.f647o);
        et1.a0(parcel, 4, 8);
        parcel.writeLong(this.p);
        et1.a0(parcel, 5, 8);
        parcel.writeLong(this.q);
        et1.X(parcel, 6, this.r);
        et1.X(parcel, 7, this.s);
        et1.a0(parcel, 8, 4);
        parcel.writeInt(this.t);
        et1.a0(parcel, 9, 4);
        parcel.writeInt(this.u);
        et1.c0(parcel, iB0);
    }
}
