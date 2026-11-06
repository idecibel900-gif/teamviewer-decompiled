package o;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class hf6 extends zh0 {
    public static final int[] t;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final zh0 f968o;
    public final zh0 p;
    public final int q;
    public final int r;
    public int s = 0;

    static {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 1;
        while (i > 0) {
            arrayList.add(Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(Integer.MAX_VALUE);
        t = new int[arrayList.size()];
        int i4 = 0;
        while (true) {
            int[] iArr = t;
            if (i4 >= iArr.length) {
                return;
            }
            iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
            i4++;
        }
    }

    public hf6(zh0 zh0Var, zh0 zh0Var2) {
        this.f968o = zh0Var;
        this.p = zh0Var2;
        int size = zh0Var.size();
        this.q = size;
        this.n = zh0Var2.size() + size;
        this.r = Math.max(zh0Var.f(), zh0Var2.f()) + 1;
    }

    @Override // o.zh0
    public final void d(int i, int i2, int i3, byte[] bArr) {
        int i4 = i + i3;
        zh0 zh0Var = this.f968o;
        int i5 = this.q;
        if (i4 <= i5) {
            zh0Var.d(i, i2, i3, bArr);
            return;
        }
        zh0 zh0Var2 = this.p;
        if (i >= i5) {
            zh0Var2.d(i - i5, i2, i3, bArr);
            return;
        }
        int i6 = i5 - i;
        zh0Var.d(i, i2, i6, bArr);
        zh0Var2.d(0, i2 + i6, i3 - i6, bArr);
    }

    public final boolean equals(Object obj) {
        int iM;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zh0) {
            zh0 zh0Var = (zh0) obj;
            int size = zh0Var.size();
            int i = this.n;
            if (i == size) {
                if (i == 0) {
                    return true;
                }
                if (this.s == 0 || (iM = zh0Var.m()) == 0 || this.s == iM) {
                    ff6 ff6Var = new ff6(this);
                    pc4 pc4VarA = ff6Var.next();
                    ff6 ff6Var2 = new ff6(zh0Var);
                    pc4 pc4VarA2 = ff6Var2.next();
                    int i2 = 0;
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        int length = pc4VarA.n.length - i2;
                        int length2 = pc4VarA2.n.length - i3;
                        int iMin = Math.min(length, length2);
                        if (!(i2 == 0 ? pc4VarA.r(pc4VarA2, i3, iMin) : pc4VarA2.r(pc4VarA, i2, iMin))) {
                            break;
                        }
                        i4 += iMin;
                        if (i4 >= i) {
                            if (i4 == i) {
                                return true;
                            }
                            throw new IllegalStateException();
                        }
                        if (iMin == length) {
                            pc4VarA = ff6Var.next();
                            i2 = 0;
                        } else {
                            i2 += iMin;
                        }
                        if (iMin == length2) {
                            pc4VarA2 = ff6Var2.next();
                            i3 = 0;
                        } else {
                            i3 += iMin;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // o.zh0
    public final int f() {
        return this.r;
    }

    @Override // o.zh0
    public final boolean g() {
        return this.n >= t[this.r];
    }

    @Override // o.zh0
    public final boolean h() {
        int iL = this.f968o.l(0, 0, this.q);
        zh0 zh0Var = this.p;
        return zh0Var.l(iL, 0, zh0Var.size()) == 0;
    }

    public final int hashCode() {
        int iK = this.s;
        if (iK == 0) {
            int i = this.n;
            iK = k(i, 0, i);
            if (iK == 0) {
                iK = 1;
            }
            this.s = iK;
        }
        return iK;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new gf6(this);
    }

    @Override // o.zh0
    public final int k(int i, int i2, int i3) {
        int i4 = i2 + i3;
        zh0 zh0Var = this.f968o;
        int i5 = this.q;
        if (i4 <= i5) {
            return zh0Var.k(i, i2, i3);
        }
        zh0 zh0Var2 = this.p;
        if (i2 >= i5) {
            return zh0Var2.k(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return zh0Var2.k(zh0Var.k(i, i2, i6), 0, i3 - i6);
    }

    @Override // o.zh0
    public final int l(int i, int i2, int i3) {
        int i4 = i2 + i3;
        zh0 zh0Var = this.f968o;
        int i5 = this.q;
        if (i4 <= i5) {
            return zh0Var.l(i, i2, i3);
        }
        zh0 zh0Var2 = this.p;
        if (i2 >= i5) {
            return zh0Var2.l(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return zh0Var2.l(zh0Var.l(i, i2, i6), 0, i3 - i6);
    }

    @Override // o.zh0
    public final int m() {
        return this.s;
    }

    @Override // o.zh0
    public final String n() {
        byte[] bArr;
        int i = this.n;
        if (i == 0) {
            bArr = tl3.a;
        } else {
            byte[] bArr2 = new byte[i];
            d(0, 0, i, bArr2);
            bArr = bArr2;
        }
        return new String(bArr, "UTF-8");
    }

    @Override // o.zh0
    public final void p(OutputStream outputStream, int i, int i2) {
        int i3 = i + i2;
        zh0 zh0Var = this.f968o;
        int i4 = this.q;
        if (i3 <= i4) {
            zh0Var.p(outputStream, i, i2);
            return;
        }
        zh0 zh0Var2 = this.p;
        if (i >= i4) {
            zh0Var2.p(outputStream, i - i4, i2);
            return;
        }
        int i5 = i4 - i;
        zh0Var.p(outputStream, i, i5);
        zh0Var2.p(outputStream, 0, i2 - i5);
    }

    @Override // o.zh0
    public final int size() {
        return this.n;
    }
}
