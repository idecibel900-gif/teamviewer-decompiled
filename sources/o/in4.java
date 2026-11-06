package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class in4 extends m {
    public static final Parcelable.Creator<in4> CREATOR = new i57((byte) 3);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1081o;

    public in4(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            in4.class.getClassLoader();
        }
        this.f1081o = parcel.readInt() == 1;
    }

    @Override // o.m, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f1081o ? 1 : 0);
    }
}
