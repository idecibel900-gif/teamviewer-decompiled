package o;

/* JADX INFO: loaded from: classes.dex */
public final class w42 extends rc6 implements hw2 {
    public final /* synthetic */ byte n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte f2377o;
    public /* synthetic */ Object p;
    public Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ pw2 s;
    public final /* synthetic */ pw2 t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w42(vr1 vr1Var, b9 b9Var, gg4 gg4Var, fg4 fg4Var, a81 a81Var, hc1 hc1Var) {
        super(2, hc1Var);
        this.q = vr1Var;
        this.r = b9Var;
        this.s = gg4Var;
        this.t = fg4Var;
        this.u = a81Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.n;
        Object obj2 = this.u;
        pw2 pw2Var = this.t;
        pw2 pw2Var2 = this.s;
        Object obj3 = this.r;
        switch (b) {
            case 0:
                w42 w42Var = new w42((vr1) this.q, (b9) obj3, (gg4) pw2Var2, (fg4) pw2Var, (a81) obj2, hc1Var);
                w42Var.p = obj;
                return w42Var;
            default:
                w42 w42Var2 = new w42((me1) obj3, (cr7) pw2Var2, (ts6) pw2Var, (wr5) obj2, hc1Var);
                w42Var2.p = obj;
                return w42Var2;
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.n;
        f88 f88Var = f88.a;
        ug7 ug7Var = (ug7) obj;
        hc1 hc1Var = (hc1) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((w42) create(ug7Var, hc1Var)).invokeSuspend(f88Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0091, code lost:
    
        if (r3 == r9) goto L20;
     */
    @Override // o.i30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.w42.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w42(me1 me1Var, cr7 cr7Var, ts6 ts6Var, wr5 wr5Var, hc1 hc1Var) {
        super(2, hc1Var);
        this.r = me1Var;
        this.s = cr7Var;
        this.t = ts6Var;
        this.u = wr5Var;
    }
}
