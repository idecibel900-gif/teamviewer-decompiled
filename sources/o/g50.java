package o;

/* JADX INFO: loaded from: classes.dex */
public final class g50 extends rc6 implements hw2 {
    public cn5 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f860o;
    public /* synthetic */ Object p;
    public final /* synthetic */ me1 q;
    public final /* synthetic */ k08 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g50(me1 me1Var, k08 k08Var, hc1 hc1Var) {
        super(2, hc1Var);
        this.q = me1Var;
        this.r = k08Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        g50 g50Var = new g50(this.q, this.r, hc1Var);
        g50Var.p = obj;
        return g50Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        ((g50) create((ug7) obj, (hc1) obj2)).invokeSuspend(f88.a);
        return ne1.m;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0041  */
    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:17:0x0054  */
    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002e -> B:12:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // o.i30
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = r7.f860o
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L18
            if (r0 != r2) goto L12
            o.cn5 r0 = r7.n
            java.lang.Object r3 = r7.p
            o.ug7 r3 = (o.ug7) r3
            o.ct1.a0(r8)
            goto L31
        L12:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            o.hk0.l(r7)
            return r1
        L18:
            o.ct1.a0(r8)
            java.lang.Object r8 = r7.p
            o.ug7 r8 = (o.ug7) r8
            o.cn5 r0 = o.cn5.n
            r3 = r8
        L22:
            r7.p = r3
            r7.n = r0
            r7.f860o = r2
            java.lang.Object r8 = r3.a(r0, r7)
            o.ne1 r4 = o.ne1.m
            if (r8 != r4) goto L31
            return r4
        L31:
            o.bn5 r8 = (o.bn5) r8
            java.util.List r4 = r8.a
            r5 = 0
            java.lang.Object r4 = r4.get(r5)
            o.in5 r4 = (o.in5) r4
            int r4 = r4.i
            r5 = 2
            if (r4 != r5) goto L22
            int r8 = r8.f
            r4 = 4
            o.k08 r6 = r7.r
            if (r8 != r4) goto L54
            o.b50 r8 = new o.b50
            r8.<init>(r6, r1, r5)
            r4 = 3
            o.me1 r5 = r7.q
            o.im3.R(r5, r1, r1, r8, r4)
            goto L22
        L54:
            r4 = 5
            if (r8 != r4) goto L22
            r6.getClass()
            r6.a()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: o.g50.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
