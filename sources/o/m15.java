package o;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class m15 extends m {
    public static final Parcelable.Creator<m15> CREATOR = new i57((byte) 4);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Bundle f1426o;

    public m15(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1426o = parcel.readBundle(classLoader);
    }

    @Override // o.m, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeBundle(this.f1426o);
    }
}
