package io.sentry.util;

import io.sentry.v0;
import io.sentry.v2;
import io.sentry.w2;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final List a = Arrays.asList("X-FORWARDED-FOR", "AUTHORIZATION", "COOKIE", "SET-COOKIE", "X-API-KEY", "X-REAL-IP", "REMOTE-ADDR", "FORWARDED", "PROXY-AUTHORIZATION", "X-CSRF-TOKEN", "X-CSRFTOKEN", "X-XSRF-TOKEN");
    public static final List b = Arrays.asList("auth", "token", "secret", "password", "passwd", "pwd", "key", "jwt", "bearer", "sso", "saml", "csrf", "xsrf", "credentials", "session", "sid", "identity");
    public static final v0 c = new v0(400, 499);
    public static final v0 d = new v0(500, 599);

    public static boolean a(String str, List list) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str2 != null && !str2.isEmpty() && lowerCase.contains(str2.toLowerCase(Locale.ROOT))) {
                return true;
            }
        }
        return false;
    }

    public static LinkedHashMap b(LinkedHashMap linkedHashMap, w2 w2Var) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (w2Var.a != v2.OFF) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                if (a(str, b) || "Cookie".equalsIgnoreCase(str) || "Set-Cookie".equalsIgnoreCase(str)) {
                    linkedHashMap2.put(str, "[Filtered]");
                } else {
                    boolean zA = a(str, w2Var.b);
                    if (w2Var.a != v2.DENY_LIST) {
                        zA = !zA;
                    }
                    linkedHashMap2.put(str, zA ? "[Filtered]" : (String) entry.getValue());
                }
            }
        }
        return linkedHashMap2;
    }
}
