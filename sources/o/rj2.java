package o;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class rj2 implements fu0 {
    public final File a;
    public final o07 b;
    public final io.sentry.android.replay.a0 c;
    public final AtomicBoolean d;
    public final my4 e;

    public rj2(File file, o07 o07Var, io.sentry.android.replay.a0 a0Var) {
        o07Var.getClass();
        this.a = file;
        this.b = o07Var;
        this.c = a0Var;
        this.d = new AtomicBoolean(false);
        this.e = new my4();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0073  */
    /* JADX WARN: Code duplicated, block: B:53:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [o.gh1] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final Object a(gh1 gh1Var, jc1 jc1Var) throws Throwable {
        pj2 pj2Var;
        Throwable th;
        nj2 nj2Var;
        rj2 rj2Var;
        boolean z;
        ?? r8;
        if (jc1Var instanceof pj2) {
            pj2Var = (pj2) jc1Var;
            int i = pj2Var.r;
            if ((i & Integer.MIN_VALUE) != 0) {
                pj2Var.r = i - Integer.MIN_VALUE;
            } else {
                pj2Var = new pj2(this, jc1Var);
            }
        } else {
            pj2Var = new pj2(this, jc1Var);
        }
        ?? r9 = pj2Var.p;
        int i2 = pj2Var.r;
        try {
            if (i2 == 0) {
                ct1.a0(r9);
                if (this.d.get()) {
                    hk0.l("StorageConnection has already been disposed.");
                    return null;
                }
                boolean zF = this.e.f();
                nj2 nj2Var2 = new nj2(this.a);
                try {
                    Boolean boolValueOf = Boolean.valueOf(zF);
                    pj2Var.m = this;
                    pj2Var.n = nj2Var2;
                    pj2Var.f1738o = zF;
                    pj2Var.r = 1;
                    Object objD = gh1Var.d(nj2Var2, boolValueOf, pj2Var);
                    ne1 ne1Var = ne1.m;
                    if (objD == ne1Var) {
                        return ne1Var;
                    }
                    rj2Var = this;
                    z = zF ? 1 : 0;
                    r8 = objD;
                    nj2Var = nj2Var2;
                    nj2Var.close();
                    th = null;
                    if (th != null) {
                        throw th;
                    }
                    if (z) {
                        rj2Var.e.j(null);
                    }
                    return r8;
                } catch (Throwable th2) {
                    th = th2;
                    nj2Var = nj2Var2;
                    r9 = zF;
                    nj2Var.close();
                    throw th;
                }
            }
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = pj2Var.f1738o;
            nj2Var = pj2Var.n;
            rj2Var = pj2Var.m;
            try {
                ct1.a0(r9);
                r8 = r9;
                try {
                    nj2Var.close();
                    th = null;
                } catch (Throwable th3) {
                    th = th3;
                }
                if (th != null) {
                    if (z) {
                        rj2Var.e.j(null);
                    }
                    return r8;
                }
                try {
                    throw th;
                } catch (Throwable th4) {
                    th = th4;
                    r9 = z;
                    this = rj2Var;
                }
            } catch (Throwable th5) {
                r9 = z ? 1 : 0;
                this = rj2Var;
                th = th5;
                try {
                    nj2Var.close();
                    throw th;
                } catch (Throwable th6) {
                    ct1.q(th, th6);
                    throw th;
                }
            }
        } catch (Throwable th7) {
            th = th7;
        }
        if (r9 != 0) {
            this.e.j(null);
        }
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00ca A[Catch: all -> 0x0106, IOException -> 0x0108, TRY_ENTER, TryCatch #1 {IOException -> 0x0108, blocks: (B:43:0x00ca, B:45:0x00d0, B:48:0x00e5, B:49:0x0105, B:56:0x0111, B:63:0x011e, B:62:0x011b), top: B:75:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d0 A[Catch: all -> 0x0106, IOException -> 0x0108, TRY_LEAVE, TryCatch #1 {IOException -> 0x0108, blocks: (B:43:0x00ca, B:45:0x00d0, B:48:0x00e5, B:49:0x0105, B:56:0x0111, B:63:0x011e, B:62:0x011b), top: B:75:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0111 A[Catch: all -> 0x0106, IOException -> 0x0108, TRY_ENTER, TRY_LEAVE, TryCatch #1 {IOException -> 0x0108, blocks: (B:43:0x00ca, B:45:0x00d0, B:48:0x00e5, B:49:0x0105, B:56:0x0111, B:63:0x011e, B:62:0x011b), top: B:75:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int, o.ky4] */
    public final Object b(uh1 uh1Var, jc1 jc1Var) throws IOException {
        qj2 qj2Var;
        File file;
        ky4 ky4Var;
        hw2 hw2Var;
        yk2 yk2Var;
        Throwable th;
        yk2 yk2Var2;
        rj2 rj2Var;
        File file2;
        if (jc1Var instanceof qj2) {
            qj2Var = (qj2) jc1Var;
            int i = qj2Var.s;
            if ((i & Integer.MIN_VALUE) != 0) {
                qj2Var.s = i - Integer.MIN_VALUE;
            } else {
                qj2Var = new qj2(this, jc1Var);
            }
        } else {
            qj2Var = new qj2(this, jc1Var);
        }
        Object obj = qj2Var.q;
        ?? r2 = qj2Var.s;
        ne1 ne1Var = ne1.m;
        try {
            try {
                try {
                    try {
                        if (r2 == 0) {
                            ct1.a0(obj);
                            if (this.d.get()) {
                                hk0.l("StorageConnection has already been disposed.");
                                return null;
                            }
                            File file3 = this.a;
                            File parentFile = file3.getCanonicalFile().getParentFile();
                            if (parentFile != null) {
                                parentFile.mkdirs();
                                if (!parentFile.isDirectory()) {
                                    yq4.v(file3, "Unable to create parent directories of ");
                                    return null;
                                }
                            }
                            qj2Var.m = this;
                            qj2Var.n = uh1Var;
                            my4 my4Var = this.e;
                            qj2Var.f1836o = my4Var;
                            qj2Var.s = 1;
                            if (my4Var.e(qj2Var) != ne1Var) {
                                ky4Var = my4Var;
                                hw2Var = uh1Var;
                            }
                            return ne1Var;
                        }
                        if (r2 != 1) {
                            if (r2 != 2) {
                                hk0.l("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            yk2Var2 = qj2Var.p;
                            File file4 = (File) qj2Var.f1836o;
                            ky4Var = (ky4) qj2Var.n;
                            rj2Var = qj2Var.m;
                            try {
                                ct1.a0(obj);
                                file2 = file4;
                                try {
                                    yk2Var2.close();
                                    th = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                                if (th == null) {
                                    throw th;
                                }
                                if (file2.exists()) {
                                    try {
                                        Files.move(file2.toPath(), rj2Var.a.toPath(), StandardCopyOption.REPLACE_EXISTING);
                                    } catch (IOException unused) {
                                        throw new IOException("Unable to rename " + file2 + " to " + rj2Var.a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                    }
                                }
                                ky4Var.j(null);
                                return f88.a;
                            } catch (Throwable th3) {
                                th = th3;
                                try {
                                    yk2Var2.close();
                                } catch (Throwable th4) {
                                    ct1.q(th, th4);
                                }
                                throw th;
                            }
                        }
                        ky4 ky4Var2 = (ky4) qj2Var.f1836o;
                        hw2 hw2Var2 = (hw2) qj2Var.n;
                        rj2 rj2Var2 = qj2Var.m;
                        ct1.a0(obj);
                        ky4Var = ky4Var2;
                        this = rj2Var2;
                        hw2Var = hw2Var2;
                        qj2Var.m = this;
                        qj2Var.n = ky4Var;
                        qj2Var.f1836o = file;
                        qj2Var.p = yk2Var;
                        qj2Var.s = 2;
                        if (hw2Var.invoke(yk2Var, qj2Var) != ne1Var) {
                            rj2Var = this;
                            file2 = file;
                            yk2Var2 = yk2Var;
                            yk2Var2.close();
                            th = null;
                            if (th == null) {
                                throw th;
                            }
                            if (file2.exists()) {
                                Files.move(file2.toPath(), rj2Var.a.toPath(), StandardCopyOption.REPLACE_EXISTING);
                            }
                            ky4Var.j(null);
                            return f88.a;
                        }
                        return ne1Var;
                    } catch (Throwable th5) {
                        th = th5;
                        yk2Var2 = yk2Var;
                        yk2Var2.close();
                        throw th;
                    }
                    yk2Var = new yk2(file);
                } catch (IOException e) {
                    e = e;
                    if (file.exists()) {
                        file.delete();
                    }
                    throw e;
                }
                file = new File(this.a.getAbsolutePath() + ".tmp");
            } catch (IOException e2) {
                e = e2;
                file = uh1Var;
            }
        } catch (Throwable th6) {
            r2.j(null);
            throw th6;
        }
    }

    @Override // o.fu0
    public final void close() {
        this.d.set(true);
        this.c.a();
    }
}
