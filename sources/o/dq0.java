package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class dq0 extends m {
    public static final Parcelable.Creator<dq0> CREATOR = new ag5(2);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f644o;

    public dq0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f644o = parcel.readInt() == 1;
    }

    @Override // o.m, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f644o ? 1 : 0);
    }
}
