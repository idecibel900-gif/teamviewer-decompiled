package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ns5 implements Comparable {
    public final byte[] m;

    public ns5(byte[] bArr) {
        this.m = Arrays.copyOf(bArr, bArr.length);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ns5 ns5Var = (ns5) obj;
        byte[] bArr = this.m;
        int length = bArr.length;
        byte[] bArr2 = ns5Var.m;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            byte b2 = ns5Var.m[i];
            if (b != b2) {
                return b - b2;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ns5) {
            return Arrays.equals(this.m, ((ns5) obj).m);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.m);
    }

    public final String toString() {
        return xs1.F(this.m);
    }
}
