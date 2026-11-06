package o;

/* JADX INFO: loaded from: classes.dex */
public final class qo6 extends rc6 implements hw2 {
    public final /* synthetic */ byte n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f1852o;
    public boolean p;
    public /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qo6(long j, j76 j76Var, hc1 hc1Var) {
        super(2, hc1Var);
        this.f1852o = j;
        this.r = j76Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.n;
        Object obj2 = this.r;
        switch (b) {
            case 0:
                qo6 qo6Var = new qo6(this.f1852o, (j76) obj2, hc1Var);
                qo6Var.q = obj;
                return qo6Var;
            default:
                qo6 qo6Var2 = new qo6((in5) obj2, hc1Var);
                qo6Var2.q = obj;
                return qo6Var2;
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
        return ((qo6) create(ug7Var, hc1Var)).invokeSuspend(f88Var);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    /* JADX WARN: Code duplicated, block: B:15:0x004f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0043 -> B:13:0x0047). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:12:0x0045
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // o.i30
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            byte r0 = r9.n
            java.lang.Object r1 = r9.r
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            o.ne1 r4 = o.ne1.m
            r5 = 1
            switch(r0) {
                case 0: goto L51;
                default: goto Ld;
            }
        Ld:
            boolean r0 = r9.p
            if (r0 == 0) goto L21
            if (r0 != r5) goto L1d
            long r0 = r9.f1852o
            java.lang.Object r2 = r9.q
            o.ug7 r2 = (o.ug7) r2
            o.ct1.a0(r10)
            goto L47
        L1d:
            o.hk0.l(r3)
            goto L50
        L21:
            o.ct1.a0(r10)
            java.lang.Object r10 = r9.q
            o.ug7 r10 = (o.ug7) r10
            o.in5 r1 = (o.in5) r1
            long r0 = r1.b
            o.ee8 r2 = r10.c()
            r2.getClass()
            r2 = 40
            long r2 = r2 + r0
            r0 = r2
            r2 = r10
        L38:
            r9.q = r2
            r9.f1852o = r0
            r9.p = r5
            r10 = 3
            java.lang.Object r10 = o.un7.b(r2, r9, r10)
            if (r10 != r4) goto L47
            r2 = r4
            goto L50
        L47:
            o.in5 r10 = (o.in5) r10
            long r6 = r10.b
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r3 < 0) goto L38
            r2 = r10
        L50:
            return r2
        L51:
            o.j76 r1 = (o.j76) r1
            boolean r0 = r9.p
            if (r0 == 0) goto L65
            if (r0 != r5) goto L61
            java.lang.Object r9 = r9.q
            o.ug7 r9 = (o.ug7) r9
            o.ct1.a0(r10)
            goto L84
        L61:
            o.hk0.l(r3)
            goto Lb6
        L65:
            o.ct1.a0(r10)
            java.lang.Object r10 = r9.q
            o.ug7 r10 = (o.ug7) r10
            long r2 = r9.f1852o
            o.gg4 r0 = new o.gg4
            r6 = 13
            r0.<init>(r1, r6)
            r9.q = r10
            r9.p = r5
            java.lang.Object r9 = o.z42.c(r10, r2, r0, r9)
            if (r9 != r4) goto L81
            r2 = r4
            goto Lb6
        L81:
            r8 = r10
            r10 = r9
            r9 = r8
        L84:
            o.in5 r10 = (o.in5) r10
            if (r10 == 0) goto L9c
            long r0 = r1.m
            r2 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r0 = r0 & r2
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 == 0) goto L9c
            o.s32 r2 = o.s32.n
            goto Lb6
        L9c:
            o.vg7 r9 = r9.q
            o.bn5 r9 = r9.E
            java.util.List r9 = r9.a
            java.lang.Object r9 = o.lv0.m0(r9)
            o.in5 r9 = (o.in5) r9
            boolean r10 = o.qs1.F(r9)
            if (r10 == 0) goto Lb4
            r9.a()
            o.s32 r2 = o.s32.m
            goto Lb6
        Lb4:
            o.s32 r2 = o.s32.p
        Lb6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.qo6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qo6(in5 in5Var, hc1 hc1Var) {
        super(2, hc1Var);
        this.r = in5Var;
    }
}
