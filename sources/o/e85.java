package o;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e85 extends cx2 implements iw2 {
    public static final e85 n = new e85(3, f85.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        f85 f85Var = (f85) obj;
        ao6 ao6Var = (ao6) obj2;
        long j = f85Var.a;
        f88 f88Var = f88.a;
        if (j <= 0) {
            ao6Var.q = f88Var;
            return f88Var;
        }
        be3 be3Var = new be3(ao6Var, f85Var, (byte) 4);
        ao6Var.getClass();
        de1 de1Var = ao6Var.m;
        ao6Var.f344o = im3.E(de1Var).Y(j, be3Var, de1Var);
        return f88Var;
    }
}
