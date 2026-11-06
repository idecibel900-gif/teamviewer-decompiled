package io.sentry;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i7 extends h5 implements t2 {
    public File B;
    public int F;
    public Date H;
    public HashMap M;
    public io.sentry.protocol.w E = new io.sentry.protocol.w();
    public String C = "replay_event";
    public h7 D = h7.SESSION;
    public List J = new ArrayList();
    public List K = new ArrayList();
    public List L = new ArrayList();
    public List I = new ArrayList();
    public Date G = new Date();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i7.class != obj.getClass()) {
            return false;
        }
        i7 i7Var = (i7) obj;
        return this.F == i7Var.F && io.sentry.util.b.j(this.C, i7Var.C) && this.D == i7Var.D && io.sentry.util.b.j(this.E, i7Var.E) && io.sentry.util.b.j(this.I, i7Var.I) && io.sentry.util.b.j(this.J, i7Var.J) && io.sentry.util.b.j(this.K, i7Var.K) && io.sentry.util.b.j(this.L, i7Var.L);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.C, this.D, this.E, Integer.valueOf(this.F), this.I, this.J, this.K, this.L});
    }

    @Override // io.sentry.t2
    public final void serialize(x3 x3Var, g1 g1Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) x3Var;
        cVar.k();
        cVar.r("type");
        cVar.A(this.C);
        cVar.r("replay_type");
        cVar.x(g1Var, this.D);
        cVar.r("segment_id");
        cVar.w(this.F);
        cVar.r("timestamp");
        cVar.x(g1Var, this.G);
        if (this.E != null) {
            cVar.r("replay_id");
            cVar.x(g1Var, this.E);
        }
        if (this.H != null) {
            cVar.r("replay_start_timestamp");
            cVar.x(g1Var, this.H);
        }
        if (this.I != null) {
            cVar.r("urls");
            cVar.x(g1Var, this.I);
        }
        if (this.J != null) {
            cVar.r("error_ids");
            cVar.x(g1Var, this.J);
        }
        if (this.K != null) {
            cVar.r("trace_ids");
            cVar.x(g1Var, this.K);
        }
        if (this.L != null) {
            cVar.r("segment_names");
            cVar.x(g1Var, this.L);
        }
        io.sentry.config.a.D(this, cVar, g1Var);
        HashMap map = this.M;
        if (map != null) {
            for (String str : map.keySet()) {
                f.a(this.M, str, cVar, str, g1Var);
            }
        }
        cVar.m();
    }
}
