package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class mt extends View.BaseSavedState {
    public static final Parcelable.Creator<mt> CREATOR = new dq8((byte) 3);
    public boolean m;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.m ? (byte) 1 : (byte) 0);
    }
}
