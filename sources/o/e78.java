package o;

import java.util.EnumMap;

/* JADX INFO: loaded from: classes.dex */
public final class e78 {
    public static final int[] c = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};
    public final int[] a;
    public final StringBuilder b;

    public e78(byte b) {
        switch (b) {
            case 1:
                this.a = new int[4];
                this.b = new StringBuilder();
                break;
            default:
                this.a = new int[4];
                this.b = new StringBuilder();
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0093  */
    /* JADX WARN: Code duplicated, block: B:67:0x0115  */
    public uc6 a(int i, i70 i70Var, int[] iArr) throws d55 {
        String str;
        String str2;
        EnumMap enumMap;
        StringBuilder sb = this.b;
        sb.setLength(0);
        int[] iArr2 = this.a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        byte b = 2;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int i2 = i70Var.n;
        int iC = iArr[1];
        int i3 = 0;
        for (int i4 = 0; i4 < 5 && iC < i2; i4++) {
            int iH = f78.h(i70Var, iArr2, iC, f78.g);
            sb.append((char) ((iH % 10) + 48));
            for (int i5 : iArr2) {
                iC += i5;
            }
            if (iH >= 10) {
                i3 |= 1 << (4 - i4);
            }
            if (i4 != 4) {
                iC = i70Var.c(i70Var.b(iC));
            }
        }
        if (sb.length() != 5) {
            throw d55.a();
        }
        for (int i6 = 0; i6 < 10; i6++) {
            if (i3 == c[i6]) {
                String string = sb.toString();
                int length = string.length();
                int iCharAt = 0;
                for (int i7 = length - 2; i7 >= 0; i7 -= 2) {
                    iCharAt += string.charAt(i7) - '0';
                }
                int iCharAt2 = iCharAt * 3;
                for (int i8 = length - 1; i8 >= 0; i8 -= 2) {
                    iCharAt2 += string.charAt(i8) - '0';
                }
                if ((iCharAt2 * 3) % 10 != i6) {
                    throw d55.a();
                }
                String string2 = sb.toString();
                if (string2.length() == 5) {
                    char cCharAt = string2.charAt(0);
                    if (cCharAt == '0') {
                        str = "£";
                    } else if (cCharAt != '5') {
                        str = "";
                        if (cCharAt == '9') {
                            switch (string2.hashCode()) {
                                case 54118329:
                                    b = string2.equals("90000") ? (byte) 0 : (byte) -1;
                                    break;
                                case 54395376:
                                    b = string2.equals("99990") ? (byte) 1 : (byte) -1;
                                    break;
                                case 54395377:
                                    if (!string2.equals("99991")) {
                                        b = -1;
                                    }
                                    break;
                                default:
                                    b = -1;
                                    break;
                            }
                            switch (b) {
                                case 0:
                                    str2 = null;
                                    break;
                                case 1:
                                    str2 = "Used";
                                    break;
                                case 2:
                                    str2 = "0.00";
                                    break;
                            }
                        }
                        if (str2 == null) {
                            enumMap = null;
                        } else {
                            enumMap = new EnumMap(vc6.class);
                            enumMap.put(vc6.s, str2);
                        }
                    } else {
                        str = "$";
                    }
                    int i9 = Integer.parseInt(string2.substring(1));
                    String strValueOf = String.valueOf(i9 / 100);
                    int i10 = i9 % 100;
                    str2 = str + strValueOf + '.' + (i10 < 10 ? fx3.e(i10, "0") : String.valueOf(i10));
                    if (str2 == null) {
                        enumMap = null;
                    } else {
                        enumMap = new EnumMap(vc6.class);
                        enumMap.put(vc6.s, str2);
                    }
                } else {
                    enumMap = null;
                }
                float f = i;
                uc6 uc6Var = new uc6(string2, null, new wc6[]{new wc6((iArr[0] + iArr[1]) / 2.0f, f), new wc6(iC, f)}, v20.C);
                if (enumMap != null) {
                    uc6Var.a(enumMap);
                }
                return uc6Var;
            }
        }
        throw d55.a();
    }
}
