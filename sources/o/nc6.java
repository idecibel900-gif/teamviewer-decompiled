package o;

import java.io.Closeable;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nc6 implements Closeable {
    public static final mc6 m;

    static {
        ai0 ai0Var = ai0.p;
        ai0Var.getClass();
        bf0 bf0Var = new bf0();
        bf0Var.R0(ai0Var);
        m = new mc6(null, ai0Var.m.length, bf0Var);
    }

    public of0 E0() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        po8.b(E0());
    }

    public final byte[] e() throws Throwable {
        mc6 mc6Var = (mc6) this;
        long j = mc6Var.f1460o;
        byte[] bArrK0 = null;
        if (j > 2147483647L) {
            gk0.l(e41.g("Cannot buffer entire body for content length: ", j));
            return null;
        }
        bf0 bf0Var = mc6Var.p;
        try {
            bArrK0 = bf0Var.k0(bf0Var.n);
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        if (th != null) {
            throw th;
        }
        int length = bArrK0.length;
        if (j == -1 || j == length) {
            return bArrK0;
        }
        throw new IOException("Content-Length (" + j + ") and stream length (" + length + ") disagree");
    }

    public abstract long j();

    public abstract jo4 q();

    /* JADX WARN: Code duplicated, block: B:7:0x0013 A[Catch: all -> 0x0026, TryCatch #1 {all -> 0x0026, blocks: (B:3:0x0005, B:5:0x000b, B:8:0x0015, B:7:0x0013), top: B:24:0x0005 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v8 */
    public final String u() {
        Charset charsetA;
        of0 of0VarE0 = E0();
        String th = null;
        try {
            jo4 jo4VarQ = q();
            if (jo4VarQ != null) {
                e96 e96Var = jo4.e;
                charsetA = jo4VarQ.a(null);
                if (charsetA == null) {
                    charsetA = vn0.a;
                }
            } else {
                charsetA = vn0.a;
            }
            String strA0 = of0VarE0.a0(ro8.f(of0VarE0, charsetA));
            try {
                of0VarE0.close();
            } catch (Throwable th2) {
                th = th2;
            }
            String str = th;
            th = strA0;
            th = str;
        } catch (Throwable th3) {
            th = th3;
            if (of0VarE0 != null) {
                try {
                    of0VarE0.close();
                } catch (Throwable th4) {
                    ct1.q(th, th4);
                }
            }
        }
        if (th == 0) {
            return th;
        }
        throw th;
    }
}
