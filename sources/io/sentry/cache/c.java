package io.sentry.cache;

import io.sentry.android.core.s2;
import io.sentry.android.core.x2;
import io.sentry.e6;
import io.sentry.f6;
import io.sentry.g1;
import io.sentry.g7;
import io.sentry.g8;
import io.sentry.hints.i;
import io.sentry.hints.j;
import io.sentry.k5;
import io.sentry.m7;
import io.sentry.n5;
import io.sentry.p0;
import io.sentry.p7;
import io.sentry.t1;
import io.sentry.t5;
import io.sentry.t7;
import io.sentry.u5;
import io.sentry.u7;
import io.sentry.util.h;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class c implements d {
    public static final Charset u = Charset.forName("UTF-8");
    public final g7 m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final m7 f185o;
    public final int p;
    public final h n = new h(new p7(this, (byte) 12));
    public final WeakHashMap r = new WeakHashMap();
    public final io.sentry.util.a s = new io.sentry.util.a();
    public final io.sentry.util.a t = new io.sentry.util.a();
    public final CountDownLatch q = new CountDownLatch(1);

    public c(g7 g7Var, String str, int i) {
        this.m = g7Var;
        this.f185o = new m7(str);
        this.p = i;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0065  */
    /* JADX WARN: Code duplicated, block: B:198:0x0409  */
    /* JADX WARN: Code duplicated, block: B:41:0x00dd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v6 */
    @Override // io.sentry.cache.d
    public boolean F(io.sentry.internal.debugmeta.c cVar, p0 p0Var) {
        ?? r15;
        ?? r16;
        boolean z;
        Throwable th;
        boolean z2;
        Date date;
        boolean z3;
        ?? r13;
        String str;
        boolean z4;
        File[] fileArr;
        int i;
        h hVar;
        u7 u7VarF;
        Boolean bool;
        String str2;
        int i2;
        t5 t5VarE;
        u7 u7VarF2;
        io.sentry.util.b.v(cVar, "Envelope is required.");
        m7 m7Var = this.f185o;
        File file = (File) m7Var.n;
        io.sentry.util.b.f(file);
        String absolutePath = file.getAbsolutePath();
        File[] fileArrA = a();
        int length = fileArrA.length;
        h hVar2 = this.n;
        g7 g7Var = this.m;
        int i3 = this.p;
        if (length >= i3) {
            String str3 = "Cache folder if full (respecting maxSize). Rotating files";
            g7Var.getLogger().g(f6.WARNING, "Cache folder if full (respecting maxSize). Rotating files", new Object[0]);
            int i4 = (length - i3) + 1;
            if (fileArrA.length > 1) {
                Arrays.sort(fileArrA, new s2((byte) 2));
            }
            File[] fileArr2 = (File[]) Arrays.copyOfRange(fileArrA, i4, length);
            int i5 = 0;
            r16 = str3;
            while (i5 < i4) {
                File file2 = fileArrA[i5];
                io.sentry.internal.debugmeta.c cVarD = d(file2);
                String str4 = "File can't be deleted: %s";
                if (cVarD == null) {
                    fileArr = fileArrA;
                    i = i4;
                    hVar = hVar2;
                    g7Var = g7Var;
                    break;
                }
                Iterable iterable = (Iterable) cVarD.f205o;
                if (iterable.iterator().hasNext()) {
                    fileArr = fileArrA;
                    g7Var.getClientReportRecorder().c(io.sentry.clientreport.d.CACHE_OVERFLOW, cVarD);
                    Iterator it = iterable.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            u7VarF = null;
                            break;
                        }
                        t5 t5Var = (t5) it.next();
                        if (t5Var == null ? false : t5Var.a.q.equals(e6.Session)) {
                            u7VarF = f(t5Var);
                            break;
                        }
                    }
                    if (u7VarF != null) {
                        String str5 = u7VarF.q;
                        if (u7VarF.s.equals(t7.Ok) && str5 != null && (bool = u7VarF.r) != null && bool.booleanValue()) {
                            int length2 = fileArr2.length;
                            int i6 = 0;
                            while (true) {
                                if (i6 < length2) {
                                    i = i4;
                                    File file3 = fileArr2[i6];
                                    hVar = hVar2;
                                    io.sentry.internal.debugmeta.c cVarD2 = d(file3);
                                    if (cVarD2 != null) {
                                        Iterable iterable2 = (Iterable) cVarD2.f205o;
                                        if (iterable2.iterator().hasNext()) {
                                            Iterator it2 = iterable2.iterator();
                                            while (true) {
                                                if (!it2.hasNext()) {
                                                    str2 = str5;
                                                    length2 = length2;
                                                    g7Var = g7Var;
                                                    i2 = i6;
                                                    t5VarE = null;
                                                    break;
                                                }
                                                it2 = it2;
                                                t5 t5Var2 = (t5) it2.next();
                                                if ((t5Var2 == null ? false : t5Var2.a.q.equals(e6.Session)) && (u7VarF2 = f(t5Var2)) != null) {
                                                    String str6 = u7VarF2.q;
                                                    i2 = i6;
                                                    if (u7VarF2.s.equals(t7.Ok) && str6 != null) {
                                                        Boolean bool2 = u7VarF2.r;
                                                        if (bool2 != null && bool2.booleanValue()) {
                                                            g7Var.getLogger().g(f6.ERROR, "Session %s has 2 times the init flag.", str5);
                                                            break;
                                                        }
                                                        if (str5 != null && str5.equals(str6)) {
                                                            u7VarF2.r = Boolean.TRUE;
                                                            try {
                                                                t5VarE = t5.e((t1) hVar.a(), u7VarF2);
                                                                try {
                                                                    it2.remove();
                                                                    str2 = str5;
                                                                    break;
                                                                } catch (IOException e) {
                                                                    e = e;
                                                                    str2 = str5;
                                                                    g7Var.getLogger().b(f6.ERROR, e, "Failed to create new envelope item for the session %s", str2);
                                                                    t5VarE = t5VarE;
                                                                    break;
                                                                }
                                                            } catch (IOException e2) {
                                                                e = e2;
                                                                t5VarE = null;
                                                            }
                                                        }
                                                    }
                                                    i6 = i2;
                                                    str5 = str5;
                                                }
                                            }
                                            if (t5VarE != null) {
                                                ArrayList arrayList = new ArrayList();
                                                Iterator it3 = iterable2.iterator();
                                                while (it3.hasNext()) {
                                                    arrayList.add((t5) it3.next());
                                                }
                                                arrayList.add(t5VarE);
                                                io.sentry.internal.debugmeta.c cVar2 = new io.sentry.internal.debugmeta.c((n5) cVarD2.n, arrayList);
                                                long jLastModified = file3.lastModified();
                                                if (!file3.delete()) {
                                                    g7Var.getLogger().g(f6.WARNING, "File can't be deleted: %s", file3.getAbsolutePath());
                                                }
                                                try {
                                                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                                                    try {
                                                        ((t1) hVar.a()).e(cVar2, fileOutputStream);
                                                        file3.setLastModified(jLastModified);
                                                        fileOutputStream.close();
                                                        break;
                                                    } catch (Throwable th2) {
                                                        try {
                                                            fileOutputStream.close();
                                                        } catch (Throwable th3) {
                                                            th2.addSuppressed(th3);
                                                        }
                                                        throw th2;
                                                    }
                                                } catch (Throwable th4) {
                                                    g7Var.getLogger().d(f6.ERROR, "Failed to serialize the new envelope to the disk.", th4);
                                                    break;
                                                }
                                            }
                                        } else {
                                            str2 = str5;
                                            length2 = length2;
                                            g7Var = g7Var;
                                            i2 = i6;
                                        }
                                    } else {
                                        str2 = str5;
                                        length2 = length2;
                                        g7Var = g7Var;
                                        i2 = i6;
                                    }
                                    i6 = i2 + 1;
                                    i4 = i;
                                    hVar2 = hVar;
                                    length2 = length2;
                                    g7Var = g7Var;
                                    str5 = str2;
                                }
                            }
                        }
                    }
                } else {
                    fileArr = fileArrA;
                }
                i = i4;
                hVar = hVar2;
                g7Var = g7Var;
                break;
                if (!file2.delete()) {
                    g7Var.getLogger().g(f6.WARNING, "File can't be deleted: %s", file2.getAbsolutePath());
                }
                i5++;
                fileArrA = fileArr;
                i4 = i;
                hVar2 = hVar;
                g7Var = g7Var;
                r16 = str4;
            }
        }
        h hVar3 = hVar2;
        g7 g7Var2 = g7Var;
        File file4 = new File(absolutePath, "session.json");
        File file5 = new File(absolutePath, "previous_session.json");
        boolean zL = io.sentry.util.b.l(p0Var, i.class);
        io.sentry.util.a aVar = this.t;
        if (zL) {
            aVar.e();
            try {
                if (!file4.delete()) {
                    g7Var2.getLogger().g(f6.WARNING, "Current envelope doesn't exist.", new Object[0]);
                }
                aVar.close();
            } catch (Throwable th5) {
                try {
                    aVar.close();
                    throw th5;
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                    throw th5;
                }
            }
        }
        boolean zIsInstance = io.sentry.hints.a.class.isInstance(p0Var.b("sentry:typeCheckHint"));
        Charset charset = u;
        if (zIsInstance || io.sentry.hints.g.class.isInstance(p0Var.b("sentry:typeCheckHint"))) {
            Object objB = p0Var.b("sentry:typeCheckHint");
            File file6 = new File(((File) m7Var.n).getAbsolutePath(), "previous_session.json");
            if (file6.exists()) {
                g1 logger = g7Var2.getLogger();
                f6 f6Var = f6.WARNING;
                logger.g(f6Var, "Previous session is not ended, we'd need to end it.", new Object[0]);
                try {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file6), charset));
                        try {
                            u7 u7Var = (u7) ((t1) hVar3.a()).b(bufferedReader, u7.class);
                            if (u7Var != null) {
                                Date date2 = u7Var.m;
                                try {
                                    if (objB instanceof io.sentry.hints.a) {
                                        io.sentry.hints.a aVar2 = (io.sentry.hints.a) objB;
                                        Long lB = aVar2.b();
                                        if (lB != null) {
                                            date = new Date(lB.longValue());
                                            if (date.before(date2)) {
                                                g7Var2.getLogger().g(f6Var, "Abnormal exit happened before previous session start, not ending the session.", new Object[0]);
                                                bufferedReader.close();
                                                r15 = 1;
                                            }
                                        } else {
                                            date = null;
                                        }
                                        u7Var.c(t7.Abnormal, null, true, aVar2.e());
                                        z = true;
                                        u7Var.b(date);
                                        i(file6, u7Var);
                                        z2 = z;
                                    } else {
                                        if (objB instanceof io.sentry.hints.g) {
                                            date = new Date(((x2) ((io.sentry.hints.g) objB)).p);
                                            if (date.before(date2)) {
                                                g7Var2.getLogger().g(f6Var, "Native crash exit happened before previous session start, not ending the session.", new Object[0]);
                                                bufferedReader.close();
                                                r15 = 1;
                                            } else {
                                                z = true;
                                                z = true;
                                                try {
                                                    u7Var.c(t7.Crashed, null, true, null);
                                                } catch (Throwable th7) {
                                                    th = th7;
                                                    th = th;
                                                    r16 = z;
                                                    bufferedReader.close();
                                                    throw th;
                                                }
                                            }
                                            th = th;
                                            r16 = z;
                                            try {
                                                bufferedReader.close();
                                                throw th;
                                            } catch (Throwable th8) {
                                                th.addSuppressed(th8);
                                                throw th;
                                            }
                                        }
                                        z = true;
                                        date = null;
                                        u7Var.b(date);
                                        i(file6, u7Var);
                                        z2 = z;
                                    }
                                } catch (Throwable th9) {
                                    th = th9;
                                    r16 = 1;
                                    bufferedReader.close();
                                    throw th;
                                }
                            } else {
                                z2 = true;
                            }
                            bufferedReader.close();
                            r15 = z2;
                        } catch (Throwable th10) {
                            th = th10;
                            z = true;
                        }
                    } catch (Throwable th11) {
                        th = th11;
                        g7Var2.getLogger().d(f6.ERROR, "Error processing previous session.", th);
                        r15 = r16;
                    }
                } catch (Throwable th12) {
                    th = th12;
                    r16 = 1;
                    g7Var2.getLogger().d(f6.ERROR, "Error processing previous session.", th);
                    r15 = r16;
                }
            } else {
                r15 = 1;
                g7Var2.getLogger().g(f6.DEBUG, "No previous session file to end.", new Object[0]);
            }
        } else {
            r15 = 1;
        }
        if (j.class.isInstance(p0Var.b("sentry:typeCheckHint"))) {
            aVar.e();
            try {
                u7 u7VarG = g(cVar);
                if (u7VarG == null || (str = u7VarG.q) == null || !str.equals(null)) {
                    c(file4, file5);
                    if (u7VarG != null) {
                        i(file4, u7VarG);
                    }
                }
                aVar.close();
                if (new File(g7Var2.getCacheDirPath(), ".sentry-native/last_crash").exists()) {
                    z4 = false;
                } else {
                    File file7 = new File(g7Var2.getCacheDirPath(), "last_crash");
                    if (file7.exists()) {
                        z4 = false;
                        z4 = false;
                        g7Var2.getLogger().g(f6.INFO, "Crash marker file exists, crashedLastRun will return true.", new Object[0]);
                        if (!file7.delete()) {
                            g7Var2.getLogger().g(f6.ERROR, "Failed to delete the crash marker file. %s.", file7.getAbsolutePath());
                        }
                    } else {
                        z4 = false;
                    }
                }
                k5.c.a();
                this.q.countDown();
                z3 = z4;
            } catch (Throwable th13) {
                try {
                    aVar.close();
                    throw th13;
                } catch (Throwable th14) {
                    th13.addSuppressed(th14);
                    throw th13;
                }
            }
        } else {
            z3 = false;
        }
        File fileB = b(cVar);
        if (fileB.exists()) {
            g7Var2.getLogger().g(f6.WARNING, "Not adding Envelope to offline storage because it already exists: %s", fileB.getAbsolutePath());
            return r15;
        }
        g1 logger2 = g7Var2.getLogger();
        f6 f6Var2 = f6.DEBUG;
        logger2.g(f6Var2, "Adding Envelope to offline storage: %s", fileB.getAbsolutePath());
        if (fileB.exists()) {
            g7Var2.getLogger().g(f6Var2, "Overwriting envelope to offline storage: %s", fileB.getAbsolutePath());
            if (!fileB.delete()) {
                g7Var2.getLogger().g(f6.ERROR, "Failed to delete: %s", fileB.getAbsolutePath());
            }
        }
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(fileB);
            try {
                ((t1) hVar3.a()).e(cVar, fileOutputStream2);
                fileOutputStream2.close();
                r13 = r15;
                if (g8.class.isInstance(p0Var.b("sentry:typeCheckHint"))) {
                    try {
                        FileOutputStream fileOutputStream3 = new FileOutputStream(new File(g7Var2.getCacheDirPath(), "last_crash"));
                        try {
                            fileOutputStream3.write(io.sentry.vendor.a.f(new Date().getTime()).getBytes(charset));
                            fileOutputStream3.flush();
                            fileOutputStream3.close();
                        } catch (Throwable th15) {
                            try {
                                fileOutputStream3.close();
                                throw th15;
                            } catch (Throwable th16) {
                                th15.addSuppressed(th16);
                                throw th15;
                            }
                        }
                    } catch (Throwable th17) {
                        g7Var2.getLogger().d(f6.ERROR, "Error writing the crash marker file to the disk", th17);
                    }
                }
                return r13;
            } catch (Throwable th18) {
                try {
                    fileOutputStream2.close();
                    throw th18;
                } catch (Throwable th19) {
                    th18.addSuppressed(th19);
                    throw th18;
                }
            }
        } catch (Throwable th20) {
            g7Var2.getLogger().b(f6.ERROR, th20, "Error writing Envelope %s to offline storage", fileB.getAbsolutePath());
            r13 = z3;
        }
    }

    public final File[] a() {
        m7 m7Var = this.f185o;
        File file = (File) m7Var.n;
        if (file.isDirectory() && file.canWrite() && file.canRead()) {
            File[] fileArrListFiles = ((File) m7Var.n).listFiles(new b());
            if (fileArrListFiles != null) {
                return fileArrListFiles;
            }
        } else {
            this.m.getLogger().g(f6.ERROR, "The directory for caching files is inaccessible.: %s", file.getAbsolutePath());
        }
        return new File[0];
    }

    public final File b(io.sentry.internal.debugmeta.c cVar) {
        String str;
        WeakHashMap weakHashMap = this.r;
        io.sentry.util.a aVar = this.s;
        aVar.e();
        try {
            if (weakHashMap.containsKey(cVar)) {
                str = (String) weakHashMap.get(cVar);
            } else {
                String strConcat = io.sentry.config.a.n().concat(".envelope");
                weakHashMap.put(cVar, strConcat);
                str = strConcat;
            }
            File file = new File((File) this.f185o.n, str);
            aVar.close();
            return file;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void c(File file, File file2) {
        io.sentry.util.a aVar = this.t;
        aVar.e();
        try {
            if (!file.exists()) {
                aVar.close();
                return;
            }
            boolean zExists = file2.exists();
            g7 g7Var = this.m;
            if (zExists) {
                g7Var.getLogger().g(f6.DEBUG, "Previous session file already exists, deleting it.", new Object[0]);
                if (!file2.delete()) {
                    g7Var.getLogger().g(f6.WARNING, "Unable to delete previous session file: %s", file2);
                }
            }
            g7Var.getLogger().g(f6.INFO, "Moving current session to previous session.", new Object[0]);
            try {
                if (!file.renameTo(file2)) {
                    g7Var.getLogger().g(f6.WARNING, "Unable to move current session to previous session.", new Object[0]);
                }
            } catch (Throwable th) {
                g7Var.getLogger().d(f6.ERROR, "Error moving current session to previous session.", th);
            }
            aVar.close();
        } catch (Throwable th2) {
            try {
                aVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final io.sentry.internal.debugmeta.c d(File file) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                io.sentry.internal.debugmeta.c cVarC = ((t1) this.n.a()).c(bufferedInputStream);
                bufferedInputStream.close();
                return cVarC;
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            this.m.getLogger().d(f6.ERROR, "Failed to deserialize the envelope.", e);
            return null;
        }
    }

    public final u7 f(t5 t5Var) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(t5Var.g()), u));
            try {
                u7 u7Var = (u7) ((t1) this.n.a()).b(bufferedReader, u7.class);
                bufferedReader.close();
                return u7Var;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            this.m.getLogger().d(f6.ERROR, "Failed to deserialize the session.", th3);
            return null;
        }
    }

    public final u7 g(io.sentry.internal.debugmeta.c cVar) {
        Iterable iterable = (Iterable) cVar.f205o;
        boolean zHasNext = iterable.iterator().hasNext();
        g7 g7Var = this.m;
        if (!zHasNext) {
            g7Var.getLogger().g(f6.INFO, "Current envelope is empty.", new Object[0]);
            return null;
        }
        t5 t5Var = (t5) iterable.iterator().next();
        e6 e6Var = e6.Session;
        u5 u5Var = t5Var.a;
        e6 e6Var2 = u5Var.q;
        if (!e6Var.equals(u5Var.q)) {
            g7Var.getLogger().g(f6.INFO, "Current envelope has a different envelope type %s", e6Var2);
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(t5Var.g()), u));
            try {
                u7 u7Var = (u7) ((t1) this.n.a()).b(bufferedReader, u7.class);
                if (u7Var != null) {
                    bufferedReader.close();
                    return u7Var;
                }
                g7Var.getLogger().g(f6.ERROR, "Item of type %s returned null by the parser.", e6Var2);
                bufferedReader.close();
                return null;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            g7Var.getLogger().d(f6.ERROR, "Item failed to process.", th3);
            return null;
        }
        g7Var.getLogger().d(f6.ERROR, "Item failed to process.", th3);
        return null;
    }

    public final boolean h() {
        g7 g7Var = this.m;
        try {
            return this.q.await(g7Var.getSessionFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            g7Var.getLogger().g(f6.DEBUG, "Timed out waiting for previous session to flush.", new Object[0]);
            return false;
        }
    }

    public final void i(File file, u7 u7Var) {
        String str = u7Var.q;
        g7 g7Var = this.m;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, u));
                try {
                    g7Var.getLogger().g(f6.DEBUG, "Overwriting session to offline storage: %s", str);
                    ((t1) this.n.a()).a(u7Var, bufferedWriter);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } catch (Throwable th) {
                    try {
                        bufferedWriter.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            g7Var.getLogger().b(f6.ERROR, th5, "Error writing Session to offline storage: %s", str);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        g7 g7Var = this.m;
        File[] fileArrA = a();
        ArrayList arrayList = new ArrayList(fileArrA.length);
        for (File file : fileArrA) {
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    arrayList.add(((t1) this.n.a()).c(bufferedInputStream));
                    bufferedInputStream.close();
                } catch (Throwable th) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused) {
                g7Var.getLogger().g(f6.DEBUG, "Envelope file '%s' disappeared while converting all cached files to envelopes.", file.getAbsolutePath());
            } catch (IOException e) {
                g7Var.getLogger().d(f6.ERROR, "Error while reading cached envelope from file " + file.getAbsolutePath(), e);
            }
        }
        return arrayList.iterator();
    }

    @Override // io.sentry.cache.d
    public final void x0(io.sentry.internal.debugmeta.c cVar) {
        io.sentry.util.b.v(cVar, "Envelope is required.");
        File fileB = b(cVar);
        boolean zDelete = fileB.delete();
        g7 g7Var = this.m;
        if (zDelete) {
            g7Var.getLogger().g(f6.DEBUG, "Discarding envelope from cache: %s", fileB.getAbsolutePath());
        } else {
            g7Var.getLogger().g(f6.DEBUG, "Envelope was not cached or could not be deleted: %s", fileB.getAbsolutePath());
        }
    }
}
