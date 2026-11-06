package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class h96 extends q2 {
    public static final Parcelable.Creator<h96> CREATOR = new pq8((byte) 10);
    public final String m;
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f960o;
    public final String p;
    public final String q;
    public int r;
    public final String s;

    public h96(int i, String str, String str2, String str3, String str4, String str5, String str6) {
        this.m = str;
        this.n = str2;
        this.f960o = str3;
        this.p = str4;
        this.q = str5;
        this.r = i;
        this.s = str6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB0 = et1.b0(parcel, 20293);
        et1.X(parcel, 1, this.m);
        et1.X(parcel, 2, this.n);
        et1.X(parcel, 3, this.f960o);
        et1.X(parcel, 4, this.p);
        et1.X(parcel, 5, this.q);
        int i2 = this.r;
        et1.a0(parcel, 6, 4);
        parcel.writeInt(i2);
        et1.X(parcel, 7, this.s);
        et1.c0(parcel, iB0);
    }

    public h96(String str, String str2, String str3, String str4, String str5) {
        this.m = str;
        this.n = str2;
        this.f960o = str3;
        this.p = str4;
        this.q = str5;
        this.s = "fcm-25.1.3";
    }
}
