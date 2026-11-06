package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@lq6
public final class dd8 implements Parcelable {
    public final hv m;
    public final hv n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final hv f612o;
    public final hv p;
    public final hv q;
    public final hv r;
    public static final cd8 Companion = new cd8();
    public static final Parcelable.Creator<dd8> CREATOR = new xf5((byte) 16);

    public /* synthetic */ dd8(int i, hv hvVar, hv hvVar2, hv hvVar3, hv hvVar4, hv hvVar5, hv hvVar6) {
        if ((i & 1) == 0) {
            this.m = null;
        } else {
            this.m = hvVar;
        }
        if ((i & 2) == 0) {
            this.n = null;
        } else {
            this.n = hvVar2;
        }
        if ((i & 4) == 0) {
            this.f612o = null;
        } else {
            this.f612o = hvVar3;
        }
        if ((i & 8) == 0) {
            this.p = null;
        } else {
            this.p = hvVar4;
        }
        if ((i & 16) == 0) {
            this.q = null;
        } else {
            this.q = hvVar5;
        }
        if ((i & 32) == 0) {
            this.r = null;
        } else {
            this.r = hvVar6;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd8)) {
            return false;
        }
        dd8 dd8Var = (dd8) obj;
        return im3.n(this.m, dd8Var.m) && im3.n(this.n, dd8Var.n) && im3.n(this.f612o, dd8Var.f612o) && im3.n(this.p, dd8Var.p) && im3.n(this.q, dd8Var.q) && im3.n(this.r, dd8Var.r);
    }

    public final int hashCode() {
        hv hvVar = this.m;
        int iHashCode = (hvVar == null ? 0 : hvVar.hashCode()) * 31;
        hv hvVar2 = this.n;
        int iHashCode2 = (iHashCode + (hvVar2 == null ? 0 : hvVar2.hashCode())) * 31;
        hv hvVar3 = this.f612o;
        int iHashCode3 = (iHashCode2 + (hvVar3 == null ? 0 : hvVar3.hashCode())) * 31;
        hv hvVar4 = this.p;
        int iHashCode4 = (iHashCode3 + (hvVar4 == null ? 0 : hvVar4.hashCode())) * 31;
        hv hvVar5 = this.q;
        int iHashCode5 = (iHashCode4 + (hvVar5 == null ? 0 : hvVar5.hashCode())) * 31;
        hv hvVar6 = this.r;
        return iHashCode5 + (hvVar6 != null ? hvVar6.hashCode() : 0);
    }

    public final String toString() {
        return "VersionInfoResponse(tvWebsite=" + this.m + ", playStore=" + this.n + ", huawei=" + this.f612o + ", oppo=" + this.p + ", vivo=" + this.q + ", xiaomi=" + this.r + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        hv hvVar = this.m;
        if (hvVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hvVar.writeToParcel(parcel, i);
        }
        hv hvVar2 = this.n;
        if (hvVar2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hvVar2.writeToParcel(parcel, i);
        }
        hv hvVar3 = this.f612o;
        if (hvVar3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hvVar3.writeToParcel(parcel, i);
        }
        hv hvVar4 = this.p;
        if (hvVar4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hvVar4.writeToParcel(parcel, i);
        }
        hv hvVar5 = this.q;
        if (hvVar5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hvVar5.writeToParcel(parcel, i);
        }
        hv hvVar6 = this.r;
        if (hvVar6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hvVar6.writeToParcel(parcel, i);
        }
    }

    public dd8(hv hvVar, hv hvVar2, hv hvVar3, hv hvVar4, hv hvVar5, hv hvVar6) {
        this.m = hvVar;
        this.n = hvVar2;
        this.f612o = hvVar3;
        this.p = hvVar4;
        this.q = hvVar5;
        this.r = hvVar6;
    }
}
