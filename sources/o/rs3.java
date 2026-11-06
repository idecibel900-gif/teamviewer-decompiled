package o;

/* JADX INFO: loaded from: classes2.dex */
public final class rs3 implements rp1 {
    public final fs3 m;
    public final fs3 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final r86 f1947o;

    public rs3(r86 r86Var, mv5 mv5Var, qs3 qs3Var, qp1 qp1Var) {
        r86Var.getClass();
        mv5Var.getClass();
        qs3Var.getClass();
        fs3 fs3Var = new fs3(fs3.e(p76.a(r86Var.a)));
        yy3 yy3Var = r86Var.b;
        fs3 fs3VarC = null;
        String str = yy3Var.a != xy3.MULTIFILE_CLASS_PART ? null : yy3Var.f;
        if (str != null && str.length() > 0) {
            fs3VarC = fs3.c(str);
        }
        this.m = fs3Var;
        this.n = fs3VarC;
        this.f1947o = r86Var;
        my2 my2Var = jt3.m;
        my2Var.getClass();
        Integer num = (Integer) it1.C(mv5Var, my2Var);
        if (num != null) {
            qs3Var.getString(num.intValue());
        }
    }

    public final js0 a() {
        ht2 ht2Var;
        fs3 fs3Var = this.m;
        String str = fs3Var.a;
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf == -1) {
            ht2Var = ht2.c;
            if (ht2Var == null) {
                fs3.a(9);
                throw null;
            }
        } else {
            ht2Var = new ht2(str.substring(0, iLastIndexOf).replace('/', '.'));
        }
        String strD = fs3Var.d();
        strD.getClass();
        return new js0(ht2Var, sy4.e(ub7.q0('/', strD, strD)));
    }

    @Override // o.rp1
    public final String d() {
        return "Class '" + a().a().b() + '\'';
    }

    public final String toString() {
        return rs3.class.getSimpleName() + ": " + this.m;
    }
}
