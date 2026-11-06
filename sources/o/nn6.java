package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class nn6 extends og7 implements hw2 {
    public final /* synthetic */ byte m = 1;
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte f1582o;
    public Object p;
    public Object q;
    public /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nn6(rn6 rn6Var, Object obj, u18 u18Var, hc1 hc1Var) {
        super(2, hc1Var);
        this.r = rn6Var;
        this.n = obj;
        this.s = u18Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        Object obj2 = this.s;
        switch (b) {
            case 0:
                return new nn6((rn6) this.r, this.n, (u18) obj2, hc1Var);
            default:
                nn6 nn6Var = new nn6((Function0) obj2, hc1Var);
                nn6Var.r = obj;
                return nn6Var;
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                return ((nn6) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            default:
                ((nn6) create((ho2) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return ne1.m;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:105:0x0204  */
    /* JADX WARN: Code duplicated, block: B:112:0x0217  */
    /* JADX WARN: Code duplicated, block: B:113:0x021c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0222  */
    /* JADX WARN: Code duplicated, block: B:118:0x022a  */
    /* JADX WARN: Code duplicated, block: B:119:0x022d  */
    /* JADX WARN: Code duplicated, block: B:121:0x023c  */
    /* JADX WARN: Code duplicated, block: B:122:0x023e  */
    /* JADX WARN: Code duplicated, block: B:127:0x024d  */
    /* JADX WARN: Code duplicated, block: B:131:0x025b  */
    /* JADX WARN: Code duplicated, block: B:133:0x0264  */
    /* JADX WARN: Code duplicated, block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0078  */
    /* JADX WARN: Code duplicated, block: B:26:0x0089  */
    /* JADX WARN: Code duplicated, block: B:29:0x0094 A[Catch: all -> 0x0030, TRY_LEAVE, TryCatch #0 {all -> 0x0030, blocks: (B:16:0x0046, B:27:0x008a, B:24:0x0079, B:29:0x0094, B:10:0x002c, B:19:0x0062), top: B:144:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01da  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v14, types: [o.l07] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object, o.l07] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, o.l07] */
    /* JADX WARN: Type inference failed for: r3v19, types: [o.l07] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0092 -> B:24:0x0079). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:26:0x0089
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // o.i30
    public final java.lang.Object invokeSuspend(java.lang.Object r33) {
        /*
            Method dump skipped, instruction units count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.nn6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nn6(Function0 function0, hc1 hc1Var) {
        super(2, hc1Var);
        this.s = function0;
    }
}
