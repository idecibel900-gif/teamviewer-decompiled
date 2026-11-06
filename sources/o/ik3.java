package o;

/* JADX INFO: loaded from: classes2.dex */
public final class ik3 implements nw3 {
    public static final ik3 a = new ik3();
    public static final ls5 b = new ls5("o.bk3", is5.l);

    @Override // o.nw3
    public final void a(bb7 bb7Var, Object obj) {
        bk3 bk3Var = (bk3) obj;
        bk3Var.getClass();
        bb7Var.q(bk3Var.toString());
    }

    /* JADX WARN: Code duplicated, block: B:197:0x0464  */
    /* JADX WARN: Code duplicated, block: B:198:0x047a  */
    /* JADX WARN: Instruction removed from duplicated block: B:198:0x047a, please report this as an issue */
    @Override // o.nw3
    public final Object b(aj1 aj1Var) {
        int i;
        int i2;
        int i3;
        hk3 hk3VarJ;
        int i4;
        int i5;
        char cCharAt;
        char cCharAt2;
        bk3 bk3Var = bk3.f434o;
        String strJ = aj1Var.j();
        strJ.getClass();
        if (strJ.length() == 0) {
            hk3VarJ = new fk3("An empty string is not a valid Instant", strJ);
        } else {
            char cCharAt3 = strJ.charAt(0);
            if (cCharAt3 == '+' || cCharAt3 == '-') {
                i = 1;
            } else {
                i = 0;
                cCharAt3 = ' ';
            }
            int iCharAt = 0;
            int i6 = i;
            while (i6 < strJ.length() && '0' <= (cCharAt2 = strJ.charAt(i6)) && cCharAt2 < ':') {
                iCharAt = (iCharAt * 10) + (strJ.charAt(i6) - '0');
                i6++;
            }
            int i7 = i6 - i;
            if (i7 > 10) {
                hk3VarJ = au8.J(strJ, "Expected at most 10 digits for the year number, got " + i7 + " digits");
            } else if (i7 == 10 && strJ.charAt(i) >= '2') {
                hk3VarJ = au8.J(strJ, "Expected at most 9 digits for the year number or year 1000000000, got " + i7 + " digits");
            } else if (i7 < 4) {
                hk3VarJ = au8.J(strJ, "The year number must be padded to 4 digits, got " + i7 + " digits");
            } else if (cCharAt3 == '+' && i7 == 4) {
                hk3VarJ = au8.J(strJ, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
            } else if (cCharAt3 != ' ' || i7 == 4) {
                if (cCharAt3 == '-') {
                    iCharAt = -iCharAt;
                }
                int i8 = i6 + 16;
                if (strJ.length() < i8) {
                    hk3VarJ = au8.J(strJ, "The input string is too short");
                } else {
                    fk3 fk3VarI = au8.I(strJ, "'-'", i6, new ji2((byte) 27));
                    if (fk3VarI == null && (fk3VarI = au8.I(strJ, "'-'", i6 + 3, new ji2((byte) 28))) == null && (fk3VarI = au8.I(strJ, "'T' or 't'", i6 + 6, new ji2((byte) 29))) == null && (fk3VarI = au8.I(strJ, "':'", i6 + 9, new ek3((byte) 0))) == null && (fk3VarI = au8.I(strJ, "':'", i6 + 12, new ek3((byte) 1))) == null) {
                        int[] iArr = au8.f0;
                        for (int i9 = 0; i9 < 10; i9++) {
                            hk3VarJ = au8.I(strJ, "an ASCII digit", i6 + iArr[i9], new ek3((byte) 2));
                            if (hk3VarJ == null) {
                            }
                        }
                        int iK = au8.K(i6 + 1, strJ);
                        int iK2 = au8.K(i6 + 4, strJ);
                        int iK3 = au8.K(i6 + 7, strJ);
                        int iK4 = au8.K(i6 + 10, strJ);
                        int iK5 = au8.K(i6 + 13, strJ);
                        int i10 = i6 + 15;
                        if (strJ.charAt(i10) == '.') {
                            i10 = i8;
                            int iCharAt2 = 0;
                            while (i10 < strJ.length() && '0' <= (cCharAt = strJ.charAt(i10)) && cCharAt < ':') {
                                iCharAt2 = (iCharAt2 * 10) + (strJ.charAt(i10) - '0');
                                i10++;
                            }
                            int i11 = i10 - i8;
                            if (1 > i11 || i11 >= 10) {
                                hk3VarJ = au8.J(strJ, "1..9 digits are supported for the fraction of the second, got " + i11 + " digits");
                            } else {
                                i2 = iCharAt2 * au8.e0[9 - i11];
                            }
                        } else {
                            i2 = 0;
                        }
                        if (i10 >= strJ.length()) {
                            hk3VarJ = au8.J(strJ, "The UTC offset at the end of the string is missing");
                        } else {
                            char cCharAt4 = strJ.charAt(i10);
                            if (cCharAt4 == '+' || cCharAt4 == '-') {
                                int length = strJ.length() - i10;
                                if (length > 9) {
                                    hk3VarJ = au8.J(strJ, "The UTC offset string \"" + au8.V(16, strJ.subSequence(i10, strJ.length()).toString()) + "\" is too long");
                                } else if (length % 3 != 0) {
                                    hk3VarJ = au8.J(strJ, "Invalid UTC offset string \"" + strJ.subSequence(i10, strJ.length()).toString() + '\"');
                                } else {
                                    int[] iArr2 = au8.g0;
                                    for (int i12 = 0; i12 < 2 && (i5 = iArr2[i12] + i10) < strJ.length(); i12++) {
                                        if (strJ.charAt(i5) != ':') {
                                            StringBuilder sbK = fx3.k(i5, "Expected ':' at index ", ", got '");
                                            sbK.append(strJ.charAt(i5));
                                            sbK.append('\'');
                                            hk3VarJ = au8.J(strJ, sbK.toString());
                                        }
                                    }
                                    int[] iArr3 = au8.h0;
                                    int i13 = 0;
                                    while (i13 < 6 && (i4 = iArr3[i13] + i10) < strJ.length()) {
                                        char cCharAt5 = strJ.charAt(i4);
                                        int[] iArr4 = iArr3;
                                        if ('0' > cCharAt5 || cCharAt5 >= ':') {
                                            StringBuilder sbK2 = fx3.k(i4, "Expected an ASCII digit at index ", ", got '");
                                            sbK2.append(strJ.charAt(i4));
                                            sbK2.append('\'');
                                            hk3VarJ = au8.J(strJ, sbK2.toString());
                                        } else {
                                            i13++;
                                            iArr3 = iArr4;
                                        }
                                    }
                                    int iK6 = au8.K(i10 + 1, strJ);
                                    int iK7 = length > 3 ? au8.K(i10 + 4, strJ) : 0;
                                    int iK8 = length > 6 ? au8.K(i10 + 7, strJ) : 0;
                                    if (iK7 > 59) {
                                        hk3VarJ = au8.J(strJ, "Expected offset-minute-of-hour in 0..59, got " + iK7);
                                    } else if (iK8 > 59) {
                                        hk3VarJ = au8.J(strJ, "Expected offset-second-of-minute in 0..59, got " + iK8);
                                    } else if (iK6 <= 17 || (iK6 == 18 && iK7 == 0 && iK8 == 0)) {
                                        i3 = ((iK7 * 60) + (iK6 * 3600) + iK8) * (cCharAt4 == '-' ? -1 : 1);
                                        if (1 <= iK || iK >= 13) {
                                            hk3VarJ = au8.J(strJ, "Expected a month number in 1..12, got " + iK);
                                        } else if (1 > iK2) {
                                            StringBuilder sbJ = fx3.j(iK, iCharAt, "Expected a valid day-of-month for month ", " of year ", ", got ");
                                            sbJ.append(iK2);
                                            hk3VarJ = au8.J(strJ, sbJ.toString());
                                        } else {
                                            int i14 = iCharAt & 3;
                                            if (iK2 > (iK != 2 ? (iK == 4 || iK == 6 || iK == 9 || iK == 11) ? 30 : 31 : i14 == 0 && (iCharAt % 100 != 0 || iCharAt % 400 == 0) ? 29 : 28)) {
                                                StringBuilder sbJ2 = fx3.j(iK, iCharAt, "Expected a valid day-of-month for month ", " of year ", ", got ");
                                                sbJ2.append(iK2);
                                                hk3VarJ = au8.J(strJ, sbJ2.toString());
                                            } else if (iK3 > 23) {
                                                hk3VarJ = au8.J(strJ, "Expected hour in 0..23, got " + iK3);
                                            } else if (iK4 > 59) {
                                                hk3VarJ = au8.J(strJ, "Expected minute-of-hour in 0..59, got " + iK4);
                                            } else if (iK5 > 59) {
                                                hk3VarJ = au8.J(strJ, "Expected second-of-minute in 0..59, got " + iK5);
                                            } else {
                                                long j = iCharAt;
                                                long j2 = 365 * j;
                                                long j3 = (j >= 0 ? ((j + 399) / 400) + (((j + 3) / 4) - ((j + 99) / 100)) + j2 : j2 - ((j / (-400)) + ((j / (-4)) - (j / (-100))))) + ((long) (((iK * 367) - 362) / 12)) + ((long) (iK2 - 1));
                                                if (iK > 2) {
                                                    j3 = (i14 != 0 || (iCharAt % 100 == 0 && iCharAt % 400 != 0)) ? j3 - 2 : (-1) + j3;
                                                }
                                                hk3VarJ = new gk3(i2, (((j3 - 719528) * 86400) + ((long) (((iK4 * 60) + (iK3 * 3600)) + iK5))) - ((long) i3));
                                            }
                                        }
                                    } else {
                                        hk3VarJ = au8.J(strJ, "Expected an offset in -18:00..+18:00, got " + strJ.subSequence(i10, strJ.length()).toString());
                                    }
                                }
                            } else if (cCharAt4 == 'Z' || cCharAt4 == 'z') {
                                int i15 = i10 + 1;
                                if (strJ.length() == i15) {
                                    i3 = 0;
                                    if (1 <= iK) {
                                        hk3VarJ = au8.J(strJ, "Expected a month number in 1..12, got " + iK);
                                    } else {
                                        hk3VarJ = au8.J(strJ, "Expected a month number in 1..12, got " + iK);
                                    }
                                } else {
                                    hk3VarJ = au8.J(strJ, "Extra text after the instant at position " + i15);
                                }
                            } else {
                                hk3VarJ = au8.J(strJ, "Expected the UTC offset at position " + i10 + ", got '" + cCharAt4 + '\'');
                            }
                        }
                    } else {
                        hk3VarJ = fk3VarI;
                    }
                }
            } else {
                hk3VarJ = au8.J(strJ, "A '+' or '-' sign is required for year numbers longer than 4 digits");
            }
        }
        return hk3VarJ.toInstant();
    }

    @Override // o.nw3
    public final fq6 d() {
        return b;
    }
}
