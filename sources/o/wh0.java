package o;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class wh0 implements Iterable, Serializable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final wh0 f2412o = new wh0(ul3.b);
    public static final uh0 p;
    public int m = 0;
    public final byte[] n;

    static {
        p = uf.a() ? new aw((byte) 4) : new ir((byte) 4);
    }

    public wh0(byte[] bArr) {
        bArr.getClass();
        this.n = bArr;
    }

    public static int b(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            hk0.r(fx3.f(i, "Beginning index: ", " < 0"));
            return 0;
        }
        if (i2 < i) {
            hk0.r(ua5.l("Beginning index larger than ending index: ", i, i2, ", "));
            return 0;
        }
        hk0.r(ua5.l("End index: ", i2, i3, " >= "));
        return 0;
    }

    public static wh0 c(byte[] bArr, int i, int i2) {
        b(i, i + i2, bArr.length);
        return new wh0(p.c(bArr, i, i2));
    }

    public byte a(int i) {
        return this.n[i];
    }

    public void d(byte[] bArr, int i) {
        System.arraycopy(this.n, 0, bArr, 0, i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wh0) || size() != ((wh0) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof wh0)) {
            return obj.equals(this);
        }
        wh0 wh0Var = (wh0) obj;
        int i = this.m;
        int i2 = wh0Var.m;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int size = size();
        if (size > wh0Var.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > wh0Var.size()) {
            StringBuilder sbK = fx3.k(size, "Ran off end of other: 0, ", ", ");
            sbK.append(wh0Var.size());
            throw new IllegalArgumentException(sbK.toString());
        }
        byte[] bArr = wh0Var.n;
        int iF = f() + size;
        int iF2 = f();
        int iF3 = wh0Var.f();
        while (iF2 < iF) {
            if (this.n[iF2] != bArr[iF3]) {
                return false;
            }
            iF2++;
            iF3++;
        }
        return true;
    }

    public int f() {
        return 0;
    }

    public byte g(int i) {
        return this.n[i];
    }

    public final int hashCode() {
        int i = this.m;
        if (i != 0) {
            return i;
        }
        int size = size();
        int iF = f();
        int i2 = size;
        for (int i3 = iF; i3 < iF + size; i3++) {
            i2 = (i2 * 31) + this.n[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.m = i2;
        return i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ky(this);
    }

    public int size() {
        return this.n.length;
    }

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            strConcat = f57.i(this);
        } else {
            int iB = b(0, 47, size());
            strConcat = f57.i(iB == 0 ? f2412o : new sh0(this.n, f(), iB)).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(size);
        sb.append(" contents=\"");
        return e41.l(sb, strConcat, "\">");
    }
}
