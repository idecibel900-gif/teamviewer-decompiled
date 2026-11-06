package io.sentry.okhttp;

import io.sentry.a8;
import io.sentry.d6;
import io.sentry.f6;
import io.sentry.g1;
import io.sentry.g7;
import io.sentry.h;
import io.sentry.h2;
import io.sentry.i5;
import io.sentry.n1;
import io.sentry.n7;
import io.sentry.o;
import io.sentry.p0;
import io.sentry.p7;
import io.sentry.s;
import io.sentry.util.l;
import io.sentry.util.q;
import io.sentry.v0;
import io.sentry.v1;
import io.sentry.w4;
import io.sentry.w7;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import o.a46;
import o.ab6;
import o.db6;
import o.fi0;
import o.ga0;
import o.i67;
import o.jo4;
import o.k46;
import o.k53;
import o.k76;
import o.lc6;
import o.nc6;
import o.nl3;
import o.nm;
import o.qf0;
import o.vn0;
import o.yc4;

/* JADX INFO: loaded from: classes.dex */
public final class g implements nl3 {
    public final n1 a;
    public final List b;
    public final List c;

    static {
        d6.d().b("maven:io.sentry:sentry-okhttp", "8.58.0");
    }

    public g() {
        List listK = qf0.K(new v0(500, 599));
        List listK2 = qf0.K(g7.DEFAULT_PROPAGATION_TARGETS);
        this.a = w4.a;
        this.b = listK;
        this.c = listK2;
        io.sentry.util.b.a("OkHttp");
    }

    public static final io.sentry.util.network.b b(g gVar, lc6 lc6Var) throws Throwable {
        Charset charsetA;
        lc6Var.getClass();
        g1 logger = gVar.a.l().getLogger();
        logger.getClass();
        nc6 nc6Var = lc6Var.s;
        if (nc6Var != null) {
            try {
                jo4 jo4VarQ = nc6Var.q();
                String str = jo4VarQ != null ? jo4VarQ.a : null;
                byte[] bArrE = lc6Var.j().e();
                String strName = (jo4VarQ == null || (charsetA = jo4VarQ.a(vn0.a)) == null) ? null : charsetA.name();
                if (strName == null) {
                    strName = "UTF-8";
                }
                return io.sentry.config.a.l(bArrE, str, strName, logger);
            } catch (Exception e) {
                logger.g(f6.ERROR, "Failed to read http response body for Network Details: " + e.getMessage(), new Object[0]);
            }
        }
        return null;
    }

