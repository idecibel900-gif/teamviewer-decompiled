package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class j87 implements Parcelable {
    public static final Parcelable.Creator<j87> CREATOR = new xf5((byte) 9);
    public int m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int[] f1138o;
    public boolean p;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.m + ", mGapDir=" + this.n + ", mHasUnwantedGapAfter=" + this.p + ", mGapPerSpan=" + Arrays.toString(this.f1138o) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.m);
        parcel.writeInt(this.n);
        parcel.writeInt(this.p ? 1 : 0);
        int[] iArr = this.f1138o;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f1138o);
        }
    }
}
