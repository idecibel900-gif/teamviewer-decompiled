package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class bc4 extends fq5 {
    public static final Parcelable.Creator<bc4> CREATOR = new dq8((byte) 24);
    public String m;

    public bc4(Parcel parcel) {
        super(parcel);
        this.m = parcel.readString();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.m);
    }
}
