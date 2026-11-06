package io.sentry;

import android.app.ApplicationExitInfo;
import android.content.Context;
import android.database.CrossProcessCursor;
import io.sentry.android.core.SentryAndroidOptions;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import o.ep1;

/* JADX INFO: loaded from: classes.dex */
public final class o implements l1, io.sentry.android.core.o0 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public o(String str) {
        this.a = (byte) 6;
        w4 w4Var = w4.a;
        this.b = w4Var;
        this.c = str;
        this.d = new m7((Object) w4Var.l(), (byte) 0);
        d6.d().a("SQLite");
    }

    @Override // io.sentry.l1
    public List A() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.addAll(((l1) this.b).A());
        copyOnWriteArrayList.addAll(((l1) this.c).A());
        copyOnWriteArrayList.addAll(((l1) this.d).A());
        Collections.sort(copyOnWriteArrayList);
        return copyOnWriteArrayList;
    }

    @Override // io.sentry.l1
    public List B() {
        List listB = ((l1) this.b).B();
        List listB2 = ((l1) this.c).B();
        List listB3 = ((l1) this.d).B();
        boolean zIsEmpty = listB.isEmpty();
        boolean zIsEmpty2 = listB2.isEmpty();
        boolean zIsEmpty3 = listB3.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            return (List) P(listB, listB2, listB3);
        }
        if (zIsEmpty2 && zIsEmpty3) {
            return listB;
        }
        if (zIsEmpty && zIsEmpty3) {
            return listB2;
        }
        if (zIsEmpty && zIsEmpty2) {
            return listB3;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.addAll(listB);
        copyOnWriteArrayList.addAll(listB2);
        copyOnWriteArrayList.addAll(listB3);
        return copyOnWriteArrayList;
    }

    @Override // io.sentry.l1
    public void C(v5 v5Var) {
        ((l1) this.b).C(v5Var);
    }

    @Override // io.sentry.l1
    public io.sentry.protocol.e D() {
        l1 l1Var = (l1) this.b;
        return new m(l1Var.D(), ((l1) this.c).D(), ((l1) this.d).D(), l1Var.l().getDefaultScopeType());
    }

    @Override // io.sentry.android.core.o0
    public void E(long j) {
        io.sentry.android.core.cache.b.l((SentryAndroidOptions) this.b, Long.valueOf(j), "last_tombstone_report", "Tombstone");
    }

    @Override // io.sentry.l1
    public h4 F(m4 m4Var) {
        return Q(null).F(m4Var);
    }

    @Override // io.sentry.l1
    public String G() {
        String strG = ((l1) this.d).G();
        if (strG != null) {
            return strG;
        }
        String strG2 = ((l1) this.c).G();
        return strG2 != null ? strG2 : ((l1) this.b).G();
    }

    @Override // io.sentry.l1
    public void H(o4 o4Var) {
        Q(null).H(o4Var);
    }

    @Override // io.sentry.l1
    public void I(io.sentry.protocol.w wVar) {
        ((l1) this.b).I(wVar);
        ((l1) this.c).I(wVar);
        ((l1) this.d).I(wVar);
    }

    @Override // io.sentry.l1
    public void J(x1 x1Var) {
        Q(null).J(x1Var);
    }

    @Override // io.sentry.l1
    public List K() {
        List listK = ((l1) this.d).K();
        if (!listK.isEmpty()) {
            return listK;
        }
        List listK2 = ((l1) this.c).K();
        return !listK2.isEmpty() ? listK2 : ((l1) this.b).K();
    }

    @Override // io.sentry.l1
    public io.sentry.protocol.i0 L() {
        io.sentry.protocol.i0 i0VarL = ((l1) this.d).L();
        if (i0VarL != null) {
            return i0VarL;
        }
        io.sentry.protocol.i0 i0VarL2 = ((l1) this.c).L();
        return i0VarL2 != null ? i0VarL2 : ((l1) this.b).L();
    }

    @Override // io.sentry.l1
    public List M() {
        return io.sentry.util.b.C((CopyOnWriteArrayList) A());
    }

    @Override // io.sentry.l1
    public String N() {
        String strN = ((l1) this.d).N();
        if (strN != null) {
            return strN;
        }
        String strN2 = ((l1) this.c).N();
        return strN2 != null ? strN2 : ((l1) this.b).N();
    }

    @Override // io.sentry.l1
    public void O(h4 h4Var) {
        Q(null).O(h4Var);
    }

    public Object P(Object obj, Object obj2, Object obj3) {
        int i = n.a[((l1) this.b).l().getDefaultScopeType().ordinal()];
        if (i != 2) {
            return i != 3 ? obj3 : obj;
        }
        return obj2;
    }

    public l1 Q(t4 t4Var) {
        l1 l1Var = (l1) this.c;
        l1 l1Var2 = (l1) this.d;
        l1 l1Var3 = (l1) this.b;
        if (t4Var != null) {
            int i = n.a[t4Var.ordinal()];
            if (i == 1) {
                return l1Var2;
            }
            if (i == 2) {
                return l1Var;
            }
            if (i == 3) {
                return l1Var3;
            }
            if (i == 4) {
                return this;
            }
        }
        int i2 = n.a[l1Var3.l().getDefaultScopeType().ordinal()];
        if (i2 == 1) {
            return l1Var2;
        }
        if (i2 != 2) {
            return i2 != 3 ? l1Var2 : l1Var3;
        }
        return l1Var;
    }

    public String R() {
        Boolean bool = (Boolean) this.d;
        String str = (bool == null || !bool.booleanValue()) ? "00" : "01";
        return "00-" + ((io.sentry.protocol.w) this.b) + "-" + ((y7) this.c) + "-" + str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v5 S(long j, v5 v5Var, p0 p0Var) {
        SentryAndroidOptions sentryAndroidOptions;
        v5 v5Var2;
        boolean z;
        File[] fileArr;
        String name;
        io.sentry.android.core.m1 m1Var;
        io.sentry.android.core.m1 m1VarE;
        int i;
        String string;
        o oVar;
        String str;
        SentryAndroidOptions sentryAndroidOptions2 = (SentryAndroidOptions) this.b;
        io.sentry.android.core.n1 n1Var = (io.sentry.android.core.n1) this.c;
        ArrayList arrayList = (ArrayList) n1Var.p;
        SentryAndroidOptions sentryAndroidOptions3 = (SentryAndroidOptions) n1Var.f118o;
        int i2 = 0;
        if (n1Var.n) {
            sentryAndroidOptions = sentryAndroidOptions2;
            v5Var2 = null;
        } else {
            boolean z2 = true;
            n1Var.n = true;
            String outboxPath = sentryAndroidOptions3.getOutboxPath();
            if (outboxPath == null) {
                sentryAndroidOptions3.getLogger().g(f6.DEBUG, "Outbox path is null, skipping native event collection.", new Object[0]);
            } else {
                File[] fileArrListFiles = new File(outboxPath).listFiles();
                if (fileArrListFiles == null) {
                    sentryAndroidOptions3.getLogger().g(f6.DEBUG, "Outbox path is not a directory or an I/O error occurred: %s", outboxPath);
                } else if (fileArrListFiles.length == 0) {
                    sentryAndroidOptions3.getLogger().g(f6.DEBUG, "No envelope files found in outbox.", new Object[0]);
                } else {
                    sentryAndroidOptions3.getLogger().g(f6.DEBUG, "Scanning %d files in outbox for native events.", Integer.valueOf(fileArrListFiles.length));
                    int length = fileArrListFiles.length;
                    int i3 = 0;
                    while (i3 < length) {
                        File file = fileArrListFiles[i3];
                        if (!file.isFile() || (name = file.getName()) == null || name.startsWith("session") || name.startsWith("previous_session") || name.startsWith("startup_crash")) {
                            sentryAndroidOptions2 = sentryAndroidOptions2;
                            n1Var = n1Var;
                            z = z2;
                            fileArr = fileArrListFiles;
                        } else {
                            try {
                                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                                int i4 = i2;
                                do {
                                    try {
                                        i = bufferedInputStream.read();
                                        m1Var = null;
                                        if (i == -1) {
                                            if (i4 > 0) {
                                                break;
                                            }
                                            i4 = -1;
                                            break;
                                        }
                                        i4++;
                                    } catch (Throwable th) {
                                        th = th;
                                        sentryAndroidOptions2 = sentryAndroidOptions2;
                                        n1Var = n1Var;
                                        z = z2;
                                        fileArr = fileArrListFiles;
                                        m1Var = null;
                                    }
                                } while (i != 10);
                                if (i4 < 0) {
                                    try {
                                        bufferedInputStream.close();
                                        m1VarE = null;
                                        sentryAndroidOptions2 = sentryAndroidOptions2;
                                        n1Var = n1Var;
                                        z = z2;
                                        fileArr = fileArrListFiles;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        sentryAndroidOptions2 = sentryAndroidOptions2;
                                        n1Var = n1Var;
                                        z = z2;
                                        fileArr = fileArrListFiles;
                                        sentryAndroidOptions3.getLogger().b(f6.DEBUG, th, "Error extracting metadata from envelope file: %s", file.getAbsolutePath());
                                        m1VarE = m1Var;
                                    }
                                } else {
                                    boolean z3 = z2;
                                    fileArr = fileArrListFiles;
                                    long j2 = i4;
                                    while (true) {
                                        if (j2 < 209715200) {
                                            try {
                                                StringBuilder sb = new StringBuilder();
                                                z = z3;
                                                while (true) {
                                                    try {
                                                        int i5 = bufferedInputStream.read();
                                                        if (i5 == -1) {
                                                            if (sb.length() <= 0) {
                                                                string = null;
                                                                break;
                                                            }
                                                            string = sb.toString();
                                                            break;
                                                        }
                                                        if (i5 == 10) {
                                                            string = sb.toString();
                                                            break;
                                                        }
                                                        sb.append((char) i5);
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        sentryAndroidOptions2 = sentryAndroidOptions2;
                                                        n1Var = n1Var;
                                                    }
                                                }
                                                if (string != null && !string.isEmpty()) {
                                                    long length2 = j2 + ((long) (string.length() + 1));
                                                    s2 s2VarM = n1Var.m(string);
                                                    if (s2VarM != null) {
                                                        int i6 = s2VarM.a;
                                                        if ("event".equals((String) s2VarM.b)) {
                                                            m1VarE = n1Var.e(bufferedInputStream, i6, file);
                                                            if (m1VarE != null) {
                                                                try {
                                                                    bufferedInputStream.close();
                                                                    sentryAndroidOptions2 = sentryAndroidOptions2;
                                                                    n1Var = n1Var;
                                                                } catch (Throwable th4) {
                                                                    th = th4;
                                                                    sentryAndroidOptions2 = sentryAndroidOptions2;
                                                                    n1Var = n1Var;
                                                                    sentryAndroidOptions3.getLogger().b(f6.DEBUG, th, "Error extracting metadata from envelope file: %s", file.getAbsolutePath());
                                                                    m1VarE = m1Var;
                                                                }
                                                            }
                                                        } else {
                                                            io.sentry.android.core.n1.n(bufferedInputStream, i6);
                                                        }
                                                        try {
                                                            long j3 = length2 + ((long) i6);
                                                            int i7 = bufferedInputStream.read();
                                                            if (i7 != -1) {
                                                                j2 = j3 + 1;
                                                                if (i7 == 10) {
                                                                    sentryAndroidOptions2 = sentryAndroidOptions2;
                                                                    z3 = z;
                                                                    n1Var = n1Var;
                                                                }
                                                            }
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                            Throwable th6 = th;
                                                            try {
                                                                bufferedInputStream.close();
                                                            } catch (Throwable th7) {
                                                                th6.addSuppressed(th7);
                                                            }
                                                            throw th6;
                                                        }
                                                    }
                                                }
                                                sentryAndroidOptions2 = sentryAndroidOptions2;
                                                n1Var = n1Var;
                                            } catch (Throwable th8) {
                                                th = th8;
                                                n1Var = n1Var;
                                                z = z3;
                                                sentryAndroidOptions2 = sentryAndroidOptions2;
                                            }
                                        } else {
                                            n1Var = n1Var;
                                            z = z3;
                                            sentryAndroidOptions2 = sentryAndroidOptions2;
                                        }
                                        try {
                                            bufferedInputStream.close();
                                        } catch (Throwable th9) {
                                            th = th9;
                                            sentryAndroidOptions3.getLogger().b(f6.DEBUG, th, "Error extracting metadata from envelope file: %s", file.getAbsolutePath());
                                        }
                                        m1VarE = m1Var;
                                    }
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                sentryAndroidOptions2 = sentryAndroidOptions2;
                                n1Var = n1Var;
                                z = z2;
                                fileArr = fileArrListFiles;
                                m1Var = null;
                            }
                            if (m1VarE != null) {
                                arrayList.add(m1VarE);
                                sentryAndroidOptions3.getLogger().g(f6.DEBUG, "Found native event in outbox: %s (timestamp: %d)", file.getName(), Long.valueOf(m1VarE.b));
                            }
                        }
                        i3++;
                        sentryAndroidOptions2 = sentryAndroidOptions2;
                        fileArrListFiles = fileArr;
                        z2 = z;
                        n1Var = n1Var;
                        i2 = 0;
                    }
                    sentryAndroidOptions = sentryAndroidOptions2;
                    v5Var2 = null;
                    sentryAndroidOptions3.getLogger().g(f6.DEBUG, "Collected %d native events from outbox.", Integer.valueOf(arrayList.size()));
                }
            }
            sentryAndroidOptions = sentryAndroidOptions2;
            v5Var2 = null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                io.sentry.android.core.m1 m1Var2 = (io.sentry.android.core.m1) it.next();
                long jAbs = Math.abs(j - m1Var2.b);
                if (jAbs <= 5000) {
                    sentryAndroidOptions3.getLogger().g(f6.DEBUG, "Matched native event by timestamp (diff: %d ms)", Long.valueOf(jAbs));
                    arrayList.remove(m1Var2);
                    File file2 = m1Var2.a;
                    try {
                        BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file2));
                        try {
                            io.sentry.internal.debugmeta.c cVarA = sentryAndroidOptions3.getEnvelopeReader().a(bufferedInputStream2);
                            if (cVarA != null) {
                                Iterator it2 = ((Iterable) cVarA.f205o).iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        t5 t5Var = (t5) it2.next();
                                        if (e6.Event.equals(t5Var.a.q)) {
                                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(t5Var.g()), StandardCharsets.UTF_8));
                                            try {
                                                v5 v5Var3 = (v5) sentryAndroidOptions3.getSerializer().b(bufferedReader, v5.class);
                                                if (v5Var3 != null && "native".equals(v5Var3.t)) {
                                                    o oVar2 = new o(v5Var3, file2, cVarA, (byte) 4);
                                                    bufferedReader.close();
                                                    bufferedInputStream2.close();
                                                    oVar = oVar2;
                                                    break;
                                                }
                                                bufferedReader.close();
                                            } catch (Throwable th11) {
                                                try {
                                                    bufferedReader.close();
                                                    throw th11;
                                                } catch (Throwable th12) {
                                                    th11.addSuppressed(th12);
                                                    throw th11;
                                                }
                                            }
                                            try {
                                                bufferedInputStream2.close();
                                                throw th;
                                            } catch (Throwable th13) {
                                                th.addSuppressed(th13);
                                                throw th;
                                            }
                                        }
                                    }
                                }
                            }
                            bufferedInputStream2.close();
                        } catch (Throwable th14) {
                            bufferedInputStream2.close();
                            throw th14;
                        }
                    } catch (Throwable th15) {
                        sentryAndroidOptions3.getLogger().b(f6.DEBUG, th15, "Error loading envelope file: %s", file2.getAbsolutePath());
                    }
                }
            }
            oVar = v5Var2;
            break;
        }
        if (oVar == 0) {
            sentryAndroidOptions.getLogger().g(f6.DEBUG, "No matching native event found for tombstone.", new Object[0]);
            return v5Var2;
        }
        File file3 = (File) oVar.c;
        g1 logger = sentryAndroidOptions.getLogger();
        f6 f6Var = f6.DEBUG;
        logger.g(f6Var, "Found matching native event for tombstone, removing from outbox: %s", file3.getName());
        try {
            if (!file3.delete()) {
                sentryAndroidOptions3.getLogger().g(f6.WARNING, "Failed to delete native event file: %s", file3.getAbsolutePath());
                return v5Var2;
            }
            sentryAndroidOptions3.getLogger().g(f6Var, "Deleted native event file from outbox: %s", file3.getName());
            v5 v5Var4 = (v5) oVar.b;
            ArrayList arrayListD = v5Var.d();
            io.sentry.protocol.f fVar = v5Var.z;
            ArrayList arrayListE = v5Var.e();
            if (arrayListD != null && !arrayListD.isEmpty() && fVar != null && arrayListE != null) {
                io.sentry.protocol.o oVar3 = ((io.sentry.protocol.v) arrayListD.get(0)).r;
                if (oVar3 != null) {
                    oVar3.m = io.sentry.android.core.internal.tombstone.a.TOMBSTONE_MERGED.getValue();
                }
                io.sentry.protocol.p pVar = v5Var4.C;
                if (pVar == null || (str = pVar.n) == null || str.isEmpty()) {
                    v5Var4.C = v5Var.C;
                }
                v5Var4.h(arrayListD);
                v5Var4.z = fVar;
                v5Var4.E = new p2(arrayListE);
            }
            for (t5 t5Var2 : (Iterable) ((io.sentry.internal.debugmeta.c) oVar.d).f205o) {
                try {
                    u5 u5Var = t5Var2.a;
                    String str2 = u5Var.f268o;
                    if (u5Var.q == e6.Attachment && str2 != null) {
                        byte[] bArrG = t5Var2.g();
                        u5 u5Var2 = t5Var2.a;
                        try {
                            p0Var.b.add(new a(bArrG, str2, u5Var2.m, u5Var2.t));
                        } catch (Throwable th16) {
                            th = th16;
                            sentryAndroidOptions.getLogger().g(f6.DEBUG, "Failed to process envelope item: %s", th.getMessage());
                        }
                    }
                } catch (Throwable th17) {
                    th = th17;
                }
            }
            return v5Var4;
        } catch (Throwable th18) {
            sentryAndroidOptions3.getLogger().b(f6.ERROR, th18, "Error deleting native event file: %s", file3.getAbsolutePath());
        }
    }

    public Object T(String str, Function0 function0) throws Throwable {
        v1 v1VarK;
        m7 m7Var;
        w7 w7VarV;
        m7 m7Var2 = (m7) this.d;
        String str2 = (String) this.c;
        str.getClass();
        n1 n1Var = (n1) this.b;
        l5 l5VarA = n1Var.l().getDateProvider().a();
        try {
            Object objA = function0.a();
            if (objA instanceof CrossProcessCursor) {
                return new io.sentry.android.sqlite.c((CrossProcessCursor) objA, this, str);
            }
            v1 v1VarG = n1Var.g();
            v1VarK = v1VarG != null ? v1VarG.k("db.sql.query", str, l5VarA, c2.SENTRY) : null;
            if (v1VarK != null) {
                try {
                    w7VarV = v1VarK.v();
                } catch (Throwable th) {
                    th = th;
                    try {
                        v1 v1VarG2 = n1Var.g();
                        if (v1VarG2 != null) {
                            m7Var = m7Var2;
                            try {
                                v1VarK = v1VarG2.k("db.sql.query", str, l5VarA, c2.SENTRY);
                            } catch (Throwable th2) {
                                th = th2;
                                if (v1VarK != null) {
                                    boolean zC = n1Var.l().getThreadChecker().c();
                                    v1VarK.m(Boolean.valueOf(zC), "blocked_main_thread");
                                    if (zC) {
                                        v1VarK.m(m7Var.a(), "call_stack");
                                    }
                                    if (str2 != null) {
                                        v1VarK.m("sqlite", "db.system");
                                        v1VarK.m(str2, "db.name");
                                    } else {
                                        v1VarK.m("in-memory", "db.system");
                                    }
                                    v1VarK.l();
                                }
                                throw th;
                            }
                        } else {
                            m7Var = m7Var2;
                            v1VarK = null;
                        }
                        w7 w7VarV2 = v1VarK != null ? v1VarK.v() : null;
                        if (w7VarV2 != null) {
                            w7VarV2.u = "auto.db.sqlite";
                        }
                        if (v1VarK != null) {
                            v1VarK.a(a8.INTERNAL_ERROR);
                        }
                        if (v1VarK != null) {
                            v1VarK.g(th);
                        }
                        throw th;
                    } catch (Throwable th3) {
                        th = th3;
                        m7Var = m7Var2;
                    }
                }
            } else {
                w7VarV = null;
            }
            if (w7VarV != null) {
                w7VarV.u = "auto.db.sqlite";
            }
            if (v1VarK != null) {
                v1VarK.a(a8.OK);
            }
            if (v1VarK != null) {
                boolean zC2 = n1Var.l().getThreadChecker().c();
                v1VarK.m(Boolean.valueOf(zC2), "blocked_main_thread");
                if (zC2) {
                    v1VarK.m(m7Var2.a(), "call_stack");
                }
                if (str2 != null) {
                    v1VarK.m("sqlite", "db.system");
                    v1VarK.m(str2, "db.name");
                } else {
                    v1VarK.m("in-memory", "db.system");
                }
                v1VarK.l();
            }
            return objA;
        } catch (Throwable th4) {
            th = th4;
            v1VarK = null;
        }
    }

    @Override // io.sentry.android.core.o0
    public boolean a(ApplicationExitInfo applicationExitInfo) {
        return applicationExitInfo.getReason() == 5;
    }

    @Override // io.sentry.android.core.o0
    public Long b() {
        return io.sentry.android.core.cache.b.k((SentryAndroidOptions) this.b, "last_tombstone_report", "Tombstone");
    }

    @Override // io.sentry.android.core.o0
    public String c() {
        return "Tombstone";
    }

    @Override // io.sentry.l1
    public void clear() {
        Q(null).clear();
    }

    @Override // io.sentry.l1
    public l1 clone() {
        return new o((l1) this.b, ((l1) this.c).clone(), ((l1) this.d).clone(), (byte) 0);
    }

    @Override // io.sentry.android.core.o0
    public boolean d() {
        return ((SentryAndroidOptions) this.b).isReportHistoricalTombstones();
    }

    @Override // io.sentry.l1
    public void e(Throwable th, v7 v7Var, String str) {
        ((l1) this.b).e(th, v7Var, str);
    }

    @Override // io.sentry.l1
    public void f(h hVar, p0 p0Var) {
        Q(null).f(hVar, p0Var);
    }

    @Override // io.sentry.l1
    public v1 g() {
        v1 v1VarG = ((l1) this.d).g();
        if (v1VarG != null) {
            return v1VarG;
        }
        v1 v1VarG2 = ((l1) this.c).g();
        return v1VarG2 != null ? v1VarG2 : ((l1) this.b).g();
    }

    @Override // io.sentry.l1
    public Map getAttributes() {
        Map attributes = ((l1) this.b).getAttributes();
        Map attributes2 = ((l1) this.c).getAttributes();
        Map attributes3 = ((l1) this.d).getAttributes();
        boolean zIsEmpty = attributes.isEmpty();
        boolean zIsEmpty2 = attributes2.isEmpty();
        boolean zIsEmpty3 = attributes3.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            return (Map) P(attributes, attributes2, attributes3);
        }
        if (zIsEmpty2 && zIsEmpty3) {
            return attributes;
        }
        if (zIsEmpty && zIsEmpty3) {
            return attributes2;
        }
        if (zIsEmpty && zIsEmpty2) {
            return attributes3;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll(attributes);
        concurrentHashMap.putAll(attributes2);
        concurrentHashMap.putAll(attributes3);
        return concurrentHashMap;
    }

    @Override // io.sentry.l1
    public Map getExtras() {
        Map extras = ((l1) this.b).getExtras();
        Map extras2 = ((l1) this.c).getExtras();
        Map extras3 = ((l1) this.d).getExtras();
        boolean zIsEmpty = extras.isEmpty();
        boolean zIsEmpty2 = extras2.isEmpty();
        boolean zIsEmpty3 = extras3.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            return (Map) P(extras, extras2, extras3);
        }
        if (zIsEmpty2 && zIsEmpty3) {
            return extras;
        }
        if (zIsEmpty && zIsEmpty3) {
            return extras2;
        }
        if (zIsEmpty && zIsEmpty2) {
            return extras3;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll(extras);
        concurrentHashMap.putAll(extras2);
        concurrentHashMap.putAll(extras3);
        return concurrentHashMap;
    }

    @Override // io.sentry.l1
    public io.sentry.protocol.j h() {
        return r().h();
    }

    @Override // io.sentry.android.core.o0
    public o i(ApplicationExitInfo applicationExitInfo, boolean z) {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.b;
        try {
            boolean zIsAttachRawTombstone = sentryAndroidOptions.isAttachRawTombstone();
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            try {
                if (traceInputStream == null) {
                    sentryAndroidOptions.getLogger().g(f6.WARNING, "No tombstone InputStream available for ApplicationExitInfo from %s", DateTimeFormatter.ISO_INSTANT.format(Instant.ofEpochMilli(applicationExitInfo.getTimestamp())));
                    if (traceInputStream == null) {
                        return null;
                    }
                    traceInputStream.close();
                    return null;
                }
                byte[] bArrC = zIsAttachRawTombstone ? io.sentry.config.a.C(traceInputStream) : null;
                io.sentry.android.core.internal.tombstone.c cVar = new io.sentry.android.core.internal.tombstone.c(zIsAttachRawTombstone ? new ByteArrayInputStream(bArrC) : traceInputStream, sentryAndroidOptions.getInAppIncludes(), sentryAndroidOptions.getInAppExcludes(), ((Context) this.d).getApplicationInfo().nativeLibraryDir);
                try {
                    v5 v5VarE = cVar.e();
                    cVar.close();
                    traceInputStream.close();
                    long timestamp = applicationExitInfo.getTimestamp();
                    v5VarE.B = new Date(timestamp);
                    io.sentry.android.core.x2 x2Var = new io.sentry.android.core.x2(sentryAndroidOptions.getFlushTimeoutMillis(), sentryAndroidOptions.getLogger(), timestamp, z);
                    p0 p0VarG = io.sentry.util.b.g(x2Var);
                    if (bArrC != null) {
                        p0VarG.g = new a(bArrC, "tombstone.pb", "application/x-protobuf");
                    }
                    try {
                        v5 v5VarS = S(timestamp, v5VarE, p0VarG);
                        if (v5VarS != null) {
                            v5VarE = v5VarS;
                        }
                    } catch (Throwable th) {
                        sentryAndroidOptions.getLogger().g(f6.WARNING, "Failed to merge native event with tombstone, continuing without merge: %s", th.getMessage());
                    }
                    return new o(v5VarE, p0VarG, x2Var, (byte) 3);
                } catch (Throwable th2) {
                    try {
                        cVar.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            } catch (Throwable th4) {
                if (traceInputStream == null) {
                    throw th4;
                }
                try {
                    traceInputStream.close();
                    throw th4;
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                    throw th4;
                }
            }
        } catch (Throwable th6) {
            sentryAndroidOptions.getLogger().g(f6.WARNING, "Failed to parse tombstone from %s: %s", DateTimeFormatter.ISO_INSTANT.format(Instant.ofEpochMilli(applicationExitInfo.getTimestamp())), th6.getMessage());
            return null;
        }
        sentryAndroidOptions.getLogger().g(f6.WARNING, "Failed to parse tombstone from %s: %s", DateTimeFormatter.ISO_INSTANT.format(Instant.ofEpochMilli(applicationExitInfo.getTimestamp())), th6.getMessage());
        return null;
    }

    @Override // io.sentry.l1
    public io.sentry.protocol.w j() {
        io.sentry.protocol.w wVarJ = ((l1) this.d).j();
        io.sentry.protocol.w wVar = io.sentry.protocol.w.n;
        if (!wVar.equals(wVarJ)) {
            return wVarJ;
        }
        io.sentry.protocol.w wVarJ2 = ((l1) this.c).j();
        return !wVar.equals(wVarJ2) ? wVarJ2 : ((l1) this.b).j();
    }

    @Override // io.sentry.l1
    public void k(io.sentry.protocol.w wVar) {
        Q(null).k(wVar);
    }

    @Override // io.sentry.l1
    public g7 l() {
        return ((l1) this.b).l();
    }

    @Override // io.sentry.l1
    public x1 m() {
        x1 x1VarM = ((l1) this.d).m();
        if (x1VarM != null) {
            return x1VarM;
        }
        x1 x1VarM2 = ((l1) this.c).m();
        return x1VarM2 != null ? x1VarM2 : ((l1) this.b).m();
    }

    @Override // io.sentry.l1
    public u7 n() {
        return Q(null).n();
    }

    @Override // io.sentry.l1
    public io.sentry.internal.debugmeta.c o() {
        return Q(null).o();
    }

    @Override // io.sentry.l1
    public io.sentry.protocol.r p() {
        io.sentry.protocol.r rVarP = ((l1) this.d).p();
        if (rVarP != null) {
            return rVarP;
        }
        io.sentry.protocol.r rVarP2 = ((l1) this.c).p();
        return rVarP2 != null ? rVarP2 : ((l1) this.b).p();
    }

    @Override // io.sentry.l1
    public void q() {
        Q(null).q();
    }

    @Override // io.sentry.l1
    public io.sentry.featureflags.b r() {
        g7 g7VarL = ((l1) this.b).l();
        io.sentry.featureflags.b bVarR = ((l1) this.b).r();
        io.sentry.featureflags.b bVarR2 = ((l1) this.c).r();
        io.sentry.featureflags.b bVarR3 = ((l1) this.d).r();
        io.sentry.featureflags.c cVar = io.sentry.featureflags.c.m;
        int maxFeatureFlags = g7VarL.getMaxFeatureFlags();
        if (maxFeatureFlags > 0) {
            io.sentry.featureflags.a aVar = bVarR instanceof io.sentry.featureflags.a ? (io.sentry.featureflags.a) bVarR : null;
            io.sentry.featureflags.a aVar2 = bVarR2 instanceof io.sentry.featureflags.a ? (io.sentry.featureflags.a) bVarR2 : null;
            io.sentry.featureflags.a aVar3 = bVarR3 instanceof io.sentry.featureflags.a ? (io.sentry.featureflags.a) bVarR3 : null;
            List list = aVar == null ? null : aVar.m;
            List list2 = aVar2 == null ? null : aVar2.m;
            List list3 = aVar3 == null ? null : aVar3.m;
            int size = list == null ? 0 : list.size();
            int size2 = list2 == null ? 0 : list2.size();
            int size3 = list3 != null ? list3.size() : 0;
            if (size != 0 || size2 != 0 || size3 != 0) {
                int i = size - 1;
                int i2 = size2 - 1;
                int i3 = size3 - 1;
                if (list != null && i >= 0 && list.get(i) != null) {
                    h2.f();
                    return null;
                }
                if (list2 != null && i2 >= 0 && list2.get(i2) != null) {
                    h2.f();
                    return null;
                }
                if (list3 != null && i3 >= 0 && list3.get(i3) != null) {
                    h2.f();
                    return null;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(maxFeatureFlags);
                linkedHashMap.size();
                ArrayList arrayList = new ArrayList(linkedHashMap.values());
                Collections.reverse(arrayList);
                return new io.sentry.featureflags.a(maxFeatureFlags, Collections.unmodifiableList(arrayList));
            }
        }
        return cVar;
    }

    @Override // io.sentry.l1
    public u7 s() {
        u7 u7VarS = ((l1) this.d).s();
        if (u7VarS != null) {
            return u7VarS;
        }
        u7 u7VarS2 = ((l1) this.c).s();
        return u7VarS2 != null ? u7VarS2 : ((l1) this.b).s();
    }

    @Override // io.sentry.l1
    public Queue t() {
        Queue queueT = ((l1) this.b).t();
        Queue queueT2 = ((l1) this.c).t();
        l1 l1Var = (l1) this.d;
        Queue queueT3 = l1Var.t();
        boolean zIsEmpty = queueT.isEmpty();
        boolean zIsEmpty2 = queueT2.isEmpty();
        boolean zIsEmpty3 = queueT3.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            return (Queue) P(queueT, queueT2, queueT3);
        }
        if (zIsEmpty2 && zIsEmpty3) {
            return queueT;
        }
        if (zIsEmpty && zIsEmpty3) {
            return queueT2;
        }
        if (zIsEmpty && zIsEmpty2) {
            return queueT3;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(queueT);
        arrayList.addAll(queueT2);
        arrayList.addAll(queueT3);
        Collections.sort(arrayList);
        Queue queueA = p4.a(l1Var.l().getMaxBreadcrumbs());
        queueA.addAll(arrayList);
        return queueA;
    }

    public String toString() {
        switch (this.a) {
            case ep1.b /* 9 */:
                return "ReplayNetworkRequestOrResponse{size=" + ((Long) this.b) + ", body=" + ((io.sentry.util.network.b) this.c) + ", headers=" + ((LinkedHashMap) this.d) + '}';
            default:
                return super.toString();
        }
    }

    @Override // io.sentry.l1
    public f6 u() {
        f6 f6VarU = ((l1) this.d).u();
        if (f6VarU != null) {
            return f6VarU;
        }
        f6 f6VarU2 = ((l1) this.c).u();
        return f6VarU2 != null ? f6VarU2 : ((l1) this.b).u();
    }

    @Override // io.sentry.l1
    public h4 v() {
        return Q(null).v();
    }

    @Override // io.sentry.l1
    public u7 w(n4 n4Var) {
        return Q(null).w(n4Var);
    }

    @Override // io.sentry.l1
    public void x(String str) {
        Q(null).x(str);
    }

    @Override // io.sentry.l1
    public q1 y() {
        q1 q1VarY = ((l1) this.d).y();
        if (!(q1VarY instanceof n3)) {
            return q1VarY;
        }
        q1 q1VarY2 = ((l1) this.c).y();
        return !(q1VarY2 instanceof n3) ? q1VarY2 : ((l1) this.b).y();
    }

    @Override // io.sentry.l1
    public Map z() {
        Map mapZ = ((l1) this.b).z();
        Map mapZ2 = ((l1) this.c).z();
        Map mapZ3 = ((l1) this.d).z();
        boolean zIsEmpty = mapZ.isEmpty();
        boolean zIsEmpty2 = mapZ2.isEmpty();
        boolean zIsEmpty3 = mapZ3.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            return (Map) P(mapZ, mapZ2, mapZ3);
        }
        if (zIsEmpty2 && zIsEmpty3) {
            return mapZ;
        }
        if (zIsEmpty && zIsEmpty3) {
            return mapZ2;
        }
        if (zIsEmpty && zIsEmpty2) {
            return mapZ3;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll(mapZ);
        concurrentHashMap.putAll(mapZ2);
        concurrentHashMap.putAll(mapZ3);
        return concurrentHashMap;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m28clone() {
        switch (this.a) {
            case 0:
                return clone();
            default:
                return super.clone();
        }
    }

    public /* synthetic */ o(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public o(e8 e8Var, Double d) {
        this.a = (byte) 1;
        this.b = e8Var;
        this.c = d;
        this.d = Collections.EMPTY_MAP;
    }

    public o(Context context, SentryAndroidOptions sentryAndroidOptions) {
        this.a = (byte) 5;
        this.b = sentryAndroidOptions;
        this.c = new io.sentry.android.core.n1(sentryAndroidOptions);
        this.d = context;
    }
}
