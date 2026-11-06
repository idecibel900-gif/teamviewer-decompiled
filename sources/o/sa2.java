package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class sa2 {
    public final ta2 a;
    public final byte[] b;

    public sa2(ta2 ta2Var, byte[] bArr) {
        if (ta2Var == null) {
            yq4.l("encoding is null");
            throw null;
        }
        if (bArr == null) {
            yq4.l("bytes is null");
            throw null;
        }
        this.a = ta2Var;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sa2)) {
            return false;
        }
        sa2 sa2Var = (sa2) obj;
        if (this.a.equals(sa2Var.a)) {
            return Arrays.equals(this.b, sa2Var.b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
