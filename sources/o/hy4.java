package o;

/* JADX INFO: loaded from: classes.dex */
public final class hy4 extends og7 implements hw2 {
    public ky4 m;
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f1016o;
    public iy4 p;
    public byte q;
    public /* synthetic */ Object r;
    public final /* synthetic */ ay4 s;
    public final /* synthetic */ iy4 t;
    public final /* synthetic */ hw2 u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy4(ay4 ay4Var, iy4 iy4Var, hw2 hw2Var, Object obj, hc1 hc1Var) {
        super(2, hc1Var);
        this.s = ay4Var;
        this.t = iy4Var;
        this.u = hw2Var;
        this.v = obj;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        hy4 hy4Var = new hy4(this.s, this.t, this.u, this.v, hc1Var);
        hy4Var.r = obj;
        return hy4Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        return ((hy4) create((me1) obj, (hc1) obj2)).invokeSuspend(f88.a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    @Override // o.i30
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            byte r0 = r8.q
            r1 = 2
            r2 = 1
            r3 = 0
            o.ne1 r4 = o.ne1.m
            if (r0 == 0) goto L3c
            if (r0 == r2) goto L25
            if (r0 != r1) goto L1f
            java.lang.Object r0 = r8.n
            o.iy4 r0 = (o.iy4) r0
            o.ky4 r1 = r8.m
            java.lang.Object r8 = r8.r
            o.ey4 r8 = (o.ey4) r8
            o.ct1.a0(r9)     // Catch: java.lang.Throwable -> L1c
            goto L90
        L1c:
            r9 = move-exception
            goto Lab
        L1f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            o.hk0.l(r8)
            return r3
        L25:
            o.iy4 r0 = r8.p
            java.lang.Object r2 = r8.f1016o
            java.lang.Object r5 = r8.n
            o.hw2 r5 = (o.hw2) r5
            o.ky4 r6 = r8.m
            java.lang.Object r7 = r8.r
            o.ey4 r7 = (o.ey4) r7
            o.ct1.a0(r9)
            r9 = r6
            r6 = r5
            r5 = r9
            r9 = r0
            r0 = r7
            goto L78
        L3c:
            o.ct1.a0(r9)
            java.lang.Object r9 = r8.r
            o.me1 r9 = (o.me1) r9
            o.ey4 r0 = new o.ey4
            o.de1 r9 = r9.getCoroutineContext()
            o.z06 r5 = o.z06.z
            o.be1 r9 = r9.l0(r5)
            r9.getClass()
            o.bp3 r9 = (o.bp3) r9
            o.ay4 r5 = r8.s
            r0.<init>(r5, r9)
            o.iy4 r9 = r8.t
            r9.b(r0)
            o.my4 r5 = r9.b
            r8.r = r0
            r8.m = r5
            o.hw2 r6 = r8.u
            r8.n = r6
            java.lang.Object r7 = r8.v
            r8.f1016o = r7
            r8.p = r9
            r8.q = r2
            java.lang.Object r2 = r5.e(r8)
            if (r2 != r4) goto L77
            goto L8a
        L77:
            r2 = r7
        L78:
            r8.r = r0     // Catch: java.lang.Throwable -> La5
            r8.m = r5     // Catch: java.lang.Throwable -> La5
            r8.n = r9     // Catch: java.lang.Throwable -> La5
            r8.f1016o = r3     // Catch: java.lang.Throwable -> La5
            r8.p = r3     // Catch: java.lang.Throwable -> La5
            r8.q = r1     // Catch: java.lang.Throwable -> La5
            java.lang.Object r8 = r6.invoke(r2, r8)     // Catch: java.lang.Throwable -> La5
            if (r8 != r4) goto L8b
        L8a:
            return r4
        L8b:
            r1 = r9
            r9 = r8
            r8 = r0
            r0 = r1
            r1 = r5
        L90:
            java.util.concurrent.atomic.AtomicReference r0 = r0.a     // Catch: java.lang.Throwable -> La3
        L92:
            boolean r2 = r0.compareAndSet(r8, r3)     // Catch: java.lang.Throwable -> La3
            if (r2 == 0) goto L99
            goto L9f
        L99:
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> La3
            if (r2 == r8) goto L92
        L9f:
            r1.j(r3)
            return r9
        La3:
            r8 = move-exception
            goto Lbb
        La5:
            r8 = move-exception
            r1 = r9
            r9 = r8
            r8 = r0
            r0 = r1
            r1 = r5
        Lab:
            java.util.concurrent.atomic.AtomicReference r0 = r0.a     // Catch: java.lang.Throwable -> La3
        Lad:
            boolean r2 = r0.compareAndSet(r8, r3)     // Catch: java.lang.Throwable -> La3
            if (r2 != 0) goto Lba
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> La3
            if (r2 != r8) goto Lba
            goto Lad
        Lba:
            throw r9     // Catch: java.lang.Throwable -> La3
        Lbb:
            r1.j(r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.hy4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
