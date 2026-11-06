package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class or3 extends kr3 {
    public static final ai0 x;
    public static final ai0 y;
    public static final ai0 z;
    public final w36 r;
    public final bf0 s;
    public int t;
    public long u;
    public int v;
    public String w;

    static {
        ai0 ai0Var = ai0.p;
        x = ju.s("'\\");
        y = ju.s("\"\\");
        z = ju.s("{}[]:, \n\t\r\f/\\;#=");
        ju.s("\n\r");
        ju.s("*/");
    }

    public or3(w36 w36Var) {
        this.n = new int[32];
        this.f1297o = new String[32];
        this.p = new int[32];
        this.t = 0;
        this.r = w36Var;
        this.s = w36Var.n;
        u(6);
    }

    @Override // o.kr3
    public final void A0() throws sq3, EOFException {
        int iY = this.t;
        if (iY == 0) {
            iY = Y();
        }
        if (iY != 4) {
            hk0.d(e41.w(q()), e(), "Expected END_ARRAY but was ");
            return;
        }
        int i = this.m;
        this.m = i - 1;
        int[] iArr = this.p;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.t = 0;
    }

    @Override // o.kr3
    public final void D0() throws sq3, EOFException {
        int iY = this.t;
        if (iY == 0) {
            iY = Y();
        }
        if (iY != 3) {
            hk0.d(e41.w(q()), e(), "Expected BEGIN_ARRAY but was ");
            return;
        }
        u(1);
        this.p[this.m - 1] = 0;
        this.t = 0;
    }

    @Override // o.kr3
    public final void F() throws sq3, EOFException {
        int iY = this.t;
        if (iY == 0) {
            iY = Y();
        }
        if (iY == 14) {
            long jT = this.r.T(z);
            bf0 bf0Var = this.s;
            if (jT == -1) {
                jT = bf0Var.n;
            }
            bf0Var.skip(jT);
        } else if (iY == 13) {
            H0(y);
        } else if (iY == 12) {
            H0(x);
        } else if (iY != 15) {
            hk0.d(e41.w(q()), e(), "Expected a name but was ");
            return;
        }
        this.t = 0;
        this.f1297o[this.m - 1] = "null";
    }

    public final void H0(ai0 ai0Var) throws sq3, EOFException {
        while (true) {
            long jT = this.r.T(ai0Var);
            if (jT == -1) {
                G("Unterminated string");
                throw null;
            }
            bf0 bf0Var = this.s;
            if (bf0Var.F(jT) != 92) {
                bf0Var.skip(jT + 1);
                return;
            } else {
                bf0Var.skip(jT + 1);
                x0();
            }
        }
    }

    public final void J() throws sq3 {
        G("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    public final String U() throws sq3, EOFException {
        String strL0;
        int iY = this.t;
        if (iY == 0) {
            iY = Y();
        }
        if (iY == 14) {
            strL0 = o0();
        } else if (iY == 13) {
            strL0 = l0(y);
        } else if (iY == 12) {
            strL0 = l0(x);
        } else {
            if (iY != 15) {
                hk0.d(e41.w(q()), e(), "Expected a name but was ");
                return null;
            }
            strL0 = this.w;
        }
        this.t = 0;
        this.f1297o[this.m - 1] = strL0;
        return strL0;
    }

    /* JADX WARN: Code duplicated, block: B:148:0x01c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:149:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:162:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:164:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:167:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:172:0x01fa A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:173:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:175:0x0207  */
    /* JADX WARN: Code duplicated, block: B:177:0x020d  */
    /* JADX WARN: Code duplicated, block: B:230:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x01a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x011f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:88:0x0120  */
    /* JADX WARN: Code duplicated, block: B:92:0x0132  */
    /* JADX WARN: Code duplicated, block: B:94:0x013b  */
    public final int Y() throws sq3, EOFException {
        int i;
        String str;
        String str2;
        long j;
        char cF;
        int i2;
        int i3;
        int i4;
        int i5;
        byte bF;
        int i6;
        int[] iArr = this.n;
        int i7 = this.m - 1;
        int i8 = iArr[i7];
        int i9 = 0;
        bf0 bf0Var = this.s;
        if (i8 == 1) {
            iArr[i7] = 2;
        } else if (i8 == 2) {
            int iK0 = k0(true);
            bf0Var.c0();
            if (iK0 != 44) {
                if (iK0 == 59) {
                    J();
                    throw null;
                }
                if (iK0 == 93) {
                    this.t = 4;
                    return 4;
                }
                G("Unterminated array");
                throw null;
            }
        } else {
            if (i8 == 3 || i8 == 5) {
                iArr[i7] = 4;
                if (i8 == 5) {
                    int iK1 = k0(true);
                    bf0Var.c0();
                    if (iK1 != 44) {
                        if (iK1 == 59) {
                            J();
                            throw null;
                        }
                        if (iK1 == 125) {
                            this.t = 2;
                            return 2;
                        }
                        G("Unterminated object");
                        throw null;
                    }
                }
                int iK2 = k0(true);
                if (iK2 == 34) {
                    bf0Var.c0();
                    this.t = 13;
                    return 13;
                }
                if (iK2 == 39) {
                    bf0Var.c0();
                    J();
                    throw null;
                }
                if (iK2 != 125) {
                    J();
                    throw null;
                }
                if (i8 == 5) {
                    G("Expected name");
                    throw null;
                }
                bf0Var.c0();
                this.t = 2;
                return 2;
            }
            if (i8 == 4) {
                iArr[i7] = 5;
                int iK3 = k0(true);
                bf0Var.c0();
                if (iK3 != 58) {
                    if (iK3 != 61) {
                        G("Expected ':'");
                        throw null;
                    }
                    J();
                    throw null;
                }
            } else if (i8 == 6) {
                iArr[i7] = 7;
            } else {
                if (i8 == 7) {
                    if (k0(false) == -1) {
                        this.t = 18;
                        return 18;
                    }
                    J();
                    throw null;
                }
                if (i8 == 8) {
                    hk0.l("JsonReader is closed");
                    return 0;
                }
            }
        }
        int iK4 = k0(true);
        if (iK4 == 34) {
            bf0Var.c0();
            this.t = 9;
            return 9;
        }
        if (iK4 == 39) {
            J();
            throw null;
        }
        if (iK4 != 44 && iK4 != 59) {
            if (iK4 == 91) {
                bf0Var.c0();
                this.t = 3;
                return 3;
            }
            if (iK4 != 93) {
                if (iK4 == 123) {
                    bf0Var.c0();
                    this.t = 1;
                    return 1;
                }
                byte bF2 = bf0Var.F(0L);
                w36 w36Var = this.r;
                if (bF2 == 116 || bF2 == 84) {
                    i = 5;
                    str2 = "true";
                    str = "TRUE";
                } else {
                    if (bF2 != 102 && bF2 != 70) {
                        if (bF2 == 110 || bF2 == 78) {
                            i = 7;
                            str2 = "null";
                            str = "NULL";
                        } else {
                            j = 0;
                            i = 0;
                            i9 = 0;
                        }
                        if (i != 0) {
                            return i;
                        }
                        int i10 = 1;
                        i2 = i9;
                        i3 = i2;
                        int i11 = i3;
                        long j2 = j;
                        while (true) {
                            i4 = i3 + 1;
                            if (w36Var.m0(i4)) {
                                bF = bf0Var.F(i3);
                                if (bF != 43) {
                                    if (bF != 69 || bF == 101) {
                                        i6 = 6;
                                        if (i2 != 2 || i2 == 4) {
                                            i2 = 5;
                                            i3 = i4;
                                        } else {
                                            i5 = i9;
                                        }
                                    } else if (bF == 45) {
                                        i6 = 6;
                                        if (i2 == 0) {
                                            i2 = 1;
                                            i11 = 1;
                                        } else {
                                            if (i2 != 5) {
                                                i5 = i9;
                                            }
                                            i2 = i6;
                                        }
                                        i3 = i4;
                                    } else if (bF != 46) {
                                        if (bF >= 48 && bF <= 57) {
                                            if (i2 == 1 || i2 == 0) {
                                                i6 = 6;
                                                j2 = -(bF - 48);
                                                i2 = 2;
                                            } else {
                                                if (i2 == 2) {
                                                    if (j2 != j) {
                                                        long j3 = (10 * j2) - ((long) (bF - 48));
                                                        i10 &= (j2 > -922337203685477580L || (j2 == -922337203685477580L && j3 < j2)) ? 1 : i9;
                                                        j2 = j3;
                                                    }
                                                } else if (i2 == 3) {
                                                    i2 = 4;
                                                } else {
                                                    i6 = 6;
                                                    if (i2 == 5 || i2 == 6) {
                                                        i2 = 7;
                                                    }
                                                }
                                                i6 = 6;
                                                i3 = i4;
                                            }
                                            i3 = i4;
                                        } else if (!c0(bF)) {
                                        }
                                        i5 = i9;
                                    } else {
                                        i6 = 6;
                                        if (i2 == 2) {
                                            i2 = 3;
                                            i3 = i4;
                                        } else {
                                            i5 = i9;
                                        }
                                    }
                                    if (i5 != 0) {
                                        return i5;
                                    }
                                    if (c0(bf0Var.F(j))) {
                                        J();
                                        throw null;
                                    }
                                    G("Expected value");
                                    throw null;
                                }
                                i6 = 6;
                                if (i2 != 5) {
                                    i5 = i9;
                                    if (i5 != 0) {
                                        return i5;
                                    }
                                    if (c0(bf0Var.F(j))) {
                                        G("Expected value");
                                        throw null;
                                    }
                                    J();
                                    throw null;
                                }
                                i2 = i6;
                                i3 = i4;
                            }
                            if (i2 != 2 && i10 != 0 && ((j2 != Long.MIN_VALUE || i11 != 0) && (j2 != j || i11 == 0))) {
                                if (i11 == 0) {
                                    j2 = -j2;
                                }
                                this.u = j2;
                                bf0Var.skip(i3);
                                i5 = 16;
                                this.t = 16;
                            } else if (i2 != 2 || i2 == 4 || i2 == 7) {
                                this.v = i3;
                                i5 = 17;
                                this.t = 17;
                            } else {
                                i5 = i9;
                            }
                            if (i5 != 0) {
                                return i5;
                            }
                            if (c0(bf0Var.F(j))) {
                                G("Expected value");
                                throw null;
                            }
                            J();
                            throw null;
                        }
                    }
                    i = 6;
                    str2 = "false";
                    str = "FALSE";
                }
                int length = str2.length();
                j = 0;
                int i12 = 1;
                while (true) {
                    if (i12 >= length) {
                        if (!w36Var.m0(length + 1) || !c0(bf0Var.F(length))) {
                            bf0Var.skip(length);
                            this.t = i;
                            break;
                        }
                    } else {
                        int i13 = i12 + 1;
                        if (w36Var.m0(i13) && ((cF = bf0Var.F(i12)) == str2.charAt(i12) || cF == str.charAt(i12))) {
                            i12 = i13;
                        }
                    }
                    i = i9;
                    break;
                }
                if (i != 0) {
                    return i;
                }
                int i14 = 1;
                i2 = i9;
                i3 = i2;
                int i15 = i3;
                long j4 = j;
                while (true) {
                    i4 = i3 + 1;
                    if (w36Var.m0(i4)) {
                        bF = bf0Var.F(i3);
                        if (bF != 43) {
                            if (bF != 69) {
                                i6 = 6;
                                if (i2 != 2) {
                                }
                                i2 = 5;
                                i3 = i4;
                            } else {
                                i6 = 6;
                                if (i2 != 2) {
                                }
                                i2 = 5;
                                i3 = i4;
                            }
                            if (i5 != 0) {
                                return i5;
                            }
                            if (c0(bf0Var.F(j))) {
                                G("Expected value");
                                throw null;
                            }
                            J();
                            throw null;
                        }
                        i6 = 6;
                        if (i2 != 5) {
                            i5 = i9;
                            if (i5 != 0) {
                                return i5;
                            }
                            if (c0(bf0Var.F(j))) {
                                G("Expected value");
                                throw null;
                            }
                            J();
                            throw null;
                        }
                        i2 = i6;
                        i3 = i4;
                    }
                    if (i2 != 2) {
                        if (i2 != 2) {
                        }
                        this.v = i3;
                        i5 = 17;
                        this.t = 17;
                    } else {
                        if (i2 != 2) {
                        }
                        this.v = i3;
                        i5 = 17;
                        this.t = 17;
                    }
                    if (i5 != 0) {
                        return i5;
                    }
                    if (c0(bf0Var.F(j))) {
                        G("Expected value");
                        throw null;
                    }
                    J();
                    throw null;
                }
            }
            if (i8 == 1) {
                bf0Var.c0();
                this.t = 4;
                return 4;
            }
        }
        if (i8 == 1 || i8 == 2) {
            J();
            throw null;
        }
        G("Unexpected value");
        throw null;
    }

    @Override // o.kr3
    public final void Z() throws sq3, EOFException {
        int iY = this.t;
        if (iY == 0) {
            iY = Y();
        }
        if (iY != 2) {
            hk0.d(e41.w(q()), e(), "Expected END_OBJECT but was ");
            return;
        }
        int i = this.m;
        int i2 = i - 1;
        this.m = i2;
        this.f1297o[i2] = null;
        int[] iArr = this.p;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.t = 0;
    }

    public final int b0(String str, jr3 jr3Var) {
        int length = jr3Var.a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(jr3Var.a[i])) {
                this.t = 0;
                this.f1297o[this.m - 1] = str;
                return i;
            }
        }
        return -1;
    }

    public final boolean c0(int i) throws sq3 {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        J();
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.t = 0;
        this.n[0] = 8;
        this.m = 1;
        this.s.e();
        this.r.close();
    }

    @Override // o.kr3
    public final boolean hasNext() throws sq3, EOFException {
        int iY = this.t;
        if (iY == 0) {
            iY = Y();
        }
        return (iY == 2 || iY == 4 || iY == 18) ? false : true;
    }

    @Override // o.kr3
    public final boolean j() throws sq3, EOFException {
        int iY = this.t;
        if (iY == 0) {
            iY = Y();
        }
        if (iY == 5) {
            this.t = 0;
            int[] iArr = this.p;
            int i = this.m - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iY != 6) {
            hk0.d(e41.w(q()), e(), "Expected a boolean but was ");
            return false;
        }
        this.t = 0;
        int[] iArr2 = this.p;
        int i2 = this.m - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return false;
    }

    public final int k0(boolean z2) throws sq3, EOFException {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            w36 w36Var = this.r;
            if (!w36Var.m0(i2)) {
                if (z2) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j = i;
            bf0 bf0Var = this.s;
            byte bF = bf0Var.F(j);
            if (bF != 10 && bF != 32 && bF != 13 && bF != 9) {
                bf0Var.skip(j);
                if (bF == 47) {
                    if (w36Var.m0(2L)) {
                        J();
                        throw null;
                    }
                } else if (bF == 35) {
                    J();
                    throw null;
                }
                return bF;
            }
            i = i2;
        }
    }

    public final String l0(ai0 ai0Var) throws sq3, EOFException {
        StringBuilder sb = null;
        while (true) {
            long jT = this.r.T(ai0Var);
            if (jT == -1) {
                G("Unterminated string");
                throw null;
            }
            bf0 bf0Var = this.s;
            if (bf0Var.F(jT) != 92) {
                if (sb == null) {
                    String strM0 = bf0Var.M0(jT, vn0.a);
                    bf0Var.c0();
                    return strM0;
                }
                sb.append(bf0Var.M0(jT, vn0.a));
                bf0Var.c0();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(bf0Var.M0(jT, vn0.a));
            bf0Var.c0();
            sb.append(x0());
        }
    }

    @Override // o.kr3
    public final double nextDouble() throws sq3, EOFException {
        int iY = this.t;
        if (iY == 0) {
            iY = Y();
        }
        if (iY == 16) {
            this.t = 0;
            int[] iArr = this.p;
            int i = this.m - 1;
            iArr[i] = iArr[i] + 1;
            return this.u;
        }
        if (iY == 17) {
            long j = this.v;
            bf0 bf0Var = this.s;
            bf0Var.getClass();
            this.w = bf0Var.M0(j, vn0.a);
        } else if (iY == 9) {
            this.w = l0(y);
        } else if (iY == 8) {
            this.w = l0(x);
        } else if (iY == 10) {
            this.w = o0();
        } else if (iY != 11) {
            hk0.d(e41.w(q()), e(), "Expected a double but was ");
            return 0.0d;
        }
        this.t = 11;
        try {
            double d = Double.parseDouble(this.w);
            if (Double.isNaN(d) || Double.isInfinite(d)) {
                throw new sq3("JSON forbids NaN and infinities: " + d + " at path " + e());
            }
            this.w = null;
            this.t = 0;
            int[] iArr2 = this.p;
            int i2 = this.m - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return d;
        } catch (NumberFormatException unused) {
            hk0.d(this.w, e(), "Expected a double but was ");
            return 0.0d;
        }
    }

    @Override // o.kr3
    public final int nextInt() throws sq3, EOFException {
        int iY = this.t;
        if (iY == 0) {
            iY = Y();
        }
        if (iY == 16) {
            long j = this.u;
            int i = (int) j;
            if (j == i) {
                this.t = 0;
                int[] iArr = this.p;
                int i2 = this.m - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new hq3("Expected an int but was " + this.u + " at path " + e());
        }
        if (iY == 17) {
            long j2 = this.v;
            bf0 bf0Var = this.s;
            bf0Var.getClass();
            this.w = bf0Var.M0(j2, vn0.a);
        } else if (iY == 9 || iY == 8) {
            String strL0 = iY == 9 ? l0(y) : l0(x);
            this.w = strL0;
            try {
                int i3 = Integer.parseInt(strL0);
                this.t = 0;
                int[] iArr2 = this.p;
                int i4 = this.m - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        } else if (iY != 11) {
            hk0.d(e41.w(q()), e(), "Expected an int but was ");
            return 0;
        }
        this.t = 11;
        try {
            double d = Double.parseDouble(this.w);
            int i5 = (int) d;
            if (i5 != d) {
                hk0.d(this.w, e(), "Expected an int but was ");
                return 0;
            }
            this.w = null;
            this.t = 0;
            int[] iArr3 = this.p;
            int i6 = this.m - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        } catch (NumberFormatException unused2) {
            hk0.d(this.w, e(), "Expected an int but was ");
            return 0;
        }
    }

    public final String o0() {
        long jT = this.r.T(z);
        bf0 bf0Var = this.s;
        if (jT == -1) {
            return bf0Var.N0();
        }
        bf0Var.getClass();
        return bf0Var.M0(jT, vn0.a);
    }

    @Override // o.kr3
    public final int q() throws sq3, EOFException {
        int iY = this.t;
        if (iY == 0) {
            iY = Y();
        }
        switch (iY) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case ep1.b /* 9 */:
            case ep1.c /* 10 */:
            case 11:
                return 6;
            case ep1.d /* 12 */:
            case 13:
            case 14:
            case 15:
                return 5;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case 17:
                return 7;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    @Override // o.kr3
    public final String r() throws sq3, EOFException {
        String strM0;
        int iY = this.t;
        if (iY == 0) {
            iY = Y();
        }
        if (iY == 10) {
            strM0 = o0();
        } else if (iY == 9) {
            strM0 = l0(y);
        } else if (iY == 8) {
            strM0 = l0(x);
        } else if (iY == 11) {
            strM0 = this.w;
            this.w = null;
        } else if (iY == 16) {
            strM0 = Long.toString(this.u);
        } else {
            if (iY != 17) {
                hk0.d(e41.w(q()), e(), "Expected a string but was ");
                return null;
            }
            long j = this.v;
            bf0 bf0Var = this.s;
            bf0Var.getClass();
            strM0 = bf0Var.M0(j, vn0.a);
        }
        this.t = 0;
        int[] iArr = this.p;
        int i = this.m - 1;
        iArr[i] = iArr[i] + 1;
        return strM0;
    }

    public final String toString() {
        return "JsonReader(" + this.r + ")";
    }

    @Override // o.kr3
    public final void u0() throws sq3, EOFException {
        int iY = this.t;
        if (iY == 0) {
            iY = Y();
        }
        if (iY != 1) {
            hk0.d(e41.w(q()), e(), "Expected BEGIN_OBJECT but was ");
        } else {
            u(3);
            this.t = 0;
        }
    }

    @Override // o.kr3
    public final void v() throws sq3, EOFException {
        int i = 0;
        do {
            int iY = this.t;
            if (iY == 0) {
                iY = Y();
            }
            if (iY == 3) {
                u(1);
            } else {
                if (iY == 1) {
                    u(3);
                } else if (iY == 4) {
                    i--;
                    if (i < 0) {
                        hk0.d(e41.w(q()), e(), "Expected a value but was ");
                        return;
                    }
                    this.m--;
                } else if (iY == 2) {
                    i--;
                    if (i < 0) {
                        hk0.d(e41.w(q()), e(), "Expected a value but was ");
                        return;
                    }
                    this.m--;
                } else {
                    bf0 bf0Var = this.s;
                    if (iY == 14 || iY == 10) {
                        long jT = this.r.T(z);
                        if (jT == -1) {
                            jT = bf0Var.n;
                        }
                        bf0Var.skip(jT);
                    } else if (iY == 9 || iY == 13) {
                        H0(y);
                    } else if (iY == 8 || iY == 12) {
                        H0(x);
                    } else if (iY == 17) {
                        bf0Var.skip(this.v);
                    } else if (iY == 18) {
                        hk0.d(e41.w(q()), e(), "Expected a value but was ");
                        return;
                    }
                }
                this.t = 0;
            }
            i++;
            this.t = 0;
        } while (i != 0);
        int[] iArr = this.p;
        int i2 = this.m - 1;
        iArr[i2] = iArr[i2] + 1;
        this.f1297o[i2] = "null";
    }

    public final char x0() throws sq3, EOFException {
        int i;
        w36 w36Var = this.r;
        if (!w36Var.m0(1L)) {
            G("Unterminated escape sequence");
            throw null;
        }
        bf0 bf0Var = this.s;
        byte bC0 = bf0Var.c0();
        if (bC0 == 10 || bC0 == 34 || bC0 == 39 || bC0 == 47 || bC0 == 92) {
            return (char) bC0;
        }
        if (bC0 == 98) {
            return '\b';
        }
        if (bC0 == 102) {
            return '\f';
        }
        if (bC0 == 110) {
            return '\n';
        }
        if (bC0 == 114) {
            return '\r';
        }
        if (bC0 == 116) {
            return '\t';
        }
        if (bC0 != 117) {
            G("Invalid escape sequence: \\" + ((char) bC0));
            throw null;
        }
        if (!w36Var.m0(4L)) {
            throw new EOFException("Unterminated escape sequence at path ".concat(e()));
        }
        char c = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            byte bF = bf0Var.F(i2);
            char c2 = (char) (c << 4);
            if (bF >= 48 && bF <= 57) {
                i = bF - 48;
            } else if (bF >= 97 && bF <= 102) {
                i = bF - 87;
            } else {
                if (bF < 65 || bF > 70) {
                    G("\\u".concat(bf0Var.M0(4L, vn0.a)));
                    throw null;
                }
                i = bF - 55;
            }
            c = (char) (i + c2);
        }
        bf0Var.skip(4L);
        return c;
    }

    @Override // o.kr3
    public final int z(jr3 jr3Var) throws sq3, EOFException {
        int iY = this.t;
        if (iY == 0) {
            iY = Y();
        }
        if (iY < 12 || iY > 15) {
            return -1;
        }
        if (iY == 15) {
            return b0(this.w, jr3Var);
        }
        int iI0 = this.r.I0(jr3Var.b);
        if (iI0 != -1) {
            this.t = 0;
            this.f1297o[this.m - 1] = jr3Var.a[iI0];
            return iI0;
        }
        String str = this.f1297o[this.m - 1];
        String strU = U();
        int iB0 = b0(strU, jr3Var);
        if (iB0 == -1) {
            this.t = 15;
            this.w = strU;
            this.f1297o[this.m - 1] = str;
        }
        return iB0;
    }
}
