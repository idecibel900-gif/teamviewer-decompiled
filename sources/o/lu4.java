package o;

/* JADX INFO: loaded from: classes.dex */
public final class lu4 extends og7 implements hw2 {
    public g76 m;
    public g76 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1404o;
    public byte p;
    public /* synthetic */ Object q;
    public final /* synthetic */ h76 r;
    public final /* synthetic */ k76 s;
    public final /* synthetic */ k76 t;
    public final /* synthetic */ float u;
    public final /* synthetic */ nu4 v;
    public final /* synthetic */ float w;
    public final /* synthetic */ yk6 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lu4(h76 h76Var, k76 k76Var, k76 k76Var2, float f, nu4 nu4Var, float f2, yk6 yk6Var, hc1 hc1Var) {
        super(2, hc1Var);
        this.r = h76Var;
        this.s = k76Var;
        this.t = k76Var2;
        this.u = f;
        this.v = nu4Var;
        this.w = f2;
        this.x = yk6Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        lu4 lu4Var = new lu4(this.r, this.s, this.t, this.u, this.v, this.w, this.x, hc1Var);
        lu4Var.q = obj;
        return lu4Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        return ((lu4) create((wk6) obj, (hc1) obj2)).invokeSuspend(f88.a);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x007a  */
    /* JADX WARN: Code duplicated, block: B:17:0x009a  */
    /* JADX WARN: Code duplicated, block: B:20:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:22:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:26:0x0159  */
    /* JADX WARN: Code duplicated, block: B:28:0x015d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0160  */
    /* JADX WARN: Code duplicated, block: B:32:0x0166  */
    /* JADX WARN: Code duplicated, block: B:35:0x0189  */
    /* JADX WARN: Code duplicated, block: B:39:0x019c  */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0189 -> B:36:0x018a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x019c -> B:38:0x0197). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // o.i30
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.lu4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
