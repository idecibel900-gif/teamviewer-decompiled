package io.sentry.android.replay;

import java.io.File;
import o.fx3;
import o.im3;

/* JADX INFO: loaded from: classes.dex */
public final class l {
    public final File a;
    public final long b;
    public final String c;

    public l(File file, long j, String str) {
        this.a = file;
        this.b = j;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.a.equals(lVar.a) && this.b == lVar.b && im3.n(this.c, lVar.c);
    }

    public final int hashCode() {
        int iC = fx3.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ReplayFrame(screenshot=" + this.a + ", timestamp=" + this.b + ", screen=" + this.c + ')';
    }
}
