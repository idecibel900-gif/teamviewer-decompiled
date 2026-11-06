package o;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public abstract class p06 {
    public static final io.sentry.c a = new io.sentry.c(5);

    public static byte[] a(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) a.get()).nextBytes(bArr);
        return bArr;
    }
}
