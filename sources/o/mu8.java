package o;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class mu8 implements Iterable, Serializable {
    public static final nu8 n = new nu8(zu8.a);
    public int m = 0;

    static {
        int i = ku8.a;
    }

    public static int i(int i, int i2, int i3) {
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

    public static nu8 k(byte[] bArr, int i, int i2) {
        try {
            i(i, i + i2, bArr.length);
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return new nu8(bArr2);
        } catch (ev8 e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    public static /* bridge */ /* synthetic */ boolean l(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        int i4 = i + i3;
        i(i, i4, bArr.length);
        i(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public abstract byte a(int i);

    public abstract int b(int i, int i2);

    public abstract int c();

    public abstract mu8 d(int i, int i2);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mu8)) {
            return false;
        }
        mu8 mu8Var = (mu8) obj;
        int iC = c();
        if (iC != mu8Var.c()) {
            return false;
        }
        if (iC == 0) {
            return true;
        }
        int i = this.m;
        int i2 = mu8Var.m;
        if (i == 0 || i2 == 0 || i == i2) {
            return h(mu8Var);
        }
        return false;
    }

    public abstract void f(byte[] bArr, int i);

    public abstract void g(cv0 cv0Var);

    public abstract boolean h(mu8 mu8Var);

    public final int hashCode() {
        int iB = this.m;
        if (iB == 0) {
            int iC = c();
            iB = b(iC, iC);
            if (iB == 0) {
                iB = 1;
            }
            this.m = iB;
        }
        return iB;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new ky(this);
    }

    public final String toString() {
        byte[] bArr;
        String strConcat;
        byte[] bArr2;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iC = c();
        if (c() <= 50) {
            int iC2 = c();
            if (iC2 == 0) {
                bArr2 = zu8.a;
            } else {
                byte[] bArr3 = new byte[iC2];
                f(bArr3, iC2);
                bArr2 = bArr3;
            }
            strConcat = y57.G(bArr2);
        } else {
            mu8 mu8VarD = d(0, 47);
            int iC3 = mu8VarD.c();
            if (iC3 == 0) {
                bArr = zu8.a;
            } else {
                byte[] bArr4 = new byte[iC3];
                mu8VarD.f(bArr4, iC3);
                bArr = bArr4;
            }
            strConcat = y57.G(bArr).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iC);
        sb.append(" contents=\"");
        return e41.l(sb, strConcat, "\">");
    }
}
