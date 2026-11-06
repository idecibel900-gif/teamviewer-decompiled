package o;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class to8 extends q2 {
    public static final Parcelable.Creator<to8> CREATOR = new xf5((byte) 19);
    public final int m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Intent f2131o;

    public to8(int i, int i2, Intent intent) {
        this.m = i;
        this.n = i2;
        this.f2131o = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB0 = et1.b0(parcel, 20293);
        et1.a0(parcel, 1, 4);
        parcel.writeInt(this.m);
        et1.a0(parcel, 2, 4);
        parcel.writeInt(this.n);
        et1.W(parcel, 3, this.f2131o, i);
        et1.c0(parcel, iB0);
    }
}
