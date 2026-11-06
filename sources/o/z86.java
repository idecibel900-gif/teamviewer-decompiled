package o;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class z86 {
    public static final qo1 a = qo1.c;

    public static void a(StringBuilder sb, xi0 xi0Var) {
        v14 v14VarG = pa8.g(xi0Var);
        v14 v14VarS = xi0Var.S();
        qo1 qo1Var = a;
        if (v14VarG != null) {
            sb.append(qo1Var.X(v14VarG.getType()));
            sb.append(".");
        }
        boolean z = (v14VarG == null || v14VarS == null) ? false : true;
        if (z) {
            sb.append("(");
        }
        if (v14VarS != null) {
            sb.append(qo1Var.X(v14VarS.getType()));
            sb.append(".");
        }
        if (z) {
            sb.append(")");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String b(xw2 xw2Var) {
        StringBuilder sb = new StringBuilder();
        sb.append("fun ");
        a(sb, xw2Var);
        sy4 name = ((gi1) xw2Var).getName();
        name.getClass();
        qo1 qo1Var = a;
        sb.append(qo1Var.N(name, true));
        List listJ = xw2Var.J();
        listJ.getClass();
        lv0.s0(listJ, sb, ", ", "(", ")", e24.C, 48);
        sb.append(": ");
        oz3 returnType = xw2Var.getReturnType();
        returnType.getClass();
        sb.append(qo1Var.X(returnType));
        return sb.toString();
    }

    public static String c(bu5 bu5Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(bu5Var.R() ? "var " : "val ");
        a(sb, bu5Var);
        sy4 name = bu5Var.getName();
        name.getClass();
        qo1 qo1Var = a;
        sb.append(qo1Var.N(name, true));
        sb.append(": ");
        oz3 type = bu5Var.getType();
        type.getClass();
        sb.append(qo1Var.X(type));
        return sb.toString();
    }
}
