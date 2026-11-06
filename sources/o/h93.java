package o;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class h93 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final ArrayList f;
    public final List g;
    public final String h;
    public final String i;

    public h93(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = arrayList;
        this.g = arrayList2;
        this.h = str5;
        this.i = str6;
    }

    public final String a() {
        if (this.c.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.i;
        return str.substring(ub7.Y(str, ':', length, 4) + 1, ub7.Y(str, '@', 0, 6));
    }

    public final String b() {
        int length = this.a.length() + 3;
        String str = this.i;
        int iY = ub7.Y(str, '/', length, 4);
        return str.substring(iY, po8.d(str, iY, str.length(), "?#"));
    }

    public final ArrayList c() {
        int length = this.a.length() + 3;
        String str = this.i;
        int iY = ub7.Y(str, '/', length, 4);
        int iD = po8.d(str, iY, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iY < iD) {
            int i = iY + 1;
            int iC = po8.c(str, '/', i, iD);
            arrayList.add(str.substring(i, iC));
            iY = iC;
        }
        return arrayList;
    }

    public final String d() {
        if (this.g == null) {
            return null;
        }
        String str = this.i;
        int iY = ub7.Y(str, '?', 0, 6) + 1;
        return str.substring(iY, po8.c(str, '#', iY, str.length()));
    }

    public final String e() {
        if (this.b.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.i;
        return str.substring(length, po8.d(str, length, str.length(), ":@"));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof h93) && ((h93) obj).i.equals(this.i);
    }

    public final String f() {
        g93 g93Var;
        try {
            g93Var = new g93();
            g93Var.c(this, "/...");
        } catch (IllegalArgumentException unused) {
            g93Var = null;
        }
        g93Var.getClass();
        g93Var.b = au8.u(0, 0, 123, "", " \"':;<=>@[]^`{}|/\\?#");
        g93Var.c = au8.u(0, 0, 123, "", " \"':;<=>@[]^`{}|/\\?#");
        return g93Var.a().i;
    }

    public final URI g() {
        String strSubstring;
        String strReplaceAll;
        g93 g93Var = new g93();
        String str = this.a;
        g93Var.a = str;
        g93Var.b = e();
        g93Var.c = a();
        g93Var.d = this.d;
        str.getClass();
        int i = str.equals("http") ? 80 : str.equals("https") ? 443 : -1;
        int i2 = this.e;
        g93Var.e = i2 != i ? i2 : -1;
        ArrayList arrayList = g93Var.f;
        arrayList.clear();
        arrayList.addAll(c());
        String strD = d();
        g93Var.g = strD != null ? g93.d(au8.u(0, 0, 83, strD, " \"'<>#")) : null;
        if (this.h == null) {
            strSubstring = null;
        } else {
            String str2 = this.i;
            strSubstring = str2.substring(ub7.Y(str2, '#', 0, 6) + 1);
        }
        g93Var.h = strSubstring;
        String str3 = g93Var.d;
        if (str3 != null) {
            Pattern patternCompile = Pattern.compile("[\"<>^`{|}]");
            patternCompile.getClass();
            strReplaceAll = patternCompile.matcher(str3).replaceAll("");
            strReplaceAll.getClass();
        } else {
            strReplaceAll = null;
        }
        g93Var.d = strReplaceAll;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.set(i3, au8.u(0, 0, 99, (String) arrayList.get(i3), "[]"));
        }
        ArrayList arrayList2 = g93Var.g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                String str4 = (String) arrayList2.get(i4);
                arrayList2.set(i4, str4 != null ? au8.u(0, 0, 67, str4, "\\^`{|}") : null);
            }
        }
        String str5 = g93Var.h;
        g93Var.h = str5 != null ? au8.u(0, 0, 35, str5, " \"#<>\\^`{|}") : null;
        String string = g93Var.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                Pattern patternCompile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                patternCompile2.getClass();
                String strReplaceAll2 = patternCompile2.matcher(string).replaceAll("");
                strReplaceAll2.getClass();
                URI uriCreate = URI.create(strReplaceAll2);
                uriCreate.getClass();
                return uriCreate;
            } catch (Exception unused) {
                gk0.r(e);
                return null;
            }
        }
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    public final String toString() {
        return this.i;
    }
}
