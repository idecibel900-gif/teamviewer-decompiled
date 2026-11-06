package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ub7 extends bc7 {
    public static boolean Q(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (charSequence2 instanceof String) {
            if (Z(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
                return true;
            }
        } else if (X(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean R(CharSequence charSequence, char c) {
        charSequence.getClass();
        return Y(charSequence, c, 0, 2) >= 0;
    }

    public static String S(String str) {
        str.getClass();
        int length = str.length() - 1;
        if (length < 0) {
            length = 0;
        }
        return v0(length, str);
    }

    public static boolean T(CharSequence charSequence, char c) {
        charSequence.getClass();
        return charSequence.length() > 0 && qf0.u(charSequence.charAt(charSequence.length() - 1), c, false);
    }

    public static boolean U(CharSequence charSequence, CharSequence charSequence2) {
        charSequence.getClass();
        return ((charSequence instanceof String) && (charSequence2 instanceof String)) ? bc7.G(false, (String) charSequence, (String) charSequence2) : h0(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), false);
    }

    public static Character V(CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    public static final int W(CharSequence charSequence, String str, int i, boolean z) {
        charSequence.getClass();
        str.getClass();
        return (z || !(charSequence instanceof String)) ? X(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    public static final int X(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        wk3 wk3Var;
        if (z2) {
            charSequence.getClass();
            int length = charSequence.length() - 1;
            if (i > length) {
                i = length;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            wk3Var = new wk3(i, i2, -1);
        } else {
            if (i < 0) {
                i = 0;
            }
            int length2 = charSequence.length();
            if (i2 > length2) {
                i2 = length2;
            }
            wk3Var = new yk3(i, i2, 1);
        }
        boolean z3 = charSequence instanceof String;
        int i3 = wk3Var.f2422o;
        int i4 = wk3Var.n;
        int i5 = wk3Var.m;
        if (!z3 || !(charSequence2 instanceof String)) {
            boolean z4 = z;
            if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
                while (true) {
                    CharSequence charSequence3 = charSequence;
                    CharSequence charSequence4 = charSequence2;
                    boolean z5 = z4;
                    z4 = z5;
                    if (h0(charSequence4, 0, charSequence3, i5, charSequence2.length(), z5)) {
                        return i5;
                    }
                    if (i5 != i4) {
                        i5 += i3;
                        charSequence2 = charSequence4;
                        charSequence = charSequence3;
                    }
                }
            }
        } else if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
            int i6 = i5;
            while (true) {
                String str = (String) charSequence2;
                boolean z6 = z;
                if (bc7.J(0, i6, str.length(), str, (String) charSequence, z6)) {
                    return i6;
                }
                if (i6 != i4) {
                    i6 += i3;
                    z = z6;
                }
            }
        }
        return -1;
    }

    public static int Y(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        charSequence.getClass();
        return !(charSequence instanceof String) ? a0(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }

    public static /* synthetic */ int Z(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return W(charSequence, str, i, z);
    }

    public static final int a0(CharSequence charSequence, char[] cArr, int i, boolean z) {
        charSequence.getClass();
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(cx.b1(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (qf0.u(c, cCharAt, z)) {
                    return i;
                }
            }
            if (i == length) {
                return -1;
            }
            i++;
        }
    }

    public static boolean b0(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!qf0.J(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static char c0(CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() != 0) {
            return charSequence.charAt(charSequence.length() - 1);
        }
        an4.j("Char sequence is empty.");
        return (char) 0;
    }

    public static int d0(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = charSequence.length() - 1;
        }
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(cx.b1(cArr), i);
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            i = length;
        }
        while (-1 < i) {
            if (qf0.u(cArr[0], charSequence.charAt(i), false)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static int e0(String str, int i, int i2, String str2) {
        if ((i2 & 2) != 0) {
            str.getClass();
            i = str.length() - 1;
        }
        str.getClass();
        str2.getClass();
        return str.lastIndexOf(str2, i);
    }

    public static List f0(CharSequence charSequence) {
        ca4 ca4Var = new ca4(charSequence);
        if (!ca4Var.hasNext()) {
            return ea2.m;
        }
        Object next = ca4Var.next();
        if (!ca4Var.hasNext()) {
            return qf0.K(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (ca4Var.hasNext()) {
            arrayList.add(ca4Var.next());
        }
        return arrayList;
    }

    public static String g0(int i, String str) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        if (i < 0) {
            hk0.g(fx3.f(i, "Desired length ", " is less than zero."));
            return null;
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static final boolean h0(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!qf0.u(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static String i0(String str, CharSequence charSequence) {
        str.getClass();
        return o0(str, charSequence) ? str.substring(charSequence.length()) : str;
    }

    public static String j0(String str, CharSequence charSequence) {
        str.getClass();
        return U(str, charSequence) ? str.substring(0, str.length() - charSequence.length()) : str;
    }

    public static final void k0(int i) {
        if (i >= 0) {
            return;
        }
        gk0.h(fx3.e(i, "Limit must be non-negative, but was "));
    }

    public static final List l0(CharSequence charSequence, String str, int i) {
        k0(i);
        int iW = W(charSequence, str, 0, false);
        if (iW == -1 || i == 1) {
            return qf0.K(charSequence.toString());
        }
        boolean z = i > 0;
        int i2 = 10;
        if (z && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iW).toString());
            length = str.length() + iW;
            if (z && arrayList.size() == i - 1) {
                break;
            }
            iW = W(charSequence, str, length, false);
        } while (iW != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static List m0(CharSequence charSequence, char[] cArr) {
        charSequence.getClass();
        if (cArr.length == 1) {
            return l0(charSequence, String.valueOf(cArr[0]), 0);
        }
        k0(0);
        gn1<yk3> gn1Var = new gn1(charSequence, 0, new gg4(cArr, (byte) 21));
        ArrayList arrayList = new ArrayList(mv0.Z(new ex(gn1Var, (byte) 2), 10));
        for (yk3 yk3Var : gn1Var) {
            yk3Var.getClass();
            arrayList.add(charSequence.subSequence(yk3Var.m, yk3Var.n + 1).toString());
        }
        return arrayList;
    }

    public static List n0(CharSequence charSequence, String[] strArr, int i) {
        byte b = 2;
        int i2 = (i & 4) != 0 ? 0 : 2;
        charSequence.getClass();
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() > 0) {
                return l0(charSequence, str, i2);
            }
        }
        k0(i2);
        List listAsList = Arrays.asList(strArr);
        listAsList.getClass();
        gn1<yk3> gn1Var = new gn1(charSequence, i2, new zs1(listAsList, b));
        ArrayList arrayList = new ArrayList(mv0.Z(new ex(gn1Var, b), 10));
        for (yk3 yk3Var : gn1Var) {
            yk3Var.getClass();
            arrayList.add(charSequence.subSequence(yk3Var.m, yk3Var.n + 1).toString());
        }
        return arrayList;
    }

    public static boolean o0(CharSequence charSequence, CharSequence charSequence2) {
        charSequence.getClass();
        charSequence2.getClass();
        return ((charSequence instanceof String) && (charSequence2 instanceof String)) ? bc7.N(false, (String) charSequence, (String) charSequence2) : h0(charSequence, 0, charSequence2, 0, charSequence2.length(), false);
    }

    public static String p0(String str, String str2) {
        int iZ = Z(str, str2, 0, false, 6);
        return iZ == -1 ? str : str.substring(str2.length() + iZ, str.length());
    }

    public static String q0(char c, String str, String str2) {
        str.getClass();
        str2.getClass();
        int iD0 = d0(str, c, 0, 6);
        return iD0 == -1 ? str2 : str.substring(iD0 + 1, str.length());
    }

    public static String r0(String str, char c) {
        str.getClass();
        str.getClass();
        int iY = Y(str, c, 0, 6);
        return iY == -1 ? str : str.substring(0, iY);
    }

    public static String s0(String str, String str2) {
        str.getClass();
        str.getClass();
        int iZ = Z(str, str2, 0, false, 6);
        return iZ == -1 ? str : str.substring(0, iZ);
    }

    public static String t0(String str, char c) {
        int iD0 = d0(str, c, 0, 6);
        return iD0 == -1 ? str : str.substring(0, iD0);
    }

    public static CharSequence u0(int i, CharSequence charSequence) {
        charSequence.getClass();
        if (i < 0) {
            gk0.h(fx3.f(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = charSequence.length();
        if (i > length) {
            i = length;
        }
        return charSequence.subSequence(0, i);
    }

    public static String v0(int i, String str) {
        str.getClass();
        if (i < 0) {
            gk0.h(fx3.f(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    public static Boolean w0(String str) {
        str.getClass();
        if (str.equals("true")) {
            return Boolean.TRUE;
        }
        if (str.equals("false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static CharSequence x0(CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zJ = qf0.J(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zJ) {
                    break;
                }
                length--;
            } else if (zJ) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static CharSequence y0(String str) {
        str.getClass();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!qf0.J(str.charAt(i))) {
                return str.subSequence(i, str.length());
            }
        }
        return "";
    }
}
