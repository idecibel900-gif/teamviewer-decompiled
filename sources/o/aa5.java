package o;

/* JADX INFO: loaded from: classes.dex */
public final class aa5 extends hm2 {
    public static final aa5 d = new aa5(0, 3, 1);

    @Override // o.hm2
    public final void c(rr0 rr0Var, jv jvVar, k17 k17Var, au2 au2Var, sa5 sa5Var) {
        a65 a65Var;
        h17 h17Var = (h17) rr0Var.h(1);
        boolean z = false;
        px2 px2Var = (px2) rr0Var.h(0);
        em2 em2Var = (em2) rr0Var.h(2);
        k17 k17VarD = h17Var.d();
        if (sa5Var != null) {
            try {
                a65Var = new a65((byte) 5, (Object) sa5Var, (Object) k17Var, z);
            } catch (Throwable th) {
                k17VarD.e(false);
                throw th;
            }
        } else {
            a65Var = null;
        }
        if (!em2Var.p.u0()) {
            i01.a("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        em2Var.f725o.t0(jvVar, k17VarD, au2Var, a65Var);
        k17VarD.e(true);
        k17Var.d();
        px2Var.getClass();
        k17Var.z(h17Var, h17Var.a(px2Var));
        k17Var.j();
    }
}
