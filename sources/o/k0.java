package o;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f1217o;
    public Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(jp7 jp7Var, long j, op7 op7Var, ip7 ip7Var, hc1 hc1Var) {
        super(2, hc1Var);
        this.m = (byte) 2;
        this.p = jp7Var;
        this.f1217o = j;
        this.q = op7Var;
        this.r = ip7Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        Object obj2 = this.r;
        Object obj3 = this.q;
        switch (b) {
            case 0:
                return new k0(obj3, this.f1217o, (mw4) obj2, hc1Var, (byte) 0);
            case 1:
                return new k0((i34) obj3, (rl2) obj2, this.f1217o, hc1Var);
            case 2:
                return new k0((jp7) this.p, this.f1217o, (op7) obj3, (ip7) obj2, hc1Var);
            default:
                return new k0(obj3, this.f1217o, (mw4) obj2, hc1Var, (byte) 3);
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        me1 me1Var = (me1) obj;
        hc1 hc1Var = (hc1) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((k0) create(me1Var, hc1Var)).invokeSuspend(f88Var);
    }

    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        if (r11.a(r3, r16) == r9) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        if (r11.a(r0, r16) == r9) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0131, code lost:
    
        if (o.km.a(r0, r4, r3, null, r4, r16, 4) == r9) goto L69;
     */
    @Override // o.i30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.k0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(i34 i34Var, rl2 rl2Var, long j, hc1 hc1Var) {
        super(2, hc1Var);
        this.m = (byte) 1;
        this.q = i34Var;
        this.r = rl2Var;
        this.f1217o = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(Object obj, long j, mw4 mw4Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.q = obj;
        this.f1217o = j;
        this.r = mw4Var;
    }
}
