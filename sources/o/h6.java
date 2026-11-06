package o;

/* JADX INFO: loaded from: classes.dex */
public final class h6 implements ho2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ j6 n;

    public /* synthetic */ h6(j6 j6Var, byte b) {
        this.m = b;
        this.n = j6Var;
    }

    @Override // o.ho2
    public final Object c(Object obj, hc1 hc1Var) throws Throwable {
        byte b = this.m;
        f88 f88Var = f88.a;
        j6 j6Var = this.n;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                l97 l97Var = j6Var.A;
                a6 a6Var = (a6) l97Var.getValue();
                a6Var.getClass();
                l97Var.k(a6.a(a6Var, null, null, null, null, !zBooleanValue && xh2.a, false, false, false, false, null, 1007));
                return f88Var;
            default:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                Object objC = j6Var.u.c(bool, hc1Var);
                return objC == ne1.m ? objC : f88Var;
        }
    }
}
