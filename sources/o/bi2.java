package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class bi2 extends q2 {
    public static final Parcelable.Creator<bi2> CREATOR = new pq8(1);
    public final String m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f427o;
    public final boolean p;

    public bi2(String str, int i, long j, boolean z) {
        this.m = str;
        this.n = i;
        this.f427o = j;
        this.p = z;
    }

    public final long c() {
        long j = this.f427o;
        return j == -1 ? this.n : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bi2) {
            bi2 bi2Var = (bi2) obj;
            if (xs1.G(this.m, bi2Var.m) && c() == bi2Var.c() && this.p == bi2Var.p) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.m, Long.valueOf(c()), Boolean.valueOf(this.p)});
    }

    public final String toString() {
        a65 a65Var = new a65(this, (byte) 1);
        a65Var.P(this.m, "name");
        a65Var.P(Long.valueOf(c()), "version");
        a65Var.P(Boolean.valueOf(this.p), "is_fully_rolled_out");
        return a65Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB0 = et1.b0(parcel, 20293);
        et1.X(parcel, 1, this.m);
        et1.a0(parcel, 2, 4);
        parcel.writeInt(this.n);
        long jC = c();
        et1.a0(parcel, 3, 8);
        parcel.writeLong(jC);
        et1.a0(parcel, 4, 4);
        parcel.writeInt(this.p ? 1 : 0);
        et1.c0(parcel, iB0);
    }

    public bi2(String str) {
        this(str, -1, 1L, false);
    }
}
