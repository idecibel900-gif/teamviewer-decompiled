package o;

/* JADX INFO: loaded from: classes.dex */
public final class mo6 extends rc6 implements hw2 {
    public final /* synthetic */ byte n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte f1493o;
    public /* synthetic */ Object p;
    public Object q;
    public Object r;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo6(ae aeVar, io.sentry.android.core.n1 n1Var, zp7 zp7Var, hc1 hc1Var) {
        super(2, hc1Var);
        this.q = aeVar;
        this.r = n1Var;
        this.s = zp7Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.n;
        Object obj2 = this.s;
        switch (b) {
            case 0:
                mo6 mo6Var = new mo6((ae) this.q, (io.sentry.android.core.n1) this.r, (zp7) obj2, hc1Var);
                mo6Var.p = obj;
                return mo6Var;
            default:
                mo6 mo6Var2 = new mo6((bd7) obj2, hc1Var);
                mo6Var2.p = obj;
                return mo6Var2;
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
        }
        return ((mo6) create(ug7Var, hc1Var)).invokeSuspend(f88Var);
    }

    /* JADX WARN: Code duplicated, block: B:155:0x027c  */
    /* JADX WARN: Code duplicated, block: B:180:0x0302  */
    /* JADX WARN: Code duplicated, block: B:199:0x0347  */
    /* JADX WARN: Code duplicated, block: B:202:0x0354  */
    /* JADX WARN: Code duplicated, block: B:212:0x010d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x0106 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:49:0x0102  */
    /* JADX WARN: Code duplicated, block: B:55:0x0118  */
    /* JADX WARN: Code duplicated, block: B:60:0x012e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:138:0x0243 -> B:140:0x0246). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00d2 -> B:40:0x00d6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // o.i30
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 872
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.mo6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo6(bd7 bd7Var, hc1 hc1Var) {
        super(2, hc1Var);
        this.s = bd7Var;
    }
}
