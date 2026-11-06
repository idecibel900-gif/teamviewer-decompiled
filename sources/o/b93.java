package o;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class b93 implements nl3 {
    public final a93 a;
    public volatile z83 b = z83.m;

    public b93(a93 a93Var) {
        this.a = a93Var;
    }

    /* JADX WARN: Code duplicated, block: B:146:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fd A[LOOP:0: B:45:0x00fb->B:46:0x00fd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:78:0x019b  */
    /* JADX WARN: Code duplicated, block: B:85:0x0223  */
    /* JADX WARN: Instruction removed from duplicated block: B:85:0x0223, please report this as an issue */
    @Override // o.nl3
    public final lc6 a(k46 k46Var) throws Exception {
        boolean z;
        String str;
        Long lValueOf;
        Charset charsetA;
        int size;
        int i;
        Long lValueOf2;
        Charset charsetA2;
        z83 z83Var = this.b;
        ab6 ab6Var = k46Var.e;
        if (z83Var == z83.m) {
            return k46Var.b(ab6Var);
        }
        boolean z2 = true;
        boolean z3 = z83Var == z83.p;
        if (!z3 && z83Var != z83.f2680o) {
            z2 = false;
        }
        db6 db6Var = ab6Var.d;
        io.sentry.z7 z7Var = k46Var.d;
        b46 b46VarE = z7Var != null ? z7Var.e() : null;
        StringBuilder sb = new StringBuilder("--> ");
        sb.append(ab6Var.b);
        sb.append(' ');
        h93 h93Var = ab6Var.a;
        h93Var.getClass();
        sb.append(h93Var.i);
        String str2 = " ";
        sb.append(b46VarE != null ? " " + b46VarE.g : "");
        String string = sb.toString();
        if (!z2 && db6Var != null) {
            string = string + " (" + db6Var.a() + "-byte body)";
        }
        this.a.a(string);
        if (z2) {
            k53 k53Var = ab6Var.c;
            if (db6Var != null) {
                jo4 jo4VarB = db6Var.b();
                z = z3;
                if (jo4VarB != null && k53Var.a("Content-Type") == null) {
                    this.a.a("Content-Type: " + jo4VarB);
                }
                if (db6Var.a() != -1 && k53Var.a("Content-Length") == null) {
                    this.a.a("Content-Length: " + db6Var.a());
                }
                size = k53Var.size();
                for (i = 0; i < size; i++) {
                    b(k53Var, i);
                }
                if (z || db6Var == null) {
                    this.a.a("--> END " + ab6Var.b);
                } else {
                    String strA = ab6Var.c.a("Content-Encoding");
                    if (strA != null && !strA.equalsIgnoreCase("identity") && !strA.equalsIgnoreCase("gzip")) {
                        this.a.a("--> END " + ab6Var.b + " (encoded body omitted)");
                    } else if (db6Var.c()) {
                        this.a.a("--> END " + ab6Var.b + " (one-shot body omitted)");
                    } else {
                        bf0 bf0Var = new bf0();
                        db6Var.d(bf0Var);
                        if ("gzip".equalsIgnoreCase(k53Var.a("Content-Encoding"))) {
                            lValueOf2 = Long.valueOf(bf0Var.n);
                            i43 i43Var = new i43(bf0Var);
                            try {
                                bf0Var = new bf0();
                                bf0Var.T0(i43Var);
                                i43Var.close();
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    kh.n(i43Var, th);
                                    throw th2;
                                }
                            }
                        } else {
                            lValueOf2 = null;
                        }
                        jo4 jo4VarB2 = db6Var.b();
                        if (jo4VarB2 != null) {
                            e96 e96Var = jo4.e;
                            charsetA2 = jo4VarB2.a(null);
                            if (charsetA2 == null) {
                                charsetA2 = vn0.a;
                            }
                        } else {
                            charsetA2 = vn0.a;
                        }
                        this.a.a("");
                        boolean zP = lv1.P(bf0Var);
                        a93 a93Var = this.a;
                        if (!zP) {
                            a93Var.a("--> END " + ab6Var.b + " (binary " + db6Var.a() + "-byte body omitted)");
                        } else if (lValueOf2 != null) {
                            a93Var.a("--> END " + ab6Var.b + " (" + bf0Var.n + "-byte, " + lValueOf2.longValue() + "-gzipped-byte body)");
                        } else {
                            a93Var.a(bf0Var.a0(charsetA2));
                            this.a.a("--> END " + ab6Var.b + " (" + db6Var.a() + "-byte body)");
                        }
                    }
                }
            } else {
                z = z3;
                z2 = z2;
                str2 = " ";
            }
            size = k53Var.size();
            while (i < size) {
                b(k53Var, i);
            }
            if (z) {
                this.a.a("--> END " + ab6Var.b);
            } else {
                this.a.a("--> END " + ab6Var.b);
            }
        } else {
            z = z3;
            z2 = z2;
            str2 = " ";
        }
        long jNanoTime = System.nanoTime();
        try {
            lc6 lc6VarB = k46Var.b(ab6Var);
            long jNanoTime2 = (System.nanoTime() - jNanoTime) / 1000000;
            nc6 nc6Var = lc6VarB.s;
            nc6Var.getClass();
            long j = nc6Var.j();
            String str3 = j != -1 ? j + "-byte" : "unknown-length";
            a93 a93Var2 = this.a;
            StringBuilder sb2 = new StringBuilder("<-- " + lc6VarB.p);
            if (lc6VarB.f1350o.length() > 0) {
                str = str2;
                sb2.append(str + lc6VarB.f1350o);
            } else {
                str = str2;
            }
            StringBuilder sb3 = new StringBuilder(str);
            h93 h93Var2 = lc6VarB.m.a;
            h93Var2.getClass();
            sb3.append(h93Var2.i);
            sb3.append(" (");
            sb3.append(jNanoTime2);
            sb3.append("ms");
            sb2.append(sb3.toString());
            if (!z2) {
                sb2.append(", " + str3 + " body");
            }
            sb2.append(")");
            a93Var2.a(sb2.toString());
            if (z2) {
                k53 k53Var2 = lc6VarB.r;
                int size2 = k53Var2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    b(k53Var2, i2);
                }
                if (z && y83.a(lc6VarB)) {
                    String strA2 = lc6VarB.r.a("Content-Encoding");
                    if (strA2 != null && !strA2.equalsIgnoreCase("identity") && !strA2.equalsIgnoreCase("gzip")) {
                        this.a.a("<-- END HTTP (encoded body omitted)");
                        return lc6VarB;
                    }
                    jo4 jo4VarQ = lc6VarB.s.q();
                    if (jo4VarQ != null && jo4VarQ.b.equals("text") && jo4VarQ.c.equals("event-stream")) {
                        this.a.a("<-- END HTTP (streaming)");
                        return lc6VarB;
                    }
                    if (nc6Var instanceof w88) {
                        this.a.a("<-- END HTTP (unreadable body)");
                        return lc6VarB;
                    }
                    of0 of0VarE0 = nc6Var.E0();
                    of0VarE0.m0(Long.MAX_VALUE);
                    long jNanoTime3 = (System.nanoTime() - jNanoTime) / 1000000;
                    bf0 bf0VarH = of0VarE0.h();
                    if ("gzip".equalsIgnoreCase(k53Var2.a("Content-Encoding"))) {
                        lValueOf = Long.valueOf(bf0VarH.n);
                        i43 i43Var2 = new i43(bf0VarH.q());
                        try {
                            bf0VarH = new bf0();
                            bf0VarH.T0(i43Var2);
                            i43Var2.close();
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                kh.n(i43Var2, th3);
                                throw th4;
                            }
                        }
                    } else {
                        lValueOf = null;
                    }
                    jo4 jo4VarQ2 = nc6Var.q();
                    if (jo4VarQ2 != null) {
                        e96 e96Var2 = jo4.e;
                        charsetA = jo4VarQ2.a(null);
                        if (charsetA == null) {
                            charsetA = vn0.a;
                        }
                    } else {
                        charsetA = vn0.a;
                    }
                    if (!lv1.P(bf0VarH)) {
                        this.a.a("");
                        this.a.a("<-- END HTTP (" + jNanoTime3 + "ms, binary " + bf0VarH.n + "-byte body omitted)");
                        return lc6VarB;
                    }
                    if (j != 0) {
                        this.a.a("");
                        this.a.a(bf0VarH.q().a0(charsetA));
                    }
                    a93 a93Var3 = this.a;
                    StringBuilder sb4 = new StringBuilder("<-- END HTTP (");
                    sb4.append(jNanoTime3);
                    sb4.append("ms, ");
                    StringBuilder sb5 = new StringBuilder(e41.k(sb4, bf0VarH.n, "-byte"));
                    if (lValueOf != null) {
                        sb5.append(", " + lValueOf.longValue() + "-gzipped-byte");
                    }
                    sb5.append(" body)");
                    a93Var3.a(sb5.toString());
                    return lc6VarB;
                }
                this.a.a("<-- END HTTP");
            }
            return lc6VarB;
        } catch (Exception e) {
            long jNanoTime4 = (System.nanoTime() - jNanoTime) / 1000000;
            StringBuilder sb6 = new StringBuilder(str2);
            h93 h93Var3 = ab6Var.a;
            h93Var3.getClass();
            sb6.append(h93Var3.i);
            sb6.append(" (");
            sb6.append(jNanoTime4);
            sb6.append("ms)");
            this.a.a(("<-- HTTP FAILED: " + e + '.').concat(sb6.toString()));
            throw e;
        }
    }

    public final void b(k53 k53Var, int i) {
        i67.j(k53Var, i);
        this.a.a(i67.j(k53Var, i) + ": " + i67.l(k53Var, i));
    }
}
