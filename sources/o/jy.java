package o;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class jy implements Map.Entry, Cloneable {
    public static final String[] p = {"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", "default", "defer", "disabled", "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};
    public static final Pattern q = Pattern.compile("[^-a-zA-Z0-9_:.]+");
    public static final Pattern r = Pattern.compile("[\\x00-\\x1f\\x7f-\\x9f \"'/=]+");
    public final String m;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ly f1210o;

    public jy(String str, String str2, ly lyVar) {
        db8.o0(str);
        String strTrim = str.trim();
        db8.l0(strTrim);
        this.m = strTrim;
        this.n = str2;
        this.f1210o = lyVar;
    }

    public static String a(int i, String str) {
        if (str.isEmpty()) {
            return "_";
        }
        if (i == 2) {
            int length = str.length();
            if (length != 0 && c(str.charAt(0))) {
                int i2 = 1;
                while (true) {
                    if (i2 < length) {
                        char cCharAt = str.charAt(i2);
                        if ((cCharAt >= 'a' && cCharAt <= 'z') || ((cCharAt >= 'A' && cCharAt <= 'Z') || ((cCharAt >= '0' && cCharAt <= '9') || cCharAt == '-' || cCharAt == '_' || cCharAt == ':' || cCharAt == '.'))) {
                            i2++;
                        }
                    }
                }
            }
            String strReplaceAll = q.matcher(str).replaceAll("_");
            if (c(strReplaceAll.charAt(0))) {
                return strReplaceAll;
            }
            StringBuilder sbB = lb7.b();
            sbB.append('_');
            sbB.append(strReplaceAll);
            return lb7.k(sbB);
        }
        if (i == 1) {
            int length2 = str.length();
            if (length2 != 0) {
                for (int i3 = 0; i3 < length2; i3++) {
                    char cCharAt2 = str.charAt(i3);
                    if (cCharAt2 > 31 && ((cCharAt2 < 127 || cCharAt2 > 159) && cCharAt2 != ' ' && cCharAt2 != '\"' && cCharAt2 != '\'' && cCharAt2 != '/' && cCharAt2 != '=')) {
                    }
                }
            }
            return r.matcher(str).replaceAll("_");
        }
        return str;
    }

    public static void b(String str, String str2, lq1 lq1Var, h32 h32Var) {
        lq1Var.k(str);
        if (h32Var.p == 1) {
            if (str2 == null) {
                return;
            }
            if ((str2.isEmpty() || str2.equalsIgnoreCase(str)) && Arrays.binarySearch(p, us1.F(str)) >= 0) {
                return;
            }
        }
        lq1Var.k("=\"");
        dc2.c(lq1Var, ly.c(str2), h32Var, 2);
        lq1Var.j('\"');
    }

    public static boolean c(char c) {
        if (c < 'a' || c > 'z') {
            return (c >= 'A' && c <= 'Z') || c == '_' || c == ':';
        }
        return true;
    }

    public final Object clone() {
        try {
            return (jy) super.clone();
        } catch (CloneNotSupportedException e) {
            gk0.r(e);
            return null;
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jy.class != obj.getClass()) {
            return false;
        }
        jy jyVar = (jy) obj;
        return this.m.equals(jyVar.m) && Objects.equals(this.n, jyVar.n);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.m;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return ly.c(this.n);
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return Objects.hash(this.m, this.n);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        String str;
        int iL;
        String str2 = (String) obj;
        String strH = this.n;
        ly lyVar = this.f1210o;
        if (lyVar != null && (iL = lyVar.l((str = this.m))) != -1) {
            strH = this.f1210o.h(str);
            this.f1210o.f1417o[iL] = str2;
        }
        this.n = str2;
        return ly.c(strH);
    }

    public final String toString() {
        StringBuilder sbB = lb7.b();
        lq1 lq1VarS = lq1.S(sbB);
        h32 h32Var = new h32();
        b(a(h32Var.p, this.m), this.n, lq1VarS, h32Var);
        return lb7.k(sbB);
    }
}
