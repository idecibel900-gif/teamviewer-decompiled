package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class f82 extends fq5 {
    public static final Parcelable.Creator<f82> CREATOR = new dq8((byte) 12);
    public String m;

    public f82(Parcel parcel) {
        super(parcel);
        this.m = parcel.readString();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.m);
    }
}
