package o;

/* JADX INFO: loaded from: classes.dex */
public final class l81 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1340o;
    public final /* synthetic */ oe8 p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l81(oe8 oe8Var, int i, Object obj, Object obj2, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.p = oe8Var;
        this.f1340o = i;
        this.q = obj;
        this.r = obj2;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        Object obj2 = this.r;
        Object obj3 = this.q;
        oe8 oe8Var = this.p;
        switch (b) {
            case 0:
                return new l81((n81) oe8Var, this.f1340o, (String) obj3, (String) obj2, hc1Var, (byte) 0);
            default:
                return new l81((ru1) oe8Var, this.f1340o, (wt1) obj3, (ns1) obj2, hc1Var, (byte) 1);
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
        }
        return ((l81) create(me1Var, hc1Var)).invokeSuspend(f88Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bd, code lost:
    
        if (r12.c(r3, r28) == r6) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0187, code lost:
    
        if (r7.b1(r10, r3, r28) == r6) goto L54;
     */
    @Override // o.i30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.l81.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
