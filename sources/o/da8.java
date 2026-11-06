package o;

/* JADX INFO: loaded from: classes.dex */
public final class da8 extends o77 {
    public final /* synthetic */ byte a;

    public /* synthetic */ da8(byte b) {
        this.a = b;
    }

    public static int B(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            o77 o77Var = ha8.a;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i2 == 1) {
            return ha8.b(i, d98.e(j, bArr));
        }
        if (i2 == 2) {
            return ha8.c(i, d98.e(j, bArr), d98.e(j + 1, bArr));
        }
        throw new AssertionError();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x011d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x010b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x014d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x011f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:13:0x002e  */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0045 A[LOOP:2: B:16:0x003c->B:19:0x0045, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0055  */
    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    /* JADX WARN: Code duplicated, block: B:34:0x008c  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00fd A[LOOP:5: B:53:0x00f7->B:56:0x00fd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:60:0x010d  */
    /* JADX WARN: Code duplicated, block: B:66:0x0123  */
    /* JADX WARN: Code duplicated, block: B:71:0x013b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0037 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x006a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x004e A[SYNTHETIC] */
    @Override // o.o77
    public final String j(byte[] bArr, int i, int i2) throws qm3 {
        int i3;
        int i4;
        byte b;
        int i5;
        byte b2;
        int i6;
        int i7;
        byte bE;
        int i8;
        byte bE2;
        switch (this.a) {
            case 0:
                if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
                }
                int i9 = i + i2;
                char[] cArr = new char[i2];
                int i10 = 0;
                while (i < i9) {
                    byte b3 = bArr[i];
                    if (b3 < 0) {
                        i3 = i10;
                        while (i < i9) {
                            i4 = i + 1;
                            b = bArr[i];
                            if (b >= 0) {
                                i5 = i3 + 1;
                                cArr[i3] = (char) b;
                                while (i4 < i9) {
                                    b2 = bArr[i4];
                                    if (b2 >= 0) {
                                        i4++;
                                        cArr[i5] = (char) b2;
                                        i5++;
                                    } else {
                                        i3 = i5;
                                        i = i4;
                                    }
                                }
                                i3 = i5;
                                i = i4;
                            } else if (b < -32) {
                                if (i4 < i9) {
                                    throw qm3.a();
                                }
                                i += 2;
                                g77.i(b, bArr[i4], cArr, i3);
                                i3++;
                            } else if (b < -16) {
                                if (i4 < i9 - 1) {
                                    throw qm3.a();
                                }
                                int i11 = i + 2;
                                i += 3;
                                g77.h(b, bArr[i4], bArr[i11], cArr, i3);
                                i3++;
                            } else {
                                if (i4 < i9 - 2) {
                                    throw qm3.a();
                                }
                                byte b4 = bArr[i4];
                                int i12 = i + 3;
                                byte b5 = bArr[i + 2];
                                i += 4;
                                g77.g(b, b4, b5, bArr[i12], cArr, i3);
                                i3 += 2;
                            }
                        }
                        return new String(cArr, 0, i3);
                    }
                    i++;
                    cArr[i10] = (char) b3;
                    i10++;
                }
                i3 = i10;
                while (i < i9) {
                    i4 = i + 1;
                    b = bArr[i];
                    if (b >= 0) {
                        i5 = i3 + 1;
                        cArr[i3] = (char) b;
                        while (i4 < i9) {
                            b2 = bArr[i4];
                            if (b2 >= 0) {
                                i4++;
                                cArr[i5] = (char) b2;
                                i5++;
                            } else {
                                i3 = i5;
                                i = i4;
                            }
                        }
                        i3 = i5;
                        i = i4;
                    } else if (b < -32) {
                        if (i4 < i9) {
                            throw qm3.a();
                        }
                        i += 2;
                        g77.i(b, bArr[i4], cArr, i3);
                        i3++;
                    } else if (b < -16) {
                        if (i4 < i9 - 1) {
                            throw qm3.a();
                        }
                        int i13 = i + 2;
                        i += 3;
                        g77.h(b, bArr[i4], bArr[i13], cArr, i3);
                        i3++;
                    } else {
                        if (i4 < i9 - 2) {
                            throw qm3.a();
                        }
                        byte b6 = bArr[i4];
                        int i14 = i + 3;
                        byte b7 = bArr[i + 2];
                        i += 4;
                        g77.g(b, b6, b7, bArr[i14], cArr, i3);
                        i3 += 2;
                    }
                }
                return new String(cArr, 0, i3);
            default:
                if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
                }
                int i15 = i + i2;
                char[] cArr2 = new char[i2];
                int i16 = 0;
                while (i < i15) {
                    byte bE3 = d98.e(i, bArr);
                    if (bE3 < 0) {
                        i6 = i16;
                        while (i < i15) {
                            i7 = i + 1;
                            bE = d98.e(i, bArr);
                            if (bE >= 0) {
                                i8 = i6 + 1;
                                cArr2[i6] = (char) bE;
                                while (i7 < i15) {
                                    bE2 = d98.e(i7, bArr);
                                    if (bE2 >= 0) {
                                        i7++;
                                        cArr2[i8] = (char) bE2;
                                        i8++;
                                    } else {
                                        i6 = i8;
                                        i = i7;
                                    }
                                }
                                i6 = i8;
                                i = i7;
                            } else if (bE < -32) {
                                if (i7 < i15) {
                                    throw qm3.a();
                                }
                                i += 2;
                                g77.i(bE, d98.e(i7, bArr), cArr2, i6);
                                i6++;
                            } else if (bE < -16) {
                                if (i7 < i15 - 1) {
                                    throw qm3.a();
                                }
                                int i17 = i + 2;
                                i += 3;
                                g77.h(bE, d98.e(i7, bArr), d98.e(i17, bArr), cArr2, i6);
                                i6++;
                            } else {
                                if (i7 < i15 - 2) {
                                    throw qm3.a();
                                }
                                byte bE4 = d98.e(i7, bArr);
                                int i18 = i + 3;
                                byte bE5 = d98.e(i + 2, bArr);
                                i += 4;
                                g77.g(bE, bE4, bE5, d98.e(i18, bArr), cArr2, i6);
                                i6 += 2;
                            }
                        }
                        return new String(cArr2, 0, i6);
                    }
                    i++;
                    cArr2[i16] = (char) bE3;
                    i16++;
                }
                i6 = i16;
                while (i < i15) {
                    i7 = i + 1;
                    bE = d98.e(i, bArr);
                    if (bE >= 0) {
                        i8 = i6 + 1;
                        cArr2[i6] = (char) bE;
                        while (i7 < i15) {
                            bE2 = d98.e(i7, bArr);
                            if (bE2 >= 0) {
                                i7++;
                                cArr2[i8] = (char) bE2;
                                i8++;
                            } else {
                                i6 = i8;
                                i = i7;
                            }
                        }
                        i6 = i8;
                        i = i7;
                    } else if (bE < -32) {
                        if (i7 < i15) {
                            throw qm3.a();
                        }
                        i += 2;
                        g77.i(bE, d98.e(i7, bArr), cArr2, i6);
                        i6++;
                    } else if (bE < -16) {
                        if (i7 < i15 - 1) {
                            throw qm3.a();
                        }
                        int i19 = i + 2;
                        i += 3;
                        g77.h(bE, d98.e(i7, bArr), d98.e(i19, bArr), cArr2, i6);
                        i6++;
                    } else {
                        if (i7 < i15 - 2) {
                            throw qm3.a();
                        }
                        byte bE6 = d98.e(i7, bArr);
                        int i110 = i + 3;
                        byte bE7 = d98.e(i + 2, bArr);
                        i += 4;
                        g77.g(bE, bE6, bE7, d98.e(i110, bArr), cArr2, i6);
                        i6 += 2;
                    }
                }
                return new String(cArr2, 0, i6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0184  */
    /* JADX WARN: Code duplicated, block: B:73:0x0187  */
    /* JADX WARN: Code duplicated, block: B:75:0x018a  */
    /* JADX WARN: Code duplicated, block: B:79:0x019c  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:86:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:88:0x01c0  */
    @Override // o.o77
    public final int k(int i, int i2, String str, byte[] bArr) {
        int i3;
        char cCharAt;
        int i4;
        char cCharAt2;
        int i5;
        int i6;
        int i7;
        char cCharAt3;
        char c = 2048;
        char c2 = 55296;
        switch (this.a) {
            case 0:
                int length = str.length();
                int i8 = i2 + i;
                int i9 = 0;
                while (i9 < length) {
                    int i10 = i9 + i;
                    if (i10 >= i8 || (cCharAt2 = str.charAt(i9)) >= 128) {
                        if (i9 == length) {
                            return i + length;
                        }
                        i3 = i + i9;
                        while (i9 < length) {
                            cCharAt = str.charAt(i9);
                            if (cCharAt >= 128 && i3 < i8) {
                                bArr[i3] = (byte) cCharAt;
                                i3++;
                            } else if (cCharAt >= 2048 && i3 <= i8 - 2) {
                                int i11 = i3 + 1;
                                bArr[i3] = (byte) ((cCharAt >>> 6) | 960);
                                i3 += 2;
                                bArr[i11] = (byte) ((cCharAt & '?') | 128);
                            } else {
                                if ((cCharAt < 55296 && 57343 >= cCharAt) || i3 > i8 - 3) {
                                    if (i3 > i8 - 4) {
                                        if (55296 <= cCharAt && cCharAt <= 57343 && ((i4 = i9 + 1) == str.length() || !Character.isSurrogatePair(cCharAt, str.charAt(i4)))) {
                                            throw new fa8(i9, length);
                                        }
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt + " at index " + i3);
                                    }
                                    int i12 = i9 + 1;
                                    if (i12 != str.length()) {
                                        char cCharAt4 = str.charAt(i12);
                                        if (Character.isSurrogatePair(cCharAt, cCharAt4)) {
                                            int codePoint = Character.toCodePoint(cCharAt, cCharAt4);
                                            bArr[i3] = (byte) ((codePoint >>> 18) | 240);
                                            bArr[i3 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                            int i13 = i3 + 3;
                                            bArr[i3 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                            i3 += 4;
                                            bArr[i13] = (byte) ((codePoint & 63) | 128);
                                            i9 = i12;
                                        } else {
                                            i9 = i12;
                                        }
                                    }
                                    throw new fa8(i9 - 1, length);
                                }
                                bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                                int i14 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                                i3 += 3;
                                bArr[i14] = (byte) ((cCharAt & '?') | 128);
                            }
                            i9++;
                        }
                        return i3;
                    }
                    bArr[i10] = (byte) cCharAt2;
                    i9++;
                }
                if (i9 == length) {
                    return i + length;
                }
                i3 = i + i9;
                while (i9 < length) {
                    cCharAt = str.charAt(i9);
                    if (cCharAt >= 128) {
                        if (cCharAt >= 2048) {
                            if (cCharAt < 55296) {
                                bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                                int i15 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                                i3 += 3;
                                bArr[i15] = (byte) ((cCharAt & '?') | 128);
                            } else {
                                bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                                int i16 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                                i3 += 3;
                                bArr[i16] = (byte) ((cCharAt & '?') | 128);
                            }
                        } else if (cCharAt < 55296) {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i17 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i17] = (byte) ((cCharAt & '?') | 128);
                        } else {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i18 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i18] = (byte) ((cCharAt & '?') | 128);
                        }
                    } else if (cCharAt >= 2048) {
                        if (cCharAt < 55296) {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i19 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i19] = (byte) ((cCharAt & '?') | 128);
                        } else {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i110 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i110] = (byte) ((cCharAt & '?') | 128);
                        }
                    } else if (cCharAt < 55296) {
                        bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                        int i111 = i3 + 2;
                        bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                        i3 += 3;
                        bArr[i111] = (byte) ((cCharAt & '?') | 128);
                    } else {
                        bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                        int i112 = i3 + 2;
                        bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                        i3 += 3;
                        bArr[i112] = (byte) ((cCharAt & '?') | 128);
                    }
                    i9++;
                }
                return i3;
            default:
                long j = i;
                long j2 = ((long) i2) + j;
                int length2 = str.length();
                if (length2 > i2 || bArr.length - i2 < i) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i + i2));
                }
                int i20 = 0;
                while (i20 < length2 && (cCharAt3 = str.charAt(i20)) < 128) {
                    d98.k(j, (byte) cCharAt3, bArr);
                    i20++;
                    j++;
                }
                if (i20 != length2) {
                    while (i20 < length2) {
                        char cCharAt5 = str.charAt(i20);
                        if (cCharAt5 >= 128 || j >= j2) {
                            if (cCharAt5 >= c || j > j2 - 2) {
                                int i21 = i20;
                                if ((cCharAt5 >= c2 && 57343 >= cCharAt5) || j > j2 - 3) {
                                    if (j > j2 - 4) {
                                        if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i5 = i21 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i5)))) {
                                            throw new fa8(i21, length2);
                                        }
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt5 + " at index " + j);
                                    }
                                    i6 = i21 + 1;
                                    if (i6 != length2) {
                                        char cCharAt6 = str.charAt(i6);
                                        if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                            int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                            d98.k(j, (byte) ((codePoint2 >>> 18) | 240), bArr);
                                            d98.k(j + 1, (byte) (((codePoint2 >>> 12) & 63) | 128), bArr);
                                            long j3 = j + 3;
                                            d98.k(j + 2, (byte) (((codePoint2 >>> 6) & 63) | 128), bArr);
                                            j += 4;
                                            d98.k(j3, (byte) ((codePoint2 & 63) | 128), bArr);
                                        } else {
                                            i7 = i6;
                                        }
                                    } else {
                                        i7 = i21;
                                    }
                                    throw new fa8(i7 - 1, length2);
                                }
                                d98.k(j, (byte) ((cCharAt5 >>> '\f') | 480), bArr);
                                long j4 = j + 2;
                                d98.k(j + 1, (byte) (((cCharAt5 >>> 6) & 63) | 128), bArr);
                                j += 3;
                                d98.k(j4, (byte) ((cCharAt5 & '?') | 128), bArr);
                                i20 = i21;
                            } else {
                                i6 = i20;
                                long j5 = j + 1;
                                d98.k(j, (byte) ((cCharAt5 >>> 6) | 960), bArr);
                                j += 2;
                                d98.k(j5, (byte) ((cCharAt5 & '?') | 128), bArr);
                            }
                            i20 = i6;
                        } else {
                            d98.k(j, (byte) cCharAt5, bArr);
                            j++;
                        }
                        i20++;
                        c = 2048;
                        c2 = 55296;
                    }
                }
                return (int) j;
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x005d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x007d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x0043 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    /* JADX WARN: Code duplicated, block: B:29:0x0069  */
    /* JADX WARN: Code duplicated, block: B:31:0x006d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0076  */
    /* JADX WARN: Code duplicated, block: B:39:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c4  */
    @Override // o.o77
    public final int s(byte[] bArr, int i, int i2) {
        long j;
        int i3;
        int i4;
        long j2;
        byte bE;
        long j3;
        byte bE2;
        long j4;
        int i5 = i;
        switch (this.a) {
            case 0:
                break;
            default:
                if ((i5 | i2 | (bArr.length - i2)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i5), Integer.valueOf(i2)));
                }
                long j5 = i5;
                int i6 = (int) (((long) i2) - j5);
                if (i6 < 16) {
                    j = 1;
                    i3 = 0;
                } else {
                    long j6 = j5;
                    j = 1;
                    i3 = 0;
                    while (true) {
                        if (i3 < i6) {
                            long j7 = j6 + 1;
                            if (d98.e(j6, bArr) >= 0) {
                                i3++;
                                j6 = j7;
                            }
                        } else {
                            i3 = i6;
                        }
                    }
                }
                int i7 = i6 - i3;
                long j8 = j5 + ((long) i3);
                while (true) {
                    byte b = 0;
                    while (i7 > 0) {
                        long j9 = j8 + j;
                        byte bE3 = d98.e(j8, bArr);
                        if (bE3 < 0) {
                            b = bE3;
                            j8 = j9;
                            if (i7 == 0) {
                                return 0;
                            }
                            i4 = i7 - 1;
                            if (b < -32) {
                                if (i4 == 0) {
                                    return b;
                                }
                                i7 -= 2;
                                if (b >= -62) {
                                    j2 = j8 + j;
                                    if (d98.e(j8, bArr) > -65) {
                                        j8 = j2;
                                    }
                                }
                                return -1;
                            }
                            if (b < -16) {
                                if (i4 < 2) {
                                    return B(j8, bArr, b, i4);
                                }
                                i7 -= 3;
                                long j10 = j8 + j;
                                bE = d98.e(j8, bArr);
                                if (bE > -65 && ((b != -32 || bE >= -96) && (b != -19 || bE < -96))) {
                                    j8 += 2;
                                    if (d98.e(j10, bArr) > -65) {
                                    }
                                }
                                return -1;
                            }
                            if (i4 < 3) {
                                return B(j8, bArr, b, i4);
                            }
                            i7 -= 4;
                            j3 = j8 + j;
                            bE2 = d98.e(j8, bArr);
                            if (bE2 <= -65) {
                                if ((((bE2 + 112) + (b << 28)) >> 30) == 0) {
                                    j4 = j8 + 2;
                                    if (d98.e(j3, bArr) <= -65) {
                                        j8 += 3;
                                        if (d98.e(j4, bArr) > -65) {
                                        }
                                    }
                                }
                            }
                            return -1;
                        }
                        i7--;
                        b = bE3;
                        j8 = j9;
                    }
                    if (i7 == 0) {
                        return 0;
                    }
                    i4 = i7 - 1;
                    if (b < -32) {
                        if (i4 == 0) {
                            return b;
                        }
                        i7 -= 2;
                        if (b >= -62) {
                            j2 = j8 + j;
                            if (d98.e(j8, bArr) > -65) {
                                j8 = j2;
                            }
                        }
                        return -1;
                    }
                    if (b < -16) {
                        if (i4 < 2) {
                            return B(j8, bArr, b, i4);
                        }
                        i7 -= 3;
                        long j11 = j8 + j;
                        bE = d98.e(j8, bArr);
                        if (bE > -65) {
                        }
                        return -1;
                    }
                    if (i4 < 3) {
                        return B(j8, bArr, b, i4);
                    }
                    i7 -= 4;
                    j3 = j8 + j;
                    bE2 = d98.e(j8, bArr);
                    if (bE2 <= -65) {
                        if ((((bE2 + 112) + (b << 28)) >> 30) == 0) {
                            j4 = j8 + 2;
                            if (d98.e(j3, bArr) <= -65) {
                                j8 += 3;
                                if (d98.e(j4, bArr) > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
        }
        while (i5 < i2 && bArr[i5] >= 0) {
            i5++;
        }
        if (i5 < i2) {
            while (i5 < i2) {
                int i8 = i5 + 1;
                byte b2 = bArr[i5];
                if (b2 < 0) {
                    if (b2 < -32) {
                        if (i8 >= i2) {
                            return b2;
                        }
                        if (b2 >= -62) {
                            i5 += 2;
                            if (bArr[i8] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b2 < -16) {
                        if (i8 >= i2 - 1) {
                            return ha8.d(bArr, i8, i2);
                        }
                        int i9 = i5 + 2;
                        byte b3 = bArr[i8];
                        if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                            i5 += 3;
                            if (bArr[i9] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (i8 >= i2 - 2) {
                        return ha8.d(bArr, i8, i2);
                    }
                    int i10 = i5 + 2;
                    byte b4 = bArr[i8];
                    if (b4 <= -65) {
                        if ((((b4 + 112) + (b2 << 28)) >> 30) == 0) {
                            int i11 = i5 + 3;
                            if (bArr[i10] <= -65) {
                                i5 += 4;
                                if (bArr[i11] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
                i5 = i8;
            }
        }
        return 0;
    }
}
