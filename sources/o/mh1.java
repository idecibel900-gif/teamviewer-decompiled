package o;

/* JADX INFO: loaded from: classes.dex */
public final class mh1 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ vh1 f1469o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mh1(vh1 vh1Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f1469o = vh1Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        vh1 vh1Var = this.f1469o;
        switch (b) {
            case 0:
                return new mh1(vh1Var, hc1Var, (byte) 0);
            default:
                return new mh1(vh1Var, hc1Var, (byte) 1);
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        me1 me1Var = (me1) obj;
        hc1 hc1Var = (hc1) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((mh1) create(me1Var, hc1Var)).invokeSuspend(f88Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (r10 == r4) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0098, code lost:
    
        if (r10.b(r0, r9) == r4) goto L42;
     */
    @Override // o.i30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            byte r0 = r9.m
            r1 = -1
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            o.ne1 r4 = o.ne1.m
            o.vh1 r5 = r9.f1469o
            r6 = 1
            r7 = 2
            switch(r0) {
                case 0: goto L55;
                default: goto Lf;
            }
        Lf:
            o.wh1 r0 = r5.h
            byte r8 = r9.n
            if (r8 == 0) goto L27
            if (r8 == r6) goto L21
            if (r8 != r7) goto L1d
            o.ct1.a0(r10)
            goto L4b
        L1d:
            o.hk0.l(r3)
            goto L54
        L21:
            o.ct1.a0(r10)     // Catch: java.lang.Throwable -> L25
            goto L40
        L25:
            r9 = move-exception
            goto L4f
        L27:
            o.ct1.a0(r10)
            o.g97 r10 = r0.b()
            boolean r10 = r10 instanceof o.gl2
            if (r10 == 0) goto L37
            o.g97 r2 = r0.b()
            goto L54
        L37:
            r9.n = r6     // Catch: java.lang.Throwable -> L25
            java.lang.Object r10 = r5.f(r9)     // Catch: java.lang.Throwable -> L25
            if (r10 != r4) goto L40
            goto L49
        L40:
            r9.n = r7
            r10 = 0
            java.lang.Object r10 = r5.g(r10, r9)
            if (r10 != r4) goto L4b
        L49:
            r2 = r4
            goto L54
        L4b:
            r2 = r10
            o.g97 r2 = (o.g97) r2
            goto L54
        L4f:
            o.h36 r2 = new o.h36
            r2.<init>(r9, r1)
        L54:
            return r2
        L55:
            byte r0 = r9.n
            o.f88 r8 = o.f88.a
            if (r0 == 0) goto L6c
            if (r0 == r6) goto L68
            if (r0 != r7) goto L64
            o.ct1.a0(r10)
        L62:
            r2 = r8
            goto L9b
        L64:
            o.hk0.l(r3)
            goto L9b
        L68:
            o.ct1.a0(r10)
            goto L82
        L6c:
            o.ct1.a0(r10)
            o.j93 r10 = r5.i
            r9.n = r6
            java.lang.Object r10 = r10.f1141o
            o.qx0 r10 = (o.qx0) r10
            java.lang.Object r10 = r10.h(r9)
            if (r10 != r4) goto L7e
            goto L7f
        L7e:
            r10 = r8
        L7f:
            if (r10 != r4) goto L82
            goto L9a
        L82:
            o.o07 r10 = r5.c()
            o.ih1 r10 = r10.c
            o.go2 r10 = o.lv1.D(r10, r1)
            o.yi r0 = new o.yi
            r1 = 4
            r0.<init>(r5, r1)
            r9.n = r7
            java.lang.Object r9 = r10.b(r0, r9)
            if (r9 != r4) goto L62
        L9a:
            r2 = r4
        L9b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.mh1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
