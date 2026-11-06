package o;

/* JADX INFO: loaded from: classes2.dex */
public final class sn6 {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public sn6 f;
    public sn6 g;

    public sn6(byte[] bArr, int i, int i2, boolean z) {
        bArr.getClass();
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = false;
    }

    public final sn6 a() {
        sn6 sn6Var = this.f;
        if (sn6Var == this) {
            sn6Var = null;
        }
        sn6 sn6Var2 = this.g;
        sn6Var2.getClass();
        sn6Var2.f = this.f;
        sn6 sn6Var3 = this.f;
        sn6Var3.getClass();
        sn6Var3.g = this.g;
        this.f = null;
        this.g = null;
        return sn6Var;
    }

    public final void b(sn6 sn6Var) {
        sn6Var.getClass();
        sn6Var.g = this;
        sn6Var.f = this.f;
        sn6 sn6Var2 = this.f;
        sn6Var2.getClass();
        sn6Var2.g = sn6Var;
        this.f = sn6Var;
    }

    public final sn6 c() {
        this.d = true;
        return new sn6(this.a, this.b, this.c, true);
    }

    public final void d(sn6 sn6Var, int i) {
        sn6Var.getClass();
        byte[] bArr = sn6Var.a;
        if (!sn6Var.e) {
            hk0.l("only owner can write");
            return;
        }
        int i2 = sn6Var.c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (sn6Var.d) {
                yq4.f();
                return;
            }
            int i4 = sn6Var.b;
            if (i3 - i4 > 8192) {
                yq4.f();
                return;
            }
            cx.E0(0, i4, i2, bArr, bArr);
            i2 = sn6Var.c - sn6Var.b;
            sn6Var.c = i2;
            sn6Var.b = 0;
        }
        int i5 = this.b;
        cx.E0(i2, i5, i5 + i, this.a, bArr);
        sn6Var.c += i;
        this.b += i;
    }

    public sn6() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }
}
