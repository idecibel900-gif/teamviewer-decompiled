package io.sentry;

import java.io.IOException;
import java.util.HashMap;
import o.e41;

/* JADX INFO: loaded from: classes.dex */
public final class h8 implements t2 {
    public final io.sentry.protocol.w m;
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f200o;
    public final String p;
    public HashMap q;

    public h8(io.sentry.protocol.w wVar, String str, String str2, String str3) {
        this.m = wVar;
        this.n = str;
        this.f200o = str2;
        this.p = str3;
    }

    @Override // io.sentry.t2
    public final void serialize(x3 x3Var, g1 g1Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) x3Var;
        cVar.k();
        cVar.r("event_id");
        this.m.serialize(cVar, g1Var);
        String str = this.n;
        if (str != null) {
            cVar.r("name");
            cVar.A(str);
        }
        String str2 = this.f200o;
        if (str2 != null) {
            cVar.r("email");
            cVar.A(str2);
        }
        String str3 = this.p;
        if (str3 != null) {
            cVar.r("comments");
            cVar.A(str3);
        }
        HashMap map = this.q;
        if (map != null) {
            for (String str4 : map.keySet()) {
                f.a(this.q, str4, cVar, str4, g1Var);
            }
        }
        cVar.m();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserFeedback{eventId=");
        sb.append(this.m);
        sb.append(", name='");
        sb.append(this.n);
        sb.append("', email='");
        sb.append(this.f200o);
        sb.append("', comments='");
        return e41.l(sb, this.p, "'}");
    }
}
