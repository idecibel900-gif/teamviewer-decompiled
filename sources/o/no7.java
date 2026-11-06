package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class no7 extends q2 {
    public static final Parcelable.Creator<no7> CREATOR = new xf5((byte) 18);
    public final int m;
    public List n;

    public no7(int i, List list) {
        this.m = i;
        this.n = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB0 = et1.b0(parcel, 20293);
        et1.a0(parcel, 1, 4);
        parcel.writeInt(this.m);
        et1.Z(parcel, 2, this.n);
        et1.c0(parcel, iB0);
    }
}
