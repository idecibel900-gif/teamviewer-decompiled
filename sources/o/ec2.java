package o;

/* JADX INFO: loaded from: classes.dex */
public final class ec2 extends rc6 implements hw2 {
    public final /* synthetic */ byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long[] f703o;
    public int p;
    public int q;
    public int r;
    public int s;
    public long t;
    public boolean u;
    public /* synthetic */ Object v;
    public Object w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ec2(Object obj, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.n = b;
        this.x = obj;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.n;
        Object obj2 = this.x;
        switch (b) {
            case 0:
                ec2 ec2Var = new ec2((fc2) obj2, hc1Var, (byte) 0);
                ec2Var.v = obj;
                return ec2Var;
            case 1:
                ec2 ec2Var2 = new ec2((fc2) obj2, hc1Var, (byte) 1);
                ec2Var2.v = obj;
                return ec2Var2;
            case 2:
                ec2 ec2Var3 = new ec2((vi6) obj2, hc1Var, (byte) 2);
                ec2Var3.v = obj;
                return ec2Var3;
            default:
                ec2 ec2Var4 = new ec2((nd7) obj2, hc1Var, (byte) 3);
                ec2Var4.v = obj;
                return ec2Var4;
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.n;
        f88 f88Var = f88.a;
        aq6 aq6Var = (aq6) obj;
        hc1 hc1Var = (hc1) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((ec2) create(aq6Var, hc1Var)).invokeSuspend(f88Var);
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0223  */
    /* JADX WARN: Code duplicated, block: B:85:0x0270 A[DONT_INVERT, PHI: r1 r4 r5 r6 r8
      0x0270: PHI (r1v6 o.aq6) = (r1v4 o.aq6), (r1v8 o.aq6) binds: [B:76:0x0221, B:84:0x026b] A[DONT_GENERATE, DONT_INLINE]
      0x0270: PHI (r4v4 long[]) = (r4v2 long[]), (r4v6 long[]) binds: [B:76:0x0221, B:84:0x026b] A[DONT_GENERATE, DONT_INLINE]
      0x0270: PHI (r5v4 int) = (r5v2 int), (r5v6 int) binds: [B:76:0x0221, B:84:0x026b] A[DONT_GENERATE, DONT_INLINE]
      0x0270: PHI (r6v2 int) = (r6v1 int), (r6v4 int) binds: [B:76:0x0221, B:84:0x026b] A[DONT_GENERATE, DONT_INLINE]
      0x0270: PHI (r8v4 o.fc2) = (r8v2 o.fc2), (r8v6 o.fc2) binds: [B:76:0x0221, B:84:0x026b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x0272  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x006d -> B:22:0x00ac). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x006f -> B:15:0x007e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0084 -> B:19:0x00a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00fe -> B:43:0x013e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0100 -> B:36:0x0111). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0117 -> B:40:0x0135). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0190 -> B:64:0x01d0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0192 -> B:57:0x01a3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x01a9 -> B:61:0x01c7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0221 -> B:85:0x0270). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0223 -> B:78:0x0235). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x023b -> B:82:0x0266). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // o.i30
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ec2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
