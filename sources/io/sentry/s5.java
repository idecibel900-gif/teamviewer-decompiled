package io.sentry;

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import o.fx3;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s5 implements Callable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ t1 b;
    public final /* synthetic */ c4 c;
    public final /* synthetic */ File d;
    public final /* synthetic */ Object e;

    public /* synthetic */ s5(t1 t1Var, c4 c4Var, AtomicReference atomicReference, File file) {
        this.b = t1Var;
        this.c = c4Var;
        this.e = atomicReference;
        this.d = file;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws io.sentry.exception.c {
        byte b = this.a;
        File file = this.d;
        Object obj = this.e;
        c4 c4Var = this.c;
        t1 t1Var = this.b;
        switch (b) {
            case 0:
                k1 k1Var = (k1) obj;
                if (file != null) {
                    if (!file.exists()) {
                        throw new io.sentry.exception.c(fx3.g("Dropping profile chunk, because the file '", file.getName(), "' doesn't exists"));
                    }
                    if ("java".equals(c4Var.r)) {
                        if (h3.a == k1Var) {
                            throw new io.sentry.exception.c("No ProfileConverter available, dropping chunk.");
                        }
                        try {
                            file.getAbsolutePath();
                            ((h3) k1Var).getClass();
                            c4Var.z = new io.sentry.protocol.profiling.a();
                        } catch (Exception e) {
                            throw new io.sentry.exception.c("Profile conversion failed", e);
                        }
                        break;
                    } else {
                        try {
                            String str = new String(io.sentry.vendor.a.b(io.sentry.util.b.t(file.getPath(), 52428800L)), "US-ASCII");
                            if (str.isEmpty()) {
                                throw new io.sentry.exception.c("Profiling trace file is empty");
                            }
                            c4Var.y = str;
                        } catch (UnsupportedEncodingException e2) {
                            throw new AssertionError(e2);
                        }
                    }
                }
                try {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, t5.d), 512);
                            try {
                                t1Var.a(c4Var, bufferedWriter);
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                bufferedWriter.close();
                                byteArrayOutputStream.close();
                                if (file != null) {
                                    file.delete();
                                }
                                return byteArray;
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
                    } catch (IOException e3) {
                        throw new io.sentry.exception.c("Failed to serialize profile chunk\n" + e3.getMessage());
                    }
                } catch (Throwable th5) {
                    if (file != null) {
                        file.delete();
                    }
                    throw th5;
                }
            default:
                AtomicReference atomicReference = (AtomicReference) obj;
                try {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream2, t5.d));
                        try {
                            t1Var.a(c4Var, bufferedWriter2);
                            bufferedWriter2.flush();
                            byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                            atomicReference.set(Integer.valueOf(byteArray2.length));
                            bufferedWriter2.close();
                            byteArrayOutputStream2.close();
                            try {
                                try {
                                    byte[] bArrT = io.sentry.util.b.t(file.getPath(), 52428800L);
                                    file.delete();
                                    byte[] bArr = new byte[byteArray2.length + bArrT.length];
                                    System.arraycopy(byteArray2, 0, bArr, 0, byteArray2.length);
                                    System.arraycopy(bArrT, 0, bArr, byteArray2.length, bArrT.length);
                                    return bArr;
                                } catch (IOException e4) {
                                    throw new io.sentry.exception.c("Failed to read perfetto trace file\n" + e4.getMessage());
                                }
                            } catch (Throwable th6) {
                                file.delete();
                                throw th6;
                            }
                        } catch (Throwable th7) {
                            try {
                                bufferedWriter2.close();
                                break;
                            } catch (Throwable th8) {
                                th7.addSuppressed(th8);
                            }
                            throw th7;
                        }
                    } catch (Throwable th9) {
                        try {
                            byteArrayOutputStream2.close();
                            break;
                        } catch (Throwable th10) {
                            th9.addSuppressed(th10);
                        }
                        throw th9;
                    }
                } catch (IOException e5) {
                    throw new io.sentry.exception.c(ua5.m("Failed to serialize perfetto profile chunk\n", e5.getMessage()));
                }
        }
    }

    public /* synthetic */ s5(File file, c4 c4Var, k1 k1Var, t1 t1Var) {
        this.d = file;
        this.c = c4Var;
        this.e = k1Var;
        this.b = t1Var;
    }
}
