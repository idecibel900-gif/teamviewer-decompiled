package io.sentry;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes.dex */
public final class y3 extends d0 {
    public static final Charset i = Charset.forName("UTF-8");
    public final n1 e;
    public final d1 f;
    public final t1 g;
    public final g1 h;

    public y3(n1 n1Var, d1 d1Var, t1 t1Var, g1 g1Var, long j, int i2) {
        super(n1Var, g1Var, j, i2);
        this.e = n1Var;
        io.sentry.util.b.v(d1Var, "Envelope reader is required.");
        this.f = d1Var;
        io.sentry.util.b.v(t1Var, "Serializer is required.");
        this.g = t1Var;
        io.sentry.util.b.v(g1Var, "Logger is required.");
        this.h = g1Var;
    }

    @Override // io.sentry.d0
    public final boolean a(String str) {
        return (str == null || str.startsWith("session") || str.startsWith("previous_session") || str.startsWith("startup_crash")) ? false : true;
    }

    @Override // io.sentry.d0
    public final void b(File file, p0 p0Var) {
        boolean zA = a(file.getName());
        g1 g1Var = this.h;
        try {
            if (!zA) {
                g1Var.g(f6.DEBUG, "File '%s' should be ignored.", file.getAbsolutePath());
                return;
            }
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    io.sentry.internal.debugmeta.c cVarA = this.f.a(bufferedInputStream);
                    if (cVarA == null) {
                        g1Var.g(f6.ERROR, "Stream from path %s resulted in a null envelope.", file.getAbsolutePath());
                    } else {
                        e(cVarA, p0Var);
                        g1Var.g(f6.DEBUG, "File '%s' is done.", file.getAbsolutePath());
                    }
                    bufferedInputStream.close();
                    Object objB = p0Var.b("sentry:typeCheckHint");
                    if (!io.sentry.hints.h.class.isInstance(p0Var.b("sentry:typeCheckHint")) || objB == null) {
                        io.sentry.util.b.q(io.sentry.hints.h.class, objB, g1Var);
                    } else {
                        d(file, (io.sentry.hints.h) objB);
                    }
                } catch (Throwable th) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                g1Var.d(f6.ERROR, "Error processing envelope.", e);
                Object objB2 = p0Var.b("sentry:typeCheckHint");
                if (!io.sentry.hints.h.class.isInstance(p0Var.b("sentry:typeCheckHint")) || objB2 == null) {
                    io.sentry.util.b.q(io.sentry.hints.h.class, objB2, g1Var);
                } else {
                    d(file, (io.sentry.hints.h) objB2);
                }
            }
        } catch (Throwable th3) {
            Object objB3 = p0Var.b("sentry:typeCheckHint");
            if (!io.sentry.hints.h.class.isInstance(p0Var.b("sentry:typeCheckHint")) || objB3 == null) {
                io.sentry.util.b.q(io.sentry.hints.h.class, objB3, g1Var);
            } else {
                d(file, (io.sentry.hints.h) objB3);
            }
            throw th3;
        }
    }

    public final h4 c(c8 c8Var) {
        String str;
        g1 g1Var = this.h;
        if (c8Var != null && (str = c8Var.s) != null) {
            try {
                Double dValueOf = Double.valueOf(Double.parseDouble(str));
                if (io.sentry.util.b.p(dValueOf, false)) {
                    String str2 = c8Var.t;
                    if (str2 != null) {
                        Double dValueOf2 = Double.valueOf(Double.parseDouble(str2));
                        if (io.sentry.util.b.p(dValueOf2, false)) {
                            return new h4(Boolean.TRUE, dValueOf, dValueOf2);
                        }
                    }
                    return io.sentry.util.b.b(new h4(Boolean.TRUE, dValueOf));
                }
                g1Var.g(f6.ERROR, "Invalid sample rate parsed from TraceContext: %s", str);
            } catch (Exception unused) {
                g1Var.g(f6.ERROR, "Unable to parse sample rate from TraceContext: %s", str);
            }
        }
        return new h4(Boolean.TRUE, (Double) null);
    }

    public final /* synthetic */ void d(File file, io.sentry.hints.h hVar) {
        g1 g1Var = this.h;
        if (hVar.a()) {
            return;
        }
        try {
            if (file.delete()) {
                return;
            }
            g1Var.g(f6.ERROR, "Failed to delete: %s", file.getAbsolutePath());
        } catch (RuntimeException e) {
            g1Var.b(f6.ERROR, e, "Failed to delete: %s", file.getAbsolutePath());
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x025f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:96:0x0237  */
    public final void e(io.sentry.internal.debugmeta.c cVar, p0 p0Var) {
        int size;
        Object objB;
        f6 f6Var = f6.DEBUG;
        Iterable iterable = (Iterable) cVar.f205o;
        n5 n5Var = (n5) cVar.n;
        io.sentry.protocol.w wVar = n5Var.m;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            Iterator it = iterable.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                it.next();
                i2++;
            }
            size = i2;
        }
        Object[] objArr = {Integer.valueOf(size)};
        g1 g1Var = this.h;
        g1Var.g(f6Var, "Processing Envelope with %d item(s)", objArr);
        Iterator it2 = iterable.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            t5 t5Var = (t5) it2.next();
            int i4 = i3 + 1;
            u5 u5Var = t5Var.a;
            u5 u5Var2 = t5Var.a;
            e6 e6Var = u5Var.q;
            boolean zEquals = e6.Event.equals(u5Var.q);
            t1 t1Var = this.g;
            Iterator it3 = it2;
            Charset charset = i;
            n1 n1Var = this.e;
            if (zEquals) {
                try {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(t5Var.g()), charset));
                        try {
                            v5 v5Var = (v5) t1Var.b(bufferedReader, v5.class);
                            if (v5Var == null) {
                                g1Var.g(f6.ERROR, "Item %d of type %s returned null by the parser.", Integer.valueOf(i4), u5Var2.q);
                            } else {
                                io.sentry.protocol.u uVar = v5Var.f198o;
                                if (uVar != null) {
                                    String str = uVar.m;
                                    if (str.startsWith("sentry.javascript") || str.startsWith("sentry.dart") || str.startsWith("sentry.dotnet")) {
                                        p0Var.d(Boolean.TRUE, "sentry:isFromHybridSdk");
                                    }
                                }
                                if (wVar == null || wVar.equals(v5Var.m)) {
                                    n1Var.B(v5Var, p0Var);
                                    g1Var.g(f6.DEBUG, "Item %d is being captured.", Integer.valueOf(i4));
                                    if (!f(p0Var)) {
                                        g1Var.g(f6.WARNING, "Timed out waiting for event id submission: %s", v5Var.m);
                                        bufferedReader.close();
                                        return;
                                    }
                                } else {
                                    g1Var.g(f6.ERROR, "Item %d of has a different event id (%s) to the envelope header (%s)", Integer.valueOf(i4), n5Var.m, v5Var.m);
                                    bufferedReader.close();
                                }
                            }
                            bufferedReader.close();
                        } catch (Throwable th) {
                            try {
                                bufferedReader.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        g1Var.d(f6.ERROR, "Item failed to process.", th);
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
                objB = p0Var.b("sentry:typeCheckHint");
                if (!(objB instanceof io.sentry.hints.k) && !((io.sentry.hints.k) objB).e()) {
                    g1Var.g(f6.WARNING, "Envelope had a failed capture at item %d. No more items will be sent.", Integer.valueOf(i4));
                    return;
                }
                Object objB2 = p0Var.b("sentry:typeCheckHint");
                if (!io.sentry.android.core.d1.class.isInstance(p0Var.b("sentry:typeCheckHint")) && objB2 != null) {
                    io.sentry.android.core.d1 d1Var = (io.sentry.android.core.d1) objB2;
                    d1Var.f101o = new CountDownLatch(1);
                    d1Var.m = false;
                    d1Var.n = false;
                }
                it2 = it3;
                i3 = i4;
            } else {
                if (e6.Transaction.equals(e6Var)) {
                    try {
                        try {
                            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(t5Var.g()), charset));
                            try {
                                io.sentry.protocol.f0 f0Var = (io.sentry.protocol.f0) t1Var.b(bufferedReader2, io.sentry.protocol.f0.class);
                                if (f0Var == null) {
                                    g1Var.g(f6.ERROR, "Item %d of type %s returned null by the parser.", Integer.valueOf(i4), u5Var2.q);
                                } else if (wVar == null || wVar.equals(f0Var.m)) {
                                    c8 c8Var = n5Var.f215o;
                                    if (f0Var.n.j() != null) {
                                        f0Var.n.j().a(c(c8Var));
                                    }
                                    n1Var.y(f0Var, c8Var, p0Var, null);
                                    g1Var.g(f6.DEBUG, "Item %d is being captured.", Integer.valueOf(i4));
                                    if (!f(p0Var)) {
                                        g1Var.g(f6.WARNING, "Timed out waiting for event id submission: %s", f0Var.m);
                                        bufferedReader2.close();
                                        return;
                                    }
                                } else {
                                    g1Var.g(f6.ERROR, "Item %d of has a different event id (%s) to the envelope header (%s)", Integer.valueOf(i4), n5Var.m, f0Var.m);
                                    bufferedReader2.close();
                                }
                                bufferedReader2.close();
                            } catch (Throwable th5) {
                                try {
                                    bufferedReader2.close();
                                    throw th5;
                                } catch (Throwable th6) {
                                    th5.addSuppressed(th6);
                                    throw th5;
                                }
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            g1Var.d(f6.ERROR, "Item failed to process.", th);
                            objB = p0Var.b("sentry:typeCheckHint");
                            if (!(objB instanceof io.sentry.hints.k)) {
                            }
                            Object objB3 = p0Var.b("sentry:typeCheckHint");
                            if (!io.sentry.android.core.d1.class.isInstance(p0Var.b("sentry:typeCheckHint"))) {
                            }
                            it2 = it3;
                            i3 = i4;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                    }
                } else {
                    n1Var.h(new io.sentry.internal.debugmeta.c(wVar, n5Var.n, t5Var), p0Var);
                    g1Var.g(f6.DEBUG, "%s item %d is being captured.", e6Var.getItemType(), Integer.valueOf(i4));
                    if (!f(p0Var)) {
                        g1Var.g(f6.WARNING, "Timed out waiting for item type submission: %s", e6Var.getItemType());
                        return;
                    }
                }
                objB = p0Var.b("sentry:typeCheckHint");
                if (!(objB instanceof io.sentry.hints.k)) {
                }
                Object objB4 = p0Var.b("sentry:typeCheckHint");
                if (!io.sentry.android.core.d1.class.isInstance(p0Var.b("sentry:typeCheckHint"))) {
                }
                it2 = it3;
                i3 = i4;
            }
            it2 = it3;
            i3 = i4;
        }
    }

    public final boolean f(p0 p0Var) {
        Object objB = p0Var.b("sentry:typeCheckHint");
        if (objB instanceof io.sentry.hints.f) {
            return ((io.sentry.hints.f) objB).d();
        }
        io.sentry.util.b.q(io.sentry.hints.f.class, objB, this.h);
        return true;
    }
}
