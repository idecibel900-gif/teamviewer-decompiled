package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zu2 implements Parcelable {
    public static final Parcelable.Creator<zu2> CREATOR = new dq8((byte) 18);
    public final boolean A;
    public final String m;
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f2735o;
    public final boolean p;
    public final int q;
    public final int r;
    public final String s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final int x;
    public final String y;
    public final int z;

    public zu2(Parcel parcel) {
        this.m = parcel.readString();
        this.n = parcel.readString();
        this.f2735o = parcel.readInt() != 0;
        this.p = parcel.readInt() != 0;
        this.q = parcel.readInt();
        this.r = parcel.readInt();
        this.s = parcel.readString();
        this.t = parcel.readInt() != 0;
        this.u = parcel.readInt() != 0;
        this.v = parcel.readInt() != 0;
        this.w = parcel.readInt() != 0;
        this.x = parcel.readInt();
        this.y = parcel.readString();
        this.z = parcel.readInt();
        this.A = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.m);
        sb.append(" (");
        sb.append(this.n);
        sb.append(")}:");
        if (this.f2735o) {
            sb.append(" fromLayout");
        }
        if (this.p) {
            sb.append(" dynamicContainer");
        }
        int i = this.r;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.s;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.t) {
            sb.append(" retainInstance");
        }
        if (this.u) {
            sb.append(" removing");
        }
        if (this.v) {
            sb.append(" detached");
        }
        if (this.w) {
            sb.append(" hidden");
        }
        String str2 = this.y;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.z);
        }
        if (this.A) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.m);
        parcel.writeString(this.n);
        parcel.writeInt(this.f2735o ? 1 : 0);
        parcel.writeInt(this.p ? 1 : 0);
        parcel.writeInt(this.q);
        parcel.writeInt(this.r);
        parcel.writeString(this.s);
        parcel.writeInt(this.t ? 1 : 0);
        parcel.writeInt(this.u ? 1 : 0);
        parcel.writeInt(this.v ? 1 : 0);
        parcel.writeInt(this.w ? 1 : 0);
        parcel.writeInt(this.x);
        parcel.writeString(this.y);
        parcel.writeInt(this.z);
        parcel.writeInt(this.A ? 1 : 0);
    }

    public zu2(ut2 ut2Var) {
        this.m = ut2Var.getClass().getName();
        this.n = ut2Var.q;
        this.f2735o = ut2Var.z;
        this.p = ut2Var.B;
        this.q = ut2Var.J;
        this.r = ut2Var.K;
        this.s = ut2Var.L;
        this.t = ut2Var.O;
        this.u = ut2Var.x;
        this.v = ut2Var.N;
        this.w = ut2Var.M;
        this.x = ut2Var.c0.ordinal();
        this.y = ut2Var.t;
        this.z = ut2Var.u;
        this.A = ut2Var.W;
    }
}
