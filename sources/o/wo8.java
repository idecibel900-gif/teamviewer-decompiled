package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class wo8 extends q2 {
    public static final Parcelable.Creator<wo8> CREATOR = new xf5((byte) 21);
    public final int m;
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f2435o;
    public final int p;
    public final boolean q;

    public wo8(int i, String str, long j, int i2, boolean z) {
        this.m = i;
        this.n = str;
        this.f2435o = j;
        this.p = i2;
        this.q = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB0 = et1.b0(parcel, 20293);
        et1.a0(parcel, 1, 4);
        parcel.writeInt(this.m);
        et1.X(parcel, 2, this.n);
        et1.a0(parcel, 3, 8);
        parcel.writeLong(this.f2435o);
        et1.a0(parcel, 4, 4);
        parcel.writeInt(this.p);
        et1.a0(parcel, 5, 4);
        parcel.writeInt(this.q ? 1 : 0);
        et1.c0(parcel, iB0);
    }
}
