package o;

import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;

/* JADX INFO: loaded from: classes.dex */
public final class zr1 {
    public final DyngateID a;
    public final int b;
    public final String c;
    public final String d;
    public final int e;

    public zr1(DyngateID dyngateID, int i, String str, String str2, int i2) {
        this.a = dyngateID;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zr1)) {
            return false;
        }
        zr1 zr1Var = (zr1) obj;
        return this.a.equals(zr1Var.a) && this.b == zr1Var.b && im3.n(this.c, zr1Var.c) && im3.n(this.d, zr1Var.d) && this.e == zr1Var.e;
    }

    public final int hashCode() {
        int iA = fx3.a(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return Integer.hashCode(this.e) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response(targetDyngateId=");
        sb.append(this.a);
        sb.append(", sessionIdentifier=");
        sb.append(this.b);
        sb.append(", keyRegistrationId=");
        e41.t(sb, this.c, ", nonce=", this.d, ", actionResult=");
        return to7.l(sb, this.e, ")");
    }
}
