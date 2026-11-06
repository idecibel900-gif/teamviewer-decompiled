package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class r02 implements Parcelable {
    public static final q02 CREATOR = new q02();
    public final x02 m;
    public final p02 n;

    public r02(Parcel parcel) {
        this.m = new x02(parcel.readInt(), parcel.readInt());
        p02.CREATOR.getClass();
        this.n = (p02) p02.t.get(parcel.readInt());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r02)) {
            return false;
        }
        r02 r02Var = (r02) obj;
        return r02Var.n == this.n && im3.n(r02Var.m, this.m);
    }

    public final int hashCode() {
        return this.n.hashCode() + (this.m.hashCode() * 17);
    }

    public final String toString() {
        return this.m + " " + this.n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        x02 x02Var = this.m;
        parcel.writeInt(x02Var.m);
        parcel.writeInt(x02Var.n);
        parcel.writeParcelable(this.n, i);
    }

    public r02(x02 x02Var, p02 p02Var) {
        p02Var.getClass();
        this.m = x02Var;
        this.n = p02Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r02(gk7 gk7Var, p02 p02Var) {
        this(gk7Var.H0(), p02Var);
        p02Var.getClass();
    }
}
