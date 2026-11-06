package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ow4 {
    public long[] a;
    public int b;

    public ow4(int i) {
        this.a = i == 0 ? lg4.a : new long[i];
    }

    public final void a(long j) {
        int i = this.b + 1;
        long[] jArrCopyOf = this.a;
        if (jArrCopyOf.length < i) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i, (jArrCopyOf.length * 3) / 2));
            this.a = jArrCopyOf;
        }
        int i2 = this.b;
        jArrCopyOf[i2] = j;
        this.b = i2 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ow4) {
            ow4 ow4Var = (ow4) obj;
            int i = ow4Var.b;
            int i2 = this.b;
            if (i == i2) {
                long[] jArr = this.a;
                long[] jArr2 = ow4Var.a;
                yk3 yk3VarB0 = ct1.b0(0, i2);
                int i3 = yk3VarB0.m;
                int i4 = yk3VarB0.n;
                if (i3 > i4) {
                    return true;
                }
                while (jArr[i3] == jArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        long[] jArr = this.a;
        int i = this.b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += Long.hashCode(jArr[i2]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        long[] jArr = this.a;
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            long j = jArr[i2];
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            sb.append(j);
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public /* synthetic */ ow4() {
        this(16);
    }
}
