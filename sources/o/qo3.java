package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qo3 extends bx2 implements Function1 {
    public static final qo3 n = new qo3(1);

    @Override // o.bj0, o.rt3
    public final String getName() {
        return "getDefaultReportLevelForAnnotation";
    }

    @Override // o.bj0
    public final ku3 getOwner() {
        return w86.a.c(fo3.class, "compiler.common.jvm");
    }

    @Override // o.bj0
    public final String getSignature() {
        return "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;";
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ht2 ht2Var = (ht2) obj;
        ht2Var.getClass();
        ht2 ht2Var2 = fo3.a;
        z55.f.getClass();
        a65 a65Var = y55.b;
        vz3 vz3Var = new vz3(1, 7, 20);
        a65Var.getClass();
        za6 za6Var = (za6) ((h50) a65Var.f302o).invoke(ht2Var);
        if (za6Var != null) {
            return za6Var;
        }
        a65 a65Var2 = fo3.c;
        a65Var2.getClass();
        go3 go3Var = (go3) ((h50) a65Var2.f302o).invoke(ht2Var);
        if (go3Var == null) {
            return za6.IGNORE;
        }
        vz3 vz3Var2 = go3Var.b;
        return (vz3Var2 == null || vz3Var2.p - vz3Var.p > 0) ? go3Var.a : go3Var.c;
    }
}
