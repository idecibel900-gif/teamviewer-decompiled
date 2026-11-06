package io.sentry;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y4 {
    public final /* synthetic */ g1 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ d0 c;
    public final /* synthetic */ File d;

    public /* synthetic */ y4(g1 g1Var, String str, d0 d0Var, File file) {
        this.a = g1Var;
        this.b = str;
        this.c = d0Var;
        this.d = file;
    }

    public final void a() {
        File file = this.d;
        f6 f6Var = f6.DEBUG;
        String str = this.b;
        g1 g1Var = this.a;
        g1Var.g(f6Var, "Started processing cached files from %s", str);
        d0 d0Var = this.c;
        b8 b8Var = d0Var.d;
        g1 g1Var2 = d0Var.b;
        try {
            g1Var2.g(f6Var, "Processing dir. %s", file.getAbsolutePath());
            File[] fileArrListFiles = file.listFiles(new b0(d0Var, (byte) 0));
            if (fileArrListFiles == null) {
                g1Var2.g(f6.ERROR, "Cache dir %s is null or is not a directory.", file.getAbsolutePath());
            } else {
                g1Var2.g(f6Var, "Processing %d items from cache dir %s", Integer.valueOf(fileArrListFiles.length), file.getAbsolutePath());
                for (File file2 : fileArrListFiles) {
                    if (file2.isFile()) {
                        String absolutePath = file2.getAbsolutePath();
                        if (!b8Var.contains(absolutePath)) {
                            io.sentry.transport.p pVarC = d0Var.a.c();
                            if (pVarC != null && pVarC.j(q.All)) {
                                g1Var2.g(f6.INFO, "DirectoryProcessor, rate limiting active.", new Object[0]);
                                break;
                            } else {
                                g1Var2.g(f6.DEBUG, "Processing file: %s", absolutePath);
                                d0Var.b(file2, io.sentry.util.b.g(new c0(d0Var.c, d0Var.b, absolutePath, b8Var)));
                                Thread.sleep(100L);
                            }
                        } else {
                            g1Var2.g(f6.DEBUG, "File '%s' has already been processed so it will not be processed again.", absolutePath);
                        }
                    } else {
                        g1Var2.g(f6.DEBUG, "File %s is not a File.", file2.getAbsolutePath());
                    }
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            g1Var2.b(f6.INFO, e, "Thread interrupted during processing '%s'", file.getAbsolutePath());
        } catch (Throwable th) {
            g1Var2.b(f6.ERROR, th, "Failed processing '%s'", file.getAbsolutePath());
        }
        g1Var.g(f6.DEBUG, "Finished processing cached files from %s", str);
    }
}
