package o;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class sl3 {
    public static final Charset a = Charset.forName("UTF-8");
    public static final byte[] b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        if ((0 - 0) + 0 <= Integer.MAX_VALUE) {
            return;
        }
        try {
            throw qm3.e();
        } catch (qm3 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static void a(Object obj, String str) {
        if (obj != null) {
            return;
        }
        yq4.l(str);
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static ny2 c(Object obj, Object obj2) {
        ny2 ny2Var = (ny2) ((s1) obj);
        ey2 ey2Var = (ey2) ny2Var.f(5);
        ey2Var.d(ny2Var);
        s1 s1Var = (s1) obj2;
        if (ey2Var.m.getClass().isInstance(s1Var)) {
            ey2Var.d((ny2) s1Var);
            return ey2Var.b();
        }
        hk0.g("mergeFrom(MessageLite) can only merge messages of the same type.");
        return null;
    }
}
