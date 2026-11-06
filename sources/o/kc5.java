package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class kc5 {
    public static final e11 a = new e11(new at4((byte) 13));

    public static final fs4 a(fs4 fs4Var) {
        return fs4Var.f(new lc5());
    }

    public static final li b(ux2 ux2Var) {
        ux2Var.W(282942128);
        mi miVar = (mi) ux2Var.j(a);
        if (miVar == null) {
            ux2Var.p(false);
            return null;
        }
        boolean zF = ux2Var.f(miVar);
        Object objK = ux2Var.K();
        if (zF || objK == e01.a) {
            Object liVar = new li(miVar.a, miVar.b, miVar.c, miVar.d);
            ux2Var.g0(liVar);
            objK = liVar;
        }
        li liVar2 = (li) objK;
        ux2Var.p(false);
        return liVar2;
    }
}
