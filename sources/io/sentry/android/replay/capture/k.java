package io.sentry.android.replay.capture;

import io.sentry.i7;
import io.sentry.l4;
import io.sentry.n1;
import io.sentry.p0;

/* JADX INFO: loaded from: classes.dex */
public final class k extends m {
    public final i7 a;
    public final l4 b;

    public k(i7 i7Var, l4 l4Var) {
        this.a = i7Var;
        this.b = l4Var;
    }

    public static void a(k kVar, n1 n1Var) {
        p0 p0Var = new p0();
        if (n1Var != null) {
            i7 i7Var = kVar.a;
            p0Var.h = kVar.b;
            n1Var.t(i7Var, p0Var);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.a.equals(kVar.a) && this.b.equals(kVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Created(replay=" + this.a + ", recording=" + this.b + ')';
    }
}
