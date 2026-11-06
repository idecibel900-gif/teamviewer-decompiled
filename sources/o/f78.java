package o;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class f78 extends a95 {
    public static final int[] d = {1, 1, 1};
    public static final int[] e = {1, 1, 1, 1, 1};
    public static final int[][] f;
    public static final int[][] g;
    public final StringBuilder a = new StringBuilder(20);
    public final cj3 b = new cj3((byte) 5);
    public final m72 c = new m72((byte) 0);

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f = iArr;
        int[][] iArr2 = new int[20][];
        g = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i = 10; i < 20; i++) {
            int[] iArr3 = f[i - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i2 = 0; i2 < iArr3.length; i2++) {
                iArr4[i2] = iArr3[(iArr3.length - i2) - 1];
            }
            g[i] = iArr4;
        }
    }

    public static int h(i70 i70Var, int[] iArr, int i, int[][] iArr2) {
        a95.e(i, i70Var, iArr);
        int length = iArr2.length;
        float f2 = 0.48f;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            float fD = a95.d(iArr, iArr2[i3], 0.7f);
            if (fD < f2) {
                i2 = i3;
                f2 = fD;
            }
        }
        if (i2 >= 0) {
            return i2;
        }
        throw d55.a();
    }

    public static int[] l(i70 i70Var, int i, boolean z, int[] iArr, int[] iArr2) {
        int i2 = i70Var.n;
        int iC = z ? i70Var.c(i) : i70Var.b(i);
        int length = iArr.length;
        boolean z2 = z;
        int i3 = 0;
        int i4 = iC;
        while (iC < i2) {
            if (i70Var.a(iC) != z2) {
                iArr2[i3] = iArr2[i3] + 1;
            } else {
                if (i3 != length - 1) {
                    i3++;
                } else {
                    if (a95.d(iArr2, iArr, 0.7f) < 0.48f) {
                        return new int[]{i4, iC};
                    }
                    i4 += iArr2[0] + iArr2[1];
                    int i5 = i3 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i5);
                    iArr2[i5] = 0;
                    iArr2[i3] = 0;
                    i3--;
                }
                iArr2[i3] = 1;
                z2 = !z2;
            }
            iC++;
        }
        throw d55.a();
    }

    public static int[] m(i70 i70Var) {
        int[] iArr = new int[3];
        int[] iArrL = null;
        boolean zD = false;
        int i = 0;
        while (!zD) {
            Arrays.fill(iArr, 0, 3, 0);
            iArrL = l(i70Var, i, false, d, iArr);
            int i2 = iArrL[0];
            int i3 = iArrL[1];
            int i4 = i2 - (i3 - i2);
            if (i4 >= 0) {
                zD = i70Var.d(i4, i2);
            }
            i = i3;
        }
        return iArrL;
    }

    @Override // o.a95
    public uc6 b(int i, i70 i70Var, Map map) {
        return k(i, i70Var, m(i70Var), map);
    }

    public boolean g(String str) throws at2 {
        int length = str.length();
        if (length != 0) {
            int i = length - 1;
            int iDigit = Character.digit(str.charAt(i), 10);
            CharSequence charSequenceSubSequence = str.subSequence(0, i);
            int length2 = charSequenceSubSequence.length();
            int i2 = 0;
            for (int i3 = length2 - 1; i3 >= 0; i3 -= 2) {
                int iCharAt = charSequenceSubSequence.charAt(i3) - '0';
                if (iCharAt < 0 || iCharAt > 9) {
                    throw at2.a();
                }
                i2 += iCharAt;
            }
            int i4 = i2 * 3;
            for (int i5 = length2 - 2; i5 >= 0; i5 -= 2) {
                int iCharAt2 = charSequenceSubSequence.charAt(i5) - '0';
                if (iCharAt2 < 0 || iCharAt2 > 9) {
                    throw at2.a();
                }
                i4 += iCharAt2;
            }
            if ((1000 - i4) % 10 == iDigit) {
                return true;
            }
        }
        return false;
    }

    public int[] i(i70 i70Var, int i) {
        return l(i70Var, i, false, d, new int[3]);
    }

    public abstract int j(i70 i70Var, int[] iArr, StringBuilder sb);

    public uc6 k(int i, i70 i70Var, int[] iArr, Map map) throws at2, d55, lq0 {
        int length;
        String str = null;
        xc6 xc6Var = map == null ? null : (xc6) map.get(pi1.NEED_RESULT_POINT_CALLBACK);
        if (xc6Var != null) {
            xc6Var.a(new wc6((iArr[0] + iArr[1]) / 2.0f, i));
        }
        StringBuilder sb = this.a;
        sb.setLength(0);
        int iJ = j(i70Var, iArr, sb);
        if (xc6Var != null) {
            xc6Var.a(new wc6(iJ, i));
        }
        int[] iArrI = i(i70Var, iJ);
        if (xc6Var != null) {
            xc6Var.a(new wc6((iArrI[0] + iArrI[1]) / 2.0f, i));
        }
        int i2 = iArrI[1];
        int i3 = (i2 - iArrI[0]) + i2;
        if (i3 >= i70Var.n || !i70Var.d(i2, i3)) {
            throw d55.a();
        }
        String string = sb.toString();
        if (string.length() < 8) {
            throw at2.a();
        }
        if (!g(string)) {
            throw lq0.a();
        }
        float f2 = (iArr[1] + iArr[0]) / 2.0f;
        float f3 = (iArrI[1] + iArrI[0]) / 2.0f;
        v20 v20VarN = n();
        float f4 = i;
        uc6 uc6Var = new uc6(string, null, new wc6[]{new wc6(f2, f4), new wc6(f3, f4)}, v20VarN);
        try {
            uc6 uc6VarV = this.b.v(i, iArrI[1], i70Var);
            uc6Var.b(vc6.u, uc6VarV.a);
            uc6Var.a(uc6VarV.e);
            wc6[] wc6VarArr = uc6VarV.c;
            wc6[] wc6VarArr2 = uc6Var.c;
            if (wc6VarArr2 == null) {
                uc6Var.c = wc6VarArr;
            } else if (wc6VarArr != null && wc6VarArr.length > 0) {
                wc6[] wc6VarArr3 = new wc6[wc6VarArr2.length + wc6VarArr.length];
                System.arraycopy(wc6VarArr2, 0, wc6VarArr3, 0, wc6VarArr2.length);
                System.arraycopy(wc6VarArr, 0, wc6VarArr3, wc6VarArr2.length, wc6VarArr.length);
                uc6Var.c = wc6VarArr3;
            }
            length = uc6VarV.a.length();
        } catch (p36 unused) {
            length = 0;
        }
        int[] iArr2 = map == null ? null : (int[]) map.get(pi1.ALLOWED_EAN_EXTENSIONS);
        if (iArr2 != null) {
            int length2 = iArr2.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length2) {
                    throw d55.a();
                }
                if (length == iArr2[i4]) {
                    break;
                }
                i4++;
            }
        }
        if (v20VarN == v20.t || v20VarN == v20.A) {
            m72 m72Var = this.c;
            synchronized (m72Var) {
                if (m72Var.a.isEmpty()) {
                    m72Var.a("US/CA", new int[]{0, 19});
                    m72Var.a("US", new int[]{30, 39});
                    m72Var.a("US/CA", new int[]{60, 139});
                    m72Var.a("FR", new int[]{300, 379});
                    m72Var.a("BG", new int[]{380});
                    m72Var.a("SI", new int[]{383});
                    m72Var.a("HR", new int[]{385});
                    m72Var.a("BA", new int[]{387});
                    m72Var.a("DE", new int[]{400, 440});
                    m72Var.a("JP", new int[]{450, 459});
                    m72Var.a("RU", new int[]{460, 469});
                    m72Var.a("TW", new int[]{471});
                    m72Var.a("EE", new int[]{474});
                    m72Var.a("LV", new int[]{475});
                    m72Var.a("AZ", new int[]{476});
                    m72Var.a("LT", new int[]{477});
                    m72Var.a("UZ", new int[]{478});
                    m72Var.a("LK", new int[]{479});
                    m72Var.a("PH", new int[]{480});
                    m72Var.a("BY", new int[]{481});
                    m72Var.a("UA", new int[]{482});
                    m72Var.a("MD", new int[]{484});
                    m72Var.a("AM", new int[]{485});
                    m72Var.a("GE", new int[]{486});
                    m72Var.a("KZ", new int[]{487});
                    m72Var.a("HK", new int[]{489});
                    m72Var.a("JP", new int[]{490, 499});
                    m72Var.a("GB", new int[]{500, 509});
                    m72Var.a("GR", new int[]{520});
                    m72Var.a("LB", new int[]{528});
                    m72Var.a("CY", new int[]{529});
                    m72Var.a("MK", new int[]{531});
                    m72Var.a("MT", new int[]{535});
                    m72Var.a("IE", new int[]{539});
                    m72Var.a("BE/LU", new int[]{540, 549});
                    m72Var.a("PT", new int[]{560});
                    m72Var.a("IS", new int[]{569});
                    m72Var.a("DK", new int[]{570, 579});
                    m72Var.a("PL", new int[]{590});
                    m72Var.a("RO", new int[]{594});
                    m72Var.a("HU", new int[]{599});
                    m72Var.a("ZA", new int[]{600, 601});
                    m72Var.a("GH", new int[]{603});
                    m72Var.a("BH", new int[]{608});
                    m72Var.a("MU", new int[]{609});
                    m72Var.a("MA", new int[]{611});
                    m72Var.a("DZ", new int[]{613});
                    m72Var.a("KE", new int[]{616});
                    m72Var.a("CI", new int[]{618});
                    m72Var.a("TN", new int[]{619});
                    m72Var.a("SY", new int[]{621});
                    m72Var.a("EG", new int[]{622});
                    m72Var.a("LY", new int[]{624});
                    m72Var.a("JO", new int[]{625});
                    m72Var.a("IR", new int[]{626});
                    m72Var.a("KW", new int[]{627});
                    m72Var.a("SA", new int[]{628});
                    m72Var.a("AE", new int[]{629});
                    m72Var.a("FI", new int[]{640, 649});
                    m72Var.a("CN", new int[]{690, 695});
                    m72Var.a("NO", new int[]{700, 709});
                    m72Var.a("IL", new int[]{729});
                    m72Var.a("SE", new int[]{730, 739});
                    m72Var.a("GT", new int[]{740});
                    m72Var.a("SV", new int[]{741});
                    m72Var.a("HN", new int[]{742});
                    m72Var.a("NI", new int[]{743});
                    m72Var.a("CR", new int[]{744});
                    m72Var.a("PA", new int[]{745});
                    m72Var.a("DO", new int[]{746});
                    m72Var.a("MX", new int[]{750});
                    m72Var.a("CA", new int[]{754, 755});
                    m72Var.a("VE", new int[]{759});
                    m72Var.a("CH", new int[]{760, 769});
                    m72Var.a("CO", new int[]{770});
                    m72Var.a("UY", new int[]{773});
                    m72Var.a("PE", new int[]{775});
                    m72Var.a("BO", new int[]{777});
                    m72Var.a("AR", new int[]{779});
                    m72Var.a("CL", new int[]{780});
                    m72Var.a("PY", new int[]{784});
                    m72Var.a("PE", new int[]{785});
                    m72Var.a("EC", new int[]{786});
                    m72Var.a("BR", new int[]{789, 790});
                    m72Var.a("IT", new int[]{800, 839});
                    m72Var.a("ES", new int[]{840, 849});
                    m72Var.a("CU", new int[]{850});
                    m72Var.a("SK", new int[]{858});
                    m72Var.a("CZ", new int[]{859});
                    m72Var.a("YU", new int[]{860});
                    m72Var.a("MN", new int[]{865});
                    m72Var.a("KP", new int[]{867});
                    m72Var.a("TR", new int[]{868, 869});
                    m72Var.a("NL", new int[]{870, 879});
                    m72Var.a("KR", new int[]{880});
                    m72Var.a("TH", new int[]{885});
                    m72Var.a("SG", new int[]{888});
                    m72Var.a("IN", new int[]{890});
                    m72Var.a("VN", new int[]{893});
                    m72Var.a("PK", new int[]{896});
                    m72Var.a("ID", new int[]{899});
                    m72Var.a("AT", new int[]{900, 919});
                    m72Var.a("AU", new int[]{930, 939});
                    m72Var.a("AZ", new int[]{940, 949});
                    m72Var.a("MY", new int[]{955});
                    m72Var.a("MO", new int[]{958});
                }
            }
            int i5 = Integer.parseInt(string.substring(0, 3));
            int size = m72Var.a.size();
            for (int i6 = 0; i6 < size; i6++) {
                int[] iArr3 = (int[]) m72Var.a.get(i6);
                int i7 = iArr3[0];
                if (i5 < i7) {
                    break;
                }
                if (iArr3.length != 1) {
                    i7 = iArr3[1];
                }
                if (i5 <= i7) {
                    str = (String) m72Var.b.get(i6);
                    break;
                }
            }
            if (str != null) {
                uc6Var.b(vc6.t, str);
            }
        }
        int i8 = v20VarN == v20.s ? 4 : 0;
        uc6Var.b(vc6.y, "]E" + i8);
        return uc6Var;
    }

    public abstract v20 n();
}
