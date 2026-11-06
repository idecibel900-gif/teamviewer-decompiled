package o;

/* JADX INFO: loaded from: classes2.dex */
public final class l32 extends q54 {
    public static final String q = "/doctypeInternalSubset";

    public l32(String str, String str2, String str3) {
        super(str);
        db8.o0(str2);
        db8.o0(str3);
        ly lyVarG = g();
        lyVarG.a(str, "name");
        lyVarG.a(str2, "publicId");
        lyVarG.a(str3, "systemId");
        if (S("publicId")) {
            g().a("PUBLIC", "pubSysKey");
        } else if (S("systemId")) {
            g().a("SYSTEM", "pubSysKey");
        }
    }

    @Override // o.x35
    public final void D(lq1 lq1Var, h32 h32Var) {
        if (h32Var.p != 1 || S("publicId") || S("systemId")) {
            lq1Var.k("<!DOCTYPE");
        } else {
            lq1Var.k("<!doctype");
        }
        if (S("name")) {
            lq1Var.k(" ").k(c("name"));
        }
        if (S("pubSysKey")) {
            lq1Var.k(" ").k(c("pubSysKey"));
        }
        if (S("publicId")) {
            lq1Var.k(" \"").k(c("publicId")).j('\"');
        }
        if (S("systemId")) {
            String strC = c("systemId");
            char c = strC.indexOf(34) >= 0 ? '\'' : '\"';
            lq1Var.j(' ').j(c).k(strC).j(c);
        }
        ly lyVarG = g();
        String str = q;
        if (lyVarG.l(str) != -1) {
            lq1Var.k(" [").k(c(str)).j(']');
        }
        lq1Var.j('>');
    }

    public final boolean S(String str) {
        return !lb7.f(c(str));
    }

    @Override // o.x35
    public final String x() {
        return "#doctype";
    }
}
