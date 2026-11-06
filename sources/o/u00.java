package o;

import android.util.Base64;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class u00 {
    public final String a;
    public final byte[] b;
    public final ss5 c;

    public u00(String str, byte[] bArr, ss5 ss5Var) {
        this.a = str;
        this.b = bArr;
        this.c = ss5Var;
    }

    public static iu a() {
        iu iuVar = new iu((byte) 7, false);
        iuVar.n = ss5.m;
        return iuVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u00) {
            u00 u00Var = (u00) obj;
            if (this.a.equals(u00Var.a) && Arrays.equals(this.b, u00Var.b) && this.c.equals(u00Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003);
    }

    public final String toString() {
        byte[] bArr = this.b;
        String strEncodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        return e41.l(sb, strEncodeToString, ")");
    }
}
