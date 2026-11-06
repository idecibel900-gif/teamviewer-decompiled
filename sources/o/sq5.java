package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* JADX INFO: loaded from: classes.dex */
public final class sq5 extends fq5 {
    public static final Parcelable.Creator<sq5> CREATOR = new xf5((byte) 6);
    public final int m;

    public sq5(Parcel parcel) {
        super(parcel);
        this.m = parcel.readInt();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m);
    }

    public sq5(int i) {
        super(AbsSavedState.EMPTY_STATE);
        this.m = i;
    }
}
