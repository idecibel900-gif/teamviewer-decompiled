package io.sentry.protocol;

import io.sentry.g1;
import io.sentry.t2;
import io.sentry.x3;
import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public final class w implements t2 {
    public static final w n = new w("00000000-0000-0000-0000-000000000000".replace("-", ""));
    public volatile String m;

    public w(String str) {
        String str2 = str.equals("0000-0000") ? "00000000-0000-0000-0000-000000000000" : str;
        if (str2.length() == 32 || str2.length() == 36) {
            this.m = str2.length() == 36 ? str2.replace("-", "") : str2;
        } else {
            hk0.g("String representation of SentryId has either 32 (UUID no dashes) or 36 characters long (completed UUID). Received: ".concat(str));
            throw null;
        }
    }

    public final String a() {
        String strN;
        String str = this.m;
        if (str != null) {
            return str;
        }
        synchronized (this) {
            try {
                strN = this.m;
                if (strN == null) {
                    strN = io.sentry.config.a.n();
                    this.m = strN;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return strN;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w.class != obj.getClass()) {
            return false;
        }
        return a().equals(((w) obj).a());
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
