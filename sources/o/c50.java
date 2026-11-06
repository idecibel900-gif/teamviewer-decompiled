package o;

/* JADX INFO: loaded from: classes.dex */
public final class c50 extends rc6 implements hw2 {
    public final /* synthetic */ byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f488o;
    public /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c50(Object obj, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.n = b;
        this.q = obj;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.n;
        Object obj2 = this.q;
        switch (b) {
            case 0:
                c50 c50Var = new c50((cn5) obj2, hc1Var, (byte) 0);
                c50Var.p = obj;
                return c50Var;
            default:
                c50 c50Var2 = new c50((od1) obj2, hc1Var, (byte) 1);
                c50Var2.p = obj;
                return c50Var2;
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
                return ((c50) create(ug7Var, hc1Var)).invokeSuspend(f88Var);
            default:
                ((c50) create(ug7Var, hc1Var)).invokeSuspend(f88Var);
                return ne1.m;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0031 -> B:14:0x0035). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:4:0x000d
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // o.i30
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            byte r0 = r6.n
            java.lang.Object r1 = r6.q
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            o.ne1 r4 = o.ne1.m
            r5 = 1
            switch(r0) {
                case 0: goto L47;
                default: goto Ld;
            }
        Ld:
            boolean r0 = r6.f488o
            if (r0 == 0) goto L1f
            if (r0 != r5) goto L1b
            java.lang.Object r0 = r6.p
            o.ug7 r0 = (o.ug7) r0
            o.ct1.a0(r7)
            goto L35
        L1b:
            o.hk0.l(r3)
            goto L34
        L1f:
            o.ct1.a0(r7)
            java.lang.Object r7 = r6.p
            o.ug7 r7 = (o.ug7) r7
            r0 = r7
        L27:
            r6.p = r0
            r6.f488o = r5
            o.cn5 r7 = o.cn5.m
            java.lang.Object r7 = r0.a(r7, r6)
            if (r7 != r4) goto L35
            r2 = r4
        L34:
            return r2
        L35:
            o.bn5 r7 = (o.bn5) r7
            r2 = r1
            o.od1 r2 = (o.od1) r2
            boolean r7 = o.ro6.a(r7)
            r7 = r7 ^ r5
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r2.invoke(r7)
            goto L27
        L47:
            boolean r0 = r6.f488o
            if (r0 == 0) goto L56
            if (r0 != r5) goto L51
            o.ct1.a0(r7)
            goto L68
        L51:
            o.hk0.l(r3)
            r7 = r2
            goto L68
        L56:
            o.ct1.a0(r7)
            java.lang.Object r7 = r6.p
            o.ug7 r7 = (o.ug7) r7
            o.cn5 r1 = (o.cn5) r1
            r6.f488o = r5
            java.lang.Object r7 = o.un7.i(r7, r1, r6)
            if (r7 != r4) goto L68
            r7 = r4
        L68:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.c50.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
