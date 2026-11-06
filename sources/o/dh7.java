package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class dh7 extends View.BaseSavedState {
    public static final Parcelable.Creator<dh7> CREATOR = new xf5((byte) 11);
    public final boolean m;

    public dh7(Parcel parcel) {
        super(parcel);
        this.m = parcel.readByte() != 0;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.m ? (byte) 1 : (byte) 0);
    }

    public dh7(Parcelable parcelable, boolean z) {
        super(parcelable);
        this.m = z;
    }
}
