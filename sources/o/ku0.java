package o;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class ku0 extends q2 {
    public static final Parcelable.Creator<ku0> CREATOR = new xf5((byte) 27);
    public final Intent m;

    public ku0(Intent intent) {
        this.m = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB0 = et1.b0(parcel, 20293);
        et1.W(parcel, 1, this.m, i);
        et1.c0(parcel, iB0);
    }
}
