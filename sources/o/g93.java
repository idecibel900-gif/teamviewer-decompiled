package o;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class g93 {
    public String a;
    public String d;
    public ArrayList g;
    public String h;
    public String b = "";
    public String c = "";
    public int e = -1;
    public final ArrayList f = qf0.N("");

    public static ArrayList d(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iY = ub7.Y(str, '&', i, 4);
            if (iY == -1) {
                iY = str.length();
            }
            int iY2 = ub7.Y(str, '=', i, 4);
            if (iY2 == -1 || iY2 > iY) {
                arrayList.add(str.substring(i, iY));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, iY2));
                arrayList.add(str.substring(iY2 + 1, iY));
            }
            i = iY + 1;
        }
        return arrayList;
    }

    public final h93 a() {
        ArrayList arrayList;
        String str = this.a;
        if (str == null) {
            hk0.l("scheme == null");
            return null;
        }
        String strL = au8.L(this.b, 0, 0, 7);
        String strL2 = au8.L(this.c, 0, 0, 7);
        String str2 = this.d;
        if (str2 == null) {
            hk0.l("host == null");
            return null;
        }
        int iB = b();
        ArrayList arrayList2 = this.f;
        ArrayList arrayList3 = new ArrayList(mv0.Z(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(au8.L((String) it.next(), 0, 0, 7));
        }
        ArrayList<String> arrayList4 = this.g;
        if (arrayList4 != null) {
            arrayList = new ArrayList(mv0.Z(arrayList4, 10));
            for (String str3 : arrayList4) {
                arrayList.add(str3 != null ? au8.L(str3, 0, 0, 3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = this.h;
        return new h93(str, strL, strL2, str2, iB, arrayList3, arrayList, str4 != null ? au8.L(str4, 0, 0, 7) : null, toString());
    }

    public final int b() {
        int i = this.e;
        if (i != -1) {
            return i;
        }
        String str = this.a;
        str.getClass();
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0028  */
    public final void c(h93 h93Var, String str) {
        int i;
        int i2;
        int iD;
        int i3;
        int i4;
        char cCharAt;
        str.getClass();
        byte[] bArr = po8.a;
        int iG = po8.g(0, str.length(), str);
        int iH = po8.h(iG, str.length(), str);
        byte b = -1;
        if (iH - iG >= 2) {
            char cCharAt2 = str.charAt(iG);
            if ((im3.t(cCharAt2, 97) >= 0 && im3.t(cCharAt2, 122) <= 0) || (im3.t(cCharAt2, 65) >= 0 && im3.t(cCharAt2, 90) <= 0)) {
                i = iG + 1;
                while (true) {
                    if (i < iH) {
                        char cCharAt3 = str.charAt(i);
                        if (('a' > cCharAt3 || cCharAt3 >= '{') && (('A' > cCharAt3 || cCharAt3 >= '[') && !(('0' <= cCharAt3 && cCharAt3 < ':') || cCharAt3 == '+' || cCharAt3 == '-' || cCharAt3 == '.'))) {
                            if (cCharAt3 == ':') {
                                break;
                            } else {
                                break;
                            }
                        }
                        i++;
                    }
                    i = -1;
                    break;
                }
            } else {
                i = -1;
                break;
            }
        } else {
            i = -1;
            break;
        }
        int i5 = 1;
        if (i != -1) {
            if (bc7.M(iG, str, "https:", true)) {
                this.a = "https";
                iG += 6;
            } else {
                if (!bc7.M(iG, str, "http:", true)) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str.substring(0, i) + '\'');
                }
                this.a = "http";
                iG += 5;
            }
        } else {
            if (h93Var == null) {
                hk0.g("Expected URL scheme 'http' or 'https' but no scheme was found for ".concat(str.length() > 6 ? ub7.v0(6, str).concat("...") : str));
                return;
            }
            this.a = h93Var.a;
        }
        int i6 = iG;
        int i7 = 0;
        while (true) {
            i2 = i5;
            if (i6 >= iH || !((cCharAt = str.charAt(i6)) == '/' || cCharAt == '\\')) {
                break;
            }
            i7++;
            i6++;
            i5 = i2;
        }
        ArrayList arrayList = this.f;
        byte b2 = 35;
        if (i7 >= 2 || h93Var == null || !im3.n(h93Var.a, this.a)) {
            int i8 = iG + i7;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                iD = po8.d(str, i8, iH, "@/\\?#");
                byte bCharAt = iD != iH ? str.charAt(iD) : b;
                if (bCharAt == b || bCharAt == b2 || bCharAt == 47 || bCharAt == 92 || bCharAt == 63) {
                    break;
                }
                if (bCharAt == 64) {
                    if (i9 == 0) {
                        int iC = po8.c(str, ':', i8, iD);
                        String strU = au8.u(i8, iC, 112, str, " \"':;<=>@[]^`{}|/\\?#");
                        if (i10 != 0) {
                            strU = e41.l(new StringBuilder(this.b), "%40", strU);
                        }
                        this.b = strU;
                        if (iC != iD) {
                            this.c = au8.u(iC + 1, iD, 112, str, " \"':;<=>@[]^`{}|/\\?#");
                            i9 = i2;
                        }
                        i10 = i2;
                    } else {
                        this.c += "%40" + au8.u(i8, iD, 112, str, " \"':;<=>@[]^`{}|/\\?#");
                    }
                    i8 = iD + 1;
                    b2 = 35;
                    b = -1;
                }
            }
            int i11 = i8;
            while (true) {
                if (i11 < iD) {
                    char cCharAt4 = str.charAt(i11);
                    if (cCharAt4 == ':') {
                        break;
                    }
                    if (cCharAt4 == '[') {
                        do {
                            i11++;
                            if (i11 >= iD) {
                                break;
                            }
                        } while (str.charAt(i11) != ']');
                    }
                    i11++;
                } else {
                    i11 = iD;
                    break;
                }
            }
            int i12 = i11 + 1;
            if (i12 < iD) {
                this.d = no8.b(au8.L(str, i8, i11, 4));
                try {
                    i4 = Integer.parseInt(au8.u(i12, iD, 120, str, ""));
                    if (i2 > i4 || i4 >= 65536) {
                        i4 = -1;
                    }
                } catch (NumberFormatException unused) {
                }
                this.e = i4;
                if (i4 == -1) {
                    throw new IllegalArgumentException(("Invalid URL port: \"" + str.substring(i12, iD) + '\"').toString());
                }
            } else {
                this.d = no8.b(au8.L(str, i8, i11, 4));
                String str2 = this.a;
                str2.getClass();
                if (str2.equals("http")) {
                    i3 = 80;
                } else {
                    i3 = str2.equals("https") ? 443 : -1;
                }
                this.e = i3;
            }
            if (this.d == null) {
                throw new IllegalArgumentException(("Invalid URL host: \"" + str.substring(i8, i11) + '\"').toString());
            }
            iG = iD;
        } else {
            this.b = h93Var.e();
            this.c = h93Var.a();
            this.d = h93Var.d;
            this.e = h93Var.e;
            arrayList.clear();
            arrayList.addAll(h93Var.c());
            if (iG == iH || str.charAt(iG) == '#') {
                String strD = h93Var.d();
                this.g = strD != null ? d(au8.u(0, 0, 83, strD, " \"'<>#")) : null;
            }
        }
        int iD2 = po8.d(str, iG, iH, "?#");
        if (iG != iD2) {
            char cCharAt5 = str.charAt(iG);
            if (cCharAt5 == '/' || cCharAt5 == '\\') {
                arrayList.clear();
                arrayList.add("");
                iG++;
            } else {
                arrayList.set(arrayList.size() - 1, "");
            }
            while (iG < iD2) {
                int iD3 = po8.d(str, iG, iD2, "/\\");
                boolean z = iD3 < iD2;
                String strU2 = au8.u(iG, iD3, 112, str, " \"<>^`{}|/\\?#");
                if (!strU2.equals(".") && !strU2.equalsIgnoreCase("%2e")) {
                    if (!strU2.equals("..") && !strU2.equalsIgnoreCase("%2e.") && !strU2.equalsIgnoreCase(".%2e") && !strU2.equalsIgnoreCase("%2e%2e")) {
                        if (((CharSequence) ua5.j(1, arrayList)).length() == 0) {
                            arrayList.set(arrayList.size() - 1, strU2);
                        } else {
                            arrayList.add(strU2);
                        }
                        if (z) {
                            arrayList.add("");
                        }
                    } else if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                        arrayList.add("");
                    } else {
                        arrayList.set(arrayList.size() - 1, "");
                    }
                }
                iG = z ? iD3 + 1 : iD3;
            }
        }
        if (iD2 < iH && str.charAt(iD2) == '?') {
            int iC2 = po8.c(str, '#', iD2, iH);
            this.g = d(au8.u(iD2 + 1, iC2, 80, str, " \"'<>#"));
            iD2 = iC2;
        }
        if (iD2 >= iH || str.charAt(iD2) != '#') {
            return;
        }
        this.h = au8.u(iD2 + 1, iH, 48, str, "");
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008b  */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.a;
        if (str != null) {
            sb.append(str);
            sb.append("://");
        } else {
            sb.append("//");
        }
        if (this.b.length() > 0 || this.c.length() > 0) {
            sb.append(this.b);
            if (this.c.length() > 0) {
                sb.append(':');
                sb.append(this.c);
            }
            sb.append('@');
        }
        String str2 = this.d;
        if (str2 != null) {
            if (ub7.R(str2, ':')) {
                sb.append('[');
                sb.append(this.d);
                sb.append(']');
            } else {
                sb.append(this.d);
            }
        }
        int i = -1;
        if (this.e != -1 || this.a != null) {
            int iB = b();
            String str3 = this.a;
            if (str3 == null) {
                sb.append(':');
                sb.append(iB);
            } else {
                if (str3.equals("http")) {
                    i = 80;
                } else if (str3.equals("https")) {
                    i = 443;
                }
                if (iB != i) {
                    sb.append(':');
                    sb.append(iB);
                }
            }
        }
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append('/');
            sb.append((String) arrayList.get(i2));
        }
        if (this.g != null) {
            sb.append('?');
            ArrayList arrayList2 = this.g;
            arrayList2.getClass();
            wk3 wk3VarZ = ct1.Z(ct1.b0(0, arrayList2.size()), 2);
            int i3 = wk3VarZ.m;
            int i4 = wk3VarZ.n;
            int i5 = wk3VarZ.f2422o;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    String str4 = (String) arrayList2.get(i3);
                    String str5 = (String) arrayList2.get(i3 + 1);
                    if (i3 > 0) {
                        sb.append('&');
                    }
                    sb.append(str4);
                    if (str5 != null) {
                        sb.append('=');
                        sb.append(str5);
                    }
                    if (i3 == i4) {
                        break;
                    }
                    i3 += i5;
                }
            }
        }
        if (this.h != null) {
            sb.append('#');
            sb.append(this.h);
        }
        return sb.toString();
    }
}
