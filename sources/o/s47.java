package o;

/* JADX INFO: loaded from: classes.dex */
public final class s47 extends rc6 implements hw2 {
    public long[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1984o;
    public int p;
    public byte q;
    public /* synthetic */ Object r;
    public final /* synthetic */ t47 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s47(t47 t47Var, hc1 hc1Var) {
        super(2, hc1Var);
        this.s = t47Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        s47 s47Var = new s47(this.s, hc1Var);
        s47Var.r = obj;
        return s47Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        return ((s47) create((aq6) obj, (hc1) obj2)).invokeSuspend(f88.a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0078  */
    /* JADX WARN: Code duplicated, block: B:24:0x0080  */
    /* JADX WARN: Code duplicated, block: B:27:0x0095  */
    /* JADX WARN: Code duplicated, block: B:30:0x009a  */
    /* JADX WARN: Code duplicated, block: B:32:0x009e  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bc  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007e -> B:26:0x0093). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00bc -> B:37:0x00be). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:27:0x0095
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // o.i30
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            o.t47 r1 = r0.s
            long r2 = r1.m
            long r4 = r1.f2083o
            long r6 = r1.n
            byte r8 = r0.q
            r9 = 0
            r12 = 64
            r13 = 3
            r14 = 2
            r16 = 0
            r18 = 1
            r10 = 1
            o.ne1 r11 = o.ne1.m
            if (r8 == 0) goto L4b
            if (r8 == r10) goto L3c
            if (r8 == r14) goto L32
            if (r8 != r13) goto L2c
            int r1 = r0.f1984o
            java.lang.Object r6 = r0.r
            o.aq6 r6 = (o.aq6) r6
            o.ct1.a0(r23)
            r7 = r13
            goto Lbe
        L2c:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            o.hk0.l(r0)
            return r9
        L32:
            int r1 = r0.f1984o
            java.lang.Object r8 = r0.r
            o.aq6 r8 = (o.aq6) r8
            o.ct1.a0(r23)
            goto L93
        L3c:
            int r1 = r0.p
            int r8 = r0.f1984o
            long[] r15 = r0.n
            java.lang.Object r13 = r0.r
            o.aq6 r13 = (o.aq6) r13
            o.ct1.a0(r23)
            int r8 = r8 + r10
            goto L59
        L4b:
            o.ct1.a0(r23)
            java.lang.Object r8 = r0.r
            r13 = r8
            o.aq6 r13 = (o.aq6) r13
            long[] r15 = r1.p
            if (r15 == 0) goto L70
            int r1 = r15.length
            r8 = 0
        L59:
            if (r8 >= r1) goto L70
            r2 = r15[r8]
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r2)
            r0.r = r13
            r0.n = r15
            r0.f1984o = r8
            r0.p = r1
            r0.q = r10
            r13.b(r4, r0)
            return r11
        L70:
            int r1 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r1 == 0) goto L96
            r8 = r13
            r1 = 0
        L76:
            if (r1 >= r12) goto L95
            long r20 = r18 << r1
            long r20 = r6 & r20
            int r13 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r13 == 0) goto L93
            long r2 = (long) r1
            long r4 = r4 + r2
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r4)
            r0.r = r8
            r0.n = r9
            r0.f1984o = r1
            r0.q = r14
            r8.b(r2, r0)
            return r11
        L93:
            int r1 = r1 + r10
            goto L76
        L95:
            r13 = r8
        L96:
            int r1 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r1 == 0) goto Lc1
            r6 = r13
            r15 = 0
        L9c:
            if (r15 >= r12) goto Lc1
            long r7 = r18 << r15
            long r7 = r7 & r2
            int r1 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r1 == 0) goto Lbc
            long r1 = (long) r15
            long r4 = r4 + r1
            r1 = 64
            long r4 = r4 + r1
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r4)
            r0.r = r6
            r0.n = r9
            r0.f1984o = r15
            r7 = 3
            r0.q = r7
            r6.b(r1, r0)
            return r11
        Lbc:
            r7 = 3
            r1 = r15
        Lbe:
            int r15 = r1 + 1
            goto L9c
        Lc1:
            o.f88 r0 = o.f88.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.s47.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
