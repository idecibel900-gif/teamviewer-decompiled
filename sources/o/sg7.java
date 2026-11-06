package o;

/* JADX INFO: loaded from: classes.dex */
public final class sg7 extends og7 implements hw2 {
    public byte m;
    public final /* synthetic */ long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ug7 f2020o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sg7(long j, ug7 ug7Var, hc1 hc1Var) {
        super(2, hc1Var);
        this.n = j;
        this.f2020o = ug7Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        return new sg7(this.n, this.f2020o, hc1Var);
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        return ((sg7) create((me1) obj, (hc1) obj2)).invokeSuspend(f88.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        if (o.im3.A(8, r10) == r7) goto L15;
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
            r1 = 8
            long r3 = r10.n
            r5 = 2
            r6 = 1
            o.ne1 r7 = o.ne1.m
            if (r0 == 0) goto L1f
            if (r0 == r6) goto L1b
            if (r0 != r5) goto L14
            o.ct1.a0(r11)
            goto L36
        L14:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            o.hk0.l(r10)
            r10 = 0
            return r10
        L1b:
            o.ct1.a0(r11)
            goto L2d
        L1f:
            o.ct1.a0(r11)
            long r8 = r3 - r1
            r10.m = r6
            java.lang.Object r11 = o.im3.A(r8, r10)
            if (r11 != r7) goto L2d
            goto L35
        L2d:
            r10.m = r5
            java.lang.Object r11 = o.im3.A(r1, r10)
            if (r11 != r7) goto L36
        L35:
            return r7
        L36:
            o.ug7 r10 = r10.f2020o
            o.gl0 r10 = r10.f2213o
            if (r10 == 0) goto L49
            o.dn5 r11 = new o.dn5
            r11.<init>(r3)
            o.sc6 r0 = new o.sc6
            r0.<init>(r11)
            r10.resumeWith(r0)
        L49:
            o.f88 r10 = o.f88.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o.sg7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
