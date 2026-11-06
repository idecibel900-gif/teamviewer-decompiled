package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class nr3 implements Closeable {
    public static final ai0 A;
    public static final ai0 B;
    public static final ai0 C;
    public static final ai0 y;
    public static final ai0 z;
    public int m;
    public int[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String[] f1596o;
    public int[] p;
    public boolean q;
    public boolean r;
    public final of0 s;
    public final bf0 t;
    public int u;
    public long v;
    public int w;
    public String x;

    static {
        ai0 ai0Var = ai0.p;
        y = ju.s("'\\");
        z = ju.s("\"\\");
        A = ju.s("{}[]:, \n\t\r\f/\\;#=");
        B = ju.s("\n\r");
        C = ju.s("*/");
    }

    public nr3(nr3 nr3Var) {
        this.m = nr3Var.m;
        this.n = (int[]) nr3Var.n.clone();
        this.f1596o = (String[]) nr3Var.f1596o.clone();
        this.p = (int[]) nr3Var.p.clone();
        this.q = nr3Var.q;
        this.r = nr3Var.r;
        this.u = 0;
        w36 w36VarPeek = nr3Var.s.peek();
        this.s = w36VarPeek;
        this.t = w36VarPeek.n;
        this.u = nr3Var.u;
        this.v = nr3Var.v;
        this.w = nr3Var.w;
        this.x = nr3Var.x;
        try {
            w36VarPeek.k0(nr3Var.t.n);
        } catch (IOException unused) {
            throw new AssertionError();
        }
    }

    public final void A0() throws qq3, EOFException {
        int iJ = this.u;
        if (iJ == 0) {
            iJ = j();
        }
        if (iJ != 4) {
            gk0.o("Expected END_ARRAY but was ", e41.v(c0()), " at path ", z());
            return;
        }
        int i = this.m;
        this.m = i - 1;
        int[] iArr = this.p;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.u = 0;
    }

    public final void D0() throws qq3, EOFException {
        int iJ = this.u;
        if (iJ == 0) {
            iJ = j();
        }
        if (iJ != 3) {
            gk0.o("Expected BEGIN_ARRAY but was ", e41.v(c0()), " at path ", z());
            return;
        }
        k0(1);
        this.p[this.m - 1] = 0;
        this.u = 0;
    }

    public final boolean F(int i) throws qq3 {
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
        e();
        return false;
    }

    public final int G(boolean z2) throws qq3, EOFException {
        of0 of0Var;
        long j;
        bf0 bf0Var;
        byte bF;
        while (true) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                of0Var = this.s;
                if (!of0Var.m0(i2)) {
                    if (z2) {
                        throw new EOFException("End of input");
                    }
                    return -1;
                }
                j = i;
                bf0Var = this.t;
                bF = bf0Var.F(j);
                if (bF == 10 || bF == 32 || bF == 13 || bF == 9) {
                    i = i2;
                }
            }
            bf0Var.skip(j);
            ai0 ai0Var = B;
            if (bF == 47) {
                if (of0Var.m0(2L)) {
                    e();
                    byte bF2 = bf0Var.F(1L);
                    if (bF2 == 42) {
                        bf0Var.c0();
                        bf0Var.c0();
                        ai0 ai0Var2 = C;
                        long jC = of0Var.C(ai0Var2);
                        boolean z3 = jC != -1;
                        bf0Var.skip(z3 ? jC + ((long) ai0Var2.m.length) : bf0Var.n);
                        if (!z3) {
                            L0("Unterminated comment");
                            throw null;
                        }
                    } else if (bF2 == 47) {
                        bf0Var.c0();
                        bf0Var.c0();
                        long jT = of0Var.T(ai0Var);
                        bf0Var.skip(jT != -1 ? jT + 1 : bf0Var.n);
                    }
                }
                return bF;
            }
            if (bF != 35) {
                return bF;
            }
            e();
            long jT2 = of0Var.T(ai0Var);
            bf0Var.skip(jT2 != -1 ? jT2 + 1 : bf0Var.n);
        }
    }

    public final void H0() throws qq3, EOFException {
        if (this.r) {
            int iC0 = c0();
            U();
            gk0.o("Cannot skip unexpected ", e41.v(iC0), " at ", z());
            return;
        }
        int iJ = this.u;
        if (iJ == 0) {
            iJ = j();
        }
        if (iJ == 14) {
            long jT = this.s.T(A);
            bf0 bf0Var = this.t;
            if (jT == -1) {
                jT = bf0Var.n;
            }
            bf0Var.skip(jT);
        } else if (iJ == 13) {
            K0(z);
        } else if (iJ == 12) {
            K0(y);
        } else if (iJ != 15) {
            gk0.o("Expected a name but was ", e41.v(c0()), " at path ", z());
            return;
        }
        this.u = 0;
        this.f1596o[this.m - 1] = "null";
    }

    public final void J() throws qq3, EOFException {
        int iJ = this.u;
        if (iJ == 0) {
            iJ = j();
        }
        if (iJ != 7) {
            gk0.o("Expected null but was ", e41.v(c0()), " at path ", z());
            return;
        }
        this.u = 0;
        int[] iArr = this.p;
        int i = this.m - 1;
        iArr[i] = iArr[i] + 1;
    }

    public final void K0(ai0 ai0Var) throws qq3, EOFException {
        while (true) {
            long jT = this.s.T(ai0Var);
            if (jT == -1) {
                L0("Unterminated string");
                throw null;
            }
            bf0 bf0Var = this.t;
            if (bf0Var.F(jT) != 92) {
                bf0Var.skip(jT + 1);
                return;
            } else {
                bf0Var.skip(jT + 1);
                l0();
            }
        }
    }

    public final void L0(String str) throws qq3 {
        throw new qq3(str + " at path " + z());
    }

    public final String U() throws qq3, EOFException {
        String strY;
        int iJ = this.u;
        if (iJ == 0) {
            iJ = j();
        }
        if (iJ == 14) {
            strY = b0();
        } else if (iJ == 13) {
            strY = Y(z);
        } else if (iJ == 12) {
            strY = Y(y);
        } else {
            if (iJ != 15) {
                gk0.o("Expected a name but was ", e41.v(c0()), " at path ", z());
                return null;
            }
            strY = this.x;
            this.x = null;
        }
        this.u = 0;
        this.f1596o[this.m - 1] = strY;
        return strY;
    }

    public final String Y(ai0 ai0Var) throws qq3, EOFException {
        StringBuilder sb = null;
        while (true) {
            long jT = this.s.T(ai0Var);
            if (jT == -1) {
                L0("Unterminated string");
                throw null;
            }
            bf0 bf0Var = this.t;
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
            sb.append(l0());
        }
    }

    public final void Z() throws qq3, EOFException {
        int iJ = this.u;
        if (iJ == 0) {
            iJ = j();
        }
        if (iJ != 2) {
            gk0.o("Expected END_OBJECT but was ", e41.v(c0()), " at path ", z());
            return;
        }
        int i = this.m;
        int i2 = i - 1;
        this.m = i2;
        this.f1596o[i2] = null;
        int[] iArr = this.p;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.u = 0;
    }

    public final String b0() {
        long jT = this.s.T(A);
        bf0 bf0Var = this.t;
        if (jT == -1) {
            return bf0Var.N0();
        }
        bf0Var.getClass();
        return bf0Var.M0(jT, vn0.a);
    }

    public final int c0() throws qq3, EOFException {
        int iJ = this.u;
        if (iJ == 0) {
            iJ = j();
        }
        switch (iJ) {
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

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.u = 0;
        this.n[0] = 8;
        this.m = 1;
        this.t.e();
        this.s.close();
    }

    public final void e() throws qq3 {
        if (this.q) {
            return;
        }
        L0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    public final boolean hasNext() throws qq3, EOFException {
        int iJ = this.u;
        if (iJ == 0) {
            iJ = j();
        }
        return (iJ == 2 || iJ == 4 || iJ == 18) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x014d  */
    /* JADX WARN: Code duplicated, block: B:151:0x01d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:152:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:165:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:167:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:170:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:175:0x01ff A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:176:0x0200  */
    /* JADX WARN: Code duplicated, block: B:178:0x020c  */
    /* JADX WARN: Code duplicated, block: B:180:0x0214  */
    /* JADX WARN: Code duplicated, block: B:238:0x0172 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x01af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0132 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:94:0x0133  */
    /* JADX WARN: Code duplicated, block: B:98:0x0144  */
    public final int j() throws qq3, EOFException {
        int i;
        String str;
        String str2;
        long j;
        int i2;
        char cF;
        int i3;
        char c;
        int i4;
        int i5;
        byte bF;
        char c2;
        int[] iArr = this.n;
        int i6 = this.m - 1;
        int i7 = iArr[i6];
        of0 of0Var = this.s;
        long j2 = 0;
        bf0 bf0Var = this.t;
        if (i7 == 1) {
            iArr[i6] = 2;
        } else if (i7 == 2) {
            int iG = G(true);
            bf0Var.c0();
            if (iG != 44) {
                if (iG != 59) {
                    if (iG == 93) {
                        this.u = 4;
                        return 4;
                    }
                    L0("Unterminated array");
                    throw null;
                }
                e();
            }
        } else {
            if (i7 == 3 || i7 == 5) {
                iArr[i6] = 4;
                if (i7 == 5) {
                    int iG2 = G(true);
                    bf0Var.c0();
                    if (iG2 != 44) {
                        if (iG2 != 59) {
                            if (iG2 == 125) {
                                this.u = 2;
                                return 2;
                            }
                            L0("Unterminated object");
                            throw null;
                        }
                        e();
                    }
                }
                int iG3 = G(true);
                if (iG3 == 34) {
                    bf0Var.c0();
                    this.u = 13;
                    return 13;
                }
                if (iG3 == 39) {
                    bf0Var.c0();
                    e();
                    this.u = 12;
                    return 12;
                }
                if (iG3 != 125) {
                    e();
                    if (F((char) iG3)) {
                        this.u = 14;
                        return 14;
                    }
                    L0("Expected name");
                    throw null;
                }
                if (i7 == 5) {
                    L0("Expected name");
                    throw null;
                }
                bf0Var.c0();
                this.u = 2;
                return 2;
            }
            if (i7 == 4) {
                iArr[i6] = 5;
                int iG4 = G(true);
                bf0Var.c0();
                if (iG4 != 58) {
                    if (iG4 != 61) {
                        L0("Expected ':'");
                        throw null;
                    }
                    e();
                    if (of0Var.m0(1L) && bf0Var.F(0L) == 62) {
                        bf0Var.c0();
                    }
                }
            } else if (i7 == 6) {
                iArr[i6] = 7;
            } else if (i7 == 7) {
                if (G(false) == -1) {
                    this.u = 18;
                    return 18;
                }
                e();
            } else {
                if (i7 == 9) {
                    throw null;
                }
                if (i7 == 8) {
                    hk0.l("JsonReader is closed");
                    return 0;
                }
            }
        }
        int iG5 = G(true);
        if (iG5 == 34) {
            bf0Var.c0();
            this.u = 9;
            return 9;
        }
        if (iG5 == 39) {
            e();
            bf0Var.c0();
            this.u = 8;
            return 8;
        }
        if (iG5 != 44 && iG5 != 59) {
            if (iG5 == 91) {
                bf0Var.c0();
                this.u = 3;
                return 3;
            }
            if (iG5 != 93) {
                if (iG5 == 123) {
                    bf0Var.c0();
                    this.u = 1;
                    return 1;
                }
                byte bF2 = bf0Var.F(0L);
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
                        }
                        i2 = 0;
                        if (i2 != 0) {
                            return i2;
                        }
                        boolean z2 = true;
                        long j3 = j;
                        i3 = 0;
                        boolean z3 = false;
                        c = 0;
                        while (true) {
                            i4 = i3 + 1;
                            if (of0Var.m0(i4)) {
                                bF = bf0Var.F(i3);
                                if (bF != 43) {
                                    if (bF != 69 || bF == 101) {
                                        if (c != 2 || c == 4) {
                                            c = 5;
                                            i3 = i4;
                                        } else {
                                            i5 = 0;
                                        }
                                    } else if (bF == 45) {
                                        c2 = 6;
                                        if (c == 0) {
                                            z3 = true;
                                            c = 1;
                                        } else {
                                            if (c != 5) {
                                                i5 = 0;
                                            }
                                            c = c2;
                                        }
                                        i3 = i4;
                                    } else if (bF != 46) {
                                        if (bF >= 48 && bF <= 57) {
                                            if (c == 1 || c == 0) {
                                                j3 = -(bF - 48);
                                                c = 2;
                                            } else if (c == 2) {
                                                if (j3 != j) {
                                                    long j4 = (10 * j3) - ((long) (bF - 48));
                                                    z2 &= j3 > -922337203685477580L || (j3 == -922337203685477580L && j4 < j3);
                                                    j3 = j4;
                                                }
                                            } else if (c == 3) {
                                                c = 4;
                                            } else if (c == 5 || c == 6) {
                                                c = 7;
                                            }
                                            i3 = i4;
                                        } else if (!F(bF)) {
                                        }
                                        i5 = 0;
                                    } else if (c == 2) {
                                        c = 3;
                                        i3 = i4;
                                    } else {
                                        i5 = 0;
                                    }
                                    if (i5 != 0) {
                                        return i5;
                                    }
                                    if (F(bf0Var.F(j))) {
                                        L0("Expected value");
                                        throw null;
                                    }
                                    e();
                                    this.u = 10;
                                    return 10;
                                }
                                c2 = 6;
                                if (c != 5) {
                                    i5 = 0;
                                    if (i5 != 0) {
                                        return i5;
                                    }
                                    if (F(bf0Var.F(j))) {
                                        L0("Expected value");
                                        throw null;
                                    }
                                    e();
                                    this.u = 10;
                                    return 10;
                                }
                                c = c2;
                                i3 = i4;
                            }
                            if (c != 2 && z2 && ((j3 != Long.MIN_VALUE || z3) && (j3 != j || !z3))) {
                                if (!z3) {
                                    j3 = -j3;
                                }
                                this.v = j3;
                                bf0Var.skip(i3);
                                i5 = 16;
                                this.u = 16;
                            } else if (c != 2 || c == 4 || c == 7) {
                                this.w = i3;
                                i5 = 17;
                                this.u = 17;
                            } else {
                                i5 = 0;
                            }
                            if (i5 != 0) {
                                return i5;
                            }
                            if (F(bf0Var.F(j))) {
                                L0("Expected value");
                                throw null;
                            }
                            e();
                            this.u = 10;
                            return 10;
                        }
                    }
                    i = 6;
                    str2 = "false";
                    str = "FALSE";
                }
                int length = str2.length();
                int i8 = 1;
                while (true) {
                    if (i8 >= length) {
                        j = j2;
                        if (!of0Var.m0(length + 1) || !F(bf0Var.F(length))) {
                            bf0Var.skip(length);
                            this.u = i;
                            i2 = i;
                            break;
                        }
                    } else {
                        int i9 = i8 + 1;
                        j = j2;
                        if (of0Var.m0(i9) && ((cF = bf0Var.F(i8)) == str2.charAt(i8) || cF == str.charAt(i8))) {
                            i8 = i9;
                            j2 = j;
                        }
                    }
                    i2 = 0;
                    break;
                }
                if (i2 != 0) {
                    return i2;
                }
                boolean z4 = true;
                long j5 = j;
                i3 = 0;
                boolean z5 = false;
                c = 0;
                while (true) {
                    i4 = i3 + 1;
                    if (of0Var.m0(i4)) {
                        bF = bf0Var.F(i3);
                        if (bF != 43) {
                            if (bF != 69) {
                                if (c != 2) {
                                }
                                c = 5;
                                i3 = i4;
                            } else {
                                if (c != 2) {
                                }
                                c = 5;
                                i3 = i4;
                            }
                            if (i5 != 0) {
                                return i5;
                            }
                            if (F(bf0Var.F(j))) {
                                L0("Expected value");
                                throw null;
                            }
                            e();
                            this.u = 10;
                            return 10;
                        }
                        c2 = 6;
                        if (c != 5) {
                            i5 = 0;
                            if (i5 != 0) {
                                return i5;
                            }
                            if (F(bf0Var.F(j))) {
                                L0("Expected value");
                                throw null;
                            }
                            e();
                            this.u = 10;
                            return 10;
                        }
                        c = c2;
                        i3 = i4;
                    }
                    if (c != 2) {
                        if (c != 2) {
                        }
                        this.w = i3;
                        i5 = 17;
                        this.u = 17;
                    } else {
                        if (c != 2) {
                        }
                        this.w = i3;
                        i5 = 17;
                        this.u = 17;
                    }
                    if (i5 != 0) {
                        return i5;
                    }
                    if (F(bf0Var.F(j))) {
                        L0("Expected value");
                        throw null;
                    }
                    e();
                    this.u = 10;
                    return 10;
                }
            }
            if (i7 == 1) {
                bf0Var.c0();
                this.u = 4;
                return 4;
            }
        }
        if (i7 != 1 && i7 != 2) {
            L0("Unexpected value");
            throw null;
        }
        e();
        this.u = 7;
        return 7;
    }

    public final void k0(int i) {
        int i2 = this.m;
        int[] iArr = this.n;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                throw new gq3("Nesting too deep at ".concat(z()));
            }
            this.n = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f1596o;
            this.f1596o = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.p;
            this.p = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.n;
        int i3 = this.m;
        this.m = i3 + 1;
        iArr3[i3] = i;
    }

    public final char l0() throws qq3, EOFException {
        int i;
        of0 of0Var = this.s;
        if (!of0Var.m0(1L)) {
            L0("Unterminated escape sequence");
            throw null;
        }
        bf0 bf0Var = this.t;
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
            if (this.q) {
                return (char) bC0;
            }
            L0("Invalid escape sequence: \\" + ((char) bC0));
            throw null;
        }
        if (!of0Var.m0(4L)) {
            throw new EOFException("Unterminated escape sequence at path ".concat(z()));
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
                    L0("\\u".concat(bf0Var.M0(4L, vn0.a)));
                    throw null;
                }
                i = bF - 55;
            }
            c = (char) (i + c2);
        }
        bf0Var.skip(4L);
        return c;
    }

    public final double nextDouble() throws qq3, EOFException {
        int iJ = this.u;
        if (iJ == 0) {
            iJ = j();
        }
        if (iJ == 16) {
            this.u = 0;
            int[] iArr = this.p;
            int i = this.m - 1;
            iArr[i] = iArr[i] + 1;
            return this.v;
        }
        if (iJ == 17) {
            long j = this.w;
            bf0 bf0Var = this.t;
            bf0Var.getClass();
            this.x = bf0Var.M0(j, vn0.a);
        } else if (iJ == 9) {
            this.x = Y(z);
        } else if (iJ == 8) {
            this.x = Y(y);
        } else if (iJ == 10) {
            this.x = b0();
        } else if (iJ != 11) {
            gk0.o("Expected a double but was ", e41.v(c0()), " at path ", z());
            return 0.0d;
        }
        this.u = 11;
        try {
            double d = Double.parseDouble(this.x);
            if (this.q || !(Double.isNaN(d) || Double.isInfinite(d))) {
                this.x = null;
                this.u = 0;
                int[] iArr2 = this.p;
                int i2 = this.m - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return d;
            }
            throw new qq3("JSON forbids NaN and infinities: " + d + " at path " + z());
        } catch (NumberFormatException unused) {
            gk0.o("Expected a double but was ", this.x, " at path ", z());
            return 0.0d;
        }
    }

    public final int nextInt() {
        int iJ = this.u;
        if (iJ == 0) {
            iJ = j();
        }
        if (iJ == 16) {
            long j = this.v;
            int i = (int) j;
            if (j == i) {
                this.u = 0;
                int[] iArr = this.p;
                int i2 = this.m - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new gq3("Expected an int but was " + this.v + " at path " + z());
        }
        if (iJ == 17) {
            long j2 = this.w;
            bf0 bf0Var = this.t;
            bf0Var.getClass();
            this.x = bf0Var.M0(j2, vn0.a);
        } else if (iJ == 9 || iJ == 8) {
            String strY = iJ == 9 ? Y(z) : Y(y);
            this.x = strY;
            try {
                int i3 = Integer.parseInt(strY);
                this.u = 0;
                int[] iArr2 = this.p;
                int i4 = this.m - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        } else if (iJ != 11) {
            gk0.o("Expected an int but was ", e41.v(c0()), " at path ", z());
            return 0;
        }
        this.u = 11;
        try {
            double d = Double.parseDouble(this.x);
            int i5 = (int) d;
            if (i5 != d) {
                gk0.o("Expected an int but was ", this.x, " at path ", z());
                return 0;
            }
            this.x = null;
            this.u = 0;
            int[] iArr3 = this.p;
            int i6 = this.m - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        } catch (NumberFormatException unused2) {
            gk0.o("Expected an int but was ", this.x, " at path ", z());
            return 0;
        }
    }

    public final int o0(jr3 jr3Var) throws qq3, EOFException {
        int iJ = this.u;
        if (iJ == 0) {
            iJ = j();
        }
        if (iJ < 12 || iJ > 15) {
            return -1;
        }
        if (iJ == 15) {
            return q(this.x, jr3Var);
        }
        int iI0 = this.s.I0(jr3Var.b);
        if (iI0 != -1) {
            this.u = 0;
            this.f1596o[this.m - 1] = jr3Var.a[iI0];
            return iI0;
        }
        String str = this.f1596o[this.m - 1];
        String strU = U();
        int iQ = q(strU, jr3Var);
        if (iQ == -1) {
            this.u = 15;
            this.x = strU;
            this.f1596o[this.m - 1] = str;
        }
        return iQ;
    }

    public final int q(String str, jr3 jr3Var) {
        String[] strArr = jr3Var.a;
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(strArr[i])) {
                this.u = 0;
                this.f1596o[this.m - 1] = str;
                return i;
            }
        }
        return -1;
    }

    public final String r() throws qq3, EOFException {
        String strM0;
        int iJ = this.u;
        if (iJ == 0) {
            iJ = j();
        }
        if (iJ == 10) {
            strM0 = b0();
        } else if (iJ == 9) {
            strM0 = Y(z);
        } else if (iJ == 8) {
            strM0 = Y(y);
        } else if (iJ == 11) {
            strM0 = this.x;
            this.x = null;
        } else if (iJ == 16) {
            strM0 = Long.toString(this.v);
        } else {
            if (iJ != 17) {
                gk0.o("Expected a string but was ", e41.v(c0()), " at path ", z());
                return null;
            }
            long j = this.w;
            bf0 bf0Var = this.t;
            bf0Var.getClass();
            strM0 = bf0Var.M0(j, vn0.a);
        }
        this.u = 0;
        int[] iArr = this.p;
        int i = this.m - 1;
        iArr[i] = iArr[i] + 1;
        return strM0;
    }

    public final String toString() {
        return "JsonReader(" + this.s + ")";
    }

    public final int u(String str, jr3 jr3Var) {
        int length = jr3Var.a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(jr3Var.a[i])) {
                this.u = 0;
                int[] iArr = this.p;
                int i2 = this.m - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
        }
        return -1;
    }

    public final void u0() throws qq3, EOFException {
        int iJ = this.u;
        if (iJ == 0) {
            iJ = j();
        }
        if (iJ != 1) {
            gk0.o("Expected BEGIN_OBJECT but was ", e41.v(c0()), " at path ", z());
        } else {
            k0(3);
            this.u = 0;
        }
    }

    public final void v() throws qq3, EOFException {
        if (this.r) {
            gk0.o("Cannot skip unexpected ", e41.v(c0()), " at ", z());
            return;
        }
        int i = 0;
        do {
            int iJ = this.u;
            if (iJ == 0) {
                iJ = j();
            }
            if (iJ == 3) {
                k0(1);
            } else {
                if (iJ == 1) {
                    k0(3);
                } else if (iJ == 4) {
                    i--;
                    if (i < 0) {
                        gk0.o("Expected a value but was ", e41.v(c0()), " at path ", z());
                        return;
                    }
                    this.m--;
                } else if (iJ == 2) {
                    i--;
                    if (i < 0) {
                        gk0.o("Expected a value but was ", e41.v(c0()), " at path ", z());
                        return;
                    }
                    this.m--;
                } else {
                    bf0 bf0Var = this.t;
                    if (iJ == 14 || iJ == 10) {
                        long jT = this.s.T(A);
                        if (jT == -1) {
                            jT = bf0Var.n;
                        }
                        bf0Var.skip(jT);
                    } else if (iJ == 9 || iJ == 13) {
                        K0(z);
                    } else if (iJ == 8 || iJ == 12) {
                        K0(y);
                    } else if (iJ == 17) {
                        bf0Var.skip(this.w);
                    } else if (iJ == 18) {
                        gk0.o("Expected a value but was ", e41.v(c0()), " at path ", z());
                        return;
                    }
                }
                this.u = 0;
            }
            i++;
            this.u = 0;
        } while (i != 0);
        int[] iArr = this.p;
        int i2 = this.m - 1;
        iArr[i2] = iArr[i2] + 1;
        this.f1596o[i2] = "null";
    }

    public final int x0(jr3 jr3Var) throws qq3, EOFException {
        int iJ = this.u;
        if (iJ == 0) {
            iJ = j();
        }
        if (iJ < 8 || iJ > 11) {
            return -1;
        }
        if (iJ == 11) {
            return u(this.x, jr3Var);
        }
        int iI0 = this.s.I0(jr3Var.b);
        if (iI0 != -1) {
            this.u = 0;
            int[] iArr = this.p;
            int i = this.m - 1;
            iArr[i] = iArr[i] + 1;
            return iI0;
        }
        String strR = r();
        int iU = u(strR, jr3Var);
        if (iU == -1) {
            this.u = 11;
            this.x = strR;
            int[] iArr2 = this.p;
            int i2 = this.m - 1;
            iArr2[i2] = iArr2[i2] - 1;
        }
        return iU;
    }

    public final String z() {
        return bt1.D(this.m, this.n, this.f1596o, this.p);
    }

    public nr3(of0 of0Var) {
        this.n = new int[32];
        this.f1596o = new String[32];
        this.p = new int[32];
        this.u = 0;
        this.s = of0Var;
        this.t = of0Var.h();
        k0(6);
    }
}
