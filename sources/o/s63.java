package o;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s63 {
    public static final d53[] a;
    public static final Map b;

    static {
        d53 d53Var = new d53("", d53.i);
        ai0 ai0Var = d53.f;
        d53 d53Var2 = new d53("GET", ai0Var);
        d53 d53Var3 = new d53("POST", ai0Var);
        ai0 ai0Var2 = d53.g;
        d53 d53Var4 = new d53("/", ai0Var2);
        d53 d53Var5 = new d53("/index.html", ai0Var2);
        ai0 ai0Var3 = d53.h;
        d53 d53Var6 = new d53("http", ai0Var3);
        d53 d53Var7 = new d53("https", ai0Var3);
        ai0 ai0Var4 = d53.e;
        d53[] d53VarArr = {d53Var, d53Var2, d53Var3, d53Var4, d53Var5, d53Var6, d53Var7, new d53("200", ai0Var4), new d53("204", ai0Var4), new d53("206", ai0Var4), new d53("304", ai0Var4), new d53("400", ai0Var4), new d53("404", ai0Var4), new d53("500", ai0Var4), new d53("accept-charset", ""), new d53("accept-encoding", "gzip, deflate"), new d53("accept-language", ""), new d53("accept-ranges", ""), new d53("accept", ""), new d53("access-control-allow-origin", ""), new d53("age", ""), new d53("allow", ""), new d53("authorization", ""), new d53("cache-control", ""), new d53("content-disposition", ""), new d53("content-encoding", ""), new d53("content-language", ""), new d53("content-length", ""), new d53("content-location", ""), new d53("content-range", ""), new d53("content-type", ""), new d53("cookie", ""), new d53("date", ""), new d53("etag", ""), new d53("expect", ""), new d53("expires", ""), new d53("from", ""), new d53("host", ""), new d53("if-match", ""), new d53("if-modified-since", ""), new d53("if-none-match", ""), new d53("if-range", ""), new d53("if-unmodified-since", ""), new d53("last-modified", ""), new d53("link", ""), new d53("location", ""), new d53("max-forwards", ""), new d53("proxy-authenticate", ""), new d53("proxy-authorization", ""), new d53("range", ""), new d53("referer", ""), new d53("refresh", ""), new d53("retry-after", ""), new d53("server", ""), new d53("set-cookie", ""), new d53("strict-transport-security", ""), new d53("transfer-encoding", ""), new d53("user-agent", ""), new d53("vary", ""), new d53("via", ""), new d53("www-authenticate", "")};
        a = d53VarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61, 1.0f);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(d53VarArr[i].a)) {
                linkedHashMap.put(d53VarArr[i].a, Integer.valueOf(i));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        b = mapUnmodifiableMap;
    }

    public static void a(ai0 ai0Var) throws IOException {
        ai0Var.getClass();
        int iD = ai0Var.d();
        for (int i = 0; i < iD; i++) {
            byte bI = ai0Var.i(i);
            if (65 <= bI && bI < 91) {
                gk0.l("PROTOCOL_ERROR response malformed: mixed case name: ".concat(ai0Var.s()));
                return;
            }
        }
    }
}
