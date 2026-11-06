package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zx0 extends q2 {
    public static final Parcelable.Creator<zx0> CREATOR = new pq8(4);
    public final int m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f2741o;
    public final boolean p;

    public zx0(int i, int i2, int i3, boolean z) {
        this.m = i;
        this.n = i2;
        this.f2741o = i3;
        this.p = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zx0)) {
            return false;
        }
        zx0 zx0Var = (zx0) obj;
        return this.m == zx0Var.m && this.n == zx0Var.n && this.f2741o == zx0Var.f2741o && this.p == zx0Var.p;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.m), Integer.valueOf(this.n), Integer.valueOf(this.f2741o), Boolean.valueOf(this.p)});
    }

    public final String toString() {
        int i = this.m;
        int length = String.valueOf(i).length();
        int i2 = this.n;
        int length2 = String.valueOf(i2).length();
        int i3 = this.f2741o;
        int length3 = String.valueOf(i3).length();
        boolean z = this.p;
        StringBuilder sb = new StringBuilder(length + 55 + length2 + 19 + length3 + 13 + String.valueOf(z).length() + 1);
        sb.append("ComplianceOptions{callerProductId=");
        sb.append(i);
        sb.append(", dataOwnerProductId=");
        sb.append(i2);
        sb.append(", processingReason=");
        sb.append(i3);
        sb.append(", isUserData=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB0 = et1.b0(parcel, 20293);
        et1.a0(parcel, 1, 4);
        parcel.writeInt(this.m);
        et1.a0(parcel, 2, 4);
        parcel.writeInt(this.n);
        et1.a0(parcel, 3, 4);
        parcel.writeInt(this.f2741o);
        et1.a0(parcel, 4, 4);
        parcel.writeInt(this.p ? 1 : 0);
        et1.c0(parcel, iB0);
    }
}
