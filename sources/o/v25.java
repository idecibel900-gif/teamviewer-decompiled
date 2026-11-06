package o;

import android.webkit.MimeTypeMap;
import java.io.IOException;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class v25 implements vi2 {
    public final String a;
    public final za5 b;
    public final kh7 c;
    public final kh7 d;
    public final kh7 e;
    public final di3 f;
    public final kh7 g;

    public v25(String str, za5 za5Var, kh7 kh7Var, kh7 kh7Var2, kh7 kh7Var3, di3 di3Var, kh7 kh7Var4) {
        this.a = str;
        this.b = za5Var;
        this.c = kh7Var;
        this.d = kh7Var2;
        this.e = kh7Var3;
        this.f = di3Var;
        this.g = kh7Var4;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0012  */
    public static String d(String str, String str2) {
        String mimeTypeFromExtension;
        if (str2 == null || bc7.N(false, str2, "text/plain")) {
            if (ub7.b0(str)) {
                mimeTypeFromExtension = null;
            } else {
                String strT0 = ub7.t0(ub7.t0(str, '#'), '?');
                String strQ0 = ub7.q0('.', ub7.q0('/', strT0, strT0), "");
                if (ub7.b0(strQ0)) {
                    mimeTypeFromExtension = null;
                } else {
                    String lowerCase = strQ0.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    mimeTypeFromExtension = (String) gr4.a.get(lowerCase);
                    if (mimeTypeFromExtension == null) {
                        mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
                    }
                }
            }
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
            }
        }
        if (str2 != null) {
            return ub7.r0(str2, ';');
        }
        return null;
    }

    public static void f(c35 c35Var) {
        int i = c35Var.a;
        if ((200 > i || i >= 300) && i != 304) {
            throw new x83(fx3.e(i, "HTTP "));
        }
    }

    @Override // o.vi2
    public final Object a(fb2 fb2Var) {
        s78 s78Var = (s78) this.g.getValue();
        String str = this.b.e;
        ew1 ew1Var = new ew1(1, this, v25.class, "doFetch", "doFetch(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 26);
        s78Var.getClass();
        return ew1Var.invoke(fb2Var);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:75:0x018a  */
    /* JADX WARN: Code duplicated, block: B:76:0x018b A[Catch: Exception -> 0x0043, PHI: r0 r1
      0x018b: PHI (r0v30 java.lang.Object) = (r0v20 java.lang.Object), (r0v1 java.lang.Object) binds: [B:74:0x0188, B:22:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x018b: PHI (r1v10 o.k76) = (r1v8 o.k76), (r1v16 o.k76) binds: [B:74:0x0188, B:22:0x0052] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {Exception -> 0x0043, blocks: (B:15:0x003e, B:81:0x01ad, B:22:0x0052, B:76:0x018b, B:78:0x018f, B:58:0x0122, B:60:0x0128, B:66:0x0150, B:68:0x0156, B:71:0x0165, B:72:0x016a, B:73:0x016b, B:41:0x00a7, B:43:0x00ae, B:45:0x00bc, B:52:0x00ee, B:54:0x00fa, B:48:0x00d2, B:50:0x00dc, B:63:0x0147, B:64:0x014e), top: B:93:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x018f A[Catch: Exception -> 0x0043, TryCatch #3 {Exception -> 0x0043, blocks: (B:15:0x003e, B:81:0x01ad, B:22:0x0052, B:76:0x018b, B:78:0x018f, B:58:0x0122, B:60:0x0128, B:66:0x0150, B:68:0x0156, B:71:0x0165, B:72:0x016a, B:73:0x016b, B:41:0x00a7, B:43:0x00ae, B:45:0x00bc, B:52:0x00ee, B:54:0x00fa, B:48:0x00d2, B:50:0x00dc, B:63:0x0147, B:64:0x014e), top: B:93:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01aa, code lost:
    
        if (r0 == r12) goto L80;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(o.hc1 r19) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.v25.b(o.hc1):java.lang.Object");
    }

    public final sj2 c() {
        sj2 sj2Var;
        e46 e46Var = (e46) this.d.getValue();
        return (e46Var == null || (sj2Var = e46Var.a) == null) ? this.b.f : sj2Var;
    }

    public final z25 e() {
        f4 f4Var = le3.b;
        za5 za5Var = this.b;
        w25 w25Var = (w25) nv1.x(za5Var, f4Var);
        w25Var.getClass();
        og1 og1Var = new og1(w25Var);
        ii0 ii0Var = za5Var.h;
        boolean z = ii0Var.m;
        boolean z2 = za5Var.i.m && ((h51) this.f.m).a();
        if (!z2 && z) {
            og1Var.g("only-if-cached, max-stale=2147483647");
        } else if (!z2 || z) {
            if (!z2 && !z) {
                og1Var.g("no-cache, only-if-cached");
            }
        } else if (ii0Var.n) {
            og1Var.g("no-cache");
        } else {
            og1Var.g("no-cache, no-store");
        }
        String str = (String) nv1.x(za5Var, le3.a);
        w25 w25Var2 = new w25(xm4.V(og1Var.a));
        if (nv1.x(za5Var, le3.c) == null) {
            return new z25(this.a, str, w25Var2, za5Var.j);
        }
        io.sentry.h2.f();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(a77 a77Var, jc1 jc1Var) {
        t25 t25Var;
        bf0 bf0Var;
        if (jc1Var instanceof t25) {
            t25Var = (t25) jc1Var;
            int i = t25Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                t25Var.p = i - Integer.MIN_VALUE;
            } else {
                t25Var = new t25(this, jc1Var);
            }
        } else {
            t25Var = new t25(this, jc1Var);
        }
        Object obj = t25Var.n;
        int i2 = t25Var.p;
        if (i2 == 0) {
            ct1.a0(obj);
            bf0 bf0Var2 = new bf0();
            t25Var.m = bf0Var2;
            t25Var.p = 1;
            a77Var.m.r0(bf0Var2);
            f88 f88Var = f88.a;
            ne1 ne1Var = ne1.m;
            if (f88Var == ne1Var) {
                return ne1Var;
            }
            bf0Var = bf0Var2;
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bf0Var = t25Var.m;
            ct1.a0(obj);
        }
        return new u67(bf0Var, c(), null);
    }

    public final kj2 h(d46 d46Var) {
        w12 w12Var = d46Var.m;
        if (w12Var.n) {
            hk0.l("snapshot is closed");
            return null;
        }
        wg5 wg5Var = (wg5) w12Var.m.c.get(1);
        sj2 sj2VarC = c();
        String str = this.b.e;
        if (str == null) {
            str = this.a;
        }
        return xs1.g(wg5Var, sj2VarC, str, d46Var, 16);
    }

    public final c35 i(d46 d46Var) throws Throwable {
        Throwable th;
        c35 c35VarS;
        try {
            sj2 sj2VarC = c();
            w12 w12Var = d46Var.m;
            if (w12Var.n) {
                throw new IllegalStateException("snapshot is closed");
            }
            q67 q67VarK0 = sj2VarC.k0((wg5) w12Var.m.c.get(0));
            q67VarK0.getClass();
            w36 w36Var = new w36(q67VarK0);
            try {
                c35VarS = qf0.S(w36Var);
                try {
                    w36Var.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    w36Var.close();
                } catch (Throwable th4) {
                    ct1.q(th3, th4);
                }
                th = th3;
                c35VarS = null;
            }
            if (th == null) {
                return c35VarS;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x023c A[Catch: Exception -> 0x003d, TryCatch #7 {Exception -> 0x003d, blocks: (B:13:0x0038, B:110:0x0216, B:117:0x0221, B:118:0x022b, B:120:0x0239, B:122:0x023c, B:125:0x0243, B:126:0x0244, B:119:0x022c), top: B:154:0x0038, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x0261  */
    /* JADX WARN: Code duplicated, block: B:148:0x022c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0251 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x025b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0191  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [o.g95] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [o.g95] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [o.g95] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32, types: [o.g95] */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41 */
    public final Object j(d46 d46Var, c35 c35Var, c35 c35Var2, jc1 jc1Var) throws Exception {
        u25 u25Var;
        c35 c35Var3;
        g95 g95Var;
        ?? r4;
        ?? r1;
        ?? th;
        ?? th2;
        ?? r2;
        io.sentry.z7 z7VarJ;
        g95 g95Var2;
        a77 a77Var;
        a77 a77Var2;
        io.sentry.z7 z7Var;
        y12 y12Var;
        w12 w12VarQ;
        d46 d46Var2 = d46Var;
        c35 c35Var4 = c35Var2;
        if (jc1Var instanceof u25) {
            u25Var = (u25) jc1Var;
            int i = u25Var.s;
            if ((i & Integer.MIN_VALUE) != 0) {
                u25Var.s = i - Integer.MIN_VALUE;
            } else {
                u25Var = new u25(this, jc1Var);
            }
        } else {
            u25Var = new u25(this, jc1Var);
        }
        Object ki0Var = u25Var.q;
        ne1 ne1Var = ne1.m;
        int i2 = u25Var.s;
        d46 d46Var3 = null;
        if (i2 == 0) {
            ct1.a0(ki0Var);
            if (!this.b.h.n) {
                if (d46Var2 != null) {
                    try {
                        to7.q(d46Var2);
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception unused) {
                    }
                }
                return null;
            }
            li0 li0Var = (li0) this.e.getValue();
            u25Var.m = d46Var2;
            u25Var.n = c35Var4;
            u25Var.s = 1;
            ((pj1) li0Var).getClass();
            int i3 = c35Var4.a;
            if (i3 != 304 || c35Var == null) {
                ki0Var = ((200 > i3 || i3 >= 300) && !pj1.b.contains(new Integer(i3))) ? ki0.b : new ki0(c35Var4);
            } else {
                w25 w25Var = c35Var.d;
                w25 w25Var2 = c35Var4.d;
                w25Var.getClass();
                Map map = w25Var.a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), lv0.Q0((Collection) entry.getValue()));
                }
                for (Map.Entry entry2 : w25Var2.a.entrySet()) {
                    String str = (String) entry2.getKey();
                    List list = (List) entry2.getValue();
                    String lowerCase = str.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    linkedHashMap.put(lowerCase, lv0.Q0(list));
                }
                ki0Var = new ki0(new c35(c35Var4.a, c35Var4.b, c35Var4.c, new w25(xm4.V(linkedHashMap)), null, c35Var4.f));
            }
            if (ki0Var != ne1Var) {
            }
            return ne1Var;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r1 = u25Var.p;
            c35Var3 = u25Var.f2160o;
            c35Var4 = u25Var.n;
            try {
                ct1.a0(ki0Var);
                r2 = r1;
                r1 = r2;
                z7Var = (io.sentry.z7) r1.m;
                y12Var = (y12) z7Var.d;
                synchronized (y12Var.t) {
                    z7Var.b(true);
                    w12VarQ = y12Var.q(((v12) z7Var.b).a);
                }
                if (w12VarQ != null) {
                    return new d46(w12VarQ);
                }
                return d46Var3;
            } catch (Exception e2) {
                e = e2;
                try {
                    ((io.sentry.z7) r1.m).b(false);
                } catch (Exception unused2) {
                }
                a77Var = c35Var4.e;
                if (a77Var != null) {
                    try {
                        to7.q(a77Var);
                    } catch (RuntimeException e3) {
                        throw e3;
                    } catch (Exception unused3) {
                    }
                }
                a77Var2 = c35Var3.e;
                if (a77Var2 != null) {
                    throw e;
                }
                try {
                    to7.q(a77Var2);
                    throw e;
                } catch (RuntimeException e4) {
                    throw e4;
                } catch (Exception unused4) {
                    throw e;
                }
            }
        }
        c35 c35Var5 = u25Var.n;
        d46 d46Var4 = u25Var.m;
        ct1.a0(ki0Var);
        c35Var4 = c35Var5;
        d46Var2 = d46Var4;
        d46Var3 = null;
        c35Var3 = ((ki0) ki0Var).a;
        if (c35Var3 == null) {
            return d46Var3;
        }
        if (d46Var2 != null) {
            w12 w12Var = d46Var2.m;
            y12 y12Var2 = w12Var.f2363o;
            synchronized (y12Var2.t) {
                w12Var.close();
                z7VarJ = y12Var2.j(w12Var.m.a);
            }
            if (z7VarJ != null) {
                g95Var2 = new g95(z7VarJ);
            } else {
                r4 = d46Var3;
            }
        } else {
            e46 e46Var = (e46) this.d.getValue();
            if (e46Var == null) {
                r4 = d46Var3;
            } else {
                String str2 = this.b.e;
                if (str2 == null) {
                    str2 = this.a;
                }
                y12 y12Var3 = e46Var.b;
                ai0 ai0Var = ai0.p;
                io.sentry.z7 z7VarJ2 = y12Var3.j(ju.s(str2).c("SHA-256").e());
                if (z7VarJ2 != null) {
                    g95Var = new g95(z7VarJ2);
                } else {
                    r4 = d46Var3;
                }
            }
        }
        if (r4 == 0) {
            r4 = g95Var;
            r4 = g95Var2;
            return d46Var3;
        }
        try {
            r4 = g95Var;
            r4 = g95Var2;
            v07 v07VarC0 = c().c0(((io.sentry.z7) r4.m).d(0), false);
            v07VarC0.getClass();
            u36 u36Var = new u36(v07VarC0);
            try {
                qf0.Y(c35Var3, u36Var);
                try {
                    u36Var.close();
                    th = d46Var3;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                try {
                    u36Var.close();
                } catch (Throwable th5) {
                    ct1.q(th4, th5);
                }
                th = th4;
            }
            if (th != 0) {
                throw th;
            }
            a77 a77Var3 = c35Var3.e;
            if (a77Var3 != null) {
                sj2 sj2VarC = c();
                wg5 wg5VarD = ((io.sentry.z7) r4.m).d(1);
                d46Var3 = d46Var3;
                u25Var.m = d46Var3;
                u25Var.n = c35Var4;
                u25Var.f2160o = c35Var3;
                u25Var.p = r4;
                u25Var.s = 2;
                of0 of0Var = a77Var3.m;
                v07 v07VarC1 = sj2VarC.c0(wg5VarD, false);
                v07VarC1.getClass();
                u36 u36Var2 = new u36(v07VarC1);
                try {
                    new Long(of0Var.r0(u36Var2));
                    try {
                        u36Var2.close();
                        th2 = d46Var3;
                    } catch (Throwable th6) {
                        th2 = th6;
                    }
                } catch (Throwable th7) {
                    try {
                        u36Var2.close();
                    } catch (Throwable th8) {
                        ct1.q(th7, th8);
                    }
                    th2 = th7;
                }
                if (th2 != 0) {
                    throw th2;
                }
                f88 f88Var = f88.a;
                if (f88Var != ne1Var) {
                    r2 = r4;
                    ki0Var = f88Var;
                    r1 = r2;
                }
                return ne1Var;
            }
            d46Var3 = d46Var3;
            r1 = r4;
            z7Var = (io.sentry.z7) r1.m;
            y12Var = (y12) z7Var.d;
            synchronized (y12Var.t) {
                z7Var.b(true);
                w12VarQ = y12Var.q(((v12) z7Var.b).a);
                if (w12VarQ != null) {
                    return new d46(w12VarQ);
                }
                return d46Var3;
            }
        } catch (Exception e5) {
            e = e5;
            r1 = r4;
            ((io.sentry.z7) r1.m).b(false);
            a77Var = c35Var4.e;
            if (a77Var != null) {
                to7.q(a77Var);
            }
            a77Var2 = c35Var3.e;
            if (a77Var2 != null) {
                throw e;
            }
            to7.q(a77Var2);
            throw e;
        }
    }
}
