package o;

/* JADX INFO: loaded from: classes.dex */
public final class xy2 {
    public static final xy2 h = new xy2(4201, 4096, 1);
    public static final xy2 i = new xy2(1033, 1024, 1);
    public static final xy2 j;
    public static final xy2 k;
    public static final xy2 l;
    public static final xy2 m;
    public static final xy2 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final xy2 f2562o;
    public final int[] a;
    public final int[] b;
    public final yt2 c;
    public final yt2 d;
    public final short e;
    public final short f;
    public final boolean g;

    static {
        xy2 xy2Var = new xy2(67, 64, 1);
        j = xy2Var;
        k = new xy2(19, 16, 1);
        l = new xy2(285, 256, 0);
        xy2 xy2Var2 = new xy2(301, 256, 1);
        m = xy2Var2;
        n = xy2Var2;
        f2562o = xy2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public xy2(int i2, int i3, int i4) {
        this.f = i2;
        this.e = i3;
        this.g = i4;
        this.a = new int[i3];
        this.b = new int[i3];
        int i5 = 1;
        for (int i6 = 0; i6 < i3; i6++) {
            this.a[i6] = i5;
            i5 *= 2;
            if (i5 >= i3) {
                i5 = (i5 ^ i2 ? 1 : 0) & (i3 - 1);
            }
        }
        for (int i7 = 0; i7 < i3 - 1; i7++) {
            this.b[this.a[i7]] = i7;
        }
        this.c = new yt2(this, new int[]{0});
        this.d = new yt2(this, new int[]{1});
    }

    public final int a(int i2) {
        if (i2 == 0) {
            throw new ArithmeticException();
        }
        return this.a[(this.e - this.b[i2]) - 1];
    }

    public final int b(int i2, int i3) {
        if (i2 == 0 || i3 == 0) {
            return 0;
        }
        int[] iArr = this.b;
        return this.a[(iArr[i2] + iArr[i3]) % (this.e - 1)];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GF(0x");
        sb.append(Integer.toHexString(this.f));
        sb.append(',');
        return e41.j(sb, this.e, ')');
    }
}
