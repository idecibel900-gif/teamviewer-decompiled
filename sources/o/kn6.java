package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class kn6 extends fq5 {
    public static final Parcelable.Creator<kn6> CREATOR = new xf5((byte) 7);
    public int m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1283o;

    public kn6(Parcel parcel) {
        super(parcel);
        this.m = parcel.readInt();
        this.n = parcel.readInt();
        this.f1283o = parcel.readInt();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m);
        parcel.writeInt(this.n);
        parcel.writeInt(this.f1283o);
    }
}
