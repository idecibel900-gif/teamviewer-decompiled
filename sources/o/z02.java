package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class z02 implements Parcelable {
    public static final Parcelable.Creator<z02> CREATOR = new dq8((byte) 11);
    public final String m;
    public final r02 n;

    public z02(Parcel parcel) {
        this.m = parcel.readString();
        Parcelable parcelableP = yo1.P(parcel, z02.class.getClassLoader(), r02.class);
        parcelableP.getClass();
        this.n = (r02) parcelableP;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof z02) && this.n.equals(((z02) obj).n);
        }
        return true;
    }

    public final int hashCode() {
        return this.n.hashCode();
    }

    public final String toString() {
        return this.n + " " + this.m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.m);
        parcel.writeParcelable(this.n, i);
    }

    public z02(String str, r02 r02Var) {
        this.m = str;
        this.n = r02Var;
    }
}
