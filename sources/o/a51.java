package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class a51 extends q2 {
    public static final Parcelable.Creator<a51> CREATOR = new pq8((byte) 8);
    public final ef6 m;
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f299o;
    public final int[] p;
    public final int q;
    public final int[] r;

    public a51(ef6 ef6Var, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.m = ef6Var;
        this.n = z;
        this.f299o = z2;
        this.p = iArr;
        this.q = i;
        this.r = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB0 = et1.b0(parcel, 20293);
        et1.W(parcel, 1, this.m, i);
        et1.a0(parcel, 2, 4);
        parcel.writeInt(this.n ? 1 : 0);
        et1.a0(parcel, 3, 4);
        parcel.writeInt(this.f299o ? 1 : 0);
        int[] iArr = this.p;
        if (iArr != null) {
            int iB1 = et1.b0(parcel, 4);
            parcel.writeIntArray(iArr);
            et1.c0(parcel, iB1);
        }
        et1.a0(parcel, 5, 4);
        parcel.writeInt(this.q);
        int[] iArr2 = this.r;
        if (iArr2 != null) {
            int iB2 = et1.b0(parcel, 6);
            parcel.writeIntArray(iArr2);
            et1.c0(parcel, iB2);
        }
        et1.c0(parcel, iB0);
    }
}
