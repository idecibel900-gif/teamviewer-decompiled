package o;

/* JADX INFO: loaded from: classes2.dex */
public final class tt4 implements vc1 {
    public static final ai0 n;
    public final vp3 m;

    static {
        ai0 ai0Var = ai0.p;
        n = ju.r("EFBBBF");
    }

    public tt4(vp3 vp3Var) {
        this.m = vp3Var;
    }

    @Override // o.vc1
    public final Object w(Object obj) {
        nc6 nc6Var = (nc6) obj;
        of0 of0VarE0 = nc6Var.E0();
        try {
            ai0 ai0Var = n;
            if (of0VarE0.C0(ai0Var)) {
                of0VarE0.skip(ai0Var.m.length);
            }
            nr3 nr3Var = new nr3(of0VarE0);
            Object objA = this.m.a(nr3Var);
            if (nr3Var.c0() != 10) {
                throw new gq3("JSON document was not fully consumed.");
            }
            nc6Var.close();
            return objA;
        } catch (Throwable th) {
            nc6Var.close();
            throw th;
        }
    }
}
