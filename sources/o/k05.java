package o;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class k05 extends m {
    public static final Parcelable.Creator<k05> CREATOR = new ag5((byte) 4);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Bundle f1218o;

    public k05(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1218o = parcel.readBundle(classLoader == null ? k05.class.getClassLoader() : classLoader);
    }

    @Override // o.m, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeBundle(this.f1218o);
    }
}
