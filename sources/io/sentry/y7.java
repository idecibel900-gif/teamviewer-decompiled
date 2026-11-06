package io.sentry;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class y7 implements t2 {
    public static final y7 n = new y7("00000000-0000-0000-0000-000000000000".replace("-", "").substring(0, 16));
    public volatile String m;

    public y7(String str) {
        Objects.requireNonNull(str, "value is required");
        this.m = str;
    }

    public final String a() {
        String str;
        String str2 = this.m;
        if (str2 != null) {
            return str2;
        }
        synchronized (this) {
            try {
                str = this.m;
                if (str == null) {
                    byte[] bArr = new byte[8];
                    io.sentry.util.p.a().b(bArr);
                    byte b = (byte) (bArr[6] & 15);
                    bArr[6] = b;
                    bArr[6] = (byte) (b | 64);
                    long j = 0;
                    for (int i = 0; i < 8; i++) {
                        j = (j << 8) | ((long) (bArr[i] & 255));
                    }
                    char[] cArr = new char[16];
                    io.sentry.util.s.a(cArr, j);
                    String str3 = new String(cArr);
                    this.m = str3;
                    str = str3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y7.class != obj.getClass()) {
            return false;
        }
        return a().equals(((y7) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    @Override // io.sentry.t2
    public final void serialize(x3 x3Var, g1 g1Var) {
        ((io.sentry.internal.debugmeta.c) x3Var).A(a());
    }

    public final String toString() {
        return a();
    }
}
