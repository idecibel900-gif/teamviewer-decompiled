package io.sentry;

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.Callable;
import o.fx3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q5 implements Callable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ t1 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ q5(a aVar, long j, t1 t1Var, g1 g1Var) {
        this.d = aVar;
        this.b = j;
        this.c = t1Var;
        this.e = g1Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws io.sentry.exception.c {
        byte b = this.a;
        t1 t1Var = this.c;
        Object obj = this.e;
        long j = this.b;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                a aVar = (a) obj2;
                g1 g1Var = (g1) obj;
                byte[] byteArray = aVar.a;
                String str = aVar.d;
                if (byteArray == null) {
                    io.sentry.protocol.j0 j0Var = aVar.b;
                    if (j0Var == null) {
                        Callable callable = aVar.c;
                        if (callable != null && (byteArray = (byte[]) callable.call()) != null) {
                            t5.a(str, byteArray.length, j);
                        }
                        throw new io.sentry.exception.c(fx3.g("Couldn't attach the attachment ", str, ".\nPlease check that either bytes, serializable, path or provider is set."));
                    }
                    Charset charset = io.sentry.util.f.a;
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, io.sentry.util.f.a));
                            try {
                                t1Var.a(j0Var, bufferedWriter);
                                byteArray = byteArrayOutputStream.toByteArray();
                                bufferedWriter.close();
                                byteArrayOutputStream.close();
                            } catch (Throwable th) {
                                try {
                                    bufferedWriter.close();
                                    break;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            try {
                                byteArrayOutputStream.close();
                                break;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (Throwable th5) {
                        g1Var.d(f6.ERROR, "Could not serialize serializable", th5);
                        byteArray = null;
                    }
                    if (byteArray != null) {
                        t5.a(str, byteArray.length, j);
                    }
                    throw new io.sentry.exception.c(fx3.g("Couldn't attach the attachment ", str, ".\nPlease check that either bytes, serializable, path or provider is set."));
                }
                t5.a(str, byteArray.length, j);
                return byteArray;
            default:
                File file = (File) obj2;
                f4 f4Var = (f4) obj;
                if (!file.exists()) {
                    throw new io.sentry.exception.c(fx3.g("Dropping profiling trace data, because the file '", file.getName(), "' doesn't exists"));
                }
                try {
                    String str2 = new String(io.sentry.vendor.a.b(io.sentry.util.b.t(file.getPath(), j)), "US-ASCII");
                    if (str2.isEmpty()) {
                        throw new io.sentry.exception.c("Profiling trace file is empty");
                    }
                    f4Var.N = str2;
                    try {
                        f4Var.x = (List) f4Var.n.call();
                        break;
                    } catch (Throwable unused) {
                    }
                    try {
                        try {
                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                            try {
                                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream2, t5.d), 512);
                                try {
                                    t1Var.a(f4Var, bufferedWriter2);
                                    byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                                    bufferedWriter2.close();
                                    byteArrayOutputStream2.close();
                                    file.delete();
                                    return byteArray2;
                                } catch (Throwable th6) {
                                    try {
                                        bufferedWriter2.close();
                                        break;
                                    } catch (Throwable th7) {
                                        th6.addSuppressed(th7);
                                    }
                                    throw th6;
                                }
                            } catch (Throwable th8) {
                                try {
                                    byteArrayOutputStream2.close();
                                    break;
                                } catch (Throwable th9) {
                                    th8.addSuppressed(th9);
                                }
                                throw th8;
                            }
                        } catch (Throwable th10) {
                            file.delete();
                            throw th10;
                        }
                    } catch (IOException e) {
                        throw new io.sentry.exception.c("Failed to serialize profiling trace data\n" + e.getMessage());
                    }
                } catch (UnsupportedEncodingException e2) {
                    throw new AssertionError(e2);
                }
        }
    }

    public /* synthetic */ q5(File file, long j, f4 f4Var, t1 t1Var) {
        this.d = file;
        this.b = j;
        this.e = f4Var;
        this.c = t1Var;
    }
}
