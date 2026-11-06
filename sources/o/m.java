package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public abstract class m implements Parcelable {
    public final Parcelable m;
    public static final l n = new l();
    public static final Parcelable.Creator<m> CREATOR = new ag5(1);

    public m(Parcelable parcelable) {
        if (parcelable != null) {
            this.m = parcelable == n ? null : parcelable;
        } else {
            hk0.g("superState must not be null");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.m, i);
    }

    public m() {
        this.m = null;
    }

    public m(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.m = parcelable == null ? n : parcelable;
    }
}
