package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.teamviewer.apidefinitions.contacts.models.ContactOnlineStatus;

/* JADX INFO: loaded from: classes.dex */
public final class h71 implements Parcelable {
    public static final Parcelable.Creator<h71> CREATOR = new dq8((byte) 9);
    public final int m;
    public final Integer n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f954o;
    public final String p;
    public final String q;
    public final String r;
    public final ContactOnlineStatus s;
    public final b91 t;

    public /* synthetic */ h71(int i, Integer num, String str, String str2, String str3, ContactOnlineStatus contactOnlineStatus, b91 b91Var, int i2) {
        this(i, (i2 & 2) != 0 ? null : num, str, str2, (i2 & 16) != 0 ? null : "--", (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? null : contactOnlineStatus, b91Var);
    }

    public static h71 c(h71 h71Var, String str, String str2, int i) {
        int i2 = h71Var.m;
        Integer num = h71Var.n;
        String str3 = h71Var.p;
        if ((i & 16) != 0) {
            str2 = h71Var.q;
        }
        String str4 = h71Var.r;
        ContactOnlineStatus contactOnlineStatus = h71Var.s;
        b91 b91Var = h71Var.t;
        h71Var.getClass();
        str.getClass();
        b91Var.getClass();
        return new h71(i2, num, str, str3, str2, str4, contactOnlineStatus, b91Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h71)) {
            return false;
        }
        h71 h71Var = (h71) obj;
        return this.m == h71Var.m && im3.n(this.n, h71Var.n) && im3.n(this.f954o, h71Var.f954o) && im3.n(this.p, h71Var.p) && im3.n(this.q, h71Var.q) && im3.n(this.r, h71Var.r) && this.s == h71Var.s && this.t == h71Var.t;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.m) * 31;
        Integer num = this.n;
        int iE = to7.e((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f954o);
        String str = this.p;
        int iHashCode2 = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.q;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.r;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ContactOnlineStatus contactOnlineStatus = this.s;
        return this.t.hashCode() + ((iHashCode4 + (contactOnlineStatus != null ? contactOnlineStatus.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Contact(contactId=");
        sb.append(this.m);
        sb.append(", accountId=");
        sb.append(this.n);
        sb.append(", name=");
        e41.t(sb, this.f954o, ", email=", this.p, ", description=");
        e41.t(sb, this.q, ", pictureUrl=", this.r, ", status=");
        sb.append(this.s);
        sb.append(", type=");
        sb.append(this.t);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.m);
        Integer num = this.n;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.f954o);
        parcel.writeString(this.p);
        parcel.writeString(this.q);
        parcel.writeString(this.r);
        ContactOnlineStatus contactOnlineStatus = this.s;
        if (contactOnlineStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(contactOnlineStatus.name());
        }
        parcel.writeString(this.t.name());
    }

    public h71(int i, Integer num, String str, String str2, String str3, String str4, ContactOnlineStatus contactOnlineStatus, b91 b91Var) {
        str.getClass();
        b91Var.getClass();
        this.m = i;
        this.n = num;
        this.f954o = str;
        this.p = str2;
        this.q = str3;
        this.r = str4;
        this.s = contactOnlineStatus;
        this.t = b91Var;
    }
}
