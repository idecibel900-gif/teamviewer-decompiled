package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class at0 {
    public static final at0 b = new at0(0);
    public static final at0 c = new at0(1);
    public static final at0 d = new at0(2);
    public final /* synthetic */ byte a;

    public /* synthetic */ at0(byte b2) {
        this.a = b2;
    }

    public static String a(ys0 ys0Var) {
        String strB;
        sy4 name = ys0Var.getName();
        name.getClass();
        String strA = lq1.A(name);
        if (!(ys0Var instanceof d58)) {
            fi1 fi1VarI = ys0Var.i();
            fi1VarI.getClass();
            if (fi1VarI instanceof ns4) {
                strB = a((ys0) fi1VarI);
            } else if (fi1VarI instanceof ad5) {
                it2 it2VarI = ((bd5) ((ad5) fi1VarI)).q.i();
                it2VarI.getClass();
                strB = lq1.B(it2VarI.e());
            } else {
                strB = null;
            }
            if (strB != null && !strB.equals("")) {
                return strB + '.' + strA;
            }
        }
        return strA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [o.fi1, o.ys0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [o.fi1] */
    /* JADX WARN: Type inference failed for: r2v3, types: [o.fi1] */
    public final String b(ys0 ys0Var, qo1 qo1Var) {
        switch (this.a) {
            case 0:
                if (ys0Var instanceof d58) {
                    sy4 name = ((d58) ys0Var).getName();
                    name.getClass();
                    return qo1Var.N(name, false);
                }
                it2 it2VarG = zo1.g(ys0Var);
                it2VarG.getClass();
                return qo1Var.n(lq1.B(it2VarG.e()));
            case 1:
                if (ys0Var instanceof d58) {
                    sy4 name2 = ((d58) ys0Var).getName();
                    name2.getClass();
                    return qo1Var.N(name2, false);
                }
                ArrayList arrayList = new ArrayList();
                do {
                    arrayList.add(ys0Var.getName());
                    ys0Var = ys0Var.i();
                } while (ys0Var instanceof ns4);
                return lq1.B(new md6(arrayList));
            default:
                return a(ys0Var);
        }
    }
}
