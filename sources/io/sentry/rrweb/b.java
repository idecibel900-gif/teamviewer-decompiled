package io.sentry.rrweb;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public c m;
    public long n = System.currentTimeMillis();

    public b(c cVar) {
        this.m = cVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.n == bVar.n && this.m == bVar.m;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.m, Long.valueOf(this.n)});
    }
}
