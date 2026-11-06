package io.sentry;

import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public String a;

    public static e a(d dVar, List list) {
        String str;
        String str2;
        d dVar2 = dVar;
        String str3 = "%20";
        g1 g1Var = dVar2.h;
        e eVar = null;
        String str4 = (list != null ? d.a(g1Var, io.sentry.util.r.c(list), true) : d.a(g1Var, null, true)).e;
        ConcurrentHashMap concurrentHashMap = dVar2.a;
        g1 g1Var2 = dVar2.h;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (str4 == null || str4.isEmpty()) {
            str = "";
        } else {
            sb.append(str4);
            Charset charset = io.sentry.util.r.a;
            int i2 = 0;
            while (i < str4.length()) {
                if (str4.charAt(i) == ',') {
                    i2++;
                }
                i++;
            }
            i = i2 + 1;
            str = ",";
        }
        io.sentry.util.a aVar = dVar2.b;
        aVar.e();
        try {
            TreeSet<String> treeSet = new TreeSet(Collections.list(concurrentHashMap.keys()));
            aVar.close();
            treeSet.add("sentry-sample_rate");
            treeSet.add("sentry-sample_rand");
            int i3 = i;
            String str5 = str;
            for (String str6 : treeSet) {
                e eVar2 = eVar;
                String strC = "sentry-sample_rate".equals(str6) ? d.c(dVar2.c) : "sentry-sample_rand".equals(str6) ? d.c(dVar2.d) : (String) concurrentHashMap.get(str6);
                if (strC == null) {
                    str2 = str3;
                } else if (i3 >= 64) {
                    g1Var2.g(f6.ERROR, "Not adding baggage value %s as the total number of list members would exceed the maximum of %s.", str6, 64);
                    str2 = str3;
                } else {
                    try {
                        str2 = str3;
                        try {
                            String str7 = str5 + URLEncoder.encode(str6, "UTF-8").replaceAll("\\+", str3) + "=" + URLEncoder.encode(strC, "UTF-8").replaceAll("\\+", str3);
                            if (sb.length() + str7.length() > 8192) {
                                g1Var2.g(f6.ERROR, "Not adding baggage value %s as the total header value length would exceed the maximum of %s.", str6, 8192);
                            } else {
                                i3++;
                                sb.append(str7);
                                str5 = ",";
                            }
                        } catch (Throwable th) {
                            th = th;
                            g1Var2.b(f6.ERROR, th, "Unable to encode baggage key value pair (key=%s,value=%s).", str6, strC);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        str2 = str3;
                    }
                }
                dVar2 = dVar;
                eVar = eVar2;
                str3 = str2;
            }
            e eVar3 = eVar;
            String string = sb.toString();
            if (string.isEmpty()) {
                return eVar3;
            }
            e eVar4 = new e();
            eVar4.a = string;
            return eVar4;
        } catch (Throwable th3) {
            try {
                aVar.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }
}
