package o;

import java.util.HashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class e41 {
    public static boolean a(int i, int i2, int i3) {
        switch (i) {
            case 1:
                return ((i2 + i3) & 1) == 0;
            case 2:
                return (i2 & 1) == 0;
            case 3:
                return i3 % 3 == 0;
            case 4:
                return (i2 + i3) % 3 == 0;
            case 5:
                return (((i3 / 3) + (i2 / 2)) & 1) == 0;
            case 6:
                return (i2 * i3) % 6 == 0;
            case 7:
                return (i2 * i3) % 6 < 3;
            default:
                return ((((i2 * i3) % 3) + (i2 + i3)) & 1) == 0;
        }
    }

    public static /* synthetic */ boolean b(int i) {
        switch (i) {
            case 1:
                return false;
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
            case 6:
            case 7:
            case 8:
                return false;
            default:
                throw null;
        }
    }

    public static /* synthetic */ boolean c(int i) {
        if (i == 1 || i == 2) {
            return false;
        }
        if (i == 3 || i == 4) {
            return true;
        }
        throw null;
    }

    public static /* synthetic */ boolean d(int i) {
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        throw null;
    }

    public static int e(float f, int i, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    public static int f(int i, int i2, Function0 function0) {
        return (function0.hashCode() + i) * i2;
    }

    public static String g(String str, long j) {
        return str + j;
    }

    public static String h(String str, String str2, int i, String str3, String str4) {
        return str + i + str2 + str3 + str4;
    }

    public static String i(String str, ut2 ut2Var, String str2) {
        return str + ut2Var + str2;
    }

    public static String j(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static String k(StringBuilder sb, long j, String str) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static String l(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String m(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    public static StringBuilder n(String str, float f, String str2, float f2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(f);
        sb.append(str2);
        sb.append(f2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder o(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static void p(int i, int i2, int i3, int i4, int i5) {
        qs1.m(i);
        qs1.m(i2);
        qs1.m(i3);
        qs1.m(i4);
        qs1.m(i5);
    }

    public static void q(int i, HashMap map, String str, int i2, String str2) {
        map.put(str, aj2.b(i));
        map.put(str2, aj2.b(i2));
    }

    public static void r(int i, ux2 ux2Var, iz0 iz0Var, ux2 ux2Var2) {
        o67.n(Integer.valueOf(i), iz0Var, ux2Var);
        o67.l(ux2Var2);
    }

    public static void s(String str, String str2, String str3) {
        ye4.c(str3, str + str2);
    }

    public static void t(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static /* synthetic */ String u(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case ep1.b /* 9 */:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String v(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case ep1.b /* 9 */:
                return "NULL";
            case ep1.c /* 10 */:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String w(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case ep1.b /* 9 */:
                return "NULL";
            case ep1.c /* 10 */:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    public static /* synthetic */ int x(String str) {
        if (str == null) {
            yq4.l("Name is null");
            return 0;
        }
        if (str.equals("GET")) {
            return 1;
        }
        if (str.equals("POST")) {
            return 2;
        }
        if (str.equals("PUT")) {
            return 3;
        }
        if (str.equals("DELETE")) {
            return 4;
        }
        if (str.equals("PATCH")) {
            return 5;
        }
        if (str.equals("HEAD")) {
            return 6;
        }
        if (str.equals("OPTIONS")) {
            return 7;
        }
        if (str.equals("TRACE")) {
            return 8;
        }
        hk0.g("No enum constant org.jsoup.Connection.Method.".concat(str));
        return 0;
    }
}
