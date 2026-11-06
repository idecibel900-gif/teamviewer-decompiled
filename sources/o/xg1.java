package o;

/* JADX INFO: loaded from: classes2.dex */
public final class xg1 extends q54 {
    @Override // o.x35
    public final void D(lq1 lq1Var, h32 h32Var) {
        String strQ = Q();
        if (h32Var.p != 2 || strQ.contains("<![CDATA[")) {
            lq1Var.k(strQ);
            return;
        }
        o82 o82Var = this.m;
        if (o82Var != null && o82Var.p.f993o.equals("script")) {
            lq1Var.k("//<![CDATA[\n").k(strQ).k("\n//]]>");
            return;
        }
        o82 o82Var2 = this.m;
        if (o82Var2 == null || !o82Var2.p.f993o.equals("style")) {
            lq1Var.k("<![CDATA[").k(strQ).k("]]>");
        } else {
            lq1Var.k("/*<![CDATA[*/\n").k(strQ).k("\n/*]]>*/");
        }
    }

    @Override // o.x35
    /* JADX INFO: renamed from: clone */
    public final Object m() {
        return (xg1) super.m();
    }

    @Override // o.x35
    public final x35 m() {
        return (xg1) super.m();
    }

    @Override // o.x35
    public final String x() {
        return "#data";
    }
}