    public static LinkedHashMap e(k53 k53Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = k53Var.size();
        for (int i = 0; i < size; i++) {
            String strJ = i67.j(k53Var, i);
            String strL = i67.l(k53Var, i);
            String str = (String) linkedHashMap.get(strJ);
            if (str != null) {
                linkedHashMap.put(strJ, str + "; " + strL);
            } else {
                linkedHashMap.put(strJ, strL);
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:133:0x02a9 A[Catch: all -> 0x01e4, TRY_ENTER, TryCatch #2 {all -> 0x01e4, blocks: (B:86:0x01de, B:99:0x0202, B:100:0x0205, B:133:0x02a9, B:134:0x02b1), top: B:160:0x0101 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:144:0x0311  */
    /* JADX WARN: Code duplicated, block: B:146:0x0315  */
    /* JADX WARN: Code duplicated, block: B:149:0x031d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:150:0x031f  */
    /* JADX WARN: Code duplicated, block: B:151:0x0324  */
    /* JADX WARN: Code duplicated, block: B:153:0x0327  */
    /* JADX WARN: Code duplicated, block: B:155:0x032c  */
    /* JADX WARN: Code duplicated, block: B:157:0x0331  */
    /* JADX WARN: Code duplicated, block: B:172:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ec  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v10 */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8, types: [o.lc6] */
    /* JADX WARN: Type inference failed for: r17v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r23v0, types: [io.sentry.okhttp.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v19, types: [o.lc6] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v4, types: [o.lc6] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v6, types: [o.lc6] */
    /* JADX WARN: Type inference failed for: r4v7, types: [o.lc6] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v8, types: [io.sentry.v1] */
    @Override // o.nl3
    public final lc6 a(k46 k46Var) throws Throwable {
        v1 v1VarY;
        a aVar;
        ?? r7;
        Iterator it;
        String str;
        io.sentry.util.network.f fVar;
        ?? r17;
        ?? r18;
        ?? B = "baggage";
        k76 k76Var = new k76();
        ab6 ab6Var = k46Var.e;
        k76Var.m = ab6Var;
        String str2 = ab6Var.a.i;
        n1 n1Var = this.a;
        o oVarS = io.sentry.util.b.s(str2, n1Var.l().getDataCollectionResolver());
        String str3 = (String) oVarS.b;
        if (str3 == null) {
            str3 = "unknown";
        }
        String str4 = ((ab6) k76Var.m).b;
        ConcurrentHashMap concurrentHashMap = f.d;
        a46 a46Var = k46Var.a;
        if (concurrentHashMap.containsKey(a46Var)) {
            aVar = (a) concurrentHashMap.get(a46Var);
            r7 = aVar != null ? aVar.d : 0;
        } else {
            v1 v1VarM = l.a ? n1Var.m() : n1Var.g();
            if (v1VarM != null) {
                v1VarY = v1VarM.y("http.client", str4 + ' ' + str3);
            } else {
                v1VarY = null;
            }
            aVar = null;
            r7 = v1VarY;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        w7 w7VarV = r7 != 0 ? r7.v() : null;
        if (w7VarV != null) {
            w7VarV.u = "auto.http.okhttp";
        }
        if (r7 != 0) {
            String str5 = (String) oVarS.c;
            if (str5 != null) {
                r7.m(str5, "http.query");
            }
            String str6 = (String) oVarS.d;
            if (str6 != null) {
                r7.m(str6, "http.fragment");
            }
        }
        boolean z = aVar != null;
        ab6 ab6Var2 = (ab6) k76Var.m;
        String str7 = ab6Var2.a.i;
        ?? ValueOf = ab6Var2.b;
        List list = n1Var.l().getSessionReplay().p;
        List list2 = n1Var.l().getSessionReplay().q;
        if (list2 == null) {
            if (list == null) {
                it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        fVar = null;
                        break;
                    }
                    str = (String) it.next();
                    if (str == null) {
                    }
                }
            } else {
                fVar = null;
                break;
            }
        } else {
            Iterator it2 = list2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    String str8 = (String) it2.next();
                    if (str8 == null || !str7.matches(str8)) {
                    }
                } else if (list == null) {
                    it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            str = (String) it.next();
                            if (str == null && str7.matches(str)) {
                                fVar = new io.sentry.util.network.f(ValueOf);
                                break;
                            }
                        }
                    }
                }
                fVar = null;
                break;
            }
        }
        try {
            try {
                yc4 yc4VarA = ((ab6) k76Var.m).a();
                if (!q.a("auto.http.okhttp", n1Var.l().getIgnoredSpanOrigins())) {
                    Object obj = k76Var.m;
                    String str9 = ((ab6) obj).a.i;
                    ab6 ab6Var3 = (ab6) obj;
                    ab6Var3.getClass();
                    o oVarZ = io.sentry.util.b.z(n1Var, str9, ab6Var3.c.b("baggage"), r7);
                    if (oVarZ != null) {
                        n7 n7Var = (n7) oVarZ.b;
                        n7Var.getClass();
                        ((nm) yc4VarA.f2598o).h("sentry-trace", n7Var.a());
                        io.sentry.e eVar = (io.sentry.e) oVarZ.c;
                        if (eVar != null) {
                            ((nm) yc4VarA.f2598o).u("baggage");
                            ((nm) yc4VarA.f2598o).h("baggage", eVar.a);
                        }
                        o oVar = (o) oVarZ.d;
                        if (oVar != null) {
                            ((nm) yc4VarA.f2598o).h("traceparent", oVar.R());
                        }
                    }
                }
                db6 db6Var = ((ab6) k76Var.m).d;
                Long lValueOf = db6Var != null ? Long.valueOf(db6Var.a()) : null;
                if (fVar != null) {
                    o oVarH = io.sentry.config.a.h(k76Var.m, lValueOf, n1Var.l().getSessionReplay().r, new i5(yc4VarA, k76Var, this, (byte) 3), n1Var.l().getSessionReplay().s, new h2(this, (byte) 24));
                    fVar.e = oVarH;
                    fVar.c = (Long) oVarH.b;
                }
                ab6 ab6Var4 = new ab6(yc4VarA);
                k76Var.m = ab6Var4;
                B = k46Var.b(ab6Var4);
                try {
                    int i = B.p;
                    ValueOf = Integer.valueOf(i);
                    if (r7 != 0) {
                        try {
                            r7.m(ValueOf, "http.response.status_code");
                        } catch (IOException e) {
                            e = e;
                            if (r7 != 0) {
                                r7.g(e);
                                r7.a(a8.INTERNAL_ERROR);
                            }
                            throw e;
                        }
                    }
                    if (r7 != 0) {
                        try {
                            r7.a(a8.fromHttpStatusCode(i));
                        } catch (IOException e2) {
                            e = e2;
                            if (r7 != 0) {
                                r7.g(e);
                                r7.a(a8.INTERNAL_ERROR);
                            }
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            if (aVar != null) {
                                aVar.e((ab6) k76Var.m);
                            }
                            if (B != 0 || fVar == null) {
                                r17 = B;
                            } else {
                                int i2 = B.p;
                                nc6 nc6Var = B.s;
                                ?? r19 = B;
                                o oVarH2 = io.sentry.config.a.h(r19, nc6Var != null ? Long.valueOf(nc6Var.j()) : null, n1Var.l().getSessionReplay().r, new p7(this, (byte) 14), n1Var.l().getSessionReplay().t, new h2(this, (byte) 25));
                                fVar.b = Integer.valueOf(i2);
                                fVar.f = oVarH2;
                                fVar.d = (Long) oVarH2.b;
                                r17 = r19;
                            }
                            if (aVar != null) {
                                aVar.g = fVar;
                            }
                            if (r7 == 0) {
                                if (!z) {
                                    r7.l();
                                }
                                if (aVar != null) {
                                    aVar.a(null);
                                }
                            } else if (aVar != null) {
                                aVar.a(null);
                            }
                            if (!z) {
                                c((ab6) k76Var.m, ValueOf, r17, jCurrentTimeMillis, fVar);
                            }
                            throw th;
                        }
                    }
                    if (d((ab6) k76Var.m, B)) {
                        if (!z || aVar == null) {
                            io.sentry.config.a.b(n1Var, (ab6) k76Var.m, B);
                        } else {
                            aVar.f = B;
                        }
                    }
                    if (aVar != null) {
                        aVar.e((ab6) k76Var.m);
                    }
                    if (fVar != null) {
                        nc6 nc6Var2 = B.s;
                        ?? r110 = B;
                        o oVarH3 = io.sentry.config.a.h(r110, nc6Var2 != null ? Long.valueOf(nc6Var2.j()) : null, n1Var.l().getSessionReplay().r, new p7(this, (byte) 14), n1Var.l().getSessionReplay().t, new h2(this, (byte) 25));
                        fVar.b = Integer.valueOf(i);
                        fVar.f = oVarH3;
                        fVar.d = (Long) oVarH3.b;
                        r18 = r110;
                    } else {
                        r18 = B;
                    }
                    if (aVar != null) {
                        aVar.g = fVar;
                    }
                    if (r7 != 0) {
                        if (!z) {
                            r7.l();
                        }
                        if (aVar != null) {
                            aVar.a(null);
                        }
                    } else if (aVar != null) {
                        aVar.a(null);
                    }
                    if (!z) {
                        c((ab6) k76Var.m, ValueOf, r18, jCurrentTimeMillis, fVar);
                    }
                    return r18;
                } catch (IOException e3) {
                    e = e3;
                    if (r7 != 0) {
                        r7.g(e);
                        r7.a(a8.INTERNAL_ERROR);
                    }
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    B = B;
                    ValueOf = 0;
                    if (aVar != null) {
                        aVar.e((ab6) k76Var.m);
                    }
                    if (B != 0) {
                        r17 = B;
                    } else {
                        r17 = B;
                    }
                    if (aVar != null) {
                        aVar.g = fVar;
                    }
                    if (r7 == 0) {
                        if (!z) {
                            r7.l();
                        }
                        if (aVar != null) {
                            aVar.a(null);
                        }
                    } else if (aVar != null) {
                        aVar.a(null);
                    }
                    if (!z) {
                        c((ab6) k76Var.m, ValueOf, r17, jCurrentTimeMillis, fVar);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e4) {
            e = e4;
        } catch (Throwable th4) {
            th = th4;
            B = 0;
        }
    }

    public final void c(ab6 ab6Var, Integer num, lc6 lc6Var, long j, io.sentry.util.network.f fVar) {
        nc6 nc6Var;
        f6 f6Var;
        String str = ab6Var.a.i;
        String str2 = ab6Var.b;
        n1 n1Var = this.a;
        s dataCollectionResolver = n1Var.l().getDataCollectionResolver();
        h hVar = new h();
        o oVarS = io.sentry.util.b.s(str, dataCollectionResolver);
        hVar.q = "http";
        hVar.s = "http";
        String str3 = (String) oVarS.b;
        if (str3 != null) {
            hVar.d(str3, "url");
        }
        hVar.d(str2.toUpperCase(Locale.ROOT), "method");
        String str4 = (String) oVarS.c;
        if (str4 != null) {
            hVar.d(str4, "http.query");
        }
        String str5 = (String) oVarS.d;
        if (str5 != null) {
            hVar.d(str5, "http.fragment");
        }
        Long lValueOf = null;
        if (num != null) {
            hVar.d(num, "status_code");
            int iIntValue = num.intValue();
            v0 v0Var = io.sentry.util.d.c;
            if (iIntValue < v0Var.a || iIntValue > v0Var.b) {
                int iIntValue2 = num.intValue();
                v0 v0Var2 = io.sentry.util.d.d;
                f6Var = (iIntValue2 < v0Var2.a || iIntValue2 > v0Var2.b) ? null : f6.ERROR;
            } else {
                f6Var = f6.WARNING;
            }
            hVar.u = f6Var;
        }
        db6 db6Var = ab6Var.d;
        Long lValueOf2 = db6Var != null ? Long.valueOf(db6Var.a()) : null;
        if (lValueOf2 != null && lValueOf2.longValue() != -1) {
            hVar.d(Long.valueOf(lValueOf2.longValue()), "http.request_content_length");
        }
        if (lc6Var != null && (nc6Var = lc6Var.s) != null) {
            lValueOf = Long.valueOf(nc6Var.j());
        }
        if (lValueOf != null && lValueOf.longValue() != -1) {
            hVar.d(Long.valueOf(lValueOf.longValue()), "http.response_content_length");
        }
        p0 p0Var = new p0();
        p0Var.d(ab6Var, "okHttp:request");
        if (lc6Var != null) {
            p0Var.d(lc6Var, "okHttp:response");
        }
        if (fVar != null) {
            p0Var.d(fVar, "sentry:replayNetworkDetails");
        }
        hVar.d(Long.valueOf(j), "http.start_timestamp");
        hVar.d(Long.valueOf(System.currentTimeMillis()), "http.end_timestamp");
        n1Var.f(hVar, p0Var);
    }

    public final boolean d(ab6 ab6Var, lc6 lc6Var) {
        int i = lc6Var.p;
        for (v0 v0Var : this.b) {
            if (i >= v0Var.a && i <= v0Var.b) {
                if (!io.sentry.util.b.e(ab6Var.a.i, this.c)) {
                    return false;
                }
                if (i != 504) {
                    return true;
                }
                fi0 fi0VarR = ab6Var.f;
                if (fi0VarR == null) {
                    int i2 = fi0.n;
                    fi0VarR = ga0.r(ab6Var.c);
                    ab6Var.f = fi0VarR;
                }
                return !fi0VarR.j;
            }
        }
        return false;
    }
}
