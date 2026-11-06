package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class v66 extends m {
    public static final Parcelable.Creator<v66> CREATOR = new i57((byte) 5);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Parcelable f2280o;

    public v66(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2280o = parcel.readParcelable(classLoader == null ? androidx.recyclerview.widget.a.class.getClassLoader() : classLoader);
    }

    @Override // o.m, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f2280o, 0);
    }
}
