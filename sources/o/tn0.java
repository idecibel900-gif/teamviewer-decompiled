package o;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.UncheckedIOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class tn0 implements AutoCloseable {
    public static final a65 w = new a65(new sn0(0));
    public static final a65 x = new a65(new sn0(1));
    public String[] m;
    public Reader n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public char[] f2125o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public r94 v;

    public tn0(Reader reader) {
        this.r = 0;
        this.t = -1;
        this.v = null;
        this.n = reader;
        this.f2125o = (char[]) x.W();
        this.m = (String[]) w.W();
        j();
    }

    public static String q(char[] cArr, String[] strArr, int i, int i2) {
        if (i2 > 12) {
            return new String(cArr, i, i2);
        }
        if (i2 < 1) {
            return "";
        }
        int i3 = i2 + i;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = i; i6 < i3; i6++) {
            i5 = (i5 * 31) + cArr[i6];
        }
        int i7 = i5 & 511;
        String str = strArr[i7];
        if (str != null && i2 == str.length()) {
            int i8 = i;
            int i9 = i2;
            while (true) {
                int i10 = i9 - 1;
                if (i9 == 0) {
                    return str;
                }
                int i11 = i8 + 1;
                int i12 = i4 + 1;
                if (cArr[i8] == str.charAt(i4)) {
                    i8 = i11;
                    i9 = i10;
                    i4 = i12;
                }
            }
        }
        String str2 = new String(cArr, i, i2);
        strArr[i7] = str2;
        return str2;
    }

    public final String F(int i, int i2) {
        this.p = i2;
        return i2 > i ? q(this.f2125o, this.m, i, i2 - i) : "";
    }

    public final String G(char c) {
        int i;
        j();
        int i2 = this.p;
        while (true) {
            if (i2 >= this.q) {
                i = -1;
                break;
            }
            if (c == this.f2125o[i2]) {
                i = i2 - this.p;
                break;
            }
            i2++;
        }
        if (i == -1) {
            return Y();
        }
        String strQ = q(this.f2125o, this.m, this.p, i);
        this.p += i;
        return strQ;
    }

    public final boolean H0() {
        if (c0()) {
            return false;
        }
        return lb7.e(this.f2125o[this.p]);
    }

    public final String J(char c, char c2, char c3) {
        j();
        int i = this.p;
        int i2 = this.q;
        char[] cArr = this.f2125o;
        int i3 = i;
        while (i3 < i2) {
            char c4 = cArr[i3];
            if (c4 == c || c4 == c2 || c4 == c3) {
                break;
            }
            i3++;
        }
        return F(i, i3);
    }

    public final boolean K0(String str) {
        j();
        int length = str.length();
        int i = this.q;
        int i2 = this.p;
        if (length > i - i2) {
            return false;
        }
        for (int i3 = 0; i3 < str.length(); i3++) {
            char cCharAt = str.charAt(i3);
            char c = this.f2125o[i2 + i3];
            if (cCharAt != c && Character.toUpperCase(cCharAt) != Character.toUpperCase(c)) {
                return false;
            }
        }
        return true;
    }

    public final int L0() {
        return Math.min(this.p, this.q) + this.s;
    }

    public final String M0() {
        int i;
        StringBuilder sb = new StringBuilder();
        int iL0 = L0();
        r94 r94Var = this.v;
        int i2 = -1;
        if (r94Var == null) {
            i = 1;
        } else if (iL0 < 0) {
            r94Var.getClass();
            i = -1;
        } else {
            int iBinarySearch = Arrays.binarySearch(r94Var.a, 0, r94Var.b, iL0);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            i = iBinarySearch + 2;
        }
        sb.append(i);
        sb.append(":");
        int iL1 = L0();
        r94 r94Var2 = this.v;
        if (r94Var2 == null) {
            i2 = iL1 + 1;
        } else if (iL1 < 0) {
            r94Var2.getClass();
        } else {
            int iBinarySearch2 = Arrays.binarySearch(r94Var2.a, 0, r94Var2.b, iL1);
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-iBinarySearch2) - 2;
            }
            if (iBinarySearch2 != -1) {
                iL1 -= r94Var2.a[iBinarySearch2];
            }
            i2 = iL1 + 1;
        }
        sb.append(i2);
        return sb.toString();
    }

    public final void N0() {
        int i = this.t;
        if (i == -1) {
            throw new UncheckedIOException(new IOException("Mark invalid"));
        }
        this.p = i;
        this.t = -1;
    }

    public final void O0() {
        int i = this.p;
        if (i < 1) {
            throw new UncheckedIOException(new IOException("WTF: No buffer left to unconsume."));
        }
        this.p = i - 1;
    }

    public final String Y() {
        j();
        char[] cArr = this.f2125o;
        String[] strArr = this.m;
        int i = this.p;
        String strQ = q(cArr, strArr, i, this.q - i);
        this.p = this.q;
        return strQ;
    }

    public final char b0() {
        j();
        int i = this.p;
        if (i >= this.q) {
            return (char) 65535;
        }
        return this.f2125o[i];
    }

    public final boolean c0() {
        j();
        return this.p >= this.q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.AutoCloseable
    public final void close() {
        a65 a65Var = w;
        a65 a65Var2 = x;
        Reader reader = this.n;
        if (reader == null) {
            return;
        }
        try {
            reader.close();
            this.n = null;
            Arrays.fill(this.f2125o, (char) 0);
            a65Var2.R0(this.f2125o);
            this.f2125o = null;
            a65Var.R0(this.m);
        } catch (IOException unused) {
            this.n = null;
            Arrays.fill(this.f2125o, (char) 0);
            a65Var2.R0(this.f2125o);
            this.f2125o = null;
            a65Var.R0(this.m);
        } finally {
            this.n = null;
            Arrays.fill(this.f2125o, (char) 0);
            a65Var2.R0(this.f2125o);
            this.f2125o = null;
            a65Var.R0(this.m);
            this.m = null;
            this.v = null;
        }
    }

    public final void e() {
        this.p++;
    }

    public final void j() {
        int i;
        if (this.u || (i = this.p) < this.r || this.t != -1) {
            return;
        }
        this.s += i;
        int i2 = this.q - i;
        this.q = i2;
        if (i2 > 0) {
            char[] cArr = this.f2125o;
            System.arraycopy(cArr, i, cArr, 0, i2);
        }
        this.p = 0;
        while (true) {
            int i3 = this.q;
            if (i3 >= 2048) {
                break;
            }
            try {
                Reader reader = this.n;
                char[] cArr2 = this.f2125o;
                int i4 = reader.read(cArr2, i3, cArr2.length - i3);
                if (i4 == -1) {
                    this.u = true;
                    break;
                } else if (i4 == 0) {
                    break;
                } else {
                    this.q += i4;
                }
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }
        this.r = Math.min(this.q, 1024);
        if (this.v != null) {
            for (int i5 = this.p; i5 < this.q; i5++) {
                if (this.f2125o[i5] == '\n') {
                    int i6 = this.s + 1 + i5;
                    r94 r94Var = this.v;
                    int i7 = r94Var.b;
                    if (i7 == 0 || i6 > r94Var.a[i7 - 1]) {
                        int i8 = i7 + 1;
                        int[] iArrCopyOf = r94Var.a;
                        if (iArrCopyOf.length < i8) {
                            int length = iArrCopyOf.length == 0 ? 16 : iArrCopyOf.length * 2;
                            if (length >= i8) {
                                i8 = length;
                            }
                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i8);
                            r94Var.a = iArrCopyOf;
                        }
                        int i9 = r94Var.b;
                        r94Var.b = i9 + 1;
                        iArrCopyOf[i9] = i6;
                    }
                }
            }
        }
    }

    public final boolean k0(String str) {
        j();
        j();
        int length = str.length();
        if (length <= this.q - this.p) {
            for (int i = 0; i < length; i++) {
                if (str.charAt(i) == this.f2125o[this.p + i]) {
                }
            }
            this.p = str.length() + this.p;
            return true;
        }
        return false;
    }

    public final boolean l0(String str) {
        if (!K0(str)) {
            return false;
        }
        this.p = str.length() + this.p;
        return true;
    }

    public final boolean o0(char c) {
        return !c0() && this.f2125o[this.p] == c;
    }

    public final String toString() {
        int i = this.q;
        int i2 = this.p;
        return i - i2 < 0 ? "" : new String(this.f2125o, i2, i - i2);
    }

    public final char u() {
        j();
        int i = this.p;
        char c = i >= this.q ? (char) 65535 : this.f2125o[i];
        this.p = i + 1;
        return c;
    }

    public final boolean x0(char... cArr) {
        if (!c0()) {
            j();
            char c = this.f2125o[this.p];
            for (char c2 : cArr) {
                if (c2 == c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String z() {
        j();
        int i = this.p;
        int i2 = this.q;
        char[] cArr = this.f2125o;
        int i3 = i;
        while (i3 < i2 && lb7.e(cArr[i3])) {
            i3++;
        }
        this.p = i3;
        return i3 > i ? q(this.f2125o, this.m, i, i3 - i) : "";
    }

    public tn0(String str) {
        this(new StringReader(str));
    }
}
