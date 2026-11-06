package o;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class bq8 extends q2 {
    public static final Parcelable.Creator<bq8> CREATOR = new xf5((byte) 26);
    public final int m;
    public final IBinder n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final w41 f446o;
    public final boolean p;
    public final boolean q;

    public bq8(int i, IBinder iBinder, w41 w41Var, boolean z, boolean z2) {
        this.m = i;
        this.n = iBinder;
        this.f446o = w41Var;
        this.p = z;
        this.q = z2;
    }

    public final boolean equals(Object obj) {
        Object ay8Var;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bq8)) {
            return false;
        }
        bq8 bq8Var = (bq8) obj;
        if (!this.f446o.equals(bq8Var.f446o)) {
            return false;
        }
        Object ay8Var2 = null;
        IBinder iBinder = this.n;
        if (iBinder == null) {
            ay8Var = null;
        } else {
            int i = q4.d;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("o.l93");
            ay8Var = iInterfaceQueryLocalInterface instanceof l93 ? (l93) iInterfaceQueryLocalInterface : new ay8(iBinder);
        }
        IBinder iBinder2 = bq8Var.n;
        if (iBinder2 != null) {
            int i2 = q4.d;
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("o.l93");
            ay8Var2 = iInterfaceQueryLocalInterface2 instanceof l93 ? (l93) iInterfaceQueryLocalInterface2 : new ay8(iBinder2);
        }
        return xs1.G(ay8Var, ay8Var2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB0 = et1.b0(parcel, 20293);
        et1.a0(parcel, 1, 4);
        parcel.writeInt(this.m);
        IBinder iBinder = this.n;
        if (iBinder != null) {
            int iB1 = et1.b0(parcel, 2);
            parcel.writeStrongBinder(iBinder);
            et1.c0(parcel, iB1);
        }
        et1.W(parcel, 3, this.f446o, i);
        et1.a0(parcel, 4, 4);
        parcel.writeInt(this.p ? 1 : 0);
        et1.a0(parcel, 5, 4);
        parcel.writeInt(this.q ? 1 : 0);
        et1.c0(parcel, iB0);
    }
}
