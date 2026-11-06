package o;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class ri1 {
    public static final char[] a = {';', '<', '>', '@', '[', '\\', ']', '_', '`', '~', '!', '\r', '\t', ',', ':', '\n', '-', '.', '$', '/', '\"', '|', '*', '(', ')', '?', '{', '}', '\''};
    public static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '&', '\r', '\t', ',', ':', '#', '-', '.', '$', '/', '+', '%', '*', '=', '^'};
    public static final BigInteger[] c;

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        c = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(900L);
        bigIntegerArr[1] = bigIntegerValueOf;
        int i = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = c;
            if (i >= bigIntegerArr2.length) {
                return;
            }
            bigIntegerArr2[i] = bigIntegerArr2[i - 1].multiply(bigIntegerValueOf);
            i++;
        }
    }

    public static String a(int[] iArr, int i) throws at2 {
        BigInteger bigIntegerAdd = BigInteger.ZERO;
        for (int i2 = 0; i2 < i; i2++) {
            bigIntegerAdd = bigIntegerAdd.add(c[(i - i2) - 1].multiply(BigInteger.valueOf(iArr[i2])));
        }
        String string = bigIntegerAdd.toString();
        if (string.charAt(0) == '1') {
            return string.substring(1);
        }
        throw at2.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:57:0x009b  */
    public static int b(int[] iArr, int[] iArr2, int i, iu iuVar, int i2) {
        int i3;
        char c2;
        char c3;
        int i4;
        int i5 = i2;
        int i6 = i5;
        int i7 = i6;
        for (int i8 = 0; i8 < i; i8++) {
            int i9 = iArr[i8];
            int iB = ua5.B(i6);
            if (iB != 0) {
                if (iB != 1) {
                    if (iB != 2) {
                        char[] cArr = a;
                        if (iB != 3) {
                            if (iB != 4) {
                                if (iB != 5) {
                                    c2 = 0;
                                } else if (i9 < 29) {
                                    c2 = cArr[i9];
                                } else if (i9 == 29 || i9 == 900) {
                                    c2 = 0;
                                    i6 = 1;
                                } else {
                                    if (i9 == 913) {
                                        iuVar.d((char) iArr2[i8]);
                                    }
                                    i6 = i7;
                                    c2 = 0;
                                }
                            } else if (i9 < 26) {
                                c2 = (char) (i9 + 65);
                            } else {
                                if (i9 != 26) {
                                    i4 = i9 != 900 ? i7 : 1;
                                    c3 = 0;
                                } else {
                                    i4 = i7;
                                    c3 = ' ';
                                }
                                i6 = i4;
                                c2 = c3;
                            }
                            i6 = i7;
                        } else if (i9 < 29) {
                            c2 = cArr[i9];
                        } else {
                            if (i9 == 29 || i9 == 900) {
                                i5 = 1;
                                i6 = 1;
                            } else if (i9 == 913) {
                                iuVar.d((char) iArr2[i8]);
                            }
                            c2 = 0;
                        }
                    } else if (i9 < 25) {
                        c2 = b[i9];
                    } else {
                        if (i9 == 900) {
                            i5 = 1;
                            i6 = 1;
                        } else if (i9 != 913) {
                            switch (i9) {
                                case 25:
                                    i5 = 4;
                                    i6 = i5;
                                    break;
                                case 26:
                                    c3 = ' ';
                                    break;
                                case 27:
                                    i5 = 2;
                                    i6 = i5;
                                    break;
                                case 28:
                                    i5 = 1;
                                    i6 = 1;
                                    break;
                                case 29:
                                    i7 = i6;
                                    i6 = 6;
                                    break;
                            }
                            c2 = c3;
                        } else {
                            iuVar.d((char) iArr2[i8]);
                        }
                        c3 = 0;
                        c2 = c3;
                    }
                } else if (i9 < 26) {
                    i3 = i9 + 97;
                    c2 = (char) i3;
                } else {
                    if (i9 == 900) {
                        i5 = 1;
                        i6 = 1;
                    } else if (i9 != 913) {
                        switch (i9) {
                            case 26:
                                c3 = ' ';
                                break;
                            case 27:
                                i7 = i6;
                                i6 = 5;
                                break;
                            case 28:
                                i5 = 3;
                                i6 = 3;
                                break;
                            case 29:
                                i7 = i6;
                                i6 = 6;
                                break;
                        }
                        c2 = c3;
                    } else {
                        iuVar.d((char) iArr2[i8]);
                    }
                    c3 = 0;
                    c2 = c3;
                }
            } else if (i9 < 26) {
                i3 = i9 + 65;
                c2 = (char) i3;
            } else {
                if (i9 == 900) {
                    i5 = 1;
                    i6 = 1;
                } else if (i9 != 913) {
                    switch (i9) {
                        case 26:
                            c3 = ' ';
                            break;
                        case 27:
                            i5 = 2;
                            i6 = i5;
                            break;
                        case 28:
                            i5 = 3;
                            i6 = i5;
                            break;
                        case 29:
                            i7 = i6;
                            i6 = 6;
                        default:
                            c3 = 0;
                            break;
                    }
                    c2 = c3;
                } else {
                    iuVar.d((char) iArr2[i8]);
                }
                c3 = 0;
                c2 = c3;
            }
            if (c2 != 0) {
                iuVar.d(c2);
            }
        }
        return i5;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x003e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0007 A[SYNTHETIC] */
    public static int c(int[] iArr, int i, iu iuVar) throws at2 {
        int[] iArr2 = new int[15];
        boolean z = false;
        int i2 = 0;
        while (true) {
            int i3 = iArr[0];
            if (i < i3 && !z) {
                int i4 = i + 1;
                int i5 = iArr[i];
                if (i4 == i3) {
                    z = true;
                }
                if (i5 < 900) {
                    iArr2[i2] = i5;
                    i2++;
                } else {
                    if (i5 != 900 && i5 != 901 && i5 != 927 && i5 != 928) {
                        switch (i5) {
                            case 922:
                            case 923:
                            case 924:
                                z = true;
                                break;
                        }
                    } else {
                        z = true;
                    }
                    if (i2 % 15 != 0 || i5 == 902 || z) {
                        if (i2 > 0) {
                            ((StringBuilder) iuVar.f1103o).append(a(iArr2, i2));
                            i2 = 0;
                        }
                    }
                }
                i = i4;
                if (i2 % 15 != 0) {
                }
                if (i2 > 0) {
                    ((StringBuilder) iuVar.f1103o).append(a(iArr2, i2));
                    i2 = 0;
                }
            }
        }
        return i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x0036. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0039. Please report as an issue. */
    public static int d(int[] iArr, int i, iu iuVar) throws at2 {
        int i2 = (iArr[0] - i) * 2;
        int[] iArr2 = new int[i2];
        int[] iArr3 = new int[i2];
        boolean z = false;
        int i3 = 0;
        int iB = 1;
        while (i < iArr[0] && !z) {
            int i4 = i + 1;
            int i5 = iArr[i];
            if (i5 < 900) {
                iArr2[i3] = i5 / 30;
                iArr2[i3 + 1] = i5 % 30;
                i3 += 2;
            } else if (i5 == 913) {
                iArr2[i3] = 913;
                i += 2;
                iArr3[i3] = iArr[i4];
                i3++;
            } else if (i5 != 927) {
                if (i5 != 928) {
                    switch (i5) {
                        case 900:
                            iArr2[i3] = 900;
                            i3++;
                            break;
                        case 901:
                        case 902:
                            break;
                        default:
                            switch (i5) {
                                case 922:
                                case 923:
                                case 924:
                                    break;
                                default:
                                    break;
                            }
                            break;
                    }
                }
                z = true;
            } else {
                iB = b(iArr2, iArr3, i3, iuVar, iB);
                i += 2;
                iuVar.e(iArr[i4]);
                int i6 = iArr[0];
                if (i > i6) {
                    throw at2.a();
                }
                int i7 = (i6 - i) * 2;
                iArr2 = new int[i7];
                iArr3 = new int[i7];
                i3 = 0;
            }
            i = i4;
        }
        b(iArr2, iArr3, i3, iuVar, iB);
        return i;
    }
}
