package o;

/* JADX INFO: loaded from: classes.dex */
public final class h34 extends og7 implements hw2 {
    public byte m;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i34 f946o;
    public final /* synthetic */ rl2 p;
    public final /* synthetic */ l03 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h34(boolean z, i34 i34Var, rl2 rl2Var, l03 l03Var, hc1 hc1Var) {
        super(2, hc1Var);
        this.n = z;
        this.f946o = i34Var;
        this.p = rl2Var;
        this.q = l03Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        return new h34(this.n, this.f946o, this.p, this.q, hc1Var);
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        return ((h34) create((me1) obj, (hc1) obj2)).invokeSuspend(f88.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        if (r11 == r9) goto L22;
     */
    @Override // o.i30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            o.i34 r0 = r10.f946o
            o.bg5 r1 = r0.i
            o.km r2 = r0.q
            byte r3 = r10.m
            r4 = 2
            r5 = 1
            o.ne1 r9 = o.ne1.m
            if (r3 == 0) goto L24
            if (r3 == r5) goto L20
            if (r3 != r4) goto L19
            o.ct1.a0(r11)     // Catch: java.lang.Throwable -> L16
            goto L58
        L16:
            r0 = move-exception
            r10 = r0
            goto L62
        L19:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            o.hk0.l(r10)
            r10 = 0
            return r10
        L20:
            o.ct1.a0(r11)     // Catch: java.lang.Throwable -> L16
            goto L3a
        L24:
            o.ct1.a0(r11)
            boolean r11 = r10.n     // Catch: java.lang.Throwable -> L16
            if (r11 == 0) goto L3a
            java.lang.Float r11 = new java.lang.Float     // Catch: java.lang.Throwable -> L16
            r3 = 0
            r11.<init>(r3)     // Catch: java.lang.Throwable -> L16
            r10.m = r5     // Catch: java.lang.Throwable -> L16
            java.lang.Object r11 = r2.e(r11, r10)     // Catch: java.lang.Throwable -> L16
            if (r11 != r9) goto L3a
            goto L57
        L3a:
            java.lang.Float r3 = new java.lang.Float     // Catch: java.lang.Throwable -> L16
            r11 = 1065353216(0x3f800000, float:1.0)
            r3.<init>(r11)     // Catch: java.lang.Throwable -> L16
            r11 = r4
            o.rl2 r4 = r10.p     // Catch: java.lang.Throwable -> L16
            o.l03 r5 = r10.q     // Catch: java.lang.Throwable -> L16
            o.g34 r6 = new o.g34     // Catch: java.lang.Throwable -> L16
            r7 = 0
            r6.<init>(r5, r0, r7)     // Catch: java.lang.Throwable -> L16
            r10.m = r11     // Catch: java.lang.Throwable -> L16
            r5 = 0
            r8 = 4
            r7 = r10
            java.lang.Object r11 = o.km.a(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L16
            if (r11 != r9) goto L58
        L57:
            return r9
        L58:
            o.ho r11 = (o.ho) r11     // Catch: java.lang.Throwable -> L16
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            r1.setValue(r10)
            o.f88 r10 = o.f88.a
            return r10
        L62:
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            r1.setValue(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o.h34.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
