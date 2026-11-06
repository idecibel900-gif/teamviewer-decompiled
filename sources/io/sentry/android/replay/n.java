package io.sentry.android.replay;

import o.im3;

/* JADX INFO: loaded from: classes.dex */
public final class n {
    public final long a;
    public final w b;
    public final io.sentry.protocol.w c;
    public final io.sentry.android.replay.capture.d d;

    public n(long j, w wVar, io.sentry.protocol.w wVar2, io.sentry.android.replay.capture.d dVar) {
        wVar.getClass();
        wVar2.getClass();
        this.a = j;
        this.b = wVar;
        this.c = wVar2;
        this.d = dVar;
    }

    public static n a(n nVar, w wVar, io.sentry.protocol.w wVar2, io.sentry.android.replay.capture.d dVar, int i) {
        long j = nVar.a;
        if ((i & 2) != 0) {
            wVar = nVar.b;
        }
        w wVar3 = wVar;
        if ((i & 4) != 0) {
            wVar2 = nVar.c;
        }
        io.sentry.protocol.w wVar4 = wVar2;
        if ((i & 8) != 0) {
            dVar = nVar.d;
        }
        wVar3.getClass();
        wVar4.getClass();
        return new n(j, wVar3, wVar4, dVar);
    }

    public final boolean b() {
        w wVar = w.STARTED;
        w wVar2 = this.b;
        return wVar2.compareTo(wVar) >= 0 && wVar2.compareTo(w.STOPPED) < 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.a == nVar.a && this.b == nVar.b && im3.n(this.c, nVar.c) && im3.n(this.d, nVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31)) * 31;
        io.sentry.android.replay.capture.d dVar = this.d;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        return "ReplayState(generation=" + this.a + ", lifecycleState=" + this.b + ", replayId=" + this.c + ", captureStrategy=" + this.d + ')';
    }
}
