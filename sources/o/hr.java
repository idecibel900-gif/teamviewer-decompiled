package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class hr extends q2 {
    public static final Parcelable.Creator<hr> CREATOR = dq8.b;
    public static final hr p;
    public final zx0 m;
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f999o;

    static {
        hr hrVar = new hr(null, false);
        hrVar.f999o = false;
        p = hrVar;
    }

    public hr(zx0 zx0Var, boolean z) {
        this.m = zx0Var;
        this.n = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hr)) {
            return false;
        }
        hr hrVar = (hr) obj;
        return xs1.G(this.m, hrVar.m) && this.f999o == hrVar.f999o && this.n == hrVar.n;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.m, Boolean.valueOf(this.f999o), Boolean.valueOf(this.n)});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.m);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 31);
        sb.append("ApiMetadata(complianceOptions=");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.f999o) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
            return;
        }
        parcel.writeInt(-204102970);
        int iB0 = et1.b0(parcel, 20293);
        et1.W(parcel, 1, this.m, i);
        et1.a0(parcel, 2, 4);
        parcel.writeInt(this.n ? 1 : 0);
        et1.c0(parcel, iB0);
    }
}
