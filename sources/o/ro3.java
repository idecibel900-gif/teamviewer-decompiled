package o;

/* JADX INFO: loaded from: classes2.dex */
public final class ro3 {
    public static final ro3 c;
    public final rr3 a;
    public final boolean b;

    static {
        ht2 ht2Var = fo3.a;
        vz3 vz3Var = vz3.q;
        vz3Var.getClass();
        go3 go3Var = fo3.d;
        vz3 vz3Var2 = go3Var.b;
        za6 za6Var = (vz3Var2 == null || vz3Var2.p - vz3Var.p > 0) ? go3Var.a : go3Var.c;
        za6Var.getClass();
        rr3 rr3Var = new rr3(za6Var, za6Var == za6.WARN ? null : za6Var);
        qo3 qo3Var = qo3.n;
        c = new ro3(rr3Var);
    }

    public ro3(rr3 rr3Var) {
        qo3 qo3Var = qo3.n;
        this.a = rr3Var;
        this.b = rr3Var.d || qo3Var.invoke(fo3.a) == za6.IGNORE;
    }

    public final String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.a + ", getReportLevelForAnnotation=" + qo3.n + ')';
    }
}
