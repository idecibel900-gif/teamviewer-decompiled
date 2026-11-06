package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class hm2 {
    public final /* synthetic */ byte a;
    public final int b;
    public final int c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hm2(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (byte) 2);
        this.a = (byte) 2;
    }

    public static fm2 a(hm2 hm2Var) {
        return new fm2(hm2Var.b + hm2Var.c, 1, (byte) 0);
    }

    public static fm2 b() {
        return new fm2(0, 1, (byte) 0);
    }

    public void c(rr0 rr0Var, jv jvVar, k17 k17Var, au2 au2Var, sa5 sa5Var) {
        k17Var.a(rr0Var.g(0));
    }

    public px2 d(rr0 rr0Var) {
        return null;
    }

    public abstract byte[] e();

    public abstract byte[] f(byte[] bArr, int i);

    public boolean g() {
        return false;
    }

    public hm2 h() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public String toString() {
        char c;
        switch (this.a) {
            case 1:
                int i = this.b;
                byte[] bArrF = new byte[i];
                int i2 = this.c;
                StringBuilder sb = new StringBuilder((i + 1) * i2);
                for (int i3 = 0; i3 < i2; i3++) {
                    bArrF = f(bArrF, i3);
                    for (int i4 = 0; i4 < i; i4++) {
                        int i5 = bArrF[i4] & 255;
                        if (i5 < 64) {
                            c = '#';
                        } else if (i5 < 128) {
                            c = '+';
                        } else {
                            c = i5 < 192 ? '.' : ' ';
                        }
                        sb.append(c);
                    }
                    sb.append('\n');
                }
                return sb.toString();
            case 2:
                String strF = w86.a.b(getClass()).f();
                return strF == null ? "" : strF;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ hm2(int i, int i2, byte b) {
        this.a = b;
        this.b = i;
        this.c = i2;
    }
}
