package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes.dex */
public final class nk7 implements Parcelable {
    public static final Parcelable.Creator<nk7> CREATOR = new xf5((byte) 12);
    public String m;
    public lk7 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f1575o;
    public mk7 p;
    public boolean q;
    public final String r;
    public final long s;
    public final long t;
    public final int u;

    public nk7(Parcel parcel) {
        this.m = "";
        lk7 lk7Var = lk7.n;
        this.n = lk7Var;
        this.f1575o = "";
        mk7 mk7Var = mk7.f1479o;
        this.p = mk7Var;
        String string = parcel.readString();
        this.m = string == null ? "" : string;
        String string2 = parcel.readString();
        this.f1575o = string2 == null ? "" : string2;
        String string3 = parcel.readString();
        this.r = string3 != null ? string3 : "";
        this.s = parcel.readLong();
        this.t = parcel.readLong();
        lk7 lk7Var2 = (lk7) yo1.P(parcel, nk7.class.getClassLoader(), lk7.class);
        this.n = lk7Var2 != null ? lk7Var2 : lk7Var;
        mk7 mk7Var2 = (mk7) yo1.P(parcel, nk7.class.getClassLoader(), mk7.class);
        this.p = mk7Var2 != null ? mk7Var2 : mk7Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nk7)) {
            return false;
        }
        nk7 nk7Var = (nk7) obj;
        return im3.n(nk7Var.m, this.m) && im3.n(nk7Var.f1575o, this.f1575o) && nk7Var.n == this.n && nk7Var.p == this.p;
    }

    public final int hashCode() {
        return this.p.hashCode() + ((this.n.hashCode() + to7.e(to7.e(31, 31, this.m), 31, this.f1575o)) * 31);
    }

    public final String toString() {
        return "Name: " + this.m + " - " + this.n + " - " + this.u;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.m);
        parcel.writeString(this.f1575o);
        parcel.writeString(this.r);
        parcel.writeLong(this.s);
        parcel.writeLong(this.t);
        parcel.writeParcelable(this.n, i);
        parcel.writeParcelable(this.p, i);
    }

    public nk7(String str, String str2, lk7 lk7Var, mk7 mk7Var, int i) {
        String strGuessContentTypeFromName;
        str.getClass();
        lk7Var.getClass();
        this.m = str;
        this.f1575o = str2;
        this.n = lk7Var;
        this.p = mk7Var;
        try {
            strGuessContentTypeFromName = URLConnection.guessContentTypeFromName(str);
            if (strGuessContentTypeFromName == null) {
                strGuessContentTypeFromName = "";
            }
        } catch (StringIndexOutOfBoundsException unused) {
            strGuessContentTypeFromName = "application/unknown";
        }
        this.r = strGuessContentTypeFromName;
        this.u = i;
        File file = new File(str2);
        if (file.isDirectory()) {
            this.n = lk7.m;
        }
        this.t = file.lastModified();
        this.s = file.length();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ nk7(int i, String str, String str2) {
        lk7 lk7Var;
        if ((i & 4) != 0) {
            lk7Var = lk7.n;
        } else {
            lk7Var = lk7.m;
        }
        this(str, str2, lk7Var, mk7.m, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public nk7(File file) {
        String name = file.getName();
        name.getClass();
        String absolutePath = file.getAbsolutePath();
        absolutePath.getClass();
        this(28, name, absolutePath);
    }
}
