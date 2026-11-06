package io.sentry;

/* JADX INFO: loaded from: classes.dex */
public final class d8 {
    public final g7 a;

    public d8(g7 g7Var) {
        this.a = g7Var;
    }

    public final h4 a(o oVar) {
        Double d = (Double) oVar.c;
        e8 e8Var = (e8) oVar.b;
        h4 h4Var = e8Var.p;
        if (h4Var != null) {
            return io.sentry.util.b.b(h4Var);
        }
        g7 g7Var = this.a;
        g7Var.getProfilesSampler();
        Double profilesSampleRate = g7Var.getProfilesSampleRate();
        Boolean boolValueOf = Boolean.valueOf(profilesSampleRate != null && profilesSampleRate.doubleValue() >= d.doubleValue());
        g7Var.getTracesSampler();
        h4 h4Var2 = e8Var.D;
        if (h4Var2 != null) {
            return io.sentry.util.b.b(h4Var2);
        }
        Double tracesSampleRate = g7Var.getTracesSampleRate();
        Double dValueOf = tracesSampleRate == null ? null : Double.valueOf(tracesSampleRate.doubleValue() / Math.pow(2.0d, g7Var.getBackpressureMonitor().a()));
        if (dValueOf != null) {
            return new h4(Boolean.valueOf(dValueOf.doubleValue() >= d.doubleValue()), dValueOf, d, boolValueOf, profilesSampleRate);
        }
        Boolean bool = Boolean.FALSE;
        return new h4(bool, (Double) null, d, bool, (Double) null);
    }

    public final boolean b(double d) {
        Double profileSessionSampleRate = this.a.getProfileSessionSampleRate();
        return profileSessionSampleRate != null && profileSessionSampleRate.doubleValue() >= d;
    }
}
