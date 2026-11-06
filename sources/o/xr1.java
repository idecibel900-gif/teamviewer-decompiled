package o;

/* JADX INFO: loaded from: classes.dex */
public final class xr1 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2545o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xr1(Object obj, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f2545o = obj;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        Object obj2 = this.f2545o;
        switch (b) {
            case 0:
                return new xr1((yr1) obj2, hc1Var, (byte) 0);
            case 1:
                return new xr1((qj4) obj2, hc1Var, (byte) 1);
            default:
                return new xr1((vg7) obj2, hc1Var, (byte) 2);
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
                return ((xr1) create(me1Var, hc1Var)).invokeSuspend(f88Var);
            case 1:
                ((xr1) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                return ne1.m;
            default:
                return ((xr1) create(me1Var, hc1Var)).invokeSuspend(f88Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x005e  */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x005c -> B:22:0x004d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0078 -> B:32:0x007b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:22:0x004d
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // o.i30
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            byte r0 = r8.m
            o.f88 r1 = o.f88.a
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r3 = 1
            o.ne1 r4 = o.ne1.m
            java.lang.Object r5 = r8.f2545o
            r6 = 0
            r7 = 2
            switch(r0) {
                case 0: goto L85;
                case 1: goto L32;
                default: goto L10;
            }
        L10:
            o.vg7 r5 = (o.vg7) r5
            byte r0 = r8.n
            if (r0 == 0) goto L23
            if (r0 == r3) goto L1a
            if (r0 != r7) goto L1e
        L1a:
            o.ct1.a0(r9)
            goto L31
        L1e:
            o.hk0.l(r2)
            r1 = r6
            goto L31
        L23:
            o.ct1.a0(r9)
            androidx.compose.ui.input.pointer.PointerInputEventHandler r9 = r5.C
            r8.n = r7
            java.lang.Object r8 = r9.invoke(r5, r8)
            if (r8 != r4) goto L31
            r1 = r4
        L31:
            return r1
        L32:
            r0 = r5
            o.qj4 r0 = (o.qj4) r0
            byte r1 = r8.n
            if (r1 == 0) goto L4a
            if (r1 == r3) goto L46
            if (r1 != r7) goto L41
            o.ct1.a0(r9)
            goto L7b
        L41:
            o.hk0.l(r2)
            r4 = r6
            goto L7a
        L46:
            o.ct1.a0(r9)
            goto L5a
        L4a:
            o.ct1.a0(r9)
        L4d:
            o.kf0 r9 = r0.Q
            if (r9 == 0) goto L5a
            r8.n = r3
            java.lang.Object r9 = r9.m(r8)
            if (r9 != r4) goto L5a
            goto L7a
        L5a:
            o.wl5 r9 = r0.L
            if (r9 == 0) goto L4d
            o.ek3 r9 = new o.ek3
            r1 = 22
            r9.<init>(r1)
            r8.n = r7
            o.de1 r1 = r8.getContext()
            o.ml r1 = o.qs1.O(r1)
            o.kz2 r2 = new o.kz2
            r2.<init>(r9, r7)
            java.lang.Object r9 = r1.a(r2, r8)
            if (r9 != r4) goto L7b
        L7a:
            return r4
        L7b:
            o.wl5 r9 = r0.L
            if (r9 == 0) goto L4d
            o.yl5 r9 = (o.yl5) r9
            r9.d()
            goto L4d
        L85:
            o.yr1 r5 = (o.yr1) r5
            byte r0 = r8.n
            if (r0 == 0) goto L9c
            if (r0 == r3) goto L98
            if (r0 != r7) goto L93
            o.ct1.a0(r9)
            goto Lbd
        L93:
            o.hk0.l(r2)
            r1 = r6
            goto Lbd
        L98:
            o.ct1.a0(r9)
            goto Lac
        L9c:
            o.ct1.a0(r9)
            o.yx6 r9 = r5.v
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r8.n = r3
            java.lang.Object r9 = r9.c(r0, r8)
            if (r9 != r4) goto Lac
            goto Lbc
        Lac:
            o.tk1 r9 = o.g22.a
            o.wr1 r0 = new o.wr1
            r2 = 0
            r0.<init>(r5, r6, r2)
            r8.n = r7
            java.lang.Object r8 = o.im3.j0(r9, r0, r8)
            if (r8 != r4) goto Lbd
        Lbc:
            r1 = r4
        Lbd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.xr1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
