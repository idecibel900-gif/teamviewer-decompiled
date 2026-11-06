package o;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class sf2 extends m {
    public static final Parcelable.Creator<sf2> CREATOR = new ag5((byte) 3);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a07 f2015o;

    public sf2(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i = parcel.readInt();
        String[] strArr = new String[i];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[i];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f2015o = new a07(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.f2015o.put(strArr[i2], bundleArr[i2]);
        }
    }

    public final String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f2015o + "}";
    }

    @Override // o.m, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        a07 a07Var = this.f2015o;
        int i2 = a07Var.f278o;
        parcel.writeInt(i2);
        String[] strArr = new String[i2];
        Bundle[] bundleArr = new Bundle[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = (String) a07Var.f(i3);
            bundleArr[i3] = (Bundle) a07Var.i(i3);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public sf2(Parcelable parcelable) {
        super(parcelable);
        this.f2015o = new a07(0);
    }
}
