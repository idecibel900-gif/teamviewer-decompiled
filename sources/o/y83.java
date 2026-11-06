package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public abstract class y83 {
    static {
        ai0 ai0Var = ai0.p;
        ju.s("\"\\");
        ju.s("\t ,=");
    }

    public static final boolean a(lc6 lc6Var) {
        if (im3.n(lc6Var.m.b, "HEAD")) {
            return false;
        }
        int i = lc6Var.p;
        if (((i < 100 || i >= 200) && i != 204 && i != 304) || ro8.e(lc6Var) != -1) {
            return true;
        }
        String strA = lc6Var.r.a("Transfer-Encoding");
        if (strA == null) {
            strA = null;
        }
        return "chunked".equalsIgnoreCase(strA);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0075  */
    public static final void b(xz2 xz2Var, h93 h93Var, k53 k53Var) {
        List listUnmodifiableList;
        wc1 wc1Var;
        String strSubstring;
        xz2Var.getClass();
        h93Var.getClass();
        k53Var.getClass();
        if (xz2Var == xz2.H) {
            return;
        }
        Pattern pattern = wc1.k;
        List listB = k53Var.b("Set-Cookie");
        int size = listB.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            String str = (String) listB.get(i);
            str.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            byte[] bArr = po8.a;
            char c = ';';
            int iC = po8.c(str, ';', 0, str.length());
            int iC2 = po8.c(str, '=', 0, iC);
            if (iC2 == iC) {
                wc1Var = null;
                break;
            }
            int iG = po8.g(0, iC2, str);
            String strSubstring2 = str.substring(iG, po8.h(iG, iC2, str));
            if (strSubstring2.length() == 0 || po8.f(strSubstring2) != -1) {
                wc1Var = null;
                break;
            }
            int iG2 = po8.g(iC2 + 1, iC, str);
            String strSubstring3 = str.substring(iG2, po8.h(iG2, iC, str));
            if (po8.f(strSubstring3) == -1) {
                int i2 = iC + 1;
                int length = str.length();
                long j = 253402300799999L;
                boolean z = false;
                boolean z2 = false;
                boolean z3 = false;
                long jH = 253402300799999L;
                String str2 = null;
                String strSubstring4 = null;
                long j2 = -1;
                boolean z4 = true;
                String str3 = null;
                while (true) {
                    if (i2 >= length) {
                        if (j2 == Long.MIN_VALUE) {
                            j = Long.MIN_VALUE;
                        } else if (j2 != -1) {
                            long j3 = jCurrentTimeMillis + (j2 <= 9223372036854775L ? j2 * 1000 : Long.MAX_VALUE);
                            if (j3 >= jCurrentTimeMillis && j3 <= 253402300799999L) {
                                j = j3;
                            }
                        } else {
                            j = jH;
                        }
                        String str4 = h93Var.d;
                        if (str2 == null) {
                            str2 = str4;
                        } else if (!im3.n(str4, str2) && (!bc7.G(false, str4, str2) || str4.charAt((str4.length() - str2.length()) - 1) != '.' || no8.a.c(str4))) {
                            break;
                        }
                        if (str4.length() == str2.length() || ix5.d.a(str2) != null) {
                            if (strSubstring4 == null || !bc7.N(false, strSubstring4, "/")) {
                                String strB = h93Var.b();
                                int iD0 = ub7.d0(strB, '/', 0, 6);
                                strSubstring4 = iD0 != 0 ? strB.substring(0, iD0) : "/";
                            }
                            wc1Var = new wc1(strSubstring2, strSubstring3, j, str2, strSubstring4, z, z2, z3, z4, str3);
                            break;
                        }
                    } else {
                        int iC3 = po8.c(str, c, i2, length);
                        int iC4 = po8.c(str, '=', i2, iC3);
                        int iG3 = po8.g(i2, iC4, str);
                        String strSubstring5 = str.substring(iG3, po8.h(iG3, iC4, str));
                        if (iC4 < iC3) {
                            int iG4 = po8.g(iC4 + 1, iC3, str);
                            strSubstring = str.substring(iG4, po8.h(iG4, iC3, str));
                        } else {
                            strSubstring = "";
                        }
                        if (strSubstring5.equalsIgnoreCase("expires")) {
                            try {
                                jH = au8.H(strSubstring.length(), strSubstring);
                                z3 = true;
                            } catch (NumberFormatException | IllegalArgumentException unused) {
                            }
                        } else if (strSubstring5.equalsIgnoreCase("max-age")) {
                            try {
                                j2 = Long.parseLong(strSubstring);
                                if (j2 <= 0) {
                                    j2 = Long.MIN_VALUE;
                                }
                            } catch (NumberFormatException e) {
                                Pattern patternCompile = Pattern.compile("-?\\d+");
                                patternCompile.getClass();
                                if (!patternCompile.matcher(strSubstring).matches()) {
                                    throw e;
                                }
                                j2 = bc7.N(false, strSubstring, "-") ? Long.MIN_VALUE : Long.MAX_VALUE;
                            }
                            z3 = true;
                        } else if (strSubstring5.equalsIgnoreCase("domain")) {
                            if (bc7.G(false, strSubstring, ".")) {
                                throw new IllegalArgumentException("Failed requirement.");
                            }
                            String strB2 = no8.b(ub7.i0(strSubstring, "."));
                            if (strB2 == null) {
                                throw new IllegalArgumentException();
                            }
                            str2 = strB2;
                            z4 = false;
                        } else if (strSubstring5.equalsIgnoreCase("path")) {
                            strSubstring4 = strSubstring;
                        } else if (strSubstring5.equalsIgnoreCase("secure")) {
                            z = true;
                        } else if (strSubstring5.equalsIgnoreCase("httponly")) {
                            z2 = true;
                        } else if (strSubstring5.equalsIgnoreCase("samesite")) {
                            str3 = strSubstring;
                        }
                        i2 = iC3 + 1;
                        c = ';';
                    }
                }
            }
            wc1Var = null;
            break;
            if (wc1Var != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(wc1Var);
            }
        }
        if (arrayList != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            listUnmodifiableList.getClass();
        } else {
            listUnmodifiableList = null;
        }
        if (listUnmodifiableList == null) {
            listUnmodifiableList = ea2.m;
        }
        listUnmodifiableList.isEmpty();
    }
}
