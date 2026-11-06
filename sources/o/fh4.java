package o;

/* JADX INFO: loaded from: classes.dex */
public final class fh4 extends og7 implements hw2 {
    public boolean m;
    public final /* synthetic */ ph4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ bp3 f799o;
    public final /* synthetic */ int p;
    public final /* synthetic */ int q;
    public final /* synthetic */ kh4 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh4(ph4 ph4Var, bp3 bp3Var, int i, int i2, kh4 kh4Var, hc1 hc1Var) {
        super(2, hc1Var);
        this.n = ph4Var;
        this.f799o = bp3Var;
        this.p = i;
        this.q = i2;
        this.r = kh4Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        return new fh4(this.n, this.f799o, this.p, this.q, this.r, hc1Var);
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        return ((fh4) create((me1) obj, (hc1) obj2)).invokeSuspend(f88.a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    /* JADX WARN: Code duplicated, block: B:17:0x003a  */
    /* JADX WARN: Code duplicated, block: B:18:0x0045  */
    /* JADX WARN: Code duplicated, block: B:21:0x005a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0063  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0058 -> B:22:0x005b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // o.i30
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r4.m
            r1 = 1
            if (r0 == 0) goto L12
            if (r0 != r1) goto Lb
            o.ct1.a0(r5)
            goto L5b
        Lb:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            o.hk0.l(r4)
            r4 = 0
            return r4
        L12:
            o.ct1.a0(r5)
        L15:
            int[] r5 = o.eh4.a
            o.ph4 r0 = r4.n
            int r0 = r0.ordinal()
            r5 = r5[r0]
            int r0 = r4.p
            if (r5 != r1) goto L2e
            o.bp3 r5 = r4.f799o
            boolean r5 = r5.e()
            if (r5 == 0) goto L2c
            goto L2e
        L2c:
            int r0 = r4.q
        L2e:
            r4.m = r1
            o.kh4 r5 = r4.r
            r5.getClass()
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != r2) goto L45
            o.hh4 r2 = new o.hh4
            r3 = 0
            r2.<init>(r5, r0, r3)
            java.lang.Object r5 = o.lv1.X(r2, r4)
            goto L56
        L45:
            o.hh4 r2 = new o.hh4
            r2.<init>(r5, r0, r1)
            o.de1 r5 = r4.getContext()
            o.ml r5 = o.qs1.O(r5)
            java.lang.Object r5 = r5.a(r2, r4)
        L56:
            o.ne1 r0 = o.ne1.m
            if (r5 != r0) goto L5b
            return r0
        L5b:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L15
            o.f88 r4 = o.f88.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fh4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
