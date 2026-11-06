package o;

/* JADX INFO: loaded from: classes.dex */
public final class d38 extends og7 implements hw2 {
    public m65[] m;
    public e38 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public y08 f583o;
    public int p;
    public int q;
    public int r;
    public byte s;
    public final /* synthetic */ m65[] t;
    public final /* synthetic */ e38 u;
    public final /* synthetic */ y08 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d38(m65[] m65VarArr, e38 e38Var, y08 y08Var, hc1 hc1Var) {
        super(2, hc1Var);
        this.t = m65VarArr;
        this.u = e38Var;
        this.v = y08Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        return new d38(this.t, this.u, this.v, hc1Var);
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        return ((d38) create((no5) obj, (hc1) obj2)).invokeSuspend(f88.a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031  */
    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    /* JADX WARN: Code duplicated, block: B:15:0x003f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0041  */
    /* JADX WARN: Code duplicated, block: B:19:0x0056  */
    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX WARN: Code duplicated, block: B:23:0x005d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0072 -> B:27:0x0073). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // o.i30
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            byte r0 = r11.s
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L21
            if (r0 == r3) goto Lb
            if (r0 != r2) goto L1b
        Lb:
            int r0 = r11.r
            int r4 = r11.q
            int r5 = r11.p
            o.y08 r6 = r11.f583o
            o.e38 r7 = r11.n
            o.m65[] r8 = r11.m
            o.ct1.a0(r12)
            goto L57
        L1b:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            o.hk0.l(r11)
            return r1
        L21:
            o.ct1.a0(r12)
            o.m65[] r12 = r11.t
            int r0 = r12.length
            r4 = 0
            o.e38 r5 = r11.u
            o.y08 r6 = r11.v
            r8 = r12
            r12 = r4
            r7 = r5
        L2f:
            if (r4 >= r0) goto L75
            r5 = r8[r4]
            int r9 = r12 + 1
            int r5 = r5.ordinal()
            if (r5 == 0) goto L72
            o.ne1 r10 = o.ne1.m
            if (r5 == r3) goto L5d
            if (r5 != r2) goto L59
            r11.m = r8
            r11.n = r7
            r11.f583o = r6
            r11.p = r9
            r11.q = r4
            r11.r = r0
            r11.s = r2
            java.lang.Object r12 = r7.e(r6, r12, r11)
            if (r12 != r10) goto L56
            goto L71
        L56:
            r5 = r9
        L57:
            r12 = r5
            goto L73
        L59:
            o.gk0.s()
            return r1
        L5d:
            r11.m = r8
            r11.n = r7
            r11.f583o = r6
            r11.p = r9
            r11.q = r4
            r11.r = r0
            r11.s = r3
            java.lang.Object r12 = r7.d(r6, r12, r11)
            if (r12 != r10) goto L56
        L71:
            return r10
        L72:
            r12 = r9
        L73:
            int r4 = r4 + r3
            goto L2f
        L75:
            o.f88 r11 = o.f88.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o.d38.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
