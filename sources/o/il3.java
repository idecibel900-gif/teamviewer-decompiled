package o;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class il3 implements Parcelable {
    public static final Parcelable.Creator<il3> CREATOR = new dq8((byte) 22);
    public final IntentSender m;
    public final Intent n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f1072o;
    public final int p;

    public il3(IntentSender intentSender, Intent intent, int i, int i2) {
        this.m = intentSender;
        this.n = intent;
        this.f1072o = i;
        this.p = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.m, i);
        parcel.writeParcelable(this.n, i);
        parcel.writeInt(this.f1072o);
        parcel.writeInt(this.p);
    }
}
