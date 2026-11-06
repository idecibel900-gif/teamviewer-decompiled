package io.sentry;

/* JADX INFO: loaded from: classes.dex */
public final class e8 extends w7 {
    public static final io.sentry.protocol.h0 E = io.sentry.protocol.h0.CUSTOM;
    public String B;
    public io.sentry.protocol.h0 C;
    public final h4 D;

    public e8(String str, io.sentry.protocol.h0 h0Var, String str2, h4 h4Var) {
        super(new io.sentry.protocol.w(), new y7(), str2, null);
        this.B = str;
        this.C = h0Var;
        a(h4Var);
        this.y = io.sentry.util.b.i(null, h4Var == null ? null : (Boolean) h4Var.a, h4Var == null ? null : (Double) h4Var.b, h4Var == null ? null : (Double) h4Var.c);
    }

    public static e8 b(h4 h4Var) {
        h4 h4Var2;
        Boolean bool = (Boolean) h4Var.a;
        d dVar = (d) h4Var.e;
        Double d = dVar.c;
        if (bool == null) {
            h4Var2 = null;
        } else {
            Double d2 = dVar.d;
            h4Var2 = new h4(bool, d, Double.valueOf(d2 == null ? 0.0d : d2.doubleValue()));
        }
        return new e8((io.sentry.protocol.w) h4Var.b, (y7) h4Var.c, (y7) h4Var.d, h4Var2, dVar);
    }

    public e8(io.sentry.protocol.w wVar, y7 y7Var, y7 y7Var2, h4 h4Var, d dVar) {
        super(wVar, y7Var, "default", y7Var2);
        this.B = "<unlabeled transaction>";
        this.D = h4Var;
        this.C = E;
        this.y = io.sentry.util.b.i(dVar, h4Var == null ? null : (Boolean) h4Var.a, h4Var == null ? null : (Double) h4Var.b, h4Var != null ? (Double) h4Var.c : null);
    }
}
