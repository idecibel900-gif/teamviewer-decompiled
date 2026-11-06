package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class jz7 extends m {
    public static final Parcelable.Creator<jz7> CREATOR = new ag5((byte) 7);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1216o;
    public boolean p;

    public jz7(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1216o = parcel.readInt();
        this.p = parcel.readInt() != 0;
    }

    @Override // o.m, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f1216o);
        parcel.writeInt(this.p ? 1 : 0);
    }
}
