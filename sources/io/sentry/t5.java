package io.sentry;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import o.fx3;

/* JADX INFO: loaded from: classes.dex */
public final class t5 {
    public static final Charset d = Charset.forName("UTF-8");
    public final u5 a;
    public final Callable b;
    public byte[] c;

    public t5(u5 u5Var, byte[] bArr) {
        this.a = u5Var;
        this.c = bArr;
        this.b = null;
    }

    public static void a(String str, long j, long j2) throws io.sentry.exception.c {
        if (j > j2) {
            throw new io.sentry.exception.c(String.format("Dropping attachment with filename '%s', because the size of the passed bytes with %d bytes is bigger than the maximum allowed attachment size of %d bytes.", str, Long.valueOf(j), Long.valueOf(j2)));
        }
    }

    public static t5 b(t1 t1Var, io.sentry.clientreport.b bVar) {
        io.sentry.util.b.v(t1Var, "ISerializer is required.");
        io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(new o5(t1Var, bVar, (byte) 4));
        return new t5(new u5(e6.resolve(bVar), new p5(cVar, (byte) 11), "application/json", null, null), new p5(cVar, (byte) 12));
    }

    public static t5 c(c4 c4Var, t1 t1Var) throws io.sentry.exception.c {
        File file = c4Var.x;
        if (file == null || !file.exists()) {
            throw new io.sentry.exception.c(fx3.g("Dropping perfetto profile chunk, because the trace file '", file != null ? file.getName() : "null", "' doesn't exist"));
        }
        AtomicReference atomicReference = new AtomicReference(null);
        io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(new s5(t1Var, c4Var, atomicReference, file));
        return new t5(new u5(e6.ProfileChunk, -1, new p5(cVar, (byte) 18), c4Var.w, file.getName(), null, c4Var.r, null, new r0(atomicReference, (byte) 1)), new p5(cVar, (byte) 19));
    }

    public static t5 d(c4 c4Var, t1 t1Var, k1 k1Var) {
        File file = c4Var.x;
        io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(new s5(file, c4Var, k1Var, t1Var));
        return new t5(new u5(e6.ProfileChunk, new p5(cVar, (byte) 16), "application-json", file != null ? file.getName() : null, null, c4Var.r, null), new p5(cVar, (byte) 17));
    }

    public static t5 e(t1 t1Var, u7 u7Var) {
        io.sentry.util.b.v(t1Var, "ISerializer is required.");
        io.sentry.util.b.v(u7Var, "Session is required.");
        io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(new o5(t1Var, u7Var, (byte) 1));
        return new t5(new u5(e6.Session, new p5(cVar, (byte) 0), "application/json", null, null), new p5(cVar, (byte) 1));
    }

    public static byte[] i(LinkedHashMap linkedHashMap) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write((byte) (linkedHashMap.size() | 128));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                byte[] bytes = ((String) entry.getKey()).getBytes(d);
                int length = bytes.length;
                byteArrayOutputStream.write(-39);
                byteArrayOutputStream.write((byte) length);
                byteArrayOutputStream.write(bytes);
                byte[] bArr = (byte[]) entry.getValue();
                int length2 = bArr.length;
                byteArrayOutputStream.write(-58);
                byteArrayOutputStream.write(ByteBuffer.allocate(4).order(ByteOrder.BIG_ENDIAN).putInt(length2).array());
                byteArrayOutputStream.write(bArr);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final io.sentry.clientreport.b f(t1 t1Var) throws IOException {
        if (this.a.q != e6.ClientReport) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(g()), d));
        try {
            io.sentry.clientreport.b bVar = (io.sentry.clientreport.b) t1Var.b(bufferedReader, io.sentry.clientreport.b.class);
            bufferedReader.close();
            return bVar;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final byte[] g() {
        Callable callable;
        byte[] bArr = this.c;
        if (bArr != null || (callable = this.b) == null) {
            return bArr;
        }
        byte[] bArr2 = (byte[]) callable.call();
        this.c = bArr2;
        return bArr2;
    }

    public final io.sentry.protocol.f0 h(t1 t1Var) throws IOException {
        if (this.a.q != e6.Transaction) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(g()), d));
        try {
            io.sentry.protocol.f0 f0Var = (io.sentry.protocol.f0) t1Var.b(bufferedReader, io.sentry.protocol.f0.class);
            bufferedReader.close();
            return f0Var;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public t5(u5 u5Var, Callable callable) {
        this.a = u5Var;
        this.b = callable;
        this.c = null;
    }
}
