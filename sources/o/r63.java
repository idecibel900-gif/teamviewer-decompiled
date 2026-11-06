package o;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class r63 {
    public final bf0 a;
    public boolean c;
    public int g;
    public int h;
    public int b = Integer.MAX_VALUE;
    public int d = 4096;
    public d53[] e = new d53[8];
    public int f = 7;

    public r63(bf0 bf0Var) {
        this.a = bf0Var;
    }

    public final void a(int i) {
        int i2;
        if (i > 0) {
            int length = this.e.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    break;
                }
                d53 d53Var = this.e[length];
                d53Var.getClass();
                i -= d53Var.c;
                int i4 = this.h;
                d53 d53Var2 = this.e[length];
                d53Var2.getClass();
                this.h = i4 - d53Var2.c;
                this.g--;
                i3++;
                length--;
            }
            d53[] d53VarArr = this.e;
            int i5 = i2 + 1;
            System.arraycopy(d53VarArr, i5, d53VarArr, i5 + i3, this.g);
            d53[] d53VarArr2 = this.e;
            int i6 = this.f + 1;
            Arrays.fill(d53VarArr2, i6, i6 + i3, (Object) null);
            this.f += i3;
        }
    }

    public final void b(d53 d53Var) {
        int i = d53Var.c;
        int i2 = this.d;
        if (i > i2) {
            d53[] d53VarArr = this.e;
            cx.N0(0, d53VarArr.length, null, d53VarArr);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
            return;
        }
        a((this.h + i) - i2);
        int i3 = this.g + 1;
        d53[] d53VarArr2 = this.e;
        if (i3 > d53VarArr2.length) {
            d53[] d53VarArr3 = new d53[d53VarArr2.length * 2];
            System.arraycopy(d53VarArr2, 0, d53VarArr3, d53VarArr2.length, d53VarArr2.length);
            this.f = this.e.length - 1;
            this.e = d53VarArr3;
            d53VarArr2 = d53VarArr3;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        d53VarArr2[i4] = d53Var;
        this.g++;
        this.h += i;
    }

    public final void c(ai0 ai0Var) throws EOFException {
        ai0Var.getClass();
        int[] iArr = i93.a;
        int iD = ai0Var.d();
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < iD; i++) {
            byte bI = ai0Var.i(i);
            byte[] bArr = po8.a;
            j2 += (long) i93.b[bI & 255];
        }
        int i2 = (int) ((j2 + 7) >> 3);
        int iD2 = ai0Var.d();
        bf0 bf0Var = this.a;
        if (i2 >= iD2) {
            e(ai0Var.d(), 127, 0);
            bf0Var.R0(ai0Var);
            return;
        }
        bf0 bf0Var2 = new bf0();
        int[] iArr2 = i93.a;
        int iD3 = ai0Var.d();
        int i3 = 0;
        for (int i4 = 0; i4 < iD3; i4++) {
            byte bI2 = ai0Var.i(i4);
            byte[] bArr2 = po8.a;
            int i5 = bI2 & 255;
            int i6 = i93.a[i5];
            byte b = i93.b[i5];
            j = (j << b) | ((long) i6);
            i3 += b;
            while (i3 >= 8) {
                i3 -= 8;
                bf0Var2.U0((int) (j >> i3));
            }
        }
        if (i3 > 0) {
            bf0Var2.U0((int) ((j << (8 - i3)) | (255 >>> i3)));
        }
        ai0 ai0VarO0 = bf0Var2.o0(bf0Var2.n);
        e(ai0VarO0.d(), 127, 128);
        bf0Var.R0(ai0VarO0);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    public final void d(ArrayList arrayList) throws EOFException {
        int length;
        int length2;
        if (this.c) {
            int i = this.b;
            if (i < this.d) {
                e(i, 31, 32);
            }
            this.c = false;
            this.b = Integer.MAX_VALUE;
            e(this.d, 31, 32);
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            d53 d53Var = (d53) arrayList.get(i2);
            ai0 ai0VarQ = d53Var.a.q();
            ai0 ai0Var = d53Var.b;
            Integer num = (Integer) s63.b.get(ai0VarQ);
            if (num != null) {
                int iIntValue = num.intValue();
                length2 = iIntValue + 1;
                if (2 > length2 || length2 >= 8) {
                    length = length2;
                    length2 = -1;
                } else {
                    d53[] d53VarArr = s63.a;
                    if (im3.n(d53VarArr[iIntValue].b, ai0Var)) {
                        length = length2;
                    } else if (im3.n(d53VarArr[length2].b, ai0Var)) {
                        length2 = iIntValue + 2;
                        length = length2;
                    } else {
                        length = length2;
                        length2 = -1;
                    }
                }
            } else {
                length = -1;
                length2 = -1;
            }
            if (length2 == -1) {
                int length3 = this.e.length;
                for (int i3 = this.f + 1; i3 < length3; i3++) {
                    d53 d53Var2 = this.e[i3];
                    d53Var2.getClass();
                    if (im3.n(d53Var2.a, ai0VarQ)) {
                        d53 d53Var3 = this.e[i3];
                        d53Var3.getClass();
                        if (im3.n(d53Var3.b, ai0Var)) {
                            length2 = s63.a.length + (i3 - this.f);
                            break;
                        } else if (length == -1) {
                            length = (i3 - this.f) + s63.a.length;
                        }
                    }
                }
            }
            if (length2 != -1) {
                e(length2, 127, 128);
            } else if (length == -1) {
                this.a.U0(64);
                c(ai0VarQ);
                c(ai0Var);
                b(d53Var);
            } else {
                ai0 ai0Var2 = d53.d;
                ai0VarQ.getClass();
                ai0Var2.getClass();
                if (!ai0VarQ.m(0, ai0Var2, ai0Var2.d()) || im3.n(d53.i, ai0VarQ)) {
                    e(length, 63, 64);
                    c(ai0Var);
                    b(d53Var);
                } else {
                    e(length, 15, 0);
                    c(ai0Var);
                }
            }
        }
    }

    public final void e(int i, int i2, int i3) {
        bf0 bf0Var = this.a;
        if (i < i2) {
            bf0Var.U0(i | i3);
            return;
        }
        bf0Var.U0(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            bf0Var.U0(128 | (i4 & 127));
            i4 >>>= 7;
        }
        bf0Var.U0(i4);
    }
}
