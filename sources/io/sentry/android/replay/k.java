package io.sentry.android.replay;

import io.sentry.f6;
import io.sentry.g7;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import o.fx;
import o.iq8;
import o.k76;
import o.kh;
import o.kh7;
import o.lv0;
import o.qs1;
import o.qv0;
import o.ub7;
import o.v51;
import o.vn0;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Closeable {
    public final g7 m;
    public final io.sentry.protocol.w n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AtomicBoolean f158o;
    public final io.sentry.util.a p;
    public final io.sentry.util.a q;
    public io.sentry.android.core.d r;
    public final kh7 s;
    public final ArrayList t;
    public final LinkedHashMap u;
    public final kh7 v;

    public k(g7 g7Var, io.sentry.protocol.w wVar) {
        g7Var.getClass();
        wVar.getClass();
        this.m = g7Var;
        this.n = wVar;
        this.f158o = new AtomicBoolean(false);
        this.p = new io.sentry.util.a();
        this.q = new io.sentry.util.a();
        this.s = new kh7(new i(this, (byte) 1));
        this.t = new ArrayList();
        this.u = new LinkedHashMap();
        this.v = new kh7(new i(this, (byte) 0));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AtomicBoolean atomicBoolean = this.f158o;
        try {
            io.sentry.android.core.d dVar = this.r;
            if (dVar != null) {
                dVar.l();
            }
            this.r = null;
        } finally {
            atomicBoolean.set(true);
        }
    }

    public final void e(File file, long j, String str) {
        l lVar = new l(file, j, str);
        io.sentry.util.a aVar = this.q;
        aVar.e();
        try {
            this.t.add(lVar);
            iq8.l(aVar, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                iq8.l(aVar, th);
                throw th2;
            }
        }
    }

    public final void j(File file) {
        g7 g7Var = this.m;
        try {
            if (file.delete()) {
                return;
            }
            g7Var.getLogger().g(f6.ERROR, "Failed to delete replay frame: %s", file.getAbsolutePath());
        } catch (Throwable th) {
            g7Var.getLogger().b(f6.ERROR, th, "Failed to delete replay frame: %s", file.getAbsolutePath());
        }
    }

    public final File q() {
        return (File) this.s.getValue();
    }

    public final void u(String str, String str2) {
        File file;
        File file2;
        kh7 kh7Var = this.v;
        LinkedHashMap linkedHashMap = this.u;
        io.sentry.util.a aVar = this.p;
        aVar.e();
        try {
            if (this.f158o.get()) {
                iq8.l(aVar, null);
                return;
            }
            File file3 = (File) kh7Var.getValue();
            if ((file3 == null || !file3.exists()) && (file = (File) kh7Var.getValue()) != null) {
                file.createNewFile();
            }
            if (linkedHashMap.isEmpty() && (file2 = (File) kh7Var.getValue()) != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2), vn0.a), 8192);
                try {
                    Iterator it = new v51(new fx(bufferedReader, (byte) 2)).iterator();
                    while (it.hasNext()) {
                        List listN0 = ub7.n0((String) it.next(), new String[]{"="}, 2);
                        linkedHashMap.put((String) listN0.get(0), (String) listN0.get(1));
                    }
                    bufferedReader.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        kh.n(bufferedReader, th);
                        throw th2;
                    }
                }
            }
            if (str2 == null) {
                linkedHashMap.remove(str);
            } else {
                linkedHashMap.put(str, str2);
            }
            File file4 = (File) kh7Var.getValue();
            if (file4 != null) {
                Set setEntrySet = linkedHashMap.entrySet();
                setEntrySet.getClass();
                String strT0 = lv0.t0(setEntrySet, "\n", null, null, c.p, 30);
                Charset charset = vn0.a;
                charset.getClass();
                FileOutputStream fileOutputStreamG = io.sentry.config.a.g(new FileOutputStream(file4), file4);
                try {
                    qs1.W(fileOutputStreamG, strT0, charset);
                    fileOutputStreamG.close();
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        kh.n(fileOutputStreamG, th3);
                        throw th4;
                    }
                }
            }
            iq8.l(aVar, null);
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                iq8.l(aVar, th5);
                throw th6;
            }
        }
    }

    public final String z(long j) {
        k76 k76Var = new k76();
        io.sentry.util.a aVar = this.q;
        aVar.e();
        try {
            qv0.d0(this.t, new j(j, this, k76Var, (byte) 0));
            iq8.l(aVar, null);
            return (String) k76Var.m;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                iq8.l(aVar, th);
                throw th2;
            }
        }
    }
}
