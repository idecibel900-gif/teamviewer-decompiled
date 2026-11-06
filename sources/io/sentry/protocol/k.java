package io.sentry.protocol;

import io.sentry.g1;
import io.sentry.t2;
import io.sentry.x3;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class k implements t2 {
    public String m;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f234o;
    public w p;
    public w q;
    public String r;
    public AbstractMap s;

    public k(String str) {
        if (str.length() > 4096) {
            this.m = str.substring(0, 4096);
        } else {
            this.m = str;
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
        return io.sentry.util.b.j(this.m, kVar.m) && io.sentry.util.b.j(this.n, kVar.n) && io.sentry.util.b.j(this.f234o, kVar.f234o) && io.sentry.util.b.j(this.p, kVar.p) && io.sentry.util.b.j(this.q, kVar.q) && io.sentry.util.b.j(this.r, kVar.r) && io.sentry.util.b.j(this.s, kVar.s);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.m, this.n, this.f234o, this.p, this.q, this.r, this.s});
    }

    @Override // io.sentry.t2
    public final void serialize(x3 x3Var, g1 g1Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) x3Var;
        cVar.k();
        cVar.r("message");
        cVar.A(this.m);
        if (this.n != null) {
            cVar.r("contact_email");
            cVar.A(this.n);
        }
        if (this.f234o != null) {
            cVar.r("name");
            cVar.A(this.f234o);
        }
        if (this.p != null) {
            cVar.r("associated_event_id");
            this.p.serialize(cVar, g1Var);
        }
        if (this.q != null) {
            cVar.r("replay_id");
            this.q.serialize(cVar, g1Var);
        }
        if (this.r != null) {
            cVar.r("url");
            cVar.A(this.r);
        }
        AbstractMap abstractMap = this.s;
        if (abstractMap != null) {
            for (String str : abstractMap.keySet()) {
                Object obj = this.s.get(str);
                cVar.r(str);
                cVar.x(g1Var, obj);
            }
        }
        cVar.m();
    }

    public final String toString() {
        return "Feedback{message='" + this.m + "', contactEmail='" + this.n + "', name='" + this.f234o + "', associatedEventId=" + this.p + ", replayId=" + this.q + ", url='" + this.r + "', unknown=" + this.s + '}';
    }
}
