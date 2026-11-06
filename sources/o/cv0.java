package o;

import java.io.IOException;
import java.io.OutputStream;
import java.text.BreakIterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class cv0 {
    public final /* synthetic */ byte a;
    public int b;
    public int c;
    public Object d;
    public Object e;

    public cv0(CharSequence charSequence, int i, Locale locale) {
        this.a = (byte) 3;
        this.d = charSequence;
        if (charSequence.length() < 0) {
            li3.a("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            li3.a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.e = wordInstance;
        this.b = Math.max(0, -50);
        this.c = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new pn0(i, charSequence));
    }

    public static int W(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int X(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int b(int i, int i2) {
        return d(i2) + i(i);
    }

    public static int c(int i, int i2) {
        return d(i2) + i(i);
    }

    public static int d(int i) {
        if (i >= 0) {
            return g(i);
        }
        return 10;
    }

    public static int e(int i, t1 t1Var) {
        return f(t1Var) + i(i);
    }

    public static int f(t1 t1Var) {
        int iC = t1Var.c();
        return g(iC) + iC;
    }

    public static int g(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int h(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int i(int i) {
        return g(i << 3);
    }

    public static cv0 r(OutputStream outputStream, int i) {
        return new cv0(outputStream, new byte[i]);
    }

    public void A(t1 t1Var) throws IOException {
        G(t1Var.c());
        t1Var.f(this);
    }

    public void B(int i) throws IOException {
        byte b = (byte) i;
        if (this.c == this.b) {
            u();
        }
        byte[] bArr = (byte[]) this.d;
        int i2 = this.c;
        this.c = i2 + 1;
        bArr[i2] = b;
    }

    public void C(zh0 zh0Var) throws IOException {
        int size = zh0Var.size();
        int i = this.b;
        int i2 = this.c;
        int i3 = i - i2;
        byte[] bArr = (byte[]) this.d;
        if (i3 >= size) {
            zh0Var.c(0, i2, size, bArr);
            this.c += size;
            return;
        }
        zh0Var.c(0, i2, i3, bArr);
        int i4 = size - i3;
        this.c = i;
        u();
        if (i4 <= i) {
            zh0Var.c(i3, 0, i4, bArr);
            this.c = i4;
            return;
        }
        OutputStream outputStream = (OutputStream) this.e;
        if (i3 < 0) {
            gk0.f(30, i3, "Source offset < 0: ");
            return;
        }
        if (i4 < 0) {
            gk0.f(23, i4, "Length < 0: ");
            return;
        }
        int i5 = i3 + i4;
        if (i5 > zh0Var.size()) {
            gk0.f(39, i5, "Source end offset exceeded: ");
        } else if (i4 > 0) {
            zh0Var.p(outputStream, i3, i4);
        }
    }

    public void D(byte[] bArr) throws IOException {
        int length = bArr.length;
        int i = this.b;
        int i2 = this.c;
        int i3 = i - i2;
        byte[] bArr2 = (byte[]) this.d;
        if (i3 >= length) {
            System.arraycopy(bArr, 0, bArr2, i2, length);
            this.c += length;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i2, i3);
        int i4 = length - i3;
        this.c = i;
        u();
        if (i4 > i) {
            ((OutputStream) this.e).write(bArr, i3, i4);
        } else {
            System.arraycopy(bArr, i3, bArr2, 0, i4);
            this.c = i4;
        }
    }

    public void E(int i) throws IOException {
        B(i & 255);
        B((i >> 8) & 255);
        B((i >> 16) & 255);
        B((i >> 24) & 255);
    }

    public void F(long j) throws IOException {
        B(((int) j) & 255);
        B(((int) (j >> 8)) & 255);
        B(((int) (j >> 16)) & 255);
        B(((int) (j >> 24)) & 255);
        B(((int) (j >> 32)) & 255);
        B(((int) (j >> 40)) & 255);
        B(((int) (j >> 48)) & 255);
        B(((int) (j >> 56)) & 255);
    }

    public void G(int i) throws IOException {
        while ((i & (-128)) != 0) {
            B((i & 127) | 128);
            i >>>= 7;
        }
        B(i);
    }

    public void H(long j) throws IOException {
        while (((-128) & j) != 0) {
            B((((int) j) & 127) | 128);
            j >>>= 7;
        }
        B((int) j);
    }

    public void I(int i, int i2) throws IOException {
        G((i << 3) | i2);
    }

    public void J(byte b) throws ou8 {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i = this.c;
        try {
            int i2 = i + 1;
            try {
                ((byte[]) this.d)[i] = b;
                this.c = i2;
            } catch (IndexOutOfBoundsException e) {
                indexOutOfBoundsException = e;
                i = i2;
                throw new ou8(i, this.b, 1, indexOutOfBoundsException);
            }
        } catch (IndexOutOfBoundsException e2) {
            indexOutOfBoundsException = e2;
        }
    }

    public void K(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, (byte[]) this.d, this.c, i2);
            this.c += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new ou8(this.c, this.b, i2, e);
        }
    }

    public void L(int i, int i2) throws ou8 {
        T((i << 3) | 5);
        M(i2);
    }

    public void M(int i) throws ou8 {
        int i2 = this.c;
        try {
            byte[] bArr = (byte[]) this.d;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.c = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new ou8(i2, this.b, 4, e);
        }
    }

    public void N(int i, long j) throws ou8 {
        T((i << 3) | 1);
        O(j);
    }

    public void O(long j) throws ou8 {
        int i = this.c;
        try {
            byte[] bArr = (byte[]) this.d;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.c = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new ou8(i, this.b, 8, e);
        }
    }

    public void P(int i, int i2) throws ou8 {
        T(i << 3);
        Q(i2);
    }

    public void Q(int i) throws ou8 {
        IndexOutOfBoundsException indexOutOfBoundsException;
        if (i >= 0) {
            T(i);
            return;
        }
        int i2 = this.c;
        try {
            byte[] bArr = (byte[]) this.d;
            long j = i;
            int i3 = i2 + 1;
            try {
                bArr[i2] = (byte) (((int) j) | 128);
                int i4 = i2 + 2;
                try {
                    bArr[i3] = (byte) (((int) (j >>> 7)) | 128);
                    int i5 = i2 + 3;
                    bArr[i4] = (byte) (((int) (j >>> 14)) | 128);
                    i4 = i2 + 4;
                    bArr[i5] = (byte) (((int) (j >>> 21)) | 128);
                    int i6 = i2 + 5;
                    bArr[i4] = (byte) (((int) (j >>> 28)) | 128);
                    int i7 = i2 + 6;
                    try {
                        bArr[i6] = -1;
                        int i8 = i2 + 7;
                        bArr[i7] = -1;
                        i7 = i2 + 8;
                        bArr[i8] = -1;
                        i3 = i2 + 9;
                        bArr[i7] = -1;
                        i2 += 10;
                        bArr[i3] = 1;
                        this.c = i2;
                    } catch (IndexOutOfBoundsException e) {
                        indexOutOfBoundsException = e;
                        i2 = i7;
                        throw new ou8(i2, this.b, 10, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e2) {
                    indexOutOfBoundsException = e2;
                    i2 = i4;
                }
            } catch (IndexOutOfBoundsException e3) {
                i2 = i3;
                indexOutOfBoundsException = e3;
            }
        } catch (IndexOutOfBoundsException e4) {
            indexOutOfBoundsException = e4;
        }
    }

    public void R(int i, int i2) throws ou8 {
        T((i << 3) | i2);
    }

    public void S(int i, int i2) throws ou8 {
        T(i << 3);
        T(i2);
    }

    public void T(int i) throws ou8 {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i2 = this.c;
        int i3 = i & (-128);
        byte[] bArr = (byte[]) this.d;
        try {
            if (i3 == 0) {
                int i4 = i2 + 1;
                bArr[i2] = (byte) i;
                this.c = i4;
                return;
            }
            int i5 = i2 + 1;
            bArr[i2] = (byte) (i | 128);
            int i6 = i >>> 7;
            try {
                if ((i6 & (-128)) == 0) {
                    int i7 = i2 + 2;
                    bArr[i5] = (byte) i6;
                    this.c = i7;
                    return;
                }
                int i8 = i2 + 2;
                try {
                    bArr[i5] = (byte) (i6 | 128);
                    int i9 = i >>> 14;
                    if ((i9 & (-128)) == 0) {
                        int i10 = i2 + 3;
                        bArr[i8] = (byte) i9;
                        this.c = i10;
                        return;
                    }
                    int i11 = i2 + 3;
                    try {
                        bArr[i8] = (byte) (i9 | 128);
                        int i12 = i >>> 21;
                        if ((i12 & (-128)) == 0) {
                            int i13 = i2 + 4;
                            bArr[i11] = (byte) i12;
                            this.c = i13;
                            return;
                        } else {
                            i8 = i2 + 4;
                            bArr[i11] = (byte) (i12 | 128);
                            int i14 = i2 + 5;
                            bArr[i8] = (byte) (i >>> 28);
                            this.c = i14;
                            return;
                        }
                    } catch (IndexOutOfBoundsException e) {
                        indexOutOfBoundsException = e;
                        i3 = i11;
                    }
                } catch (IndexOutOfBoundsException e2) {
                    indexOutOfBoundsException = e2;
                    i3 = i8;
                }
                throw new ou8(i3, this.b, 1, indexOutOfBoundsException);
            } catch (IndexOutOfBoundsException e3) {
                i3 = i;
                indexOutOfBoundsException = e3;
            }
        } catch (IndexOutOfBoundsException e4) {
            indexOutOfBoundsException = e4;
        }
    }

    public void U(int i, long j) throws ou8 {
        T(i << 3);
        V(j);
    }

    public void V(long j) throws ou8 {
        long j2 = j & (-128);
        int i = this.c;
        byte[] bArr = (byte[]) this.d;
        try {
            if (j2 == 0) {
                bArr[i] = (byte) j;
                this.c = i + 1;
                return;
            }
            bArr[i] = (byte) (((int) j) | 128);
            int i2 = i + 1;
            long j3 = j >>> 7;
            long j4 = j3 & (-128);
            int i3 = (int) j3;
            if (j4 == 0) {
                bArr[i2] = (byte) i3;
                this.c = i + 2;
                return;
            }
            bArr[i2] = (byte) (i3 | 128);
            int i4 = i + 2;
            long j5 = j >>> 14;
            long j6 = j5 & (-128);
            int i5 = (int) j5;
            if (j6 == 0) {
                bArr[i4] = (byte) i5;
                this.c = i + 3;
                return;
            }
            bArr[i4] = (byte) (i5 | 128);
            int i6 = i + 3;
            long j7 = j >>> 21;
            long j8 = j7 & (-128);
            int i7 = (int) j7;
            if (j8 == 0) {
                bArr[i6] = (byte) i7;
                this.c = i + 4;
                return;
            }
            bArr[i6] = (byte) (i7 | 128);
            int i8 = i + 4;
            long j9 = j >>> 28;
            long j10 = j9 & (-128);
            int i9 = (int) j9;
            if (j10 == 0) {
                bArr[i8] = (byte) i9;
                this.c = i + 5;
                return;
            }
            bArr[i8] = (byte) (i9 | 128);
            int i10 = i + 5;
            long j11 = j >>> 35;
            long j12 = j11 & (-128);
            int i11 = (int) j11;
            if (j12 == 0) {
                bArr[i10] = (byte) i11;
                this.c = i + 6;
                return;
            }
            bArr[i10] = (byte) (i11 | 128);
            int i12 = i + 6;
            long j13 = j >>> 42;
            long j14 = j13 & (-128);
            int i13 = (int) j13;
            if (j14 == 0) {
                bArr[i12] = (byte) i13;
                this.c = i + 7;
                return;
            }
            bArr[i12] = (byte) (i13 | 128);
            int i14 = i + 7;
            long j15 = j >>> 49;
            long j16 = j15 & (-128);
            int i15 = (int) j15;
            if (j16 == 0) {
                bArr[i14] = (byte) i15;
                this.c = i + 8;
                return;
            }
            bArr[i14] = (byte) (i15 | 128);
            int i16 = i + 8;
            long j17 = j >>> 56;
            int i17 = (int) j17;
            if (((-128) & j17) == 0) {
                bArr[i16] = (byte) i17;
                this.c = i + 9;
            } else {
                bArr[i16] = (byte) (i17 | 128);
                bArr[i + 9] = (byte) (j >>> 63);
                this.c = i + 10;
            }
        } catch (IndexOutOfBoundsException e) {
            throw new ou8(i, this.b, 1, e);
        }
    }

    public void a(int i) {
        int i2 = this.b;
        int i3 = this.c;
        boolean z = false;
        if (i <= i3 && i2 <= i) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbJ = fx3.j(i, i2, "Invalid offset: ", ". Valid range is [", " , ");
        sbJ.append(i3);
        sbJ.append("]");
        li3.a(sbJ.toString());
    }

    public void j() throws IOException {
        u();
    }

    public int k() {
        rr0 rr0Var = (rr0) this.e;
        String str = (String) this.d;
        if (rr0Var == null) {
            return str.length();
        }
        return (rr0Var.b - rr0Var.f()) + (str.length() - (this.c - this.b));
    }

    public boolean l(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = this.b + 1;
        if (i > this.c || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i))) {
            int i3 = i - 1;
            if (!Character.isSurrogate(charSequence.charAt(i3))) {
                if (!a92.d()) {
                    return false;
                }
                a92 a92VarA = a92.a();
                if (a92VarA.c() != 1 || a92VarA.b(i3, charSequence) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean m(int i) {
        int i2 = this.b + 1;
        if (i > this.c || i2 > i) {
            return false;
        }
        return x37.o(Character.codePointBefore((CharSequence) this.d, i));
    }

    public boolean n(int i) {
        a(i);
        if (!((BreakIterator) this.e).isBoundary(i)) {
            return false;
        }
        if (p(i) && p(i - 1) && p(i + 1)) {
            return false;
        }
        return i <= 0 || i >= ((CharSequence) this.d).length() - 1 || !(o(i) || o(i + 1));
    }

    public boolean o(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = i - 1;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(charSequence.charAt(i2));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (im3.n(unicodeBlockOf, unicodeBlock) && im3.n(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return im3.n(Character.UnicodeBlock.of(charSequence.charAt(i)), unicodeBlock) && im3.n(Character.UnicodeBlock.of(charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA);
    }

    public boolean p(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = this.b;
        if (i >= this.c || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i)) && !Character.isSurrogate(charSequence.charAt(i))) {
            if (!a92.d()) {
                return false;
            }
            a92 a92VarA = a92.a();
            if (a92VarA.c() != 1 || a92VarA.b(i, charSequence) == -1) {
                return false;
            }
        }
        return true;
    }

    public boolean q(int i) {
        int i2 = this.b;
        if (i >= this.c || i2 > i) {
            return false;
        }
        return x37.o(Character.codePointAt((CharSequence) this.d, i));
    }

    public int s(int i) {
        a(i);
        int iFollowing = ((BreakIterator) this.e).following(i);
        return (p(iFollowing + (-1)) && p(iFollowing) && !o(iFollowing)) ? s(iFollowing) : iFollowing;
    }

    public int t(int i) {
        a(i);
        int iPreceding = ((BreakIterator) this.e).preceding(i);
        return (p(iPreceding) && l(iPreceding) && !o(iPreceding)) ? t(iPreceding) : iPreceding;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                rr0 rr0Var = (rr0) this.e;
                String str = (String) this.d;
                if (rr0Var == null) {
                    return str;
                }
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) str, 0, this.b);
                sb.append((char[]) rr0Var.e, 0, rr0Var.c);
                char[] cArr = (char[]) rr0Var.e;
                int i = rr0Var.d;
                sb.append(cArr, i, rr0Var.b - i);
                String str2 = (String) this.d;
                sb.append((CharSequence) str2, this.c, str2.length());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void u() throws IOException {
        ((OutputStream) this.e).write((byte[]) this.d, 0, this.c);
        this.c = 0;
    }

    public void v(int i, int i2, String str) {
        if (i > i2) {
            li3.a("start index must be less than or equal to end index: " + i + " > " + i2);
        }
        if (i < 0) {
            li3.a("start must be non-negative, but was " + i);
        }
        rr0 rr0Var = (rr0) this.e;
        if (rr0Var == null) {
            int iMax = Math.max(255, str.length() + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i, 64);
            int iMin2 = Math.min(((String) this.d).length() - i2, 64);
            String str2 = (String) this.d;
            int i3 = i - iMin;
            str2.getClass();
            str2.getChars(i3, i, cArr, 0);
            String str3 = (String) this.d;
            int i4 = iMax - iMin2;
            int i5 = iMin2 + i2;
            str3.getClass();
            str3.getChars(i2, i5, cArr, i4);
            str.getChars(0, str.length(), cArr, iMin);
            int length = str.length() + iMin;
            rr0 rr0Var2 = new rr0((byte) 1);
            rr0Var2.b = iMax;
            rr0Var2.e = cArr;
            rr0Var2.c = length;
            rr0Var2.d = i4;
            this.e = rr0Var2;
            this.b = i3;
            this.c = i5;
            return;
        }
        int i6 = this.b;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 < 0 || i8 > rr0Var.b - rr0Var.f()) {
            this.d = toString();
            this.e = null;
            this.b = -1;
            this.c = -1;
            v(i, i2, str);
            return;
        }
        int length2 = str.length() - (i8 - i7);
        if (length2 > rr0Var.f()) {
            int iF = length2 - rr0Var.f();
            int i9 = rr0Var.b;
            do {
                i9 *= 2;
            } while (i9 - rr0Var.b < iF);
            char[] cArr2 = new char[i9];
            System.arraycopy((char[]) rr0Var.e, 0, cArr2, 0, rr0Var.c);
            int i10 = rr0Var.b;
            int i11 = rr0Var.d;
            int i12 = i10 - i11;
            int i13 = i9 - i12;
            System.arraycopy((char[]) rr0Var.e, i11, cArr2, i13, (i12 + i11) - i11);
            rr0Var.e = cArr2;
            rr0Var.b = i9;
            rr0Var.d = i13;
        }
        int i14 = rr0Var.c;
        if (i7 < i14 && i8 <= i14) {
            int i15 = i14 - i8;
            char[] cArr3 = (char[]) rr0Var.e;
            System.arraycopy(cArr3, i8, cArr3, rr0Var.d - i15, i15);
            rr0Var.c = i7;
            rr0Var.d -= i15;
        } else if (i7 >= i14 || i8 < i14) {
            int iF2 = rr0Var.f() + i7;
            int iF3 = rr0Var.f() + i8;
            int i16 = rr0Var.d;
            int i17 = iF2 - i16;
            char[] cArr4 = (char[]) rr0Var.e;
            System.arraycopy(cArr4, i16, cArr4, rr0Var.c, i17);
            i7 = rr0Var.c + i17;
            rr0Var.c = i7;
            rr0Var.d = iF3;
        } else {
            rr0Var.d = rr0Var.f() + i8;
            rr0Var.c = i7;
        }
        str.getChars(0, str.length(), (char[]) rr0Var.e, i7);
        rr0Var.c = str.length() + rr0Var.c;
    }

    public void w(int i, int i2) throws IOException {
        I(i, 0);
        y(i2);
    }

    public void x(int i, int i2) throws IOException {
        I(i, 0);
        y(i2);
    }

    public void y(int i) throws IOException {
        if (i >= 0) {
            G(i);
        } else {
            H(i);
        }
    }

    public void z(int i, t1 t1Var) throws IOException {
        I(i, 2);
        A(t1Var);
    }

    public cv0(byte[] bArr, int i) {
        this.a = (byte) 4;
        int length = bArr.length;
        if (((length - i) | i) >= 0) {
            this.d = bArr;
            this.c = 0;
            this.b = i;
        } else {
            Locale locale = Locale.US;
            hk0.g(ua5.l("Array range is invalid. Buffer.length=", length, i, ", offset=0, length="));
            throw null;
        }
    }

    public /* synthetic */ cv0() {
        this.a = (byte) 1;
    }

    public cv0(String str, int i, int i2, String str2) {
        this.a = (byte) 2;
        this.b = i;
        this.d = str;
        this.c = i2;
        this.e = str2;
    }

    public cv0(OutputStream outputStream, byte[] bArr) {
        this.a = (byte) 0;
        this.e = outputStream;
        this.d = bArr;
        this.c = 0;
        this.b = bArr.length;
    }
}
