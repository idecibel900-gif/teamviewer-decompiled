package o;

/* JADX INFO: loaded from: classes.dex */
public final class sm4 {
    public static qm4 a(Object obj, Object obj2) {
        qm4 qm4VarB = (qm4) obj;
        qm4 qm4Var = (qm4) obj2;
        if (!qm4Var.isEmpty()) {
            if (!qm4VarB.m) {
                qm4VarB = qm4VarB.b();
            }
            qm4VarB.a();
            if (!qm4Var.isEmpty()) {
                qm4VarB.putAll(qm4Var);
            }
        }
        return qm4VarB;
    }
}
