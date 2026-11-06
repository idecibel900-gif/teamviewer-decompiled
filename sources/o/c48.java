package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class c48 extends fq5 {
    public static final Parcelable.Creator<c48> CREATOR = new xf5(15);
    public boolean m;

    public c48(Parcel parcel) {
        super(parcel);
        this.m = parcel.readInt() == 1;
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m ? 1 : 0);
    }
}
