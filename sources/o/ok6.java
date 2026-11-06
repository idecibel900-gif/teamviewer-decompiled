package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class ok6 {
    public static final lk6 a = new lk6();
    public static final s12 b = new s12(1);
    public static final mk6 c = new mk6();

    public static fs4 a(gr7 gr7Var, gb5 gb5Var, boolean z, boolean z2, mw4 mw4Var) {
        return new kk6(gr7Var, gb5Var, z, z2, mw4Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(yk6 yk6Var, long j, jc1 jc1Var) {
        nk6 nk6Var;
        h76 h76Var;
        yk6 yk6Var2;
        if (jc1Var instanceof nk6) {
            nk6Var = (nk6) jc1Var;
            int i = nk6Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                nk6Var.p = i - Integer.MIN_VALUE;
            } else {
                nk6Var = new nk6(jc1Var);
            }
        } else {
            nk6Var = new nk6(jc1Var);
        }
        Object obj = nk6Var.f1574o;
        int i2 = nk6Var.p;
        if (i2 == 0) {
            ct1.a0(obj);
            h76Var = new h76();
            mm5 mm5Var = new mm5(yk6Var, j, h76Var, (hc1) null);
            nk6Var.m = yk6Var;
            nk6Var.n = h76Var;
            nk6Var.p = 1;
            Object objG = yk6Var.g(ay4.m, mm5Var, nk6Var);
            ne1 ne1Var = ne1.m;
            if (objG == ne1Var) {
                return ne1Var;
            }
            yk6Var2 = yk6Var;
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            h76 h76Var2 = nk6Var.n;
            yk6 yk6Var3 = nk6Var.m;
            ct1.a0(obj);
            h76Var = h76Var2;
            yk6Var2 = yk6Var3;
        }
        return new t65(yk6Var2.i(h76Var.m));
    }
}
