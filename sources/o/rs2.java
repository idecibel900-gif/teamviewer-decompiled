package o;

/* JADX INFO: loaded from: classes.dex */
public final class rs2 extends rc6 implements hw2 {
    public final /* synthetic */ byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte f1946o;
    public /* synthetic */ Object p;
    public Object q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rs2(Object obj, Object obj2, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.n = b;
        this.q = obj;
        this.r = obj2;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.n;
        Object obj2 = this.r;
        switch (b) {
            case 0:
                rs2 rs2Var = new rs2((de1) this.q, (hw2) obj2, hc1Var, (byte) 0);
                rs2Var.p = obj;
                return rs2Var;
            case 1:
                rs2 rs2Var2 = new rs2((zp7) obj2, hc1Var);
                rs2Var2.p = obj;
                return rs2Var2;
            default:
                rs2 rs2Var3 = new rs2((cn5) this.q, (k76) obj2, hc1Var, (byte) 2);
                rs2Var3.p = obj;
                return rs2Var3;
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
                break;
            case 1:
                break;
        }
        return ((rs2) create(ug7Var, hc1Var)).invokeSuspend(f88Var);
    }

    /* JADX WARN: Code duplicated, block: B:87:0x01a7 A[PHI: r5
      0x01a7: PHI (r5v3 o.ug7) = (r5v1 o.ug7), (r5v2 o.ug7), (r5v4 o.ug7), (r5v8 o.ug7) binds: [B:98:0x01d4, B:93:0x01c3, B:86:0x01a6, B:78:0x0190] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:89:0x01ad A[Catch: CancellationException -> 0x0194, TRY_ENTER, TryCatch #0 {CancellationException -> 0x0194, blocks: (B:89:0x01ad, B:92:0x01bb, B:78:0x0190, B:83:0x019b), top: B:103:0x0176 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:92:0x01bb A[Catch: CancellationException -> 0x0194, PHI: r5
      0x01bb: PHI (r5v2 o.ug7) = (r5v3 o.ug7), (r5v6 o.ug7) binds: [B:90:0x01b8, B:83:0x019b] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0194, blocks: (B:89:0x01ad, B:92:0x01bb, B:78:0x0190, B:83:0x019b), top: B:103:0x0176 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00ae -> B:35:0x00b2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x013f -> B:60:0x0143). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x01c3 -> B:87:0x01a7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:98:0x01d4 -> B:87:0x01a7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // o.i30
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.rs2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rs2(zp7 zp7Var, hc1 hc1Var) {
        super(2, hc1Var);
        this.n = (byte) 1;
        this.r = zp7Var;
    }
}
