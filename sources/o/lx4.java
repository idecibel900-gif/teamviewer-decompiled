package o;

/* JADX INFO: loaded from: classes2.dex */
public final class lx4 extends rc6 implements hw2 {
    public ry2 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public mx4 f1415o;
    public long[] p;
    public int q;
    public int r;
    public int s;
    public int t;
    public long u;
    public boolean v;
    public /* synthetic */ Object w;
    public final /* synthetic */ mx4 x;
    public final /* synthetic */ ry2 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lx4(mx4 mx4Var, ry2 ry2Var, hc1 hc1Var) {
        super(2, hc1Var);
        this.x = mx4Var;
        this.y = ry2Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        lx4 lx4Var = new lx4(this.x, this.y, hc1Var);
        lx4Var.w = obj;
        return lx4Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        return ((lx4) create((aq6) obj, (hc1) obj2)).invokeSuspend(f88.a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0051  */
    /* JADX WARN: Code duplicated, block: B:20:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0099  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004f -> B:22:0x009f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0051 -> B:14:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006d -> B:19:0x0094). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // o.i30
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            boolean r1 = r0.v
            r2 = 0
            r3 = 8
            r4 = 1
            if (r1 == 0) goto L2c
            if (r1 != r4) goto L25
            int r1 = r0.t
            int r5 = r0.s
            long r6 = r0.u
            int r8 = r0.r
            int r9 = r0.q
            long[] r10 = r0.p
            o.mx4 r11 = r0.f1415o
            o.ry2 r12 = r0.n
            java.lang.Object r13 = r0.w
            o.aq6 r13 = (o.aq6) r13
            o.ct1.a0(r21)
            goto L94
        L25:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            o.hk0.l(r0)
            r0 = 0
            return r0
        L2c:
            o.ct1.a0(r21)
            java.lang.Object r1 = r0.w
            o.aq6 r1 = (o.aq6) r1
            o.mx4 r5 = r0.x
            o.kx4 r6 = r5.n
            long[] r6 = r6.a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto La4
            o.ry2 r8 = r0.y
            r9 = r2
        L41:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L9f
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r1
            r1 = r2
            r18 = r10
            r11 = r5
            r10 = r6
            r5 = r12
            r12 = r8
            r8 = r9
            r9 = r7
            r6 = r18
        L64:
            if (r1 >= r5) goto L97
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r6
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L94
            int r2 = r8 << 3
            int r2 = r2 + r1
            r12.n = r2
            o.kx4 r3 = r11.n
            java.lang.Object[] r3 = r3.b
            r2 = r3[r2]
            r0.w = r13
            r0.n = r12
            r0.f1415o = r11
            r0.p = r10
            r0.q = r9
            r0.r = r8
            r0.u = r6
            r0.s = r5
            r0.t = r1
            r0.v = r4
            r13.b(r2, r0)
            o.ne1 r0 = o.ne1.m
            return r0
        L94:
            long r6 = r6 >> r3
            int r1 = r1 + r4
            goto L64
        L97:
            if (r5 != r3) goto La4
            r7 = r9
            r6 = r10
            r5 = r11
            r1 = r13
            r9 = r8
            r8 = r12
        L9f:
            if (r9 == r7) goto La4
            int r9 = r9 + 1
            goto L41
        La4:
            o.f88 r0 = o.f88.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.lx4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
