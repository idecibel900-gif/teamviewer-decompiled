package o;

/* JADX INFO: loaded from: classes.dex */
public final class cz1 extends og7 implements hw2 {
    public int m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f569o;
    public hz1 p;
    public fe1 q;
    public byte r;
    public final /* synthetic */ hz1 s;
    public final /* synthetic */ fe1 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cz1(hz1 hz1Var, fe1 fe1Var, hc1 hc1Var) {
        super(2, hc1Var);
        this.s = hz1Var;
        this.t = fe1Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        return new cz1(this.s, this.t, hc1Var);
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        return ((cz1) create((me1) obj, (hc1) obj2)).invokeSuspend(f88.a);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003e  */
    /* JADX WARN: Code duplicated, block: B:18:0x0068  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00e7 -> B:41:0x00eb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00f0 -> B:43:0x00f3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // o.i30
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cz1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
