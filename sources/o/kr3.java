package o;

import java.io.Closeable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class kr3 implements Closeable {
    public static final String[] q = new String[128];
    public int m;
    public int[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String[] f1297o;
    public int[] p;

    static {
        for (int i = 0; i <= 31; i++) {
            q[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = q;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public abstract void A0();

    public abstract void D0();

    public abstract void F();

    public final void G(String str) throws sq3 {
        throw new sq3(str + " at path " + e());
    }

    public abstract void Z();

    public final String e() {
        int i = this.m;
        int[] iArr = this.n;
        String[] strArr = this.f1297o;
        int[] iArr2 = this.p;
        StringBuilder sb = new StringBuilder("$");
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(iArr2[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = strArr[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public abstract boolean hasNext();

    public abstract boolean j();

    public abstract double nextDouble();

    public abstract int nextInt();

    public abstract int q();

    public abstract String r();

    public final void u(int i) {
        int i2 = this.m;
        int[] iArr = this.n;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                throw new hq3("Nesting too deep at ".concat(e()));
            }
            this.n = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f1297o;
            this.f1297o = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.p;
            this.p = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.n;
        int i3 = this.m;
        this.m = i3 + 1;
        iArr3[i3] = i;
    }

    public abstract void u0();

    public abstract void v();

    public abstract int z(jr3 jr3Var);
}
