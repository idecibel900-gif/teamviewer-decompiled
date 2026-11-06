package o;

import com.teamviewer.oneapinetworklib.helpers.OneApiRequestPayload;
import com.teamviewer.oneapinetworklib.swig.HttpStatusCode;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class wi0 implements nl3 {
    public static final wi0 b = new wi0(0);
    public static final wi0 c = new wi0(1);
    public final /* synthetic */ byte a;

    public /* synthetic */ wi0(byte b2) {
        this.a = b2;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x012f  */
    /* JADX WARN: Code duplicated, block: B:102:0x0136  */
    /* JADX WARN: Code duplicated, block: B:110:0x014b  */
    /* JADX WARN: Code duplicated, block: B:111:0x016c  */
    /* JADX WARN: Code duplicated, block: B:114:0x0179  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00de  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:89:0x0104  */
    /* JADX WARN: Code duplicated, block: B:99:0x0127  */
    public static ab6 b(lc6 lc6Var, io.sentry.z7 z7Var, k46 k46Var) throws ProtocolException {
        String strA;
        ab6 ab6Var;
        g93 g93Var;
        h93 h93VarA;
        yc4 yc4VarA;
        int i;
        db6 db6Var;
        lc6 lc6Var2;
        xf6 xf6Var = z7Var != null ? z7Var.e().c : null;
        int i2 = lc6Var.p;
        ab6 ab6Var2 = lc6Var.m;
        String str = ab6Var2.b;
        boolean z = false;
        if (i2 == 307 || i2 == 308) {
            if (k46Var.a.m.h) {
                strA = lc6Var.r.a("Location");
                if (strA == null) {
                    strA = null;
                }
                ab6Var = lc6Var.m;
                if (strA != null) {
                    h93 h93Var = ab6Var.a;
                    h93Var.getClass();
                    try {
                        g93Var = new g93();
                        g93Var.c(h93Var, strA);
                    } catch (IllegalArgumentException unused) {
                        g93Var = null;
                    }
                    if (g93Var != null) {
                        h93VarA = g93Var.a();
                    } else {
                        h93VarA = null;
                    }
                    if (h93VarA != null && (im3.n(h93VarA.a, ab6Var.a.a) || k46Var.a.m.i)) {
                        yc4VarA = ab6Var.a();
                        if (it1.J(str)) {
                            i = lc6Var.p;
                            if (i == 303) {
                                z = !str.equals("PROPFIND");
                            } else if (i != 307 && i != 308 && !str.equals("PROPFIND") && !str.equals("QUERY")) {
                                z = true;
                            }
                            if (z) {
                                yc4VarA.P("GET", null);
                                ((nm) yc4VarA.f2598o).u("Transfer-Encoding");
                                ((nm) yc4VarA.f2598o).u("Content-Length");
                                ((nm) yc4VarA.f2598o).u("Content-Type");
                            } else {
                                yc4VarA.P(str, ab6Var.d);
                            }
                        }
                        if (!ro8.a(ab6Var.a, h93VarA)) {
                            ((nm) yc4VarA.f2598o).u("Authorization");
                        }
                        yc4VarA.m = h93VarA;
                        return new ab6(yc4VarA);
                    }
                }
            }
        } else {
            if (i2 == 401) {
                k46Var.i.getClass();
                return null;
            }
            if (i2 == 421) {
                db6 db6Var2 = ab6Var2.d;
                if ((db6Var2 == null || !db6Var2.c()) && z7Var != null && !im3.n(((oe2) z7Var.c).g().i.h.d, ((ne2) z7Var.d).g().h().a.h.d)) {
                    b46 b46VarE = z7Var.e();
                    synchronized (b46VarE) {
                        b46VarE.k = true;
                    }
                    return lc6Var.m;
                }
            } else if (i2 == 503) {
                lc6 lc6Var3 = lc6Var.w;
                if ((lc6Var3 == null || lc6Var3.p != 503) && e(lc6Var, Integer.MAX_VALUE) == 0) {
                    return lc6Var.m;
                }
            } else {
                if (i2 == 407) {
                    xf6Var.getClass();
                    if (xf6Var.b.type() != Proxy.Type.HTTP) {
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                    k46Var.f1228o.getClass();
                    return null;
                }
                if (i2 != 408) {
                    switch (i2) {
                        case 300:
                        case 301:
                        case 302:
                        case 303:
                            if (k46Var.a.m.h) {
                                strA = lc6Var.r.a("Location");
                                if (strA == null) {
                                    strA = null;
                                }
                                ab6Var = lc6Var.m;
                                if (strA != null) {
                                    h93 h93Var2 = ab6Var.a;
                                    h93Var2.getClass();
                                    g93Var = new g93();
                                    g93Var.c(h93Var2, strA);
                                    if (g93Var != null) {
                                        h93VarA = g93Var.a();
                                    } else {
                                        h93VarA = null;
                                    }
                                    if (h93VarA != null) {
                                        yc4VarA = ab6Var.a();
                                        if (it1.J(str)) {
                                            i = lc6Var.p;
                                            if (i == 303) {
                                                z = !str.equals("PROPFIND");
                                            } else if (i != 307) {
                                                z = true;
                                            }
                                            if (z) {
                                                yc4VarA.P("GET", null);
                                                ((nm) yc4VarA.f2598o).u("Transfer-Encoding");
                                                ((nm) yc4VarA.f2598o).u("Content-Length");
                                                ((nm) yc4VarA.f2598o).u("Content-Type");
                                            } else {
                                                yc4VarA.P(str, ab6Var.d);
                                            }
                                        }
                                        if (!ro8.a(ab6Var.a, h93VarA)) {
                                            ((nm) yc4VarA.f2598o).u("Authorization");
                                        }
                                        yc4VarA.m = h93VarA;
                                        return new ab6(yc4VarA);
                                    }
                                }
                            }
                        default:
                            return null;
                    }
                } else if (k46Var.q && (((db6Var = ab6Var2.d) == null || !db6Var.c()) && (((lc6Var2 = lc6Var.w) == null || lc6Var2.p != 408) && e(lc6Var, 0) <= 0))) {
                    return lc6Var.m;
                }
            }
        }
        return null;
    }

    private final lc6 c(k46 k46Var) {
        String strN0;
        String str;
        Map map;
        String str2;
        Integer num;
        String str3 = "";
        ab6 ab6Var = k46Var.e;
        qx0 qx0VarE = pm8.e();
        ab6Var.getClass();
        k53 k53Var = ab6Var.c;
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        comparator.getClass();
        TreeMap treeMap = new TreeMap(comparator);
        int size = k53Var.size();
        for (int i = 0; i < size; i++) {
            String strJ = i67.j(k53Var, i);
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = strJ.toLowerCase(locale);
            lowerCase.getClass();
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(i67.l(k53Var, i));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(xm4.Q(treeMap.size()));
        for (Map.Entry entry : treeMap.entrySet()) {
            linkedHashMap.put(entry.getKey(), lv0.t0((List) entry.getValue(), ",", null, null, null, 62));
        }
        LinkedHashMap linkedHashMap2 = linkedHashMap.isEmpty() ? null : linkedHashMap;
        try {
            db6 db6Var = ab6Var.d;
            if (db6Var != null) {
                bf0 bf0Var = new bf0();
                db6Var.d(bf0Var);
                strN0 = bf0Var.N0();
            } else {
                strN0 = null;
            }
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            ye4.c("OneAPIRequestBuilder", message);
        }
        OneApiRequestPayload oneApiRequestPayload = new OneApiRequestPayload(ab6Var.b, ab6Var.a.i, linkedHashMap2, strN0);
        vp3 vp3VarA = rt4.a().a(OneApiRequestPayload.class, ma8.a, null);
        bf0 bf0Var2 = new bf0();
        try {
            vp3VarA.c(new pr3(bf0Var2), oneApiRequestPayload);
            z85 z85Var = (z85) vn4.u0(ba2.m, new bj(t85.a, bf0Var2.N0(), new o85(qx0VarE), qx0VarE, null, (byte) 15));
            mc6 mc6Var = nc6.m;
            nm nmVar = new nm((byte) 5);
            int iSwigValue = (z85Var == null || (num = z85Var.a) == null) ? HttpStatusCode.InternalServerError.swigValue() : num.intValue();
            if (z85Var == null || (str = z85Var.b) == null) {
                str = "Internal Error";
            }
            String str4 = str;
            if (z85Var != null && (str2 = z85Var.c) != null) {
                str3 = str2;
            }
            vd5 vd5VarS = ct1.s(null);
            Charset charset = (Charset) vd5VarS.m;
            jo4 jo4Var = (jo4) vd5VarS.n;
            bf0 bf0Var3 = new bf0();
            charset.getClass();
            int length = str3.length();
            str3.getClass();
            if (length < 0) {
                gk0.h(ua5.l("endIndex < beginIndex: ", length, 0, " < "));
            } else {
                if (length > str3.length()) {
                    StringBuilder sbK = fx3.k(length, "endIndex > string.length: ", " > ");
                    sbK.append(str3.length());
                    throw new IllegalArgumentException(sbK.toString().toString());
                }
                if (charset.equals(vn0.a)) {
                    bf0Var3.Y0(0, length, str3);
                } else {
                    byte[] bytes = str3.substring(0, length).getBytes(charset);
                    bytes.getClass();
                    bf0Var3.S0(bytes, bytes.length);
                }
            }
            mc6 mc6Var2 = new mc6(jo4Var, bf0Var3.n, bf0Var3);
            if (z85Var != null && (map = z85Var.d) != null) {
                k53 k53Var2 = k53.n;
                nmVar = i67.k(us1.J(map));
            }
            if (iSwigValue >= 0) {
                return new lc6(ab6Var, yw5.HTTP_1_1, str4, iSwigValue, null, i67.i(nmVar), mc6Var2, null, null, null, null, 0L, 0L, null, v08.j);
            }
            an4.g(fx3.e(iSwigValue, "code < 0: "));
            return null;
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public static boolean d(IOException iOException, a46 a46Var, k46 k46Var, ab6 ab6Var) {
        db6 db6Var;
        boolean z = iOException instanceof x41;
        if (!k46Var.q) {
            return false;
        }
        if ((!z && (((db6Var = ab6Var.d) != null && db6Var.c()) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException)) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || !z) {
                return false;
            }
        } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        io.sentry.z7 z7Var = a46Var.D;
        if (z7Var == null || !z7Var.a) {
            return false;
        }
        oe2 oe2Var = a46Var.t;
        oe2Var.getClass();
        o46 o46VarG = oe2Var.g();
        io.sentry.z7 z7Var2 = a46Var.D;
        return o46VarG.a(z7Var2 != null ? z7Var2.e() : null);
    }

    public static int e(lc6 lc6Var, int i) {
        String strA = lc6Var.r.a("Retry-After");
        if (strA == null) {
            strA = null;
        }
        if (strA == null) {
            return i;
        }
        Pattern patternCompile = Pattern.compile("\\d+");
        patternCompile.getClass();
        if (!patternCompile.matcher(strA).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strA);
        numValueOf.getClass();
        return numValueOf.intValue();
    }

    /* JADX WARN: Code duplicated, block: B:269:0x060e  */
    /* JADX WARN: Code duplicated, block: B:312:0x06c7  */
    /* JADX WARN: Code duplicated, block: B:325:0x0726 A[Catch: IOException -> 0x062f, TryCatch #6 {IOException -> 0x062f, blocks: (B:274:0x0616, B:276:0x061f, B:279:0x0632, B:288:0x0659, B:290:0x0662, B:291:0x066f, B:292:0x0688, B:297:0x069f, B:303:0x06ad, B:304:0x06b4, B:306:0x06b7, B:309:0x06c0, B:315:0x06cc, B:317:0x0704, B:319:0x0715, B:323:0x0720, B:330:0x0739, B:333:0x0746, B:334:0x076a, B:325:0x0726, B:316:0x06ee), top: B:351:0x0616 }] */
    /* JADX WARN: Code duplicated, block: B:340:0x0773 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v18, types: [o.ne2] */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v61 */
    /* JADX WARN: Type inference failed for: r7v65 */
    /* JADX WARN: Type inference failed for: r7v66 */
    /* JADX WARN: Type inference failed for: r7v67 */
    /* JADX WARN: Type inference failed for: r7v68 */
    /* JADX WARN: Type inference failed for: r7v69 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // o.nl3
    public final lc6 a(k46 k46Var) throws Throwable {
        boolean z;
        jc6 jc6VarH;
        ?? r7;
        IOException iOException;
        boolean z2;
        ?? r8;
        lc6 lc6VarA;
        int i;
        ?? r9;
        lc6 lc6VarA2;
        boolean z3;
        Object z73Var;
        boolean z4;
        k53 k53Var;
        List list;
        boolean z5;
        boolean z6;
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        jm0 jm0Var;
        switch (this.a) {
            case 0:
                io.sentry.z7 z7Var = k46Var.d;
                z7Var.getClass();
                ab6 ab6Var = k46Var.e;
                db6 db6Var = ab6Var.d;
                long jCurrentTimeMillis = System.currentTimeMillis();
                ?? EqualsIgnoreCase = (!it1.J(ab6Var.b) || db6Var == null) ? 0 : 1;
                boolean zEqualsIgnoreCase = "upgrade".equalsIgnoreCase(ab6Var.c.a("Connection"));
                try {
                    z7Var.m(ab6Var);
                    try {
                        try {
                            if (EqualsIgnoreCase != 0) {
                                EqualsIgnoreCase = "100-continue".equalsIgnoreCase(ab6Var.c.a("Expect"));
                                if (EqualsIgnoreCase != 0) {
                                    try {
                                        EqualsIgnoreCase = (ne2) z7Var.d;
                                        EqualsIgnoreCase.e();
                                        r7 = 1;
                                        EqualsIgnoreCase = 1;
                                        jc6VarH = z7Var.h(true);
                                        try {
                                            ((a46) z7Var.b).p.y((a46) z7Var.b);
                                            z3 = false;
                                        } catch (IOException e) {
                                            e = e;
                                            z = true;
                                            if (!(e instanceof x41) || !z7Var.a) {
                                                throw e;
                                            }
                                            iOException = e;
                                        }
                                    } catch (IOException e2) {
                                        ((a46) z7Var.b).p.r((a46) z7Var.b, e2);
                                        z7Var.k(e2);
                                        throw e2;
                                    }
                                } else {
                                    EqualsIgnoreCase = 1;
                                    z3 = true;
                                    jc6VarH = null;
                                }
                                if (jc6VarH == null) {
                                    db6Var.getClass();
                                    db6 db6Var2 = ab6Var.d;
                                    db6Var2.getClass();
                                    long jA = db6Var2.a();
                                    ((a46) z7Var.b).p.q((a46) z7Var.b);
                                    u36 u36Var = new u36(new ke2(z7Var, ((ne2) z7Var.d).c(ab6Var, jA), jA, false));
                                    db6Var.d(u36Var);
                                    u36Var.close();
                                } else {
                                    ((a46) z7Var.b).g(z7Var, true, false, false, false, null);
                                    if ((z7Var.e().i != null ? EqualsIgnoreCase : 0) == 0) {
                                        ((ne2) z7Var.d).g().f();
                                    }
                                }
                            } else {
                                EqualsIgnoreCase = 1;
                                ((a46) z7Var.b).g(z7Var, true, false, false, false, null);
                                z3 = true;
                                jc6VarH = null;
                            }
                            try {
                                ((ne2) z7Var.d).a();
                                iOException = null;
                                r8 = EqualsIgnoreCase;
                                z2 = z3;
                                while (true) {
                                    if (i != 100 && (102 > i || i >= 200)) {
                                    }
                                    jc6 jc6VarH2 = z7Var.h(false);
                                    jc6VarH2.getClass();
                                    if (z2) {
                                        ((a46) z7Var.b).p.y((a46) z7Var.b);
                                    }
                                    jc6VarH2.a = ab6Var;
                                    jc6VarH2.e = z7Var.e().f;
                                    jc6VarH2.l = jCurrentTimeMillis;
                                    jc6VarH2.m = System.currentTimeMillis();
                                    lc6VarA = jc6VarH2.a();
                                    i = lc6VarA.p;
                                }
                            } catch (IOException e3) {
                                ((a46) z7Var.b).p.r((a46) z7Var.b, e3);
                                z7Var.k(e3);
                                throw e3;
                            }
                        } catch (IOException e4) {
                            e = e4;
                            r7 = EqualsIgnoreCase;
                            z = z3;
                            if (!(e instanceof x41)) {
                                throw e;
                            }
                            throw e;
                        }
                    } catch (IOException e5) {
                        e = e5;
                        z = EqualsIgnoreCase == true ? 1 : 0;
                        jc6VarH = null;
                        r7 = EqualsIgnoreCase;
                        if (!(e instanceof x41)) {
                            throw e;
                        }
                        throw e;
                    }
                } catch (IOException e6) {
                    e = e6;
                    EqualsIgnoreCase = 1;
                }
                if (jc6VarH == null) {
                    r8 = r7;
                    z2 = z;
                    try {
                        jc6VarH = z7Var.h(false);
                        jc6VarH.getClass();
                        if (z2) {
                            ((a46) z7Var.b).p.y((a46) z7Var.b);
                            z2 = false;
                        }
                    } catch (IOException e7) {
                        if (iOException == null) {
                            throw e7;
                        }
                        ct1.q(iOException, e7);
                        throw iOException;
                    }
                }
                r8 = r7;
                z2 = z;
                jc6VarH.a = ab6Var;
                jc6VarH.e = z7Var.e().f;
                jc6VarH.l = jCurrentTimeMillis;
                jc6VarH.m = System.currentTimeMillis();
                lc6VarA = jc6VarH.a();
                i = lc6VarA.p;
                ((a46) z7Var.b).p.x((a46) z7Var.b, lc6VarA);
                boolean z7 = i == 101 ? r8 == true ? 1 : 0 : false;
                if (z7) {
                    if (z7Var.e().i != null ? r8 == true ? 1 : 0 : false) {
                        throw new ProtocolException("Unexpected 101 code on HTTP/2 connection");
                    }
                }
                if (z7) {
                    String strA = lc6VarA.r.a("Connection");
                    if (strA == null) {
                        strA = null;
                    }
                    if (!"upgrade".equalsIgnoreCase(strA)) {
                        r9 = 0;
                    }
                } else {
                    r9 = 0;
                }
                if (!zEqualsIgnoreCase || r9 == 0) {
                    r9 = r8;
                    n46 n46VarF = z7Var.f(lc6VarA);
                    jc6 jc6VarE = lc6VarA.e();
                    jc6VarE.g = n46VarF;
                    jc6VarE.f1148o = new cr((byte) 5);
                    lc6VarA2 = jc6VarE.a();
                } else {
                    jc6 jc6VarE2 = lc6VarA.e();
                    jc6VarE2.g = new w88(lc6VarA.s.q(), lc6VarA.s.j());
                    jc6VarE2.h = z7Var.l();
                    lc6VarA2 = jc6VarE2.a();
                }
                ab6 ab6Var2 = lc6VarA2.m;
                ab6Var2.getClass();
                if ("close".equalsIgnoreCase(ab6Var2.c.a("Connection"))) {
                    ((ne2) z7Var.d).g().f();
                } else {
                    String strA2 = lc6VarA2.r.a("Connection");
                    if ("close".equalsIgnoreCase(strA2 == null ? null : strA2)) {
                        ((ne2) z7Var.d).g().f();
                    }
                }
                if ((i != 204 && i != 205) || lc6VarA2.s.j() <= 0) {
                    return lc6VarA2;
                }
                throw new ProtocolException("HTTP " + i + " had non-zero Content-Length: " + lc6VarA2.s.j());
            case 1:
                a46 a46Var = k46Var.a;
                synchronized (a46Var) {
                    if (!a46Var.B) {
                        throw new IllegalStateException("released");
                    }
                    if (a46Var.y || a46Var.x || a46Var.A || a46Var.z) {
                        throw new IllegalStateException("Check failed.");
                    }
                }
                oe2 oe2Var = a46Var.t;
                oe2Var.getClass();
                b46 b46VarD = oe2Var.d();
                c75 c75Var = a46Var.m;
                b46VarD.getClass();
                int i2 = k46Var.g;
                iu iuVar = b46VarD.h;
                i83 i83Var = b46VarD.i;
                if (i83Var != null) {
                    z73Var = new j83(c75Var, b46VarD, k46Var, i83Var);
                } else {
                    b46VarD.e.setSoTimeout(i2);
                    ((w36) iuVar.p).m.i().g(i2);
                    ((u36) iuVar.n).m.i().g(k46Var.h);
                    z73Var = new z73(c75Var, b46VarD, iuVar);
                }
                oe2Var.getClass();
                io.sentry.z7 z7Var2 = new io.sentry.z7();
                z7Var2.b = a46Var;
                z7Var2.c = oe2Var;
                z7Var2.d = z73Var;
                a46Var.w = z7Var2;
                a46Var.D = z7Var2;
                synchronized (a46Var) {
                    a46Var.x = true;
                    a46Var.y = true;
                }
                if (!a46Var.C) {
                    return k46.a(k46Var, 0, z7Var2, null, 2097149).b(k46Var.e);
                }
                gk0.l("Canceled");
                return null;
            case 2:
                xz2 xz2Var = k46Var.l;
                ab6 ab6Var3 = k46Var.e;
                yc4 yc4VarA = ab6Var3.a();
                h93 h93Var = ab6Var3.a;
                k53 k53Var2 = ab6Var3.c;
                db6 db6Var3 = ab6Var3.d;
                if (db6Var3 != null) {
                    jo4 jo4VarB = db6Var3.b();
                    if (jo4VarB != null) {
                        yc4VarA.L("Content-Type", jo4VarB.a);
                    }
                    long jA2 = db6Var3.a();
                    if (jA2 != -1) {
                        yc4VarA.L("Content-Length", String.valueOf(jA2));
                        ((nm) yc4VarA.f2598o).u("Transfer-Encoding");
                    } else {
                        yc4VarA.L("Transfer-Encoding", "chunked");
                        ((nm) yc4VarA.f2598o).u("Content-Length");
                    }
                }
                if (k53Var2.a("Host") == null) {
                    yc4VarA.L("Host", ro8.i(h93Var, false));
                }
                if (k53Var2.a("Connection") == null) {
                    yc4VarA.L("Connection", "Keep-Alive");
                }
                if (k53Var2.a("Accept-Encoding") == null && k53Var2.a("Range") == null) {
                    yc4VarA.L("Accept-Encoding", "gzip");
                    z4 = true;
                } else {
                    z4 = false;
                }
                xz2Var.getClass();
                h93Var.getClass();
                if (k53Var2.a("User-Agent") == null) {
                    yc4VarA.L("User-Agent", "okhttp/5.5.0");
                }
                ab6 ab6Var4 = new ab6(yc4VarA);
                lc6 lc6VarB = k46Var.b(ab6Var4);
                k53 k53Var3 = lc6VarB.r;
                y83.b(xz2Var, ab6Var4.a, k53Var3);
                jc6 jc6VarE3 = lc6VarB.e();
                jc6VarE3.a = ab6Var4;
                if (z4) {
                    String strA3 = k53Var3.a("Content-Encoding");
                    if (strA3 == null) {
                        strA3 = null;
                    }
                    if ("gzip".equalsIgnoreCase(strA3) && y83.a(lc6VarB)) {
                        i43 i43Var = new i43(lc6VarB.s.E0());
                        nm nmVarK = i67.k(k53Var3);
                        nmVarK.u("Content-Encoding");
                        nmVarK.u("Content-Length");
                        jc6VarE3.f = i67.k(i67.i(nmVarK));
                        String strA4 = k53Var3.a("Content-Type");
                        if (strA4 == null) {
                            strA4 = null;
                        }
                        jc6VarE3.g = new n46(strA4, -1L, new w36(i43Var));
                    }
                }
                return jc6VarE3.a();
            case 3:
                a46 a46Var2 = k46Var.a;
                System.currentTimeMillis();
                ab6 ab6Var5 = k46Var.e;
                ab6Var5.getClass();
                byte b2 = 28;
                cj3 cj3Var = new cj3(ab6Var5, (Object) null, b2);
                fi0 fi0VarR = ab6Var5.f;
                if (fi0VarR == null) {
                    int i3 = fi0.n;
                    fi0VarR = ga0.r(ab6Var5.c);
                    ab6Var5.f = fi0VarR;
                }
                if (fi0VarR.j) {
                    Object obj = null;
                    cj3Var = new cj3(obj, obj, b2);
                }
                ab6 ab6Var6 = (ab6) cj3Var.n;
                lc6 lc6Var = (lc6) cj3Var.f531o;
                if (ab6Var6 == null && lc6Var == null) {
                    mc6 mc6Var = nc6.m;
                    wj5 wj5Var = v08.j;
                    ArrayList arrayList = new ArrayList(20);
                    ab6 ab6Var7 = k46Var.e;
                    ab6Var7.getClass();
                    lc6 lc6Var2 = new lc6(ab6Var7, yw5.HTTP_1_1, "Unsatisfiable Request (only-if-cached)", 504, null, new k53((String[]) arrayList.toArray(new String[0])), mc6Var, null, null, null, null, -1L, System.currentTimeMillis(), null, wj5Var);
                    k46Var.a.p.z(a46Var2, lc6Var2);
                    return lc6Var2;
                }
                if (ab6Var6 == null) {
                    lc6Var.getClass();
                    jc6 jc6VarE4 = lc6Var.e();
                    lc6 lc6VarB2 = i67.B(lc6Var);
                    jc6.b("cacheResponse", lc6VarB2);
                    jc6VarE4.j = lc6VarB2;
                    lc6 lc6VarA3 = jc6VarE4.a();
                    k46Var.a.p.b(a46Var2, lc6VarA3);
                    return lc6VarA3;
                }
                if (lc6Var != null) {
                    k46Var.a.p.a(a46Var2, lc6Var);
                }
                lc6 lc6VarB3 = k46Var.b(ab6Var6);
                if (lc6Var != null) {
                    if (lc6VarB3.p == 304) {
                        jc6 jc6VarE5 = lc6Var.e();
                        k53 k53Var4 = lc6Var.r;
                        k53 k53Var5 = lc6VarB3.r;
                        ArrayList arrayList2 = new ArrayList(20);
                        int size = k53Var4.size();
                        int i4 = 0;
                        while (i4 < size) {
                            String strJ = i67.j(k53Var4, i4);
                            String strL = i67.l(k53Var4, i4);
                            if ("Warning".equalsIgnoreCase(strJ)) {
                                k53Var = k53Var4;
                                if (bc7.N(false, strL, "1")) {
                                }
                                i4++;
                                k53Var4 = k53Var;
                            } else {
                                k53Var = k53Var4;
                            }
                            if ("Content-Length".equalsIgnoreCase(strJ) || "Content-Encoding".equalsIgnoreCase(strJ) || "Content-Type".equalsIgnoreCase(strJ) || !ka0.w(strJ) || k53Var5.a(strJ) == null) {
                                arrayList2.add(strJ);
                                arrayList2.add(ub7.x0(strL).toString());
                            }
                            i4++;
                            k53Var4 = k53Var;
                        }
                        int size2 = k53Var5.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            String strJ2 = i67.j(k53Var5, i5);
                            if (!"Content-Length".equalsIgnoreCase(strJ2) && !"Content-Encoding".equalsIgnoreCase(strJ2) && !"Content-Type".equalsIgnoreCase(strJ2) && ka0.w(strJ2)) {
                                String strL2 = i67.l(k53Var5, i5);
                                arrayList2.add(strJ2);
                                arrayList2.add(ub7.x0(strL2).toString());
                            }
                        }
                        jc6VarE5.f = i67.k(new k53((String[]) arrayList2.toArray(new String[0])));
                        jc6VarE5.l = lc6VarB3.x;
                        jc6VarE5.m = lc6VarB3.y;
                        lc6 lc6VarB4 = i67.B(lc6Var);
                        jc6.b("cacheResponse", lc6VarB4);
                        jc6VarE5.j = lc6VarB4;
                        lc6 lc6VarB5 = i67.B(lc6VarB3);
                        jc6.b("networkResponse", lc6VarB5);
                        jc6VarE5.i = lc6VarB5;
                        jc6VarE5.a();
                        lc6VarB3.s.close();
                        throw null;
                    }
                    po8.b(lc6Var.s);
                }
                jc6 jc6VarE6 = lc6VarB3.e();
                lc6 lc6VarB6 = lc6Var != null ? i67.B(lc6Var) : null;
                jc6.b("cacheResponse", lc6VarB6);
                jc6VarE6.j = lc6VarB6;
                lc6 lc6VarB7 = i67.B(lc6VarB3);
                jc6.b("networkResponse", lc6VarB7);
                jc6VarE6.i = lc6VarB7;
                return jc6VarE6.a();
            case 4:
                return c(k46Var);
            default:
                ab6 ab6Var8 = k46Var.e;
                a46 a46Var3 = k46Var.a;
                List listB0 = ea2.m;
                lc6 lc6Var3 = null;
                int i6 = 0;
                ab6 ab6VarB = ab6Var8;
                while (true) {
                    boolean z8 = true;
                    while (true) {
                        ab6VarB.getClass();
                        if (a46Var3.w != null) {
                            hk0.l("Check failed.");
                            return null;
                        }
                        synchronized (a46Var3) {
                            if (a46Var3.y) {
                                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                            }
                            if (a46Var3.x || a46Var3.A || a46Var3.z) {
                                throw new IllegalStateException("Check failed.");
                            }
                        }
                        if (z8) {
                            c75 c75Var2 = a46Var3.m;
                            List list2 = listB0;
                            io7 io7Var = c75Var2.B;
                            q82 q82Var = (q82) k46Var.k.n;
                            int i7 = k46Var.g;
                            short s = k46Var.h;
                            int i8 = k46Var.f;
                            boolean z9 = k46Var.q;
                            boolean z10 = c75Var2.f;
                            h93 h93Var2 = ab6VarB.a;
                            h93Var2.getClass();
                            if (im3.n(h93Var2.a, "https")) {
                                sSLSocketFactory = k46Var.s;
                                hostnameVerifier = k46Var.n;
                                jm0Var = k46Var.j;
                            } else {
                                sSLSocketFactory = null;
                                hostnameVerifier = null;
                                jm0Var = null;
                            }
                            String str = h93Var2.d;
                            int i9 = h93Var2.e;
                            g32 g32Var = k46Var.m;
                            SocketFactory socketFactory = k46Var.r;
                            d82 d82Var = k46Var.f1228o;
                            c75 c75Var3 = k46Var.a.m;
                            list = list2;
                            ab6 ab6Var9 = ab6VarB;
                            o46 o46Var = new o46(io7Var, q82Var, i7, s, i8, i7, z9, z10, new dc(str, i9, g32Var, socketFactory, sSLSocketFactory, hostnameVerifier, jm0Var, d82Var, c75Var3.r, c75Var3.q, k46Var.p), a46Var3.m.A, a46Var3, ab6Var9);
                            ab6VarB = ab6Var9;
                            c75 c75Var4 = a46Var3.m;
                            a46Var3.t = c75Var4.f ? new vc(o46Var, c75Var4.B) : new g95(o46Var);
                        } else {
                            list = listB0;
                        }
                        try {
                            if (a46Var3.C) {
                                throw new IOException("Canceled");
                            }
                            try {
                            } catch (IOException e8) {
                                boolean zD = d(e8, a46Var3, k46Var, ab6VarB);
                                a46Var3.p.getClass();
                                if (!zD) {
                                    byte[] bArr = po8.a;
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        ct1.q(e8, (Exception) it.next());
                                    }
                                    throw e8;
                                }
                                listB0 = lv0.B0(list, e8);
                                a46Var3.d(true);
                                z8 = false;
                            }
                            break;
                        } catch (Throwable th) {
                            th = th;
                            z5 = true;
                        }
                        a46Var3.d(z5);
                        throw th;
                    }
                    jc6 jc6VarE7 = k46Var.b(ab6VarB).e();
                    jc6VarE7.a = ab6VarB;
                    jc6VarE7.k = lc6Var3 != null ? i67.B(lc6Var3) : null;
                    lc6 lc6VarA4 = jc6VarE7.a();
                    ab6VarB = b(lc6VarA4, a46Var3.w, k46Var);
                    try {
                        if (ab6VarB == null) {
                            a46Var3.p.getClass();
                            z6 = false;
                        } else {
                            db6 db6Var4 = ab6VarB.d;
                            if (db6Var4 == null || !db6Var4.c()) {
                                po8.b(lc6VarA4.s);
                                int i10 = i6 + 1;
                                ae2 ae2Var = a46Var3.p;
                                if (i10 > 20) {
                                    ae2Var.getClass();
                                    throw new ProtocolException("Too many follow-up requests: " + i10);
                                }
                                ae2Var.getClass();
                                a46Var3.d(true);
                                lc6Var3 = lc6VarA4;
                                listB0 = list;
                                i6 = i10;
                            } else {
                                a46Var3.p.getClass();
                                z6 = false;
                            }
                        }
                        a46Var3.d(z6);
                        return lc6VarA4;
                    } catch (Throwable th2) {
                        th = th2;
                        z5 = false;
                    }
                }
                break;
        }
    }
}
