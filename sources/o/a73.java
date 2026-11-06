package o;

/* JADX INFO: loaded from: classes2.dex */
public final enum a73 extends r73 {
    public a73() {
        super("InSelectInTable", 15);
    }

    @Override // o.r73
    public final boolean d(sj5 sj5Var, t63 t63Var) {
        String[] strArr = vn4.a0;
        if (sj5Var.e() && lb7.d(((ew7) sj5Var).m(), strArr)) {
            t63Var.C(this);
            t63Var.T("select");
            t63Var.b0();
            return t63Var.n(sj5Var);
        }
        if (sj5Var.d()) {
            dw7 dw7Var = (dw7) sj5Var;
            if (lb7.d(dw7Var.m(), strArr)) {
                t63Var.C(this);
                if (!t63Var.H(8, dw7Var.m())) {
                    return false;
                }
                t63Var.T("select");
                t63Var.b0();
                return t63Var.n(sj5Var);
            }
        }
        return r73.A.d(sj5Var, t63Var);
    }
}
