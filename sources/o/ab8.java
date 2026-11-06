package o;

/* JADX INFO: loaded from: classes2.dex */
public final class ab8 implements nw3 {
    public static final ab8 a = new ab8();
    public static final ls5 b = new ls5("o.za8", is5.l);

    @Override // o.nw3
    public final void a(bb7 bb7Var, Object obj) {
        za8 za8Var = (za8) obj;
        za8Var.getClass();
        bb7Var.q(za8Var.toString());
    }

    @Override // o.nw3
    public final Object b(aj1 aj1Var) {
        String strJ = aj1Var.j();
        strJ.getClass();
        int length = strJ.length();
        int i = 0;
        if (length == 32) {
            long j = 0;
            while (i < 16) {
                long j2 = j << 4;
                char cCharAt = strJ.charAt(i);
                if ((cCharAt >>> '\b') == 0) {
                    long j3 = r53.b[cCharAt];
                    if (j3 >= 0) {
                        j = j2 | j3;
                        i++;
                    }
                }
                i67.F(i, strJ, "a hexadecimal digit");
                throw null;
            }
            long j4 = 0;
            for (int i2 = 16; i2 < 32; i2++) {
                long j5 = j4 << 4;
                char cCharAt2 = strJ.charAt(i2);
                if ((cCharAt2 >>> '\b') == 0) {
                    long j6 = r53.b[cCharAt2];
                    if (j6 >= 0) {
                        j4 = j5 | j6;
                    }
                }
                i67.F(i2, strJ, "a hexadecimal digit");
                throw null;
            }
            if (j != 0 || j4 != 0) {
                return new za8(j, j4);
            }
        } else {
            if (length != 36) {
                StringBuilder sb = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                sb.append(strJ.length() <= 64 ? strJ : strJ.substring(0, 64).concat("..."));
                sb.append("\" of length ");
                sb.append(strJ.length());
                throw new IllegalArgumentException(sb.toString());
            }
            long j7 = 0;
            while (i < 8) {
                long j8 = j7 << 4;
                char cCharAt3 = strJ.charAt(i);
                if ((cCharAt3 >>> '\b') == 0) {
                    long j9 = r53.b[cCharAt3];
                    if (j9 >= 0) {
                        j7 = j8 | j9;
                        i++;
                    }
                }
                i67.F(i, strJ, "a hexadecimal digit");
                throw null;
            }
            if (strJ.charAt(8) != '-') {
                i67.F(8, strJ, "'-' (hyphen)");
                throw null;
            }
            long j10 = 0;
            for (int i3 = 9; i3 < 13; i3++) {
                long j11 = j10 << 4;
                char cCharAt4 = strJ.charAt(i3);
                if ((cCharAt4 >>> '\b') == 0) {
                    long j12 = r53.b[cCharAt4];
                    if (j12 >= 0) {
                        j10 = j11 | j12;
                    }
                }
                i67.F(i3, strJ, "a hexadecimal digit");
                throw null;
            }
            if (strJ.charAt(13) != '-') {
                i67.F(13, strJ, "'-' (hyphen)");
                throw null;
            }
            long j13 = 0;
            for (int i4 = 14; i4 < 18; i4++) {
                long j14 = j13 << 4;
                char cCharAt5 = strJ.charAt(i4);
                if ((cCharAt5 >>> '\b') == 0) {
                    long j15 = r53.b[cCharAt5];
                    if (j15 >= 0) {
                        j13 = j14 | j15;
                    }
                }
                i67.F(i4, strJ, "a hexadecimal digit");
                throw null;
            }
            if (strJ.charAt(18) != '-') {
                i67.F(18, strJ, "'-' (hyphen)");
                throw null;
            }
            long j16 = 0;
            for (int i5 = 19; i5 < 23; i5++) {
                long j17 = j16 << 4;
                char cCharAt6 = strJ.charAt(i5);
                if ((cCharAt6 >>> '\b') == 0) {
                    long j18 = r53.b[cCharAt6];
                    if (j18 >= 0) {
                        j16 = j17 | j18;
                    }
                }
                i67.F(i5, strJ, "a hexadecimal digit");
                throw null;
            }
            if (strJ.charAt(23) != '-') {
                i67.F(23, strJ, "'-' (hyphen)");
                throw null;
            }
            long j19 = 0;
            for (int i6 = 24; i6 < 36; i6++) {
                long j20 = j19 << 4;
                char cCharAt7 = strJ.charAt(i6);
                if ((cCharAt7 >>> '\b') == 0) {
                    long j21 = r53.b[cCharAt7];
                    if (j21 >= 0) {
                        j19 = j20 | j21;
                    }
                }
                i67.F(i6, strJ, "a hexadecimal digit");
                throw null;
            }
            long j22 = (j7 << 32) | (j10 << 16) | j13;
            long j23 = (j16 << 48) | j19;
            if (j22 != 0 || j23 != 0) {
                return new za8(j22, j23);
            }
        }
        return za8.f2687o;
    }

    @Override // o.nw3
    public final fq6 d() {
        return b;
    }
}
