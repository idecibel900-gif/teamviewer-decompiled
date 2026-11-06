package io.sentry.android.replay;

import io.sentry.h7;
import java.util.Date;
import java.util.List;
import o.fx3;
import o.im3;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public final c0 a;
    public final k b;
    public final Date c;
    public final int d;
    public final long e;
    public final h7 f;
    public final String g;
    public final List h;

    public f(c0 c0Var, k kVar, Date date, int i, long j, h7 h7Var, String str, List list) {
        this.a = c0Var;
        this.b = kVar;
        this.c = date;
        this.d = i;
        this.e = j;
        this.f = h7Var;
        this.g = str;
        this.h = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.a.equals(fVar.a) && this.b == fVar.b && this.c.equals(fVar.c) && this.d == fVar.d && this.e == fVar.e && this.f == fVar.f && im3.n(this.g, fVar.g) && this.h.equals(fVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + fx3.c(fx3.a(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31), 31, this.e)) * 31;
        String str = this.g;
        return this.h.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "LastSegmentData(recorderConfig=" + this.a + ", cache=" + this.b + ", timestamp=" + this.c + ", id=" + this.d + ", duration=" + this.e + ", replayType=" + this.f + ", screenAtStart=" + this.g + ", events=" + this.h + ')';
    }
}
