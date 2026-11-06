package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class wp8 extends q2 {
    public static final Parcelable.Creator<wp8> CREATOR = new xf5((byte) 23);
    public final int m;
    public final w41 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final bq8 f2436o;

    public wp8(int i, w41 w41Var, bq8 bq8Var) {
        this.m = i;
        this.n = w41Var;
        this.f2436o = bq8Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB0 = et1.b0(parcel, 20293);
        et1.a0(parcel, 1, 4);
        parcel.writeInt(this.m);
        et1.W(parcel, 2, this.n, i);
        et1.W(parcel, 3, this.f2436o, i);
        et1.c0(parcel, iB0);
    }
}
