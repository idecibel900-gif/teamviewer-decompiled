package o;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class yh0 implements Iterable, Serializable {
    public static final vh0 n = new vh0(sl3.b);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final th0 f2607o;
    public int m;

    static {
        f2607o = tf.a() ? new vv((byte) 4) : new cr((byte) 4);
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

    public static vh0 c(byte[] bArr, int i, int i2) {
        b(i, i + i2, bArr.length);
        return new vh0(f2607o.c(bArr, i, i2));
    }

    public abstract byte a(int i);

    public abstract void d(byte[] bArr, int i);

    public abstract byte f(int i);

    public final int hashCode() {
        int i = this.m;
        if (i != 0) {
            return i;
        }
        int size = size();
        vh0 vh0Var = (vh0) this;
        int iG = vh0Var.g();
        int i2 = size;
        for (int i3 = iG; i3 < iG + size; i3++) {
            i2 = (i2 * 31) + vh0Var.p[i3];
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

    public abstract int size();

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            strConcat = u47.i(this);
        } else {
            vh0 vh0Var = (vh0) this;
            int iB = b(0, 47, vh0Var.size());
            strConcat = u47.i(iB == 0 ? n : new rh0(vh0Var.p, vh0Var.g(), iB)).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(size);
        sb.append(" contents=\"");
        return e41.l(sb, strConcat, "\">");
    }
}
