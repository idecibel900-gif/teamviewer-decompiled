package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class x88 extends q2 {
    public static final Parcelable.Creator<x88> CREATOR = new xf5((byte) 29);
    public final String m;
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f2492o;
    public final String p;

    public x88(String str, String str2, String str3, String str4) {
        this.m = str;
        this.n = str2;
        this.f2492o = str3;
        this.p = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB0 = et1.b0(parcel, 20293);
        et1.X(parcel, 1, this.m);
        et1.X(parcel, 2, this.n);
        et1.X(parcel, 3, this.f2492o);
        et1.X(parcel, 4, this.p);
        et1.c0(parcel, iB0);
    }
}
