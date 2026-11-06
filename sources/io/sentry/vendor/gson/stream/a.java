package io.sentry.vendor.gson.stream;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import io.sentry.h2;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import o.ep1;
import o.fx3;
import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Closeable {
    public int[] A;
    public final Reader m;
    public long u;
    public int v;
    public String w;
    public int[] x;
    public String[] z;
    public boolean n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final char[] f272o = new char[1024];
    public int p = 0;
    public int q = 0;
    public int r = 0;
    public int s = 0;
    public int t = 0;
    public int y = 1;

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.x = iArr;
        iArr[0] = 6;
        this.z = new String[32];
        this.A = new int[32];
        this.m = reader;
    }

    public final void A0() throws IOException {
        int iJ = this.t;
        if (iJ == 0) {
            iJ = j();
        }
        if (iJ != 4) {
            StringBuilder sb = new StringBuilder("Expected END_ARRAY but was ");
            sb.append(peek());
            h2.l(sb, z());
        } else {
            int i = this.y;
            this.y = i - 1;
            int[] iArr = this.A;
            int i2 = i - 2;
            iArr[i2] = iArr[i2] + 1;
            this.t = 0;
        }
    }

    public final void D0() throws IOException {
        int iJ = this.t;
        if (iJ == 0) {
            iJ = j();
        }
        if (iJ == 3) {
            c0(1);
            this.A[this.y - 1] = 0;
            this.t = 0;
        } else {
            StringBuilder sb = new StringBuilder("Expected BEGIN_ARRAY but was ");
            sb.append(peek());
            h2.l(sb, z());
        }
    }

    public final boolean F() throws IOException {
        int iJ = this.t;
        if (iJ == 0) {
            iJ = j();
        }
        if (iJ == 5) {
            this.t = 0;
            int[] iArr = this.A;
            int i = this.y - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iJ != 6) {
            StringBuilder sb = new StringBuilder("Expected a boolean but was ");
            sb.append(peek());
            h2.l(sb, z());
            return false;
        }
        this.t = 0;
        int[] iArr2 = this.A;
        int i2 = this.y - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return false;
    }

    public final int G(boolean z) throws IOException {
        int i = this.p;
        int i2 = this.q;
        while (true) {
            if (i == i2) {
                this.p = i;
                if (!q(1)) {
                    if (z) {
                        throw new EOFException("End of input".concat(z()));
                    }
                    return -1;
                }
                i = this.p;
                i2 = this.q;
            }
            int i3 = i + 1;
            char[] cArr = this.f272o;
            char c = cArr[i];
            if (c == '\n') {
                this.r++;
                this.s = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.p = i3;
                    if (i3 == i2) {
                        this.p = i;
                        boolean zQ = q(2);
                        this.p++;
                        if (!zQ) {
                        }
                        return c;
                    }
                    e();
                    int i4 = this.p;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.p = i4 + 1;
                        while (true) {
                            if (this.p + 2 > this.q && !q(2)) {
                                x0("Unterminated comment");
                                throw null;
                            }
                            int i5 = this.p;
                            if (cArr[i5] != '\n') {
                                int i6 = 0;
                                while (true) {
                                    int i7 = this.p;
                                    if (i6 >= 2) {
                                        i = i7 + 2;
                                        i2 = this.q;
                                        break;
                                    }
                                    if (cArr[i7 + i6] != "*/".charAt(i6)) {
                                        break;
                                    }
                                    i6++;
                                }
                            } else {
                                this.r++;
                                this.s = i5 + 1;
                            }
                            this.p++;
                        }
                    } else {
                        if (c2 != '/') {
                            return c;
                        }
                        this.p = i4 + 1;
                        o0();
                        i = this.p;
                        i2 = this.q;
                    }
                } else {
                    if (c != '#') {
                        this.p = i3;
                        return c;
                    }
                    this.p = i3;
                    e();
                    o0();
                    i = this.p;
                    i2 = this.q;
                }
            }
            i = i3;
        }
    }

    public final void J() throws IOException {
        int iJ = this.t;
        if (iJ == 0) {
            iJ = j();
        }
        if (iJ != 7) {
            StringBuilder sb = new StringBuilder("Expected null but was ");
            sb.append(peek());
            h2.l(sb, z());
        } else {
            this.t = 0;
            int[] iArr = this.A;
            int i = this.y - 1;
            iArr[i] = iArr[i] + 1;
        }
    }

    public final String U() throws IOException {
        String strY;
        int iJ = this.t;
        if (iJ == 0) {
            iJ = j();
        }
        if (iJ == 14) {
            strY = b0();
        } else if (iJ == 12) {
            strY = Y('\'');
        } else {
            if (iJ != 13) {
                StringBuilder sb = new StringBuilder("Expected a name but was ");
                sb.append(peek());
                h2.l(sb, z());
                return null;
            }
            strY = Y('\"');
        }
        this.t = 0;
        this.z[this.y - 1] = strY;
        return strY;
    }

    public final String Y(char c) throws d {
        int i;
        char[] cArr;
        StringBuilder sb = null;
        do {
            int i2 = this.p;
            int i3 = this.q;
            while (true) {
                int i4 = i3;
                i = i2;
                while (true) {
                    cArr = this.f272o;
                    if (i2 < i4) {
                        int i5 = i2 + 1;
                        char c2 = cArr[i2];
                        if (c2 == c) {
                            this.p = i5;
                            int i6 = (i5 - i) - 1;
                            if (sb == null) {
                                return new String(cArr, i, i6);
                            }
                            sb.append(cArr, i, i6);
                            return sb.toString();
                        }
                        if (c2 == '\\') {
                            this.p = i5;
                            int i7 = i5 - i;
                            int i8 = i7 - 1;
                            if (sb == null) {
                                sb = new StringBuilder(Math.max(i7 * 2, 16));
                            }
                            sb.append(cArr, i, i8);
                            sb.append(k0());
                            i2 = this.p;
                            i3 = this.q;
                        } else {
                            if (c2 == '\n') {
                                this.r++;
                                this.s = i5;
                            }
                            i2 = i5;
                        }
                    }
                }
            }
            if (sb == null) {
                sb = new StringBuilder(Math.max((i2 - i) * 2, 16));
            }
            sb.append(cArr, i, i2 - i);
            this.p = i2;
        } while (q(1));
        x0("Unterminated string");
        throw null;
    }

    public final void Z() throws IOException {
        int iJ = this.t;
        if (iJ == 0) {
            iJ = j();
        }
        if (iJ != 2) {
            StringBuilder sb = new StringBuilder("Expected END_OBJECT but was ");
            sb.append(peek());
            h2.l(sb, z());
            return;
        }
        int i = this.y;
        int i2 = i - 1;
        this.y = i2;
        this.z[i2] = null;
        int[] iArr = this.A;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.t = 0;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0042. Please report as an issue. */
    public final String b0() throws d {
        String string;
        StringBuilder sb = null;
        int i = 0;
        while (true) {
            int i2 = 0;
            while (true) {
                int i3 = this.p + i2;
                int i4 = this.q;
                char[] cArr = this.f272o;
                if (i3 < i4) {
                    char c = cArr[i3];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i2++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        e();
                    }
                    i = i2;
                } else if (i2 >= cArr.length) {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i2, 16));
                    }
                    sb.append(cArr, this.p, i2);
                    this.p += i2;
                    if (!q(1)) {
                    }
                } else if (!q(i2 + 1)) {
                    i = i2;
                }
                int i5 = this.p;
                if (sb == null) {
                    string = new String(cArr, i5, i);
                } else {
                    sb.append(cArr, i5, i);
                    string = sb.toString();
                }
                this.p += i;
                return string;
            }
        }
    }

    public final void c0(int i) {
        int i2 = this.y;
        int[] iArr = this.x;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.x = Arrays.copyOf(iArr, i3);
            this.A = Arrays.copyOf(this.A, i3);
            this.z = (String[]) Arrays.copyOf(this.z, i3);
        }
        int[] iArr2 = this.x;
        int i4 = this.y;
        this.y = i4 + 1;
        iArr2[i4] = i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.t = 0;
        this.x[0] = 8;
        this.y = 1;
        this.m.close();
    }

    public final void e() throws d {
        if (this.n) {
            return;
        }
        x0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    public final boolean hasNext() throws IOException {
        int iJ = this.t;
        if (iJ == 0) {
            iJ = j();
        }
        return (iJ == 2 || iJ == 4) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0179 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:116:0x017a  */
    /* JADX WARN: Code duplicated, block: B:119:0x018b  */
    /* JADX WARN: Code duplicated, block: B:122:0x0191  */
    /* JADX WARN: Code duplicated, block: B:125:0x019c  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a0 A[PHI: r1 r7
      0x01a0: PHI (r1v56 int) = (r1v55 int), (r1v71 int) binds: [B:118:0x0189, B:125:0x019c] A[DONT_GENERATE, DONT_INLINE]
      0x01a0: PHI (r7v7 int) = (r7v6 int), (r7v8 int) binds: [B:118:0x0189, B:125:0x019c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:128:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:130:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:169:0x020f  */
    /* JADX WARN: Code duplicated, block: B:170:0x0211  */
    /* JADX WARN: Code duplicated, block: B:182:0x0232 A[DONT_INVERT, PHI: r10
      0x0232: PHI (r10v31 char) = (r10v30 char), (r10v32 char) binds: [B:168:0x020d, B:174:0x021a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:183:0x0234  */
    /* JADX WARN: Code duplicated, block: B:196:0x0252  */
    /* JADX WARN: Code duplicated, block: B:198:0x0256  */
    /* JADX WARN: Code duplicated, block: B:201:0x025b  */
    /* JADX WARN: Code duplicated, block: B:206:0x0265 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:207:0x0266  */
    /* JADX WARN: Code duplicated, block: B:209:0x0270  */
    /* JADX WARN: Code duplicated, block: B:211:0x0276  */
    /* JADX WARN: Code duplicated, block: B:271:0x018e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:272:0x018e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:273:0x0199 A[SYNTHETIC] */
    public final int j() throws IOException {
        int iG;
        String str;
        String str2;
        int i;
        int i2;
        char c;
        int i3;
        int i4;
        boolean z;
        int i5;
        char c2;
        char c3;
        char c4;
        int i6;
        char c5;
        int[] iArr = this.x;
        int i7 = this.y - 1;
        int i8 = iArr[i7];
        char[] cArr = this.f272o;
        if (i8 == 1) {
            iArr[i7] = 2;
        } else if (i8 == 2) {
            int iG2 = G(true);
            if (iG2 != 44) {
                if (iG2 != 59) {
                    if (iG2 == 93) {
                        this.t = 4;
                        return 4;
                    }
                    x0("Unterminated array");
                    throw null;
                }
                e();
            }
        } else {
            if (i8 == 3 || i8 == 5) {
                iArr[i7] = 4;
                if (i8 == 5 && (iG = G(true)) != 44) {
                    if (iG != 59) {
                        if (iG == 125) {
                            this.t = 2;
                            return 2;
                        }
                        x0("Unterminated object");
                        throw null;
                    }
                    e();
                }
                int iG3 = G(true);
                if (iG3 == 34) {
                    this.t = 13;
                    return 13;
                }
                if (iG3 == 39) {
                    e();
                    this.t = 12;
                    return 12;
                }
                if (iG3 == 125) {
                    if (i8 != 5) {
                        this.t = 2;
                        return 2;
                    }
                    x0("Expected name");
                    throw null;
                }
                e();
                this.p--;
                if (u((char) iG3)) {
                    this.t = 14;
                    return 14;
                }
                x0("Expected name");
                throw null;
            }
            if (i8 == 4) {
                iArr[i7] = 5;
                int iG4 = G(true);
                if (iG4 != 58) {
                    if (iG4 != 61) {
                        x0("Expected ':'");
                        throw null;
                    }
                    e();
                    if (this.p < this.q || q(1)) {
                        int i9 = this.p;
                        if (cArr[i9] == '>') {
                            this.p = i9 + 1;
                        }
                    }
                }
            } else if (i8 == 6) {
                if (this.n) {
                    G(true);
                    int i10 = this.p;
                    int i11 = i10 - 1;
                    this.p = i11;
                    if ((i10 + 4 <= this.q || q(5)) && cArr[i11] == ')' && cArr[i10] == ']' && cArr[i10 + 1] == '}' && cArr[i10 + 2] == '\'' && cArr[i10 + 3] == '\n') {
                        this.p += 5;
                    }
                }
                this.x[this.y - 1] = 7;
            } else if (i8 == 7) {
                if (G(false) == -1) {
                    this.t = 17;
                    return 17;
                }
                e();
                this.p--;
            } else if (i8 == 8) {
                hk0.l("JsonReader is closed");
                return 0;
            }
        }
        int iG5 = G(true);
        if (iG5 == 34) {
            this.t = 9;
            return 9;
        }
        if (iG5 == 39) {
            e();
            this.t = 8;
            return 8;
        }
        if (iG5 != 44 && iG5 != 59) {
            if (iG5 == 91) {
                this.t = 3;
                return 3;
            }
            if (iG5 != 93) {
                if (iG5 == 123) {
                    this.t = 1;
                    return 1;
                }
                int i12 = this.p - 1;
                this.p = i12;
                char c6 = cArr[i12];
                if (c6 == 't' || c6 == 'T') {
                    str = "true";
                    str2 = "TRUE";
                    i = 5;
                } else {
                    if (c6 != 'f' && c6 != 'F') {
                        if (c6 != 'n' && c6 != 'N') {
                            i2 = 0;
                            break;
                        }
                        str = "null";
                        str2 = "NULL";
                        i = 7;
                        if (i2 != 0) {
                            return i2;
                        }
                        i3 = this.p;
                        i4 = this.q;
                        z = true;
                        i5 = 0;
                        boolean z2 = false;
                        c2 = 0;
                        long j = 0;
                        while (true) {
                            if (i3 + i5 != i4) {
                                c3 = cArr[i3 + i5];
                                if (c3 != '+') {
                                    if (c3 != 'E' || c3 == 'e') {
                                        if (c2 != 2 || c2 == 4) {
                                            c2 = 5;
                                            i5++;
                                        }
                                    } else if (c3 == '-') {
                                        c4 = 6;
                                        if (c2 == 0) {
                                            z2 = true;
                                            c2 = 1;
                                        } else {
                                            if (c2 != 5) {
                                            }
                                            c2 = c4;
                                        }
                                        i5++;
                                    } else if (c3 != '.') {
                                        if (c3 >= '0' && c3 <= '9') {
                                            if (c2 == 1 || c2 == 0) {
                                                j = -(c3 - '0');
                                                c2 = 2;
                                            } else if (c2 == 2) {
                                                if (j != 0) {
                                                    long j2 = (10 * j) - ((long) (c3 - '0'));
                                                    z &= j > -922337203685477580L || (j == -922337203685477580L && j2 < j);
                                                    j = j2;
                                                }
                                            } else if (c2 == 3) {
                                                c2 = 4;
                                            } else if (c2 == 5 || c2 == 6) {
                                                c2 = 7;
                                            }
                                            i5++;
                                        } else if (!u(c3)) {
                                            c5 = 2;
                                            if (c2 != 2) {
                                                if (c2 != c5 || c2 == 4 || c2 == 7) {
                                                    this.v = i5;
                                                    i6 = 16;
                                                    this.t = 16;
                                                }
                                            } else if (z || ((j == Long.MIN_VALUE && !z2) || (j == 0 && z2))) {
                                                c5 = 2;
                                                if (c2 != c5) {
                                                }
                                                this.v = i5;
                                                i6 = 16;
                                                this.t = 16;
                                            } else {
                                                if (!z2) {
                                                    j = -j;
                                                }
                                                this.u = j;
                                                this.p += i5;
                                                i6 = 15;
                                                this.t = 15;
                                            }
                                        }
                                    } else if (c2 == 2) {
                                        c2 = 3;
                                        i5++;
                                    }
                                    if (i6 != 0) {
                                        return i6;
                                    }
                                    if (u(cArr[this.p])) {
                                        x0("Expected value");
                                        throw null;
                                    }
                                    e();
                                    this.t = 10;
                                    return 10;
                                }
                                c4 = 6;
                                if (c2 != 5) {
                                }
                                c2 = c4;
                                i5++;
                            } else if (i5 != cArr.length) {
                                if (!q(i5 + 1)) {
                                    i3 = this.p;
                                    i4 = this.q;
                                    c3 = cArr[i3 + i5];
                                    if (c3 != '+') {
                                        if (c3 != 'E') {
                                            if (c2 != 2) {
                                            }
                                            c2 = 5;
                                            i5++;
                                        } else {
                                            if (c2 != 2) {
                                            }
                                            c2 = 5;
                                            i5++;
                                        }
                                        if (i6 != 0) {
                                            return i6;
                                        }
                                        if (u(cArr[this.p])) {
                                            x0("Expected value");
                                            throw null;
                                        }
                                        e();
                                        this.t = 10;
                                        return 10;
                                    }
                                    c4 = 6;
                                    if (c2 != 5) {
                                    }
                                    c2 = c4;
                                    i5++;
                                }
                                c5 = 2;
                                if (c2 != 2) {
                                    if (c2 != c5) {
                                    }
                                    this.v = i5;
                                    i6 = 16;
                                    this.t = 16;
                                } else {
                                    if (z) {
                                    }
                                    c5 = 2;
                                    if (c2 != c5) {
                                    }
                                    this.v = i5;
                                    i6 = 16;
                                    this.t = 16;
                                }
                                if (i6 != 0) {
                                    return i6;
                                }
                                if (u(cArr[this.p])) {
                                    x0("Expected value");
                                    throw null;
                                }
                                e();
                                this.t = 10;
                                return 10;
                            }
                            i6 = 0;
                            if (i6 != 0) {
                                return i6;
                            }
                            if (u(cArr[this.p])) {
                                x0("Expected value");
                                throw null;
                            }
                            e();
                            this.t = 10;
                            return 10;
                        }
                    }
                    str = "false";
                    str2 = "FALSE";
                    i = 6;
                }
                int length = str.length();
                int i13 = 1;
                while (true) {
                    int i14 = this.p;
                    int i15 = this.q;
                    if (i13 >= length) {
                        if ((i14 + length >= i15 && !q(length + 1)) || !u(cArr[this.p + length])) {
                            this.p += length;
                            this.t = i;
                            i2 = i;
                            break;
                        }
                        break;
                    }
                    if ((i14 + i13 < i15 || q(i13 + 1)) && ((c = cArr[this.p + i13]) == str.charAt(i13) || c == str2.charAt(i13))) {
                        i13++;
                    }
                    i2 = 0;
                    break;
                }
                if (i2 != 0) {
                    return i2;
                }
                i3 = this.p;
                i4 = this.q;
                z = true;
                i5 = 0;
                boolean z3 = false;
                c2 = 0;
                long j3 = 0;
                while (true) {
                    if (i3 + i5 != i4) {
                        c3 = cArr[i3 + i5];
                        if (c3 != '+') {
                            if (c3 != 'E') {
                                if (c2 != 2) {
                                }
                                c2 = 5;
                                i5++;
                            } else {
                                if (c2 != 2) {
                                }
                                c2 = 5;
                                i5++;
                            }
                            if (i6 != 0) {
                                return i6;
                            }
                            if (u(cArr[this.p])) {
                                x0("Expected value");
                                throw null;
                            }
                            e();
                            this.t = 10;
                            return 10;
                        }
                        c4 = 6;
                        if (c2 != 5) {
                        }
                        c2 = c4;
                        i5++;
                    } else if (i5 != cArr.length) {
                        if (!q(i5 + 1)) {
                            i3 = this.p;
                            i4 = this.q;
                            c3 = cArr[i3 + i5];
                            if (c3 != '+') {
                                if (c3 != 'E') {
                                    if (c2 != 2) {
                                    }
                                    c2 = 5;
                                    i5++;
                                } else {
                                    if (c2 != 2) {
                                    }
                                    c2 = 5;
                                    i5++;
                                }
                                if (i6 != 0) {
                                    return i6;
                                }
                                if (u(cArr[this.p])) {
                                    x0("Expected value");
                                    throw null;
                                }
                                e();
                                this.t = 10;
                                return 10;
                            }
                            c4 = 6;
                            if (c2 != 5) {
                            }
                            c2 = c4;
                            i5++;
                        }
                        c5 = 2;
                        if (c2 != 2) {
                            if (c2 != c5) {
                            }
                            this.v = i5;
                            i6 = 16;
                            this.t = 16;
                        } else {
                            if (z) {
                            }
                            c5 = 2;
                            if (c2 != c5) {
                            }
                            this.v = i5;
                            i6 = 16;
                            this.t = 16;
                        }
                        if (i6 != 0) {
                            return i6;
                        }
                        if (u(cArr[this.p])) {
                            x0("Expected value");
                            throw null;
                        }
                        e();
                        this.t = 10;
                        return 10;
                    }
                    i6 = 0;
                    if (i6 != 0) {
                        return i6;
                    }
                    if (u(cArr[this.p])) {
                        x0("Expected value");
                        throw null;
                    }
                    e();
                    this.t = 10;
                    return 10;
                }
            }
            if (i8 == 1) {
                this.t = 4;
                return 4;
            }
        }
        if (i8 != 1 && i8 != 2) {
            x0("Unexpected value");
            throw null;
        }
        e();
        this.p--;
        this.t = 7;
        return 7;
    }

    public final char k0() throws d {
        int i;
        if (this.p == this.q && !q(1)) {
            x0("Unterminated escape sequence");
            throw null;
        }
        int i2 = this.p;
        int i3 = i2 + 1;
        this.p = i3;
        char[] cArr = this.f272o;
        char c = cArr[i2];
        if (c == '\n') {
            this.r++;
            this.s = i3;
            return c;
        }
        if (c == '\"' || c == '\'' || c == '/' || c == '\\') {
            return c;
        }
        if (c == 'b') {
            return '\b';
        }
        if (c == 'f') {
            return '\f';
        }
        if (c == 'n') {
            return '\n';
        }
        if (c == 'r') {
            return '\r';
        }
        if (c == 't') {
            return '\t';
        }
        if (c != 'u') {
            x0("Invalid escape sequence");
            throw null;
        }
        if (i2 + 5 > this.q && !q(4)) {
            x0("Unterminated escape sequence");
            throw null;
        }
        int i4 = this.p;
        int i5 = i4 + 4;
        char c2 = 0;
        while (i4 < i5) {
            char c3 = cArr[i4];
            char c4 = (char) (c2 << 4);
            if (c3 >= '0' && c3 <= '9') {
                i = c3 - '0';
            } else if (c3 >= 'a' && c3 <= 'f') {
                i = c3 - 'W';
            } else {
                if (c3 < 'A' || c3 > 'F') {
                    throw new NumberFormatException("\\u".concat(new String(cArr, this.p, 4)));
                }
                i = c3 - '7';
            }
            c2 = (char) (i + c4);
            i4++;
        }
        this.p += 4;
        return c2;
    }

    public final void l0(char c) throws d {
        do {
            int i = this.p;
            int i2 = this.q;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = this.f272o[i];
                if (c2 == c) {
                    this.p = i3;
                    return;
                }
                if (c2 == '\\') {
                    this.p = i3;
                    k0();
                    i = this.p;
                    i2 = this.q;
                } else {
                    if (c2 == '\n') {
                        this.r++;
                        this.s = i3;
                    }
                    i = i3;
                }
            }
            this.p = i;
        } while (q(1));
        x0("Unterminated string");
        throw null;
    }

    public final double nextDouble() throws IOException {
        int iJ = this.t;
        if (iJ == 0) {
            iJ = j();
        }
        if (iJ == 15) {
            this.t = 0;
            int[] iArr = this.A;
            int i = this.y - 1;
            iArr[i] = iArr[i] + 1;
            return this.u;
        }
        if (iJ == 16) {
            this.w = new String(this.f272o, this.p, this.v);
            this.p += this.v;
        } else if (iJ == 8 || iJ == 9) {
            this.w = Y(iJ == 8 ? '\'' : '\"');
        } else if (iJ == 10) {
            this.w = b0();
        } else if (iJ != 11) {
            StringBuilder sb = new StringBuilder("Expected a double but was ");
            sb.append(peek());
            h2.l(sb, z());
            return 0.0d;
        }
        this.t = 11;
        double d = Double.parseDouble(this.w);
        if (!this.n && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new d("JSON forbids NaN and infinities: " + d + z());
        }
        this.w = null;
        this.t = 0;
        int[] iArr2 = this.A;
        int i2 = this.y - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return d;
    }

    public final void o0() {
        char c;
        do {
            if (this.p >= this.q && !q(1)) {
                return;
            }
            int i = this.p;
            int i2 = i + 1;
            this.p = i2;
            c = this.f272o[i];
            if (c == '\n') {
                this.r++;
                this.s = i2;
                return;
            }
        } while (c != '\r');
    }

    public final b peek() throws IOException {
        int iJ = this.t;
        if (iJ == 0) {
            iJ = j();
        }
        switch (iJ) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case ep1.b /* 9 */:
            case ep1.c /* 10 */:
            case 11:
                return b.STRING;
            case ep1.d /* 12 */:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final boolean q(int i) throws IOException {
        int i2;
        int i3;
        int i4 = this.s;
        int i5 = this.p;
        this.s = i4 - i5;
        int i6 = this.q;
        char[] cArr = this.f272o;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.q = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.q = 0;
        }
        this.p = 0;
        do {
            int i8 = this.q;
            int i9 = this.m.read(cArr, i8, cArr.length - i8);
            if (i9 == -1) {
                return false;
            }
            i2 = this.q + i9;
            this.q = i2;
            if (this.r == 0 && (i3 = this.s) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.p++;
                this.s = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    public final String r() throws IOException {
        String str;
        int iJ = this.t;
        if (iJ == 0) {
            iJ = j();
        }
        if (iJ == 10) {
            str = b0();
        } else if (iJ == 8) {
            str = Y('\'');
        } else if (iJ == 9) {
            str = Y('\"');
        } else if (iJ == 11) {
            str = this.w;
            this.w = null;
        } else if (iJ == 15) {
            str = Long.toString(this.u);
        } else {
            if (iJ != 16) {
                StringBuilder sb = new StringBuilder("Expected a string but was ");
                sb.append(peek());
                h2.l(sb, z());
                return null;
            }
            str = new String(this.f272o, this.p, this.v);
            this.p += this.v;
        }
        this.t = 0;
        int[] iArr = this.A;
        int i = this.y - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }

    public final String toString() {
        return a.class.getSimpleName().concat(z());
    }

    public final boolean u(char c) throws d {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
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

    public final void u0() throws IOException {
        int iJ = this.t;
        if (iJ == 0) {
            iJ = j();
        }
        if (iJ == 1) {
            c0(3);
            this.t = 0;
        } else {
            StringBuilder sb = new StringBuilder("Expected BEGIN_OBJECT but was ");
            sb.append(peek());
            h2.l(sb, z());
        }
    }

    public final void x0(String str) throws d {
        throw new d(str.concat(z()));
    }

    public final String z() {
        StringBuilder sbJ = fx3.j(this.r + 1, (this.p - this.s) + 1, " at line ", " column ", " path ");
        StringBuilder sb = new StringBuilder("$");
        int i = this.y;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.x[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(this.A[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = this.z[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        sbJ.append(sb.toString());
        return sbJ.toString();
    }
}
