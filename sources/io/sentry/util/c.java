package io.sentry.util;

import io.sentry.v2;
import io.sentry.w2;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final List a = Arrays.asList("JSESSIONID", "JSESSIONIDSSO", "JSSOSESSIONID", "SESSIONID", "SID", "CSRFTOKEN", "XSRF-TOKEN");

    /* JADX WARN: Code duplicated, block: B:13:0x0039  */
    public static String a(String str, w2 w2Var) {
        boolean z;
        v2 v2Var;
        if (!str.trim().isEmpty()) {
            if (!b(str)) {
                return "[Filtered]";
            }
            String strSubstring = str.substring(0, str.indexOf(61));
            String strTrim = strSubstring.trim();
            if (!d.a(strTrim, d.b)) {
                z = a.contains(strTrim.toUpperCase(Locale.ROOT));
            }
            boolean zA = d.a(strTrim, w2Var.b);
            if (z || (((v2Var = w2Var.a) == v2.DENY_LIST && zA) || (v2Var == v2.ALLOW_LIST && !zA))) {
                return strSubstring.concat("=[Filtered]");
            }
        }
        return str;
    }

    public static boolean b(String str) {
        int i;
        String strTrim = str.trim();
        int iIndexOf = strTrim.indexOf(61);
        if (iIndexOf > 0) {
            String strSubstring = strTrim.substring(0, iIndexOf);
            for (int i2 = 0; i2 < strSubstring.length(); i2++) {
                char cCharAt = strSubstring.charAt(i2);
                if ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt < '0' || cCharAt > '9') && cCharAt != '!' && cCharAt != '|' && cCharAt != '~' && cCharAt != '*' && cCharAt != '+' && cCharAt != '-' && cCharAt != '.'))) {
                    switch (cCharAt) {
                        case '#':
                        case '$':
                        case '%':
                        case '&':
                        case '\'':
                            continue;
                        default:
                            switch (cCharAt) {
                                case '^':
                                case '_':
                                case '`':
                                    continue;
                                default:
                                    break;
                            }
                            break;
                    }
                }
            }
            String strSubstring2 = strTrim.substring(iIndexOf + 1);
            int length = strSubstring2.length();
            if (strSubstring2.isEmpty() || strSubstring2.charAt(0) != '\"') {
                i = 0;
            } else {
                if (strSubstring2.length() < 2 || strSubstring2.charAt(strSubstring2.length() - 1) != '\"') {
                    return false;
                }
                length--;
                i = 1;
            }
            while (i < length) {
                char cCharAt2 = strSubstring2.charAt(i);
                if (cCharAt2 != '!' && ((cCharAt2 < '#' || cCharAt2 > '+') && ((cCharAt2 < '-' || cCharAt2 > ':') && ((cCharAt2 < '<' || cCharAt2 > '[') && (cCharAt2 < ']' || cCharAt2 > '~'))))) {
                    return false;
                }
                i++;
            }
            return true;
        }
        return false;
    }
}
