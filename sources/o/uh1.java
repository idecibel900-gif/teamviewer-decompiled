package o;

/* JADX INFO: loaded from: classes.dex */
public final class uh1 extends og7 implements hw2 {
    public i76 m;
    public byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f2215o;
    public final /* synthetic */ i76 p;
    public final /* synthetic */ vh1 q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ boolean s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uh1(i76 i76Var, vh1 vh1Var, Object obj, boolean z, hc1 hc1Var) {
        super(2, hc1Var);
        this.p = i76Var;
        this.q = vh1Var;
        this.r = obj;
        this.s = z;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        uh1 uh1Var = new uh1(this.p, this.q, this.r, this.s, hc1Var);
        uh1Var.f2215o = obj;
        return uh1Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        return ((uh1) create((yk2) obj, (hc1) obj2)).invokeSuspend(f88.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0060, code lost:
    
        if (r6.b(r2, r8) == r7) goto L16;
     */
    @Override // o.i30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            byte r0 = r8.n
            r1 = 0
            java.lang.Object r2 = r8.r
            o.vh1 r3 = r8.q
            o.i76 r4 = r8.p
            r5 = 2
            r6 = 1
            o.ne1 r7 = o.ne1.m
            if (r0 == 0) goto L27
            if (r0 == r6) goto L1d
            if (r0 != r5) goto L17
            o.ct1.a0(r9)
            goto L63
        L17:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            o.hk0.l(r8)
            return r1
        L1d:
            o.i76 r0 = r8.m
            java.lang.Object r6 = r8.f2215o
            o.yk2 r6 = (o.yk2) r6
            o.ct1.a0(r9)
            goto L4e
        L27:
            o.ct1.a0(r9)
            java.lang.Object r9 = r8.f2215o
            o.yk2 r9 = (o.yk2) r9
            o.o07 r0 = r3.c()
            r8.f2215o = r9
            r8.m = r4
            r8.n = r6
            o.df6 r0 = r0.b
            java.lang.Object r0 = r0.n
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            int r0 = r0.incrementAndGet()
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r0)
            if (r6 != r7) goto L4a
            goto L62
        L4a:
            r0 = r6
            r6 = r9
            r9 = r0
            r0 = r4
        L4e:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r0.m = r9
            r8.f2215o = r1
            r8.m = r1
            r8.n = r5
            java.lang.Object r9 = r6.b(r2, r8)
            if (r9 != r7) goto L63
        L62:
            return r7
        L63:
            boolean r8 = r8.s
            if (r8 == 0) goto L7b
            o.wh1 r8 = r3.h
            o.qg1 r9 = new o.qg1
            if (r2 == 0) goto L72
            int r0 = r2.hashCode()
            goto L73
        L72:
            r0 = 0
        L73:
            int r1 = r4.m
            r9.<init>(r0, r1, r2)
            r8.c(r9)
        L7b:
            o.f88 r8 = o.f88.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.uh1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
