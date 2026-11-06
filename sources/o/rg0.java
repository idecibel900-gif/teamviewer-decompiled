package o;

/* JADX INFO: loaded from: classes.dex */
public final class rg0 extends og7 implements hw2 {
    public final /* synthetic */ byte m = 1;
    public byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ km f1920o;
    public final /* synthetic */ float p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ jl3 r;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rg0(km kmVar, float f, boolean z, sg0 sg0Var, jl3 jl3Var, hc1 hc1Var) {
        super(2, hc1Var);
        this.f1920o = kmVar;
        this.p = f;
        this.q = z;
        this.s = sg0Var;
        this.r = jl3Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        Object obj2 = this.s;
        switch (b) {
            case 0:
                jl3 jl3Var = this.r;
                return new rg0(this.f1920o, this.p, this.q, (sg0) obj2, jl3Var, hc1Var);
            default:
                return new rg0(this.f1920o, this.p, this.q, this.r, (px4) obj2, hc1Var);
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
        return ((rg0) create(me1Var, hc1Var)).invokeSuspend(f88Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        if (r5.e(r13, r12) == r4) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        if (o.s82.a(r5, r6, r13, r10, r12) == r4) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
    
        return r4;
     */
    @Override // o.i30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.rg0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rg0(km kmVar, float f, boolean z, jl3 jl3Var, px4 px4Var, hc1 hc1Var) {
        super(2, hc1Var);
        this.f1920o = kmVar;
        this.p = f;
        this.q = z;
        this.r = jl3Var;
        this.s = px4Var;
    }
}
