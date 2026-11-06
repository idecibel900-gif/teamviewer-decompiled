package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@lq6
public final class hv implements Parcelable {
    public final String m;
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f1011o;
    public final String p;
    public static final gv Companion = new gv();
    public static final Parcelable.Creator<hv> CREATOR = new dq8(4);

    public /* synthetic */ hv(String str, String str2, int i, String str3, String str4) {
        if (11 != (i & 11)) {
            lq1.H(i, 11, fv.a.d());
            throw null;
        }
        this.m = str;
        this.n = str2;
        if ((i & 4) == 0) {
            this.f1011o = null;
        } else {
            this.f1011o = str3;
        }
        this.p = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hv)) {
            return false;
        }
        hv hvVar = (hv) obj;
        return im3.n(this.m, hvVar.m) && im3.n(this.n, hvVar.n) && im3.n(this.f1011o, hvVar.f1011o) && im3.n(this.p, hvVar.p);
    }

    public final int hashCode() {
        String str = this.m;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.n;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f1011o;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.p;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return e41.m(e41.o("AppVersionInfo(latestVersionName=", this.m, ", downloadUrl=", this.n, ", storeUrl="), this.f1011o, ", minRequiredVersion=", this.p, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.m);
        parcel.writeString(this.n);
        parcel.writeString(this.f1011o);
        parcel.writeString(this.p);
    }

    public hv(String str, String str2, String str3, String str4) {
        this.m = str;
        this.n = str2;
        this.f1011o = str3;
        this.p = str4;
    }
}
