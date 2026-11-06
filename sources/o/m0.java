package o;

/* JADX INFO: loaded from: classes.dex */
public final class m0 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ mw4 f1420o;
    public final /* synthetic */ yr5 p;
    public final /* synthetic */ p0 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(mw4 mw4Var, yr5 yr5Var, p0 p0Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f1420o = mw4Var;
        this.p = yr5Var;
        this.q = p0Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        switch (this.m) {
            case 0:
                return new m0(this.f1420o, this.p, this.q, hc1Var, (byte) 0);
            default:
                return new m0(this.f1420o, this.p, this.q, hc1Var, (byte) 1);
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
        return ((m0) create(me1Var, hc1Var)).invokeSuspend(f88Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r3.a(r9, r10) == r6) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
    
        if (r3.a(r9, r10) == r6) goto L31;
     */
    @Override // o.i30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            byte r0 = r10.m
            o.f88 r1 = o.f88.a
            o.p0 r2 = r10.q
            o.mw4 r3 = r10.f1420o
            r4 = 0
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            o.ne1 r6 = o.ne1.m
            r7 = 1
            r8 = 2
            o.yr5 r9 = r10.p
            switch(r0) {
                case 0: goto L44;
                default: goto L14;
            }
        L14:
            byte r0 = r10.n
            if (r0 == 0) goto L29
            if (r0 == r7) goto L25
            if (r0 != r8) goto L20
            o.ct1.a0(r11)
            goto L41
        L20:
            o.hk0.l(r5)
            r1 = r4
            goto L43
        L25:
            o.ct1.a0(r11)
            goto L37
        L29:
            o.ct1.a0(r11)
            long r4 = o.lt0.a
            r10.n = r7
            java.lang.Object r11 = o.im3.A(r4, r10)
            if (r11 != r6) goto L37
            goto L3f
        L37:
            r10.n = r8
            java.lang.Object r10 = r3.a(r9, r10)
            if (r10 != r6) goto L41
        L3f:
            r1 = r6
            goto L43
        L41:
            r2.O = r9
        L43:
            return r1
        L44:
            byte r0 = r10.n
            if (r0 == 0) goto L59
            if (r0 == r7) goto L55
            if (r0 != r8) goto L50
            o.ct1.a0(r11)
            goto L71
        L50:
            o.hk0.l(r5)
            r1 = r4
            goto L73
        L55:
            o.ct1.a0(r11)
            goto L67
        L59:
            o.ct1.a0(r11)
            long r4 = o.lt0.a
            r10.n = r7
            java.lang.Object r11 = o.im3.A(r4, r10)
            if (r11 != r6) goto L67
            goto L6f
        L67:
            r10.n = r8
            java.lang.Object r10 = r3.a(r9, r10)
            if (r10 != r6) goto L71
        L6f:
            r1 = r6
            goto L73
        L71:
            r2.S = r9
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.m0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
