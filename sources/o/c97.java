package o;

/* JADX INFO: loaded from: classes2.dex */
public final class c97 extends og7 implements iw2 {
    public byte m;
    public /* synthetic */ ho2 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ int f504o;
    public final /* synthetic */ d97 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c97(d97 d97Var, hc1 hc1Var) {
        super(3, hc1Var);
        this.p = d97Var;
    }

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        c97 c97Var = new c97(this.p, (hc1) obj3);
        c97Var.n = (ho2) obj;
        c97Var.f504o = iIntValue;
        return c97Var.invokeSuspend(f88.a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    /* JADX WARN: Code duplicated, block: B:29:0x006f  */
    /* JADX WARN: Code duplicated, block: B:32:0x007c  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r4.c(o.ny6.m, r16) == r13) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
    
        if (r4.c(o.ny6.f1612o, r16) == r13) goto L34;
     */
    @Override // o.i30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            o.d97 r1 = r0.p
            long r2 = r1.b
            o.ho2 r4 = r0.n
            int r5 = r0.f504o
            byte r6 = r0.m
            r7 = 0
            r8 = 5
            r9 = 4
            r10 = 3
            r11 = 2
            r12 = 1
            o.ne1 r13 = o.ne1.m
            if (r6 == 0) goto L37
            if (r6 == r12) goto L33
            if (r6 == r11) goto L2f
            if (r6 == r10) goto L2b
            if (r6 == r9) goto L27
            if (r6 != r8) goto L21
            goto L33
        L21:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            o.hk0.l(r0)
            return r7
        L27:
            o.ct1.a0(r17)
            goto L7c
        L2b:
            o.ct1.a0(r17)
            goto L6f
        L2f:
            o.ct1.a0(r17)
            goto L5a
        L33:
            o.ct1.a0(r17)
            goto L8b
        L37:
            o.ct1.a0(r17)
            if (r5 <= 0) goto L4b
            r0.n = r7
            r0.f504o = r5
            r0.m = r12
            o.ny6 r1 = o.ny6.m
            java.lang.Object r0 = r4.c(r1, r0)
            if (r0 != r13) goto L8b
            goto L8a
        L4b:
            long r14 = r1.a
            r0.n = r4
            r0.f504o = r5
            r0.m = r11
            java.lang.Object r1 = o.im3.A(r14, r0)
            if (r1 != r13) goto L5a
            goto L8a
        L5a:
            r11 = 0
            int r1 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r1 <= 0) goto L7c
            r0.n = r4
            r0.f504o = r5
            r0.m = r10
            o.ny6 r1 = o.ny6.n
            java.lang.Object r1 = r4.c(r1, r0)
            if (r1 != r13) goto L6f
            goto L8a
        L6f:
            r0.n = r4
            r0.f504o = r5
            r0.m = r9
            java.lang.Object r1 = o.im3.A(r2, r0)
            if (r1 != r13) goto L7c
            goto L8a
        L7c:
            r0.n = r7
            r0.f504o = r5
            r0.m = r8
            o.ny6 r1 = o.ny6.f1612o
            java.lang.Object r0 = r4.c(r1, r0)
            if (r0 != r13) goto L8b
        L8a:
            return r13
        L8b:
            o.f88 r0 = o.f88.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.c97.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
